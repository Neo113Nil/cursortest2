package com.squareup.cash.card.spendinginsights.activity;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SpendingInsightsActivityRequestHandler$requestPage$1 extends ContinuationImpl {
    public ActivitiesManager.ActivityPage.PageOffset L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SpendingInsightsActivityRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpendingInsightsActivityRequestHandler$requestPage$1(SpendingInsightsActivityRequestHandler spendingInsightsActivityRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = spendingInsightsActivityRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestPage(null, null, this);
    }
}
