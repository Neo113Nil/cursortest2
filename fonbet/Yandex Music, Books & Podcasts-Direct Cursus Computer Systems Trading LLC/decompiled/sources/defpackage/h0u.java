package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h0u extends j0u {
    public final LinkedHashMap a;
    public final int b;

    public h0u(LinkedHashMap linkedHashMap, int i) {
        this.a = linkedHashMap;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0u)) {
            return false;
        }
        h0u h0uVar = (h0u) obj;
        return this.a.equals(h0uVar.a) && this.b == h0uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        LinkedHashMap linkedHashMap = this.a;
        int i = 0;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() instanceof ryo) {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("Failure: Too few trusted SCTs, required ");
        sb.append(this.b);
        sb.append(", found ");
        sb.append(i);
        sb.append(" in ");
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + ':' + entry.getValue());
        }
        sb.append(arrayList);
        return sb.toString();
    }
}
