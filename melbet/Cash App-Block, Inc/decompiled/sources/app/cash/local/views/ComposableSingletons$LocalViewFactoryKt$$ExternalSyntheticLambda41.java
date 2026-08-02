package app.cash.local.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SchedulingDayTimePickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41(SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel, Function1 function1) {
        this.f$0 = schedulingDayTimePickerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    FulfillmentRadioCellKt.SchedulingDayTimePickerView(modifier, schedulingDayTimePickerViewModel, function1, gapComposer, intValue & 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(20, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, null, ButtonProminence.SUBTLE, false, false, null, FulfillmentRadioCellKt.lambda$1031731625, gapComposer2, 1573248, 58);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(21, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    SchedulingDayTimePickerViewModel.ModelState modelState = schedulingDayTimePickerViewModel.modelState;
                    modelState.getClass();
                    SizeKt.ButtonCta(function0, null, buttonProminence, false, (modelState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays) && zzuh.getSelectedTime(modelState) != null, null, FulfillmentRadioCellKt.lambda$1925421906, gapComposer2, 1573248, 42);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41(Function1 function1, SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel) {
        this.f$1 = function1;
        this.f$0 = schedulingDayTimePickerViewModel;
    }
}
