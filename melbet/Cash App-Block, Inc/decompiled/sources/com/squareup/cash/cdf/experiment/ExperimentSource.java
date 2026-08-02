package com.squareup.cash.cdf.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
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
