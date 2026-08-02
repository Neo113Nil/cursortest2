package defpackage;

/* loaded from: classes4.dex */
public final class yy1 {
    public static final yy1 e = new yy1(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public yy1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1Var = (yy1) obj;
        return Float.compare(this.a, yy1Var.a) == 0 && Float.compare(this.b, yy1Var.b) == 0 && Float.compare(this.c, yy1Var.c) == 0 && Float.compare(this.d, yy1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "AudioVisualizationData(lowValue=" + this.a + ", midValue=" + this.b + ", lowMidValue=" + this.c + ", highMid=" + this.d + ")";
    }
}
