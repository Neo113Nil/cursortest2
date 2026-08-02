package com.squareup.cash.db2.profile;

import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$bitcoinAmountEntryCurrencyPreference$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ProfileQueries$bitcoinAmountEntryCurrencyPreference$2() {
        super(1, BitcoinAmountEntryCurrencyPreference.class, "<init>", "<init>(Lcom/squareup/protos/common/CurrencyCode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new BitcoinAmountEntryCurrencyPreference((CurrencyCode) obj);
    }
}
