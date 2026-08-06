package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0131a;
import java.lang.reflect.Field;
import y.AbstractC1083p;

/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218n {

    /* renamed from: a, reason: collision with root package name */
    public final View f3291a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219o f3292b;

    /* renamed from: c, reason: collision with root package name */
    public int f3293c = -1;

    /* renamed from: d, reason: collision with root package name */
    public J1.h f3294d;

    /* renamed from: e, reason: collision with root package name */
    public J1.h f3295e;

    /* renamed from: f, reason: collision with root package name */
    public J1.h f3296f;

    public C0218n(View view) {
        C0219o c0219o;
        this.f3291a = view;
        PorterDuff.Mode mode = C0219o.f3310b;
        synchronized (C0219o.class) {
            try {
                if (C0219o.f3311c == null) {
                    C0219o.b();
                }
                c0219o = C0219o.f3311c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3292b = c0219o;
    }

    public final void a() {
        View view = this.f3291a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3294d != null) {
                if (this.f3296f == null) {
                    this.f3296f = new J1.h();
                }
                J1.h hVar = this.f3296f;
                hVar.f868c = null;
                hVar.f867b = false;
                hVar.f869d = null;
                hVar.f866a = false;
                Field field = y.x.f8596a;
                ColorStateList g2 = AbstractC1083p.g(view);
                if (g2 != null) {
                    hVar.f867b = true;
                    hVar.f868c = g2;
                }
                PorterDuff.Mode h2 = AbstractC1083p.h(view);
                if (h2 != null) {
                    hVar.f866a = true;
                    hVar.f869d = h2;
                }
                if (hVar.f867b || hVar.f866a) {
                    C0219o.c(background, hVar, view.getDrawableState());
                    return;
                }
            }
            J1.h hVar2 = this.f3295e;
            if (hVar2 != null) {
                C0219o.c(background, hVar2, view.getDrawableState());
                return;
            }
            J1.h hVar3 = this.f3294d;
            if (hVar3 != null) {
                C0219o.c(background, hVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList f2;
        View view = this.f3291a;
        I0.b H2 = I0.b.H(view.getContext(), attributeSet, AbstractC0131a.f2637u, i2);
        TypedArray typedArray = (TypedArray) H2.f722c;
        try {
            if (typedArray.hasValue(0)) {
                this.f3293c = typedArray.getResourceId(0, -1);
                C0219o c0219o = this.f3292b;
                Context context = view.getContext();
                int i3 = this.f3293c;
                synchronized (c0219o) {
                    f2 = c0219o.f3312a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList z2 = H2.z(1);
                Field field = y.x.f8596a;
                AbstractC1083p.q(view, z2);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC0227x.c(typedArray.getInt(2, -1), null);
                Field field2 = y.x.f8596a;
                AbstractC1083p.r(view, c2);
            }
        } finally {
            H2.K();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f3293c = i2;
        C0219o c0219o = this.f3292b;
        if (c0219o != null) {
            Context context = this.f3291a.getContext();
            synchronized (c0219o) {
                colorStateList = c0219o.f3312a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3294d == null) {
                this.f3294d = new J1.h();
            }
            J1.h hVar = this.f3294d;
            hVar.f868c = colorStateList;
            hVar.f867b = true;
        } else {
            this.f3294d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f3295e == null) {
            this.f3295e = new J1.h();
        }
        J1.h hVar = this.f3295e;
        hVar.f868c = colorStateList;
        hVar.f867b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f3295e == null) {
            this.f3295e = new J1.h();
        }
        J1.h hVar = this.f3295e;
        hVar.f869d = mode;
        hVar.f866a = true;
        a();
    }
}
