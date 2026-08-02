package com.squareup.cash.investing.presenters;

import com.squareup.cash.investing.backend.api.PolledData;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioPresenter$isDataStale$3 extends AdaptedFunctionReference implements Function3 {
    public static final InvestingPortfolioPresenter$isDataStale$3 INSTANCE = new InvestingPortfolioPresenter$isDataStale$3(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = InvestingPortfolioPresenter.$r8$clinit;
        return new Pair((PolledData) obj, (PolledData) obj2);
    }
}
