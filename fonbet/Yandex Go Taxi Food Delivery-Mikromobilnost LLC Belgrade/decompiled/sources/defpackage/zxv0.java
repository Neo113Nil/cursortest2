package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes14.dex */
public final class zxv0 {
    public final GoFrameLayout a;
    public final nao0 b;
    public final uyo0 c;
    public final PathInterpolator d = new PathInterpolator(0.5f, 0.0f, 0.0f, 1.0f);
    public ValueAnimator e;

    public zxv0(GoFrameLayout goFrameLayout, nao0 nao0Var, uyo0 uyo0Var) {
        this.a = goFrameLayout;
        this.b = nao0Var;
        this.c = uyo0Var;
    }

    public final void a(final boolean z) {
        ValueAnimator valueAnimator;
        float floatValue = ((Number) this.b.invoke()).floatValue();
        GoFrameLayout goFrameLayout = this.a;
        if (floatValue <= 0.0f) {
            floatValue = goFrameLayout.getHeight();
            if (floatValue <= 0.0f) {
                floatValue = 200.0f;
            }
        }
        if (z && goFrameLayout.getVisibility() != 0) {
            goFrameLayout.setTranslationY(floatValue);
            goFrameLayout.setVisibility(0);
        }
        float c = y6i0.c(1.0f - (goFrameLayout.getTranslationY() / floatValue), 0.0f, 1.0f);
        float f = z ? 1.0f : 0.0f;
        if (c == f && ((valueAnimator = this.e) == null || !valueAnimator.isRunning())) {
            goFrameLayout.setVisibility(z ? 0 : 8);
            float f2 = f * floatValue;
            goFrameLayout.setTranslationY(floatValue - f2);
            this.c.invoke(Float.valueOf(f2));
            return;
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c, f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(this.d);
        ofFloat.addUpdateListener(new bjc(floatValue, this, 2));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.animator.SuperAppDiscoveryMapSearchbarAnimator$animateTo$1$2
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (z || this.cancelled) {
                    return;
                }
                this.a.setVisibility(8);
            }
        });
        ofFloat.start();
        this.e = ofFloat;
    }
}
