package com.squareup.cash.performance;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScrollEventData {
    public final List frameTimestamps;

    public ScrollEventData(List list) {
        list.getClass();
        this.frameTimestamps = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollEventData) && Intrinsics.areEqual(this.frameTimestamps, ((ScrollEventData) obj).frameTimestamps);
    }

    public final int hashCode() {
        return this.frameTimestamps.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ScrollEventData(frameTimestamps=", ")", this.frameTimestamps);
    }
}
