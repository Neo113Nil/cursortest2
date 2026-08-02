package com.squareup.cash.globalsearch.presenters;

import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1 extends ContinuationImpl {
    public Analytics L$0;
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivitySectionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1(ActivitySectionPresenter activitySectionPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = activitySectionPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ActivitySectionPresenter.access$trackLoadMoreSelectAnalytics(this.this$0, this);
    }
}
