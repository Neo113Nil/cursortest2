package com.squareup.cash.bitcoin.presenters;

import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinDepositNoteScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class RealBitcoinAmountPickerPresenter$models$5$2 implements Function1 {
    public static final RealBitcoinAmountPickerPresenter$models$5$2 INSTANCE = new RealBitcoinAmountPickerPresenter$models$5$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        return new BitcoinDepositNoteScreen(askedQuestion);
    }
}
