package com.squareup.cash.instruments.presenters;

import com.squareup.cash.card.onboarding.DisclosurePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1(DisclosurePresenter disclosurePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = disclosurePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DisclosurePresenter.access$navigateToWithdrawInstrumentSelection(this.this$0, null, null, null, this);
    }
}
