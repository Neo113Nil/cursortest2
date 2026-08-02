package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealActivitiesManager$doLoad$1 extends ContinuationImpl {
    public ActivitiesManager.ActivityPage.PageOffset L$0;
    public Activities L$1;
    public ActivitiesManager.ActivityPage L$2;
    public Activities L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealActivitiesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealActivitiesManager$doLoad$1(RealActivitiesManager realActivitiesManager, Continuation continuation) {
        super(continuation);
        this.this$0 = realActivitiesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doLoad(null, this);
    }
}
