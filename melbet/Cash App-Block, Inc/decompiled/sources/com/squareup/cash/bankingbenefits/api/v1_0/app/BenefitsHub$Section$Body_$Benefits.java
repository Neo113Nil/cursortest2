package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$Benefits extends ImageResourcesKt {
    public final BenefitsHub.Benefits value;

    public BenefitsHub$Section$Body_$Benefits(BenefitsHub.Benefits benefits) {
        benefits.getClass();
        this.value = benefits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$Benefits) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$Benefits) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Benefits(value=" + this.value + ")";
    }
}
