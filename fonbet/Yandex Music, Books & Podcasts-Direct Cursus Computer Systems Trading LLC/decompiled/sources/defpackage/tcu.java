package defpackage;

/* loaded from: classes.dex */
public final class tcu {
    public static final tcu d = new tcu(0, 1.0f, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        int i = dvt.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public tcu(int i, float f2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tcu) {
            tcu tcuVar = (tcu) obj;
            if (this.a == tcuVar.a && this.b == tcuVar.b && this.c == tcuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }
}
