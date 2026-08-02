package defpackage;

/* loaded from: classes4.dex */
public final class wrw implements zrw {
    public final yc5 a;
    public final k3q b;

    public wrw(yc5 yc5Var, k3q k3qVar) {
        k3qVar.getClass();
        this.a = yc5Var;
        this.b = k3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrw)) {
            return false;
        }
        wrw wrwVar = (wrw) obj;
        return this.a.equals(wrwVar.a) && this.b == wrwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistContentId(contentId=" + this.a + ", subtype=" + this.b + ")";
    }
}
