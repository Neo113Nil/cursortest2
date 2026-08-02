package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jq0 {
    public final View a;
    public kj3 d;
    public kj3 e;
    public kj3 f;
    public int c = -1;
    public final ir0 b = ir0.a();

    public jq0(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new kj3();
                }
                kj3 kj3Var = this.f;
                kj3Var.d = null;
                kj3Var.c = false;
                kj3Var.e = null;
                kj3Var.b = false;
                WeakHashMap weakHashMap = wdu.a;
                ColorStateList d = ndu.d(view);
                if (d != null) {
                    kj3Var.c = true;
                    kj3Var.d = d;
                }
                PorterDuff.Mode e = ndu.e(view);
                if (e != null) {
                    kj3Var.b = true;
                    kj3Var.e = e;
                }
                if (kj3Var.c || kj3Var.b) {
                    ir0.e(background, kj3Var, view.getDrawableState());
                    return;
                }
            }
            kj3 kj3Var2 = this.e;
            if (kj3Var2 != null) {
                ir0.e(background, kj3Var2, view.getDrawableState());
                return;
            }
            kj3 kj3Var3 = this.d;
            if (kj3Var3 != null) {
                ir0.e(background, kj3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        kj3 kj3Var = this.e;
        if (kj3Var != null) {
            return (ColorStateList) kj3Var.d;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        kj3 kj3Var = this.e;
        if (kj3Var != null) {
            return (PorterDuff.Mode) kj3Var.e;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList g;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = ken.B;
        lum W = lum.W(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) W.b;
        View view2 = this.a;
        wdu.p(view2, view2.getContext(), iArr, attributeSet, (TypedArray) W.b, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                ir0 ir0Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (ir0Var) {
                    g = ir0Var.a.g(context2, i2);
                }
                if (g != null) {
                    g(g);
                }
            }
            if (typedArray.hasValue(1)) {
                ndu.j(view, W.J(1));
            }
            if (typedArray.hasValue(2)) {
                ndu.k(view, xpa.c(typedArray.getInt(2, -1), null));
            }
            W.f0();
        } catch (Throwable th) {
            W.f0();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        ir0 ir0Var = this.b;
        if (ir0Var != null) {
            Context context = this.a.getContext();
            synchronized (ir0Var) {
                colorStateList = ir0Var.a.g(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new kj3();
            }
            kj3 kj3Var = this.d;
            kj3Var.d = colorStateList;
            kj3Var.c = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new kj3();
        }
        kj3 kj3Var = this.e;
        kj3Var.d = colorStateList;
        kj3Var.c = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new kj3();
        }
        kj3 kj3Var = this.e;
        kj3Var.e = mode;
        kj3Var.b = true;
        a();
    }
}
