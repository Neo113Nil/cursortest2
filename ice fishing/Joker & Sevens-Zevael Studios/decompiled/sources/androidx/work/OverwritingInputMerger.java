package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import m7.g;
import o4.e;
import o4.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // o4.h
    public final e a(ArrayList arrayList) {
        g gVar = new g(2);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hashMap.putAll(Collections.unmodifiableMap(((e) obj).f5206a));
        }
        gVar.t(hashMap);
        e eVar = new e((HashMap) gVar.f4957h);
        e.c(eVar);
        return eVar;
    }
}
