package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection extends RipplesKt {
    public final WithinSection value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection(WithinSection withinSection) {
        withinSection.getClass();
        this.value = withinSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$WithinSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "WithinSection(value=" + this.value + ")";
    }
}
