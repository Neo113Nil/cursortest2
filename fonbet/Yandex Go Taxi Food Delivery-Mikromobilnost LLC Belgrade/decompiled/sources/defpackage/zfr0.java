package defpackage;

import android.graphics.Shader;

/* loaded from: classes10.dex */
public abstract class zfr0 extends ml6 {
    public kw01 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.ml6
    public final void a(float f, long j, ka90 ka90Var) {
        kw01 kw01Var = this.a;
        if (kw01Var == null || !cjs0.a(this.b, j)) {
            if (cjs0.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                kw01Var = null;
            } else {
                kw01Var = this.a;
                if (kw01Var == null) {
                    kw01Var = new kw01();
                    this.a = kw01Var;
                }
                kw01Var.a = b(j);
                this.a = kw01Var;
                this.b = j;
            }
        }
        eb2 eb2Var = (eb2) ka90Var;
        long d = rzo.d(eb2Var.a.getColor());
        long j2 = ldc.b;
        if (!ldc.c(d, j2)) {
            eb2Var.f(j2);
        }
        if (!jl40.l(eb2Var.c, kw01Var != null ? kw01Var.a : null)) {
            eb2Var.j(kw01Var != null ? kw01Var.a : null);
        }
        if (r4.getAlpha() / 255.0f == f) {
            return;
        }
        eb2Var.c(f);
    }

    public abstract Shader b(long j);
}
