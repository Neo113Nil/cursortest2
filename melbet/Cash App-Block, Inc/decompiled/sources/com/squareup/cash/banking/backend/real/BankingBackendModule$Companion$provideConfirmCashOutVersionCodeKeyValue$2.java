package com.squareup.cash.banking.backend.real;

import com.squareup.cash.banking.backend.api.ConfirmCashOutVersionCode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$2 implements Function1 {
    public static final BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$2 INSTANCE = new BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = ((ConfirmCashOutVersionCode) obj).versionCode;
        str.getClass();
        return str;
    }
}
