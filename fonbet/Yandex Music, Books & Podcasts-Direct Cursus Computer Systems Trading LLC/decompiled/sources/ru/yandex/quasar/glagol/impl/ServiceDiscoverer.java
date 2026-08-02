package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.connectsdk.discovery.provider.ssdp.Service;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.k5r;
import defpackage.p46;
import defpackage.weo;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.impl.NsdServiceResolver;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000245B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001d\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f00j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/yandex/quasar/glagol/impl/ServiceDiscoverer;", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;", "Landroid/content/Context;", "context", "Lp46;", DeviceService.KEY_CONFIG, "Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;", "nsdCommandsProcessor", "Lru/yandex/quasar/glagol/impl/ServiceDiscoverer$Listener;", "listener", "<init>", "(Landroid/content/Context;Lp46;Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;Lru/yandex/quasar/glagol/impl/ServiceDiscoverer$Listener;)V", "Landroid/net/nsd/NsdServiceInfo;", "serviceInfo", "", "isResolving", "", "markResolving", "(Landroid/net/nsd/NsdServiceInfo;Z)V", "isMarkedResolving", "(Landroid/net/nsd/NsdServiceInfo;)Z", "start", "()V", "stop", "", Service.TAG_SERVICE_TYPE, "", "errorCode", "onStartDiscoveryFailed", "(Ljava/lang/String;I)V", "onStopDiscoveryFailed", "onDiscoveryStarted", "(Ljava/lang/String;)V", "onDiscoveryStopped", "onServiceFound", "(Landroid/net/nsd/NsdServiceInfo;)V", "onServiceLost", "onResolveSuccess", "errCode", "onResolveFail", "(Landroid/net/nsd/NsdServiceInfo;I)V", "Lp46;", "Lru/yandex/quasar/glagol/impl/NsdCommandsProcessor;", "Lru/yandex/quasar/glagol/impl/ServiceDiscoverer$Listener;", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver;", "nsdServiceResolver", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "resolvingDevicesMap", "Ljava/util/HashMap;", "Companion", "Listener", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ServiceDiscoverer implements NsdManager.DiscoveryListener, NsdServiceResolver.Listener {

    @NotNull
    public static final String TAG = "DeviceDiscoverer";

    @NotNull
    private final p46 config;

    @NotNull
    private final Listener listener;

    @NotNull
    private final NsdCommandsProcessor nsdCommandsProcessor;

    @NotNull
    private final NsdServiceResolver nsdServiceResolver;

    @NotNull
    private final HashMap<String, Boolean> resolvingDevicesMap;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lru/yandex/quasar/glagol/impl/ServiceDiscoverer$Listener;", "", "onDiscoveryFailed", "", "wasStarting", "", "errorCode", "", "onServiceFound", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "onServiceLost", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface Listener {
        void onDiscoveryFailed(boolean wasStarting, int errorCode);

        void onServiceFound(@NotNull NsdServiceInfo serviceInfo);

        void onServiceLost(@NotNull NsdServiceInfo serviceInfo);
    }

    public ServiceDiscoverer(@NotNull Context context, @NotNull p46 p46Var, @NotNull NsdCommandsProcessor nsdCommandsProcessor, @NotNull Listener listener) {
        context.getClass();
        p46Var.getClass();
        nsdCommandsProcessor.getClass();
        listener.getClass();
        this.config = p46Var;
        this.nsdCommandsProcessor = nsdCommandsProcessor;
        this.listener = listener;
        this.nsdServiceResolver = new NsdServiceResolver(context, p46Var, this);
        this.resolvingDevicesMap = new HashMap<>();
    }

    private final synchronized boolean isMarkedResolving(NsdServiceInfo serviceInfo) {
        Boolean bool;
        bool = this.resolvingDevicesMap.get(serviceInfo.getServiceName());
        return bool == null ? false : bool.booleanValue();
    }

    private final synchronized void markResolving(NsdServiceInfo serviceInfo, boolean isResolving) {
        HashMap<String, Boolean> hashMap = this.resolvingDevicesMap;
        String serviceName = serviceInfo.getServiceName();
        serviceName.getClass();
        hashMap.put(serviceName, Boolean.valueOf(isResolving));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(String serviceType) {
        weo.p(TAG, "onDiscoveryStarted", new Object[0]);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(String serviceType) {
        weo.p(TAG, "onDiscoveryStopped", new Object[0]);
    }

    @Override // ru.yandex.quasar.glagol.impl.NsdServiceResolver.Listener
    public void onResolveFail(@NotNull NsdServiceInfo serviceInfo, int errCode) {
        serviceInfo.getClass();
        if (isMarkedResolving(serviceInfo)) {
            markResolving(serviceInfo, false);
        }
    }

    @Override // ru.yandex.quasar.glagol.impl.NsdServiceResolver.Listener
    public void onResolveSuccess(@NotNull NsdServiceInfo serviceInfo) {
        serviceInfo.getClass();
        weo.p(TAG, "resolved " + serviceInfo, new Object[0]);
        if (isMarkedResolving(serviceInfo)) {
            markResolving(serviceInfo, false);
            this.listener.onServiceFound(serviceInfo);
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(NsdServiceInfo serviceInfo) {
        weo.p(TAG, "onServiceFound " + serviceInfo, new Object[0]);
        if (serviceInfo != null) {
            String serviceName = serviceInfo.getServiceName();
            serviceName.getClass();
            this.config.getClass();
            if (c.v(serviceName, "YandexIOReceiver-", false)) {
                markResolving(serviceInfo, true);
                this.nsdServiceResolver.resolve(serviceInfo);
            }
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(NsdServiceInfo serviceInfo) {
        weo.p(TAG, "onServiceLost " + serviceInfo, new Object[0]);
        if (serviceInfo != null) {
            markResolving(serviceInfo, false);
            this.listener.onServiceLost(serviceInfo);
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(String serviceType, int errorCode) {
        weo.r(TAG, k5r.i(errorCode, "onStartDiscoveryFailed errCode="), new Object[0]);
        this.listener.onDiscoveryFailed(true, errorCode);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(String serviceType, int errorCode) {
        weo.r(TAG, k5r.i(errorCode, "onStopDiscoveryFailed errCode="), new Object[0]);
        this.listener.onDiscoveryFailed(false, errorCode);
    }

    public final void start() {
        this.nsdCommandsProcessor.start(this);
    }

    public final void stop() throws IOException {
        this.nsdCommandsProcessor.stop(this);
    }
}
