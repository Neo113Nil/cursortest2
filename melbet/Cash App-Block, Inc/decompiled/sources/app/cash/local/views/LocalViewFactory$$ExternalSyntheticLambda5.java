package app.cash.local.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalViewFactory$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FulfillmentPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda5(FulfillmentPickerViewModel fulfillmentPickerViewModel, Function1 function1) {
        this.f$0 = fulfillmentPickerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        FulfillmentPickerViewModel fulfillmentPickerViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FulfillmentRadioCellKt.FulfillmentPickerSheet(fulfillmentPickerViewModel, function1, gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                FulfillmentRadioCellKt.FulfillmentPickerSheet(fulfillmentPickerViewModel, function1, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda5(FulfillmentPickerViewModel fulfillmentPickerViewModel, Function1 function1, int i) {
        this.f$0 = fulfillmentPickerViewModel;
        this.f$1 = function1;
    }
}
