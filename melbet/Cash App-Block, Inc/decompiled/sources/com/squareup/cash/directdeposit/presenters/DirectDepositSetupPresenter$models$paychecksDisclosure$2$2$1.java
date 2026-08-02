package com.squareup.cash.directdeposit.presenters;

import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DirectDepositSetupPresenter$models$paychecksDisclosure$2$2$1 implements Function1 {
    public static final DirectDepositSetupPresenter$models$paychecksDisclosure$2$2$1 INSTANCE = new DirectDepositSetupPresenter$models$paychecksDisclosure$2$2$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocalizedString localizedString = (LocalizedString) obj;
        localizedString.getClass();
        String str = localizedString.translated_value;
        str.getClass();
        return str;
    }
}
