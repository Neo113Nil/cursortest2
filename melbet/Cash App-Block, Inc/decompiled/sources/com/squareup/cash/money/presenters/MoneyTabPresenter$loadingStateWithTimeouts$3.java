package com.squareup.cash.money.presenters;

import java.util.Set;
import kotlin.Triple;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabPresenter$loadingStateWithTimeouts$3 extends AdaptedFunctionReference implements Function4 {
    public static final MoneyTabPresenter$loadingStateWithTimeouts$3 INSTANCE = new MoneyTabPresenter$loadingStateWithTimeouts$3(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Boolean bool2 = (Boolean) obj2;
        bool2.booleanValue();
        return new Triple(bool, bool2, (Set) obj3);
    }
}
