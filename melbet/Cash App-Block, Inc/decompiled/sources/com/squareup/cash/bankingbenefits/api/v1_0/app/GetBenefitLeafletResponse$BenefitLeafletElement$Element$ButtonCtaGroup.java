package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup extends RipplesKt {
    public final ActionableButtonCtaGroup value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup(ActionableButtonCtaGroup actionableButtonCtaGroup) {
        actionableButtonCtaGroup.getClass();
        this.value = actionableButtonCtaGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ButtonCtaGroup) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonCtaGroup(value=" + this.value + ")";
    }
}
