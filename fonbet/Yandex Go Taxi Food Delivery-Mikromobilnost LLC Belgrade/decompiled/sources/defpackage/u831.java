package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class u831 extends ua91 {
    public final LinkedHashMap j;

    public u831(LinkedHashMap linkedHashMap) {
        this.j = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u831) && this.j.equals(((u831) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success: SCT trusted logs ");
        LinkedHashMap linkedHashMap = this.j;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + ':' + entry.getValue());
        }
        sb.append(arrayList);
        return sb.toString();
    }
}
