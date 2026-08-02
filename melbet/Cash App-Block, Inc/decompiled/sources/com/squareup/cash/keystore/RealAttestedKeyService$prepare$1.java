package com.squareup.cash.keystore;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAttestedKeyService$prepare$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Mutex L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAttestedKeyService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAttestedKeyService$prepare$1(RealAttestedKeyService realAttestedKeyService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAttestedKeyService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3588prepareIoAF18A = this.this$0.m3588prepareIoAF18A(this);
        return m3588prepareIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m3588prepareIoAF18A : new Result(m3588prepareIoAF18A);
    }
}
