package com.squareup.cash.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExperimentExposure {
    public final String experimentId;
    public final ExperimentSource featureFlagSource;
    public final String variationId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ExperimentSource {
        public static final /* synthetic */ ExperimentSource[] $VALUES;
        public static final ExperimentSource AMPLITUDE;
        public static final ExperimentSource LAUNCH_DARKLY;

        static {
            ExperimentSource experimentSource = new ExperimentSource("LAUNCH_DARKLY", 0);
            LAUNCH_DARKLY = experimentSource;
            ExperimentSource experimentSource2 = new ExperimentSource("AMPLITUDE", 1);
            AMPLITUDE = experimentSource2;
            $VALUES = new ExperimentSource[]{experimentSource, experimentSource2};
        }

        public static ExperimentSource valueOf(String str) {
            return (ExperimentSource) Enum.valueOf(ExperimentSource.class, str);
        }

        public static ExperimentSource[] values() {
            return (ExperimentSource[]) $VALUES.clone();
        }
    }

    public ExperimentExposure(String str, String str2, ExperimentSource experimentSource) {
        str2.getClass();
        this.experimentId = str;
        this.variationId = str2;
        this.featureFlagSource = experimentSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentExposure)) {
            return false;
        }
        ExperimentExposure experimentExposure = (ExperimentExposure) obj;
        return this.experimentId.equals(experimentExposure.experimentId) && Intrinsics.areEqual(this.variationId, experimentExposure.variationId) && this.featureFlagSource == experimentExposure.featureFlagSource;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.experimentId.hashCode() * 31, 31, this.variationId);
        ExperimentSource experimentSource = this.featureFlagSource;
        return m + (experimentSource == null ? 0 : experimentSource.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExperimentExposure(experimentId=", this.experimentId, ", variationId=", this.variationId, ", featureFlagSource=");
        m.append(this.featureFlagSource);
        m.append(")");
        return m.toString();
    }
}
