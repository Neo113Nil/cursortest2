package com.squareup.cash.keystore;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAttestedKeyService$generateKey$1 extends ContinuationImpl {
    public int I$0;
    public Ref$ObjectRef L$0;
    public Iterator L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAttestedKeyService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAttestedKeyService$generateKey$1(RealAttestedKeyService realAttestedKeyService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAttestedKeyService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.generateKey(this);
    }
}
