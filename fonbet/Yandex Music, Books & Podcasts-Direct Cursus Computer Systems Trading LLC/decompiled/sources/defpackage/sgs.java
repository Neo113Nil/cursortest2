package defpackage;

/* loaded from: classes3.dex */
public final class sgs implements ugs {
    public final String a;
    public final qo6 b;

    public sgs(qo6 qo6Var, String str) {
        this.a = str;
        this.b = qo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgs)) {
            return false;
        }
        sgs sgsVar = (sgs) obj;
        return this.a.equals(sgsVar.a) && this.b == sgsVar.b;
    }

    @Override // defpackage.ugs
    public final qo6 getType() {
        return this.b;
    }

    @Override // defpackage.ugs
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Simple(url=" + this.a + ", type=" + this.b + ")";
    }
}
