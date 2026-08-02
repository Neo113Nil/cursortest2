package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.network.internal.NetworkClientServiceLocator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLifecycleObserver;", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", "Lzy11;", "onCreate", "()V", "onDestroy", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "a", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "getNetworkCore", "()Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "networkCore", "Companion", "network-tasks_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile NetworkServiceLocator b;

    /* renamed from: a, reason: from kotlin metadata */
    private final NetworkCore networkCore;

    public NetworkServiceLocator(IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.networkCore = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void init(Context context, IExecutionPolicy iExecutionPolicy) {
        INSTANCE.init(context, iExecutionPolicy);
    }

    public final NetworkCore getNetworkCore() {
        return this.networkCore;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.networkCore.stopTasks();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator$Companion;", "", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "getInstance", "()Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "Lzy11;", "init", "(Landroid/content/Context;Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", "networkServiceLocator", "(Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;)V", "instance", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "network-tasks_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.b;
            if (networkServiceLocator == null) {
                return null;
            }
            return networkServiceLocator;
        }

        public final void init(Context context, IExecutionPolicy executionPolicy) {
            if (NetworkServiceLocator.b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.b == null) {
                        NetworkServiceLocator.b = new NetworkServiceLocator(executionPolicy);
                    }
                }
            }
            NetworkClientServiceLocator.init(context);
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.b = networkServiceLocator;
        }
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        INSTANCE.init(networkServiceLocator);
    }
}
