package com.squareup.cash.offers.backend.real;

import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersTabRepository$search$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public String L$0;
    public String L$1;
    public ScoreSummaryKt$$ExternalSyntheticLambda1 L$3;
    public Function1 L$4;
    public CashSuggestClientService L$5;
    public String L$6;
    public String L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$search$1(RealOffersTabRepository realOffersTabRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersTabRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.search(null, null, null, null, null, this);
    }
}
