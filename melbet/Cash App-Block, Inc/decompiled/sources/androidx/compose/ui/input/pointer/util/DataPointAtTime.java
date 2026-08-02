package androidx.compose.ui.input.pointer.util;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class DataPointAtTime {
    public float dataPoint;
    public long time;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.dataPoint) + (Long.hashCode(this.time) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.time);
        sb.append(", dataPoint=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.dataPoint, ')');
    }
}
