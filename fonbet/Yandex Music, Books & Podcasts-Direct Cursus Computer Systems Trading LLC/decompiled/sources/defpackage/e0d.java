package defpackage;

/* loaded from: classes3.dex */
public final class e0d {
    public final d0d a;
    public final boolean b;
    public final boolean c;

    public e0d(d0d d0dVar, boolean z, boolean z2) {
        this.a = d0dVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0d)) {
            return false;
        }
        e0d e0dVar = (e0d) obj;
        return this.a.equals(e0dVar.a) && this.b == e0dVar.b && this.c == e0dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryConfig(initialPage=");
        sb.append(this.a);
        sb.append(", isAutoscrollEnabled=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        return ouj.r(sb, this.c, ")");
    }
}
