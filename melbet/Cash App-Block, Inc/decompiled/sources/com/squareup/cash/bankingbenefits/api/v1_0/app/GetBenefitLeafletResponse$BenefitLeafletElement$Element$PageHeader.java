package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.PageHeader;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader extends RipplesKt {
    public final PageHeader value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader(PageHeader pageHeader) {
        pageHeader.getClass();
        this.value = pageHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$PageHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PageHeader(value=" + this.value + ")";
    }
}
