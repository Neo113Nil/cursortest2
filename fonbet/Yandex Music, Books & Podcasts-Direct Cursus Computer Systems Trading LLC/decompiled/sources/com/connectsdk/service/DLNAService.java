package com.connectsdk.service;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.util.Xml;
import com.appsflyer.internal.k;
import com.connectsdk.core.MediaInfo;
import com.connectsdk.core.SubtitleInfo;
import com.connectsdk.core.Util;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryFilter;
import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.discovery.provider.ssdp.Service;
import com.connectsdk.etc.helper.DeviceServiceReachability;
import com.connectsdk.etc.helper.HttpConnection;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.capability.CapabilityMethods;
import com.connectsdk.service.capability.MediaControl;
import com.connectsdk.service.capability.MediaPlayer;
import com.connectsdk.service.capability.PlaylistControl;
import com.connectsdk.service.capability.VolumeControl;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.command.ServiceSubscription;
import com.connectsdk.service.command.URLServiceSubscription;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.sessions.LaunchSession;
import com.connectsdk.service.upnp.DLNAHttpServer;
import com.connectsdk.service.upnp.DLNAMediaInfoParser;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.dfi;
import defpackage.ouj;
import defpackage.su4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class DLNAService extends DeviceService implements PlaylistControl, MediaControl, MediaPlayer, VolumeControl {
    protected static final String AV_TRANSPORT = "AVTransport";
    public static final String AV_TRANSPORT_URN = "urn:schemas-upnp-org:service:AVTransport:1";
    protected static final String CONNECTION_MANAGER = "ConnectionManager";
    public static final String CONNECTION_MANAGER_URN = "urn:schemas-upnp-org:service:ConnectionManager:1";
    public static final String DEFAULT_SUBTITLE_MIMETYPE = "text/srt";
    public static final String DEFAULT_SUBTITLE_TYPE = "srt";
    protected static final String GROUP_RENDERING_CONTROL = "GroupRenderingControl";
    public static final String ID = "DLNA";
    public static final String PLAY_STATE = "playState";
    protected static final String RENDERING_CONTROL = "RenderingControl";
    public static final String RENDERING_CONTROL_URN = "urn:schemas-upnp-org:service:RenderingControl:1";
    protected static final String SUBSCRIBE = "SUBSCRIBE";
    private static int TIMEOUT = 300;
    protected static final String UNSUBSCRIBE = "UNSUBSCRIBE";
    Map<String, String> SIDList;
    String avTransportURL;
    String connectionControlURL;
    Context context;
    DLNAHttpServer httpServer;
    String renderingControlURL;
    Timer resubscriptionTimer;

    /* renamed from: com.connectsdk.service.DLNAService$20, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass20 {
        static final /* synthetic */ int[] $SwitchMap$com$connectsdk$service$capability$PlaylistControl$PlayMode;

        static {
            int[] iArr = new int[PlaylistControl.PlayMode.values().length];
            $SwitchMap$com$connectsdk$service$capability$PlaylistControl$PlayMode = iArr;
            try {
                iArr[PlaylistControl.PlayMode.RepeatAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$connectsdk$service$capability$PlaylistControl$PlayMode[PlaylistControl.PlayMode.RepeatOne.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$connectsdk$service$capability$PlaylistControl$PlayMode[PlaylistControl.PlayMode.Shuffle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface PositionInfoListener {
        void onGetPositionInfoFailed(ServiceCommandError serviceCommandError);

        void onGetPositionInfoSuccess(String str);
    }

    public DLNAService(ServiceDescription serviceDescription, ServiceConfig serviceConfig, Context context, DLNAHttpServer dLNAHttpServer) {
        super(serviceDescription, serviceConfig);
        this.context = context;
        this.SIDList = new HashMap();
        updateControlURL();
        this.httpServer = dLNAHttpServer;
    }

    private void addSubscription(URLServiceSubscription<?> uRLServiceSubscription) {
        if (!this.httpServer.isRunning()) {
            Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.8
                @Override // java.lang.Runnable
                public void run() {
                    DLNAService.this.httpServer.start();
                }
            });
            subscribeServices();
        }
        this.httpServer.getSubscriptions().add(uRLServiceSubscription);
    }

    public static DiscoveryFilter discoveryFilter() {
        return new DiscoveryFilter(ID, "urn:schemas-upnp-org:device:MediaRenderer:1");
    }

    private void displayMedia(String str, SubtitleInfo subtitleInfo, String str2, String str3, String str4, String str5, final MediaPlayer.LaunchListener launchListener) {
        String[] split = str2.split("/");
        String str6 = split[0];
        String str7 = split[1];
        if (str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0) {
            Util.postError(launchListener, new ServiceCommandError(0, "You must provide a valid mimeType (audio/*,  video/*, etc)", null));
            return;
        }
        if ("mp3".equals(str7)) {
            str7 = "mpeg";
        }
        String o = ouj.o(str6, "/", str7);
        ResponseListener<Object> responseListener = new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.2
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(launchListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                new ServiceCommand(DLNAService.this, "Play", DLNAService.this.getMessageXml(DLNAService.AV_TRANSPORT_URN, "Play", CommonUrlParts.Values.FALSE_INTEGER, k.r("Speed", "1")), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.2.1
                    @Override // com.connectsdk.service.capability.listeners.ErrorListener
                    public void onError(ServiceCommandError serviceCommandError) {
                        Util.postError(launchListener, serviceCommandError);
                    }

                    @Override // com.connectsdk.service.capability.listeners.ResponseListener
                    public void onSuccess(Object obj2) {
                        LaunchSession launchSession = new LaunchSession();
                        launchSession.setService(DLNAService.this);
                        launchSession.setSessionType(LaunchSession.LaunchSessionType.Media);
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        MediaPlayer.LaunchListener launchListener2 = launchListener;
                        DLNAService dLNAService = DLNAService.this;
                        Util.postSuccess(launchListener2, new MediaPlayer.MediaLaunchObject(launchSession, dLNAService, dLNAService));
                    }
                }).send();
            }
        };
        String metadata = getMetadata(str, subtitleInfo, o, str3, str4, str5);
        if (metadata == null) {
            Util.postError(launchListener, ServiceCommandError.getError(500));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("CurrentURI", encodeURL(str));
            linkedHashMap.put("CurrentURIMetaData", metadata);
            new ServiceCommand(this, "SetAVTransportURI", getMessageXml(AV_TRANSPORT_URN, "SetAVTransportURI", CommonUrlParts.Values.FALSE_INTEGER, linkedHashMap), responseListener).send();
        } catch (Exception unused) {
            Util.postError(launchListener, ServiceCommandError.getError(500));
        }
    }

    private void getDeviceCapabilities(final PositionInfoListener positionInfoListener) {
        new ServiceCommand(this, "GetDeviceCapabilities", getMessageXml(AV_TRANSPORT_URN, "GetDeviceCapabilities", CommonUrlParts.Values.FALSE_INTEGER, null), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.9
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoFailed(serviceCommandError);
                }
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoSuccess((String) obj);
                }
            }
        }).send();
    }

    private void getPositionInfo(final PositionInfoListener positionInfoListener) {
        new ServiceCommand(this, "GetPositionInfo", getMessageXml(AV_TRANSPORT_URN, "GetPositionInfo", CommonUrlParts.Values.FALSE_INTEGER, null), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.3
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoFailed(serviceCommandError);
                }
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoSuccess((String) obj);
                }
            }
        }).send();
    }

    private void getProtocolInfo(final PositionInfoListener positionInfoListener) {
        new ServiceCommand(this, "GetProtocolInfo", getMessageXml(CONNECTION_MANAGER_URN, "GetProtocolInfo", null, null), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.10
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoFailed(serviceCommandError);
                }
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                PositionInfoListener positionInfoListener2 = positionInfoListener;
                if (positionInfoListener2 != null) {
                    positionInfoListener2.onGetPositionInfoSuccess((String) obj);
                }
            }
        }).send();
    }

    private boolean isXmlEncoded(String str) {
        if (str == null || str.length() < 4) {
            return false;
        }
        return str.trim().substring(0, 4).equals("&lt;");
    }

    private void updateControlURL() {
        List<Service> serviceList = this.serviceDescription.getServiceList();
        if (serviceList != null) {
            for (int i = 0; i < serviceList.size(); i++) {
                if (!serviceList.get(i).baseURL.endsWith("/")) {
                    StringBuilder sb = new StringBuilder();
                    Service service = serviceList.get(i);
                    service.baseURL = su4.o(sb, service.baseURL, "/");
                }
                if (serviceList.get(i).serviceType.contains(AV_TRANSPORT)) {
                    this.avTransportURL = makeControlURL(serviceList.get(i).baseURL, serviceList.get(i).controlURL);
                } else if (serviceList.get(i).serviceType.contains(RENDERING_CONTROL) && !serviceList.get(i).serviceType.contains(GROUP_RENDERING_CONTROL)) {
                    this.renderingControlURL = makeControlURL(serviceList.get(i).baseURL, serviceList.get(i).controlURL);
                } else if (serviceList.get(i).serviceType.contains(CONNECTION_MANAGER)) {
                    this.connectionControlURL = makeControlURL(serviceList.get(i).baseURL, serviceList.get(i).controlURL);
                }
            }
        }
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void closeMedia(LaunchSession launchSession, ResponseListener<Object> responseListener) {
        if (launchSession.getService() instanceof DLNAService) {
            ((DLNAService) launchSession.getService()).stop(responseListener);
        }
    }

    @Override // com.connectsdk.service.DeviceService
    public void connect() {
        this.connected = true;
        reportConnected(true);
    }

    public long convertStrTimeFormatToLong(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            return simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime();
        } catch (NullPointerException unused) {
            Log.w(Util.T, "Null time argument");
            return 0L;
        } catch (ParseException unused2) {
            Log.w(Util.T, "Invalid Time Format: " + str);
            return 0L;
        }
    }

    public HttpConnection createHttpConnection(String str) throws IOException {
        return HttpConnection.newInstance(URI.create(str));
    }

    @Override // com.connectsdk.service.DeviceService
    public LaunchSession decodeLaunchSession(String str, JSONObject jSONObject) throws JSONException {
        if (!str.equals("dlna")) {
            return null;
        }
        LaunchSession launchSessionFromJSONObject = LaunchSession.launchSessionFromJSONObject(jSONObject);
        launchSessionFromJSONObject.setService(this);
        return launchSessionFromJSONObject;
    }

    @Override // com.connectsdk.service.DeviceService
    public void disconnect() {
        this.connected = false;
        DeviceServiceReachability deviceServiceReachability = this.mServiceReachability;
        if (deviceServiceReachability != null) {
            deviceServiceReachability.stop();
        }
        Util.runOnUI(new Runnable() { // from class: com.connectsdk.service.DLNAService.11
            @Override // java.lang.Runnable
            public void run() {
                DLNAService dLNAService = DLNAService.this;
                DeviceService.DeviceServiceListener deviceServiceListener = dLNAService.listener;
                if (deviceServiceListener != null) {
                    deviceServiceListener.onDisconnect(dLNAService, null);
                }
            }
        });
        Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.12
            @Override // java.lang.Runnable
            public void run() {
                DLNAService.this.httpServer.stop();
            }
        }, true);
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void displayImage(MediaInfo mediaInfo, MediaPlayer.LaunchListener launchListener) {
        DLNAService dLNAService;
        MediaPlayer.LaunchListener launchListener2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (mediaInfo != null) {
            String url = mediaInfo.getUrl();
            String mimeType = mediaInfo.getMimeType();
            String title = mediaInfo.getTitle();
            String description = mediaInfo.getDescription();
            if (mediaInfo.getImages() != null && mediaInfo.getImages().size() > 0) {
                str6 = mediaInfo.getImages().get(0).getUrl();
            }
            dLNAService = this;
            launchListener2 = launchListener;
            str5 = str6;
            str = url;
            str2 = mimeType;
            str3 = title;
            str4 = description;
        } else {
            dLNAService = this;
            launchListener2 = launchListener;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        dLNAService.displayImage(str, str2, str3, str4, str5, launchListener2);
    }

    public String encodeURL(String str) throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (!URLDecoder.decode(str, "UTF-8").equals(str)) {
            return str;
        }
        URL url = new URL(str);
        return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void fastForward(ResponseListener<Object> responseListener) {
        Util.postError(responseListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void getDuration(final MediaControl.DurationListener durationListener) {
        getPositionInfo(new PositionInfoListener() { // from class: com.connectsdk.service.DLNAService.4
            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoFailed(ServiceCommandError serviceCommandError) {
                Util.postError(durationListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoSuccess(String str) {
                String parseData = DLNAService.this.parseData(str, "TrackDuration");
                MediaInfo mediaInfo = DLNAMediaInfoParser.getMediaInfo(DLNAService.this.parseData(str, "TrackMetaData"));
                if (parseData.equals("0:00:00") && !mediaInfo.getMimeType().contains("image")) {
                    new Timer().schedule(new TimerTask() { // from class: com.connectsdk.service.DLNAService.4.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            DLNAService.this.getDuration(durationListener);
                        }
                    }, 1000L);
                } else {
                    Util.postSuccess(durationListener, Long.valueOf(DLNAService.this.convertStrTimeFormatToLong(parseData)));
                }
            }
        });
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public MediaControl getMediaControl() {
        return this;
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public CapabilityMethods.CapabilityPriorityLevel getMediaControlCapabilityLevel() {
        return CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void getMediaInfo(final MediaPlayer.MediaInfoListener mediaInfoListener) {
        getPositionInfo(new PositionInfoListener() { // from class: com.connectsdk.service.DLNAService.1
            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoFailed(ServiceCommandError serviceCommandError) {
                Util.postError(mediaInfoListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoSuccess(final String str) {
                Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Util.postSuccess(mediaInfoListener, DLNAMediaInfoParser.getMediaInfo(DLNAService.this.parseData(str, "TrackMetaData"), "http://" + DLNAService.this.getServiceDescription().getIpAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + DLNAService.this.getServiceDescription().getPort()));
                    }
                });
            }
        });
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public MediaPlayer getMediaPlayer() {
        return this;
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public CapabilityMethods.CapabilityPriorityLevel getMediaPlayerCapabilityLevel() {
        return CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    public String getMessageXml(String str, String str2, String str3, Map<String, String> map) {
        try {
            Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            newDocument.setXmlStandalone(true);
            newDocument.setXmlVersion("1.0");
            Element createElement = newDocument.createElement("s:Envelope");
            Element createElement2 = newDocument.createElement("s:Body");
            Element createElementNS = newDocument.createElementNS(str, "u:" + str2);
            Element createElement3 = newDocument.createElement("InstanceID");
            createElement.setAttribute("s:encodingStyle", "http://schemas.xmlsoap.org/soap/encoding/");
            createElement.setAttribute("xmlns:s", "http://schemas.xmlsoap.org/soap/envelope/");
            newDocument.appendChild(createElement);
            createElement.appendChild(createElement2);
            createElement2.appendChild(createElementNS);
            if (str3 != null) {
                createElement3.setTextContent(str3);
                createElementNS.appendChild(createElement3);
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    Element createElement4 = newDocument.createElement(key);
                    createElement4.setTextContent(value);
                    createElementNS.appendChild(createElement4);
                }
            }
            return xmlToString(newDocument, true);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getMetadata(String str, SubtitleInfo subtitleInfo, String str2, String str3, String str4, String str5) {
        Node node;
        try {
            String str6 = "";
            if (str2.startsWith("image")) {
                str6 = "object.item.imageItem";
            } else if (str2.startsWith("video")) {
                str6 = "object.item.videoItem";
            } else if (str2.startsWith(CameraProperty.AUDIO)) {
                str6 = "object.item.audioItem";
            }
            Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element createElement = newDocument.createElement("DIDL-Lite");
            Element createElement2 = newDocument.createElement("item");
            Element createElement3 = newDocument.createElement("dc:title");
            Element createElement4 = newDocument.createElement("dc:description");
            Element createElement5 = newDocument.createElement("res");
            Element createElement6 = newDocument.createElement("upnp:albumArtURI");
            Element createElement7 = newDocument.createElement("upnp:class");
            createElement.appendChild(createElement2);
            createElement2.appendChild(createElement3);
            createElement2.appendChild(createElement4);
            createElement2.appendChild(createElement5);
            createElement2.appendChild(createElement6);
            createElement2.appendChild(createElement7);
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/");
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:upnp", "urn:schemas-upnp-org:metadata-1-0/upnp/");
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:dc", "http://purl.org/dc/elements/1.1/");
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:sec", "http://www.sec.co.kr/");
            createElement3.setTextContent(str3);
            createElement4.setTextContent(str4);
            createElement5.setTextContent(encodeURL(str));
            createElement6.setTextContent(encodeURL(str5));
            createElement7.setTextContent(str6);
            createElement2.setAttribute(ConnectableDevice.KEY_ID, "1000");
            createElement2.setAttribute("parentID", CommonUrlParts.Values.FALSE_INTEGER);
            createElement2.setAttribute("restricted", CommonUrlParts.Values.FALSE_INTEGER);
            createElement5.setAttribute("protocolInfo", "http-get:*:" + str2 + ":DLNA.ORG_OP=01");
            if (subtitleInfo != null) {
                String mimeType = subtitleInfo.getMimeType();
                String str7 = DEFAULT_SUBTITLE_TYPE;
                String mimeType2 = mimeType == null ? DEFAULT_SUBTITLE_TYPE : subtitleInfo.getMimeType();
                String[] split = mimeType2.split("/");
                if (split == null || split.length != 2) {
                    mimeType2 = DEFAULT_SUBTITLE_MIMETYPE;
                } else {
                    str7 = split[1];
                }
                createElement5.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:pv", "http://www.pv.com/pvns/");
                createElement5.setAttribute("pv:subtitleFileUri", subtitleInfo.getUrl());
                createElement5.setAttribute("pv:subtitleFileType", str7);
                Document document = newDocument;
                Element createElement8 = document.createElement("res");
                createElement8.setAttribute("protocolInfo", "http-get:*:smi/caption");
                createElement8.setTextContent(subtitleInfo.getUrl());
                createElement2.appendChild(createElement8);
                Element createElement9 = document.createElement("res");
                createElement9.setAttribute("protocolInfo", "http-get:*:" + mimeType2 + StringUtils.PROCESS_POSTFIX_DELIMITER);
                createElement9.setTextContent(subtitleInfo.getUrl());
                createElement2.appendChild(createElement9);
                Element createElement10 = document.createElement("sec:CaptionInfoEx");
                createElement10.setAttribute("sec:type", str7);
                createElement10.setTextContent(subtitleInfo.getUrl());
                createElement2.appendChild(createElement10);
                Element createElement11 = document.createElement("sec:CaptionInfo");
                createElement11.setAttribute("sec:type", str7);
                createElement11.setTextContent(subtitleInfo.getUrl());
                createElement2.appendChild(createElement11);
                node = document;
            } else {
                node = newDocument;
            }
            node.appendChild(createElement);
            return xmlToString(node, false);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void getMute(final VolumeControl.MuteListener muteListener) {
        new ServiceCommand(this, "GetMute", getMessageXml(RENDERING_CONTROL_URN, "GetMute", CommonUrlParts.Values.FALSE_INTEGER, su4.r("Channel", "Master")), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.19
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(muteListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                Util.postSuccess(muteListener, Boolean.valueOf(Boolean.parseBoolean(DLNAService.this.parseData((String) obj, "CurrentMute"))));
            }
        }).send();
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void getPlayState(final MediaControl.PlayStateListener playStateListener) {
        new ServiceCommand(this, "GetTransportInfo", getMessageXml(AV_TRANSPORT_URN, "GetTransportInfo", CommonUrlParts.Values.FALSE_INTEGER, null), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.7
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(playStateListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                Util.postSuccess(playStateListener, MediaControl.PlayStateStatus.convertTransportStateToPlayStateStatus(DLNAService.this.parseData((String) obj, "CurrentTransportState")));
            }
        }).send();
    }

    @Override // com.connectsdk.service.capability.PlaylistControl
    public PlaylistControl getPlaylistControl() {
        return this;
    }

    @Override // com.connectsdk.service.capability.PlaylistControl
    public CapabilityMethods.CapabilityPriorityLevel getPlaylistControlCapabilityLevel() {
        return CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void getPosition(final MediaControl.PositionListener positionListener) {
        getPositionInfo(new PositionInfoListener() { // from class: com.connectsdk.service.DLNAService.5
            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoFailed(ServiceCommandError serviceCommandError) {
                Util.postError(positionListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.DLNAService.PositionInfoListener
            public void onGetPositionInfoSuccess(String str) {
                Util.postSuccess(positionListener, Long.valueOf(DLNAService.this.convertStrTimeFormatToLong(DLNAService.this.parseData(str, "RelTime"))));
            }
        });
    }

    @Override // com.connectsdk.service.DeviceService
    public CapabilityMethods.CapabilityPriorityLevel getPriorityLevel(Class<? extends CapabilityMethods> cls) {
        return cls.equals(MediaPlayer.class) ? getMediaPlayerCapabilityLevel() : cls.equals(MediaControl.class) ? getMediaControlCapabilityLevel() : cls.equals(VolumeControl.class) ? getVolumeControlCapabilityLevel() : cls.equals(PlaylistControl.class) ? getPlaylistControlCapabilityLevel() : CapabilityMethods.CapabilityPriorityLevel.NOT_SUPPORTED;
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void getVolume(final VolumeControl.VolumeListener volumeListener) {
        new ServiceCommand(this, "GetVolume", getMessageXml(RENDERING_CONTROL_URN, "GetVolume", CommonUrlParts.Values.FALSE_INTEGER, su4.r("Channel", "Master")), new ResponseListener<Object>() { // from class: com.connectsdk.service.DLNAService.18
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(volumeListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                try {
                    Integer.parseInt(DLNAService.this.parseData((String) obj, "CurrentVolume"));
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
                Util.postSuccess(volumeListener, Float.valueOf((float) (0 / 100.0d)));
            }
        }).send();
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public VolumeControl getVolumeControl() {
        return this;
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public CapabilityMethods.CapabilityPriorityLevel getVolumeControlCapabilityLevel() {
        return CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    @Override // com.connectsdk.service.DeviceService
    public boolean isConnectable() {
        return true;
    }

    @Override // com.connectsdk.service.DeviceService
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.connectsdk.service.capability.PlaylistControl
    public void jumpToTrack(long j, ResponseListener<Object> responseListener) {
        seek("TRACK_NR", Long.toString(j + 1), responseListener);
    }

    public String makeControlURL(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return str2.startsWith("/") ? str.concat(str2.substring(1)) : str.concat(str2);
    }

    @Override // com.connectsdk.service.capability.PlaylistControl, com.connectsdk.service.capability.MediaControl
    public void next(ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Next", getMessageXml(AV_TRANSPORT_URN, "Next", CommonUrlParts.Values.FALSE_INTEGER, null), responseListener).send();
    }

    @Override // com.connectsdk.service.DeviceService, com.connectsdk.etc.helper.DeviceServiceReachability.DeviceServiceReachabilityListener
    public void onLoseReachability(DeviceServiceReachability deviceServiceReachability) {
        if (this.connected) {
            disconnect();
        } else {
            this.mServiceReachability.stop();
        }
    }

    public String parseData(String str, String str2) {
        int next;
        if (isXmlEncoded(str)) {
            str = Html.fromHtml(str).toString();
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new StringReader(str));
            boolean z = false;
            do {
                next = newPullParser.next();
                if (next == 2) {
                    if (str2.equals(newPullParser.getName())) {
                        z = true;
                    }
                } else if (next == 4 && z) {
                    return newPullParser.getText();
                }
            } while (next != 1);
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void pause(ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Pause", getMessageXml(AV_TRANSPORT_URN, "Pause", CommonUrlParts.Values.FALSE_INTEGER, null), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void play(ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Play", getMessageXml(AV_TRANSPORT_URN, "Play", CommonUrlParts.Values.FALSE_INTEGER, su4.r("Speed", "1")), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void playMedia(MediaInfo mediaInfo, boolean z, MediaPlayer.LaunchListener launchListener) {
        DLNAService dLNAService;
        MediaPlayer.LaunchListener launchListener2;
        String str;
        SubtitleInfo subtitleInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (mediaInfo != null) {
            String url = mediaInfo.getUrl();
            SubtitleInfo subtitleInfo2 = mediaInfo.getSubtitleInfo();
            String mimeType = mediaInfo.getMimeType();
            String title = mediaInfo.getTitle();
            String description = mediaInfo.getDescription();
            if (mediaInfo.getImages() != null && mediaInfo.getImages().size() > 0) {
                str6 = mediaInfo.getImages().get(0).getUrl();
            }
            dLNAService = this;
            launchListener2 = launchListener;
            str5 = str6;
            str = url;
            subtitleInfo = subtitleInfo2;
            str2 = mimeType;
            str3 = title;
            str4 = description;
        } else {
            dLNAService = this;
            launchListener2 = launchListener;
            str = null;
            subtitleInfo = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        dLNAService.displayMedia(str, subtitleInfo, str2, str3, str4, str5, launchListener2);
    }

    @Override // com.connectsdk.service.capability.PlaylistControl, com.connectsdk.service.capability.MediaControl
    public void previous(ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Previous", getMessageXml(AV_TRANSPORT_URN, "Previous", CommonUrlParts.Values.FALSE_INTEGER, null), responseListener).send();
    }

    public void resubscribeServices() {
        Timer timer = new Timer();
        this.resubscriptionTimer = timer;
        TimerTask timerTask = new TimerTask() { // from class: com.connectsdk.service.DLNAService.14
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        List<Service> serviceList = DLNAService.this.serviceDescription.getServiceList();
                        if (serviceList != null) {
                            for (int i = 0; i < serviceList.size(); i++) {
                                String makeControlURL = DLNAService.this.makeControlURL("/", serviceList.get(i).eventSubURL);
                                if (makeControlURL != null) {
                                    String str = DLNAService.this.SIDList.get(serviceList.get(i).serviceType);
                                    try {
                                        HttpConnection newSubscriptionInstance = HttpConnection.newSubscriptionInstance(new URI("http", "", DLNAService.this.serviceDescription.getIpAddress(), DLNAService.this.serviceDescription.getPort(), makeControlURL, "", ""));
                                        newSubscriptionInstance.setMethod(HttpConnection.Method.SUBSCRIBE);
                                        newSubscriptionInstance.setHeader("TIMEOUT", "Second-" + DLNAService.TIMEOUT);
                                        newSubscriptionInstance.setHeader("SID", str);
                                        newSubscriptionInstance.execute();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                });
            }
        };
        int i = TIMEOUT;
        timer.scheduleAtFixedRate(timerTask, (i / 2) * 1000, (i / 2) * 1000);
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void rewind(ResponseListener<Object> responseListener) {
        Util.postError(responseListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void seek(long j, ResponseListener<Object> responseListener) {
        long j2 = (j / 60000) % 60;
        seek("REL_TIME", String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf((j / 3600000) % 24), Long.valueOf(j2), Long.valueOf((j / 1000) % 60)), responseListener);
    }

    @Override // com.connectsdk.service.DeviceService, com.connectsdk.service.command.ServiceCommand.ServiceCommandProcessor
    public void sendCommand(final ServiceCommand<?> serviceCommand) {
        Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.6
            @Override // java.lang.Runnable
            public void run() {
                String str;
                ServiceCommand serviceCommand2 = serviceCommand;
                String target = serviceCommand2.getTarget();
                String str2 = (String) serviceCommand2.getPayload();
                if (str2 == null) {
                    su4.t(0, "Cannot process the command, \"payload\" is missed", null, serviceCommand2.getResponseListener());
                    return;
                }
                String str3 = DLNAService.AV_TRANSPORT_URN;
                if (str2.contains(DLNAService.AV_TRANSPORT_URN)) {
                    str = DLNAService.this.avTransportURL;
                } else {
                    str3 = DLNAService.RENDERING_CONTROL_URN;
                    if (str2.contains(DLNAService.RENDERING_CONTROL_URN)) {
                        str = DLNAService.this.renderingControlURL;
                    } else {
                        str3 = DLNAService.CONNECTION_MANAGER_URN;
                        if (str2.contains(DLNAService.CONNECTION_MANAGER_URN)) {
                            str = DLNAService.this.connectionControlURL;
                        } else {
                            str3 = null;
                            str = null;
                        }
                    }
                }
                if (str3 == null) {
                    su4.t(0, "Cannot process the command, \"serviceURN\" is missed", null, serviceCommand2.getResponseListener());
                    return;
                }
                if (str == null) {
                    su4.t(0, "Cannot process the command, \"targetURL\" is missed", null, serviceCommand2.getResponseListener());
                    return;
                }
                try {
                    HttpConnection createHttpConnection = DLNAService.this.createHttpConnection(str);
                    createHttpConnection.setHeader(HttpMessage.CONTENT_TYPE_HEADER, HttpMessage.CONTENT_TYPE_TEXT_XML);
                    createHttpConnection.setHeader("SOAPAction", "\"" + str3 + "#" + target + "\"");
                    createHttpConnection.setMethod(HttpConnection.Method.POST);
                    createHttpConnection.setPayload(str2);
                    createHttpConnection.execute();
                    int responseCode = createHttpConnection.getResponseCode();
                    if (responseCode == 200) {
                        Util.postSuccess(serviceCommand2.getResponseListener(), createHttpConnection.getResponseString());
                    } else {
                        Util.postError(serviceCommand2.getResponseListener(), ServiceCommandError.getError(responseCode));
                    }
                } catch (IOException e) {
                    Util.postError(serviceCommand2.getResponseListener(), new ServiceCommandError(0, e.getMessage(), null));
                }
            }
        });
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void setMute(boolean z, ResponseListener<Object> responseListener) {
        LinkedHashMap r = su4.r("Channel", "Master");
        r.put("DesiredMute", String.valueOf(z ? 1 : 0));
        new ServiceCommand(this, "SetMute", getMessageXml(RENDERING_CONTROL_URN, "SetMute", CommonUrlParts.Values.FALSE_INTEGER, r), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.PlaylistControl
    public void setPlayMode(PlaylistControl.PlayMode playMode, ResponseListener<Object> responseListener) {
        int i = AnonymousClass20.$SwitchMap$com$connectsdk$service$capability$PlaylistControl$PlayMode[playMode.ordinal()];
        new ServiceCommand(this, "SetPlayMode", getMessageXml(AV_TRANSPORT_URN, "SetPlayMode", CommonUrlParts.Values.FALSE_INTEGER, su4.r("NewPlayMode", i != 1 ? i != 2 ? i != 3 ? "NORMAL" : "SHUFFLE" : "REPEAT_ONE" : "REPEAT_ALL")), responseListener).send();
    }

    @Override // com.connectsdk.service.DeviceService
    public void setServiceDescription(ServiceDescription serviceDescription) {
        super.setServiceDescription(serviceDescription);
        updateControlURL();
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void setVolume(float f, ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "SetVolume", getMessageXml(RENDERING_CONTROL_URN, "SetVolume", CommonUrlParts.Values.FALSE_INTEGER, dfi.m("Channel", "Master", "DesiredVolume", String.valueOf((int) (f * 100.0f)))), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public void stop(ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Stop", getMessageXml(AV_TRANSPORT_URN, "Stop", CommonUrlParts.Values.FALSE_INTEGER, null), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public ServiceSubscription<MediaPlayer.MediaInfoListener> subscribeMediaInfo(MediaPlayer.MediaInfoListener mediaInfoListener) {
        URLServiceSubscription<?> uRLServiceSubscription = new URLServiceSubscription<>(this, "info", null, null);
        uRLServiceSubscription.addListener((URLServiceSubscription<?>) mediaInfoListener);
        addSubscription(uRLServiceSubscription);
        return uRLServiceSubscription;
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public ServiceSubscription<VolumeControl.MuteListener> subscribeMute(VolumeControl.MuteListener muteListener) {
        URLServiceSubscription<?> uRLServiceSubscription = new URLServiceSubscription<>(this, "mute", null, null);
        uRLServiceSubscription.addListener((URLServiceSubscription<?>) muteListener);
        addSubscription(uRLServiceSubscription);
        return uRLServiceSubscription;
    }

    @Override // com.connectsdk.service.capability.MediaControl
    public ServiceSubscription<MediaControl.PlayStateListener> subscribePlayState(MediaControl.PlayStateListener playStateListener) {
        URLServiceSubscription<?> uRLServiceSubscription = new URLServiceSubscription<>(this, PLAY_STATE, null, null);
        uRLServiceSubscription.addListener((URLServiceSubscription<?>) playStateListener);
        addSubscription(uRLServiceSubscription);
        return uRLServiceSubscription;
    }

    public void subscribeServices() {
        Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.13
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    str = Util.getIpAddress(DLNAService.this.context).getHostAddress();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                    str = null;
                }
                String str2 = str;
                List<Service> serviceList = DLNAService.this.serviceDescription.getServiceList();
                if (serviceList != null) {
                    for (int i = 0; i < serviceList.size(); i++) {
                        String makeControlURL = DLNAService.this.makeControlURL("/", serviceList.get(i).eventSubURL);
                        if (makeControlURL != null) {
                            try {
                                HttpConnection newSubscriptionInstance = HttpConnection.newSubscriptionInstance(new URI("http", "", DLNAService.this.serviceDescription.getIpAddress(), DLNAService.this.serviceDescription.getPort(), makeControlURL, "", ""));
                                newSubscriptionInstance.setMethod(HttpConnection.Method.SUBSCRIBE);
                                newSubscriptionInstance.setHeader("CALLBACK", "<http://" + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + DLNAService.this.httpServer.getPort() + makeControlURL + ">");
                                newSubscriptionInstance.setHeader("NT", "upnp:event");
                                StringBuilder sb = new StringBuilder();
                                sb.append("Second-");
                                sb.append(DLNAService.TIMEOUT);
                                newSubscriptionInstance.setHeader("TIMEOUT", sb.toString());
                                newSubscriptionInstance.setHeader("Connection", "close");
                                newSubscriptionInstance.setHeader("Content-length", CommonUrlParts.Values.FALSE_INTEGER);
                                newSubscriptionInstance.setHeader("USER-AGENT", "Android UPnp/1.1 ConnectSDK");
                                newSubscriptionInstance.execute();
                                if (newSubscriptionInstance.getResponseCode() == 200) {
                                    DLNAService.this.SIDList.put(serviceList.get(i).serviceType, newSubscriptionInstance.getResponseHeader("SID"));
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        resubscribeServices();
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public ServiceSubscription<VolumeControl.VolumeListener> subscribeVolume(VolumeControl.VolumeListener volumeListener) {
        URLServiceSubscription<?> uRLServiceSubscription = new URLServiceSubscription<>(this, "volume", null, null);
        uRLServiceSubscription.addListener((URLServiceSubscription<?>) volumeListener);
        addSubscription(uRLServiceSubscription);
        return uRLServiceSubscription;
    }

    @Override // com.connectsdk.service.DeviceService, com.connectsdk.service.command.ServiceCommand.ServiceCommandProcessor
    public void unsubscribe(URLServiceSubscription<?> uRLServiceSubscription) {
        this.httpServer.getSubscriptions().remove(uRLServiceSubscription);
        if (this.httpServer.getSubscriptions().isEmpty()) {
            unsubscribeServices();
        }
    }

    public void unsubscribeServices() {
        Timer timer = this.resubscriptionTimer;
        if (timer != null) {
            timer.cancel();
        }
        Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DLNAService.15
            @Override // java.lang.Runnable
            public void run() {
                List<Service> serviceList = DLNAService.this.serviceDescription.getServiceList();
                if (serviceList != null) {
                    for (int i = 0; i < serviceList.size(); i++) {
                        String makeControlURL = DLNAService.this.makeControlURL("/", serviceList.get(i).eventSubURL);
                        if (makeControlURL != null) {
                            String str = DLNAService.this.SIDList.get(serviceList.get(i).serviceType);
                            try {
                                HttpConnection newSubscriptionInstance = HttpConnection.newSubscriptionInstance(new URI("http", "", DLNAService.this.serviceDescription.getIpAddress(), DLNAService.this.serviceDescription.getPort(), makeControlURL, "", ""));
                                newSubscriptionInstance.setMethod(HttpConnection.Method.UNSUBSCRIBE);
                                newSubscriptionInstance.setHeader("SID", str);
                                newSubscriptionInstance.execute();
                                if (newSubscriptionInstance.getResponseCode() == 200) {
                                    DLNAService.this.SIDList.remove(serviceList.get(i).serviceType);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // com.connectsdk.service.DeviceService
    public void updateCapabilities() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MediaPlayer.Display_Image);
        arrayList.add("MediaPlayer.Play.Video");
        arrayList.add("MediaPlayer.Play.Audio");
        arrayList.add(MediaPlayer.Play_Playlist);
        arrayList.add(MediaPlayer.Close);
        ouj.A(MediaPlayer.Subtitle_SRT, MediaPlayer.MetaData_Title, MediaPlayer.MetaData_MimeType, MediaPlayer.MediaInfo_Get, arrayList);
        ouj.A(MediaPlayer.MediaInfo_Subscribe, MediaControl.Play, MediaControl.Pause, MediaControl.Stop, arrayList);
        ouj.A(MediaControl.Seek, MediaControl.Position, MediaControl.Duration, MediaControl.PlayState, arrayList);
        ouj.A(MediaControl.PlayState_Subscribe, MediaControl.Next, MediaControl.Previous, PlaylistControl.Next, arrayList);
        ouj.A(PlaylistControl.Previous, PlaylistControl.JumpToTrack, PlaylistControl.SetPlayMode, VolumeControl.Volume_Set, arrayList);
        ouj.A(VolumeControl.Volume_Get, VolumeControl.Volume_Up_Down, VolumeControl.Volume_Subscribe, VolumeControl.Mute_Get, arrayList);
        arrayList.add(VolumeControl.Mute_Set);
        arrayList.add(VolumeControl.Mute_Subscribe);
        setCapabilities(arrayList);
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void volumeDown(final ResponseListener<Object> responseListener) {
        getVolume(new VolumeControl.VolumeListener() { // from class: com.connectsdk.service.DLNAService.17
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(responseListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Float f) {
                if (f.floatValue() <= 0.0d) {
                    Util.postSuccess(responseListener, null);
                    return;
                }
                float floatValue = (float) (f.floatValue() - 0.01d);
                if (floatValue < 0.0d) {
                    floatValue = 0.0f;
                }
                DLNAService.this.setVolume(floatValue, responseListener);
                Util.postSuccess(responseListener, null);
            }
        });
    }

    @Override // com.connectsdk.service.capability.VolumeControl
    public void volumeUp(final ResponseListener<Object> responseListener) {
        getVolume(new VolumeControl.VolumeListener() { // from class: com.connectsdk.service.DLNAService.16
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(responseListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Float f) {
                if (f.floatValue() >= 1.0d) {
                    Util.postSuccess(responseListener, null);
                    return;
                }
                float floatValue = (float) (f.floatValue() + 0.01d);
                if (floatValue > 1.0d) {
                    floatValue = 1.0f;
                }
                DLNAService.this.setVolume(floatValue, responseListener);
                Util.postSuccess(responseListener, null);
            }
        });
    }

    public String xmlToString(Node node, boolean z) throws TransformerException {
        DOMSource dOMSource = new DOMSource(node);
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        if (!z) {
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
        }
        newTransformer.transform(dOMSource, streamResult);
        return stringWriter.toString();
    }

    public DLNAService(ServiceDescription serviceDescription, ServiceConfig serviceConfig) {
        this(serviceDescription, serviceConfig, DiscoveryManager.getInstance().getContext(), new DLNAHttpServer());
    }

    public void seek(String str, String str2, ResponseListener<Object> responseListener) {
        new ServiceCommand(this, "Seek", getMessageXml(AV_TRANSPORT_URN, "Seek", CommonUrlParts.Values.FALSE_INTEGER, dfi.m("Unit", str, "Target", str2)), responseListener).send();
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void displayImage(String str, String str2, String str3, String str4, String str5, MediaPlayer.LaunchListener launchListener) {
        displayMedia(str, null, str2, str3, str4, str5, launchListener);
    }

    @Override // com.connectsdk.service.capability.MediaPlayer
    public void playMedia(String str, String str2, String str3, String str4, String str5, boolean z, MediaPlayer.LaunchListener launchListener) {
        displayMedia(str, null, str2, str3, str4, str5, launchListener);
    }

    @Deprecated
    public void displayMedia(String str, String str2, String str3, String str4, String str5, MediaPlayer.LaunchListener launchListener) {
        displayMedia(str, null, str2, str3, str4, str5, launchListener);
    }
}
