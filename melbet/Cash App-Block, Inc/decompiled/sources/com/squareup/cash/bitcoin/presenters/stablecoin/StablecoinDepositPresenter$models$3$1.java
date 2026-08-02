package com.squareup.cash.bitcoin.presenters.stablecoin;

import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class StablecoinDepositPresenter$models$3$1 implements Function1 {
    public static final StablecoinDepositPresenter$models$3$1 INSTANCE = new StablecoinDepositPresenter$models$3$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        return new StablecoinDepositOptionsScreen(null, askedQuestion, 1);
    }
}
