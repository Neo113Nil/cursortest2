package com.squareup.cash.core.navigationcontainer.navigator;

import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class CashNavigator$special$$inlined$invoke$1 extends FunctionReferenceImpl implements Function1 {
    public static final CashNavigator$special$$inlined$invoke$1 INSTANCE = new CashNavigator$special$$inlined$invoke$1(1, ArrayIteratorKt.class, "enumValueOf", "enumValueOf(Ljava/lang/String;)Ljava/lang/Enum;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return NavigatorState.valueOf(str);
    }
}
