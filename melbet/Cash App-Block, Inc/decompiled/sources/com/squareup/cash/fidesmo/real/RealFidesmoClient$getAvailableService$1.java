package com.squareup.cash.fidesmo.real;

import com.fidesmo.sec.core.models.ServiceDescriptionResponse;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$getAvailableService$1 extends ContinuationImpl {
    public String L$0;
    public FidesmoServiceType L$1;
    public ServiceDescriptionResponse L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$getAvailableService$1(RealFidesmoClient realFidesmoClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFidesmoClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealFidesmoClient.access$getAvailableService(this.this$0, null, null, this);
    }
}
