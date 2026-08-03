package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f4388a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4389b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4390c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4391d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4392e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4393f;

    public n(View view) {
        o oVar;
        this.f4388a = -1;
        this.f4389b = view;
        PorterDuff.Mode mode = o.f4397b;
        synchronized (o.class) {
            try {
                if (o.f4398c == null) {
                    o.b();
                }
                oVar = o.f4398c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4390c = oVar;
    }

    public void a() {
        View view = (View) this.f4389b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((l1) this.f4391d) != null) {
                if (((l1) this.f4393f) == null) {
                    this.f4393f = new l1();
                }
                l1 l1Var = (l1) this.f4393f;
                l1Var.f4380a = null;
                l1Var.f4383d = false;
                l1Var.f4381b = null;
                l1Var.f4382c = false;
                Field field = h3.w.f2829a;
                ColorStateList c3 = h3.q.c(view);
                if (c3 != null) {
                    l1Var.f4383d = true;
                    l1Var.f4380a = c3;
                }
                PorterDuff.Mode d10 = h3.q.d(view);
                if (d10 != null) {
                    l1Var.f4382c = true;
                    l1Var.f4381b = d10;
                }
                if (l1Var.f4383d || l1Var.f4382c) {
                    o.c(background, l1Var, view.getDrawableState());
                    return;
                }
            }
            l1 l1Var2 = (l1) this.f4392e;
            if (l1Var2 != null) {
                o.c(background, l1Var2, view.getDrawableState());
                return;
            }
            l1 l1Var3 = (l1) this.f4391d;
            if (l1Var3 != null) {
                o.c(background, l1Var3, view.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i10) {
        ColorStateList f10;
        View view = (View) this.f4389b;
        Context context = view.getContext();
        int[] iArr = i.a.f2929t;
        a5.c C = a5.c.C(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) C.f261g;
        View view2 = (View) this.f4389b;
        h3.w.a(view2, view2.getContext(), iArr, attributeSet, (TypedArray) C.f261g, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f4388a = typedArray.getResourceId(0, -1);
                o oVar = (o) this.f4390c;
                Context context2 = view.getContext();
                int i11 = this.f4388a;
                synchronized (oVar) {
                    f10 = oVar.f4399a.f(context2, i11);
                }
                if (f10 != null) {
                    d(f10);
                }
            }
            if (typedArray.hasValue(1)) {
                h3.q.e(view, C.u(1));
            }
            if (typedArray.hasValue(2)) {
                h3.q.f(view, c0.b(typedArray.getInt(2, -1), null));
            }
            C.F();
        } catch (Throwable th) {
            C.F();
            throw th;
        }
    }

    public void c(int i10) {
        ColorStateList colorStateList;
        this.f4388a = i10;
        o oVar = (o) this.f4390c;
        if (oVar != null) {
            Context context = ((View) this.f4389b).getContext();
            synchronized (oVar) {
                colorStateList = oVar.f4399a.f(context, i10);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((l1) this.f4391d) == null) {
                this.f4391d = new l1();
            }
            l1 l1Var = (l1) this.f4391d;
            l1Var.f4380a = colorStateList;
            l1Var.f4383d = true;
        } else {
            this.f4391d = null;
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (((l1) this.f4392e) == null) {
            this.f4392e = new l1();
        }
        l1 l1Var = (l1) this.f4392e;
        l1Var.f4380a = colorStateList;
        l1Var.f4383d = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (((l1) this.f4392e) == null) {
            this.f4392e = new l1();
        }
        l1 l1Var = (l1) this.f4392e;
        l1Var.f4381b = mode;
        l1Var.f4382c = true;
        a();
    }

    public n() {
        this.f4389b = new v1.m[32];
        this.f4390c = new float[32];
        this.f4391d = new byte[32];
        int i10 = s.p0.f6316a;
        this.f4392e = new s.h0();
        this.f4393f = new s.h0();
    }
}
