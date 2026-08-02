package com.squareup.cash.investing.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class TransferStockPresenter$handleTradeEvent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransferStockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStockPresenter$handleTradeEvent$1(TransferStockPresenter transferStockPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = transferStockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TransferStockPresenter.access$handleTradeEvent(this.this$0, null, null, null, null, null, null, this);
    }
}
