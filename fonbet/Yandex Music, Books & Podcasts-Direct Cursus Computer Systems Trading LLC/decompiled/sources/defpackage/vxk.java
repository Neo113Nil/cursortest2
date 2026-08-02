package defpackage;

/* loaded from: classes3.dex */
public final class vxk {
    public final u7g a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vxk(u7g u7gVar, boolean z, boolean z2, boolean z3) {
        this.a = u7gVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxk)) {
            return false;
        }
        vxk vxkVar = (vxk) obj;
        return this.a.equals(vxkVar.a) && this.b == vxkVar.b && this.c == vxkVar.c && this.d == vxkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoShot(shotIdentifier=");
        sb.append(this.a);
        sb.append(", showIcon=");
        sb.append(this.b);
        sb.append(", enableInLandscape=");
        return v3w.g(sb, this.c, ", pauseOnPlaybackPause=", this.d, ")");
    }
}
