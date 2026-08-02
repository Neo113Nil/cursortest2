package com.connectsdk.service.netcast;

import android.os.Build;
import android.util.Log;
import com.connectsdk.core.ChannelInfo;
import com.connectsdk.core.TextInputStatusInfo;
import com.connectsdk.core.Util;
import com.connectsdk.discovery.provider.ssdp.SSDPClient;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.URLServiceSubscription;
import io.appmetrica.analytics.rtm.internal.Constants;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class NetcastHttpServer {
    static final String UDAP_PATH_EVENT = "/udap/api/event";
    int port;
    boolean running = false;
    NetcastTVService service;
    List<URLServiceSubscription<?>> subscriptions;
    ResponseListener<String> textChangedListener;
    ServerSocket welcomeSocket;

    public NetcastHttpServer(NetcastTVService netcastTVService, int i, ResponseListener<String> responseListener) {
        this.service = netcastTVService;
        this.port = i;
        this.textChangedListener = responseListener;
    }

    public void setSubscriptions(List<URLServiceSubscription<?>> list) {
        this.subscriptions = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void start() {
        BufferedReader bufferedReader;
        String sb;
        String format;
        String str;
        DataOutputStream dataOutputStream;
        PrintWriter printWriter;
        NetcastPOSTRequestParser netcastPOSTRequestParser;
        boolean z;
        String str2;
        String readLine;
        if (this.running) {
            return;
        }
        this.running = true;
        try {
            this.welcomeSocket = new ServerSocket(this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (this.running) {
            ServerSocket serverSocket = this.welcomeSocket;
            if (serverSocket == null || serverSocket.isClosed()) {
                stop();
                return;
            }
            try {
                Socket accept = this.welcomeSocket.accept();
                StringBuilder sb2 = new StringBuilder();
                PrintWriter printWriter2 = null;
                printWriter2 = null;
                ByteArrayInputStream byteArrayInputStream = null;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    do {
                        try {
                            readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            sb = sb2.toString();
                            Log.d(Util.T, "got message body: ".concat(sb));
                            Calendar calendar = Calendar.getInstance();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
                            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                            format = simpleDateFormat.format(calendar.getTime());
                            str = Build.VERSION.RELEASE;
                            dataOutputStream = new DataOutputStream(accept.getOutputStream());
                            printWriter = new PrintWriter(dataOutputStream);
                            try {
                                try {
                                    printWriter.println(SSDPClient.OK);
                                    printWriter.println("Server: Android/" + str + " UDAP/2.0 ConnectSDK/1.2.1");
                                    printWriter.println("Cache-Control: no-store, no-cache, must-revalidate");
                                    printWriter.println("Date: " + format);
                                    printWriter.println("Connection: Close");
                                    printWriter.println("Content-Length: 0");
                                    printWriter.println();
                                    printWriter.flush();
                                } catch (Throwable th) {
                                    th = th;
                                    printWriter2 = printWriter;
                                    try {
                                        bufferedReader.close();
                                        printWriter2.close();
                                        dataOutputStream.close();
                                        accept.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                    throw th;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                e.printStackTrace();
                                bufferedReader.close();
                                printWriter.close();
                                dataOutputStream.close();
                                accept.close();
                                SAXParserFactory newInstance = SAXParserFactory.newInstance();
                                byteArrayInputStream = new ByteArrayInputStream(sb.getBytes("UTF-8"));
                                netcastPOSTRequestParser = new NetcastPOSTRequestParser();
                                newInstance.newSAXParser().parse(byteArrayInputStream, netcastPOSTRequestParser);
                                if (sb.contains("ChannelChanged")) {
                                }
                            }
                            try {
                                bufferedReader.close();
                                printWriter.close();
                                dataOutputStream.close();
                                accept.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                            SAXParserFactory newInstance2 = SAXParserFactory.newInstance();
                            byteArrayInputStream = new ByteArrayInputStream(sb.getBytes("UTF-8"));
                            netcastPOSTRequestParser = new NetcastPOSTRequestParser();
                            newInstance2.newSAXParser().parse(byteArrayInputStream, netcastPOSTRequestParser);
                            if (sb.contains("ChannelChanged")) {
                            }
                        }
                    } while (!readLine.equals(""));
                    do {
                        int read = bufferedReader.read();
                        if (read == -1) {
                            break;
                        } else {
                            sb2.append((char) read);
                        }
                    } while (!sb2.toString().endsWith("</envelope>"));
                } catch (IOException e6) {
                    e = e6;
                    bufferedReader = null;
                }
                sb = sb2.toString();
                Log.d(Util.T, "got message body: ".concat(sb));
                Calendar calendar2 = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
                simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                format = simpleDateFormat2.format(calendar2.getTime());
                str = Build.VERSION.RELEASE;
                try {
                    dataOutputStream = new DataOutputStream(accept.getOutputStream());
                    try {
                        printWriter = new PrintWriter(dataOutputStream);
                        printWriter.println(SSDPClient.OK);
                        printWriter.println("Server: Android/" + str + " UDAP/2.0 ConnectSDK/1.2.1");
                        printWriter.println("Cache-Control: no-store, no-cache, must-revalidate");
                        printWriter.println("Date: " + format);
                        printWriter.println("Connection: Close");
                        printWriter.println("Content-Length: 0");
                        printWriter.println();
                        printWriter.flush();
                        bufferedReader.close();
                        printWriter.close();
                        dataOutputStream.close();
                    } catch (IOException e7) {
                        e = e7;
                        printWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e8) {
                    e = e8;
                    dataOutputStream = null;
                    printWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = null;
                }
                accept.close();
                SAXParserFactory newInstance22 = SAXParserFactory.newInstance();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(sb.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e9) {
                    e9.printStackTrace();
                }
                netcastPOSTRequestParser = new NetcastPOSTRequestParser();
                try {
                    newInstance22.newSAXParser().parse(byteArrayInputStream, netcastPOSTRequestParser);
                } catch (IOException e10) {
                    e10.printStackTrace();
                } catch (ParserConfigurationException e11) {
                    e11.printStackTrace();
                } catch (SAXException e12) {
                    e12.printStackTrace();
                }
                if (sb.contains("ChannelChanged")) {
                    ChannelInfo parseRawChannelData = NetcastChannelParser.parseRawChannelData(netcastPOSTRequestParser.getJSONObject());
                    Log.d(Util.T, "Channel Changed: " + parseRawChannelData.getNumber());
                    for (URLServiceSubscription<?> uRLServiceSubscription : this.subscriptions) {
                        if (uRLServiceSubscription.getTarget().equalsIgnoreCase("ChannelChanged")) {
                            for (int i = 0; i < uRLServiceSubscription.getListeners().size(); i++) {
                                Util.postSuccess((ResponseListener) uRLServiceSubscription.getListeners().get(i), parseRawChannelData);
                            }
                        }
                    }
                } else if (sb.contains("KeyboardVisible")) {
                    TextInputStatusInfo textInputStatusInfo = new TextInputStatusInfo();
                    textInputStatusInfo.setRawData(netcastPOSTRequestParser.getJSONObject());
                    try {
                        z = ((Boolean) ((JSONObject) netcastPOSTRequestParser.getJSONObject().get("currentWidget")).get("focus")).booleanValue();
                        try {
                            textInputStatusInfo.setFocused(z);
                        } catch (JSONException e13) {
                            e = e13;
                            e.printStackTrace();
                            Log.d(Util.T, "KeyboardFocused?: " + z);
                            while (r3.hasNext()) {
                            }
                        }
                    } catch (JSONException e14) {
                        e = e14;
                        z = false;
                    }
                    Log.d(Util.T, "KeyboardFocused?: " + z);
                    for (URLServiceSubscription<?> uRLServiceSubscription2 : this.subscriptions) {
                        if (uRLServiceSubscription2.getTarget().equalsIgnoreCase("KeyboardVisible")) {
                            for (int i2 = 0; i2 < uRLServiceSubscription2.getListeners().size(); i2++) {
                                Util.postSuccess((ResponseListener) uRLServiceSubscription2.getListeners().get(i2), textInputStatusInfo);
                            }
                        }
                    }
                } else if (sb.contains("TextEdited")) {
                    System.out.println("TextEdited");
                    try {
                        str2 = netcastPOSTRequestParser.getJSONObject().getString(Constants.KEY_VALUE);
                    } catch (JSONException e15) {
                        e15.printStackTrace();
                        str2 = "";
                    }
                    Util.postSuccess(this.textChangedListener, str2);
                } else if (sb.contains(NetcastTVService.TARGET_3D_MODE)) {
                    try {
                        boolean equalsIgnoreCase = ((String) netcastPOSTRequestParser.getJSONObject().get(Constants.KEY_VALUE)).equalsIgnoreCase(PListParser.TAG_TRUE);
                        for (URLServiceSubscription<?> uRLServiceSubscription3 : this.subscriptions) {
                            if (uRLServiceSubscription3.getTarget().equalsIgnoreCase(NetcastTVService.TARGET_3D_MODE)) {
                                for (int i3 = 0; i3 < uRLServiceSubscription3.getListeners().size(); i3++) {
                                    Util.postSuccess((ResponseListener) uRLServiceSubscription3.getListeners().get(i3), Boolean.valueOf(equalsIgnoreCase));
                                }
                            }
                        }
                    } catch (JSONException e16) {
                        e16.printStackTrace();
                    }
                }
            } catch (IOException e17) {
                e17.printStackTrace();
                stop();
                return;
            }
        }
    }

    public void stop() {
        if (this.running) {
            ServerSocket serverSocket = this.welcomeSocket;
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    this.welcomeSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            this.welcomeSocket = null;
            this.running = false;
        }
    }
}
