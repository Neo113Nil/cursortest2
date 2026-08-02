package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.MotionUtils;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class ClearTextEndIconDelegate extends EndIconDelegate {
    public final int animationFadeDuration;
    public final TimeInterpolator animationFadeInterpolator;
    public final int animationScaleDuration;
    public final TimeInterpolator animationScaleInterpolator;
    public EditText editText;
    public AnimatorSet iconInAnim;
    public ValueAnimator iconOutAnim;
    public final GiftCardEditor$$ExternalSyntheticLambda0 onFocusChangeListener;
    public final Q0$$ExternalSyntheticLambda0 onIconClickListener;

    public ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new Q0$$ExternalSyntheticLambda0(this, 10);
        this.onFocusChangeListener = new GiftCardEditor$$ExternalSyntheticLambda0(this, 3);
        this.animationFadeDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 100);
        this.animationScaleDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 150);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.animationScaleInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void afterEditTextChanged() {
        if (this.endLayout.suffixText != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    public final void animateIcon(boolean z) {
        boolean z2 = this.endLayout.isEndIconVisible() == z;
        if (z && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z2) {
                this.iconInAnim.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.iconInAnim.cancel();
        this.iconOutAnim.start();
        if (z2) {
            this.iconOutAnim.end();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconContentDescriptionResId() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconDrawableResId() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onEditTextAttached(EditText editText) {
        this.editText = editText;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onSuffixVisibilityChanged(boolean z) {
        if (this.endLayout.suffixText == null) {
            return;
        }
        animateIcon(z);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.animationScaleInterpolator);
        ofFloat.setDuration(this.animationScaleDuration);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            public final /* synthetic */ ClearTextEndIconDelegate f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                ClearTextEndIconDelegate clearTextEndIconDelegate = this.f$0;
                switch (i2) {
                    case 0:
                        clearTextEndIconDelegate.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = clearTextEndIconDelegate.endIconView;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        TimeInterpolator timeInterpolator = this.animationFadeInterpolator;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.animationFadeDuration;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            public final /* synthetic */ ClearTextEndIconDelegate f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                ClearTextEndIconDelegate clearTextEndIconDelegate = this.f$0;
                switch (i22) {
                    case 0:
                        clearTextEndIconDelegate.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = clearTextEndIconDelegate.endIconView;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.iconInAnim.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            public final /* synthetic */ ClearTextEndIconDelegate this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                switch (i3) {
                    case 1:
                        this.this$0.endLayout.setEndIconVisible(false);
                        break;
                    default:
                        super.onAnimationEnd(animator);
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                switch (i3) {
                    case 0:
                        this.this$0.endLayout.setEndIconVisible(true);
                        break;
                    default:
                        super.onAnimationStart(animator);
                        break;
                }
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            public final /* synthetic */ ClearTextEndIconDelegate f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                ClearTextEndIconDelegate clearTextEndIconDelegate = this.f$0;
                switch (i22) {
                    case 0:
                        clearTextEndIconDelegate.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = clearTextEndIconDelegate.endIconView;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.iconOutAnim = ofFloat3;
        ofFloat3.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            public final /* synthetic */ ClearTextEndIconDelegate this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                switch (i) {
                    case 1:
                        this.this$0.endLayout.setEndIconVisible(false);
                        break;
                    default:
                        super.onAnimationEnd(animator);
                        break;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                switch (i) {
                    case 0:
                        this.this$0.endLayout.setEndIconVisible(true);
                        break;
                    default:
                        super.onAnimationStart(animator);
                        break;
                }
            }
        });
    }

    public final boolean shouldBeVisible() {
        EditText editText = this.editText;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.endIconView.hasFocus()) && ((this.editText.getText().length() > 0) || (this.endLayout.suffixText != null));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.post(new KnotView$$ExternalSyntheticLambda1(this, 7));
        }
    }
}
