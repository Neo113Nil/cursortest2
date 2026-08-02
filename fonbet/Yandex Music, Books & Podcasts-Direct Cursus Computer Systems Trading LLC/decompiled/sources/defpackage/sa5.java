package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class sa5 {
    public static final ta5 a = new ta5(qx0.c, b2c.n);

    public static final ta5 a(ox0 ox0Var, gz2 gz2Var, hq5 hq5Var, int i) {
        if (Intrinsics.d(ox0Var, qx0.c) && Intrinsics.d(gz2Var, b2c.n)) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(346089448);
            oq5Var.p(false);
            return a;
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(346143295);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && oq5Var2.f(ox0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !oq5Var2.f(gz2Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object K = oq5Var2.K();
        if (z3 || K == gq5.a) {
            K = new ta5(ox0Var, gz2Var);
            oq5Var2.k0(K);
        }
        ta5 ta5Var = (ta5) K;
        oq5Var2.p(false);
        return ta5Var;
    }
}
