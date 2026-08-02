package com.squareup.cash.charting.components;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AxisPlacement {
    public final String label;
    public final float yOffset;

    public AxisPlacement(String str, float f) {
        str.getClass();
        this.label = str;
        this.yOffset = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AxisPlacement)) {
            return false;
        }
        AxisPlacement axisPlacement = (AxisPlacement) obj;
        return Intrinsics.areEqual(this.label, axisPlacement.label) && Float.compare(this.yOffset, axisPlacement.yOffset) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.yOffset) + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return "AxisPlacement(label=" + this.label + ", yOffset=" + this.yOffset + ")";
    }
}
