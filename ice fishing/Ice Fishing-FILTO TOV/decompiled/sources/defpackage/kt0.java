package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kt0 {
    public static final kt0 OOA6hdeuvCS = new kt0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float GWasM1elztuh;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public kt0(float f, float f2, float f3, float f4) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
    }

    public final long GWasM1elztuh() {
        float f = this.X1lG3V04pd;
        float f2 = this.GWasM1elztuh;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.xqGvceK5x;
        float f5 = this.Yi7zF1RB1;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final kt0 OOA6hdeuvCS(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new kt0(Float.intBitsToFloat(i) + this.GWasM1elztuh, Float.intBitsToFloat(i2) + this.Yi7zF1RB1, Float.intBitsToFloat(i) + this.X1lG3V04pd, Float.intBitsToFloat(i2) + this.xqGvceK5x);
    }

    public final kt0 X1lG3V04pd(kt0 kt0Var) {
        return new kt0(Math.max(this.GWasM1elztuh, kt0Var.GWasM1elztuh), Math.max(this.Yi7zF1RB1, kt0Var.Yi7zF1RB1), Math.min(this.X1lG3V04pd, kt0Var.X1lG3V04pd), Math.min(this.xqGvceK5x, kt0Var.xqGvceK5x));
    }

    public final long Yi7zF1RB1() {
        float f = this.X1lG3V04pd - this.GWasM1elztuh;
        float f2 = this.xqGvceK5x - this.Yi7zF1RB1;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt0)) {
            return false;
        }
        kt0 kt0Var = (kt0) obj;
        return Float.compare(this.GWasM1elztuh, kt0Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, kt0Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, kt0Var.X1lG3V04pd) == 0 && Float.compare(this.xqGvceK5x, kt0Var.xqGvceK5x) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.xqGvceK5x) + mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + fb1.ZCWXqiC0(this.GWasM1elztuh) + ", " + fb1.ZCWXqiC0(this.Yi7zF1RB1) + ", " + fb1.ZCWXqiC0(this.X1lG3V04pd) + ", " + fb1.ZCWXqiC0(this.xqGvceK5x) + ')';
    }

    public final kt0 xqGvceK5x(float f, float f2) {
        return new kt0(this.GWasM1elztuh + f, this.Yi7zF1RB1 + f2, this.X1lG3V04pd + f, this.xqGvceK5x + f2);
    }
}
