package com.squareup.cash.keystore;

import java.security.PrivateKey;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAttestedKeyService$fetchFromKeyStore$1 extends ContinuationImpl {
    public PrivateKey L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAttestedKeyService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAttestedKeyService$fetchFromKeyStore$1(RealAttestedKeyService realAttestedKeyService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAttestedKeyService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchFromKeyStore(this);
    }
}
