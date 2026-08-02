package com.squareup.cash.blockers.views;

import com.squareup.cardcustomizations.signature.SignatureState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class SignatureViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SignatureState f$0;

    public /* synthetic */ SignatureViewKt$$ExternalSyntheticLambda1(SignatureState signatureState, int i) {
        this.$r8$classId = i;
        this.f$0 = signatureState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SignatureState signatureState = this.f$0;
        switch (i) {
            case 0:
                signatureState.undo();
                return Unit.INSTANCE;
            case 1:
                signatureState.getInvalidate$customizations();
                return Boolean.valueOf(signatureState.getSignature$customizations() != null ? !r1.userDrawnGlyphs().isEmpty() : false);
            default:
                signatureState.undo();
                return Unit.INSTANCE;
        }
    }
}
