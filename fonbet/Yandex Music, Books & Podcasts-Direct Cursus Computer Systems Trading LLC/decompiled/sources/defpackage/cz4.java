package defpackage;

/* loaded from: classes3.dex */
public final class cz4 {
    public final xiu a;
    public final bz4 b;

    public cz4(xiu xiuVar, bz4 bz4Var) {
        this.a = xiuVar;
        this.b = bz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz4)) {
            return false;
        }
        cz4 cz4Var = (cz4) obj;
        return this.a.equals(cz4Var.a) && this.b.equals(cz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 1853891874) * 31);
    }

    public final String toString() {
        return "CollectionLandingConfig(skeletonId=collection, landingRepository=" + this.a + ", blockRegistry=" + this.b + ")";
    }
}
