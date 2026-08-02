package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.BetweenSection;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection extends RipplesKt {
    public final BetweenSection value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection(BetweenSection betweenSection) {
        betweenSection.getClass();
        this.value = betweenSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$BetweenSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BetweenSection(value=" + this.value + ")";
    }
}
