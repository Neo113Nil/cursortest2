package defpackage;

/* loaded from: classes2.dex */
public final class wn4 {
    public final String a;
    public final String b;

    public wn4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn4)) {
            return false;
        }
        wn4 wn4Var = (wn4) obj;
        return jl40.l(this.a, wn4Var.a) && jl40.l(this.b, wn4Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(discountPercent=");
        sb.append(this.a);
        sb.append(", pointsText=");
        return b64.p(sb, this.b, ')');
    }
}
