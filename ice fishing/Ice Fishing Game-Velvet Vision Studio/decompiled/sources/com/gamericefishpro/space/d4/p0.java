package com.gamericefishpro.space.d4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ o1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public p0(x0 x0Var, o1 o1Var, o1 o1Var2, int i, View view) {
        this.a = x0Var;
        this.b = o1Var;
        this.c = o1Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d1 z0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        x0 x0Var = this.a;
        w0 w0Var = x0Var.a;
        w0Var.e(animatedFraction);
        o1 o1Var = this.b;
        l1 l1Var = o1Var.a;
        float fC = w0Var.c();
        PathInterpolator pathInterpolator = t0.e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            z0Var = new c1(o1Var);
        } else if (i >= 31) {
            z0Var = new b1(o1Var);
        } else if (i >= 30) {
            z0Var = new a1(o1Var);
        } else {
            z0Var = i >= 29 ? new z0(o1Var) : new y0(o1Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                z0Var.c(i2, l1Var.g(i2));
            } else {
                com.gamericefishpro.space.u3.b bVarG = l1Var.g(i2);
                com.gamericefishpro.space.u3.b bVarG2 = this.c.a.g(i2);
                float f = 1.0f - fC;
                z0Var.c(i2, o1.b(bVarG, (int) (((double) ((bVarG.a - bVarG2.a) * f)) + 0.5d), (int) (((double) ((bVarG.b - bVarG2.b) * f)) + 0.5d), (int) (((double) ((bVarG.c - bVarG2.c) * f)) + 0.5d), (int) (((double) ((bVarG.d - bVarG2.d) * f)) + 0.5d)));
            }
        }
        t0.h(this.e, z0Var.b(), Collections.singletonList(x0Var));
    }
}
