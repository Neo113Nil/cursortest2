package com.squareup.cash.account.presenters.documents;

import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class AccountDocumentsDownloaderPresenter$accountStatementFileData$1 extends ContinuationImpl {
    public DocumentDownloaderScreen.AccountStatementDownloaderScreen L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDocumentsDownloaderPresenter$accountStatementFileData$1(DisclosurePresenter disclosurePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = disclosurePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.accountStatementFileData(null, this);
    }
}
