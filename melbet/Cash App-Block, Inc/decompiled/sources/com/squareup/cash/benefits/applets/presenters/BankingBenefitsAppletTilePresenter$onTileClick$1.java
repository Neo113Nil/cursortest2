package com.squareup.cash.benefits.applets.presenters;

import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import squareup.cash.bankingbenefits.ui.CashGreenV1;

/* loaded from: classes7.dex */
public final class BankingBenefitsAppletTilePresenter$onTileClick$1 extends ContinuationImpl {
    public CashGreenV1 L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LinkedAccountsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankingBenefitsAppletTilePresenter$onTileClick$1(LinkedAccountsPresenter linkedAccountsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = linkedAccountsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LinkedAccountsPresenter.access$onTileClick(this.this$0, null, false, this);
    }
}
