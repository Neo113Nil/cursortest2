package com.squareup.cash.session.backend;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.app.InitiateSessionResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSessionInitiator$call$1 extends ContinuationImpl {
    public String L$0;
    public ApiResult L$2;
    public InitiateSessionResponse L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSessionInitiator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionInitiator$call$1(RealSessionInitiator realSessionInitiator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSessionInitiator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.call(this);
    }
}
