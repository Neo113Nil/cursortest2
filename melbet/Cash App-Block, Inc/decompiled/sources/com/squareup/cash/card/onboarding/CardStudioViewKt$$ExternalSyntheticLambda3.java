package com.squareup.cash.card.onboarding;

import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SignatureState f$1;
    public final /* synthetic */ StampState f$2;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda3(SignatureState signatureState, StampState stampState, Function1 function1) {
        this.f$1 = signatureState;
        this.f$2 = stampState;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        StampState stampState = this.f$2;
        SignatureState signatureState = this.f$1;
        switch (i) {
            case 0:
                SavedSignature savedState = signatureState.getSavedState();
                function1.invoke(new CardStudioViewEvent.DoneCustomizing(TouchdatasKt.createTouchData(savedState, stampState.getSavedState().a, savedState.width, savedState.height)));
                break;
            default:
                function1.invoke(new CardStudioViewEventV2.DoneCustomizing(TouchdatasKt.createLandscapeTouchData$default(signatureState.getSavedState(), stampState.getSavedState().a)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda3(Function1 function1, SignatureState signatureState, StampState stampState) {
        this.f$0 = function1;
        this.f$1 = signatureState;
        this.f$2 = stampState;
    }
}
