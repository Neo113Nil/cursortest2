package com.squareup.cash.db2;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Intervals {
    public final List retry_intervals;

    public Intervals(List list) {
        this.retry_intervals = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Intervals) && Intrinsics.areEqual(this.retry_intervals, ((Intervals) obj).retry_intervals);
    }

    public final int hashCode() {
        List list = this.retry_intervals;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("Intervals(retry_intervals=", ")", this.retry_intervals);
    }
}
