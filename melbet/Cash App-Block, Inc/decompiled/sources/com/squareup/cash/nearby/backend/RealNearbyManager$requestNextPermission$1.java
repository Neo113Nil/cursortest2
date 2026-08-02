package com.squareup.cash.nearby.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealNearbyManager$requestNextPermission$1 extends ContinuationImpl {
    public NearbyPermissionState L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealNearbyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNearbyManager$requestNextPermission$1(RealNearbyManager realNearbyManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realNearbyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestNextPermission(null, this);
    }
}
