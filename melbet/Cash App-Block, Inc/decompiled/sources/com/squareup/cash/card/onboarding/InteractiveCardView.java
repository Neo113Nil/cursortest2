package com.squareup.cash.card.onboarding;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class InteractiveCardView extends CardModelView {
    public static final Quat NFC_CARD_DOWN_ROTATION;
    public static final Quat TAP_DOWN_ROTATION;
    public static final Quat TAP_UP_ROTATION;
    public static final float[] X_AXIS;
    public static final float[] Y_AXIS;
    public static final float[] Z_AXIS;
    public JobImpl animationJob;
    public Animator animator;
    public final Quat backLeftResting;
    public final Quat backRightResting;
    public final Quat backward;
    public final Quat backwardResting;
    public float dampingRatio;
    public final Quat forward;
    public final Quat forwardResting;
    public final Quat frontLeftResting;
    public final Quat frontRightResting;
    public boolean isDragGesture;
    public float lastTouchX;
    public float lastTouchY;
    public long lastVelocity;
    public final int maxClickMovement;
    public AnimatorSet nfcAnimator;
    public final AppCompatImageView nfcView;
    public float stiffness;
    public float touchDistanceX;
    public float touchDistanceY;

    static {
        float[] fArr = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        X_AXIS = fArr;
        float[] fArr2 = {RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        Y_AXIS = fArr2;
        float[] fArr3 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
        Z_AXIS = fArr3;
        TAP_UP_ROTATION = new Quat(RecyclerView.DECELERATION_RATE, fArr);
        TAP_DOWN_ROTATION = new Quat((float) Math.toRadians(10.0d), fArr);
        NFC_CARD_DOWN_ROTATION = CardModelView.CARD_CAMERA_ROTATION.times(new Quat((float) Math.toRadians(22.0d), fArr)).times(new Quat((float) Math.toRadians(54.0d), fArr2)).times(new Quat((float) Math.toRadians(70.0d), fArr3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.forward = new Quat((float) Math.toRadians(0.0d), Y_AXIS);
        float radians = (float) Math.toRadians(180.0d);
        float[] fArr = Z_AXIS;
        this.backward = new Quat(radians, fArr);
        Quat quat = this.cardRotation;
        this.forwardResting = quat;
        Quat times = new Quat((float) Math.toRadians(180.0d), fArr).times(quat);
        this.backwardResting = times;
        this.frontRightResting = new Quat((float) Math.toRadians(25.0d), fArr).times(quat);
        this.frontLeftResting = new Quat((float) Math.toRadians(-10.0d), fArr).times(quat);
        this.backRightResting = new Quat((float) Math.toRadians(25.0d), fArr).times(times);
        this.backLeftResting = new Quat((float) Math.toRadians(-10.0d), fArr).times(times);
        this.lastVelocity = 0L;
        this.maxClickMovement = ViewConfiguration.get(context).getScaledTouchSlop();
        this.dampingRatio = 0.43f;
        this.stiffness = 290.0f;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        addView(appCompatImageView, 0);
        if (!appCompatImageView.isLaidOut() || appCompatImageView.isLayoutRequested()) {
            appCompatImageView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(appCompatImageView, 5));
        } else {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                throw null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = appCompatImageView.getWidth() / 4;
            layoutParams2.gravity = 17;
            appCompatImageView.setLayoutParams(layoutParams2);
            appCompatImageView.setTranslationY(-(appCompatImageView.getWidth() / 4));
            appCompatImageView.setColorFilter(ThemeHelpersKt.themeInfo(appCompatImageView).colorPalette.label);
            appCompatImageView.setImageResource(R.drawable.tap_to_pay);
            appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            appCompatImageView.setAlpha(RecyclerView.DECELERATION_RATE);
        }
        this.nfcView = appCompatImageView;
        setContentDescription(getResources().getString(R.string.accessibility_cash_card_3d_front));
        setImportantForAccessibility(1);
        setClickable(true);
    }

    public static final void access$continueWobble(InteractiveCardView interactiveCardView, boolean z) {
        interactiveCardView.cancelAnimationInternal();
        SlerpAnimator slerpAnimator = new SlerpAnimator(z ? interactiveCardView.frontRightResting : interactiveCardView.backRightResting, z ? interactiveCardView.frontLeftResting : interactiveCardView.backLeftResting);
        slerpAnimator.setDuration(3000L);
        slerpAnimator.setRepeatMode(2);
        slerpAnimator.setRepeatCount(-1);
        slerpAnimator.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda0(interactiveCardView, 1));
        slerpAnimator.start();
        interactiveCardView.animator = slerpAnimator;
    }

    public static void safeCancel(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
        }
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void cancelAnimationInternal() {
        Animator animator = this.animator;
        if (animator != null) {
            safeCancel(animator);
        }
        JobImpl jobImpl = this.animationJob;
        if (jobImpl != null) {
            jobImpl.cancel(null);
        }
    }

    @Override // com.squareup.cash.filament.BaseModelView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        startWobble(true);
    }

    @Override // com.squareup.cash.filament.BaseModelView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.animator;
        if (animator != null) {
            safeCancel(animator);
        }
        AnimatorSet animatorSet = this.nfcAnimator;
        if (animatorSet != null) {
            safeCancel(animatorSet);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InteractiveCardView interactiveCardView;
        motionEvent.getClass();
        if (!isEnabled()) {
            return false;
        }
        cancelAnimationInternal();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                float x = ((this.lastTouchX - motionEvent.getX()) / getResources().getDisplayMetrics().density) * 0.8f;
                float y = ((this.lastTouchY - motionEvent.getY()) / getResources().getDisplayMetrics().density) * 0.8f;
                this.touchDistanceX = Math.abs(x) + this.touchDistanceX;
                this.touchDistanceY = Math.abs(y) + this.touchDistanceY;
                this.lastVelocity = (Float.floatToRawIntBits(-x) << 32) | (Float.floatToRawIntBits(-y) & BodyPartID.bodyIdMax);
                if (!this.isDragGesture) {
                    float f = this.touchDistanceX;
                    float f2 = this.touchDistanceY;
                    if (((float) Math.sqrt((f2 * f2) + (f * f))) > this.maxClickMovement) {
                        this.isDragGesture = true;
                    }
                }
                setCardRotation(this.cardRotation.times(new Quat((float) Math.toRadians(x), Y_AXIS)));
                setCardRotation(this.cardRotation.times(new Quat((float) Math.toRadians(y), X_AXIS)));
            }
            interactiveCardView = this;
        } else {
            if (this.isDragGesture) {
                boolean z = this.cardRotation.angleShortestPath(this.forward) < this.cardRotation.angleShortestPath(this.backward);
                long j = this.lastVelocity;
                cancelAnimationInternal();
                setContentDescription(getResources().getString(z ? R.string.accessibility_cash_card_3d_front : R.string.accessibility_cash_card_3d_back));
                interactiveCardView = this;
                interactiveCardView.animationJob = ViewKt.whileAttachedOnce$default(interactiveCardView, new InteractiveCardView$flingTo$1(interactiveCardView, z, j, (Continuation) null));
            } else {
                performClick();
                interactiveCardView = this;
            }
            interactiveCardView.touchDistanceX = RecyclerView.DECELERATION_RATE;
            interactiveCardView.touchDistanceY = RecyclerView.DECELERATION_RATE;
            interactiveCardView.isDragGesture = false;
        }
        interactiveCardView.lastTouchX = motionEvent.getX();
        interactiveCardView.lastTouchY = motionEvent.getY();
        StateFlowKt.emitOrThrow(interactiveCardView.touchPoints, new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    public final void setDampingRatio(float f) {
        this.dampingRatio = f;
    }

    public final void setStiffness(float f) {
        this.stiffness = f;
    }

    public final void startWobble(boolean z) {
        cancelAnimationInternal();
        SlerpAnimator slerpAnimator = new SlerpAnimator(this.cardRotation, z ? this.frontRightResting : this.backRightResting);
        slerpAnimator.setDuration(3000L);
        slerpAnimator.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda0(this, 0));
        slerpAnimator.addListener(new InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(this, z));
        slerpAnimator.start();
        this.animator = slerpAnimator;
    }
}
