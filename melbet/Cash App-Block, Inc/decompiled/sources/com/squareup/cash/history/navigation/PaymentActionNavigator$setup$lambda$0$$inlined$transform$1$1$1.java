package com.squareup.cash.history.navigation;

import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashCdpConfigProvider$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1(CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = cashCdpConfigProvider$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
