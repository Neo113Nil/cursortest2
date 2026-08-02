package com.squareup.cash.afterpayapplet.backend.real;

import app.cash.api.ApiResult;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayMerchantRepo$internalUpdate$1 extends ContinuationImpl {
    public String L$0;
    public List L$1;
    public MutexImpl L$2;
    public ApiResult L$4;
    public MutexImpl L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayMerchantRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayMerchantRepo$internalUpdate$1(RealAfterpayMerchantRepo realAfterpayMerchantRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayMerchantRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.internalUpdate(null, null, this);
    }
}
