package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class p7v extends bfu {
    public final m6v k;
    public final o6v l;
    public final z6v m;
    public final boolean n;
    public final xdr o;

    public p7v(m6v m6vVar, o6v o6vVar, z6v z6vVar, boolean z) {
        Object z8vVar;
        z6vVar.getClass();
        this.k = m6vVar;
        this.l = o6vVar;
        this.m = z6vVar;
        this.n = z;
        Continuation continuation = null;
        if (!z || m6vVar.g.isEmpty()) {
            List list = m6vVar.d;
            n6v n6vVar = m6vVar.e;
            z8vVar = new z8v(m6vVar, null, n6vVar == null ? b8v.a : new a8v(n6vVar), list, o6vVar);
        } else {
            z8vVar = y8v.a;
        }
        this.o = ydr.a(z8vVar);
        x97.y(ot0.F(this), null, null, new zts(this, continuation, 24), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, k6v] */
    /* JADX WARN: Type inference failed for: r9v0, types: [j6v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [i6v] */
    /* JADX WARN: Type inference failed for: r9v5, types: [i6v] */
    public final void a(o6v o6vVar, l7v l7vVar) {
        m6v m6vVar = this.k;
        String str = m6vVar.a;
        List list = m6vVar.g;
        Continuation continuation = null;
        if (list.isEmpty()) {
            list = null;
        }
        k7v k7vVar = new k7v(str, list != null ? (String) CollectionsKt.Q(list) : null, o6vVar);
        z6v z6vVar = this.m;
        z6vVar.getClass();
        xdr xdrVar = z6vVar.j;
        Map map = (Map) xdrVar.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ?? r4 = (k6v) entry.getValue();
            r4.getClass();
            ?? r9 = j6v.a;
            if (!r4.equals(r9)) {
                if (!(r4 instanceof i6v)) {
                    b6e.s();
                    return;
                }
                r9 = (i6v) r4;
                m6v m6vVar2 = r9.a.a;
                if (m6vVar2.a.equals(str)) {
                    r9 = new i6v(new q6v(m6vVar2, o6vVar));
                }
            }
            linkedHashMap.put(key, r9);
        }
        xdrVar.m(null, linkedHashMap);
        xdr xdrVar2 = z6vVar.k;
        n9v n9vVar = (n9v) xdrVar2.getValue();
        n9vVar.getClass();
        boolean equals = n9vVar.equals(j9v.a);
        n9v n9vVar2 = n9vVar;
        if (!equals) {
            boolean equals2 = n9vVar.equals(l9v.a);
            n9vVar2 = n9vVar;
            if (!equals2) {
                boolean z = n9vVar instanceof m9v;
                n9vVar2 = n9vVar;
                if (!z) {
                    boolean z2 = n9vVar instanceof k9v;
                    n9vVar2 = n9vVar;
                    if (!z2) {
                        if (!(n9vVar instanceof i9v)) {
                            b6e.s();
                            return;
                        }
                        i9v i9vVar = (i9v) n9vVar;
                        m6v m6vVar3 = i9vVar.b.a;
                        n9vVar2 = i9vVar;
                        if (m6vVar3.a.equals(str)) {
                            q6v q6vVar = new q6v(m6vVar3, o6vVar);
                            String str2 = i9vVar.a;
                            str2.getClass();
                            n9vVar2 = new i9v(str2, q6vVar);
                        }
                    }
                }
            }
        }
        xdrVar2.m(null, n9vVar2);
        x97.y(z6vVar.g, null, null, new y6v(z6vVar, k7vVar, continuation, 0), 3);
        z6vVar.h.setValue(z6vVar, z6v.n[0], x97.y(z6vVar.g, null, null, new h0t(l7vVar, z6vVar, k7vVar, continuation, 20), 3));
    }
}
