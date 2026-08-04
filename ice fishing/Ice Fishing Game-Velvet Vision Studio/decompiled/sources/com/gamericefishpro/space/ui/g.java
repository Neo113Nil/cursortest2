package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.c0;
import com.gamericefishpro.space.pi.f0;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.pi.m0;
import com.gamericefishpro.space.pi.z1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.pi.t implements f0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final /* synthetic */ f0 i;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final com.gamericefishpro.space.pi.t v;
    public final int w;
    public final j y;
    public final Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.gamericefishpro.space.pi.t tVar, int i) {
        f0 f0Var = tVar instanceof f0 ? (f0) tVar : null;
        this.i = f0Var == null ? c0.a : f0Var;
        this.v = tVar;
        this.w = i;
        this.y = new j();
        this.z = new Object();
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final void C(long j, com.gamericefishpro.space.pi.h hVar) {
        this.i.C(j, hVar);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) throws g0 {
        Runnable runnableT;
        this.y.a(runnable);
        if (A.get(this) >= this.w || !U() || (runnableT = T()) == null) {
            return;
        }
        a.h(this.v, this, new com.gamericefishpro.space.r9.l(6, this, runnableT));
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void Q(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT;
        this.y.a(runnable);
        if (A.get(this) >= this.w || !U() || (runnableT = T()) == null) {
            return;
        }
        this.v.Q(this, new com.gamericefishpro.space.r9.l(6, this, runnableT));
    }

    public final Runnable T() {
        while (true) {
            Runnable runnable = (Runnable) this.y.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean U() {
        synchronized (this.z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
            if (atomicIntegerFieldUpdater.get(this) >= this.w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final m0 l(long j, z1 z1Var, CoroutineContext coroutineContext) {
        return this.i.l(j, z1Var, coroutineContext);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.v);
        sb.append(".limitedParallelism(");
        return com.gamericefishpro.space.m5.a.i(sb, this.w, ')');
    }
}
