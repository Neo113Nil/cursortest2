package com.squareup.cardcustomizations.stampview;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final /* synthetic */ class StampsKt$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ StampsKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                PointF pointF = (PointF) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                valueAnimator.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                PointF pointF2 = new PointF(pointF.x * animatedFraction, pointF.y * animatedFraction);
                PointF pointF3 = (PointF) ref$ObjectRef.element;
                PointF pointF4 = new PointF(pointF2.x, pointF2.y);
                pointF4.offset(-pointF3.x, -pointF3.y);
                ((TransformedStamp) obj).transform.postTranslate(pointF4.x, pointF4.y);
                ref$ObjectRef.element = pointF2;
                break;
            case 1:
                SelfieOverlayView selfieOverlayView = (SelfieOverlayView) obj3;
                int i2 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.interpolate(selfieOverlayView.arcHoverState, (SelfieOverlayView.ArcHoverState) obj2, (SelfieOverlayView.ArcHoverState) obj, valueAnimator.getAnimatedFraction());
                SelfieOverlayView.IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
                if (intensityAnimationState != null) {
                    intensityAnimationState.progress = valueAnimator.getAnimatedFraction();
                }
                selfieOverlayView.applyCurrentState();
                break;
            case 2:
                SelfieOverlayView selfieOverlayView2 = (SelfieOverlayView) obj3;
                int i3 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.interpolate(selfieOverlayView2.arcHoverState, (SelfieOverlayView.ArcHoverState) obj2, (SelfieOverlayView.ArcHoverState) obj, valueAnimator.getAnimatedFraction());
                selfieOverlayView2.invalidate();
                break;
            case 3:
                SelfieOverlayView selfieOverlayView3 = (SelfieOverlayView) obj3;
                int i4 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.interpolate(selfieOverlayView3.arcHoverState, (SelfieOverlayView.ArcHoverState) obj2, (SelfieOverlayView.ArcHoverState) obj, valueAnimator.getAnimatedFraction());
                selfieOverlayView3.applyCurrentState();
                break;
            default:
                SelfieOverlayView selfieOverlayView4 = (SelfieOverlayView) obj3;
                int i5 = SelfieOverlayView.$r8$clinit;
                valueAnimator.getClass();
                SelfieOverlayView.interpolate(selfieOverlayView4.arcHoverState, (SelfieOverlayView.ArcHoverState) obj2, (SelfieOverlayView.ArcHoverState) obj, valueAnimator.getAnimatedFraction());
                selfieOverlayView4.invalidate();
                break;
        }
    }
}
