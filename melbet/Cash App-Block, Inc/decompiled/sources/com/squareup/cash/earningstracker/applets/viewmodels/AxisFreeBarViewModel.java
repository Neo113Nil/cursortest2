package com.squareup.cash.earningstracker.applets.viewmodels;

/* loaded from: classes6.dex */
public final class AxisFreeBarViewModel {
    public final BarColor color;
    public final long value;

    public AxisFreeBarViewModel(long j, BarColor barColor) {
        this.value = j;
        this.color = barColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AxisFreeBarViewModel)) {
            return false;
        }
        AxisFreeBarViewModel axisFreeBarViewModel = (AxisFreeBarViewModel) obj;
        return this.value == axisFreeBarViewModel.value && this.color == axisFreeBarViewModel.color;
    }

    public final int hashCode() {
        return this.color.hashCode() + (Long.hashCode(this.value) * 31);
    }

    public final String toString() {
        return "AxisFreeBarViewModel(value=" + this.value + ", color=" + this.color + ")";
    }
}
