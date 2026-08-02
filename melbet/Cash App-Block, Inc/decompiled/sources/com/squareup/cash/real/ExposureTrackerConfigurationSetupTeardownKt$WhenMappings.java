package com.squareup.cash.real;

import com.squareup.protos.franklin.common.FeatureFlagSource;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ExposureTrackerConfigurationSetupTeardownKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FeatureFlagSource.values().length];
        try {
            iArr[FeatureFlagSource.LAUNCH_DARKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeatureFlagSource.LAUNCH_DARKLY_FLAGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeatureFlagSource.AMPLITUDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeatureFlagSource.FEATURE_FLAG_SOURCE_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
