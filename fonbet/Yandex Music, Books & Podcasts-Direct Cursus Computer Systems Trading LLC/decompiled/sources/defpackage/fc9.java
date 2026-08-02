package defpackage;

/* loaded from: classes3.dex */
public final class fc9 {
    public final int a;
    public final float b;
    public final gc9 c;
    public final cc9 d;
    public final boolean e;
    public final hb9 f;
    public final cb9 g;

    public fc9(int i, float f, gc9 gc9Var, cc9 cc9Var, boolean z, hb9 hb9Var, cb9 cb9Var) {
        this.a = i;
        this.b = f;
        this.c = gc9Var;
        this.d = cc9Var;
        this.e = z;
        this.f = hb9Var;
        this.g = cb9Var;
    }

    public static float a(float f) {
        float abs = Math.abs(f);
        return abs - ((float) Math.floor(abs));
    }

    public final float b(int i, float f, int i2) {
        gc9 gc9Var = this.c;
        Float m = gc9Var.m(i);
        if (m == null) {
            return 0.0f;
        }
        float floatValue = m.floatValue();
        Float m2 = gc9Var.m(i2);
        if (m2 == null) {
            return 0.0f;
        }
        return ((m2.floatValue() * f) + ((1 - f) * floatValue)) - this.d.g;
    }

    public final float c(int i, int i2) {
        int i3 = i2 > 0 ? i : i + 1;
        gc9 gc9Var = this.c;
        Float m = gc9Var.m(i3);
        if (m == null) {
            return 0.0f;
        }
        float floatValue = m.floatValue();
        if (i2 > 0) {
            i--;
        }
        Float l = gc9Var.l(i);
        if (l != null) {
            return ((l.floatValue() + floatValue) - this.b) * i2;
        }
        return 0.0f;
    }
}
