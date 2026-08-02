package defpackage;

/* loaded from: classes4.dex */
public final class u84 {
    public final String a;
    public final String b;

    public u84(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u84)) {
            return false;
        }
        u84 u84Var = (u84) obj;
        return this.a.equals(u84Var.a) && this.b.equals(u84Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("CastTrackInfo(url=", this.a, ", contentType=", this.b, ")");
    }
}
