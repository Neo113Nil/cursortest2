package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.family.familyhub.backend.api.TagLockResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealTagLockService$lockTag$1 extends ContinuationImpl {
    public String L$0;
    public TagLockResult.Success L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTagLockService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTagLockService$lockTag$1(RealTagLockService realTagLockService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTagLockService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.lockTag(null, this);
    }
}
