package com.squareup.cash.deposits.physical.presenter.map;

import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapPresenter$centerOnSearchAddress$1 extends ContinuationImpl {
    public SelectedSearchAddressResult L$0;
    public SearchLocation L$1;
    public LocationSearchClient$LocationDetailsResult.Success L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaperMoneyDepositMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperMoneyDepositMapPresenter$centerOnSearchAddress$1(PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paperMoneyDepositMapPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaperMoneyDepositMapPresenter.access$centerOnSearchAddress(this.this$0, null, this);
    }
}
