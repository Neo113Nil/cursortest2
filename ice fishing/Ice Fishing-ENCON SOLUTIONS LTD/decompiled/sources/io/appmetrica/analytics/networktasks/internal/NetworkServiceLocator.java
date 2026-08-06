package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.network.internal.NetworkClientServiceLocator;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f7496b;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCore f7497a;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f7496b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            i.i("instance");
            throw null;
        }

        public final void init(Context context, IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f7496b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f7496b == null) {
                        NetworkServiceLocator.f7496b = new NetworkServiceLocator(iExecutionPolicy);
                    }
                }
            }
            NetworkClientServiceLocator.init(context);
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f7496b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator(IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f7497a = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init(Context context, IExecutionPolicy iExecutionPolicy) {
        Companion.init(context, iExecutionPolicy);
    }

    public final NetworkCore getNetworkCore() {
        return this.f7497a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f7497a.stopTasks();
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
