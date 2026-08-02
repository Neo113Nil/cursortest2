package com.squareup.cash.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealProfileSyncer$performSync$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealProfileSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileSyncer$performSync$1(RealProfileSyncer realProfileSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realProfileSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealProfileSyncer.access$performSync(this.this$0, this);
    }
}
