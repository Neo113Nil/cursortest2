package com.squareup.cash.investing.viewmodels.custom.order;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes6.dex */
public final class CustomOrderTooltipViewModel$Informational extends TypesJVMKt {
    public final String text;

    public CustomOrderTooltipViewModel$Informational(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomOrderTooltipViewModel$Informational) && Intrinsics.areEqual(this.text, ((CustomOrderTooltipViewModel$Informational) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Informational(text=", this.text, ")");
    }
}
