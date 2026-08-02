package com.squareup.cash.db2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentQueries$walletAddressForCurrency$2 extends FunctionReferenceImpl implements Function1 {
    public static final InstrumentQueries$walletAddressForCurrency$2 INSTANCE = new InstrumentQueries$walletAddressForCurrency$2(1, WalletAddressForCurrency.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new WalletAddressForCurrency((String) obj);
    }
}
