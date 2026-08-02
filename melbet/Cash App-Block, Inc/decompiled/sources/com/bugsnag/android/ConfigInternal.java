package com.bugsnag.android;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class ConfigInternal {
    public final String apiKey;
    public DeliveryParams delivery;
    public final EmptySet discardClasses;
    public final Notifier notifier;
    public final HashSet plugins;
    public Set projectPackages;
    public String releaseStage;
    public final EnumSet telemetry;
    public final User user = new User(null, null, null);
    public final CallbackState callbackState = new CallbackState();
    public final MetadataState metadataState = new MetadataState(new Metadata(0));
    public final FeatureFlagState featureFlagState = new FeatureFlagState(new FeatureFlags());
    public Integer versionCode = 0;
    public final ThreadSendPolicy sendThreads = ThreadSendPolicy.ALWAYS;
    public final boolean persistUser = true;
    public final boolean generateAnonymousId = true;
    public final long launchDurationMillis = 5000;
    public final boolean autoTrackSessions = true;
    public final boolean sendLaunchCrashesSynchronously = true;
    public final ErrorTypes enabledErrorTypes = new ErrorTypes(true, true, true, true);
    public final boolean autoDetectErrors = true;
    public final String appType = "android";
    public Logger logger = NoopLogger.INSTANCE$1;
    public final int maxBreadcrumbs = 100;
    public final int maxPersistedEvents = 32;
    public final int maxPersistedSessions = 128;
    public final int maxReportedThreads = 200;
    public final long threadCollectionTimeLimitMillis = 5000;
    public final int maxStringValueLength = 10000;

    public ConfigInternal(String str) {
        this.apiKey = str;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.discardClasses = emptySet;
        this.telemetry = EnumSet.of(Telemetry.INTERNAL_ERRORS, Telemetry.USAGE);
        this.projectPackages = emptySet;
        this.notifier = new Notifier("Android Bugsnag Notifier", "6.26.0", "https://bugsnag.com");
        this.plugins = new HashSet();
    }
}
