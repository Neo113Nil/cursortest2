package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public final class eup {
    public static final ctn m = new ctn(0.5f);
    public ff7 a = new vgo();
    public ff7 b = new vgo();
    public ff7 c = new vgo();
    public ff7 d = new vgo();
    public zl6 e = new h5(0.0f);
    public zl6 f = new h5(0.0f);
    public zl6 g = new h5(0.0f);
    public zl6 h = new h5(0.0f);
    public h1b i = new h1b();
    public h1b j = new h1b();
    public h1b k = new h1b();
    public h1b l = new h1b();

    public static iz7 a(Context context, int i, int i2) {
        return b(context, i, i2, new h5(0));
    }

    public static iz7 b(Context context, int i, int i2, zl6 zl6Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(vdn.N);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            zl6 e = e(obtainStyledAttributes, 5, zl6Var);
            zl6 e2 = e(obtainStyledAttributes, 8, e);
            zl6 e3 = e(obtainStyledAttributes, 9, e);
            zl6 e4 = e(obtainStyledAttributes, 7, e);
            zl6 e5 = e(obtainStyledAttributes, 6, e);
            iz7 iz7Var = new iz7();
            iz7Var.a = rvf.y(i4);
            iz7Var.e = e2;
            iz7Var.b = rvf.y(i5);
            iz7Var.f = e3;
            iz7Var.c = rvf.y(i6);
            iz7Var.g = e4;
            iz7Var.d = rvf.y(i7);
            iz7Var.h = e5;
            return iz7Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static iz7 c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new h5(0));
    }

    public static iz7 d(Context context, AttributeSet attributeSet, int i, int i2, zl6 zl6Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.E, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, zl6Var);
    }

    public static zl6 e(TypedArray typedArray, int i, zl6 zl6Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new h5(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new ctn(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return zl6Var;
    }

    public final boolean f() {
        return (this.b instanceof vgo) && (this.a instanceof vgo) && (this.c instanceof vgo) && (this.d instanceof vgo);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.l.getClass().equals(h1b.class) && this.j.getClass().equals(h1b.class) && this.i.getClass().equals(h1b.class) && this.k.getClass().equals(h1b.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && f();
    }

    public final iz7 h() {
        iz7 iz7Var = new iz7();
        iz7Var.a = this.a;
        iz7Var.b = this.b;
        iz7Var.c = this.c;
        iz7Var.d = this.d;
        iz7Var.e = this.e;
        iz7Var.f = this.f;
        iz7Var.g = this.g;
        iz7Var.h = this.h;
        iz7Var.i = this.i;
        iz7Var.j = this.j;
        iz7Var.k = this.k;
        iz7Var.l = this.l;
        return iz7Var;
    }

    public final eup i(float f) {
        iz7 h = h();
        h.m(f);
        return h.e();
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
