package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ppv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ vpv a;
    public final /* synthetic */ kqv b;
    public final /* synthetic */ kqv c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ppv(vpv vpvVar, kqv kqvVar, kqv kqvVar2, int i, View view) {
        this.a = vpvVar;
        this.b = kqvVar;
        this.c = kqvVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        vpv vpvVar = this.a;
        upv upvVar = vpvVar.a;
        upvVar.e(animatedFraction);
        float c = upvVar.c();
        PathInterpolator pathInterpolator = rpv.e;
        int i = Build.VERSION.SDK_INT;
        kqv kqvVar = this.b;
        aqv zpvVar = i >= 34 ? new zpv(kqvVar) : i >= 30 ? new ypv(kqvVar) : i >= 29 ? new xpv(kqvVar) : new wpv(kqvVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            hqv hqvVar = kqvVar.a;
            if (i3 == 0) {
                zpvVar.c(i2, hqvVar.g(i2));
            } else {
                zne g = hqvVar.g(i2);
                zne g2 = this.c.a.g(i2);
                float f = 1.0f - c;
                zpvVar.c(i2, kqv.e(g, (int) (((g.a - g2.a) * f) + 0.5d), (int) (((g.b - g2.b) * f) + 0.5d), (int) (((g.c - g2.c) * f) + 0.5d), (int) (((g.d - g2.d) * f) + 0.5d)));
            }
        }
        rpv.h(this.e, zpvVar.b(), Collections.singletonList(vpvVar));
    }
}
