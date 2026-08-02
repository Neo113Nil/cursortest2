package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$BenefitsBreakdown extends ImageResourcesKt {
    public final BenefitsHub.BenefitsBreakdown value;

    public BenefitsHub$Section$Body_$BenefitsBreakdown(BenefitsHub.BenefitsBreakdown benefitsBreakdown) {
        benefitsBreakdown.getClass();
        this.value = benefitsBreakdown;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$BenefitsBreakdown) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BenefitsBreakdown(value=" + this.value + ")";
    }
}
