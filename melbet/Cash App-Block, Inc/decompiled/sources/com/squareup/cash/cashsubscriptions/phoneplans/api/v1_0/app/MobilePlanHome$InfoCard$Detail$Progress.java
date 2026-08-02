package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.TextFieldValueKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InfoCard$Detail$Progress extends TextFieldValueKt {
    public final float value;

    public MobilePlanHome$InfoCard$Detail$Progress(float f) {
        this.value = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobilePlanHome$InfoCard$Detail$Progress) && Float.compare(this.value, ((MobilePlanHome$InfoCard$Detail$Progress) obj).value) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "Progress(value=", ")");
    }
}
