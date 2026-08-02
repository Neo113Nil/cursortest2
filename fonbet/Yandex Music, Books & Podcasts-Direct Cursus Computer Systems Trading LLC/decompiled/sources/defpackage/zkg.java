package defpackage;

/* loaded from: classes3.dex */
public final class zkg {
    public final j1g a;
    public final boolean b;
    public final boolean c;

    public zkg(j1g j1gVar, boolean z, boolean z2) {
        this.a = j1gVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkg)) {
            return false;
        }
        zkg zkgVar = (zkg) obj;
        return this.a == zkgVar.a && this.b == zkgVar.b && this.c == zkgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalLikeState(likeState=");
        sb.append(this.a);
        sb.append(", likeSupport=");
        sb.append(this.b);
        sb.append(", dislikeSupport=");
        return ouj.r(sb, this.c, ")");
    }
}
