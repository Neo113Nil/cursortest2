package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class k implements n, j {
    public final HashMap d = new HashMap();

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.d.equals(((k) obj).d);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final n f(String str) {
        HashMap map = this.d;
        return map.containsKey(str) ? (n) map.get(str) : n.j;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return new i(this.d.keySet().iterator());
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.gamericefishpro.space.i9.j
    public final boolean i(String str) {
        return this.d.containsKey(str);
    }

    @Override // com.gamericefishpro.space.i9.n
    public n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : j.d(this, new q(str), nVar, arrayList);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return "[object Object]";
    }

    @Override // com.gamericefishpro.space.i9.j
    public final void n(String str, n nVar) {
        HashMap map = this.d;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        k kVar = new k();
        for (Map.Entry entry : this.d.entrySet()) {
            boolean z = entry.getValue() instanceof j;
            HashMap map = kVar.d;
            if (z) {
                map.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((n) entry.getValue()).o());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.d;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
