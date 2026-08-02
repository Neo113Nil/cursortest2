package com.squareup.cash.blockers.presenters;

import com.squareup.cash.plaid.api.PlaidLinkResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PlaidLinkPresenter$handleLinkSuccess$1 extends ContinuationImpl {
    public PlaidLinkResult.Success L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PlaidLinkPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkPresenter$handleLinkSuccess$1(PlaidLinkPresenter plaidLinkPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = plaidLinkPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleLinkSuccess(null, this);
    }
}
