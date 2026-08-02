package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.TextFieldValueKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InfoCard$Detail$Caption extends TextFieldValueKt {
    public final String value;

    public MobilePlanHome$InfoCard$Detail$Caption(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobilePlanHome$InfoCard$Detail$Caption) && Intrinsics.areEqual(this.value, ((MobilePlanHome$InfoCard$Detail$Caption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Caption(value=", this.value, ")");
    }
}
