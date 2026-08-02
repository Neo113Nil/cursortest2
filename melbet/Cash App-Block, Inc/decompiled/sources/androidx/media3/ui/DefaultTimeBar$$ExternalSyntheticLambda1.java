package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.camera.view.ScreenFlashView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.timepicker.ClockHandView;
import com.miteksystems.misnap.workflow.view.VisualizerView;
import com.squareup.cash.arcade.treehouse.ReceiptScaffoldBinding;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.reactions.views.ChooseReactionDialog;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.scannerview.SizeMap;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultTimeBar$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i2 = DefaultTimeBar.$r8$clinit;
                defaultTimeBar.scrubberScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.seekBounds);
                break;
            case 1:
                int i3 = ScreenFlashView.$r8$clinit;
                StringUtilsKt.d("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((ScreenFlashView) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                MaterialCardViewHelper materialCardViewHelper = (MaterialCardViewHelper) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                materialCardViewHelper.checkedIcon.setAlpha((int) (255.0f * floatValue));
                materialCardViewHelper.checkedAnimationProgress = floatValue;
                break;
            case 3:
                ((ClippableRoundedCornerLayout) obj).updateClipBoundsAndCornerRadii(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom(), (float[]) valueAnimator.getAnimatedValue());
                break;
            case 4:
                DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
                determinateDrawable.activeIndicator.amplitudeFraction = determinateDrawable.amplitudeInterpolator.getInterpolation(determinateDrawable.amplitudeAnimator.getAnimatedFraction());
                break;
            case 5:
                ((DrawerArrowDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                ((FadeThroughDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) ((SizeMap) obj).mRatios;
                searchViewAnimationHelper.editText.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                searchViewAnimationHelper.searchBar.textView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                ((DropdownMenuEndIconDelegate) obj).endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                int i4 = ClockHandView.$r8$clinit;
                ((ClockHandView) obj).setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                VisualizerView visualizerView = (VisualizerView) obj;
                int i5 = VisualizerView.$r8$clinit;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue("Radius");
                animatedValue.getClass();
                visualizerView.c = ((Float) animatedValue).floatValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue("Alpha");
                animatedValue2.getClass();
                visualizerView.e = ((Integer) animatedValue2).intValue();
                visualizerView.invalidate();
                break;
            case 12:
                valueAnimator.getClass();
                ((Function1) obj).invoke(valueAnimator);
                break;
            case 13:
                int i6 = ReceiptScaffoldBinding.$r8$clinit;
                ((ReceiptScaffoldBinding) obj).footerSlot.setTranslationY(((Integer) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).intValue());
                break;
            case 14:
                float[] fArr = InteractiveCardView.X_AXIS;
                valueAnimator.getClass();
                Quat quat = InteractiveCardView.TAP_UP_ROTATION;
                Quat quat2 = InteractiveCardView.TAP_DOWN_ROTATION;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                ((Ref$ObjectRef) obj).element = quat.slerp(quat2, ((Float) animatedValue3).floatValue());
                break;
            case 15:
                int i7 = MooncakeProgress.$r8$clinit;
                ((CashLottieAnimationView) obj).setProgress(((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue());
                break;
            case 16:
                ChooseReactionDialog chooseReactionDialog = (ChooseReactionDialog) obj;
                float floatValue2 = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
                float childCount = 1.0f / chooseReactionDialog.getChildCount();
                int childCount2 = chooseReactionDialog.getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt = chooseReactionDialog.getChildAt(i8);
                    float coerceIn = RangesKt___RangesKt.coerceIn((floatValue2 - (i8 * childCount)) / childCount, RecyclerView.DECELERATION_RATE, 1.0f);
                    childAt.setAlpha(coerceIn);
                    childAt.setScaleX(coerceIn);
                    childAt.setScaleY(coerceIn);
                }
                break;
            case 17:
                BottomSheet bottomSheet = (BottomSheet) obj;
                int intValue = ((Integer) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).intValue() - bottomSheet.getSheetY$overlays();
                if (intValue != 0) {
                    View view = bottomSheet.sheetView;
                    view.setTranslationY(view.getTranslationY() + intValue);
                    break;
                }
                break;
            default:
                ScanningView.$r8$lambda$eSCIYGun8qb3KF0R7SE_0OtQgOI((ScanningView) obj, valueAnimator);
                break;
        }
    }
}
