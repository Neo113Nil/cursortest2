package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i5g {
    public final nu1 a;

    public i5g(nu1 nu1Var) {
        nu1Var.getClass();
        this.a = nu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i5g.class.equals(obj.getClass())) {
            return false;
        }
        nu1 nu1Var = ((i5g) obj).a;
        nu1 nu1Var2 = this.a;
        return Intrinsics.d(nu1Var2, nu1Var) && e88.r(nu1Var2) == e88.r(nu1Var);
    }

    public final int hashCode() {
        mu1 mu1Var;
        nu1 nu1Var = this.a;
        int hashCode = nu1Var.hashCode() * 31;
        int ordinal = nu1Var.W().ordinal();
        if (ordinal == 0) {
            mu1Var = mu1.N;
            mu1Var.getClass();
        } else if (ordinal == 1) {
            mu1Var = mu1.O;
            mu1Var.getClass();
        } else {
            if (ordinal != 2) {
                b6e.s();
                return 0;
            }
            mu1Var = mu1.P;
            mu1Var.getClass();
        }
        return Integer.hashCode(mu1Var.x(nu1Var)) + hashCode;
    }
}
