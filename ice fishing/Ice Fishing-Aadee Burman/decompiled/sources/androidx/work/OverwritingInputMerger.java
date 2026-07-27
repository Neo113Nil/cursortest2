package androidx.work;

import J0.g;
import J0.h;
import J0.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // J0.k
    public final h a(ArrayList arrayList) {
        g gVar = new g(0);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((h) it.next()).f1391a));
        }
        gVar.a(hashMap);
        h hVar = new h(gVar.f1388a);
        h.c(hVar);
        return hVar;
    }
}
