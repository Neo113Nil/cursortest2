package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0 f2171n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A0 f2172u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A0 f2173v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2174w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f2175x;

    public h0(n0 n0Var, A0 a02, A0 a03, int i, View view) {
        this.f2171n = n0Var;
        this.f2172u = a02;
        this.f2173v = a03;
        this.f2174w = i;
        this.f2175x = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n0 n0Var = this.f2171n;
        n0Var.f2202a.d(animatedFraction);
        float b9 = n0Var.f2202a.b();
        PathInterpolator pathInterpolator = j0.f2179e;
        int i4 = Build.VERSION.SDK_INT;
        A0 a02 = this.f2172u;
        s0 r0Var = i4 >= 30 ? new r0(a02) : i4 >= 29 ? new q0(a02) : new p0(a02);
        int i6 = 1;
        while (i6 <= 256) {
            int i9 = this.f2174w & i6;
            y0 y0Var = a02.f2115a;
            if (i9 == 0) {
                r0Var.c(i6, y0Var.f(i6));
                f2 = b9;
                i = 1;
            } else {
                G.e f9 = y0Var.f(i6);
                G.e f10 = this.f2173v.f2115a.f(i6);
                float f11 = 1.0f - b9;
                f2 = b9;
                i = 1;
                r0Var.c(i6, A0.e(f9, (int) (((f9.f1031a - f10.f1031a) * f11) + 0.5d), (int) (((f9.f1032b - f10.f1032b) * f11) + 0.5d), (int) (((f9.f1033c - f10.f1033c) * f11) + 0.5d), (int) (((f9.f1034d - f10.f1034d) * f11) + 0.5d)));
            }
            i6 <<= i;
            b9 = f2;
        }
        j0.g(this.f2175x, r0Var.b(), Collections.singletonList(n0Var));
    }
}
