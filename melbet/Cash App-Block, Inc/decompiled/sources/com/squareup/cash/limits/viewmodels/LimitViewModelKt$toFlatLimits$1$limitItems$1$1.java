package com.squareup.cash.limits.viewmodels;

import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class LimitViewModelKt$toFlatLimits$1$limitItems$1$1 extends FunctionReferenceImpl implements Function1 {
    public static final LimitViewModelKt$toFlatLimits$1$limitItems$1$1 INSTANCE = new LimitViewModelKt$toFlatLimits$1$limitItems$1$1(1, Moneys.class, "formatMoney", "formatMoney(Lcom/squareup/protos/common/Money;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Money money = (Money) obj;
        money.getClass();
        return Moneys.formatMoney(money);
    }
}
