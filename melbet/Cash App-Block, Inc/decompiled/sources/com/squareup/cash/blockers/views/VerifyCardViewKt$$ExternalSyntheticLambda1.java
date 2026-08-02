package com.squareup.cash.blockers.views;

import com.squareup.cash.blockers.views.CardState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class VerifyCardViewKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardState f$0;

    public /* synthetic */ VerifyCardViewKt$$ExternalSyntheticLambda1(CardState cardState, int i) {
        this.$r8$classId = i;
        this.f$0 = cardState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CardState cardState = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                cardState.setNumber(str);
                break;
            default:
                str.getClass();
                cardState.getClass();
                if (cardState.checkName(str) != CardState.UpdateResult.Invalid) {
                    cardState._name$delegate.setValue(str);
                    cardState.checkValidity();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
