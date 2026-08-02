package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardPreviewViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TextureViewFpsTracker f$1;

    public /* synthetic */ CardPreviewViewKt$$ExternalSyntheticLambda0(Function1 function1, TextureViewFpsTracker textureViewFpsTracker, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = textureViewFpsTracker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TextureViewFpsTracker textureViewFpsTracker = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new CardPreviewViewEvent.Back(textureViewFpsTracker.getAverageFps()));
                break;
            case 1:
                textureViewFpsTracker.getClass();
                function1.invoke(new CardPreviewViewEvent.PersonalizeCard(textureViewFpsTracker.getAverageFps()));
                break;
            default:
                textureViewFpsTracker.getClass();
                function1.invoke(new CardPreviewViewEvent.Exit(textureViewFpsTracker.getAverageFps()));
                break;
        }
        return Unit.INSTANCE;
    }
}
