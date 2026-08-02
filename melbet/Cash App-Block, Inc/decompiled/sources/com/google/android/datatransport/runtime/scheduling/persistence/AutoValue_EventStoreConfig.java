package com.google.android.datatransport.runtime.scheduling.persistence;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_EventStoreConfig {
    public static final AutoValue_EventStoreConfig DEFAULT = new AutoValue_EventStoreConfig(10485760, 200, 10000, 604800000, 81920);
    public final int criticalSectionEnterTimeoutMs;
    public final long eventCleanUpAge;
    public final int loadBatchSize;
    public final int maxBlobByteSizePerRow;
    public final long maxStorageSizeInBytes;

    public AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.maxStorageSizeInBytes = j;
        this.loadBatchSize = i;
        this.criticalSectionEnterTimeoutMs = i2;
        this.eventCleanUpAge = j2;
        this.maxBlobByteSizePerRow = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_EventStoreConfig) {
            AutoValue_EventStoreConfig autoValue_EventStoreConfig = (AutoValue_EventStoreConfig) obj;
            if (this.maxStorageSizeInBytes == autoValue_EventStoreConfig.maxStorageSizeInBytes && this.loadBatchSize == autoValue_EventStoreConfig.loadBatchSize && this.criticalSectionEnterTimeoutMs == autoValue_EventStoreConfig.criticalSectionEnterTimeoutMs && this.eventCleanUpAge == autoValue_EventStoreConfig.eventCleanUpAge && this.maxBlobByteSizePerRow == autoValue_EventStoreConfig.maxBlobByteSizePerRow) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.maxStorageSizeInBytes;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long j2 = this.eventCleanUpAge;
        return this.maxBlobByteSizePerRow ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.maxStorageSizeInBytes);
        sb.append(", loadBatchSize=");
        sb.append(this.loadBatchSize);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.criticalSectionEnterTimeoutMs);
        sb.append(", eventCleanUpAge=");
        sb.append(this.eventCleanUpAge);
        sb.append(", maxBlobByteSizePerRow=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxBlobByteSizePerRow, "}", sb);
    }
}
