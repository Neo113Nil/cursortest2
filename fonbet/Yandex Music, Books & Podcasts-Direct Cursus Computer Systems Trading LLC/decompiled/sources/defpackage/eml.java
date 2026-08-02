package defpackage;

/* loaded from: classes4.dex */
public final class eml {
    public static final eml d = new eml(j1g.b, false, false);
    public final j1g a;
    public final boolean b;
    public final boolean c;

    public eml(j1g j1gVar, boolean z, boolean z2) {
        j1gVar.getClass();
        this.a = j1gVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eml)) {
            return false;
        }
        eml emlVar = (eml) obj;
        return this.a == emlVar.a && this.b == emlVar.b && this.c == emlVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerScreenPlayableLikeState(likeState=");
        sb.append(this.a);
        sb.append(", likeAvailable=");
        sb.append(this.b);
        sb.append(", dislikeAvailable=");
        return ouj.r(sb, this.c, ")");
    }
}
