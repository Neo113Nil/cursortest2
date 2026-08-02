package defpackage;

/* loaded from: classes3.dex */
public final class d1d {
    public final jd6 a;
    public final boolean b;
    public final boolean c;

    public d1d(jd6 jd6Var, boolean z, boolean z2) {
        this.a = jd6Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1d)) {
            return false;
        }
        d1d d1dVar = (d1d) obj;
        return this.a.equals(d1dVar.a) && this.b == d1dVar.b && this.c == d1dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryWidgetConfig(photosContentScale=");
        sb.append(this.a);
        sb.append(", applyItemsDarkening=");
        sb.append(this.b);
        sb.append(", isZoomFeatureEnabled=");
        return ouj.r(sb, this.c, ")");
    }
}
