package com.squareup.cash.eligibility.backend.real;

import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSettingsEligibilityManager$fetchRemote$1 extends ContinuationImpl {
    public EligibilityRefreshAnalyticsData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSettingsEligibilityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSettingsEligibilityManager$fetchRemote$1(RealSettingsEligibilityManager realSettingsEligibilityManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSettingsEligibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchRemote(null, this);
    }
}
