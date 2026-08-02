package com.datadog.android.rum.internal.vitals;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class VitalInfo {
    public static final VitalInfo EMPTY = new VitalInfo(Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d, 0);
    public final double maxValue;
    public final double meanValue;
    public final double minValue;
    public final int sampleCount;

    public VitalInfo(double d, double d2, double d3, int i) {
        this.sampleCount = i;
        this.minValue = d;
        this.maxValue = d2;
        this.meanValue = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VitalInfo)) {
            return false;
        }
        VitalInfo vitalInfo = (VitalInfo) obj;
        return this.sampleCount == vitalInfo.sampleCount && Double.compare(this.minValue, vitalInfo.minValue) == 0 && Double.compare(this.maxValue, vitalInfo.maxValue) == 0 && Double.compare(this.meanValue, vitalInfo.meanValue) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.meanValue) + Fragment$5$$ExternalSyntheticOutline0.m(this.maxValue, Fragment$5$$ExternalSyntheticOutline0.m(this.minValue, Integer.hashCode(this.sampleCount) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitalInfo(sampleCount=");
        sb.append(this.sampleCount);
        sb.append(", minValue=");
        sb.append(this.minValue);
        sb.append(", maxValue=");
        sb.append(this.maxValue);
        sb.append(", meanValue=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.meanValue, ")");
    }
}
