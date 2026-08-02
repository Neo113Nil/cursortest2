package com.squareup.cash.keystore;

import com.squareup.cash.keystore.RealAttestedKeyService;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAttestedKeyService$GenerationAttempt$attemptGeneration$1 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAttestedKeyService.GenerationAttempt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAttestedKeyService$GenerationAttempt$attemptGeneration$1(RealAttestedKeyService.GenerationAttempt generationAttempt, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = generationAttempt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3590attemptGenerationIoAF18A = this.this$0.m3590attemptGenerationIoAF18A(this);
        return m3590attemptGenerationIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m3590attemptGenerationIoAF18A : new Result(m3590attemptGenerationIoAF18A);
    }
}
