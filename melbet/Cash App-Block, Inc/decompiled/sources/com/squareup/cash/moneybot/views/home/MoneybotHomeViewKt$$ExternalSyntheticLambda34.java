package com.squareup.cash.moneybot.views.home;

import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotHomeViewKt$$ExternalSyntheticLambda34 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MoneybotHomeViewModel.NextBestAction f$1;

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda34(Function1 function1, MoneybotHomeViewModel.NextBestAction nextBestAction, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nextBestAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MoneybotHomeViewModel.NextBestAction nextBestAction = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(nextBestAction.nbaId);
                break;
            default:
                function1.invoke(nextBestAction.action.event);
                break;
        }
        return Unit.INSTANCE;
    }
}
