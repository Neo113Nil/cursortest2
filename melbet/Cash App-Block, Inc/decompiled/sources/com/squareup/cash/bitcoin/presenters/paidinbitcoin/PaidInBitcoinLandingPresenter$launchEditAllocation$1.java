package com.squareup.cash.bitcoin.presenters.paidinbitcoin;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class PaidInBitcoinLandingPresenter$launchEditAllocation$1 extends ContinuationImpl {
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaidInBitcoinLandingPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidInBitcoinLandingPresenter$launchEditAllocation$1(PaidInBitcoinLandingPresenter paidInBitcoinLandingPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paidInBitcoinLandingPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaidInBitcoinLandingPresenter.access$launchEditAllocation(this.this$0, false, this);
    }
}
