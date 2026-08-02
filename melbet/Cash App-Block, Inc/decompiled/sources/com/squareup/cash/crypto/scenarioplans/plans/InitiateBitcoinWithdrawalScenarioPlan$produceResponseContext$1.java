package com.squareup.cash.crypto.scenarioplans.plans;

import androidx.media3.common.util.StuckPlayerDetector;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InitiateBitcoinWithdrawalScenarioPlan$produceResponseContext$1 extends ContinuationImpl {
    public BlockersData L$0;
    public InitiateBitcoinWithdrawal$Request L$1;
    public StuckPlayerDetector L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StuckPlayerDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateBitcoinWithdrawalScenarioPlan$produceResponseContext$1(StuckPlayerDetector stuckPlayerDetector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.produceResponseContext(null, this);
    }
}
