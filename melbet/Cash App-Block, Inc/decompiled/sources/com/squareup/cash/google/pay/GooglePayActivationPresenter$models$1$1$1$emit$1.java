package com.squareup.cash.google.pay;

import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GooglePayActivationPresenter$models$1$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingHomeView$2$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayActivationPresenter$models$1$1$1$emit$1(InvestingHomeView$2$1 investingHomeView$2$1, Continuation continuation) {
        super(continuation);
        this.this$0 = investingHomeView$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((IssuedCardFactory.IssuedCard) null, (Continuation) this);
    }
}
