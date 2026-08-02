package defpackage;

/* loaded from: classes4.dex */
public final class bw3 {
    public final String a;
    public final String b;

    public bw3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw3)) {
            return false;
        }
        bw3 bw3Var = (bw3) obj;
        return this.a.equals(bw3Var.a) && this.b.equals(bw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("CardData(cardNumber=", this.a, ", expireDate=", this.b, ")");
    }
}
