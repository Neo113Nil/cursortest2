package androidx.work;

import A8.b;
import D.RunnableC0282a;
import J0.f;
import J0.i;
import J0.j;
import J0.m;
import J0.r;
import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C0389g;
import S7.F;
import S7.InterfaceC0396n;
import S7.b0;
import S7.h0;
import T0.l;
import U0.a;
import U0.k;
import Z2.e;
import android.content.Context;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.h;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {
    private final AbstractC0402u coroutineContext;
    private final k future;
    private final InterfaceC0396n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.job = new b0();
        k kVar = new k();
        this.future = kVar;
        kVar.a(new RunnableC0282a(5, this), (l) ((e) getTaskExecutor()).f4170u);
        this.coroutineContext = F.f2915a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f3159n instanceof a) {
            ((h0) coroutineWorker.job).a(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC5267d interfaceC5267d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC5267d interfaceC5267d);

    public AbstractC0402u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC5267d interfaceC5267d) {
        return getForegroundInfo$suspendImpl(this, interfaceC5267d);
    }

    @Override // J0.r
    public final N3.a getForegroundInfoAsync() {
        b0 b0Var = new b0();
        AbstractC0402u coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        X7.e b9 = AbstractC0406y.b(b.r(coroutineContext, b0Var));
        m mVar = new m(b0Var);
        AbstractC0406y.o(b9, null, new J0.e(mVar, this, null), 3);
        return mVar;
    }

    public final k getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0396n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // J0.r
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(j jVar, InterfaceC5267d interfaceC5267d) {
        N3.a foregroundAsync = setForegroundAsync(jVar);
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
            C0389g c0389g = new C0389g(1, b.l(interfaceC5267d));
            c0389g.r();
            foregroundAsync.a(new LD(c0389g, foregroundAsync, 6, false), i.f1392n);
            c0389g.t(new J0.l(1, foregroundAsync));
            Object q8 = c0389g.q();
            if (q8 == A7.a.f58n) {
                return q8;
            }
        }
        return v.f41350a;
    }

    public final Object setProgress(J0.h hVar, InterfaceC5267d interfaceC5267d) {
        N3.a progressAsync = setProgressAsync(hVar);
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
            C0389g c0389g = new C0389g(1, b.l(interfaceC5267d));
            c0389g.r();
            progressAsync.a(new LD(c0389g, progressAsync, 6, false), i.f1392n);
            c0389g.t(new J0.l(1, progressAsync));
            Object q8 = c0389g.q();
            if (q8 == A7.a.f58n) {
                return q8;
            }
        }
        return v.f41350a;
    }

    @Override // J0.r
    public final N3.a startWork() {
        AbstractC0402u coroutineContext = getCoroutineContext();
        InterfaceC0396n interfaceC0396n = this.job;
        coroutineContext.getClass();
        AbstractC0406y.o(AbstractC0406y.b(b.r(coroutineContext, interfaceC0396n)), null, new f(this, null), 3);
        return this.future;
    }
}
