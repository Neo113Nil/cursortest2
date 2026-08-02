package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$Insights extends ImageResourcesKt {
    public final BenefitsHub.Insights value;

    public BenefitsHub$Section$Body_$Insights(BenefitsHub.Insights insights) {
        insights.getClass();
        this.value = insights;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$Insights) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$Insights) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Insights(value=" + this.value + ")";
    }
}
