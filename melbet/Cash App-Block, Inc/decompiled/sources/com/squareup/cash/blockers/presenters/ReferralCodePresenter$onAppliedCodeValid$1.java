package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.app.ApplyRewardCodeResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ReferralCodePresenter$onAppliedCodeValid$1 extends ContinuationImpl {
    public ApplyRewardCodeResponse L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReferralCodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodePresenter$onAppliedCodeValid$1(ReferralCodePresenter referralCodePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = referralCodePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onAppliedCodeValid(null, this);
    }
}
