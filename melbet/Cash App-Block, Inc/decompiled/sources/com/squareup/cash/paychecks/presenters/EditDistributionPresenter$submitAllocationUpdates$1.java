package com.squareup.cash.paychecks.presenters;

import app.cash.local.presenters.LocalCashBalancePresenter;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class EditDistributionPresenter$submitAllocationUpdates$1 extends ContinuationImpl {
    public SetPaycheckAllocationAmountInputs.SubmissionInteraction L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalCashBalancePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditDistributionPresenter$submitAllocationUpdates$1(LocalCashBalancePresenter localCashBalancePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localCashBalancePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalCashBalancePresenter.access$submitAllocationUpdates(this.this$0, null, null, null, this);
    }
}
