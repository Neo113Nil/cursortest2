package com.datadog.android.core.configuration;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class BackPressureStrategy {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BackPressureStrategy);
    }

    public final int hashCode() {
        return CameraSelector$$ExternalSyntheticOutline0.ordinal(2) + ((Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2.INSTANCE.hashCode() + ((Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1.INSTANCE.hashCode() + (Integer.hashCode(1024) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackPressureStrategy(capacity=1024, onThresholdReached=");
        sb.append(Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1.INSTANCE);
        sb.append(", onItemDropped=");
        sb.append(Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2.INSTANCE);
        sb.append(", backpressureMitigation=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, "IGNORE_NEWEST", ")");
    }
}
