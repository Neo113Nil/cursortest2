package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;

/* loaded from: classes6.dex */
public final class xq00 {
    public final long a;
    public f4c0 b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public xq00(int i) {
        this.a = 300L;
        final int i2 = 0;
        sls slsVar = new sls(this) { // from class: vq00
            public final /* synthetic */ xq00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                final xq00 xq00Var = this.b;
                switch (i3) {
                    case 0:
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat.setDuration(xq00Var.a);
                        final int i4 = 0;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wq00
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i5 = i4;
                                xq00 xq00Var2 = xq00Var;
                                switch (i5) {
                                    case 0:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        return ofFloat;
                    default:
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat2.setDuration(xq00Var.a);
                        final int i5 = 1;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wq00
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i5;
                                xq00 xq00Var2 = xq00Var;
                                switch (i52) {
                                    case 0:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        return ofFloat2;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = a.b(lazyThreadSafetyMode, slsVar);
        final int i3 = 1;
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: vq00
            public final /* synthetic */ xq00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                final xq00 xq00Var = this.b;
                switch (i32) {
                    case 0:
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat.setDuration(xq00Var.a);
                        final int i4 = 0;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wq00
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i4;
                                xq00 xq00Var2 = xq00Var;
                                switch (i52) {
                                    case 0:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        return ofFloat;
                    default:
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat2.setDuration(xq00Var.a);
                        final int i5 = 1;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wq00
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i52 = i5;
                                xq00 xq00Var2 = xq00Var;
                                switch (i52) {
                                    case 0:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        xq00Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        return ofFloat2;
                }
            }
        });
        this.e = a.b(lazyThreadSafetyMode, new qxz(29));
    }

    public final void a(float f) {
        f4c0 f4c0Var = this.b;
        if (f4c0Var != null) {
            f4c0Var.A(f);
        }
        f4c0 f4c0Var2 = this.b;
        if (f4c0Var2 != null) {
            f4c0Var2.C(Collections.singletonList(new PointF(1.0f, f)));
        }
    }

    public final void b() {
        c().end();
        d().end();
        ((AnimatorSet) this.e.getValue()).end();
    }

    public final ValueAnimator c() {
        return (ValueAnimator) this.c.getValue();
    }

    public final ValueAnimator d() {
        return (ValueAnimator) this.d.getValue();
    }

    public final void e(yj2 yj2Var) {
        i3y i3yVar = this.e;
        ((AnimatorSet) i3yVar.getValue()).playSequentially(c(), d());
        ((AnimatorSet) i3yVar.getValue()).start();
        yj2Var.a((AnimatorSet) i3yVar.getValue());
    }

    public final void f(sls slsVar) {
        c().addListener(new AnimUtils$AnimationEndListener(new p500(6, slsVar, this)));
    }

    public xq00() {
        this(0);
    }
}
