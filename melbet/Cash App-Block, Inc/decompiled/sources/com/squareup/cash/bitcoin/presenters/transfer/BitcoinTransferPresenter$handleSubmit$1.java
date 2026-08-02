package com.squareup.cash.bitcoin.presenters.transfer;

import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinTransferPresenter$handleSubmit$1 extends ContinuationImpl {
    public long J$0;
    public BitcoinTransferScreen.SavedState L$0;
    public AmountSelection L$1;
    public CurrencyCode L$2;
    public CryptoBalance$BitcoinBalance L$3;
    public Instrument L$4;
    public Money L$5;
    public Money L$6;
    public List L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinTransferPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinTransferPresenter$handleSubmit$1(BitcoinTransferPresenter bitcoinTransferPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bitcoinTransferPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BitcoinTransferPresenter.access$handleSubmit(this.this$0, 0L, null, null, null, null, null, null, null, null, this);
    }
}
