package ru.yandex.taxi.search.overlay.legacy.animations;

import android.animation.ValueAnimator;
import defpackage.ah00;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.vb3;

/* loaded from: classes6.dex */
public final class a {
    public final ah00 a;
    public final ney b;
    public o2y0 c;
    public boolean d;
    public float e = 17.0f;
    public final ValueAnimator f = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(60000L);
    public final vb3 g = new vb3(7, this);

    public a(ah00 ah00Var, ney neyVar) {
        this.a = ah00Var;
        this.b = neyVar;
    }

    public final void a(o2y0 o2y0Var) {
        this.c = o2y0Var;
        if (!this.d) {
            this.e = 17.0f;
        }
        ((gh00) this.a).J(this.e);
        boolean z = this.d;
        ValueAnimator valueAnimator = this.f;
        if (z) {
            valueAnimator.resume();
        } else if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.yandex.taxi.search.overlay.legacy.animations.MapZoomAnimator$UpdateListener
            private float lastFraction;

            public final float getLastFraction() {
                return this.lastFraction;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float animatedFraction = valueAnimator2.getAnimatedFraction() - this.lastFraction;
                this.lastFraction = valueAnimator2.getAnimatedFraction();
                a aVar = a.this;
                float f = aVar.e;
                float b = g8e.b(10.0f, f, animatedFraction, f);
                aVar.e = b;
                ((gh00) aVar.a).J(Math.min(Math.max(10.0f, b), 17.0f));
            }

            public final void setLastFraction(float f) {
                this.lastFraction = f;
            }
        });
        this.b.b(this, this.g);
        this.d = true;
    }

    public final void b(boolean z) {
        ValueAnimator valueAnimator = this.f;
        valueAnimator.removeAllUpdateListeners();
        if (!z) {
            valueAnimator.pause();
            return;
        }
        this.d = false;
        this.b.d(this);
        this.c = null;
        valueAnimator.cancel();
    }
}
