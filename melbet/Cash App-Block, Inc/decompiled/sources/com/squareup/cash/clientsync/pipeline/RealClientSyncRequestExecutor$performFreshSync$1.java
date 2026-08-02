package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.network.ClientSyncApiResult;
import com.squareup.cash.clientsync.network.GatewayRequest;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealClientSyncRequestExecutor$performFreshSync$1 extends ContinuationImpl {
    public SyncRequestOperation L$0;
    public Set L$1;
    public SyncRequestOperation.Result L$2;
    public List L$3;
    public GatewayRequest L$6;
    public ClientSyncApiResult.Success L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealClientSyncRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClientSyncRequestExecutor$performFreshSync$1(RealClientSyncRequestExecutor realClientSyncRequestExecutor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realClientSyncRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performFreshSync(null, null, this);
    }
}
