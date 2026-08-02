package defpackage;

/* loaded from: classes6.dex */
public final class i5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public i5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return Float.compare(this.a, i5Var.a) == 0 && Float.compare(this.b, i5Var.b) == 0 && Float.compare(this.c, i5Var.c) == 0 && Float.compare(this.d, i5Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePixelPadding(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", bottom=");
        return ouj.p(sb, this.d, ')');
    }
}
