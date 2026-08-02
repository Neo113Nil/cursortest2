package com.squareup.cash.fidesmo.real;

import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$handleSdkRetryInteraction$1 extends ContinuationImpl {
    public ServiceDeliveryClient L$0;
    public Function2 L$1;
    public Function0 L$2;
    public RealFidesmoClient.SdkRetryDecision L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$handleSdkRetryInteraction$1(RealFidesmoClient realFidesmoClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFidesmoClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealFidesmoClient.access$handleSdkRetryInteraction(this.this$0, null, null, null, this);
    }
}
