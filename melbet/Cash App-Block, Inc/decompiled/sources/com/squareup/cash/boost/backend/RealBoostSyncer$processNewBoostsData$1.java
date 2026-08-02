package com.squareup.cash.boost.backend;

import com.squareup.protos.franklin.common.RewardsData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBoostSyncer$processNewBoostsData$1 extends ContinuationImpl {
    public RewardsData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBoostSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSyncer$processNewBoostsData$1(RealBoostSyncer realBoostSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBoostSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processNewBoostsData(null, this);
    }
}
