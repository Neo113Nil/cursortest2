package com.squareup.cash.payments.presenters;

import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$28$4 implements Function1 {
    public static final PaymentConfigurationPresenter$models$28$4 INSTANCE = new PaymentConfigurationPresenter$models$28$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        return new CashtagQrScanScreen(askedQuestion);
    }
}
