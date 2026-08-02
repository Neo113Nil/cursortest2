package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class t1q0 implements bnr0 {
    public final HashMap a;

    public t1q0(HashMap hashMap) {
        this.a = hashMap;
    }

    public static final void c(HashMap hashMap, HashMap hashMap2) {
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            HashSet hashSet = (HashSet) hashMap.get(str);
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            hashSet.addAll(list);
            hashMap.put(str, hashSet);
        }
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof t1q0)) {
            return this;
        }
        HashMap hashMap = new HashMap();
        c(hashMap, this.a);
        c(hashMap, ((t1q0) bnr0Var).a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(hashMap.size()));
        for (Map.Entry entry : hashMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), a.J0((Iterable) entry.getValue()));
        }
        return new t1q0(linkedHashMap);
    }

    public final List b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterable iterable = (List) this.a.get((String) it.next());
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            ycc.r(iterable, hashSet);
        }
        return a.J0(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return t1q0.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((t1q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SectionLabelsSharedData(labelToSectionIds=" + this.a + Extension.C_BRAKE;
    }
}
