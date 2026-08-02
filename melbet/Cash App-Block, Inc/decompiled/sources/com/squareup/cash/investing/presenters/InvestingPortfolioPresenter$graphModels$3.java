package com.squareup.cash.investing.presenters;

import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Triple;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioPresenter$graphModels$3 extends AdaptedFunctionReference implements Function4 {
    public static final InvestingPortfolioPresenter$graphModels$3 INSTANCE = new InvestingPortfolioPresenter$graphModels$3(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Boolean bool2 = (Boolean) obj3;
        bool2.booleanValue();
        int i = InvestingPortfolioPresenter.$r8$clinit;
        return new Triple((HistoricalRange) obj, bool, bool2);
    }
}
