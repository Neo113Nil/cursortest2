package com.gamericefishpro.space.b8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends w {
    public final v a;
    public final u b;

    public o(v vVar, u uVar) {
        this.a = vVar;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            v vVar = this.a;
            if (vVar != null ? vVar.equals(((o) wVar).a) : ((o) wVar).a == null) {
                u uVar = this.b;
                if (uVar != null ? uVar.equals(((o) wVar).b) : ((o) wVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        v vVar = this.a;
        int iHashCode = ((vVar == null ? 0 : vVar.hashCode()) ^ 1000003) * 1000003;
        u uVar = this.b;
        return (uVar != null ? uVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
