package com.squareup.cash.crypto.scenarioplans.plans;

import com.fillr.e0;
import com.squareup.cash.blockers.data.BlockersData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1 extends ContinuationImpl {
    public BlockersData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateCashLiteBitcoinWithdrawalScenarioPlan$onFailure$1(e0 e0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onFailure(null, this);
    }
}
