package com.squareup.cash.clientsync.pipeline;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealClientSyncRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1(RealClientSyncRequestExecutor realClientSyncRequestExecutor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realClientSyncRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealClientSyncRequestExecutor.access$executeSyncRequestSynchronously(this.this$0, null, this);
    }
}
