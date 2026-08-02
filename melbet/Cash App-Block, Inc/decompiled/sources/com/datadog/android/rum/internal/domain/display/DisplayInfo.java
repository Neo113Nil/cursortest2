package com.datadog.android.rum.internal.domain.display;

import com.datadog.android.rum.internal.domain.InfoData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DisplayInfo implements InfoData {
    public final Number screenBrightness;

    public DisplayInfo(Float f) {
        this.screenBrightness = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisplayInfo) && Intrinsics.areEqual(this.screenBrightness, ((DisplayInfo) obj).screenBrightness);
    }

    public final int hashCode() {
        Number number = this.screenBrightness;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public final String toString() {
        return "DisplayInfo(screenBrightness=" + this.screenBrightness + ")";
    }
}
