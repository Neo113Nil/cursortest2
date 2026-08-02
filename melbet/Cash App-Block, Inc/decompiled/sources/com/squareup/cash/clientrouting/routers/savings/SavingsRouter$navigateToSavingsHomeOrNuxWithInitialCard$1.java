package com.squareup.cash.clientrouting.routers.savings;

import com.squareup.cash.savings.backend.api.model.SavingsCard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1 extends ContinuationImpl {
    public SavingsCard L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SavingsRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1(SavingsRouter savingsRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = savingsRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.navigateToSavingsHomeOrNuxWithInitialCard(null, this);
    }
}
