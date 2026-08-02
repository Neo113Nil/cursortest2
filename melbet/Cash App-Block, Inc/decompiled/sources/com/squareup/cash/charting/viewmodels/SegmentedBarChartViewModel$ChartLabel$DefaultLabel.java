package com.squareup.cash.charting.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SegmentedBarChartViewModel$ChartLabel$DefaultLabel {
    public final String text;
    public final Float value;
    public final String valueText;

    public SegmentedBarChartViewModel$ChartLabel$DefaultLabel(String str, String str2, Float f, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        f = (i & 4) != 0 ? null : f;
        this.text = str;
        this.valueText = str2;
        this.value = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentedBarChartViewModel$ChartLabel$DefaultLabel)) {
            return false;
        }
        SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel = (SegmentedBarChartViewModel$ChartLabel$DefaultLabel) obj;
        return Intrinsics.areEqual(this.text, segmentedBarChartViewModel$ChartLabel$DefaultLabel.text) && Intrinsics.areEqual(this.valueText, segmentedBarChartViewModel$ChartLabel$DefaultLabel.valueText) && Intrinsics.areEqual((Object) this.value, (Object) segmentedBarChartViewModel$ChartLabel$DefaultLabel.value);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.value;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultLabel(text=", this.text, ", valueText=", this.valueText, ", value=");
        m.append(this.value);
        m.append(")");
        return m.toString();
    }
}
