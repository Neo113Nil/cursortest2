package com.gamericefishpro.space.h2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public w1(View view) {
        com.gamericefishpro.space.n.q qVar;
        this.a = -1;
        this.b = view;
        PorterDuff.Mode mode = com.gamericefishpro.space.n.q.b;
        synchronized (com.gamericefishpro.space.n.q.class) {
            try {
                if (com.gamericefishpro.space.n.q.c == null) {
                    com.gamericefishpro.space.n.q.c();
                }
                qVar = com.gamericefishpro.space.n.q.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = qVar;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((com.gamericefishpro.space.n.w1) this.d) != null) {
                if (((com.gamericefishpro.space.n.w1) this.f) == null) {
                    this.f = new com.gamericefishpro.space.n.w1();
                }
                com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.f;
                w1Var.a = null;
                w1Var.d = false;
                w1Var.b = null;
                w1Var.c = false;
                Field field = com.gamericefishpro.space.d4.l0.a;
                ColorStateList colorStateListC = com.gamericefishpro.space.d4.d0.c(view);
                if (colorStateListC != null) {
                    w1Var.d = true;
                    w1Var.a = colorStateListC;
                }
                PorterDuff.Mode modeD = com.gamericefishpro.space.d4.d0.d(view);
                if (modeD != null) {
                    w1Var.c = true;
                    w1Var.b = modeD;
                }
                if (w1Var.d || w1Var.c) {
                    com.gamericefishpro.space.n.q.d(background, w1Var, view.getDrawableState());
                    return;
                }
            }
            com.gamericefishpro.space.n.w1 w1Var2 = (com.gamericefishpro.space.n.w1) this.e;
            if (w1Var2 != null) {
                com.gamericefishpro.space.n.q.d(background, w1Var2, view.getDrawableState());
                return;
            }
            com.gamericefishpro.space.n.w1 w1Var3 = (com.gamericefishpro.space.n.w1) this.d;
            if (w1Var3 != null) {
                com.gamericefishpro.space.n.q.d(background, w1Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.e;
        if (w1Var != null) {
            return w1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.e;
        if (w1Var != null) {
            return w1Var.b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = com.gamericefishpro.space.j.a.t;
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) cVarT.i;
        View view2 = (View) this.b;
        com.gamericefishpro.space.d4.l0.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) cVarT.i, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                com.gamericefishpro.space.n.q qVar = (com.gamericefishpro.space.n.q) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (qVar) {
                    colorStateListF = qVar.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                com.gamericefishpro.space.d4.d0.g(view, cVarT.k(1));
            }
            if (typedArray.hasValue(2)) {
                com.gamericefishpro.space.d4.d0.h(view, com.gamericefishpro.space.n.q0.b(typedArray.getInt(2, -1), null));
            }
            cVarT.u();
        } catch (Throwable th) {
            cVarT.u();
            throw th;
        }
    }

    public com.gamericefishpro.space.f5.w e(String route) {
        com.gamericefishpro.space.f5.v vVar;
        Intrinsics.checkNotNullParameter(route, "route");
        com.gamericefishpro.space.oh.s sVar = (com.gamericefishpro.space.oh.s) this.f;
        if (sVar == null || (vVar = (com.gamericefishpro.space.f5.v) sVar.getValue()) == null) {
            return null;
        }
        int i = com.gamericefishpro.space.f5.x.w;
        String uriString = route != null ? "android-app://androidx.navigation/".concat(route) : "";
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Bundle bundleD = vVar.d(uri, (LinkedHashMap) this.d);
        if (bundleD == null) {
            return null;
        }
        return new com.gamericefishpro.space.f5.w((com.gamericefishpro.space.f5.x) this.b, bundleD, vVar.l, vVar.b(uri), false);
    }

    public void f() {
        this.a = -1;
        h(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateListF;
        this.a = i;
        com.gamericefishpro.space.n.q qVar = (com.gamericefishpro.space.n.q) this.c;
        if (qVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (qVar) {
                colorStateListF = qVar.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        h(colorStateListF);
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((com.gamericefishpro.space.n.w1) this.d) == null) {
                this.d = new com.gamericefishpro.space.n.w1();
            }
            com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.d;
            w1Var.a = colorStateList;
            w1Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void i(ColorStateList colorStateList) {
        if (((com.gamericefishpro.space.n.w1) this.e) == null) {
            this.e = new com.gamericefishpro.space.n.w1();
        }
        com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.e;
        w1Var.a = colorStateList;
        w1Var.d = true;
        a();
    }

    public void j(PorterDuff.Mode mode) {
        if (((com.gamericefishpro.space.n.w1) this.e) == null) {
            this.e = new com.gamericefishpro.space.n.w1();
        }
        com.gamericefishpro.space.n.w1 w1Var = (com.gamericefishpro.space.n.w1) this.e;
        w1Var.b = mode;
        w1Var.c = true;
        a();
    }

    public w1() {
        this.b = new com.gamericefishpro.space.f2.m[32];
        this.c = new float[32];
        this.d = new byte[32];
        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.t.q0.a;
        this.e = new com.gamericefishpro.space.t.i0();
        this.f = new com.gamericefishpro.space.t.i0();
    }
}
