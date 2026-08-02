package com.squareup.cash.offers.backend.real;

import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.api.RecentlyViewed;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersTabRefresher$refreshSearchNullState$1 extends ContinuationImpl {
    public OffersItemToken L$0;
    public OffersTabRepository$SearchSource L$1;
    public RecentlyViewed L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersTabRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRefresher$refreshSearchNullState$1(RealOffersTabRefresher realOffersTabRefresher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersTabRefresher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshSearchNullState(null, null, this);
    }
}
