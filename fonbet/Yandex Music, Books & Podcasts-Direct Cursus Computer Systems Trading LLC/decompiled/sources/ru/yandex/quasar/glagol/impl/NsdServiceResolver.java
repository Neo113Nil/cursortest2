package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.p46;
import defpackage.weo;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.impl.NsdServiceResolver;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001'\u0018\u0000 *2\u00020\u0001:\u0004*+,-B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lru/yandex/quasar/glagol/impl/NsdServiceResolver;", "", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$ResolveProcessor;", "resolveProcessor", "Lp46;", DeviceService.KEY_CONFIG, "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;", "listener", "<init>", "(Lru/yandex/quasar/glagol/impl/NsdServiceResolver$ResolveProcessor;Lp46;Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lp46;Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;)V", "Landroid/net/nsd/NsdServiceInfo;", "info", "", "schedule", "(Landroid/net/nsd/NsdServiceInfo;)V", "processNext", "()V", "", "canScheduleAgain", "(Landroid/net/nsd/NsdServiceInfo;)Z", "resolve", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$ResolveProcessor;", "Lp46;", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "resolveQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBusy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "retries", "Ljava/util/HashMap;", "ru/yandex/quasar/glagol/impl/NsdServiceResolver$resolveListener$1", "resolveListener", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$resolveListener$1;", "Companion", "Listener", "NsdManagerResolver", "ResolveProcessor", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class NsdServiceResolver {

    @NotNull
    public static final String TAG = "NsdResolver";

    @NotNull
    private final p46 config;

    @NotNull
    private final AtomicBoolean isBusy;

    @NotNull
    private final Listener listener;

    @NotNull
    private final NsdServiceResolver$resolveListener$1 resolveListener;

    @NotNull
    private final ResolveProcessor resolveProcessor;

    @NotNull
    private final ConcurrentLinkedQueue<NsdServiceInfo> resolveQueue;

    @NotNull
    private final HashMap<String, Integer> retries;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lru/yandex/quasar/glagol/impl/NsdServiceResolver$Listener;", "", "onResolveFail", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "errCode", "", "onResolveSuccess", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface Listener {
        void onResolveFail(@NotNull NsdServiceInfo serviceInfo, int errCode);

        void onResolveSuccess(@NotNull NsdServiceInfo serviceInfo);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/quasar/glagol/impl/NsdServiceResolver$NsdManagerResolver;", "Lru/yandex/quasar/glagol/impl/NsdServiceResolver$ResolveProcessor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "manager", "Landroid/net/nsd/NsdManager;", "resolve", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "listener", "Landroid/net/nsd/NsdManager$ResolveListener;", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class NsdManagerResolver implements ResolveProcessor {

        @NotNull
        private final NsdManager manager;

        public NsdManagerResolver(@NotNull Context context) {
            context.getClass();
            Object systemService = context.getSystemService("servicediscovery");
            systemService.getClass();
            this.manager = (NsdManager) systemService;
        }

        @Override // ru.yandex.quasar.glagol.impl.NsdServiceResolver.ResolveProcessor
        public void resolve(@NotNull NsdServiceInfo serviceInfo, @NotNull NsdManager.ResolveListener listener) {
            serviceInfo.getClass();
            listener.getClass();
            this.manager.resolveService(serviceInfo, listener);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/yandex/quasar/glagol/impl/NsdServiceResolver$ResolveProcessor;", "", "resolve", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "listener", "Landroid/net/nsd/NsdManager$ResolveListener;", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface ResolveProcessor {
        void resolve(@NotNull NsdServiceInfo serviceInfo, @NotNull NsdManager.ResolveListener listener);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ru.yandex.quasar.glagol.impl.NsdServiceResolver$resolveListener$1] */
    public NsdServiceResolver(@NotNull ResolveProcessor resolveProcessor, @NotNull p46 p46Var, @NotNull Listener listener) {
        resolveProcessor.getClass();
        p46Var.getClass();
        listener.getClass();
        this.resolveProcessor = resolveProcessor;
        this.config = p46Var;
        this.listener = listener;
        this.resolveQueue = new ConcurrentLinkedQueue<>();
        this.isBusy = new AtomicBoolean(false);
        this.retries = new HashMap<>();
        this.resolveListener = new NsdManager.ResolveListener() { // from class: ru.yandex.quasar.glagol.impl.NsdServiceResolver$resolveListener$1
            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onResolveFailed(NsdServiceInfo serviceInfo, int errorCode) {
                AtomicBoolean atomicBoolean;
                boolean canScheduleAgain;
                NsdServiceResolver.Listener listener2;
                HashMap hashMap;
                NsdServiceResolver.Listener listener3;
                atomicBoolean = NsdServiceResolver.this.isBusy;
                atomicBoolean.set(false);
                if (serviceInfo != null) {
                    NsdServiceResolver nsdServiceResolver = NsdServiceResolver.this;
                    weo.r(NsdServiceResolver.TAG, "Failed resolving " + serviceInfo + " errCode=" + errorCode, new Object[0]);
                    if (errorCode == 3 || errorCode == 4) {
                        canScheduleAgain = nsdServiceResolver.canScheduleAgain(serviceInfo);
                        if (canScheduleAgain) {
                            weo.p(NsdServiceResolver.TAG, "Rescheduling " + serviceInfo, new Object[0]);
                            nsdServiceResolver.schedule(serviceInfo);
                        } else {
                            listener2 = nsdServiceResolver.listener;
                            listener2.onResolveFail(serviceInfo, errorCode);
                        }
                    } else {
                        hashMap = nsdServiceResolver.retries;
                        hashMap.remove(serviceInfo.getServiceName());
                        listener3 = nsdServiceResolver.listener;
                        listener3.onResolveFail(serviceInfo, errorCode);
                    }
                }
                NsdServiceResolver.this.processNext();
            }

            @Override // android.net.nsd.NsdManager.ResolveListener
            public void onServiceResolved(NsdServiceInfo serviceInfo) {
                AtomicBoolean atomicBoolean;
                HashMap hashMap;
                NsdServiceResolver.Listener listener2;
                weo.p(NsdServiceResolver.TAG, "Resolved " + serviceInfo, new Object[0]);
                atomicBoolean = NsdServiceResolver.this.isBusy;
                atomicBoolean.set(false);
                if (serviceInfo != null) {
                    NsdServiceResolver nsdServiceResolver = NsdServiceResolver.this;
                    hashMap = nsdServiceResolver.retries;
                    hashMap.remove(serviceInfo.getServiceName());
                    listener2 = nsdServiceResolver.listener;
                    listener2.onResolveSuccess(serviceInfo);
                }
                NsdServiceResolver.this.processNext();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canScheduleAgain(NsdServiceInfo info) {
        String serviceName = info.getServiceName();
        Integer num = this.retries.get(serviceName);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        Integer valueOf = Integer.valueOf(intValue);
        HashMap<String, Integer> hashMap = this.retries;
        serviceName.getClass();
        hashMap.put(serviceName, valueOf);
        this.config.getClass();
        return intValue < 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processNext() {
        if (this.isBusy.compareAndSet(false, true)) {
            NsdServiceInfo poll = this.resolveQueue.poll();
            if (poll == null) {
                this.isBusy.set(false);
                return;
            }
            weo.p(TAG, "Resolving " + poll, new Object[0]);
            this.resolveProcessor.resolve(poll, this.resolveListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void schedule(NsdServiceInfo info) {
        this.resolveQueue.add(info);
        processNext();
    }

    public final void resolve(@NotNull NsdServiceInfo info) {
        info.getClass();
        this.retries.remove(info.getServiceName());
        schedule(info);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NsdServiceResolver(@NotNull Context context, @NotNull p46 p46Var, @NotNull Listener listener) {
        this(new NsdManagerResolver(context), p46Var, listener);
        context.getClass();
        p46Var.getClass();
        listener.getClass();
    }
}
