package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w4k {
    public gh0 a;
    public m85 b;
    public float c = 1.0f;
    public xof d = xof.a;

    public static /* synthetic */ void h(w4k w4kVar, jpa jpaVar, long j, d43 d43Var, int i) {
        if ((i & 4) != 0) {
            d43Var = null;
        }
        w4kVar.g(jpaVar, j, 1.0f, d43Var);
    }

    public abstract void a(float f);

    public abstract void c(m85 m85Var);

    public final void g(jpa jpaVar, long j, float f, m85 m85Var) {
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!Intrinsics.d(this.b, m85Var)) {
            c(m85Var);
            this.b = m85Var;
        }
        xof layoutDirection = jpaVar.getLayoutDirection();
        if (this.d != layoutDirection) {
            f(layoutDirection);
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((xzi) jpaVar.q0().b).a0(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    j(jpaVar);
                }
            } finally {
                ((xzi) jpaVar.q0().b).a0(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long i();

    public abstract void j(jpa jpaVar);

    public void f(xof xofVar) {
    }
}
