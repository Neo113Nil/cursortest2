package com.squareup.cash.offers.views.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.offers.viewmodels.OfferFooterButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfferDetailsFooterKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OfferFooterButton f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ OfferDetailsFooterKt$$ExternalSyntheticLambda8(OfferFooterButton offerFooterButton, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = offerFooterButton;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        OfferFooterButton offerFooterButton = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                OfferDetailsSheetKt.OfferDetailsSecondaryButton(offerFooterButton, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                OfferDetailsSheetKt.OfferDetailsPrimaryButton(offerFooterButton, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
