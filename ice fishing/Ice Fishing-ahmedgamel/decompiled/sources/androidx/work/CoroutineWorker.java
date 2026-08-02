package androidx.work;

import A3.p;
import A8.b;
import J0.f;
import J0.g;
import J0.i;
import J0.q;
import S7.AbstractC0406u;
import S7.AbstractC0410y;
import S7.C0393g;
import S7.F;
import S7.InterfaceC0400n;
import S7.b0;
import S7.h0;
import T0.l;
import U0.a;
import U0.k;
import android.content.Context;
import b3.e;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.h;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends q {
    private final AbstractC0406u coroutineContext;
    private final k future;
    private final InterfaceC0400n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.job = new b0();
        k kVar = new k();
        this.future = kVar;
        kVar.a(new p(3, this), (l) ((e) getTaskExecutor()).f5557u);
        this.coroutineContext = F.f2998a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f3276n instanceof a) {
            ((h0) coroutineWorker.job).a(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC5240d interfaceC5240d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC5240d interfaceC5240d);

    public AbstractC0406u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC5240d interfaceC5240d) {
        return getForegroundInfo$suspendImpl(this, interfaceC5240d);
    }

    @Override // J0.q
    public final P3.a getForegroundInfoAsync() {
        b0 b0Var = new b0();
        AbstractC0406u coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        X7.e b9 = AbstractC0410y.b(b.t(coroutineContext, b0Var));
        J0.l lVar = new J0.l(b0Var);
        AbstractC0410y.o(b9, null, new J0.e(lVar, this, null), 3);
        return lVar;
    }

    public final k getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0400n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // J0.q
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(i iVar, InterfaceC5240d interfaceC5240d) {
        P3.a foregroundAsync = setForegroundAsync(iVar);
        h.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e9) {
                Throwable cause = e9.getCause();
                if (cause == null) {
                    throw e9;
                }
                throw cause;
            }
        } else {
            C0393g c0393g = new C0393g(1, b.n(interfaceC5240d));
            c0393g.r();
            foregroundAsync.a(new LD(c0393g, foregroundAsync, 6, false), J0.h.f1420n);
            c0393g.t(new J0.k(1, foregroundAsync));
            Object q8 = c0393g.q();
            if (q8 == A7.a.f215n) {
                return q8;
            }
        }
        return v.f41073a;
    }

    public final Object setProgress(g gVar, InterfaceC5240d interfaceC5240d) {
        P3.a progressAsync = setProgressAsync(gVar);
        h.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e9) {
                Throwable cause = e9.getCause();
                if (cause == null) {
                    throw e9;
                }
                throw cause;
            }
        } else {
            C0393g c0393g = new C0393g(1, b.n(interfaceC5240d));
            c0393g.r();
            progressAsync.a(new LD(c0393g, progressAsync, 6, false), J0.h.f1420n);
            c0393g.t(new J0.k(1, progressAsync));
            Object q8 = c0393g.q();
            if (q8 == A7.a.f215n) {
                return q8;
            }
        }
        return v.f41073a;
    }

    @Override // J0.q
    public final P3.a startWork() {
        AbstractC0406u coroutineContext = getCoroutineContext();
        InterfaceC0400n interfaceC0400n = this.job;
        coroutineContext.getClass();
        AbstractC0410y.o(AbstractC0410y.b(b.t(coroutineContext, interfaceC0400n)), null, new f(this, null), 3);
        return this.future;
    }
}
