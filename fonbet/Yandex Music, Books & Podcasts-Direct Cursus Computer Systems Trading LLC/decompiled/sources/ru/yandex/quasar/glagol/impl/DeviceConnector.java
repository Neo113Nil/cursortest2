package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dzh;
import defpackage.etn;
import defpackage.gj6;
import defpackage.h08;
import defpackage.hj6;
import defpackage.i08;
import defpackage.jt6;
import defpackage.khd;
import defpackage.mdg;
import defpackage.ssg;
import defpackage.tzh;
import defpackage.v68;
import defpackage.v75;
import defpackage.w56;
import defpackage.weo;
import defpackage.zi3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.DeviceConnectionListener$State;
import ru.yandex.quasar.glagol.impl.ConversationImpl;
import ru.yandex.quasar.glagol.impl.LiveConnectionImpl;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 +2\u00020\u0001:\u0005+,-./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\b\u0012\u00060%R\u00020\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, d2 = {"Lru/yandex/quasar/glagol/impl/DeviceConnector;", "", "Landroid/content/Context;", "appContext", "Lru/yandex/quasar/glagol/impl/ConnectorImpl;", "connector", "", "token", "Lw56;", "externalListener", "<init>", "(Landroid/content/Context;Lru/yandex/quasar/glagol/impl/ConnectorImpl;Ljava/lang/String;Lw56;)V", "", "Lv68;", DefaultConnectableDeviceStore.KEY_DEVICES, "", "addDevices", "(Ljava/util/Collection;)V", "", "Lmdg;", "getActiveConnections", "()Ljava/util/List;", "liveConnection", "notifyDeviceConnected", "(Lmdg;)V", "notifyActiveConnections", "()V", "Landroid/content/Context;", "Lru/yandex/quasar/glagol/impl/ConnectorImpl;", "Ljava/lang/String;", "Lw56;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap;", "Li08;", "Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceConnectionController;", "connections", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/yandex/quasar/glagol/impl/ConversationImpl$Config;", "connectionConfig", "Lru/yandex/quasar/glagol/impl/ConversationImpl$Config;", "Companion", "ConversationEstablishListener", "ConversationStarter", "DeviceConnectionController", "DeviceUrl", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DeviceConnector {

    @NotNull
    public static final String TAG = "DeviceConnector";

    @NotNull
    private final Context appContext;
    private final ConversationImpl.Config connectionConfig;

    @NotNull
    private final ConcurrentHashMap<i08, DeviceConnectionController> connections;

    @NotNull
    private final ConnectorImpl connector;
    private final ExecutorService executor;

    @NotNull
    private final w56 externalListener;

    @NotNull
    private final String token;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;", "", "Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "url", "Lhj6;", "conversation", "", "onConversationEstablished", "(Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;Lhj6;)V", "onConversationFailed", "(Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;)V", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface ConversationEstablishListener {
        void onConversationEstablished(@NotNull DeviceUrl url, @NotNull hj6 conversation);

        void onConversationFailed(@NotNull DeviceUrl url);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\u0018R\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceConnectionController;", "Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;", "Li08;", "deviceId", "<init>", "(Lru/yandex/quasar/glagol/impl/DeviceConnector;Li08;)V", "Lv68;", "item", "", "addConnectionVariant", "(Lv68;)V", "Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "url", "Lhj6;", "conversation", "onConversationEstablished", "(Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;Lhj6;)V", "onConversationFailed", "(Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;)V", "requestReconnect", "()V", "Li08;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationStarter;", "Lru/yandex/quasar/glagol/impl/DeviceConnector;", "urls", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isReconnecting", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl;", "liveConnection", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl;", "getLiveConnection", "()Lru/yandex/quasar/glagol/impl/LiveConnectionImpl;", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public final class DeviceConnectionController implements ConversationEstablishListener, LiveConnectionImpl.ReconnectionDelegate {

        @NotNull
        private final i08 deviceId;

        @NotNull
        private final AtomicBoolean isConnected;

        @NotNull
        private final AtomicBoolean isReconnecting;

        @NotNull
        private final LiveConnectionImpl liveConnection;
        final /* synthetic */ DeviceConnector this$0;

        @NotNull
        private final ConcurrentHashMap<DeviceUrl, ConversationStarter> urls;

        public DeviceConnectionController(@NotNull DeviceConnector deviceConnector, i08 i08Var) {
            i08Var.getClass();
            this.this$0 = deviceConnector;
            this.deviceId = i08Var;
            this.urls = new ConcurrentHashMap<>();
            this.isConnected = new AtomicBoolean(false);
            this.isReconnecting = new AtomicBoolean(false);
            this.liveConnection = new LiveConnectionImpl(i08Var, this);
        }

        public final void addConnectionVariant(@NotNull v68 item) {
            item.getClass();
            weo.p(DeviceConnector.TAG, "Check for " + item, new Object[0]);
            DeviceUrl deviceUrl = new DeviceUrl(item);
            ConcurrentHashMap<DeviceUrl, ConversationStarter> concurrentHashMap = this.urls;
            DeviceConnector deviceConnector = this.this$0;
            ConversationStarter conversationStarter = concurrentHashMap.get(deviceUrl);
            if (conversationStarter == null) {
                weo.p(DeviceConnector.TAG, "Create for " + item, new Object[0]);
                ConversationStarter conversationStarter2 = new ConversationStarter(deviceConnector, deviceUrl, item, this);
                ConversationStarter putIfAbsent = concurrentHashMap.putIfAbsent(deviceUrl, conversationStarter2);
                conversationStarter = putIfAbsent == null ? conversationStarter2 : putIfAbsent;
            }
            ConversationStarter conversationStarter3 = conversationStarter;
            if (this.isConnected.get()) {
                return;
            }
            conversationStarter3.connect();
        }

        @NotNull
        public final LiveConnectionImpl getLiveConnection() {
            return this.liveConnection;
        }

        @NotNull
        /* renamed from: isConnected, reason: from getter */
        public final AtomicBoolean getIsConnected() {
            return this.isConnected;
        }

        @Override // ru.yandex.quasar.glagol.impl.DeviceConnector.ConversationEstablishListener
        public void onConversationEstablished(@NotNull DeviceUrl url, @NotNull hj6 conversation) {
            url.getClass();
            conversation.getClass();
            weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " New established conversation " + url, new Object[0]);
            if (!this.isReconnecting.get() && !this.isConnected.compareAndSet(false, true)) {
                weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " already connected. Drop conversation for " + url, new Object[0]);
                conversation.close();
                return;
            }
            weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " Set as main conversation " + url, new Object[0]);
            boolean andSet = this.isReconnecting.getAndSet(false);
            this.liveConnection.replaceConversation$glagol_sdk_release(conversation);
            if (!andSet) {
                this.this$0.notifyDeviceConnected(this.liveConnection);
            }
            for (Map.Entry<DeviceUrl, ConversationStarter> entry : this.urls.entrySet()) {
                if (!Intrinsics.d(entry.getKey(), url)) {
                    entry.getValue().disconnect();
                }
            }
        }

        @Override // ru.yandex.quasar.glagol.impl.DeviceConnector.ConversationEstablishListener
        public void onConversationFailed(@NotNull DeviceUrl url) {
            url.getClass();
            weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " Failed to start conversation " + url, new Object[0]);
            Collection<ConversationStarter> values = this.urls.values();
            values.getClass();
            Collection<ConversationStarter> collection = values;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((ConversationStarter) it.next()).getStartedStatus().get()) {
                        return;
                    }
                }
            }
            weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " No other conversation initiated. Mark device as unavailable", new Object[0]);
            this.isReconnecting.set(false);
            this.isConnected.set(false);
            this.this$0.notifyActiveConnections();
        }

        @Override // ru.yandex.quasar.glagol.impl.LiveConnectionImpl.ReconnectionDelegate
        public void requestReconnect() {
            if (this.isReconnecting.get() || !this.isConnected.get()) {
                weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " Requesting reconnect", new Object[0]);
                Collection<ConversationStarter> values = this.urls.values();
                values.getClass();
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    ((ConversationStarter) it.next()).connect();
                }
                return;
            }
            weo.p(DeviceConnector.TAG, "DID=" + this.deviceId + " Reconnect request denied. CConnected=" + this.isConnected.get() + " reconnecting=" + this.isReconnecting.get(), new Object[0]);
        }
    }

    public DeviceConnector(@NotNull Context context, @NotNull ConnectorImpl connectorImpl, @NotNull String str, @NotNull w56 w56Var) {
        context.getClass();
        connectorImpl.getClass();
        str.getClass();
        w56Var.getClass();
        this.appContext = context;
        this.connector = connectorImpl;
        this.token = str;
        this.externalListener = w56Var;
        this.executor = Executors.newCachedThreadPool();
        this.connections = new ConcurrentHashMap<>();
        this.connectionConfig = ConversationImpl.Config.from(connectorImpl.config);
    }

    public final void addDevices(@NotNull Collection<? extends v68> devices) {
        devices.getClass();
        for (v68 v68Var : devices) {
            weo.p(TAG, "add " + v68Var.getURI() + StringUtil.SPACE + v68Var.getId(), new Object[0]);
            ConcurrentHashMap<i08, DeviceConnectionController> concurrentHashMap = this.connections;
            i08 id = v68Var.getId();
            DeviceConnectionController deviceConnectionController = concurrentHashMap.get(id);
            if (deviceConnectionController == null) {
                weo.p(TAG, "create controller for " + v68Var.getId(), new Object[0]);
                i08 id2 = v68Var.getId();
                id2.getClass();
                DeviceConnectionController deviceConnectionController2 = new DeviceConnectionController(this, id2);
                DeviceConnectionController putIfAbsent = concurrentHashMap.putIfAbsent(id, deviceConnectionController2);
                deviceConnectionController = putIfAbsent == null ? deviceConnectionController2 : putIfAbsent;
            }
            deviceConnectionController.addConnectionVariant(v68Var);
        }
    }

    @NotNull
    public final synchronized List<mdg> getActiveConnections() {
        ArrayList arrayList;
        try {
            Collection<DeviceConnectionController> values = this.connections.values();
            values.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : values) {
                if (((DeviceConnectionController) obj).getIsConnected().get()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(v75.o(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((DeviceConnectionController) it.next()).getLiveConnection());
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void notifyActiveConnections() {
        w56 w56Var = this.externalListener;
        List<mdg> activeConnections = getActiveConnections();
        khd khdVar = (khd) w56Var;
        khdVar.getClass();
        activeConnections.getClass();
        zi3 zi3Var = khdVar.a;
        if (zi3Var.B()) {
            ssg.a(5, null, "glagol delivered result, but channels are closed", null);
        } else {
            ssg.a(3, null, "glagol delivered result to discovery", null);
            etn.k0(zi3Var, activeConnections);
        }
    }

    public final synchronized void notifyDeviceConnected(@NotNull mdg liveConnection) {
        liveConnection.getClass();
        ((khd) this.externalListener).getClass();
        liveConnection.getClass();
        notifyActiveConnections();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "", "Li08;", "deviceId", "Ljava/net/URI;", "uri", "<init>", "(Li08;Ljava/net/URI;)V", "Lv68;", "dri", "(Lv68;)V", "component1", "()Li08;", "component2", "()Ljava/net/URI;", "copy", "(Li08;Ljava/net/URI;)Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li08;", "getDeviceId", "Ljava/net/URI;", "getUri", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class DeviceUrl {

        @NotNull
        private final i08 deviceId;

        @NotNull
        private final URI uri;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DeviceUrl(@NotNull v68 v68Var) {
            this(r0, r2);
            v68Var.getClass();
            i08 id = v68Var.getId();
            id.getClass();
            URI uri = v68Var.getURI();
            uri.getClass();
        }

        public static /* synthetic */ DeviceUrl copy$default(DeviceUrl deviceUrl, i08 i08Var, URI uri, int i, Object obj) {
            if ((i & 1) != 0) {
                i08Var = deviceUrl.deviceId;
            }
            if ((i & 2) != 0) {
                uri = deviceUrl.uri;
            }
            return deviceUrl.copy(i08Var, uri);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final i08 getDeviceId() {
            return this.deviceId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final URI getUri() {
            return this.uri;
        }

        @NotNull
        public final DeviceUrl copy(@NotNull i08 deviceId, @NotNull URI uri) {
            deviceId.getClass();
            uri.getClass();
            return new DeviceUrl(deviceId, uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceUrl)) {
                return false;
            }
            DeviceUrl deviceUrl = (DeviceUrl) other;
            return Intrinsics.d(this.deviceId, deviceUrl.deviceId) && Intrinsics.d(this.uri, deviceUrl.uri);
        }

        @NotNull
        public final i08 getDeviceId() {
            return this.deviceId;
        }

        @NotNull
        public final URI getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.deviceId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DeviceUrl(deviceId=" + this.deviceId + ", uri=" + this.uri + ")";
        }

        public DeviceUrl(@NotNull i08 i08Var, @NotNull URI uri) {
            i08Var.getClass();
            uri.getClass();
            this.deviceId = i08Var;
            this.uri = uri;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0016\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationStarter;", "Lh08;", "Ltzh;", "Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "deviceUrl", "Lv68;", "item", "Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;", "controller", "<init>", "(Lru/yandex/quasar/glagol/impl/DeviceConnector;Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;Lv68;Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;)V", "", "connect", "()V", "disconnect", "Ldzh;", Constants.KEY_MESSAGE, "onMessage", "(Ldzh;)V", "Li08;", "deviceId", "Lgj6;", "conversation", "Lru/yandex/quasar/glagol/DeviceConnectionListener$State;", "state", "onConnectionStateChanged", "(Li08;Lgj6;Lru/yandex/quasar/glagol/DeviceConnectionListener$State;)V", "Lru/yandex/quasar/glagol/impl/DeviceConnector$DeviceUrl;", "Lv68;", "getItem", "()Lv68;", "Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;", "getController", "()Lru/yandex/quasar/glagol/impl/DeviceConnector$ConversationEstablishListener;", "Lhj6;", "Lhj6;", "getConversation", "()Lhj6;", "setConversation", "(Lhj6;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "startedStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStartedStatus", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "connectedStatus", "", "TAG", "Ljava/lang/String;", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public final class ConversationStarter implements h08, tzh {

        @NotNull
        private final String TAG;

        @NotNull
        private final AtomicBoolean connectedStatus;

        @NotNull
        private final ConversationEstablishListener controller;
        private hj6 conversation;

        @NotNull
        private final DeviceUrl deviceUrl;

        @NotNull
        private final v68 item;

        @NotNull
        private final AtomicBoolean startedStatus;
        final /* synthetic */ DeviceConnector this$0;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DeviceConnectionListener$State.values().length];
                try {
                    iArr[DeviceConnectionListener$State.OPENED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceConnectionListener$State.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ConversationStarter(@NotNull DeviceConnector deviceConnector, @NotNull DeviceUrl deviceUrl, @NotNull v68 v68Var, ConversationEstablishListener conversationEstablishListener) {
            deviceUrl.getClass();
            v68Var.getClass();
            conversationEstablishListener.getClass();
            this.this$0 = deviceConnector;
            this.deviceUrl = deviceUrl;
            this.item = v68Var;
            this.controller = conversationEstablishListener;
            this.startedStatus = new AtomicBoolean(false);
            this.connectedStatus = new AtomicBoolean(false);
            this.TAG = "ConnStarter:" + deviceUrl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void connect$lambda$0(ConversationStarter conversationStarter, DeviceConnector deviceConnector) {
            ConversationStarter conversationStarter2;
            conversationStarter.getClass();
            deviceConnector.getClass();
            try {
                conversationStarter2 = conversationStarter;
                try {
                    conversationStarter2.conversation = deviceConnector.connector.connectImpl(conversationStarter.item, deviceConnector.token, null, deviceConnector.connectionConfig, conversationStarter2, conversationStarter, null, deviceConnector.appContext);
                } catch (Exception unused) {
                    conversationStarter2.conversation = null;
                    conversationStarter2.startedStatus.set(false);
                }
            } catch (Exception unused2) {
                conversationStarter2 = conversationStarter;
            }
        }

        public final void connect() {
            if (this.startedStatus.compareAndSet(false, true)) {
                this.this$0.executor.submit(new jt6(23, this, this.this$0));
            }
        }

        public final void disconnect() {
            hj6 hj6Var = this.conversation;
            if (hj6Var != null) {
                hj6Var.close();
            }
            this.conversation = null;
        }

        @NotNull
        public final ConversationEstablishListener getController() {
            return this.controller;
        }

        public final hj6 getConversation() {
            return this.conversation;
        }

        @NotNull
        public final v68 getItem() {
            return this.item;
        }

        @NotNull
        public final AtomicBoolean getStartedStatus() {
            return this.startedStatus;
        }

        @Override // defpackage.h08
        public void onConnectionStateChanged(@NotNull i08 deviceId, @NotNull gj6 conversation, @NotNull DeviceConnectionListener$State state) {
            deviceId.getClass();
            conversation.getClass();
            state.getClass();
            weo.p(this.TAG, "Conversation state=" + state + " for did=" + this.item.getId() + " addr=" + this.deviceUrl.getUri(), new Object[0]);
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                this.connectedStatus.set(true);
                hj6 hj6Var = this.conversation;
                if (hj6Var != null) {
                    this.controller.onConversationEstablished(this.deviceUrl, hj6Var);
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            this.conversation = null;
            this.connectedStatus.set(false);
            this.startedStatus.set(false);
            this.controller.onConversationFailed(this.deviceUrl);
        }

        public final void setConversation(hj6 hj6Var) {
            this.conversation = hj6Var;
        }

        @Override // defpackage.tzh
        public void onMessage(dzh message) {
        }
    }
}
