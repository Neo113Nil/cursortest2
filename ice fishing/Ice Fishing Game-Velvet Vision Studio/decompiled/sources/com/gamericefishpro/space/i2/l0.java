package com.gamericefishpro.space.i2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.pi.t {
    public static final com.gamericefishpro.space.oh.s F = com.gamericefishpro.space.oh.i.b(g0.z);
    public static final com.gamericefishpro.space.d9.j G = new com.gamericefishpro.space.d9.j(1);
    public boolean B;
    public boolean C;
    public final n0 E;
    public final Choreographer i;
    public final Handler v;
    public final Object w = new Object();
    public final com.gamericefishpro.space.ph.r y = new com.gamericefishpro.space.ph.r();
    public ArrayList z = new ArrayList();
    public ArrayList A = new ArrayList();
    public final k0 D = new k0(this);

    public l0(Choreographer choreographer, Handler handler) {
        this.i = choreographer;
        this.v = handler;
        this.E = new n0(choreographer, this);
    }

    public static final void T(l0 l0Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (l0Var.w) {
                com.gamericefishpro.space.ph.r rVar = l0Var.y;
                runnable = (Runnable) (rVar.isEmpty() ? null : rVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (l0Var.w) {
                    com.gamericefishpro.space.ph.r rVar2 = l0Var.y;
                    runnable = (Runnable) (rVar2.isEmpty() ? null : rVar2.removeFirst());
                }
            }
            synchronized (l0Var.w) {
                if (l0Var.y.isEmpty()) {
                    z = false;
                    l0Var.B = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.w) {
            try {
                this.y.addLast(runnable);
                if (!this.B) {
                    this.B = true;
                    this.v.post(this.D);
                    if (!this.C) {
                        this.C = true;
                        this.i.postFrameCallback(this.D);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
