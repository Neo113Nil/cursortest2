package com.squareup.cash.offers.backend.real;

import app.cash.api.ApiResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersTabRepository$refreshHome$1 extends ContinuationImpl {
    public Function1 L$0;
    public ApiResult.Success L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$refreshHome$1(RealOffersTabRepository realOffersTabRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOffersTabRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshHome(null, this);
    }
}
