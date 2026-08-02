package defpackage;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class t380 {
    public final wnt a;
    public final mx70 b;

    public t380(wnt wntVar, mx70 mx70Var) {
        this.a = wntVar;
        this.b = mx70Var;
    }

    public final void a(String str, String str2, Integer num, Long l, ntv ntvVar) {
        if (jl40.l(ntvVar != null ? Boolean.valueOf(ntvVar.i) : null, Boolean.TRUE)) {
            str2 = "none";
        }
        dz6 dz6Var = new dz6(num, l, str, str2);
        wnt wntVar = this.a;
        String e = ntvVar != null ? ((xnt) wntVar).e(ntvVar, ntv.Companion.serializer()) : null;
        String e2 = ((xnt) wntVar).e(dz6Var, dz6.Companion.serializer());
        mx70 mx70Var = this.b;
        mx70Var.getClass();
        HashMap hashMap = new HashMap();
        if (e != null) {
            hashMap.put("InfoModalCardParams", e);
        }
        mx70Var.a.a("OrderInfoCard.ButtonAction", hashMap, 1, tse0.r("ButtonActionParams", hashMap, e2));
    }
}
