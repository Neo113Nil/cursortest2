package defpackage;

/* loaded from: classes4.dex */
public final class zdl {
    public final String a;
    public final String b;

    public zdl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdl)) {
            return false;
        }
        zdl zdlVar = (zdl) obj;
        return this.a.equals(zdlVar.a) && this.b.equals(zdlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("PlayerInformerDonationData(url=", this.a, ", goal=", this.b, ")");
    }
}
