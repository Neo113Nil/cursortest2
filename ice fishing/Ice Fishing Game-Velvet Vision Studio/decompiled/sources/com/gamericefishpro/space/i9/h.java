package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements n, j {
    public final String d;
    public final HashMap e = new HashMap();

    public h(String str) {
        this.d = str;
    }

    public abstract n a(com.gamericefishpro.space.u6.n nVar, List list);

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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.d;
        if (str != null) {
            return str.equals(hVar.d);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final n f(String str) {
        HashMap map = this.e;
        return map.containsKey(str) ? (n) map.get(str) : n.j;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return new i(this.e.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final boolean i(String str) {
        return this.e.containsKey(str);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.d) : j.d(this, new q(str), nVar, arrayList);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.i9.j
    public final void n(String str, n nVar) {
        HashMap map = this.e;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public n o() {
        return this;
    }
}
