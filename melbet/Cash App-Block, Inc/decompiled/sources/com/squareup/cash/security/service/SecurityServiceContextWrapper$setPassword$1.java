package com.squareup.cash.security.service;

import app.cash.api.wrapper.ServiceContextWrapper;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.Message;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SecurityServiceContextWrapper$setPassword$1 extends ContinuationImpl {
    public int I$0;
    public ClientScenario L$0;
    public String L$1;
    public SetPasswordRequest L$10;
    public ServiceContextWrapper L$3;
    public Message L$4;
    public Exception L$6;
    public RequestContext L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SecurityServiceContextWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityServiceContextWrapper$setPassword$1(SecurityServiceContextWrapper securityServiceContextWrapper, Continuation continuation) {
        super(continuation);
        this.this$0 = securityServiceContextWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setPassword(null, null, null, this);
    }
}
