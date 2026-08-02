package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.hrg;
import defpackage.tlm;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ga implements ExecutorProvider {
    public final C0383jn a;
    public final IHandlerExecutor b;

    public Ga() {
        C0383jn w = C0747wb.k().w();
        this.a = w;
        this.b = w.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        StringBuilder m = tlm.m(hrg.l('-', str, str2), "-");
        m.append(Uf.a.incrementAndGet());
        return new InterruptionSafeThread(runnable, m.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.a.f();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C0383jn c0383jn = this.a;
        if (c0383jn.f == null) {
            synchronized (c0383jn) {
                try {
                    if (c0383jn.f == null) {
                        c0383jn.a.getClass();
                        Bc a = Ha.a("IAA-SIO");
                        c0383jn.f = new Ha(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0383jn.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        C0383jn c0383jn = this.a;
        if (c0383jn.h == null) {
            synchronized (c0383jn) {
                try {
                    if (c0383jn.h == null) {
                        c0383jn.a.getClass();
                        c0383jn.h = new ExecutorC0326hn(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0383jn.h;
    }
}
