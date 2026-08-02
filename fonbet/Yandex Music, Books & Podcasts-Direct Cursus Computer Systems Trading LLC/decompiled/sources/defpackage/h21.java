package defpackage;

/* loaded from: classes4.dex */
public final class h21 {
    public final String a;
    public final o43 b;
    public final boolean c;

    public h21(String str, o43 o43Var, boolean z) {
        this.a = str;
        this.b = o43Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h21)) {
            return false;
        }
        h21 h21Var = (h21) obj;
        return this.a.equals(h21Var.a) && this.b.equals(h21Var.b) && this.c == h21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistBrandedButton(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", viewInBrowser=");
        return ouj.r(sb, this.c, ")");
    }
}
