package com.squareup.cash.fileupload.real;

import coil3.memory.RealStrongMemoryCache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealFileValidator$validate$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealStrongMemoryCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFileValidator$validate$1(RealStrongMemoryCache realStrongMemoryCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realStrongMemoryCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m1457validate8YU3vEA(null, this);
    }
}
