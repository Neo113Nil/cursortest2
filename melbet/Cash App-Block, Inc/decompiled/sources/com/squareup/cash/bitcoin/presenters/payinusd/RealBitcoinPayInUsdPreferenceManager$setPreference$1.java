package com.squareup.cash.bitcoin.presenters.payinusd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBitcoinPayInUsdPreferenceManager$setPreference$1 extends ContinuationImpl {
    public BitcoinPayInUsdPreference L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinPayInUsdPreferenceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinPayInUsdPreferenceManager$setPreference$1(RealBitcoinPayInUsdPreferenceManager realBitcoinPayInUsdPreferenceManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinPayInUsdPreferenceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setPreference(null, this);
    }
}
