package com.squareup.cash.score.views;

import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class InfoSectionKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ CashCreditScoreHomeData.InfoSection.Callout f$2;

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda10(int i, CashCreditScoreHomeData.InfoSection.Callout callout, Function1 function1) {
        this.f$1 = i;
        this.f$2 = callout;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        CashCreditScoreHomeData.InfoSection.Callout callout = this.f$2;
        int i2 = this.f$1;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(new ScoreHomeViewEvent.CalloutVisible(i2, callout));
                }
                break;
            default:
                CashCreditScoreHomeData.Action action = (CashCreditScoreHomeData.Action) obj;
                action.getClass();
                function1.invoke(new ScoreHomeViewEvent.Action(action, new ScoreHomeViewEvent.Action.Source.Callout(i2, callout)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda10(Function1 function1, int i, CashCreditScoreHomeData.InfoSection.Callout callout) {
        this.f$0 = function1;
        this.f$1 = i;
        this.f$2 = callout;
    }
}
