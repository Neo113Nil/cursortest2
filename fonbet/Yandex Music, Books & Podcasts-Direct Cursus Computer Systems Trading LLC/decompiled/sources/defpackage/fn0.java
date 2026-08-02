package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public abstract class fn0 {
    public static final od0 a = new od0(12);
    public static final float b = 100;

    public static final vm0 a(act actVar, float f, um0 um0Var, hq5 hq5Var, int i, int i2) {
        um0 um0Var2;
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (K == obj) {
            K = vq2.a(um0Var == um0.a ? f2 : 0.0f);
            oq5Var.k0(K);
        }
        fk0 fk0Var = (fk0) K;
        boolean h = ((((i & 896) ^ 384) > 256 && oq5Var.d(um0Var.ordinal())) || (i & 384) == 256) | oq5Var.h(fk0Var) | ((((i & 112) ^ 48) > 32 && oq5Var.c(f2)) || (i & 48) == 32) | oq5Var.h(actVar);
        Object K2 = oq5Var.K();
        if (h || K2 == obj) {
            um0Var2 = um0Var;
            Object en0Var = new en0(um0Var2, fk0Var, f2, actVar, null);
            oq5Var.k0(en0Var);
            K2 = en0Var;
        } else {
            um0Var2 = um0Var;
        }
        gld.w(oq5Var, um0Var2, (Function2) K2);
        return fk0Var.c;
    }

    public static final vm0 b(int i, float f, um0 um0Var, hq5 hq5Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            f = 1.0f;
        }
        return a(new act(700, ((Number) a.invoke(Integer.valueOf(i))).intValue(), nya.a), f, um0Var, hq5Var, i2 & 1008, 0);
    }
}
