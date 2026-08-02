package com.squareup.cash.offers.backend.real;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1 extends ContinuationImpl {
    public OfferSheetKey L$0;
    public ApiResult.Success L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersSheetRepository$getOffersSheetResponseFromNetwork$1(RealOffersSheetRepository realOffersSheetRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersSheetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOffersSheetRepository.access$getOffersSheetResponseFromNetwork(this.this$0, null, this);
    }
}
