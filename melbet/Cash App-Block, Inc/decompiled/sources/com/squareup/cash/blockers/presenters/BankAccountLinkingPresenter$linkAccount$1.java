package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class BankAccountLinkingPresenter$linkAccount$1 extends ContinuationImpl {
    public BankAccountLinkingViewModel L$0;
    public BankAccountLinker$Result L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BankAccountLinkingPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountLinkingPresenter$linkAccount$1(BankAccountLinkingPresenter bankAccountLinkingPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bankAccountLinkingPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BankAccountLinkingPresenter.access$linkAccount(this.this$0, null, this);
    }
}
