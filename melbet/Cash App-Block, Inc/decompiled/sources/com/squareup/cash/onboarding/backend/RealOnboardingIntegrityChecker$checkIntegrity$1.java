package com.squareup.cash.onboarding.backend;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealOnboardingIntegrityChecker$checkIntegrity$1 extends ContinuationImpl {
    public OnboardingIntegrityChecker$TriggeredBy L$0;
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOnboardingIntegrityChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOnboardingIntegrityChecker$checkIntegrity$1(RealOnboardingIntegrityChecker realOnboardingIntegrityChecker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOnboardingIntegrityChecker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.checkIntegrity(null, this);
    }
}
