package com.datadog.android.api.storage;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class FeatureStorageConfiguration {
    public static final FeatureStorageConfiguration DEFAULT = new FeatureStorageConfiguration(500, 524288, 4194304, 64800000);
    public final long maxBatchSize;
    public final long maxItemSize;
    public final int maxItemsPerBatch;
    public final long oldBatchThreshold;

    public FeatureStorageConfiguration(int i, long j, long j2, long j3) {
        this.maxItemSize = j;
        this.maxItemsPerBatch = i;
        this.maxBatchSize = j2;
        this.oldBatchThreshold = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureStorageConfiguration)) {
            return false;
        }
        FeatureStorageConfiguration featureStorageConfiguration = (FeatureStorageConfiguration) obj;
        return this.maxItemSize == featureStorageConfiguration.maxItemSize && this.maxItemsPerBatch == featureStorageConfiguration.maxItemsPerBatch && this.maxBatchSize == featureStorageConfiguration.maxBatchSize && this.oldBatchThreshold == featureStorageConfiguration.oldBatchThreshold;
    }

    public final int hashCode() {
        return Long.hashCode(this.oldBatchThreshold) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxItemsPerBatch, Long.hashCode(this.maxItemSize) * 31, 31), 31, this.maxBatchSize);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureStorageConfiguration(maxItemSize=");
        sb.append(this.maxItemSize);
        sb.append(", maxItemsPerBatch=");
        sb.append(this.maxItemsPerBatch);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.maxBatchSize, ", maxBatchSize=", ", oldBatchThreshold=", sb);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.oldBatchThreshold, ")", sb);
    }
}
