package com.squareup.cash.buynowpaylater.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterPayOrderDetailsView$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterPayOrderDetailsView f$0;
    public final /* synthetic */ AfterPayOrderDetailsViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AfterPayOrderDetailsView$$ExternalSyntheticLambda13(AfterPayOrderDetailsView afterPayOrderDetailsView, AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = afterPayOrderDetailsView;
        this.f$1 = afterPayOrderDetailsViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel = this.f$1;
        AfterPayOrderDetailsView afterPayOrderDetailsView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                afterPayOrderDetailsView.Content(afterPayOrderDetailsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    afterPayOrderDetailsView.OrderDetailsContent(afterPayOrderDetailsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                num.getClass();
                afterPayOrderDetailsView.Content(afterPayOrderDetailsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                afterPayOrderDetailsView.OrderDetailsContent(afterPayOrderDetailsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterPayOrderDetailsView$$ExternalSyntheticLambda13(AfterPayOrderDetailsView afterPayOrderDetailsView, AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = afterPayOrderDetailsView;
        this.f$1 = afterPayOrderDetailsViewModel;
        this.f$2 = function1;
    }
}
