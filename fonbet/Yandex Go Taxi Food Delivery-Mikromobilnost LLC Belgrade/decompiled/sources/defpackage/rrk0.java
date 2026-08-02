package defpackage;

/* loaded from: classes10.dex */
public final class rrk0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rrk0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrk0)) {
            return false;
        }
        rrk0 rrk0Var = (rrk0) obj;
        return this.a == rrk0Var.a && this.b == rrk0Var.b && this.c == rrk0Var.c && this.d == rrk0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return n.n(sb, this.d, ')');
    }
}
