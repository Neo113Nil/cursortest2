package com.squareup.cash.bitcoin.navigation;

import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBitcoinInboundNavigator$showBitcoinMap$1 extends ContinuationImpl {
    public BitcoinMapScreen.Source L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinInboundNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinInboundNavigator$showBitcoinMap$1(RealBitcoinInboundNavigator realBitcoinInboundNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinInboundNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showBitcoinMap(null, this);
    }
}
