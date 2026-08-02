package defpackage;

import kotlin.NoWhenBranchMatchedException;
import yads.fw;
import yads.pf1;

/* loaded from: classes7.dex */
public final class xt71 {
    public static bk81 a(pf1 pf1Var, fw fwVar) {
        String str = fwVar.b;
        if (str == null) {
            return null;
        }
        try {
            int ordinal = fwVar.ordinal();
            if (ordinal == 0) {
                return new r681(pf1Var.c(str));
            }
            if (ordinal == 1) {
                return new ga81(pf1Var.c(str));
            }
            if (ordinal == 2) {
                return new t381(pf1Var.a(str, false));
            }
            if (ordinal == 3) {
                return new ud81(pf1Var.c(str));
            }
            if (ordinal == 4) {
                return new rg81(pf1Var.c(str));
            }
            if (ordinal == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
