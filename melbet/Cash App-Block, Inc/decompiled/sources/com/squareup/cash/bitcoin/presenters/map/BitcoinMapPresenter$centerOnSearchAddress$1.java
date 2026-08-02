package com.squareup.cash.bitcoin.presenters.map;

import com.squareup.address.typeahead.backend.api.SearchLocation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinMapPresenter$centerOnSearchAddress$1 extends ContinuationImpl {
    public SearchLocation L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinMapPresenter$centerOnSearchAddress$1(BitcoinMapPresenter bitcoinMapPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bitcoinMapPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BitcoinMapPresenter.access$centerOnSearchAddress(this.this$0, null, this);
    }
}
