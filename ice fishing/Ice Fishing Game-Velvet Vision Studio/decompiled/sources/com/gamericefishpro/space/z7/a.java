package com.gamericefishpro.space.z7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final com.gamericefishpro.space.ub.e a;
    public final b b;

    public a(com.gamericefishpro.space.ub.e eVar, b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        b bVar = aVar.b;
        if (!this.a.equals(aVar.a)) {
            return false;
        }
        Object obj2 = d.d;
        return obj2.equals(obj2) && this.b.equals(bVar);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ d.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + d.d + ", productData=" + this.b + "}";
    }
}
