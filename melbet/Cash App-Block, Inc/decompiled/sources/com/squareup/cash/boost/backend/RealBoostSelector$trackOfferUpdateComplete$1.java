package com.squareup.cash.boost.backend;

import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferRequestStatus;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealBoostSelector$trackOfferUpdateComplete$1 extends ContinuationImpl {
    public String L$3;
    public String L$4;
    public String L$5;
    public OfferRequestStatus L$6;
    public AppLocation L$7;
    public BoostEvent L$8;
    public Analytics L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBoostSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$trackOfferUpdateComplete$1(RealBoostSelector realBoostSelector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBoostSelector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.trackOfferUpdateComplete(null, null, null, null, null, null, this);
    }
}
