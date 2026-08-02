package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ListOrdered;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered extends RipplesKt {
    public final ListOrdered value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered(ListOrdered listOrdered) {
        listOrdered.getClass();
        this.value = listOrdered;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$ListOrdered) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ListOrdered(value=" + this.value + ")";
    }
}
