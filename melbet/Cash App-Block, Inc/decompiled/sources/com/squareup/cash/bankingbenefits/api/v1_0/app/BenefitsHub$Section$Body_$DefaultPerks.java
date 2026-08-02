package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsHub$Section$Body_$DefaultPerks extends ImageResourcesKt {
    public final BenefitsHub.DefaultPerks value;

    public BenefitsHub$Section$Body_$DefaultPerks(BenefitsHub.DefaultPerks defaultPerks) {
        defaultPerks.getClass();
        this.value = defaultPerks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHub$Section$Body_$DefaultPerks) && Intrinsics.areEqual(this.value, ((BenefitsHub$Section$Body_$DefaultPerks) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DefaultPerks(value=" + this.value + ")";
    }
}
