package com.squareup.cash.investing.viewmodels.custom.order;

import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CancelOrderViewModel {
    public final ColorModel accentColor;
    public final String flowToken;
    public final String message;
    public final String paymentToken;

    public CancelOrderViewModel(String str, String str2, String str3, ColorModel colorModel) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        colorModel.getClass();
        this.flowToken = str;
        this.paymentToken = str2;
        this.message = str3;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOrderViewModel)) {
            return false;
        }
        CancelOrderViewModel cancelOrderViewModel = (CancelOrderViewModel) obj;
        return Intrinsics.areEqual(this.flowToken, cancelOrderViewModel.flowToken) && Intrinsics.areEqual(this.paymentToken, cancelOrderViewModel.paymentToken) && Intrinsics.areEqual(this.message, cancelOrderViewModel.message) && Intrinsics.areEqual(this.accentColor, cancelOrderViewModel.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken), 31, this.message);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelOrderViewModel(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", message=");
        m.append(this.message);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
