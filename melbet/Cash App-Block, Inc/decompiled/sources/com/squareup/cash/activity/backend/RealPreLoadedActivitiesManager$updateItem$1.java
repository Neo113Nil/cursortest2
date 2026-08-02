package com.squareup.cash.activity.backend;

import com.squareup.cash.activity.backend.loader.Activities;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealPreLoadedActivitiesManager$updateItem$1 extends ContinuationImpl {
    public Activities L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPreLoadedActivitiesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPreLoadedActivitiesManager$updateItem$1(RealPreLoadedActivitiesManager realPreLoadedActivitiesManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPreLoadedActivitiesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateItem(null, null, this);
    }
}
