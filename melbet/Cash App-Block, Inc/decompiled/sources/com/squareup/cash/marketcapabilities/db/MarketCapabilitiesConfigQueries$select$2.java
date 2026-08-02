package com.squareup.cash.marketcapabilities.db;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class MarketCapabilitiesConfigQueries$select$2 extends FunctionReferenceImpl implements Function2 {
    public static final MarketCapabilitiesConfigQueries$select$2 INSTANCE = new MarketCapabilitiesConfigQueries$select$2(2, MarketCapabilitiesConfig.class, "<init>", "<init>(Ljava/lang/String;Ljava/util/List;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        str.getClass();
        list.getClass();
        return new MarketCapabilitiesConfig(str, list);
    }
}
