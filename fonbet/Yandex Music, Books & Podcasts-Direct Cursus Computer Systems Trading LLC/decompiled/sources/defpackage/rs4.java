package defpackage;

/* loaded from: classes4.dex */
public final class rs4 {
    public final String a;
    public final gps b;
    public final pd3 c;

    public rs4(String str, gps gpsVar, pd3 pd3Var) {
        this.a = str;
        this.b = gpsVar;
        this.c = pd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs4)) {
            return false;
        }
        rs4 rs4Var = (rs4) obj;
        return this.a.equals(rs4Var.a) && this.b.equals(rs4Var.b) && this.c.equals(rs4Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CollageItemUiData(contentBackground=" + this.a + ", topBlock=" + this.b + ", bottomBlock=" + this.c + ")";
    }
}
