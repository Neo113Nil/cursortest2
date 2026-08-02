package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$Disclosures extends ImageResourcesKt {
    public final BenefitsHub.Disclosures value;

    public BenefitsHub$Section$Body_$Disclosures(BenefitsHub.Disclosures disclosures) {
        disclosures.getClass();
        this.value = disclosures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$Disclosures) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$Disclosures) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disclosures(value=" + this.value + ")";
    }
}
