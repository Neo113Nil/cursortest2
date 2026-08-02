package com.squareup.cash.payments.views.composer;

import com.squareup.cash.payments.viewmodels.TitleTapped;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentConfigurationTitleKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TitleTapped f$1;

    public /* synthetic */ PaymentConfigurationTitleKt$$ExternalSyntheticLambda7(Function1 function1, TitleTapped titleTapped, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = titleTapped;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TitleTapped titleTapped = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(titleTapped);
                return Unit.INSTANCE;
            default:
                function1.invoke(titleTapped);
                return Boolean.TRUE;
        }
    }
}
