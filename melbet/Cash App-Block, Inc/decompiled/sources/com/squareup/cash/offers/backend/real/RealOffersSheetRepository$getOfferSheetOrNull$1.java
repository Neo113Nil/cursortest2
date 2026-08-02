package com.squareup.cash.offers.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersSheetRepository$getOfferSheetOrNull$1 extends ContinuationImpl {
    public FlowCollector L$0;
    public Function1 L$2;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersSheetRepository$getOfferSheetOrNull$1(RealOffersSheetRepository realOffersSheetRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersSheetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOffersSheetRepository.access$getOfferSheetOrNull(this.this$0, null, null, null, this);
    }
}
