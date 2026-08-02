package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import defpackage.a4i;
import defpackage.au1;
import defpackage.ern;
import defpackage.i08;
import defpackage.ij2;
import defpackage.k5r;
import defpackage.o6n;
import defpackage.ouj;
import defpackage.p46;
import defpackage.s68;
import defpackage.t68;
import defpackage.u68;
import defpackage.v68;
import defpackage.w3i;
import defpackage.xd0;
import defpackage.z6u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.backend.model.DevicesMap;
import ru.yandex.quasar.glagol.impl.DevicesListTask;
import ru.yandex.quasar.glagol.impl.ServiceDiscoverer;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u00100J\u001f\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u00060BR\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/yandex/quasar/glagol/impl/DiscoveryImplV2;", "Ls68;", "Lru/yandex/quasar/glagol/impl/DevicesListTask$ResultListener;", "Lru/yandex/quasar/glagol/impl/ServiceDiscoverer$Listener;", "Lp46;", DeviceService.KEY_CONFIG, "Landroid/content/Context;", "appContext", "", "token", "Lt68;", "discoveryListener", "Lij2;", "backendOkHttpClient", "", "filterAccountDevices", "La4i;", "reporter", "Lru/yandex/quasar/glagol/impl/DevicesListTask;", "quasarDevicesTask", "<init>", "(Lp46;Landroid/content/Context;Ljava/lang/String;Lt68;Lij2;ZLa4i;Lru/yandex/quasar/glagol/impl/DevicesListTask;)V", "", "closeImpl", "()V", "processServices", "notifyListeners", "Landroid/net/nsd/NsdServiceInfo;", "serviceInfo", "isYandexDevice", "(Landroid/net/nsd/NsdServiceInfo;)Z", "close", "Lu68;", "getResult", "()Lu68;", "listener", "addListener", "(Lt68;)V", "removeListener", "Li08;", "deviceId", "deviceIdAccessible", "(Li08;)Z", "Lru/yandex/quasar/glagol/backend/model/DevicesMap;", "deviceMap", "onBackendDevicesResolved", "(Lru/yandex/quasar/glagol/backend/model/DevicesMap;)V", "onServiceFound", "(Landroid/net/nsd/NsdServiceInfo;)V", "onServiceLost", "wasStarting", "", "errorCode", "onDiscoveryFailed", "(ZI)V", "Lp46;", "Z", "Lru/yandex/quasar/glagol/impl/ServiceDiscoverer;", "deviceDiscoverer", "Lru/yandex/quasar/glagol/impl/ServiceDiscoverer;", "", "discoveryListenersLock", "Ljava/lang/Object;", "", "discoveryListeners", "Ljava/util/List;", "Landroid/net/wifi/WifiManager$MulticastLock;", "Landroid/net/wifi/WifiManager;", "multicastLock", "Landroid/net/wifi/WifiManager$MulticastLock;", "Lru/yandex/quasar/glagol/impl/DiscoveryResultImpl;", CameraService.RESULT, "Lru/yandex/quasar/glagol/impl/DiscoveryResultImpl;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "pendingServices", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "userDevicesTask", "Lru/yandex/quasar/glagol/impl/DevicesListTask;", "userDevices", "Lru/yandex/quasar/glagol/backend/model/DevicesMap;", "Lw3i;", "discoveryReporter", "Lw3i;", "Companion", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DiscoveryImplV2 implements s68, DevicesListTask.ResultListener, ServiceDiscoverer.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DiscoveryImplV2";
    private static NsdCommandsProcessor nsdCommandsProcessorInstance;

    @NotNull
    private final p46 config;

    @NotNull
    private final ServiceDiscoverer deviceDiscoverer;

    @NotNull
    private final List<t68> discoveryListeners;

    @NotNull
    private final Object discoveryListenersLock;

    @NotNull
    private final w3i discoveryReporter;
    private final boolean filterAccountDevices;

    @NotNull
    private final WifiManager.MulticastLock multicastLock;

    @NotNull
    private final ConcurrentLinkedQueue<NsdServiceInfo> pendingServices;

    @NotNull
    private final DiscoveryResultImpl result;

    @NotNull
    private DevicesMap userDevices;

    @NotNull
    private final DevicesListTask userDevicesTask;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/quasar/glagol/impl/DiscoveryImplV2$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lp46;", DeviceService.KEY_CONFIG, "Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;", "getNsdCommandsProcessor", "(Landroid/content/Context;Lp46;)Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;", "", "TAG", "Ljava/lang/String;", "nsdCommandsProcessorInstance", "Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NsdCommandsProcessor getNsdCommandsProcessor(@NotNull Context context, @NotNull p46 config) {
            context.getClass();
            config.getClass();
            if (DiscoveryImplV2.nsdCommandsProcessorInstance == null) {
                synchronized (ern.a(NsdCommandsProcessor.class)) {
                    if (DiscoveryImplV2.nsdCommandsProcessorInstance == null) {
                        DiscoveryImplV2.nsdCommandsProcessorInstance = new NsdCommandsProcessor(context, config);
                    }
                }
            }
            NsdCommandsProcessor nsdCommandsProcessor = DiscoveryImplV2.nsdCommandsProcessorInstance;
            nsdCommandsProcessor.getClass();
            return nsdCommandsProcessor;
        }

        private Companion() {
        }
    }

    public DiscoveryImplV2(@NotNull p46 p46Var, @NotNull Context context, @NotNull String str, @NotNull t68 t68Var, @NotNull ij2 ij2Var, boolean z, @NotNull a4i a4iVar, DevicesListTask devicesListTask) {
        DiscoveryImplV2 discoveryImplV2;
        p46Var.getClass();
        context.getClass();
        str.getClass();
        t68Var.getClass();
        ij2Var.getClass();
        a4iVar.getClass();
        this.config = p46Var;
        this.filterAccountDevices = z;
        ServiceDiscoverer serviceDiscoverer = new ServiceDiscoverer(context, p46Var, INSTANCE.getNsdCommandsProcessor(context, p46Var), this);
        this.deviceDiscoverer = serviceDiscoverer;
        Object obj = new Object();
        this.discoveryListenersLock = obj;
        ArrayList arrayList = new ArrayList();
        this.discoveryListeners = arrayList;
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        systemService.getClass();
        WifiManager.MulticastLock createMulticastLock = ((WifiManager) systemService).createMulticastLock(TAG);
        createMulticastLock.getClass();
        this.multicastLock = createMulticastLock;
        this.result = new DiscoveryResultImpl();
        this.pendingServices = new ConcurrentLinkedQueue<>();
        this.userDevices = new DevicesMap();
        synchronized (obj) {
            arrayList.add(t68Var);
        }
        createMulticastLock.setReferenceCounted(false);
        createMulticastLock.acquire();
        this.discoveryReporter = new w3i(context, p46Var, a4iVar);
        if (devicesListTask != null) {
            devicesListTask.addListener(this);
            discoveryImplV2 = this;
        } else {
            discoveryImplV2 = this;
            devicesListTask = new DevicesListTask(p46Var, new o6n(ij2Var, a4iVar), str, discoveryImplV2, a4iVar);
        }
        discoveryImplV2.userDevicesTask = devicesListTask;
        serviceDiscoverer.start();
    }

    private final void closeImpl() throws IOException {
        this.deviceDiscoverer.stop();
        this.multicastLock.release();
        w3i w3iVar = this.discoveryReporter;
        z6u z6uVar = w3iVar.c;
        ((ConnectivityManager) z6uVar.b).unregisterNetworkCallback((xd0) z6uVar.d);
        z6uVar.c = null;
        ((ConcurrentHashMap) w3iVar.b.c).clear();
        synchronized (this.discoveryListenersLock) {
            this.discoveryListeners.clear();
        }
    }

    private final boolean isYandexDevice(NsdServiceInfo serviceInfo) {
        String serviceType = serviceInfo.getServiceType();
        serviceType.getClass();
        this.config.getClass();
        if (!StringsKt.M(serviceType, "_yandexio._tcp.", false)) {
            String n = ouj.n(serviceInfo.getServiceType(), ".");
            this.config.getClass();
            if (!StringsKt.M(n, "_yandexio._tcp.", false)) {
                this.config.getClass();
                return false;
            }
        }
        String serviceName = serviceInfo.getServiceName();
        serviceName.getClass();
        this.config.getClass();
        if (c.v(serviceName, "YandexIOReceiver-", false)) {
            return true;
        }
        this.config.getClass();
        return false;
    }

    private final void notifyListeners() {
        u68 result = getResult();
        synchronized (this.discoveryListenersLock) {
            Iterator<T> it = this.discoveryListeners.iterator();
            while (it.hasNext()) {
                ((t68) it.next()).onDiscoveryResults(result);
            }
        }
    }

    private final void processServices() {
        while (!this.pendingServices.isEmpty()) {
            NsdServiceInfo poll = this.pendingServices.poll();
            if (poll != null) {
                try {
                    v68 discoveryResultItem = DiscoveryResultFactory.toDiscoveryResultItem(poll, this.userDevices);
                    if (discoveryResultItem != null) {
                        this.config.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        w3i w3iVar = this.discoveryReporter;
                        w3iVar.getClass();
                        a4i a4iVar = w3iVar.a;
                        au1 au1Var = w3iVar.b;
                        au1Var.getClass();
                        String serviceName = discoveryResultItem.getServiceName();
                        serviceName.getClass();
                        long I = au1Var.I(serviceName);
                        a4iVar.getClass();
                        JsonObject i = a4iVar.i();
                        a4i.b(i, I, currentTimeMillis);
                        a4i.a(i, discoveryResultItem);
                        a4iVar.a.T("DiscoveryMdnsSuccess", i);
                        if (this.filterAccountDevices && !discoveryResultItem.isAccessible()) {
                        }
                        this.result.addItem(poll.getServiceName(), discoveryResultItem);
                        if (discoveryResultItem.isAccessible()) {
                            w3i w3iVar2 = this.discoveryReporter;
                            w3iVar2.getClass();
                            a4i a4iVar2 = w3iVar2.a;
                            au1 au1Var2 = w3iVar2.b;
                            au1Var2.getClass();
                            String serviceName2 = discoveryResultItem.getServiceName();
                            serviceName2.getClass();
                            long I2 = au1Var2.I(serviceName2);
                            a4iVar2.getClass();
                            JsonObject i2 = a4iVar2.i();
                            a4i.b(i2, I2, currentTimeMillis);
                            a4i.a(i2, discoveryResultItem);
                            a4iVar2.a.T("DiscoveryAccountCheckSuccess", i2);
                        }
                    }
                } catch (Exception e) {
                    w3i w3iVar3 = this.discoveryReporter;
                    String serviceName3 = poll.getServiceName();
                    serviceName3.getClass();
                    w3iVar3.getClass();
                    w3iVar3.a.f(serviceName3, w3iVar3.b.I(serviceName3), System.currentTimeMillis(), e);
                }
            }
        }
        notifyListeners();
    }

    public void addListener(@NotNull t68 listener) {
        listener.getClass();
        synchronized (this.discoveryListenersLock) {
            this.discoveryListeners.add(listener);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        w3i w3iVar = this.discoveryReporter;
        Collection<v68> discoveredItems = this.result.getDiscoveredItems();
        discoveredItems.getClass();
        w3iVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        a4i a4iVar = w3iVar.a;
        long j = w3iVar.b.b;
        a4iVar.getClass();
        JsonObject i = a4iVar.i();
        a4i.b(i, j, currentTimeMillis);
        JsonArray jsonArray = new JsonArray();
        Iterator<T> it = discoveredItems.iterator();
        while (it.hasNext()) {
            jsonArray.r(a4i.c((v68) it.next()));
        }
        i.r(DefaultConnectableDeviceStore.KEY_DEVICES, jsonArray);
        a4iVar.a.T("DiscoveryStopSearching", i);
        closeImpl();
    }

    public boolean deviceIdAccessible(@NotNull i08 deviceId) {
        deviceId.getClass();
        return this.userDevices.containsKey((Object) deviceId);
    }

    @NotNull
    public u68 getResult() {
        DiscoveryResultImpl discoveryResultImpl = new DiscoveryResultImpl();
        discoveryResultImpl.replace(this.result);
        return discoveryResultImpl;
    }

    @Override // ru.yandex.quasar.glagol.impl.DevicesListTask.ResultListener
    public void onBackendDevicesResolved(@NotNull DevicesMap deviceMap) {
        deviceMap.getClass();
        this.userDevices = deviceMap;
        processServices();
    }

    @Override // ru.yandex.quasar.glagol.impl.ServiceDiscoverer.Listener
    public void onDiscoveryFailed(boolean wasStarting, int errorCode) {
        try {
            closeImpl();
        } catch (Exception unused) {
        }
        IllegalStateException illegalStateException = new IllegalStateException(k5r.l("Failed to ", errorCode, wasStarting ? "start" : "stop", " discovery with code "));
        w3i w3iVar = this.discoveryReporter;
        w3iVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        a4i a4iVar = w3iVar.a;
        long j = w3iVar.b.b;
        a4iVar.getClass();
        a4iVar.f("AndroidNsdSystemService", j, currentTimeMillis, illegalStateException);
        synchronized (this.discoveryListenersLock) {
            Iterator<T> it = this.discoveryListeners.iterator();
            while (it.hasNext()) {
                ((t68) it.next()).onDiscoveryFailed(errorCode);
            }
        }
    }

    @Override // ru.yandex.quasar.glagol.impl.ServiceDiscoverer.Listener
    public void onServiceFound(@NotNull NsdServiceInfo serviceInfo) {
        serviceInfo.getClass();
        if (isYandexDevice(serviceInfo)) {
            this.config.getClass();
            this.pendingServices.add(serviceInfo);
            if (this.userDevicesTask.hasFinished()) {
                processServices();
            } else {
                if (this.userDevicesTask.hasStarted()) {
                    return;
                }
                this.userDevicesTask.start();
            }
        }
    }

    @Override // ru.yandex.quasar.glagol.impl.ServiceDiscoverer.Listener
    public void onServiceLost(@NotNull NsdServiceInfo serviceInfo) {
        serviceInfo.getClass();
        this.config.getClass();
        this.pendingServices.remove(serviceInfo);
        v68 removeItem = this.result.removeItem(serviceInfo.getServiceName());
        if (removeItem != null) {
            w3i w3iVar = this.discoveryReporter;
            au1 au1Var = w3iVar.b;
            long currentTimeMillis = System.currentTimeMillis();
            a4i a4iVar = w3iVar.a;
            au1Var.getClass();
            String serviceName = removeItem.getServiceName();
            serviceName.getClass();
            long I = au1Var.I(serviceName);
            a4iVar.getClass();
            JsonObject i = a4iVar.i();
            a4i.b(i, I, currentTimeMillis);
            i.r("device", a4i.c(removeItem));
            a4iVar.a.T("DiscoveryMdnsDisappear", i);
            String serviceName2 = removeItem.getServiceName();
            serviceName2.getClass();
            ((ConcurrentHashMap) au1Var.c).put(serviceName2, Long.valueOf(currentTimeMillis));
        }
        notifyListeners();
    }

    public void removeListener(@NotNull t68 listener) {
        listener.getClass();
        synchronized (this.discoveryListenersLock) {
            this.discoveryListeners.remove(listener);
        }
    }

    public /* synthetic */ DiscoveryImplV2(p46 p46Var, Context context, String str, t68 t68Var, ij2 ij2Var, boolean z, a4i a4iVar, DevicesListTask devicesListTask, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(p46Var, context, str, t68Var, ij2Var, z, a4iVar, (i & 128) != 0 ? null : devicesListTask);
    }
}
