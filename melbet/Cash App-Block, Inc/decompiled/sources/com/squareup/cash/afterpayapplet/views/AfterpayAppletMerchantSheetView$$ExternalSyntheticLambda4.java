package com.squareup.cash.afterpayapplet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AfterpayAppletMerchantSheetViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda4(AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1) {
        this.f$0 = afterpayAppletMerchantSheetViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AfterpaySearchViewKt.ContentView(afterpayAppletMerchantSheetViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                AfterpaySearchViewKt.ContentView(afterpayAppletMerchantSheetViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda4(AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1, int i) {
        this.f$0 = afterpayAppletMerchantSheetViewModel;
        this.f$1 = function1;
    }
}
