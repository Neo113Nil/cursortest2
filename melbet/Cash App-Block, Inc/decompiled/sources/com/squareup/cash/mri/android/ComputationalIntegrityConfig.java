package com.squareup.cash.mri.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ComputationalIntegrityConfig {
    public final int memoryCostKb;
    public final long timeoutMs;

    public ComputationalIntegrityConfig(int i, long j) {
        this.memoryCostKb = i;
        this.timeoutMs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputationalIntegrityConfig)) {
            return false;
        }
        ComputationalIntegrityConfig computationalIntegrityConfig = (ComputationalIntegrityConfig) obj;
        return this.memoryCostKb == computationalIntegrityConfig.memoryCostKb && this.timeoutMs == computationalIntegrityConfig.timeoutMs;
    }

    public final int getMemoryCostKb() {
        return this.memoryCostKb;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeoutMs) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(32, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(2, Integer.hashCode(this.memoryCostKb) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ComputationalIntegrityConfig(memoryCostKb=" + this.memoryCostKb + ", timeCost=2, parallelism=2, hashLength=32, timeoutMs=" + this.timeoutMs + ")";
    }
}
