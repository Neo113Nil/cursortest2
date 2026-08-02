package defpackage;

/* loaded from: classes4.dex */
public final class tl2 {
    public final String a;
    public final String b;

    public tl2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl2)) {
            return false;
        }
        tl2 tl2Var = (tl2) obj;
        return this.a.equals(tl2Var.a) && this.b.equals(tl2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("BankData(name=", this.a, ", scheme=", this.b, ")");
    }
}
