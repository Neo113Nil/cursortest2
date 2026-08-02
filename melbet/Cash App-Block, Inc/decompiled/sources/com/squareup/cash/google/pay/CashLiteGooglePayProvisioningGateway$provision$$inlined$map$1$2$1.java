package com.squareup.cash.google.pay;

import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public IssuedCardFactory.IssuedCard L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1(LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = localCashBalancePresenter$models$$inlined$CollectEffect$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
