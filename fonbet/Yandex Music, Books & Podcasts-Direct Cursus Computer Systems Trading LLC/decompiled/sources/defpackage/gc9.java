package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class gc9 {
    public int a;
    public final Object b;
    public final Object c;

    public gc9(yon yonVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = yonVar;
    }

    public static gc9 a(yon yonVar, int i) {
        if (i == 0) {
            return new cxj(yonVar, 0);
        }
        if (i == 1) {
            return new cxj(yonVar, 1);
        }
        xq0.x("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract Float i(int i);

    public abstract int j();

    public abstract int k();

    public Float l(int i) {
        int i2 = this.a;
        cc9 cc9Var = (cc9) this.b;
        int ordinal = ((cb9) this.c).ordinal();
        if (ordinal == 0) {
            Float i3 = i(i);
            if (i3 == null) {
                return null;
            }
            return Float.valueOf((i2 - cc9Var.g) - i3.floatValue());
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Float.valueOf(cc9Var.h);
            }
            b6e.s();
            return null;
        }
        Float i4 = i(i);
        if (i4 == null) {
            return null;
        }
        return Float.valueOf((i2 - i4.floatValue()) / 2.0f);
    }

    public Float m(int i) {
        int i2 = this.a;
        cc9 cc9Var = (cc9) this.b;
        int ordinal = ((cb9) this.c).ordinal();
        if (ordinal == 0) {
            return Float.valueOf(cc9Var.g);
        }
        if (ordinal == 1) {
            Float i3 = i(i);
            if (i3 == null) {
                return null;
            }
            return Float.valueOf((i2 - i3.floatValue()) / 2.0f);
        }
        if (ordinal != 2) {
            b6e.s();
            return null;
        }
        Float i4 = i(i);
        if (i4 == null) {
            return null;
        }
        return Float.valueOf((i2 - cc9Var.h) - i4.floatValue());
    }

    public abstract int n();

    public abstract int o();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public gc9(int i, cc9 cc9Var, cb9 cb9Var) {
        this.a = i;
        this.b = cc9Var;
        this.c = cb9Var;
    }

    public gc9(q3b q3bVar) {
        this.a = 0;
        this.c = new qm7();
        this.b = q3bVar;
    }
}
