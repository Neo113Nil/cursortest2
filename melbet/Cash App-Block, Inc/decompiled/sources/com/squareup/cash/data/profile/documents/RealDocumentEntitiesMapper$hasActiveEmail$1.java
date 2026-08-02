package com.squareup.cash.data.profile.documents;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$hasActiveEmail$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDocumentEntitiesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDocumentEntitiesMapper$hasActiveEmail$1(RealDocumentEntitiesMapper realDocumentEntitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDocumentEntitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.hasActiveEmail(this);
    }
}
