package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class uxt {
    public final o57 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public lgq c;
    public Object d;

    public uxt(o57 o57Var) {
        this.a = o57Var;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.d = e5bVar;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            arrayList.add(new Pair(pair.a, (kxt) entry.getValue()));
        }
        List o0 = CollectionsKt.o0(arrayList, new t1n(14));
        lgq lgqVar = this.c;
        if (lgqVar != null) {
            lgqVar.invoke(o0);
        }
    }
}
