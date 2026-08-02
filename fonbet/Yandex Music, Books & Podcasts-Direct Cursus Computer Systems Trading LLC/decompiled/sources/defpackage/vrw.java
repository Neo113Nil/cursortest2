package defpackage;

/* loaded from: classes4.dex */
public final class vrw implements zrw {
    public final xc5 a;
    public final i3q b;

    public vrw(xc5 xc5Var, i3q i3qVar) {
        i3qVar.getClass();
        this.a = xc5Var;
        this.b = i3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrw)) {
            return false;
        }
        vrw vrwVar = (vrw) obj;
        return this.a.equals(vrwVar.a) && this.b == vrwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumContentId(contentId=" + this.a + ", subtype=" + this.b + ")";
    }
}
