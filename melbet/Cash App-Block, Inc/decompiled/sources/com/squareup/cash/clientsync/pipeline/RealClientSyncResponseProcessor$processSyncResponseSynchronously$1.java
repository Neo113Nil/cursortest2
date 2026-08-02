package com.squareup.cash.clientsync.pipeline;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealClientSyncResponseProcessor$processSyncResponseSynchronously$1 extends ContinuationImpl {
    public SyncResponseOperation L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealClientSyncResponseProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientSyncResponseProcessor$processSyncResponseSynchronously$1(RealClientSyncResponseProcessor realClientSyncResponseProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realClientSyncResponseProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealClientSyncResponseProcessor.access$processSyncResponseSynchronously(this.this$0, null, this);
    }
}
