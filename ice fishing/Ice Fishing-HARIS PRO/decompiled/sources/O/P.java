package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class P implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f760d;
    public final /* synthetic */ View e;

    public P(X x2, j0 j0Var, j0 j0Var2, int i, View view) {
        this.f757a = x2;
        this.f758b = j0Var;
        this.f759c = j0Var2;
        this.f760d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        X x2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        X x3 = this.f757a;
        x3.f776a.d(animatedFraction);
        float b2 = x3.f776a.b();
        PathInterpolator pathInterpolator = T.e;
        int i = Build.VERSION.SDK_INT;
        j0 j0Var = this.f758b;
        b0 a0Var = i >= 30 ? new a0(j0Var) : i >= 29 ? new Z(j0Var) : new Y(j0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f760d & i2;
            h0 h0Var = j0Var.f819a;
            if (i3 == 0) {
                a0Var.c(i2, h0Var.f(i2));
                f2 = b2;
                x2 = x3;
            } else {
                G.c f3 = h0Var.f(i2);
                G.c f4 = this.f759c.f819a.f(i2);
                int i4 = (int) (((f3.f261a - f4.f261a) * r10) + 0.5d);
                int i5 = (int) (((f3.f262b - f4.f262b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f263c - f4.f263c) * r10) + 0.5d);
                float f5 = (f3.f264d - f4.f264d) * (1.0f - b2);
                x2 = x3;
                a0Var.c(i2, j0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            x3 = x2;
        }
        T.g(this.e, a0Var.b(), Collections.singletonList(x3));
    }
}
