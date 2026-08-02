package defpackage;

/* loaded from: classes7.dex */
public final class ty71 implements kq71 {
    public final int a;
    public final int b;
    public final int c;
    public final float w;

    public ty71(int i, int i2, int i3, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ty71) {
            ty71 ty71Var = (ty71) obj;
            if (this.a == ty71Var.a && this.b == ty71Var.b && this.c == ty71Var.c && this.w == ty71Var.w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.w) + ((((((this.a + 217) * 31) + this.b) * 31) + this.c) * 31);
    }
}
