package com.squareup.cash.core.navigationcontainer;

import androidx.compose.runtime.Composer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;

/* loaded from: classes.dex */
public final /* synthetic */ class ComposableSingletons$UiContainerKt$$ExternalSyntheticLambda0 implements Function6 {
    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (obj3 != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        Function2 function2 = (Function2) obj4;
        int intValue = ((Integer) obj6).intValue();
        function2.getClass();
        function2.invoke((Composer) obj5, Integer.valueOf((intValue >> 9) & 14));
        return Unit.INSTANCE;
    }
}
