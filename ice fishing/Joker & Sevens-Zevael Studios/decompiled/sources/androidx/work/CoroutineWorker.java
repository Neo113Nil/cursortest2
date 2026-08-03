package androidx.work;

import a1.a;
import a5.c;
import ac.o;
import android.content.Context;
import dd.e;
import fc.d;
import java.util.concurrent.ExecutionException;
import o4.f;
import o4.g;
import o4.i;
import o4.n;
import y4.l;
import yc.a0;
import yc.e1;
import yc.i0;
import yc.k1;
import yc.u;
import z4.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends n {
    private final u coroutineContext;
    private final j future;
    private final yc.n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        pc.j.e(context, "appContext");
        pc.j.e(workerParameters, "params");
        this.job = a0.b();
        j jVar = new j();
        this.future = jVar;
        jVar.a(new a(11, this), (l) ((c) getTaskExecutor()).f262h);
        this.coroutineContext = i0.f8859a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f9129g instanceof z4.a) {
            ((k1) coroutineWorker.job).a(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d dVar);

    public u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // o4.n
    public final h7.a getForegroundInfoAsync() {
        e1 b2 = a0.b();
        u coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        e a6 = a0.a(v6.a.K(coroutineContext, b2));
        i iVar = new i(b2);
        a0.q(a6, null, new c0.c(iVar, this, (d) null, 6), 3);
        return iVar;
    }

    public final j getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final yc.n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // o4.n
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(g gVar, d dVar) {
        h7.a foregroundAsync = setForegroundAsync(gVar);
        pc.j.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            yc.g gVar2 = new yc.g(1, bc.a0.w(dVar));
            gVar2.q();
            foregroundAsync.a(new dd.i(14, gVar2, foregroundAsync, false), f.f5207g);
            gVar2.s(new a0.a0(17, foregroundAsync));
            Object p8 = gVar2.p();
            if (p8 == gc.a.f2559g) {
                return p8;
            }
        }
        return o.f277a;
    }

    public final Object setProgress(o4.e eVar, d dVar) {
        h7.a progressAsync = setProgressAsync(eVar);
        pc.j.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            yc.g gVar = new yc.g(1, bc.a0.w(dVar));
            gVar.q();
            progressAsync.a(new dd.i(14, gVar, progressAsync, false), f.f5207g);
            gVar.s(new a0.a0(17, progressAsync));
            Object p8 = gVar.p();
            if (p8 == gc.a.f2559g) {
                return p8;
            }
        }
        return o.f277a;
    }

    @Override // o4.n
    public final h7.a startWork() {
        u coroutineContext = getCoroutineContext();
        yc.n nVar = this.job;
        coroutineContext.getClass();
        a0.q(a0.a(v6.a.K(coroutineContext, nVar)), null, new ld.c(this, null, 1), 3);
        return this.future;
    }

    @ac.a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
