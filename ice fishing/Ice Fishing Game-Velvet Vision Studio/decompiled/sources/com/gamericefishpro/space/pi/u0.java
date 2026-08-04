package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends t {
    public static final /* synthetic */ int y = 0;
    public long i;
    public boolean v;
    public com.gamericefishpro.space.ph.r w;

    public final void T(boolean z) {
        long j = this.i - (z ? 4294967296L : 1L);
        this.i = j;
        if (j <= 0 && this.v) {
            shutdown();
        }
    }

    public final void U(i0 i0Var) {
        com.gamericefishpro.space.ph.r rVar = this.w;
        if (rVar == null) {
            rVar = new com.gamericefishpro.space.ph.r();
            this.w = rVar;
        }
        rVar.addLast(i0Var);
    }

    public abstract Thread V();

    public final void W(boolean z) {
        this.i = (z ? 4294967296L : 1L) + this.i;
        if (z) {
            return;
        }
        this.v = true;
    }

    public abstract long X();

    public final boolean Y() {
        com.gamericefishpro.space.ph.r rVar = this.w;
        if (rVar == null) {
            return false;
        }
        i0 i0Var = (i0) (rVar.isEmpty() ? null : rVar.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void Z(long j, r0 r0Var) {
        b0.C.e0(j, r0Var);
    }

    public abstract void shutdown();
}
