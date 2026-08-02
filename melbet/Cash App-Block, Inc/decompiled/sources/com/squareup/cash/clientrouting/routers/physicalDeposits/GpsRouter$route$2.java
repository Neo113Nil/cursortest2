package com.squareup.cash.clientrouting.routers.physicalDeposits;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GpsRouter$route$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GpsRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsRouter$route$2(GpsRouter gpsRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gpsRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route$1(this);
    }
}
