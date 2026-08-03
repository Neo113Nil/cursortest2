package h3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final z f2768a;

    /* renamed from: b, reason: collision with root package name */
    public a1 f2769b;

    public d0(View view, z zVar) {
        a1 a1Var;
        this.f2768a = zVar;
        Field field = w.f2829a;
        a1 a6 = r.a(view);
        if (a6 != null) {
            int i10 = Build.VERSION.SDK_INT;
            a1Var = (i10 >= 34 ? new o0(a6) : i10 >= 31 ? new n0(a6) : i10 >= 30 ? new m0(a6) : i10 >= 29 ? new l0(a6) : new j0(a6)).b();
        } else {
            a1Var = null;
        }
        this.f2769b = a1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f2769b = a1.c(view, windowInsets);
            return e0.j(view, windowInsets);
        }
        a1 c3 = a1.c(view, windowInsets);
        x0 x0Var = c3.f2745a;
        if (this.f2769b == null) {
            Field field = w.f2829a;
            this.f2769b = r.a(view);
        }
        if (this.f2769b == null) {
            this.f2769b = c3;
            return e0.j(view, windowInsets);
        }
        z k3 = e0.k(view);
        if (k3 != null && Objects.equals(k3.f2836g, c3)) {
            return e0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        a1 a1Var = this.f2769b;
        int i10 = 1;
        while (i10 <= 512) {
            a3.b f10 = x0Var.f(i10);
            a3.b f11 = a1Var.f2745a.f(i10);
            int i11 = f10.f194a;
            int i12 = f10.f197d;
            int i13 = f10.f196c;
            int i14 = f10.f195b;
            int i15 = f11.f194a;
            int i16 = f11.f197d;
            int i17 = f11.f196c;
            int i18 = f11.f195b;
            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                iArr = iArr2;
                z10 = true;
            } else {
                iArr = iArr2;
                z10 = false;
            }
            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z10) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr3[0] = iArr3[0] | i10;
                }
            }
            i10 <<= 1;
            iArr2 = iArr;
        }
        int i19 = iArr2[0];
        int i20 = iArr3[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f2769b = c3;
            return e0.j(view, windowInsets);
        }
        a1 a1Var2 = this.f2769b;
        i0 i0Var = new i0(i21, (i19 & 8) != 0 ? e0.f2770e : (i20 & 8) != 0 ? e0.f2771f : (i19 & 519) != 0 ? e0.f2772g : (i20 & 519) != 0 ? e0.f2773h : null, (i21 & 8) != 0 ? 160L : 250L);
        i0Var.f2788a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i0Var.f2788a.b());
        a3.b f12 = x0Var.f(i21);
        a3.b f13 = a1Var2.f2745a.f(i21);
        int min = Math.min(f12.f194a, f13.f194a);
        int i22 = f12.f195b;
        int i23 = f13.f195b;
        int min2 = Math.min(i22, i23);
        int i24 = f12.f196c;
        int i25 = f13.f196c;
        int min3 = Math.min(i24, i25);
        int i26 = f12.f197d;
        int i27 = f13.f197d;
        x4.l lVar = new x4.l(3, a3.b.b(min, min2, min3, Math.min(i26, i27)), a3.b.b(Math.max(f12.f194a, f13.f194a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
        e0.g(view, i0Var, c3, false);
        duration.addUpdateListener(new a0(i0Var, c3, a1Var2, i21, view));
        duration.addListener(new b0(view, i0Var));
        c0 c0Var = new c0(view, i0Var, lVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        i iVar = new i(view, c0Var);
        view.getViewTreeObserver().addOnPreDrawListener(iVar);
        view.addOnAttachStateChangeListener(iVar);
        this.f2769b = c3;
        return e0.j(view, windowInsets);
    }
}
