package com.squareup.cash.banking.navigation.real;

import app.cash.broadway.navigation.Navigator;
import com.fillr.featuretoggle.UnleashContext;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealBankingOutboundNavigator$startTransferFlow$1 extends ContinuationImpl {
    public Navigator L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UnleashContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBankingOutboundNavigator$startTransferFlow$1(UnleashContext unleashContext, Continuation continuation) {
        super(continuation);
        this.this$0 = unleashContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startTransferFlow(null, null, this);
    }
}
