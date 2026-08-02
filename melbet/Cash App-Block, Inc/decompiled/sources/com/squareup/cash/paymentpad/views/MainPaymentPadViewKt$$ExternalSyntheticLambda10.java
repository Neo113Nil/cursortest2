package com.squareup.cash.paymentpad.views;

import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentPadViewKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;

    public /* synthetic */ MainPaymentPadViewKt$$ExternalSyntheticLambda10(int i, Function2 function2) {
        this.$r8$classId = i;
        this.f$0 = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MainPaymentPadViewEvent.FiatPaymentPadViewEvent.RequestFiatPayment requestFiatPayment = MainPaymentPadViewEvent.FiatPaymentPadViewEvent.RequestFiatPayment.INSTANCE;
        MainPaymentPadViewEvent.FiatPaymentPadViewEvent.SendFiatPayment sendFiatPayment = MainPaymentPadViewEvent.FiatPaymentPadViewEvent.SendFiatPayment.INSTANCE;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                function2.invoke(null, requestFiatPayment);
                break;
            case 1:
                function2.invoke(null, sendFiatPayment);
                break;
            case 2:
                function2.invoke(null, requestFiatPayment);
                break;
            case 3:
                function2.invoke(null, MainPaymentPadViewEvent.FiatPaymentPadViewEvent.RequestTapToPayPayment.INSTANCE);
                break;
            case 4:
                function2.invoke(null, sendFiatPayment);
                break;
            case 5:
                function2.invoke(null, MainPaymentPadViewEvent.FiatPaymentPadViewEvent.PoolPayment.INSTANCE);
                break;
            case 6:
                function2.invoke(null, requestFiatPayment);
                break;
            default:
                function2.invoke(null, sendFiatPayment);
                break;
        }
        return Unit.INSTANCE;
    }
}
