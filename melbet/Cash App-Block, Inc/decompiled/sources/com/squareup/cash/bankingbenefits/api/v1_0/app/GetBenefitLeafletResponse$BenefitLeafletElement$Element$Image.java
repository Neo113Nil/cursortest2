package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.mooncake.theming.RipplesKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.RemoteImage;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image extends RipplesKt {
    public final RemoteImage value;

    public GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image(RemoteImage remoteImage) {
        remoteImage.getClass();
        this.value = remoteImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) && Intrinsics.areEqual(this.value, ((GetBenefitLeafletResponse$BenefitLeafletElement$Element$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
