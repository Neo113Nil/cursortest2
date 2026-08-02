package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class bcb {
    public static long a = d85.n;
    public static Long b;

    public static long a(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(Boolean.valueOf(lifecycle.b().compareTo(lyf.d) >= 0));
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Long l = b;
        boolean h = oq5Var.h(lifecycle);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new zbb(lifecycle, aqiVar, 0);
            oq5Var.k0(K2);
        }
        gld.k(lifecycle, (Function1) K2, oq5Var);
        if (a != 16 && (l == null || System.currentTimeMillis() - l.longValue() <= 1500)) {
            oq5Var.Z(1867506170);
        } else {
            oq5Var.Z(1869922527);
            a = ((dq0) oq5Var.j(eq0.a)).c.d;
        }
        oq5Var.p(false);
        boolean g = oq5Var.g(((Boolean) aqiVar.getValue()).booleanValue());
        Object K3 = oq5Var.K();
        if (g || K3 == kjnVar) {
            d85 d85Var = new d85(a);
            oq5Var.k0(d85Var);
            K3 = d85Var;
        }
        return ((d85) K3).a;
    }
}
