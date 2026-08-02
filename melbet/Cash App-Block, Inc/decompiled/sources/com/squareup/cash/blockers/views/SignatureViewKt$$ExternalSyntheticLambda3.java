package com.squareup.cash.blockers.views;

import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.blockers.viewmodels.SignatureViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SignatureViewKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SignatureState f$1;

    public /* synthetic */ SignatureViewKt$$ExternalSyntheticLambda3(Function1 function1, SignatureState signatureState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = signatureState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SignatureState signatureState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new SignatureViewEvent.Submit(new MaterialButton$$ExternalSyntheticLambda3(signatureState, 16)));
                break;
            case 1:
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.FALSE)));
                signatureState.undo();
                break;
            default:
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.FALSE)));
                signatureState.undo();
                break;
        }
        return Unit.INSTANCE;
    }
}
