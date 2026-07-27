package h;

import L.C0051b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0097a;
import java.lang.reflect.Field;
import w.AbstractC0284p;

/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final C0171o f2228b;

    /* renamed from: c, reason: collision with root package name */
    public int f2229c = -1;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2230d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2231e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2232f;

    public C0170n(View view) {
        C0171o c0171o;
        this.f2227a = view;
        PorterDuff.Mode mode = C0171o.f2235b;
        synchronized (C0171o.class) {
            try {
                if (C0171o.f2236c == null) {
                    C0171o.b();
                }
                c0171o = C0171o.f2236c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2228b = c0171o;
    }

    public final void a() {
        View view = this.f2227a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2230d != null) {
                if (this.f2232f == null) {
                    this.f2232f = new j0();
                }
                j0 j0Var = this.f2232f;
                j0Var.f2209a = null;
                j0Var.f2212d = false;
                j0Var.f2210b = null;
                j0Var.f2211c = false;
                Field field = w.x.f3069a;
                ColorStateList g2 = AbstractC0284p.g(view);
                if (g2 != null) {
                    j0Var.f2212d = true;
                    j0Var.f2209a = g2;
                }
                PorterDuff.Mode h2 = AbstractC0284p.h(view);
                if (h2 != null) {
                    j0Var.f2211c = true;
                    j0Var.f2210b = h2;
                }
                if (j0Var.f2212d || j0Var.f2211c) {
                    C0171o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f2231e;
            if (j0Var2 != null) {
                C0171o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f2230d;
            if (j0Var3 != null) {
                C0171o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList f2;
        View view = this.f2227a;
        C0051b E2 = C0051b.E(view.getContext(), attributeSet, AbstractC0097a.f1648u, i2);
        TypedArray typedArray = (TypedArray) E2.f602g;
        try {
            if (typedArray.hasValue(0)) {
                this.f2229c = typedArray.getResourceId(0, -1);
                C0171o c0171o = this.f2228b;
                Context context = view.getContext();
                int i3 = this.f2229c;
                synchronized (c0171o) {
                    f2 = c0171o.f2237a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList w2 = E2.w(1);
                Field field = w.x.f3069a;
                AbstractC0284p.q(view, w2);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC0180y.c(typedArray.getInt(2, -1), null);
                Field field2 = w.x.f3069a;
                AbstractC0284p.r(view, c2);
            }
        } finally {
            E2.H();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f2229c = i2;
        C0171o c0171o = this.f2228b;
        if (c0171o != null) {
            Context context = this.f2227a.getContext();
            synchronized (c0171o) {
                colorStateList = c0171o.f2237a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2230d == null) {
                this.f2230d = new j0();
            }
            j0 j0Var = this.f2230d;
            j0Var.f2209a = colorStateList;
            j0Var.f2212d = true;
        } else {
            this.f2230d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f2231e == null) {
            this.f2231e = new j0();
        }
        j0 j0Var = this.f2231e;
        j0Var.f2209a = colorStateList;
        j0Var.f2212d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f2231e == null) {
            this.f2231e = new j0();
        }
        j0 j0Var = this.f2231e;
        j0Var.f2210b = mode;
        j0Var.f2211c = true;
        a();
    }
}
