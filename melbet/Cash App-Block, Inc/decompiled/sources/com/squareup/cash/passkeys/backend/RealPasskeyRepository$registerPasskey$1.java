package com.squareup.cash.passkeys.backend;

import com.squareup.protos.cash.janus.api.StartWebAuthnRegistrationResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPasskeyRepository$registerPasskey$1 extends ContinuationImpl {
    public ClientScenario L$0;
    public String L$1;
    public StartWebAuthnRegistrationResponse L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPasskeyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPasskeyRepository$registerPasskey$1(RealPasskeyRepository realPasskeyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPasskeyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.registerPasskey(null, null, this);
    }
}
