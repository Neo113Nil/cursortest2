package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import defpackage.yx01;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class yx01 {
    public boolean b;
    public final ValueAnimator a = ValueAnimator.ofFloat(0.0f, 1.0f);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public final ValueAnimator a() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator.isStarted()) {
            return valueAnimator;
        }
        valueAnimator.setDuration(b());
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new mxp0(23, this));
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.taxi.cars.api.transition.Transition$getAnimator$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                yx01.this.c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                yx01 yx01Var = yx01.this;
                if (yx01Var.b) {
                    return;
                }
                yx01Var.d();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                yx01.this.e();
            }
        });
        return valueAnimator;
    }

    public int b() {
        return Constants.MINIMAL_ERROR_STATUS_CODE;
    }

    public void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void d() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void f(float f) {
    }
}
