package com.squareup.cash.profile.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class AdjustableThresholdViewModel {
    public final int currentValue;
    public final boolean isLoading;
    public final int maxValue;
    public final int minValue;

    public AdjustableThresholdViewModel(int i, int i2, boolean z, int i3) {
        this.currentValue = i;
        this.minValue = i2;
        this.maxValue = i3;
        this.isLoading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustableThresholdViewModel)) {
            return false;
        }
        AdjustableThresholdViewModel adjustableThresholdViewModel = (AdjustableThresholdViewModel) obj;
        return this.currentValue == adjustableThresholdViewModel.currentValue && this.minValue == adjustableThresholdViewModel.minValue && this.maxValue == adjustableThresholdViewModel.maxValue && this.isLoading == adjustableThresholdViewModel.isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxValue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minValue, Integer.hashCode(this.currentValue) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.currentValue, this.minValue, "AdjustableThresholdViewModel(currentValue=", ", minValue=", ", maxValue=");
        m107m.append(this.maxValue);
        m107m.append(", isLoading=");
        m107m.append(this.isLoading);
        m107m.append(")");
        return m107m.toString();
    }
}
