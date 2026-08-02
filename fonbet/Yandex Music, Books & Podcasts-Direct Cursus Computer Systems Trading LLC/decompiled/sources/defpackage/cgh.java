package defpackage;

/* loaded from: classes3.dex */
public final class cgh {
    public final uwd a;
    public final j1g b;
    public final boolean c;
    public final boolean d;

    public cgh(uwd uwdVar, j1g j1gVar, boolean z, boolean z2) {
        j1gVar.getClass();
        this.a = uwdVar;
        this.b = j1gVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgh)) {
            return false;
        }
        cgh cghVar = (cgh) obj;
        return this.a.equals(cghVar.a) && this.b == cghVar.b && this.c == cghVar.c && this.d == cghVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Media3Rating(heartRating=");
        sb.append(this.a);
        sb.append(", likeState=");
        sb.append(this.b);
        sb.append(", likeSupport=");
        return v3w.g(sb, this.c, ", dislikeSupport=", this.d, ")");
    }
}
