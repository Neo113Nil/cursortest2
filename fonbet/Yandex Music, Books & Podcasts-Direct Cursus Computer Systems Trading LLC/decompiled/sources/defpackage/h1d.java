package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class h1d {
    public static r0d a(t0d t0dVar, e0d e0dVar, arf arfVar, xzc xzcVar, v4b v4bVar, jyr jyrVar, oq5 oq5Var, int i) {
        arfVar.getClass();
        xzcVar.getClass();
        boolean h = (((i & 14) ^ 6) > 4 && oq5Var.h(t0dVar)) | oq5Var.h(e0dVar) | oq5Var.h(jyrVar) | oq5Var.h(arfVar);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (h || K == obj) {
            Object i50Var = new i50(t0dVar, e0dVar, jyrVar, arfVar, 9);
            oq5Var.k0(i50Var);
            K = i50Var;
        }
        Function1 function1 = (Function1) K;
        oq5Var.a0(419377738);
        kfu a = rpg.a(oq5Var);
        if (a == null) {
            xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        bfu R = ngg.R(ern.a(c1d.class), a, null, k5r.g(c1d.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
        oq5Var.p(false);
        c1d c1dVar = (c1d) R;
        boolean f = oq5Var.f(c1dVar) | oq5Var.f(v4bVar);
        Object K2 = oq5Var.K();
        if (f || K2 == obj) {
            K2 = new r0d(c1dVar, xzcVar, v4bVar);
            oq5Var.k0(K2);
        }
        return (r0d) K2;
    }
}
