package com.squareup.cash.merchant.presenters;

import app.cash.local.presenters.LocalCashBalancePresenter;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MerchantBlockingPresenter$getBlockedBusinessesConfig$1 extends ContinuationImpl {
    public TooltipBoxKt$$ExternalSyntheticLambda2 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalCashBalancePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantBlockingPresenter$getBlockedBusinessesConfig$1(LocalCashBalancePresenter localCashBalancePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localCashBalancePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalCashBalancePresenter.access$getBlockedBusinessesConfig(this.this$0, null, null, this);
    }
}
