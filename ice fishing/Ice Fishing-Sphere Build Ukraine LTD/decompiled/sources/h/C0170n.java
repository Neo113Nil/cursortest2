package h;

import L.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0097a;
import java.lang.reflect.Field;
import w.AbstractC0278p;

/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2235a;

    /* renamed from: b, reason: collision with root package name */
    public final C0171o f2236b;

    /* renamed from: c, reason: collision with root package name */
    public int f2237c = -1;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2238d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2239e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2240f;

    public C0170n(View view) {
        C0171o c0171o;
        this.f2235a = view;
        PorterDuff.Mode mode = C0171o.f2243b;
        synchronized (C0171o.class) {
            try {
                if (C0171o.f2244c == null) {
                    C0171o.b();
                }
                c0171o = C0171o.f2244c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2236b = c0171o;
    }

    public final void a() {
        View view = this.f2235a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2238d != null) {
                if (this.f2240f == null) {
                    this.f2240f = new j0();
                }
                j0 j0Var = this.f2240f;
                j0Var.f2217a = null;
                j0Var.f2220d = false;
                j0Var.f2218b = null;
                j0Var.f2219c = false;
                Field field = w.x.f3074a;
                ColorStateList g2 = AbstractC0278p.g(view);
                if (g2 != null) {
                    j0Var.f2220d = true;
                    j0Var.f2217a = g2;
                }
                PorterDuff.Mode h2 = AbstractC0278p.h(view);
                if (h2 != null) {
                    j0Var.f2219c = true;
                    j0Var.f2218b = h2;
                }
                if (j0Var.f2220d || j0Var.f2219c) {
                    C0171o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f2239e;
            if (j0Var2 != null) {
                C0171o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f2238d;
            if (j0Var3 != null) {
                C0171o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList f2;
        View view = this.f2235a;
        C0026b E2 = C0026b.E(view.getContext(), attributeSet, AbstractC0097a.f1656u, i2);
        TypedArray typedArray = (TypedArray) E2.f524f;
        try {
            if (typedArray.hasValue(0)) {
                this.f2237c = typedArray.getResourceId(0, -1);
                C0171o c0171o = this.f2236b;
                Context context = view.getContext();
                int i3 = this.f2237c;
                synchronized (c0171o) {
                    f2 = c0171o.f2245a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList w2 = E2.w(1);
                Field field = w.x.f3074a;
                AbstractC0278p.q(view, w2);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC0180y.c(typedArray.getInt(2, -1), null);
                Field field2 = w.x.f3074a;
                AbstractC0278p.r(view, c2);
            }
        } finally {
            E2.H();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f2237c = i2;
        C0171o c0171o = this.f2236b;
        if (c0171o != null) {
            Context context = this.f2235a.getContext();
            synchronized (c0171o) {
                colorStateList = c0171o.f2245a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2238d == null) {
                this.f2238d = new j0();
            }
            j0 j0Var = this.f2238d;
            j0Var.f2217a = colorStateList;
            j0Var.f2220d = true;
        } else {
            this.f2238d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f2239e == null) {
            this.f2239e = new j0();
        }
        j0 j0Var = this.f2239e;
        j0Var.f2217a = colorStateList;
        j0Var.f2220d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f2239e == null) {
            this.f2239e = new j0();
        }
        j0 j0Var = this.f2239e;
        j0Var.f2218b = mode;
        j0Var.f2219c = true;
        a();
    }
}
