package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda27 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ProductDetailsPageViewModel f$1;

    public /* synthetic */ PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda27(Function1 function1, ProductDetailsPageViewModel productDetailsPageViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = productDetailsPageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ProductDetailsPageViewModel productDetailsPageViewModel = this.f$1;
        Function1 function1 = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                function1.invoke(new PaymentDeviceCustomizationViewEvent.SectionViewed(productDetailsPageViewModel.paymentDeviceId, str));
                break;
            default:
                str.getClass();
                function1.invoke(new PaymentDeviceCustomizationViewEvent.SectionViewed(productDetailsPageViewModel.paymentDeviceId, str));
                break;
        }
        return Unit.INSTANCE;
    }
}
