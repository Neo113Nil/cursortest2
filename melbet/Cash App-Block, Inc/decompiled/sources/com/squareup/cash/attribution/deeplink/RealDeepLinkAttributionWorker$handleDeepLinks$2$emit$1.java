package com.squareup.cash.attribution.deeplink;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1 extends ContinuationImpl {
    public DeepLink L$0;
    public Navigator L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinDepositsPresenter$models$2$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1(BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = bitcoinDepositsPresenter$models$2$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((DeepLink) null, (Continuation) this);
    }
}
