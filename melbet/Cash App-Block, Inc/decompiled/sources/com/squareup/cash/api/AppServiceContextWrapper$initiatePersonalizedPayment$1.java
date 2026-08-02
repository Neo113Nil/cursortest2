package com.squareup.cash.api;

import app.cash.api.wrapper.ServiceContextWrapper;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.Message;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AppServiceContextWrapper$initiatePersonalizedPayment$1 extends ContinuationImpl {
    public int I$0;
    public ClientScenario L$0;
    public String L$1;
    public Object L$10;
    public Object L$11;
    public InitiatePersonalizedPaymentRequest L$12;
    public String L$2;
    public String L$3;
    public ServiceContextWrapper L$5;
    public Message L$6;
    public Exception L$8;
    public RequestContext L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppServiceContextWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppServiceContextWrapper$initiatePersonalizedPayment$1(AppServiceContextWrapper appServiceContextWrapper, Continuation continuation) {
        super(continuation);
        this.this$0 = appServiceContextWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiatePersonalizedPayment(null, null, null, null, null, this);
    }
}
