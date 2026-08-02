package com.squareup.cash.formview.components;

import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$toView$7$1$1$1 extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Money money = (Money) obj;
        money.getClass();
        return ((MoneyFormatter) this.receiver).format(money);
    }
}
