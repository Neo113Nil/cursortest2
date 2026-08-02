package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PaychecksHomeViewModel.Content.Button f$1;

    public /* synthetic */ ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda15(Function1 function1, PaychecksHomeViewModel.Content.Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaychecksHomeViewModel.Content.Button button = this.f$1;
        Function1 function1 = this.f$0;
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
