package com.squareup.cash.investing.viewmodels.custom.order;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes6.dex */
public final class CustomOrderTooltipViewModel$CurrentPrice extends TypesJVMKt {
    public final String bottomText;
    public final String topText;

    public CustomOrderTooltipViewModel$CurrentPrice(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.topText = str;
        this.bottomText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomOrderTooltipViewModel$CurrentPrice)) {
            return false;
        }
        CustomOrderTooltipViewModel$CurrentPrice customOrderTooltipViewModel$CurrentPrice = (CustomOrderTooltipViewModel$CurrentPrice) obj;
        return Intrinsics.areEqual(this.topText, customOrderTooltipViewModel$CurrentPrice.topText) && Intrinsics.areEqual(this.bottomText, customOrderTooltipViewModel$CurrentPrice.bottomText);
    }

    public final int hashCode() {
        return this.bottomText.hashCode() + (this.topText.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CurrentPrice(topText=", this.topText, ", bottomText=", this.bottomText, ")");
    }
}
