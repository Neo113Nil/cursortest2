package com.squareup.cash.mosaic.personalization.api.v1;

import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Entity$SpecificEntity$Payment {
    public final Entity.Payment value;

    public Entity$SpecificEntity$Payment(Entity.Payment payment) {
        payment.getClass();
        this.value = payment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Entity$SpecificEntity$Payment) && Intrinsics.areEqual(this.value, ((Entity$SpecificEntity$Payment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Payment(value=" + this.value + ")";
    }
}
