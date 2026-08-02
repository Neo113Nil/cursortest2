package com.squareup.cash.savings.views;

import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsUpsellCardKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UpsellCardModel$Loaded.Button f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SavingsUpsellCardKt$$ExternalSyntheticLambda6(UpsellCardModel$Loaded.Button button, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = button;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        UpsellCardModel$Loaded.Button button = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(button.action);
                break;
            default:
                function1.invoke(button.action);
                break;
        }
        return Unit.INSTANCE;
    }
}
