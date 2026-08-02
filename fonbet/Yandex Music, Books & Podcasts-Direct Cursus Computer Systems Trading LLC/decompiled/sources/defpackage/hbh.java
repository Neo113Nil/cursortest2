package defpackage;

/* loaded from: classes3.dex */
public final class hbh {
    public static final hbh e = new hbh(0.0f, 0.0f, 0.0f, 0);
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public hbh(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbh)) {
            return false;
        }
        hbh hbhVar = (hbh) obj;
        return Float.compare(this.a, hbhVar.a) == 0 && Float.compare(this.b, hbhVar.b) == 0 && Float.compare(this.c, hbhVar.c) == 0 && this.d == hbhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "MarqueeInfo(contentWidth=" + this.a + ", contentWidthWithSpacing=" + this.b + ", viewportWidth=" + this.c + ", animationDurationMs=" + this.d + ")";
    }
}
