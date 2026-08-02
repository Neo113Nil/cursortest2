package com.squareup.cash.bugreporting.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class DeviceMetrics {
    public final int densityDpi;
    public final int heightPixels;
    public final int widthPixels;

    public DeviceMetrics(int i, int i2, int i3) {
        this.widthPixels = i;
        this.heightPixels = i2;
        this.densityDpi = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMetrics)) {
            return false;
        }
        DeviceMetrics deviceMetrics = (DeviceMetrics) obj;
        return this.widthPixels == deviceMetrics.widthPixels && this.heightPixels == deviceMetrics.heightPixels && this.densityDpi == deviceMetrics.densityDpi;
    }

    public final int hashCode() {
        return Integer.hashCode(this.densityDpi) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.heightPixels, Integer.hashCode(this.widthPixels) * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.densityDpi, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.widthPixels, this.heightPixels, "DeviceMetrics(widthPixels=", ", heightPixels=", ", densityDpi="));
    }
}
