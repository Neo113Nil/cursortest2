package com.squareup.cash.blockers.presenters.onboarding;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class WelcomePresenter$completeOnboardingTasks$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WelcomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePresenter$completeOnboardingTasks$1(WelcomePresenter welcomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = welcomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.completeOnboardingTasks(this);
    }
}
