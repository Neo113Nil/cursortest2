package defpackage;

/* loaded from: classes.dex */
public final class udo {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public udo(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udo)) {
            return false;
        }
        udo udoVar = (udo) obj;
        return this.a == udoVar.a && this.b == udoVar.b && this.c == udoVar.c && this.d == udoVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return ouj.p(sb, this.d, ')');
    }
}
