package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes12.dex */
public final class tge0 {
    public ValueAnimator a;
    public AnimatorSet b;
    public boolean c;
    public sge0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public qge0 h;
    public final wnb0 i = new wnb0(25, this);
    public final /* synthetic */ PreGeoAuthOnboardingModalView j;

    public tge0(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView) {
        this.j = preGeoAuthOnboardingModalView;
    }

    public static final void a(tge0 tge0Var) {
        GoImageView goImageView = PreGeoAuthOnboardingModalView.access$getBinding(tge0Var.j).j;
        if (goImageView.getWidth() <= 0 || goImageView.getHeight() <= 0) {
            return;
        }
        goImageView.setPivotX(goImageView.getWidth() / 2.0f);
        goImageView.setPivotY(goImageView.getHeight() / 2.0f);
    }

    public static final void b(tge0 tge0Var) {
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = tge0Var.j;
        GoFrameLayout goFrameLayout = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).k;
        GoConstraintLayout goConstraintLayout = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a;
        AnimatorSet animatorSet = tge0Var.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float width = goConstraintLayout.getWidth();
        if (width < 1.0f) {
            width = 1.0f;
        }
        boolean z = goConstraintLayout.getLayoutDirection() == 1;
        if (!z) {
            width = -width;
        }
        float dimension = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a.getResources().getDimension(ftg0.pre_geo_ride_icon_recoil);
        if (!z) {
            dimension = -dimension;
        }
        goFrameLayout.setTranslationX(width);
        goFrameLayout.setAlpha(1.0f);
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(goFrameLayout, (Property<GoFrameLayout, Float>) property, width, 0.0f);
        ofFloat.setDuration(900L);
        PathInterpolator pathInterpolator = vge0.a;
        ofFloat.setInterpolator(pathInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(goFrameLayout, (Property<GoFrameLayout, Float>) property, 0.0f, dimension);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, ofFloat2);
        animatorSet2.start();
        tge0Var.b = animatorSet2;
    }

    public final void c() {
        this.g = false;
        qge0 qge0Var = this.h;
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.j;
        if (qge0Var != null) {
            if (preGeoAuthOnboardingModalView.getViewTreeObserver().isAlive()) {
                preGeoAuthOnboardingModalView.getViewTreeObserver().removeOnWindowFocusChangeListener(qge0Var);
            }
            this.h = null;
        }
        PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a.removeCallbacks(this.i);
        d();
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b = null;
        this.c = false;
        GoFrameLayout goFrameLayout = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).k;
        int dimensionPixelSize = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a.getResources().getDimensionPixelSize(ftg0.pre_geo_ride_icon_gap_to_text);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) goFrameLayout.getLayoutParams();
        layoutParams.setMarginStart(dimensionPixelSize);
        goFrameLayout.setLayoutParams(layoutParams);
        goFrameLayout.setTranslationX(0.0f);
        goFrameLayout.setAlpha(1.0f);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.a = null;
        this.e = false;
        this.f = false;
    }

    public final void d() {
        sge0 sge0Var = this.d;
        if (sge0Var == null) {
            return;
        }
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.j;
        if (PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).m.getViewTreeObserver().isAlive()) {
            PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).m.getViewTreeObserver().removeOnGlobalLayoutListener(sge0Var);
        }
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, qge0] */
    public final void e() {
        int behaviourFinalState;
        int behaviourState;
        if (this.g && !this.f && this.e) {
            PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.j;
            behaviourFinalState = preGeoAuthOnboardingModalView.behaviourFinalState();
            behaviourState = preGeoAuthOnboardingModalView.behaviourState();
            if (behaviourFinalState == 1 || behaviourState == 2) {
                return;
            }
            if (behaviourFinalState == 3 || behaviourFinalState == 7) {
                if (preGeoAuthOnboardingModalView.hasWindowFocus()) {
                    this.f = true;
                    GoConstraintLayout goConstraintLayout = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a;
                    wnb0 wnb0Var = this.i;
                    goConstraintLayout.removeCallbacks(wnb0Var);
                    PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).a.post(wnb0Var);
                    return;
                }
                if (this.h != null) {
                    return;
                }
                ?? r1 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: qge0
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z) {
                        if (z) {
                            tge0 tge0Var = tge0.this;
                            PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView2 = tge0Var.j;
                            qge0 qge0Var = tge0Var.h;
                            if (qge0Var != null) {
                                if (preGeoAuthOnboardingModalView2.getViewTreeObserver().isAlive()) {
                                    preGeoAuthOnboardingModalView2.getViewTreeObserver().removeOnWindowFocusChangeListener(qge0Var);
                                }
                                tge0Var.h = null;
                            }
                            tge0Var.e();
                        }
                    }
                };
                this.h = r1;
                preGeoAuthOnboardingModalView.getViewTreeObserver().addOnWindowFocusChangeListener(r1);
            }
        }
    }
}
