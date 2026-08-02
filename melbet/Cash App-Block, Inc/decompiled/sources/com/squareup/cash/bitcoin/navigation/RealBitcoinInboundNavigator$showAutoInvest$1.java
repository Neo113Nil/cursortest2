package com.squareup.cash.bitcoin.navigation;

import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBitcoinInboundNavigator$showAutoInvest$1 extends ContinuationImpl {
    public CryptoAutoInvest L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinInboundNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinInboundNavigator$showAutoInvest$1(RealBitcoinInboundNavigator realBitcoinInboundNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinInboundNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showAutoInvest(this);
    }
}
