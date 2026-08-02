package com.squareup.cash.offers.views.redemption;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaet;
import com.squareup.cash.offers.viewmodels.OffersRedemptionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersRedemptionSheetView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ OffersRedemptionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ OffersRedemptionSheetView$$ExternalSyntheticLambda1(OffersRedemptionViewModel offersRedemptionViewModel, Function1 function1) {
        this.f$0 = offersRedemptionViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        OffersRedemptionViewModel offersRedemptionViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = OffersRedemptionSheetView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    zzaet.RedemptionSheetContent(offersRedemptionViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                zzaet.RedemptionSheetContent(offersRedemptionViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OffersRedemptionSheetView$$ExternalSyntheticLambda1(OffersRedemptionViewModel offersRedemptionViewModel, Function1 function1, int i) {
        this.f$0 = offersRedemptionViewModel;
        this.f$1 = function1;
    }
}
