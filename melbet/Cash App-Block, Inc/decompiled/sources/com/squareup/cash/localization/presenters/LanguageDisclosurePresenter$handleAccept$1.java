package com.squareup.cash.localization.presenters;

import app.cash.local.presenters.LocalCashBalancePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class LanguageDisclosurePresenter$handleAccept$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalCashBalancePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDisclosurePresenter$handleAccept$1(LocalCashBalancePresenter localCashBalancePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localCashBalancePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalCashBalancePresenter.access$handleAccept(this.this$0, null, this);
    }
}
