package com.squareup.cash.score.views;

import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CalloutKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CashCreditScoreHomeData.Action f$1;

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda2(Function1 function1, CashCreditScoreHomeData.Action action, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = action;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(this.f$1);
                break;
            case 1:
                this.f$0.invoke(new ScoreHomeViewEvent.Action(this.f$1, null));
                break;
            default:
                this.f$0.invoke(this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }
}
