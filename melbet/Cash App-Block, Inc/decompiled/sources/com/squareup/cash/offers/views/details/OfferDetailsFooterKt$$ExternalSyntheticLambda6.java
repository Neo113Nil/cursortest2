package com.squareup.cash.offers.views.details;

import com.squareup.cash.offers.viewmodels.OfferFooterButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfferDetailsFooterKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ OfferFooterButton f$1;

    public /* synthetic */ OfferDetailsFooterKt$$ExternalSyntheticLambda6(Function1 function1, OfferFooterButton offerFooterButton, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = offerFooterButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        OfferFooterButton offerFooterButton = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(offerFooterButton.buttonEvent);
                break;
            default:
                function1.invoke(offerFooterButton.buttonEvent);
                break;
        }
        return Unit.INSTANCE;
    }
}
