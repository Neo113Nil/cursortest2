package com.datadog.android.core.internal.configuration;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class DataUploadConfiguration {
    public final long defaultDelayMs;
    public final int frequency;
    public final int maxBatchesPerUploadJob;
    public final long maxDelayMs;
    public final long minDelayMs;

    public DataUploadConfiguration(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        this.frequency = i;
        this.maxBatchesPerUploadJob = i2;
        long baseStepMs = Thread$State$EnumUnboxingLocalUtility.getBaseStepMs(i);
        this.minDelayMs = baseStepMs;
        this.maxDelayMs = 10 * baseStepMs;
        this.defaultDelayMs = 5 * baseStepMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataUploadConfiguration)) {
            return false;
        }
        DataUploadConfiguration dataUploadConfiguration = (DataUploadConfiguration) obj;
        return this.frequency == dataUploadConfiguration.frequency && this.maxBatchesPerUploadJob == dataUploadConfiguration.maxBatchesPerUploadJob;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxBatchesPerUploadJob) + (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.frequency) * 31);
    }

    public final String toString() {
        return "DataUploadConfiguration(frequency=" + Thread$State$EnumUnboxingLocalUtility.stringValueOf$10(this.frequency) + ", maxBatchesPerUploadJob=" + this.maxBatchesPerUploadJob + ")";
    }
}
