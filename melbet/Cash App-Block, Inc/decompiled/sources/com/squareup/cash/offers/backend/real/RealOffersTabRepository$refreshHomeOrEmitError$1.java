package com.squareup.cash.offers.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersTabRepository$refreshHomeOrEmitError$1 extends ContinuationImpl {
    public FlowCollector L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$refreshHomeOrEmitError$1(RealOffersTabRepository realOffersTabRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersTabRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOffersTabRepository.access$refreshHomeOrEmitError(this.this$0, null, null, this);
    }
}
