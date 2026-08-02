package com.squareup.cash.cashapplite.stablecoin;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class LiteStablecoinNetworkRepo$getDepositOptions$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LiteStablecoinNetworkRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteStablecoinNetworkRepo$getDepositOptions$1(LiteStablecoinNetworkRepo liteStablecoinNetworkRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = liteStablecoinNetworkRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getDepositOptions(false, this);
    }
}
