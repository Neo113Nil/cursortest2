package ru.yandex.taxi.eatskit.internal;

import defpackage.ccn;
import defpackage.tls;
import defpackage.ycc;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class e {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public tls c;
    public boolean d;

    public final void a(ccn ccnVar) {
        String str = ccnVar.a;
        boolean z = this.d;
        LinkedHashMap linkedHashMap = this.a;
        if (z || this.c == null) {
            linkedHashMap.remove(str);
            linkedHashMap.put(str, ccnVar);
            LinkedHashMap linkedHashMap2 = this.b;
            linkedHashMap2.remove(str);
            linkedHashMap2.put(str, ccnVar);
            return;
        }
        if (ccnVar.c) {
            linkedHashMap.remove(str);
            linkedHashMap.put(str, ccnVar);
        }
        tls tlsVar = this.c;
        if (tlsVar != null) {
            tlsVar.invoke(ccnVar);
        }
    }

    public final List b() {
        ycc.v(this.b.values(), EatsEventProvider$pullInitialEvents$1.b, false);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.isEmpty()) {
            return EmptyList.a;
        }
        List J0 = kotlin.collections.a.J0(linkedHashMap.values());
        ycc.v(linkedHashMap.values(), EatsEventProvider$pullInitialEvents$2.b, false);
        return J0;
    }
}
