package com.squareup.cash.paymentpad.presenters;

import coil3.RealImageLoader;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LowDiskSpaceAlert;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class RealLowDiskSpaceAlertManager {
    public final long alertFrequency;
    public final double alertThresholdInMegaBytes;
    public final AndroidClock clock;
    public final boolean enabled;
    public final RealImageLoader imageLoader;
    public final CoroutineContext ioDispatcher;
    public final KeyValue lowDiskSpaceAlertShownTimestamp;
    public final double numBytesInMegaByte;
    public final double numMillisInHour;
    public final RealObservabilityManager observabilityManager;
    public final Storage storage;

    public RealLowDiskSpaceAlertManager(FeatureFlagManager featureFlagManager, AndroidClock androidClock, Storage storage, RealImageLoader realImageLoader, RealObservabilityManager realObservabilityManager, CoroutineContext coroutineContext, KeyValue keyValue) {
        this.clock = androidClock;
        this.storage = storage;
        this.imageLoader = realImageLoader;
        this.observabilityManager = realObservabilityManager;
        this.ioDispatcher = coroutineContext;
        this.lowDiskSpaceAlertShownTimestamp = keyValue;
        Duration.Companion companion = Duration.Companion;
        LaunchDarklyFeatureFlags$LowDiskSpaceAlert launchDarklyFeatureFlags$LowDiskSpaceAlert = LaunchDarklyFeatureFlags$LowDiskSpaceAlert.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        long j = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$LowDiskSpaceAlert)).value;
        DurationUnit durationUnit = DurationUnit.HOURS;
        this.enabled = Duration.m4176toLongimpl(DurationKt.toDuration(j, durationUnit), durationUnit) != 0;
        this.alertFrequency = Duration.m4176toLongimpl(DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.currentExperimentValue(launchDarklyFeatureFlags$LowDiskSpaceAlert, false)).value, durationUnit), durationUnit);
        this.alertThresholdInMegaBytes = 100.0d;
        this.numBytesInMegaByte = 1000000.0d;
        this.numMillisInHour = 3600000.0d;
    }
}
