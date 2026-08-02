package com.squareup.cash.keystore;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealMessageSigner$sign$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealMessageSigner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMessageSigner$sign$1(RealMessageSigner realMessageSigner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realMessageSigner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3594signyxL6bBk = this.this$0.m3594signyxL6bBk(null, null, false, false, this);
        return m3594signyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED ? m3594signyxL6bBk : new Result(m3594signyxL6bBk);
    }
}
