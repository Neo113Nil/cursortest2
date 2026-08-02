package com.squareup.cash.fidesmo.presenters;

import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1 extends ContinuationImpl {
    public FidesmoActivationData L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FidesmoDeprovisioningPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1(FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fidesmoDeprovisioningPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FidesmoDeprovisioningPresenter.access$startDeprovisioningFlow(this.this$0, null, null, this);
    }
}
