package androidx.work;

import J0.g;
import J0.j;
import i1.C4585b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // J0.j
    public final g a(ArrayList arrayList) {
        C4585b c4585b = new C4585b(9);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((g) it.next()).f1419a));
        }
        c4585b.s(hashMap);
        g gVar = new g((HashMap) c4585b.f38152u);
        g.c(gVar);
        return gVar;
    }
}
