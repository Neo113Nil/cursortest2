package com.squareup.cash.banking.backend.real;

import com.squareup.cash.banking.backend.api.ConfirmCashOutVersionCode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$1 extends FunctionReferenceImpl implements Function1 {
    public static final BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$1 INSTANCE = new BankingBackendModule$Companion$provideConfirmCashOutVersionCodeKeyValue$1(1, ConfirmCashOutVersionCode.class, "<init>", "constructor-impl(Ljava/lang/String;)Ljava/lang/String;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return new ConfirmCashOutVersionCode(str);
    }
}
