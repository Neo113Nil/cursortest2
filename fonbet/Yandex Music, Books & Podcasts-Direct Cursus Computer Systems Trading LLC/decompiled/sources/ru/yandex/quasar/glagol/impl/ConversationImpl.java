package ru.yandex.quasar.glagol.impl;

import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.NetcastTVService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.bind.JsonTreeWriter;
import defpackage.a4i;
import defpackage.b6e;
import defpackage.bv2;
import defpackage.dzh;
import defpackage.ex6;
import defpackage.gj2;
import defpackage.gy6;
import defpackage.h08;
import defpackage.hj6;
import defpackage.ij2;
import defpackage.k5r;
import defpackage.kab;
import defpackage.mab;
import defpackage.mdk;
import defpackage.p46;
import defpackage.shd;
import defpackage.su4;
import defpackage.t1f;
import defpackage.t3o;
import defpackage.tlm;
import defpackage.tzh;
import defpackage.u3o;
import defpackage.unl;
import defpackage.utd;
import defpackage.v68;
import defpackage.weo;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.yandex.quasar.glagol.DeviceConnectionListener$State;
import ru.yandex.quasar.glagol.ResponseMessage$Status;
import ru.yandex.quasar.glagol.State;
import ru.yandex.quasar.glagol.conversation.model.Command;
import ru.yandex.quasar.glagol.conversation.model.RepeatMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class ConversationImpl implements hj6 {
    public static final int INCORRECT_TOKEN = 4000;
    private static final String TAG = "Conversation";
    private final gj2 backendJwtTokenApi;
    private final Config config;
    private final v68 discoveredDevice;
    private final Executor executor;
    private mdk initiationPayload;
    private final a4i reporter;
    private final String strDeviceId;
    private List<String> supportedFeatures;
    private final String userOAuthToken;
    private final gy6 webSocketClient;
    private final Object messageListenersLock = new Object();
    private final List<tzh> messageListeners = new ArrayList();
    private final Map<String, t3o> pendingResponses = new HashMap();

    @NonNull
    private final List<h08> connectionListeners = new ArrayList();
    private final Object connectionListenersLock = new Object();
    final Gson gson = GsonFactory.receievedMessagesParser();
    private String conversationToken = refreshJwtToken();

    public static class Config {
        public final int deviceConnectionTimeout;
        public final int deviceCreateConnectionTries;
        public final int deviceReadTimeout;
        public final int deviceReconnectionDelay;
        public final int deviceRestoreConnectionTries;
        public final boolean logsConversationEnabled;
        public final boolean logsConversationExtraEnabled;
        public final boolean logsRawDeviceAnswerEnabled;
        public final boolean strictSSLDisabled;

        private Config(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, int i4, int i5) {
            this.logsConversationEnabled = z;
            this.logsConversationExtraEnabled = z2;
            this.logsRawDeviceAnswerEnabled = z3;
            this.strictSSLDisabled = z4;
            this.deviceConnectionTimeout = i;
            this.deviceRestoreConnectionTries = i2;
            this.deviceCreateConnectionTries = i3;
            this.deviceReconnectionDelay = i4;
            this.deviceReadTimeout = i5;
        }

        public static Config from(p46 p46Var) {
            p46Var.getClass();
            return new Config(false, false, false, false, 10000, 10, 1, 2000, 10000);
        }
    }

    public static class EntityInfoImpl implements mab {

        @SerializedName(DeviceService.KEY_DESC)
        private String description;

        @SerializedName(ConnectableDevice.KEY_ID)
        private String id;

        @SerializedName("next")
        private NeighborImpl next;

        @SerializedName("prev")
        private NeighborImpl prev;

        @SerializedName("repeatMode")
        private RepeatMode repeatMode;

        @SerializedName("shuffled")
        private Boolean shuffled;

        @SerializedName("type")
        private String type;

        private EntityInfoImpl() {
        }

        @Override // defpackage.mab
        public String getDescription() {
            return this.description;
        }

        @Override // defpackage.mab
        public String getId() {
            return this.id;
        }

        @Override // defpackage.mab
        public kab getNext() {
            return this.next;
        }

        @Override // defpackage.mab
        public kab getPrev() {
            return this.prev;
        }

        public RepeatMode getRepeatMode() {
            return this.repeatMode;
        }

        @Override // defpackage.mab
        public String getType() {
            return this.type;
        }

        public Boolean isShuffled() {
            return this.shuffled;
        }

        public String toString() {
            return "EntityInfo{id='" + this.id + "', type='" + this.type + "', description='" + this.description + "', prev=" + this.prev + ", next=" + this.next + '}';
        }
    }

    public static class HdmiStateImpl implements utd {

        @SerializedName("capable")
        private boolean capable;

        @SerializedName("present")
        private boolean present;

        private HdmiStateImpl() {
        }

        public boolean isCapable() {
            return this.capable;
        }

        public boolean isPresent() {
            return this.present;
        }
    }

    public static class NeighborImpl implements kab {

        @SerializedName(ConnectableDevice.KEY_ID)
        private String id;

        @SerializedName("type")
        private String type;

        private NeighborImpl() {
        }

        @Override // defpackage.kab
        @NonNull
        public String getId() {
            return this.id;
        }

        @NonNull
        public String getType() {
            return this.type;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{id='");
            sb.append(this.id);
            sb.append("', type='");
            return su4.o(sb, this.type, "'}");
        }
    }

    public static class PlayerStateImpl implements unl {

        @SerializedName("duration")
        private Double duration;

        @SerializedName("entityInfo")
        private EntityInfoImpl entityInfo;

        @SerializedName("extra")
        private Map<String, String> extra;

        @SerializedName("hasNext")
        private boolean hasNext;

        @SerializedName("hasPause")
        private boolean hasPause;

        @SerializedName("hasPlay")
        private boolean hasPlay;

        @SerializedName("hasPrev")
        private boolean hasPrev;

        @SerializedName("hasProgressBar")
        private boolean hasProgressBar;

        @SerializedName(ConnectableDevice.KEY_ID)
        private String id;

        @SerializedName("liveStreamText")
        private String liveStreamText;

        @SerializedName("playerType")
        private String playerType;

        @SerializedName("playlistDescription")
        private String playlistDescription;

        @SerializedName("playlistId")
        private String playlistId;

        @SerializedName("playlistPuid")
        private String playlistPuid;

        @SerializedName("playlistType")
        private String playlistType;

        @SerializedName("progress")
        private Double progress;

        @SerializedName("showPlayer")
        private boolean showPlayer;

        @SerializedName("subtitle")
        private String subtitle;

        @SerializedName("title")
        private String title;

        @SerializedName("type")
        private String type;

        private PlayerStateImpl() {
        }

        @Override // defpackage.unl
        public Double getDuration() {
            return this.duration;
        }

        @Override // defpackage.unl
        public mab getEntityInfo() {
            return this.entityInfo;
        }

        @Override // defpackage.unl
        public Map<String, String> getExtra() {
            return this.extra;
        }

        @Override // defpackage.unl
        public String getId() {
            return this.id;
        }

        @Override // defpackage.unl
        public String getLiveStreamText() {
            return this.liveStreamText;
        }

        @Override // defpackage.unl
        public String getPlayerType() {
            return this.playerType;
        }

        public String getPlaylistDescription() {
            return this.playlistDescription;
        }

        public String getPlaylistId() {
            return this.playlistId;
        }

        public String getPlaylistPuid() {
            return this.playlistPuid;
        }

        public String getPlaylistType() {
            return this.playlistType;
        }

        @Override // defpackage.unl
        public Double getProgress() {
            return this.progress;
        }

        @Override // defpackage.unl
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // defpackage.unl
        public String getTitle() {
            return this.title;
        }

        @Override // defpackage.unl
        public String getType() {
            return this.type;
        }

        @Override // defpackage.unl
        public boolean hasPause() {
            return this.hasPause;
        }

        public boolean hasPlay() {
            return this.hasPlay;
        }

        @Override // defpackage.unl
        public boolean isHasNext() {
            return this.hasNext;
        }

        public boolean isHasPrev() {
            return this.hasPrev;
        }

        public boolean isHasProgressBar() {
            return this.hasProgressBar;
        }

        public void setDuration(Double d) {
            this.duration = d;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setHasNext(boolean z) {
            this.hasNext = z;
        }

        public void setHasPause(boolean z) {
            this.hasPause = z;
        }

        public void setHasPlay(boolean z) {
            this.hasPlay = z;
        }

        public void setHasPrev(boolean z) {
            this.hasPrev = z;
        }

        public void setHasProgressBar(boolean z) {
            this.hasProgressBar = z;
        }

        public void setLiveStreamText(String str) {
            this.liveStreamText = str;
        }

        public void setPlaylistPuid(String str) {
            this.playlistPuid = str;
        }

        public void setProgress(Double d) {
            this.progress = d;
        }

        public void setSubtitle(String str) {
            this.subtitle = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public boolean shouldShowPlayer() {
            return this.showPlayer;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{id='");
            sb.append(this.id);
            sb.append("', title='");
            sb.append(this.title);
            sb.append("', subtitle='");
            sb.append(this.subtitle);
            sb.append("', progress=");
            sb.append(this.progress);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", playlist={");
            sb.append(this.playlistType);
            sb.append(" id=");
            sb.append(this.playlistId);
            sb.append(" descr='");
            sb.append(this.playlistDescription);
            sb.append("'}, entity=");
            sb.append(this.entityInfo);
            sb.append(", hasPrev=");
            sb.append(this.hasPrev);
            sb.append(", hasNext=");
            sb.append(this.hasNext);
            sb.append(", hasPause=");
            sb.append(this.hasPause);
            sb.append(", hasPlay=");
            sb.append(this.hasPlay);
            sb.append(", hasProgressBar=");
            sb.append(this.hasProgressBar);
            sb.append(", showPlayer=");
            sb.append(this.showPlayer);
            sb.append(", extra=");
            return k5r.p(sb, this.extra, '}');
        }
    }

    public static class ReceivedMessageWrapper {

        @SerializedName("errorCode")
        private String errorCode;

        @SerializedName("errorText")
        private String errorText;

        @SerializedName("errorTextLang")
        private String errorTextLang;

        @SerializedName("extra")
        private Map<String, String> extra = new HashMap();

        @SerializedName(ConnectableDevice.KEY_ID)
        private String id;

        @SerializedName("requestId")
        private String requestId;

        @SerializedName("requestSentTime")
        private long requestSentTime;

        @SerializedName("sentTime")
        private long sentTime;

        @SerializedName("state")
        private StateImpl state;

        @SerializedName("status")
        private ResponseMessage$Status status;

        @SerializedName("supported_features")
        private List<String> supportedFeatures;

        @SerializedName("vinsResponse")
        private JsonObject vinsResponse;

        public String getErrorCode() {
            return this.errorCode;
        }

        public String getErrorText() {
            return this.errorText;
        }

        public String getErrorTextLang() {
            return this.errorTextLang;
        }

        public Map<String, String> getExtra() {
            return this.extra;
        }

        public String getId() {
            return this.id;
        }

        public String getRequestId() {
            return this.requestId;
        }

        public long getRequestSentTime() {
            return this.requestSentTime;
        }

        public long getSentTime() {
            return this.sentTime;
        }

        public State getState() {
            return this.state;
        }

        public ResponseMessage$Status getStatus() {
            return this.status;
        }

        public List<String> getSupportedFeatures() {
            return this.supportedFeatures;
        }

        public JsonObject getVinsResponse() {
            return this.vinsResponse;
        }

        public void setErrorCode(String str) {
            this.errorCode = str;
        }

        public void setErrorText(String str) {
            this.errorText = str;
        }

        public void setErrorTextLang(String str) {
            this.errorTextLang = str;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setRequestId(String str) {
            this.requestId = str;
        }

        public void setRequestSentTime(long j) {
            this.requestSentTime = j;
        }

        public void setSentTime(long j) {
            this.sentTime = j;
        }

        public void setState(StateImpl stateImpl) {
            this.state = stateImpl;
        }

        public void setStatus(ResponseMessage$Status responseMessage$Status) {
            this.status = responseMessage$Status;
        }

        public void setSupportedFeatures(List<String> list) {
            this.supportedFeatures = list;
        }

        public void setVinsResponse(JsonObject jsonObject) {
            this.vinsResponse = jsonObject;
        }
    }

    public static class StateImpl implements State {

        @SerializedName("aliceState")
        private State.AliceState aliceState;

        @SerializedName("hdmi")
        private HdmiStateImpl hdmiState;

        @SerializedName("playerState")
        private PlayerStateImpl playerState;

        @SerializedName("timeSinceLastVoiceActivity")
        private Long timeSinceLastVoiceActivity;

        @SerializedName("volume")
        private Double volume;

        private StateImpl() {
        }

        public State.AliceState getAliceState() {
            return this.aliceState;
        }

        public utd getHdmiState() {
            return this.hdmiState;
        }

        @Override // ru.yandex.quasar.glagol.State
        public unl getPlayerState() {
            return this.playerState;
        }

        @Override // ru.yandex.quasar.glagol.State
        public Long getTimeSinceLastVoiceActivity() {
            return this.timeSinceLastVoiceActivity;
        }

        @Override // ru.yandex.quasar.glagol.State
        public Double getVolume() {
            return this.volume;
        }

        public void setPlayerState(PlayerStateImpl playerStateImpl) {
            this.playerState = playerStateImpl;
        }

        public void setTimeSinceLastVoiceActivity(Long l) {
            this.timeSinceLastVoiceActivity = l;
        }

        public void setVolume(Double d) {
            this.volume = d;
        }

        public String toString() {
            String str = "StateImpl{volume=" + this.volume;
            if (this.playerState != null) {
                StringBuilder m = tlm.m(str, ", player=");
                m.append(this.playerState);
                str = m.toString();
            }
            if (this.hdmiState != null) {
                StringBuilder m2 = tlm.m(str, ", hdmiCapable=");
                m2.append(this.hdmiState.capable);
                StringBuilder m3 = tlm.m(m2.toString(), ", hdmiPresent=");
                m3.append(this.hdmiState.present);
                str = m3.toString();
            }
            StringBuilder m4 = tlm.m(str, ", aliceState=");
            m4.append(this.aliceState);
            m4.append(", timeSinceLastVoiceActivity=");
            return tlm.k(m4, this.timeSinceLastVoiceActivity, '}');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: KeyStoreException -> 0x00ac, NoSuchAlgorithmException -> 0x00af, KeyManagementException -> 0x00b1, UnrecoverableKeyException -> 0x00b3, TryCatch #3 {KeyManagementException -> 0x00b1, KeyStoreException -> 0x00ac, NoSuchAlgorithmException -> 0x00af, UnrecoverableKeyException -> 0x00b3, blocks: (B:14:0x009d, B:16:0x00a3, B:17:0x00b7, B:22:0x00b5), top: B:13:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[Catch: KeyStoreException -> 0x00ac, NoSuchAlgorithmException -> 0x00af, KeyManagementException -> 0x00b1, UnrecoverableKeyException -> 0x00b3, TryCatch #3 {KeyManagementException -> 0x00b1, KeyStoreException -> 0x00ac, NoSuchAlgorithmException -> 0x00af, UnrecoverableKeyException -> 0x00b3, blocks: (B:14:0x009d, B:16:0x00a3, B:17:0x00b7, B:22:0x00b5), top: B:13:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConversationImpl(@NonNull final Config config, @NonNull final v68 v68Var, @NonNull String str, @NonNull ij2 ij2Var, @NonNull tzh tzhVar, h08 h08Var, @NonNull Executor executor, @NonNull final a4i a4iVar, mdk mdkVar) throws shd {
        boolean z;
        this.config = config;
        this.reporter = a4iVar;
        this.discoveredDevice = v68Var;
        this.strDeviceId = v68Var.getDeviceId();
        this.userOAuthToken = str;
        this.backendJwtTokenApi = new gj2(ij2Var, a4iVar);
        this.executor = executor;
        this.initiationPayload = mdkVar;
        addListener(tzhVar);
        if (h08Var != null) {
            addConnectionListener(h08Var);
        }
        a4iVar.getClass();
        String[] split = v68Var.getURI().getHost().split("\\.");
        try {
            if (split.length <= 4) {
                for (String str2 : split) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt >= 0 && parseInt <= 255) {
                    }
                }
                z = true;
                a4iVar.a.V(!z ? "ipv4" : "ipv6", "glagolConnectWsPeerL3Protocol");
                gy6 gy6Var = new gy6(v68Var.getURI()) { // from class: ru.yandex.quasar.glagol.impl.ConversationImpl.1
                    @Override // defpackage.gy6
                    public void onBinaryReceived(byte[] bArr) {
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Binary received, doing nothing.", ConversationImpl.this.strDeviceId);
                        }
                    }

                    @Override // defpackage.gy6
                    public void onCloseReceived(int i, String str3) {
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Close received. code=%d reason=%s", ConversationImpl.this.strDeviceId, Integer.valueOf(i), str3);
                        }
                        a4i a4iVar2 = a4iVar;
                        a4iVar2.getClass();
                        str3.getClass();
                        JsonObject i2 = a4iVar2.i();
                        i2.u("wsCloseCode", str3);
                        a4iVar2.a.T("ConnectWsClose", i2);
                        if (i == 4000) {
                            try {
                                a4i a4iVar3 = a4iVar;
                                a4iVar3.a.T("ConnectBackendConversationTokenRetry", a4iVar3.i());
                                ConversationImpl conversationImpl = ConversationImpl.this;
                                conversationImpl.conversationToken = conversationImpl.refreshJwtToken();
                            } catch (shd e) {
                                b6e.q(e);
                                return;
                            }
                        }
                        ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.CLOSED, "WebSocketCloseCallbackError");
                    }

                    @Override // defpackage.gy6
                    public void onException(Exception exc) {
                        a4i a4iVar2 = a4iVar;
                        v68 v68Var2 = v68Var;
                        a4iVar2.getClass();
                        v68Var2.getClass();
                        exc.getClass();
                        JsonObject i = a4iVar2.i();
                        a4i.a(i, v68Var2);
                        i.u("errorDomain", exc.toString());
                        t1f t1fVar = a4iVar2.a;
                        t1fVar.T("ConnectWsError", i);
                        t1fVar.S("ConnectWsError", exc);
                    }

                    @Override // defpackage.gy6
                    public void onOpen() {
                        a4i a4iVar2 = a4iVar;
                        a4iVar2.a.T("ConnectWsOpen", a4iVar2.i());
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Websocket open.", ConversationImpl.this.strDeviceId);
                        }
                        if (ConversationImpl.this.initiationPayload != null) {
                            ConversationImpl conversationImpl = ConversationImpl.this;
                            conversationImpl.sendImpl(conversationImpl.initiationPayload, null);
                            ConversationImpl.this.initiationPayload = null;
                        }
                        ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.OPENED, "WebSocketOpenCallbackError");
                    }

                    @Override // defpackage.gy6
                    public void onPingReceived(byte[] bArr) {
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Ping received, doing nothing.", ConversationImpl.this.strDeviceId);
                        }
                    }

                    @Override // defpackage.gy6
                    public void onPongReceived(byte[] bArr) {
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Pong received.", ConversationImpl.this.strDeviceId);
                        }
                    }

                    @Override // defpackage.gy6
                    public void onReconnection() {
                        a4i a4iVar2 = a4iVar;
                        a4iVar2.a.T("ConnectWsReconnect", a4iVar2.i());
                        if (config.logsConversationEnabled) {
                            weo.p(ConversationImpl.TAG, "DID=%s Websocket reconnect.", ConversationImpl.this.strDeviceId);
                        }
                        ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.RETRY, "WebSocketReconnectCallbackError");
                    }

                    @Override // defpackage.gy6
                    public void onTextReceived(String str3) {
                        ConversationImpl.this.handleResponse(str3);
                    }
                };
                this.webSocketClient = gy6Var;
                gy6Var.setSSLSocketFactory(new ex6(v68Var.getCertificate() == null ? new String[]{v68Var.getCertificate()} : new String[0], config.strictSSLDisabled));
                gy6Var.setConnectTimeout(config.deviceConnectionTimeout);
                gy6Var.setReadTimeout(config.deviceConnectionTimeout);
                gy6Var.setConnectionCreateTries(config.deviceCreateConnectionTries);
                gy6Var.setConnectionRetries(config.deviceRestoreConnectionTries);
                gy6Var.enableAutomaticReconnection(config.deviceReconnectionDelay);
                gy6Var.connect();
                return;
            }
            gy6Var.setSSLSocketFactory(new ex6(v68Var.getCertificate() == null ? new String[]{v68Var.getCertificate()} : new String[0], config.strictSSLDisabled));
            gy6Var.setConnectTimeout(config.deviceConnectionTimeout);
            gy6Var.setReadTimeout(config.deviceConnectionTimeout);
            gy6Var.setConnectionCreateTries(config.deviceCreateConnectionTries);
            gy6Var.setConnectionRetries(config.deviceRestoreConnectionTries);
            gy6Var.enableAutomaticReconnection(config.deviceReconnectionDelay);
            gy6Var.connect();
            return;
        } catch (KeyManagementException e) {
            e = e;
            throw new shd("snap, ssl error", e);
        } catch (KeyStoreException e2) {
            e = e2;
            throw new shd("snap, ssl error", e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new shd("snap, ssl error", e);
        } catch (UnrecoverableKeyException e4) {
            e = e4;
            throw new shd("snap, ssl error", e);
        }
        z = false;
        a4iVar.a.V(!z ? "ipv4" : "ipv6", "glagolConnectWsPeerL3Protocol");
        gy6 gy6Var2 = new gy6(v68Var.getURI()) { // from class: ru.yandex.quasar.glagol.impl.ConversationImpl.1
            @Override // defpackage.gy6
            public void onBinaryReceived(byte[] bArr) {
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Binary received, doing nothing.", ConversationImpl.this.strDeviceId);
                }
            }

            @Override // defpackage.gy6
            public void onCloseReceived(int i, String str3) {
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Close received. code=%d reason=%s", ConversationImpl.this.strDeviceId, Integer.valueOf(i), str3);
                }
                a4i a4iVar2 = a4iVar;
                a4iVar2.getClass();
                str3.getClass();
                JsonObject i2 = a4iVar2.i();
                i2.u("wsCloseCode", str3);
                a4iVar2.a.T("ConnectWsClose", i2);
                if (i == 4000) {
                    try {
                        a4i a4iVar3 = a4iVar;
                        a4iVar3.a.T("ConnectBackendConversationTokenRetry", a4iVar3.i());
                        ConversationImpl conversationImpl = ConversationImpl.this;
                        conversationImpl.conversationToken = conversationImpl.refreshJwtToken();
                    } catch (shd e5) {
                        b6e.q(e5);
                        return;
                    }
                }
                ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.CLOSED, "WebSocketCloseCallbackError");
            }

            @Override // defpackage.gy6
            public void onException(Exception exc) {
                a4i a4iVar2 = a4iVar;
                v68 v68Var2 = v68Var;
                a4iVar2.getClass();
                v68Var2.getClass();
                exc.getClass();
                JsonObject i = a4iVar2.i();
                a4i.a(i, v68Var2);
                i.u("errorDomain", exc.toString());
                t1f t1fVar = a4iVar2.a;
                t1fVar.T("ConnectWsError", i);
                t1fVar.S("ConnectWsError", exc);
            }

            @Override // defpackage.gy6
            public void onOpen() {
                a4i a4iVar2 = a4iVar;
                a4iVar2.a.T("ConnectWsOpen", a4iVar2.i());
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Websocket open.", ConversationImpl.this.strDeviceId);
                }
                if (ConversationImpl.this.initiationPayload != null) {
                    ConversationImpl conversationImpl = ConversationImpl.this;
                    conversationImpl.sendImpl(conversationImpl.initiationPayload, null);
                    ConversationImpl.this.initiationPayload = null;
                }
                ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.OPENED, "WebSocketOpenCallbackError");
            }

            @Override // defpackage.gy6
            public void onPingReceived(byte[] bArr) {
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Ping received, doing nothing.", ConversationImpl.this.strDeviceId);
                }
            }

            @Override // defpackage.gy6
            public void onPongReceived(byte[] bArr) {
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Pong received.", ConversationImpl.this.strDeviceId);
                }
            }

            @Override // defpackage.gy6
            public void onReconnection() {
                a4i a4iVar2 = a4iVar;
                a4iVar2.a.T("ConnectWsReconnect", a4iVar2.i());
                if (config.logsConversationEnabled) {
                    weo.p(ConversationImpl.TAG, "DID=%s Websocket reconnect.", ConversationImpl.this.strDeviceId);
                }
                ConversationImpl.this.notifyConnectionStateChanged(DeviceConnectionListener$State.RETRY, "WebSocketReconnectCallbackError");
            }

            @Override // defpackage.gy6
            public void onTextReceived(String str3) {
                ConversationImpl.this.handleResponse(str3);
            }
        };
        this.webSocketClient = gy6Var2;
    }

    public static ReceivedMessageWrapper getReceivedMessageWrapper(String str, Gson gson) {
        ReceivedMessageWrapper receivedMessageWrapper = (ReceivedMessageWrapper) gson.d(str, ReceivedMessageWrapper.class);
        ExtraDataTransformer.INSTANCE.transformExtra(receivedMessageWrapper.extra);
        return receivedMessageWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(String str) {
        try {
            if (this.config.logsRawDeviceAnswerEnabled) {
                weo.q("DID=" + this.strDeviceId + " RAWMSG: " + str);
            }
            ReceivedMessageWrapper receivedMessageWrapper = getReceivedMessageWrapper(str, this.gson);
            final MessageImpl messageImpl = new MessageImpl(receivedMessageWrapper.getId(), receivedMessageWrapper.getSentTime(), receivedMessageWrapper.getState(), receivedMessageWrapper.getStatus(), receivedMessageWrapper.getRequestId(), receivedMessageWrapper.getExtra(), receivedMessageWrapper.getSupportedFeatures(), receivedMessageWrapper.getVinsResponse(), receivedMessageWrapper.getErrorCode(), receivedMessageWrapper.getErrorText(), receivedMessageWrapper.getErrorTextLang());
            if (messageImpl.getId() != null && messageImpl.getSentTime() != 0 && messageImpl.getState() != null) {
                if (this.config.logsConversationEnabled) {
                    weo.p(TAG, "DID=%s Msg received %s", this.strDeviceId, messageImpl);
                    if (this.config.logsConversationExtraEnabled) {
                        for (Map.Entry<String, String> entry : messageImpl.getExtra().entrySet()) {
                            weo.p(TAG, "DID=%s Msg Extra %s=\"%s\"", this.strDeviceId, entry.getKey(), entry.getValue());
                        }
                        unl playerState = messageImpl.getState().getPlayerState();
                        if (playerState != null && playerState.getExtra() != null) {
                            for (Map.Entry entry2 : playerState.getExtra().entrySet()) {
                                weo.p(TAG, "DID=%s PlayerState Extra %s=\"%s\"", this.strDeviceId, entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                }
                if (this.supportedFeatures == null) {
                    List<String> supportedFeatures = messageImpl.getSupportedFeatures();
                    this.supportedFeatures = supportedFeatures;
                    if (this.config.logsConversationEnabled && supportedFeatures != null) {
                        weo.p(TAG, "DID=%s Update supported features: %s", this.strDeviceId, supportedFeatures);
                    }
                }
                notifyListeners(messageImpl);
                if (receivedMessageWrapper.getRequestId() == null || !this.pendingResponses.containsKey(receivedMessageWrapper.getRequestId())) {
                    return;
                }
                if (receivedMessageWrapper.getStatus() == null) {
                    weo.r(TAG, "DID=%s Malformed status: requestId=%s msg=%s", this.strDeviceId, receivedMessageWrapper.getRequestId(), messageImpl);
                    return;
                } else {
                    final t3o remove = this.pendingResponses.remove(receivedMessageWrapper.getRequestId());
                    this.executor.execute(new Runnable() { // from class: ru.yandex.quasar.glagol.impl.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            t3o.this.onMessage(messageImpl);
                        }
                    });
                    return;
                }
            }
            weo.r(TAG, "DID=%s Malformed: %s", this.strDeviceId, messageImpl);
        } catch (JsonSyntaxException e) {
            a4i a4iVar = this.reporter;
            a4iVar.getClass();
            a4iVar.a.S("ConnectWsError", e);
            weo.s(TAG, e, "DID=%s Received bad json: <%s>", this.strDeviceId, str);
        } catch (Exception e2) {
            a4i a4iVar2 = this.reporter;
            a4iVar2.getClass();
            a4iVar2.a.S("ConnectWsError", e2);
            weo.s(TAG, e2, "DID=%s Message handle error: <%s>", this.strDeviceId, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyConnectionStateChanged(DeviceConnectionListener$State deviceConnectionListener$State, String str) {
        synchronized (this.connectionListenersLock) {
            Iterator<h08> it = this.connectionListeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onConnectionStateChanged(this.discoveredDevice.getId(), this, deviceConnectionListener$State);
                } catch (Exception e) {
                    a4i a4iVar = this.reporter;
                    a4iVar.getClass();
                    str.getClass();
                    a4iVar.a.S(str, e);
                }
            }
        }
    }

    private void notifyListeners(dzh dzhVar) {
        synchronized (this.messageListenersLock) {
            try {
                Iterator<tzh> it = this.messageListeners.iterator();
                while (it.hasNext()) {
                    it.next().onMessage(dzhVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String refreshJwtToken() throws shd {
        try {
            return this.backendJwtTokenApi.a(this.discoveredDevice.getId(), this.userOAuthToken);
        } catch (Throwable th) {
            throw new shd("Error getting jwt token, cannot proceed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String sendImpl(@NonNull mdk mdkVar, t3o t3oVar) {
        SentMessageWrapper sentMessageWrapper = new SentMessageWrapper(mdkVar, this.conversationToken);
        String j = this.gson.j(sentMessageWrapper);
        a4i a4iVar = this.reporter;
        String str = sentMessageWrapper.id;
        a4iVar.getClass();
        str.getClass();
        mdkVar.getClass();
        if (mdkVar instanceof Command) {
            Command command = (Command) mdkVar;
            if (!"ping".equalsIgnoreCase(command.getCommand())) {
                JsonObject i = a4iVar.i();
                i.u("requestID", str);
                i.u(NetcastTVService.UDAP_API_COMMAND, command.getCommand());
                Gson gson = (Gson) a4iVar.d.getValue();
                gson.getClass();
                Class<?> cls = mdkVar.getClass();
                JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
                gson.l(mdkVar, cls, jsonTreeWriter);
                JsonObject m = jsonTreeWriter.X0().m();
                LinkedTreeMap linkedTreeMap = m.a;
                if (linkedTreeMap.d > 0) {
                    i.r("payload", m);
                }
                a4iVar.a.T("ConnectWsCommand", i);
            }
        }
        if (this.config.logsConversationEnabled) {
            String j2 = this.gson.j(sentMessageWrapper.copy(false));
            String str2 = this.strDeviceId;
            if (t3oVar == null) {
                weo.p(TAG, "DID=%s send one-way message of {%d} symbols: %s", str2, Integer.valueOf(j.length()), j2);
            } else {
                weo.p(TAG, "DID=%s send listened message of {%d} symbols: %s", str2, Integer.valueOf(j.length()), j2);
            }
        }
        this.webSocketClient.send(j);
        if (t3oVar != null) {
            this.pendingResponses.put(sentMessageWrapper.getId(), new TimeResponseListenerWrapper(t3oVar));
        }
        return sentMessageWrapper.getId();
    }

    @Override // defpackage.hj6
    public void addConnectionListener(@NonNull h08 h08Var) {
        synchronized (this.connectionListenersLock) {
            this.connectionListeners.add(h08Var);
        }
    }

    @Override // defpackage.gj6
    public void addListener(@NonNull tzh tzhVar) {
        synchronized (this.messageListenersLock) {
            this.messageListeners.add(tzhVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.webSocketClient.close();
        synchronized (this.connectionListenersLock) {
            this.connectionListeners.clear();
        }
        synchronized (this.messageListenersLock) {
            this.messageListeners.clear();
        }
        if (this.config.logsConversationEnabled) {
            weo.p(TAG, "DID=%s closed.", this.strDeviceId);
        }
    }

    @Override // defpackage.gj6
    @NonNull
    public v68 getDiscoveredDevice() {
        return this.discoveredDevice;
    }

    @Override // defpackage.gj6
    public List<String> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    @Override // defpackage.hj6
    public void removeConnectionListener(@NonNull h08 h08Var) {
        synchronized (this.connectionListenersLock) {
            this.connectionListeners.remove(h08Var);
        }
    }

    @Override // defpackage.gj6
    public void removeListener(@NonNull tzh tzhVar) {
        synchronized (this.messageListenersLock) {
            this.messageListeners.remove(tzhVar);
        }
    }

    @NonNull
    public String send(@NonNull mdk mdkVar) throws shd {
        return sendImpl(mdkVar, null);
    }

    @Override // defpackage.gj6
    @NonNull
    public u3o sendSync(@NonNull mdk mdkVar, long j, @NonNull TimeUnit timeUnit) throws shd, InterruptedException, ExecutionException, TimeoutException {
        final bv2 bv2Var = new bv2();
        sendImpl(mdkVar, new t3o() { // from class: ij6
            @Override // defpackage.t3o
            public final void onMessage(u3o u3oVar) {
                bv2 bv2Var2 = bv2.this;
                synchronized (bv2Var2) {
                    try {
                        if (bv2Var2.a) {
                            return;
                        }
                        bv2Var2.a = true;
                        bv2Var2.c = u3oVar;
                        bv2Var2.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        return (u3o) bv2Var.get(j, timeUnit);
    }

    @Override // defpackage.gj6
    @NonNull
    public String send(@NonNull mdk mdkVar, t3o t3oVar) throws shd {
        return sendImpl(mdkVar, t3oVar);
    }

    public static class SentMessageWrapper {

        @SerializedName("conversationToken")
        private final String conversationToken;

        @SerializedName(ConnectableDevice.KEY_ID)
        private final String id;

        @SerializedName("payload")
        private final mdk payload;

        @SerializedName("sentTime")
        private final long sentTime;

        public SentMessageWrapper(mdk mdkVar, String str) {
            this.id = UUID.randomUUID().toString();
            this.sentTime = System.currentTimeMillis();
            this.payload = mdkVar;
            this.conversationToken = str;
        }

        public SentMessageWrapper copy(boolean z) {
            return new SentMessageWrapper(this.id, this.payload, this.sentTime, z ? this.conversationToken : "...");
        }

        public String getConversationToken() {
            return this.conversationToken;
        }

        public String getId() {
            return this.id;
        }

        public mdk getPayload() {
            return this.payload;
        }

        public long getSentTime() {
            return this.sentTime;
        }

        private SentMessageWrapper(String str, mdk mdkVar, long j, String str2) {
            this.id = str;
            this.sentTime = j;
            this.payload = mdkVar;
            this.conversationToken = str2;
        }
    }
}
