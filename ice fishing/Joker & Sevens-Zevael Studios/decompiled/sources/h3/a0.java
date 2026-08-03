package h3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f2740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2743e;

    public a0(i0 i0Var, a1 a1Var, a1 a1Var2, int i10, View view) {
        this.f2739a = i0Var;
        this.f2740b = a1Var;
        this.f2741c = a1Var2;
        this.f2742d = i10;
        this.f2743e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i0 i0Var = this.f2739a;
        h0 h0Var = i0Var.f2788a;
        h0Var.e(animatedFraction);
        a1 a1Var = this.f2740b;
        x0 x0Var = a1Var.f2745a;
        float c3 = h0Var.c();
        PathInterpolator pathInterpolator = e0.f2770e;
        int i10 = Build.VERSION.SDK_INT;
        p0 o0Var = i10 >= 34 ? new o0(a1Var) : i10 >= 31 ? new n0(a1Var) : i10 >= 30 ? new m0(a1Var) : i10 >= 29 ? new l0(a1Var) : new j0(a1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.f2742d & i11) == 0) {
                o0Var.c(i11, x0Var.f(i11));
            } else {
                a3.b f10 = x0Var.f(i11);
                a3.b f11 = this.f2741c.f2745a.f(i11);
                float f12 = 1.0f - c3;
                o0Var.c(i11, a1.a(f10, (int) (((f10.f194a - f11.f194a) * f12) + 0.5d), (int) (((f10.f195b - f11.f195b) * f12) + 0.5d), (int) (((f10.f196c - f11.f196c) * f12) + 0.5d), (int) (((f10.f197d - f11.f197d) * f12) + 0.5d)));
            }
        }
        e0.h(this.f2743e, o0Var.b(), Collections.singletonList(i0Var));
    }
}
