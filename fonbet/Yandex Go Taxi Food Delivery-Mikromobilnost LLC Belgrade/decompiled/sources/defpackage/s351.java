package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class s351 {
    public static Map a(q351 q351Var) {
        String e;
        Pair pair = new Pair("id", q351Var.a());
        Pair pair2 = new Pair("type", q351Var.c().getTypeIdentifier());
        int i = r351.a[q351Var.c().ordinal()];
        if (i == 1) {
            d380 d380Var = (d380) a.R(q351Var.b());
            e = d380Var != null ? d380Var.e() : "";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            List b = q351Var.b();
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((d380) it.next()).e());
            }
            e = gw00.e(new Pair("orders", arrayList));
        }
        return b.i(pair, pair2, new Pair("payload", e));
    }
}
