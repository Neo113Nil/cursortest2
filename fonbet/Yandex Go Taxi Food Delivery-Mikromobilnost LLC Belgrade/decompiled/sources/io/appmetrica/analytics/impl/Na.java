package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.oyr;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes9.dex */
public final class Na implements ExecutorProvider {
    public final Bn a;
    public final IHandlerExecutor b;

    public Na() {
        Bn w = Jb.k().w();
        this.a = w;
        this.b = w.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        StringBuilder v = oyr.v(oyr.f(LicenseUtility.SEPARATOR, str, str2), "-");
        v.append(ThreadFactoryC0450jg.a.incrementAndGet());
        return new InterruptionSafeThread(runnable, v.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.a.g();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        return this.a.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        Bn bn = this.a;
        if (bn.h == null) {
            synchronized (bn) {
                try {
                    if (bn.h == null) {
                        bn.a.getClass();
                        bn.h = new ExecutorC0920zn(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return bn.h;
    }
}
