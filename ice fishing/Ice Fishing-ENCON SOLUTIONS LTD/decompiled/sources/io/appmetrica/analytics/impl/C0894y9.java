package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894y9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0542kk f7228a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f7229b;

    public C0894y9() {
        C0542kk w2 = C0610na.k().w();
        this.f7228a = w2;
        this.f7229b = w2.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f7228a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + ThreadFactoryC0924zd.f7275a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f7229b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f7228a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0542kk c0542kk = this.f7228a;
        if (c0542kk.f6404f == null) {
            synchronized (c0542kk) {
                try {
                    if (c0542kk.f6404f == null) {
                        c0542kk.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-SIO");
                        c0542kk.f6404f = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0542kk.f6404f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0542kk c0542kk = this.f7228a;
        if (c0542kk.f6406h == null) {
            synchronized (c0542kk) {
                try {
                    if (c0542kk.f6406h == null) {
                        c0542kk.f6399a.getClass();
                        c0542kk.f6406h = new ExecutorC0490ik(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0542kk.f6406h;
    }
}
