package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealClientSyncRequestExecutor$queue$1$1$1$emit$1 extends ContinuationImpl {
    public CompletableDeferred L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRegionProvider$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientSyncRequestExecutor$queue$1$1$1$emit$1(RealRegionProvider$1$1$1 realRegionProvider$1$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = realRegionProvider$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((RealClientSyncRequestExecutor.SyncRequestQueueElement) null, (Continuation) this);
    }
}
