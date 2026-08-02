package com.squareup.cash.history.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1 extends ContinuationImpl {
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalHomePresenter.access$handleActionClickWithoutUrl(this.this$0, this);
    }
}
