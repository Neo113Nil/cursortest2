package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;

/* loaded from: classes3.dex */
public final class x7g0 {
    public final v5c0 a;

    public x7g0(v5c0 v5c0Var) {
        this.a = v5c0Var;
    }

    public static List a(v031 v031Var) {
        if (jl40.l(v031Var, o031.a)) {
            return null;
        }
        if (v031Var instanceof r031) {
            return a(((r031) v031Var).a);
        }
        if (v031Var instanceof n031) {
            return ((n031) v031Var).a;
        }
        if (v031Var instanceof l031) {
            return ((l031) v031Var).e;
        }
        if (v031Var instanceof q031) {
            return ((q031) v031Var).c;
        }
        w511.b();
        return null;
    }

    public static wvz0 b(xvz0 xvz0Var) {
        String str;
        Text.Constant i = g8e.i(Text.Companion, xvz0Var.a);
        duz0 duz0Var = xvz0Var.b;
        return new wvz0(i, (duz0Var == null || (str = duz0Var.b) == null) ? null : new Text.Constant(str), duz0Var != null ? job1.f(duz0Var.c, new gdf0(24)) : null);
    }
}
