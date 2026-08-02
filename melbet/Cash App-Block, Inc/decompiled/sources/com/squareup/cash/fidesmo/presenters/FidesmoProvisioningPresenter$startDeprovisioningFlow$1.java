package com.squareup.cash.fidesmo.presenters;

import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$startDeprovisioningFlow$1 extends ContinuationImpl {
    public FidesmoActivationData L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FidesmoProvisioningPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$startDeprovisioningFlow$1(FidesmoProvisioningPresenter fidesmoProvisioningPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fidesmoProvisioningPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startDeprovisioningFlow$1(null, null, this);
    }
}
