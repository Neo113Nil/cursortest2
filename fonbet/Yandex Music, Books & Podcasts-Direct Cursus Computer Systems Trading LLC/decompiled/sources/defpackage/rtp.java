package defpackage;

/* loaded from: classes3.dex */
public final class rtp {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public rtp(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtp)) {
            return false;
        }
        rtp rtpVar = (rtp) obj;
        return Float.compare(this.a, rtpVar.a) == 0 && Float.compare(this.b, rtpVar.b) == 0 && Float.compare(this.c, rtpVar.c) == 0 && this.d == rtpVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowData(offsetX=");
        sb.append(this.a);
        sb.append(", offsetY=");
        sb.append(this.b);
        sb.append(", radius=");
        sb.append(this.c);
        sb.append(", color=");
        return vz1.r(sb, this.d, ')');
    }
}
