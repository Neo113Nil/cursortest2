package com.squareup.cash.data.activity;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.StatusResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator$initiatePaymentFailure$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public ClientScenario L$0;
    public ApiResult.Failure L$1;
    public InitiatePaymentRequest L$2;
    public Long L$3;
    public StatusResult L$5;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentNavigator$initiatePaymentFailure$1(RealPaymentNavigator realPaymentNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiatePaymentFailure(null, null, null, null, false, this);
    }
}
