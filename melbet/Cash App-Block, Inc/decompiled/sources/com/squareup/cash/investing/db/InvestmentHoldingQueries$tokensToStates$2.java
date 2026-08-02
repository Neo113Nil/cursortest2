package com.squareup.cash.investing.db;

import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class InvestmentHoldingQueries$tokensToStates$2 extends FunctionReferenceImpl implements Function2 {
    public static final InvestmentHoldingQueries$tokensToStates$2 INSTANCE = new InvestmentHoldingQueries$tokensToStates$2(2, TokensToStates.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/franklin/common/SyncInvestmentHolding$InvestmentHoldingState;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = (SyncInvestmentHolding.InvestmentHoldingState) obj2;
        str.getClass();
        investmentHoldingState.getClass();
        return new TokensToStates(investmentHoldingState, str);
    }
}
