package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class lho {
    public static final nho a = new nho(qx0.a, b2c.k);

    public static final nho a(mx0 mx0Var, hz2 hz2Var, hq5 hq5Var, int i) {
        if (Intrinsics.d(mx0Var, qx0.a) && Intrinsics.d(hz2Var, b2c.k)) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-848964613);
            oq5Var.p(false);
            return a;
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-848913742);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && oq5Var2.f(mx0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !oq5Var2.f(hz2Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object K = oq5Var2.K();
        if (z3 || K == gq5.a) {
            K = new nho(mx0Var, hz2Var);
            oq5Var2.k0(K);
        }
        nho nhoVar = (nho) K;
        oq5Var2.p(false);
        return nhoVar;
    }
}
