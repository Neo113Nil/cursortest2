package defpackage;

/* loaded from: classes4.dex */
public final class pz1 {
    public final String a;
    public final String b;

    public pz1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        pz1 pz1Var = (pz1) obj;
        return this.a.equals(pz1Var.a) && this.b.equals(pz1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("AuthCredentials(clientID=", this.a, ", clientSecret=", this.b, ")");
    }
}
