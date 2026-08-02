package com.squareup.cash.clientsync.flags;

import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncEnhancedLogging;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.backend.api.ObservabilityExecutionContext;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealClientSyncFlags {
    public final Lazy _syncEntityDatabaseMigrationPhase$delegate;
    public final Lazy _syncRangeDatabaseMigrationPhase$delegate;
    public final RealClientSyncErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final ObservabilityExecutionContext observabilityExecutionContext;

    public RealClientSyncFlags(RealClientSyncErrorReporter realClientSyncErrorReporter, FeatureFlagManager featureFlagManager, ObservabilityExecutionContext observabilityExecutionContext) {
        this.errorReporter = realClientSyncErrorReporter;
        this.featureFlagManager = featureFlagManager;
        this.observabilityExecutionContext = observabilityExecutionContext;
        final int i = 0;
        this._syncRangeDatabaseMigrationPhase$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.clientsync.flags.RealClientSyncFlags$$ExternalSyntheticLambda0
            public final /* synthetic */ RealClientSyncFlags f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RealClientSyncFlags realClientSyncFlags = this.f$0;
                switch (i2) {
                    case 0:
                        FeatureFlagManager featureFlagManager2 = realClientSyncFlags.featureFlagManager;
                        realClientSyncFlags.awaitLoadedWithErrorReporting(featureFlagManager2);
                        String str = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges.INSTANCE)).value;
                        switch (str.hashCode()) {
                            case -1620853889:
                                if (str.equals("MULTIPLATFORM_ONLY")) {
                                    return DatabaseMigrationPhase.MultiplatformOnly;
                                }
                                break;
                            case -698142702:
                                if (str.equals("MULTIPLATFORM_SHADOWED")) {
                                    return DatabaseMigrationPhase.MultiplatformShadowed;
                                }
                                break;
                            case -361463084:
                                if (str.equals("NATIVE_ONLY")) {
                                    return DatabaseMigrationPhase.NativeOnly;
                                }
                                break;
                            case 308692199:
                                if (str.equals("NATIVE_SHADOWED")) {
                                    return DatabaseMigrationPhase.NativeShadowed;
                                }
                                break;
                        }
                        return DatabaseMigrationPhase.NativeOnly;
                    default:
                        FeatureFlagManager featureFlagManager3 = realClientSyncFlags.featureFlagManager;
                        realClientSyncFlags.awaitLoadedWithErrorReporting(featureFlagManager3);
                        String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager3).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration.INSTANCE)).value;
                        switch (str2.hashCode()) {
                            case -1999289321:
                                if (str2.equals("NATIVE")) {
                                    return DatabaseMigrationPhase.NativeOnly;
                                }
                                break;
                            case -1924526964:
                                if (str2.equals("MULTIPLATFORM")) {
                                    return DatabaseMigrationPhase.MultiplatformOnly;
                                }
                                break;
                            case -1493282196:
                                if (str2.equals("MULTIPLATFORM_MIGRATED")) {
                                    return DatabaseMigrationPhase.MultiplatformShadowed;
                                }
                                break;
                            case -698142702:
                                if (str2.equals("MULTIPLATFORM_SHADOWED")) {
                                    return DatabaseMigrationPhase.NativeShadowed;
                                }
                                break;
                        }
                        return DatabaseMigrationPhase.NativeOnly;
                }
            }
        });
        final int i2 = 1;
        this._syncEntityDatabaseMigrationPhase$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.clientsync.flags.RealClientSyncFlags$$ExternalSyntheticLambda0
            public final /* synthetic */ RealClientSyncFlags f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RealClientSyncFlags realClientSyncFlags = this.f$0;
                switch (i22) {
                    case 0:
                        FeatureFlagManager featureFlagManager2 = realClientSyncFlags.featureFlagManager;
                        realClientSyncFlags.awaitLoadedWithErrorReporting(featureFlagManager2);
                        String str = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges.INSTANCE)).value;
                        switch (str.hashCode()) {
                            case -1620853889:
                                if (str.equals("MULTIPLATFORM_ONLY")) {
                                    return DatabaseMigrationPhase.MultiplatformOnly;
                                }
                                break;
                            case -698142702:
                                if (str.equals("MULTIPLATFORM_SHADOWED")) {
                                    return DatabaseMigrationPhase.MultiplatformShadowed;
                                }
                                break;
                            case -361463084:
                                if (str.equals("NATIVE_ONLY")) {
                                    return DatabaseMigrationPhase.NativeOnly;
                                }
                                break;
                            case 308692199:
                                if (str.equals("NATIVE_SHADOWED")) {
                                    return DatabaseMigrationPhase.NativeShadowed;
                                }
                                break;
                        }
                        return DatabaseMigrationPhase.NativeOnly;
                    default:
                        FeatureFlagManager featureFlagManager3 = realClientSyncFlags.featureFlagManager;
                        realClientSyncFlags.awaitLoadedWithErrorReporting(featureFlagManager3);
                        String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager3).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration.INSTANCE)).value;
                        switch (str2.hashCode()) {
                            case -1999289321:
                                if (str2.equals("NATIVE")) {
                                    return DatabaseMigrationPhase.NativeOnly;
                                }
                                break;
                            case -1924526964:
                                if (str2.equals("MULTIPLATFORM")) {
                                    return DatabaseMigrationPhase.MultiplatformOnly;
                                }
                                break;
                            case -1493282196:
                                if (str2.equals("MULTIPLATFORM_MIGRATED")) {
                                    return DatabaseMigrationPhase.MultiplatformShadowed;
                                }
                                break;
                            case -698142702:
                                if (str2.equals("MULTIPLATFORM_SHADOWED")) {
                                    return DatabaseMigrationPhase.NativeShadowed;
                                }
                                break;
                        }
                        return DatabaseMigrationPhase.NativeOnly;
                }
            }
        });
    }

    public final void awaitLoadedWithErrorReporting(FeatureFlagManager featureFlagManager) {
        if (((RealFeatureFlagManager) featureFlagManager).featureFlagsQueried.isCompleted()) {
            return;
        }
        try {
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new CashApp$onCreate$4$1$1(featureFlagManager, null, 16));
        } catch (Throwable th) {
            this.errorReporter.reportNonFatal(new DatabaseMigrationException(th));
        }
    }

    public final boolean isVerboseLoggingEnabled() {
        if (this.observabilityExecutionContext != ObservabilityExecutionContext.UI_TEST) {
            return ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncEnhancedLogging.INSTANCE)).enabled();
        }
        return true;
    }
}
