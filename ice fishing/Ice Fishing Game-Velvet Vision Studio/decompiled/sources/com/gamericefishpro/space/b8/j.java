package com.gamericefishpro.space.b8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r {
    public final h a;

    public j(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        Object obj2 = q.d;
        if (obj2.equals(obj2)) {
            return this.a.equals(((j) rVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((q.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + q.d + ", androidClientInfo=" + this.a + "}";
    }
}
