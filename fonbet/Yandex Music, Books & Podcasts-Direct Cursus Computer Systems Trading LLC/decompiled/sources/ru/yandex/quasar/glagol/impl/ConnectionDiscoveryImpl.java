package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4i;
import defpackage.ij2;
import defpackage.k5r;
import defpackage.khd;
import defpackage.mdg;
import defpackage.n3m;
import defpackage.o6n;
import defpackage.p46;
import defpackage.s68;
import defpackage.shd;
import defpackage.t68;
import defpackage.u68;
import defpackage.v56;
import defpackage.v68;
import defpackage.w0r;
import defpackage.w56;
import defpackage.weo;
import defpackage.x0r;
import defpackage.zvh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.backend.model.Device;
import ru.yandex.quasar.glagol.backend.model.DevicesMap;
import ru.yandex.quasar.glagol.backend.model.SmartDevice;
import ru.yandex.quasar.glagol.backend.model.SmarthomeResult;
import ru.yandex.quasar.glagol.impl.DevicesListTask;

@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001C\b\u0000\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00180<j\b\u0012\u0004\u0012\u00020\u0018`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/yandex/quasar/glagol/impl/ConnectionDiscoveryImpl;", "Lv56;", "Lru/yandex/quasar/glagol/impl/DevicesListTask$ResultListener;", "Lt68;", "Landroid/content/Context;", "appContext", "Lru/yandex/quasar/glagol/impl/ConnectorImpl;", "connector", "", "token", "Lw56;", "listener", "La4i;", "reporter", "<init>", "(Landroid/content/Context;Lru/yandex/quasar/glagol/impl/ConnectorImpl;Ljava/lang/String;Lw56;La4i;)V", "", "addListener", "(Lw56;)V", "removeListener", "", "Lmdg;", "getConnections", "()Ljava/util/List;", "Lru/yandex/quasar/glagol/backend/model/SmartDevice;", "getAccountDevices", "close", "()V", "Lru/yandex/quasar/glagol/backend/model/DevicesMap;", "deviceMap", "onBackendDevicesResolved", "(Lru/yandex/quasar/glagol/backend/model/DevicesMap;)V", "Lu68;", CameraService.RESULT, "onDiscoveryResults", "(Lu68;)V", "", "errorCode", "onDiscoveryFailed", "(I)V", "Landroid/content/Context;", "Lru/yandex/quasar/glagol/impl/ConnectorImpl;", "Ljava/lang/String;", "La4i;", "Lp46;", "kotlin.jvm.PlatformType", DeviceService.KEY_CONFIG, "Lp46;", "Lx0r;", "smarthomeResult", "Lx0r;", "Lru/yandex/quasar/glagol/impl/DevicesListTask;", "devicesListTask", "Lru/yandex/quasar/glagol/impl/DevicesListTask;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "listeners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ls68;", "discovery", "Ls68;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "accountDevices", "Ljava/util/ArrayList;", "Lru/yandex/quasar/glagol/impl/DeviceConnector;", "connectionHub", "Lru/yandex/quasar/glagol/impl/DeviceConnector;", "ru/yandex/quasar/glagol/impl/ConnectionDiscoveryImpl$smarthomeResultListener$1", "smarthomeResultListener", "Lru/yandex/quasar/glagol/impl/ConnectionDiscoveryImpl$smarthomeResultListener$1;", "Companion", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ConnectionDiscoveryImpl implements v56, DevicesListTask.ResultListener, t68 {

    @NotNull
    public static final String TAG = "ServDiscovery";

    @NotNull
    private final ArrayList<SmartDevice> accountDevices;

    @NotNull
    private final Context appContext;
    private final p46 config;

    @NotNull
    private final DeviceConnector connectionHub;

    @NotNull
    private final ConnectorImpl connector;

    @NotNull
    private final DevicesListTask devicesListTask;

    @NotNull
    private final s68 discovery;

    @NotNull
    private final ConcurrentLinkedQueue<w56> listeners;

    @NotNull
    private final a4i reporter;

    @NotNull
    private final x0r smarthomeResult;

    @NotNull
    private final ConnectionDiscoveryImpl$smarthomeResultListener$1 smarthomeResultListener;

    @NotNull
    private final String token;

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, ru.yandex.quasar.glagol.impl.ConnectionDiscoveryImpl$smarthomeResultListener$1] */
    public ConnectionDiscoveryImpl(@NotNull Context context, @NotNull ConnectorImpl connectorImpl, @NotNull String str, @NotNull w56 w56Var, @NotNull a4i a4iVar) {
        context.getClass();
        connectorImpl.getClass();
        str.getClass();
        w56Var.getClass();
        a4iVar.getClass();
        this.appContext = context;
        this.connector = connectorImpl;
        this.token = str;
        this.reporter = a4iVar;
        p46 p46Var = connectorImpl.config;
        this.config = p46Var;
        n3m n3mVar = new n3m(str, p46Var.b, a4iVar);
        this.smarthomeResult = n3mVar;
        DevicesListTask devicesListTask = new DevicesListTask(p46Var, new o6n(connectorImpl.backendOkHttpClient, a4iVar), str, this, a4iVar);
        this.devicesListTask = devicesListTask;
        this.listeners = new ConcurrentLinkedQueue<>();
        this.accountDevices = new ArrayList<>();
        this.connectionHub = new DeviceConnector(context, connectorImpl, str, w56Var);
        ?? r12 = new w0r() { // from class: ru.yandex.quasar.glagol.impl.ConnectionDiscoveryImpl$smarthomeResultListener$1
            @Override // defpackage.w0r
            public void onError(@NotNull Exception e) {
                ConcurrentLinkedQueue concurrentLinkedQueue;
                e.getClass();
                weo.s(ConnectionDiscoveryImpl.TAG, e, "Smarhomte exception " + e, new Object[0]);
                shd shdVar = new shd("Smarthome devices request error", e);
                concurrentLinkedQueue = ConnectionDiscoveryImpl.this.listeners;
                Iterator it = concurrentLinkedQueue.iterator();
                if (it.hasNext()) {
                    ((khd) ((w56) it.next())).getClass();
                    throw shdVar;
                }
            }

            @Override // defpackage.w0r
            public void onResult(@NotNull SmarthomeResult result) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ConcurrentLinkedQueue<w56> concurrentLinkedQueue;
                DevicesListTask devicesListTask2;
                result.getClass();
                weo.p(ConnectionDiscoveryImpl.TAG, "Smarthome result " + result.devices, new Object[0]);
                arrayList = ConnectionDiscoveryImpl.this.accountDevices;
                arrayList.clear();
                arrayList2 = ConnectionDiscoveryImpl.this.accountDevices;
                arrayList2.addAll(result.devices);
                arrayList3 = ConnectionDiscoveryImpl.this.accountDevices;
                if (!arrayList3.isEmpty()) {
                    devicesListTask2 = ConnectionDiscoveryImpl.this.devicesListTask;
                    devicesListTask2.start();
                }
                concurrentLinkedQueue = ConnectionDiscoveryImpl.this.listeners;
                for (w56 w56Var2 : concurrentLinkedQueue) {
                    List<SmartDevice> list = result.devices;
                    list.getClass();
                    ((khd) w56Var2).getClass();
                    list.getClass();
                }
            }
        };
        this.smarthomeResultListener = r12;
        Executors.newSingleThreadExecutor().execute(new zvh(25, n3mVar, (Object) r12));
        ij2 ij2Var = connectorImpl.backendOkHttpClient;
        ij2Var.getClass();
        this.discovery = new DiscoveryImplV2(p46Var, context, str, this, ij2Var, true, a4iVar, devicesListTask);
    }

    public void addListener(@NotNull w56 listener) {
        listener.getClass();
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.listeners.clear();
        this.discovery.close();
    }

    @NotNull
    public List<SmartDevice> getAccountDevices() {
        return new ArrayList(this.accountDevices);
    }

    @NotNull
    public List<mdg> getConnections() {
        return this.connectionHub.getActiveConnections();
    }

    @Override // ru.yandex.quasar.glagol.impl.DevicesListTask.ResultListener
    public void onBackendDevicesResolved(@NotNull DevicesMap deviceMap) {
        deviceMap.getClass();
        weo.p(TAG, "Quasar result " + deviceMap, new Object[0]);
        Collection<Device> values = deviceMap.values();
        values.getClass();
        for (Device device : values) {
            DeviceConnector deviceConnector = this.connectionHub;
            List<v68> serverResultItems = DiscoveryResultFactory.toServerResultItems(device);
            serverResultItems.getClass();
            deviceConnector.addDevices(serverResultItems);
        }
    }

    @Override // defpackage.t68
    public void onDiscoveryFailed(int errorCode) {
        weo.r(TAG, k5r.i(errorCode, "Discovery error code="), new Object[0]);
        shd shdVar = new shd(k5r.i(errorCode, "Discovery error: code="));
        Iterator<T> it = this.listeners.iterator();
        if (it.hasNext()) {
            ((khd) ((w56) it.next())).getClass();
            throw shdVar;
        }
    }

    @Override // defpackage.t68
    public void onDiscoveryResults(@NotNull u68 result) {
        result.getClass();
        weo.p(TAG, "Discovery res = " + result.getDiscoveredItems(), new Object[0]);
        DeviceConnector deviceConnector = this.connectionHub;
        Collection<? extends v68> discoveredItems = result.getDiscoveredItems();
        discoveredItems.getClass();
        deviceConnector.addDevices(discoveredItems);
    }

    public void removeListener(@NotNull w56 listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }
}
