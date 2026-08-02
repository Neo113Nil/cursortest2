package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class sqq {
    public static final xdr a = ydr.a(c5b.a);
    public static final xdr b = ydr.a(-1);

    public static final j2s a(ge geVar) {
        Iterable<fe> iterable = (Iterable) geVar.e.b.invoke();
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        for (fe feVar : iterable) {
            arrayList.add(new l0s(feVar.a, feVar.b, feVar.c, feVar.d));
        }
        return new j2s(arrayList, b, geVar.f, true);
    }

    public static final j2s b(v2s v2sVar) {
        v2sVar.getClass();
        tqq tqqVar = v2sVar.a;
        List<r0s> c = tqqVar.c();
        ArrayList arrayList = new ArrayList(v75.o(c, 10));
        for (r0s r0sVar : c) {
            arrayList.add(new k0s(r0sVar.a, r0sVar.b));
        }
        return new j2s(arrayList, tqqVar.j(), a, false);
    }
}
