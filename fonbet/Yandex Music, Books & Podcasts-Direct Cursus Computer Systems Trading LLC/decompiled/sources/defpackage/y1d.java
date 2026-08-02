package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class y1d {
    public final Context a;
    public final jyr b;

    public y1d(Context context, jyr jyrVar) {
        context.getClass();
        this.a = context;
        this.b = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        x1d x1dVar;
        Object obj;
        int i;
        boolean contains;
        boolean z;
        boolean z2;
        if (cg6Var instanceof x1d) {
            x1dVar = (x1d) cg6Var;
            int i2 = x1dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x1dVar.l = i2 - Integer.MIN_VALUE;
                obj = x1dVar.j;
                nm6 nm6Var = nm6.a;
                i = x1dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String G = hyf.G(this.a);
                    if (G == null || G.length() == 0 || StringsKt.U(G)) {
                        contains = false;
                    } else {
                        Map e = uah.e(new Pair("RUSSIA", u75.h("RU", "RUS")), new Pair("BELARUS", u75.h("BY", "BLR")), new Pair("KAZAKHSTAN", u75.h("KZ", "KAZ")), new Pair("UZBEKISTAN", u75.h("UZ", "UZB")), new Pair("GEORGIA", u75.h("GE", "GEO")), new Pair("ARMENIA", u75.h("AM", "ARM")), new Pair("MOLDOVA", u75.h("MD", "MDA")), new Pair("AZERBAIJAN", u75.h("AZ", "AZE")), new Pair("TAJIKISTAN", u75.h("TK", "TJK")), new Pair("KYRGYZSTAN", u75.h("KG", "KGZ")), new Pair("TURKMENISTAN", u75.h("TM", "TKM")));
                        ArrayList arrayList = new ArrayList(e.size());
                        Iterator it = e.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((List) ((Map.Entry) it.next()).getValue());
                        }
                        Set A0 = CollectionsKt.A0(v75.p(arrayList));
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        String upperCase = G.toUpperCase(locale);
                        upperCase.getClass();
                        contains = A0.contains(upperCase);
                    }
                    if (!contains) {
                        v1d v1dVar = (v1d) this.b.getValue();
                        z = true;
                        x1dVar.l = 1;
                        obj = ((p2d) v1dVar.a.getValue()).d(x1dVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z = true;
                if (!((Boolean) obj).booleanValue()) {
                    z2 = z;
                    return Boolean.valueOf(z2);
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        x1dVar = new x1d(this, cg6Var);
        obj = x1dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x1dVar.l;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
