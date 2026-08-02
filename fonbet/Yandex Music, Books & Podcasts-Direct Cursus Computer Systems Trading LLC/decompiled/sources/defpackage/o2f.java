package defpackage;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class o2f extends AbstractMap implements Cloneable {
    public final HashSet a = new HashSet();
    public final String b;

    public o2f(String str) {
        this.b = str;
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        o2f o2fVar = new o2f(this.b);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getValue();
            if (str != null && !o2fVar.containsKey(str.toLowerCase())) {
                o2fVar.a.add(new n2f(str));
            }
        }
        return o2fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.a;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        if (isEmpty()) {
            sb.append("empty");
        } else {
            Iterator it = values().iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}
