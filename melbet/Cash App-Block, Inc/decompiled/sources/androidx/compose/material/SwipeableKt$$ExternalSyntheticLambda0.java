package androidx.compose.material;

import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.util.Strings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeableKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ boolean f$8;

    public /* synthetic */ SwipeableKt$$ExternalSyntheticLambda0(LinkedHashMap linkedHashMap, DismissState dismissState, ResistanceConfig resistanceConfig, Function2 function2, boolean z, boolean z2) {
        Orientation orientation = Orientation.Vertical;
        this.f$0 = linkedHashMap;
        this.f$1 = dismissState;
        this.f$2 = resistanceConfig;
        this.f$3 = function2;
        this.f$6 = z;
        this.f$8 = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj7;
                DismissState dismissState = (DismissState) obj6;
                ResistanceConfig resistanceConfig = (ResistanceConfig) obj5;
                Function2 function2 = (Function2) obj4;
                Orientation orientation = Orientation.Horizontal;
                ((Integer) obj3).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(43594985);
                if (!linkedHashMap.isEmpty()) {
                    if (CollectionsKt.distinct(linkedHashMap.values()).size() != linkedHashMap.size()) {
                        a$$ExternalSyntheticBUOutline0.m$3("You cannot have two anchors mapped to the same state.");
                        break;
                    } else {
                        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                        if (((Map) dismissState.anchors$delegate.getValue()).isEmpty()) {
                            Float access$getOffset = CardKt.access$getOffset(linkedHashMap, dismissState.currentValue$delegate.getValue());
                            if (access$getOffset == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("The initial value must have an associated anchor.");
                                break;
                            } else {
                                dismissState.offsetState.setFloatValue(access$getOffset.floatValue());
                                dismissState.absoluteOffset.setFloatValue(access$getOffset.floatValue());
                            }
                        }
                        boolean changed = gapComposer.changed(dismissState) | gapComposer.changedInstance(linkedHashMap) | gapComposer.changed(resistanceConfig) | gapComposer.changed(function2) | gapComposer.changed(density) | gapComposer.changed(125.0f);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(dismissState, linkedHashMap, resistanceConfig, density, function2, null, 7);
                            gapComposer.updateRememberedValue(realImageLoader$execute$result$1);
                            rememberedValue = realImageLoader$execute$result$1;
                        }
                        Updater.LaunchedEffect(linkedHashMap, dismissState, (Function2) rememberedValue, gapComposer);
                        boolean booleanValue = ((Boolean) dismissState.isAnimationRunning$delegate.getValue()).booleanValue();
                        DefaultDraggableState defaultDraggableState = dismissState.draggableState;
                        boolean changed2 = gapComposer.changed(dismissState);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SwipeableKt$swipeable$3$4$1(dismissState, null, 0);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Modifier draggable$default = DraggableKt.draggable$default(Modifier.Companion.$$INSTANCE, defaultDraggableState, orientation, this.f$6, null, booleanValue, null, (Function3) rememberedValue2, this.f$8, 32);
                        gapComposer.end(false);
                        break;
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("You must have at least one anchor.");
                    break;
                }
            case 1:
                TouchRecorder touchRecorder = (TouchRecorder) obj7;
                ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj6;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(2050927620, new MainPaymentViewKt$$ExternalSyntheticLambda24(delegatingSoftwareKeyboardController, toolbarViewModel, touchRecorder, function1, this.f$6, this.f$8), gapComposer2), gapComposer2, 392, 2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj7;
                Shaker shaker = (Shaker) obj6;
                Function0 function0 = (Function0) obj5;
                String str = (String) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z = this.f$6;
                    boolean changed3 = gapComposer3.changed(z) | gapComposer3.changedInstance(realCashVibrator) | gapComposer3.changedInstance(shaker) | gapComposer3.changed(function0);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(z, realCashVibrator, shaker, function0, 4);
                        gapComposer3.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda10);
                        rememberedValue3 = shiftListViewKt$$ExternalSyntheticLambda10;
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue3, null, buttonProminence, false, this.f$8, null, Expect_jvmKt.rememberComposableLambda(-192051086, new SheetKt$$ExternalSyntheticLambda8(str, 19), gapComposer3), gapComposer3, 1573248, 42);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwipeableKt$$ExternalSyntheticLambda0(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, ToolbarViewModel toolbarViewModel, TouchRecorder touchRecorder, Function1 function1, boolean z, boolean z2) {
        this.f$0 = touchRecorder;
        this.f$1 = toolbarViewModel;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
        this.f$6 = z;
        this.f$8 = z2;
    }

    public /* synthetic */ SwipeableKt$$ExternalSyntheticLambda0(boolean z, RealCashVibrator realCashVibrator, Shaker shaker, Function0 function0, boolean z2, String str) {
        this.f$6 = z;
        this.f$0 = realCashVibrator;
        this.f$1 = shaker;
        this.f$2 = function0;
        this.f$8 = z2;
        this.f$3 = str;
    }
}
