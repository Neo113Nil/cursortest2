package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$CallToActions extends ImageResourcesKt {
    public final BenefitsHub.CallToActions value;

    public BenefitsHub$Section$Body_$CallToActions(BenefitsHub.CallToActions callToActions) {
        callToActions.getClass();
        this.value = callToActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$CallToActions) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$CallToActions) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CallToActions(value=" + this.value + ")";
    }
}
