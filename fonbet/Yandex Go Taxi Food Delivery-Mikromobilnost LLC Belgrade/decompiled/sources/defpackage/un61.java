package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class un61 {
    public static List a(xz4 xz4Var, bk61 bk61Var) {
        q781 q781Var = xz4Var instanceof q781 ? (q781) xz4Var : null;
        xz4 xz4Var2 = bk61Var != null ? bk61Var.b : null;
        return j73.A(new Object[]{q781Var, xz4Var2 instanceof q781 ? (q781) xz4Var2 : null, bk61Var != null ? bk61Var.a : null});
    }

    public static b081 b(ms71 ms71Var, xz4 xz4Var) {
        boolean z = false;
        boolean z2 = (xz4Var == null || ms71Var == null) ? false : true;
        if (xz4Var == null && ms71Var == null) {
            z = true;
        }
        return (z2 || z) ? sq71.a : xz4Var != null ? (b081) xz4Var.b : ms71Var != null ? new xk71(ms71Var) : sq71.a;
    }
}
