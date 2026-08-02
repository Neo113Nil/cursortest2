package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    private float f11213e;

    public e(View view) {
        super(view);
        this.f11213e = 0.95f;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final ValueAnimator e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, this.f11213e);
        ofFloat.setDuration(500L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.a.a.e.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = e.this.f11193a;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                e.this.f11193a.setScaleX(floatValue);
                e.this.f11193a.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    public final void g() {
        this.f11213e = 0.85f;
    }
}
