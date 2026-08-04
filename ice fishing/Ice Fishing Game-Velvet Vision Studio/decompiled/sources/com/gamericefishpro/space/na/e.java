package com.gamericefishpro.space.na;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final a j;
    public final b k;
    public AnimatorSet l;
    public ValueAnimator m;

    public e(p pVar) {
        super(pVar);
        this.j = new a(this, 0);
        this.k = new b(this, 0);
        this.e = com.gamericefishpro.space.a.a.B(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = com.gamericefishpro.space.a.a.B(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = com.gamericefishpro.space.a.a.C(pVar.getContext(), R.attr.motionEasingLinearInterpolator, com.gamericefishpro.space.t9.a.a);
        this.h = com.gamericefishpro.space.a.a.C(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.gamericefishpro.space.t9.a.d);
    }

    @Override // com.gamericefishpro.space.na.q
    public final void a() {
        if (this.b.I != null) {
            return;
        }
        s(t());
    }

    @Override // com.gamericefishpro.space.na.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.gamericefishpro.space.na.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.gamericefishpro.space.na.q
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // com.gamericefishpro.space.na.q
    public final void o(boolean z) {
        if (this.b.I == null) {
            return;
        }
        s(z);
    }

    @Override // com.gamericefishpro.space.na.q
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.gamericefishpro.space.na.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        e eVar = this.b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.b;
                        eVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.gamericefishpro.space.na.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        e eVar = this.b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.b;
                        eVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new d(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.gamericefishpro.space.na.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        e eVar = this.b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.b;
                        eVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this, i));
    }

    @Override // com.gamericefishpro.space.na.q
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new com.appsflyer.a(12, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
