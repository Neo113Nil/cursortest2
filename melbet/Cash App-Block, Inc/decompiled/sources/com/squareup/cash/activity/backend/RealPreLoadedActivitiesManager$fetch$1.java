package com.squareup.cash.activity.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealPreLoadedActivitiesManager$fetch$1 extends ContinuationImpl {
    public ActivityItem L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPreLoadedActivitiesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPreLoadedActivitiesManager$fetch$1(RealPreLoadedActivitiesManager realPreLoadedActivitiesManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPreLoadedActivitiesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetch(null, this);
    }
}
