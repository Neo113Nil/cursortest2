package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class q831 extends s831 {
    public final LinkedHashMap j;
    public final int k;

    public q831(LinkedHashMap linkedHashMap, int i) {
        this.j = linkedHashMap;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q831)) {
            return false;
        }
        q831 q831Var = (q831) obj;
        return this.j.equals(q831Var.j) && this.k == q831Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + (this.j.hashCode() * 31);
    }

    public final String toString() {
        LinkedHashMap linkedHashMap = this.j;
        int i = 0;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() instanceof klp0) {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("Failure: Too few trusted SCTs, required ");
        sb.append(this.k);
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
