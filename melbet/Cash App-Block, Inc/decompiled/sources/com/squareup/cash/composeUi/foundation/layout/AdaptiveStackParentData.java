package com.squareup.cash.composeUi.foundation.layout;

/* loaded from: classes.dex */
public final class AdaptiveStackParentData {
    public boolean fill;
    public float weight;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptiveStackParentData)) {
            return false;
        }
        AdaptiveStackParentData adaptiveStackParentData = (AdaptiveStackParentData) obj;
        return Float.compare(this.weight, adaptiveStackParentData.weight) == 0 && this.fill == adaptiveStackParentData.fill;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fill) + (Float.hashCode(this.weight) * 31);
    }

    public final String toString() {
        return "AdaptiveStackParentData(weight=" + this.weight + ", fill=" + this.fill + ")";
    }
}
