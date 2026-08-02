package androidx.compose.material3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SizeTransformImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.ConnectionPoolKt;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.ui.widget.amount.AmountLayoutAnimator;
import com.squareup.cash.ui.widget.amount.AmountModel;
import com.squareup.cash.ui.widget.amount.ComputedLayout;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.elements.OTPElement;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda6(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                SpringSpec springSpec = (SpringSpec) obj5;
                SpringSpec springSpec2 = (SpringSpec) obj4;
                SpringSpec springSpec3 = (SpringSpec) obj3;
                SpringSpec springSpec4 = (SpringSpec) obj2;
                ContentTransform contentTransform = ((DisplayMode) ((AnimatedContentTransitionScopeImpl) obj).getTargetState()).value == 1 ? AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(springSpec, new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(21)).plus(EnterExitTransitionKt.fadeIn$default(springSpec2, 2)), EnterExitTransitionKt.fadeOut$default(springSpec3, 2).plus(EnterExitTransitionKt.slideOutVertically(springSpec, new DatePickerKt$$ExternalSyntheticLambda10(i2, 0)))) : AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(springSpec, new DatePickerKt$$ExternalSyntheticLambda10(i2, 0)).plus(EnterExitTransitionKt.fadeIn$default(springSpec2, 2)), EnterExitTransitionKt.slideOutVertically(springSpec, new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(21)).plus(EnterExitTransitionKt.fadeOut$default(springSpec3, 2)));
                contentTransform.sizeTransform = new SizeTransformImpl(true, new HintHandler$$ExternalSyntheticLambda0(springSpec4, 15));
                break;
            case 1:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                placementScope.placeRelative((Placeable) obj2, ((Alignment.Horizontal) obj5).align(i2, Constraints.m1025getMaxWidthimpl(((Constraints) obj4).value), ((MeasureScope) obj3).getLayoutDirection()), 0, RecyclerView.DECELERATION_RATE);
                break;
            case 2:
                Function1 function1 = (Function1) obj3;
                ChatCardViewModel.InsightCard.Chart.BarChart barChart = (ChatCardViewModel.InsightCard.Chart.BarChart) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ((Function0) obj5).invoke();
                SnapshotStateMap snapshotStateMap = ((InsightBarChartSelectionState) obj4).selectedCategoryIndexByChart;
                Integer num2 = (Integer) snapshotStateMap.get(Integer.valueOf(i2));
                if (num2 != null && num2.intValue() == intValue) {
                    snapshotStateMap.remove(Integer.valueOf(i2));
                    function1.invoke(null);
                } else {
                    snapshotStateMap.put(Integer.valueOf(i2), num);
                    function1.invoke(InsightChartKt.buildBarChartHeader(barChart, intValue));
                }
                break;
            case 3:
                SnapshotStateList<DistributionWheelViewModel.Allocation> snapshotStateList = (SnapshotStateList) obj5;
                Function2 function2 = (Function2) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                int i3 = this.f$3;
                semanticsPropertyReceiver.set(SemanticsActions.SetProgress, new AccessibilityAction(null, new Hero3DCardViewKt$$ExternalSyntheticLambda13((DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) obj4, (Function2) obj3, i3, function2, 6)));
                String accessibilityLabel = ((DistributionWheelViewModel.Allocation) snapshotStateList.get(i3)).getAccessibilityLabel();
                if (accessibilityLabel != null) {
                    StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(accessibilityLabel);
                    for (DistributionWheelViewModel.Allocation allocation : snapshotStateList) {
                        if (!(allocation.getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected)) {
                            m.append(" ");
                            m.append(allocation.getAccessibilityLabel());
                        }
                    }
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, m.toString());
                }
                break;
            case 4:
                AmountLayoutAnimator amountLayoutAnimator = (AmountLayoutAnimator) obj5;
                AmountModel amountModel = (AmountModel) obj4;
                TextPaint textPaint = (TextPaint) obj3;
                TextPaint textPaint2 = (TextPaint) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                if (intBitsToFloat <= RecyclerView.DECELERATION_RATE) {
                    break;
                } else {
                    amountLayoutAnimator.getClass();
                    textPaint.getClass();
                    if (!amountLayoutAnimator.initialized && intBitsToFloat > RecyclerView.DECELERATION_RATE) {
                        TextPaint textPaint3 = amountLayoutAnimator.scratchPaint;
                        if (textPaint3 == null) {
                            textPaint3 = new TextPaint(textPaint);
                            amountLayoutAnimator.scratchPaint = textPaint3;
                        }
                        ComputedLayout m1178computeLayouthyTVY88 = ConnectionPoolKt.m1178computeLayouthyTVY88((List) amountModel.digits$delegate.getValue(), textPaint, intBitsToFloat, textPaint3, i2);
                        amountLayoutAnimator.initLayout(m1178computeLayouthyTVY88.digits, m1178computeLayouthyTVY88.scale);
                        amountLayoutAnimator.lastModel = amountModel;
                        amountLayoutAnimator.lastWidth = intBitsToFloat;
                    }
                    Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas());
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                    nativeCanvas.getClass();
                    float floatValue = ((Number) amountLayoutAnimator.textScale.getValue()).floatValue();
                    textPaint2.setTextSize(textPaint.getTextSize() * floatValue);
                    Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
                    float f = fontMetrics.descent;
                    float f2 = (intBitsToFloat2 - ((intBitsToFloat2 - (f - fontMetrics.ascent)) / 2.0f)) - f;
                    AmountLayoutAnimator.drawDigits(amountLayoutAnimator.exitingDigits, nativeCanvas, textPaint2, textPaint, floatValue, f2);
                    AmountLayoutAnimator.drawDigits(amountLayoutAnimator.activeDigits, nativeCanvas, textPaint2, textPaint, floatValue, f2);
                    break;
                }
            default:
                String str = (String) obj5;
                OTPElement oTPElement = (OTPElement) obj4;
                MutableState mutableState = (MutableState) obj3;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj2;
                String str2 = (String) obj;
                str2.getClass();
                boolean areEqual = Intrinsics.areEqual((String) mutableState.getValue(), str2);
                mutableState.setValue(str2);
                if (!areEqual || str2.length() == 1) {
                    if (!StringsKt.isBlank(str) && !StringsKt.isBlank(str2)) {
                        str2 = str2.substring(1);
                    }
                    IntProgressionIterator it = RangesKt___RangesKt.until(0, oTPElement.controller.onValueChanged(i2, str2)).iterator();
                    while (it.hasNext) {
                        it.nextInt();
                        FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0(focusOwnerImpl, 1);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
        this.f$2 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
        this.f$4 = obj4;
    }
}
