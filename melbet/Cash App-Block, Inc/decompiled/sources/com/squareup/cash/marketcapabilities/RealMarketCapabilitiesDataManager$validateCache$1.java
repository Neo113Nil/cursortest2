package com.squareup.cash.marketcapabilities;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealMarketCapabilitiesDataManager$validateCache$1 extends ContinuationImpl {
    public RealMarketCapabilitiesDataManager L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealMarketCapabilitiesDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMarketCapabilitiesDataManager$validateCache$1(RealMarketCapabilitiesDataManager realMarketCapabilitiesDataManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realMarketCapabilitiesDataManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.validateCache(this);
    }
}
