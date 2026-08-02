package com.squareup.cash.investing.viewmodels.custom.order;

import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes6.dex */
public final class CustomOrderTooltipViewModel$PercentChange extends TypesJVMKt {
    public final String bottomText;
    public final InvestingCryptoImage bottomTextIcon;
    public final String topText;

    public CustomOrderTooltipViewModel$PercentChange(String str, String str2, InvestingCryptoImage investingCryptoImage) {
        str.getClass();
        this.topText = str;
        this.bottomText = str2;
        this.bottomTextIcon = investingCryptoImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomOrderTooltipViewModel$PercentChange)) {
            return false;
        }
        CustomOrderTooltipViewModel$PercentChange customOrderTooltipViewModel$PercentChange = (CustomOrderTooltipViewModel$PercentChange) obj;
        return Intrinsics.areEqual(this.topText, customOrderTooltipViewModel$PercentChange.topText) && this.bottomText.equals(customOrderTooltipViewModel$PercentChange.bottomText) && this.bottomTextIcon == customOrderTooltipViewModel$PercentChange.bottomTextIcon;
    }

    public final int hashCode() {
        return this.bottomTextIcon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.topText.hashCode() * 31, 31, this.bottomText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PercentChange(topText=", this.topText, ", bottomText=", this.bottomText, ", bottomTextIcon=");
        m.append(this.bottomTextIcon);
        m.append(")");
        return m.toString();
    }
}
