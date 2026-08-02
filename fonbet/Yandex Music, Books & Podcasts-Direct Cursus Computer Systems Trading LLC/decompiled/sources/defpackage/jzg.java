package defpackage;

/* loaded from: classes3.dex */
public final class jzg {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;

    public jzg(float f, float f2, float f3, float f4, int i, int i2, int i3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzg)) {
            return false;
        }
        jzg jzgVar = (jzg) obj;
        return Float.compare(this.a, jzgVar.a) == 0 && Float.compare(this.b, jzgVar.b) == 0 && Float.compare(this.c, jzgVar.c) == 0 && Float.compare(this.d, jzgVar.d) == 0 && this.e == jzgVar.e && this.f == jzgVar.f && this.g == jzgVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + f1d.a(this.f, f1d.a(this.e, eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieMarkerProgress(loadingEnd=");
        sb.append(this.a);
        sb.append(", successStart=");
        sb.append(this.b);
        sb.append(", successEnd=");
        sb.append(this.c);
        sb.append(", playingEnd=");
        sb.append(this.d);
        sb.append(", loadingDurationMs=");
        hrg.w(this.e, this.f, ", successDurationMs=", ", playingDurationMs=", sb);
        return f1d.i(sb, this.g, ")");
    }
}
