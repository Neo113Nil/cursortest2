package com.squareup.cash.account.presenters.accountswitcher;

import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class SwitchFullAccountLoadingPresenter$switchAccount$1 extends ContinuationImpl {
    public ManagedAccountAnimationInfo L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchFullAccountLoadingPresenter$switchAccount$1(CardStudioPresenter cardStudioPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardStudioPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardStudioPresenter.access$switchAccount(this.this$0, this);
    }
}
