package com.squareup.cash.investing.db;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentHoldingQueries$forToken$2 extends FunctionReferenceImpl implements Function7 {
    public static final InvestmentHoldingQueries$forToken$2 INSTANCE = new InvestmentHoldingQueries$forToken$2(7, Investment_holding.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;JLcom/squareup/protos/common/CurrencyCode;Lcom/squareup/protos/franklin/common/SyncInvestmentHolding$InvestmentHoldingState;Lcom/squareup/protos/franklin/common/SyncInvestmentHolding$DailyGainParams;Lcom/squareup/protos/common/Money;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj;
        String str2 = (String) obj2;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = (SyncInvestmentHolding.InvestmentHoldingState) obj5;
        str.getClass();
        str2.getClass();
        investmentHoldingState.getClass();
        return new Investment_holding(str, str2, ((Number) obj3).longValue(), (CurrencyCode) obj4, investmentHoldingState, (SyncInvestmentHolding.DailyGainParams) obj6, (Money) serializable);
    }
}
