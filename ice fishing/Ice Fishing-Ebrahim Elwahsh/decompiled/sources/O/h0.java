package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0 f2269n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A0 f2270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A0 f2271v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2272w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f2273x;

    public h0(n0 n0Var, A0 a02, A0 a03, int i, View view) {
        this.f2269n = n0Var;
        this.f2270u = a02;
        this.f2271v = a03;
        this.f2272w = i;
        this.f2273x = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f6;
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n0 n0Var = this.f2269n;
        n0Var.f2300a.d(animatedFraction);
        float b9 = n0Var.f2300a.b();
        PathInterpolator pathInterpolator = j0.f2277e;
        int i4 = Build.VERSION.SDK_INT;
        A0 a02 = this.f2270u;
        s0 r0Var = i4 >= 30 ? new r0(a02) : i4 >= 29 ? new q0(a02) : new p0(a02);
        int i9 = 1;
        while (i9 <= 256) {
            int i10 = this.f2272w & i9;
            y0 y0Var = a02.f2213a;
            if (i10 == 0) {
                r0Var.c(i9, y0Var.f(i9));
                f6 = b9;
                i = 1;
            } else {
                G.e f9 = y0Var.f(i9);
                G.e f10 = this.f2271v.f2213a.f(i9);
                float f11 = 1.0f - b9;
                f6 = b9;
                i = 1;
                r0Var.c(i9, A0.e(f9, (int) (((f9.f1151a - f10.f1151a) * f11) + 0.5d), (int) (((f9.f1152b - f10.f1152b) * f11) + 0.5d), (int) (((f9.f1153c - f10.f1153c) * f11) + 0.5d), (int) (((f9.f1154d - f10.f1154d) * f11) + 0.5d)));
            }
            i9 <<= i;
            b9 = f6;
        }
        j0.g(this.f2273x, r0Var.b(), Collections.singletonList(n0Var));
    }
}
