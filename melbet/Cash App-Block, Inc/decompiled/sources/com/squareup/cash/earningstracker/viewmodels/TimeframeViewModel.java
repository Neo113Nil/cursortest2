package com.squareup.cash.earningstracker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TimeframeViewModel {
    public final boolean isSelected;
    public final String label;
    public final Timeframe timeframe;

    public TimeframeViewModel(Timeframe timeframe, String str, boolean z) {
        str.getClass();
        this.timeframe = timeframe;
        this.label = str;
        this.isSelected = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeframeViewModel)) {
            return false;
        }
        TimeframeViewModel timeframeViewModel = (TimeframeViewModel) obj;
        return this.timeframe == timeframeViewModel.timeframe && Intrinsics.areEqual(this.label, timeframeViewModel.label) && this.isSelected == timeframeViewModel.isSelected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timeframe.hashCode() * 31, 31, this.label);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeframeViewModel(timeframe=");
        sb.append(this.timeframe);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", isSelected=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isSelected, ")");
    }
}
