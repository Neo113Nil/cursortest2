package defpackage;

/* loaded from: classes3.dex */
public final class vc2 extends hq6 {
    public final String a;
    public final String b;

    public vc2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hq6) {
            vc2 vc2Var = (vc2) ((hq6) obj);
            if (this.a.equals(vc2Var.a) && this.b.equals(vc2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return su4.o(sb, this.b, "}");
    }
}
