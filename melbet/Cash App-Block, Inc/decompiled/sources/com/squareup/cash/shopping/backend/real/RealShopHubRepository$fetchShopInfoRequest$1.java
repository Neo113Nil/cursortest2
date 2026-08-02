package com.squareup.cash.shopping.backend.real;

import app.cash.api.ApiResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShopHubRepository$fetchShopInfoRequest$1 extends ContinuationImpl {
    public ApiResult.Success L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShopHubRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShopHubRepository$fetchShopInfoRequest$1(RealShopHubRepository realShopHubRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShopHubRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchShopInfoRequest(this);
    }
}
