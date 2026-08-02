package com.squareup.cash.investing.db;

import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentPerformanceQueries$forEntityToken$2 extends FunctionReferenceImpl implements Function3 {
    public static final InvestmentPerformanceQueries$forEntityToken$2 INSTANCE = new InvestmentPerformanceQueries$forEntityToken$2(3, Investment_performance.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        List list = (List) obj3;
        str.getClass();
        list.getClass();
        return new Investment_performance(str, (String) obj2, list);
    }
}
