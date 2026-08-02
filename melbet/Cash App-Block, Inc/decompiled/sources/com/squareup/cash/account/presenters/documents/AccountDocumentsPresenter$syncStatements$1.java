package com.squareup.cash.account.presenters.documents;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AccountDocumentsPresenter$syncStatements$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AccountDocumentsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDocumentsPresenter$syncStatements$1(AccountDocumentsPresenter accountDocumentsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = accountDocumentsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AccountDocumentsPresenter.access$syncStatements(this.this$0, this);
    }
}
