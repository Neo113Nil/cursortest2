package androidx.work;

import B2.RunnableC0272f;
import D.RunnableC0281a;
import J0.f;
import J0.i;
import J0.j;
import J0.m;
import J0.r;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C0382g;
import O7.F;
import O7.InterfaceC0389n;
import O7.b0;
import O7.h0;
import T0.l;
import U0.a;
import U0.k;
import Y2.e;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.h;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {
    private final AbstractC0395u coroutineContext;
    private final k future;
    private final InterfaceC0389n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.job = new b0();
        k kVar = new k();
        this.future = kVar;
        kVar.c(new RunnableC0281a(5, this), (l) ((e) getTaskExecutor()).f3963u);
        this.coroutineContext = F.f2551a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f3237n instanceof a) {
            ((h0) coroutineWorker.job).a(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC5133d interfaceC5133d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC5133d interfaceC5133d);

    public AbstractC0395u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC5133d interfaceC5133d) {
        return getForegroundInfo$suspendImpl(this, interfaceC5133d);
    }

    @Override // J0.r
    public final J3.a getForegroundInfoAsync() {
        b0 b0Var = new b0();
        AbstractC0395u coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        T7.e b9 = AbstractC0399y.b(com.bumptech.glide.e.w(coroutineContext, b0Var));
        m mVar = new m(b0Var);
        AbstractC0399y.o(b9, null, new J0.e(mVar, this, null), 3);
        return mVar;
    }

    public final k getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0389n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // J0.r
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(j jVar, InterfaceC5133d interfaceC5133d) {
        J3.a foregroundAsync = setForegroundAsync(jVar);
        h.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e6) {
                Throwable cause = e6.getCause();
                if (cause == null) {
                    throw e6;
                }
                throw cause;
            }
        } else {
            C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
            c0382g.r();
            foregroundAsync.c(new RunnableC0272f(5, c0382g, foregroundAsync), i.f1317n);
            c0382g.t(new J0.l(1, foregroundAsync));
            Object q6 = c0382g.q();
            if (q6 == EnumC5179a.f41704n) {
                return q6;
            }
        }
        return v.f40183a;
    }

    public final Object setProgress(J0.h hVar, InterfaceC5133d interfaceC5133d) {
        J3.a progressAsync = setProgressAsync(hVar);
        h.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e6) {
                Throwable cause = e6.getCause();
                if (cause == null) {
                    throw e6;
                }
                throw cause;
            }
        } else {
            C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
            c0382g.r();
            progressAsync.c(new RunnableC0272f(5, c0382g, progressAsync), i.f1317n);
            c0382g.t(new J0.l(1, progressAsync));
            Object q6 = c0382g.q();
            if (q6 == EnumC5179a.f41704n) {
                return q6;
            }
        }
        return v.f40183a;
    }

    @Override // J0.r
    public final J3.a startWork() {
        AbstractC0395u coroutineContext = getCoroutineContext();
        InterfaceC0389n interfaceC0389n = this.job;
        coroutineContext.getClass();
        AbstractC0399y.o(AbstractC0399y.b(com.bumptech.glide.e.w(coroutineContext, interfaceC0389n)), null, new f(this, null), 3);
        return this.future;
    }
}
