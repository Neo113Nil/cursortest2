package com.gamericefishpro.space.d4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements View.OnApplyWindowInsetsListener {
    public final o0 a;
    public o1 b;

    public s0(View view, o0 o0Var) {
        o1 o1VarB;
        this.a = o0Var;
        Field field = l0.a;
        o1 o1VarA = e0.a(view);
        if (o1VarA != null) {
            int i = Build.VERSION.SDK_INT;
            o1VarB = (i >= 34 ? new c1(o1VarA) : i >= 31 ? new b1(o1VarA) : i >= 30 ? new a1(o1VarA) : i >= 29 ? new z0(o1VarA) : new y0(o1VarA)).b();
        } else {
            o1VarB = null;
        }
        this.b = o1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = o1.d(view, windowInsets);
            return t0.j(view, windowInsets);
        }
        o1 o1VarD = o1.d(view, windowInsets);
        l1 l1Var = o1VarD.a;
        if (this.b == null) {
            Field field = l0.a;
            this.b = e0.a(view);
        }
        if (this.b == null) {
            this.b = o1VarD;
            return t0.j(view, windowInsets);
        }
        o0 o0VarK = t0.k(view);
        if (o0VarK != null && Objects.equals((o1) o0VarK.e, o1VarD)) {
            return t0.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        o1 o1Var = this.b;
        int i = 1;
        while (i <= 512) {
            com.gamericefishpro.space.u3.b bVarG = l1Var.g(i);
            com.gamericefishpro.space.u3.b bVarG2 = o1Var.a.g(i);
            int i2 = bVarG.a;
            int i3 = bVarG.d;
            int i4 = bVarG.c;
            int i5 = bVarG.b;
            int i6 = bVarG2.a;
            int i7 = bVarG2.d;
            int i8 = bVarG2.c;
            int i9 = bVarG2.b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = o1VarD;
            return t0.j(view, windowInsets);
        }
        o1 o1Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = t0.e;
        } else if ((i11 & 8) != 0) {
            interpolator = t0.f;
        } else if ((i10 & 519) != 0) {
            interpolator = t0.g;
        } else {
            interpolator = (i11 & 519) != 0 ? t0.h : null;
        }
        x0 x0Var = new x0(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        x0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(x0Var.a.b());
        com.gamericefishpro.space.u3.b bVarG3 = l1Var.g(i12);
        com.gamericefishpro.space.u3.b bVarG4 = o1Var2.a.g(i12);
        int iMin = Math.min(bVarG3.a, bVarG4.a);
        int i13 = bVarG3.b;
        int i14 = bVarG4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = bVarG3.c;
        int i16 = bVarG4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = bVarG3.d;
        int i18 = bVarG4.d;
        com.gamericefishpro.space.u6.e eVar = new com.gamericefishpro.space.u6.e(1, com.gamericefishpro.space.u3.b.b(iMin, iMin2, iMin3, Math.min(i17, i18)), com.gamericefishpro.space.u3.b.b(Math.max(bVarG3.a, bVarG4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        t0.g(view, x0Var, o1VarD, false);
        duration.addUpdateListener(new p0(x0Var, o1VarD, o1Var2, i12, view));
        duration.addListener(new q0(view, x0Var));
        r0 r0Var = new r0(view, x0Var, eVar, duration, 0);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        r rVar = new r(view, r0Var);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        this.b = o1VarD;
        return t0.j(view, windowInsets);
    }
}
