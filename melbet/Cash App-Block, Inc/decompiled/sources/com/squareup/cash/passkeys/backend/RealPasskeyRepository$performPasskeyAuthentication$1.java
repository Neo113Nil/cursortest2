package com.squareup.cash.passkeys.backend;

import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPasskeyRepository$performPasskeyAuthentication$1 extends ContinuationImpl {
    public int I$0;
    public PasskeyRepository$LoginIdentifier L$0;
    public ClientScenario L$1;
    public String L$2;
    public String L$3;
    public StartWebAuthnAuthenticationResponse L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPasskeyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPasskeyRepository$performPasskeyAuthentication$1(RealPasskeyRepository realPasskeyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPasskeyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performPasskeyAuthentication(null, null, null, null, this);
    }
}
