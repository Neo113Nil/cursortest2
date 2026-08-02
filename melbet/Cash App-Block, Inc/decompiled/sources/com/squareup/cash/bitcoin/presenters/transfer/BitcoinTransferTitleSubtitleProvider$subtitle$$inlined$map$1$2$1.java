package com.squareup.cash.bitcoin.presenters.transfer;

import com.squareup.cash.bitcoin.presenters.BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1(BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1 bitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = bitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
