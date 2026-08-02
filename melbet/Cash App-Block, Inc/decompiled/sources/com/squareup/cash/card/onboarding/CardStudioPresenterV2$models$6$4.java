package com.squareup.cash.card.onboarding;

import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class CardStudioPresenterV2$models$6$4 implements Function1 {
    public static final CardStudioPresenterV2$models$6$4 INSTANCE = new CardStudioPresenterV2$models$6$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        return new CardStudioExitDialogScreen(askedQuestion);
    }
}
