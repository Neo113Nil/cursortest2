package com.gamericefishpro.space.n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Runnable {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t2 e;

    public j2(t2 t2Var, boolean z) {
        this.d = z;
        Objects.requireNonNull(t2Var);
        this.e = t2Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        t2 t2Var = this.e;
        r1 r1Var = (r1) t2Var.d;
        boolean zB = r1Var.b();
        boolean z = false;
        boolean z2 = r1Var.R != null && r1Var.R.booleanValue();
        boolean z3 = this.d;
        r1Var.R = Boolean.valueOf(z3);
        if (z2 == z3) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.b(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (r1Var.b() != zB) {
            boolean zB2 = r1Var.b();
            if (r1Var.R != null && r1Var.R.booleanValue()) {
                z = true;
            }
            if (zB2 != z) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.D.c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zB));
            }
        } else {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.D.c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zB));
        }
        t2Var.J();
    }
}
