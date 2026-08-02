package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.LabelsSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AvailabilityPill {
    public final String text;
    public final LabelsSection.LabelTreatment treatment;

    public AvailabilityPill(String str, LabelsSection.LabelTreatment labelTreatment) {
        str.getClass();
        this.text = str;
        this.treatment = labelTreatment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailabilityPill)) {
            return false;
        }
        AvailabilityPill availabilityPill = (AvailabilityPill) obj;
        return Intrinsics.areEqual(this.text, availabilityPill.text) && this.treatment.equals(availabilityPill.treatment);
    }

    public final int hashCode() {
        return this.treatment.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "AvailabilityPill(text=" + this.text + ", treatment=" + this.treatment + ")";
    }
}
