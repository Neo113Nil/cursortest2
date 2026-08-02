package defpackage;

/* loaded from: classes7.dex */
public final class ws71 implements kq71 {
    public static final ws71 z = new ws71(0, 0, 1, 1, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final int x;
    public se3 y;

    public ws71(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ws71.class == obj.getClass()) {
            ws71 ws71Var = (ws71) obj;
            if (this.a == ws71Var.a && this.b == ws71Var.b && this.c == ws71Var.c && this.w == ws71Var.w && this.x == ws71Var.x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + this.w) * 31) + this.x;
    }
}
