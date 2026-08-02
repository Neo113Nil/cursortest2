package com.squareup.cash.instruments.presenters;

import com.squareup.cash.instruments.common.BalanceSnapshot;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$7 extends AdaptedFunctionReference implements Function3 {
    public static final SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$7 INSTANCE = new SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$7(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((BalanceSnapshot) obj, (List) obj2);
    }
}
