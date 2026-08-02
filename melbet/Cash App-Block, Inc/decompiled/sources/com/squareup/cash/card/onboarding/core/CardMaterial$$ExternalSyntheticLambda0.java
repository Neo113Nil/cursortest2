package com.squareup.cash.card.onboarding.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardMaterial$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardMaterial f$0;

    public /* synthetic */ CardMaterial$$ExternalSyntheticLambda0(CardMaterial cardMaterial, int i) {
        this.$r8$classId = i;
        this.f$0 = cardMaterial;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardMaterial cardMaterial = this.f$0;
        switch (i) {
            case 0:
                cardMaterial.markReady();
                break;
            default:
                cardMaterial.markDirty$1();
                break;
        }
        return Unit.INSTANCE;
    }
}
