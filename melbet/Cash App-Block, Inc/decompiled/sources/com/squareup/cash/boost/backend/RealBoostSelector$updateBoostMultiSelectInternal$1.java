package com.squareup.cash.boost.backend;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealBoostSelector$updateBoostMultiSelectInternal$1 extends ContinuationImpl {
    public OfferUpdateType L$4;
    public String L$5;
    public Function1 L$6;
    public BlockersData L$8;
    public ApiResult L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBoostSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$updateBoostMultiSelectInternal$1(RealBoostSelector realBoostSelector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBoostSelector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateBoostMultiSelectInternal(null, null, null, null, null, null, null, null, this);
    }
}
