package com.datadog.android.core.internal.persistence.file;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class FilePersistenceConfig {
    public final long cleanupFrequencyThreshold;
    public final long maxBatchSize;
    public final long maxDiskSpace;
    public final long maxItemSize;
    public final int maxItemsPerBatch;
    public final long oldFileThreshold;
    public final long recentDelayMs;

    public FilePersistenceConfig(long j, long j2, long j3, int i, long j4, long j5, long j6) {
        this.recentDelayMs = j;
        this.maxBatchSize = j2;
        this.maxItemSize = j3;
        this.maxItemsPerBatch = i;
        this.oldFileThreshold = j4;
        this.maxDiskSpace = j5;
        this.cleanupFrequencyThreshold = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePersistenceConfig)) {
            return false;
        }
        FilePersistenceConfig filePersistenceConfig = (FilePersistenceConfig) obj;
        return this.recentDelayMs == filePersistenceConfig.recentDelayMs && this.maxBatchSize == filePersistenceConfig.maxBatchSize && this.maxItemSize == filePersistenceConfig.maxItemSize && this.maxItemsPerBatch == filePersistenceConfig.maxItemsPerBatch && this.oldFileThreshold == filePersistenceConfig.oldFileThreshold && this.maxDiskSpace == filePersistenceConfig.maxDiskSpace && this.cleanupFrequencyThreshold == filePersistenceConfig.cleanupFrequencyThreshold;
    }

    public final int hashCode() {
        return Long.hashCode(this.cleanupFrequencyThreshold) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxItemsPerBatch, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.recentDelayMs) * 31, 31, this.maxBatchSize), 31, this.maxItemSize), 31), 31, this.oldFileThreshold), 31, this.maxDiskSpace);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.recentDelayMs, "FilePersistenceConfig(recentDelayMs=", ", maxBatchSize=");
        m1149m.append(this.maxBatchSize);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.maxItemSize, ", maxItemSize=", ", maxItemsPerBatch=", m1149m);
        m1149m.append(this.maxItemsPerBatch);
        m1149m.append(", oldFileThreshold=");
        m1149m.append(this.oldFileThreshold);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.maxDiskSpace, ", maxDiskSpace=", ", cleanupFrequencyThreshold=", m1149m);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.cleanupFrequencyThreshold, ")", m1149m);
    }
}
