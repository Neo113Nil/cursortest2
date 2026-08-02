package com.squareup.cash;

import app.cash.cdp.integration.CashCdpConfigProvider;
import coil3.ComponentRegistry;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.deviceintegrity.RealPlayIntegrityClient;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.integration.analytics.AppAnalyticsQueue;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.mri.android.RealSignalsCollector;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.api.ObservabilityExecutionContext;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidPackageManager;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final /* synthetic */ class VariantSandboxedComponent$Impl$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VariantSandboxedComponent.Impl f$0;

    public /* synthetic */ VariantSandboxedComponent$Impl$$ExternalSyntheticLambda3(VariantSandboxedComponent.Impl impl, int i) {
        this.$r8$classId = i;
        this.f$0 = impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        VariantSandboxedComponent.Impl impl = this.f$0;
        switch (i) {
            case 0:
                return new AndroidPackageManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 1:
                return new AndroidAccessibilityManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 2:
                VariantAppComponent.Impl impl2 = (VariantAppComponent.Impl) impl.variantAppComponentInstance$1;
                RealLocaleManager realLocaleManager = (RealLocaleManager) impl2.realLocaleManagerProvider.getValue();
                impl2.androidClockProvider.getClass();
                return new AndroidDateFormatManager(realLocaleManager, new AndroidClock(0));
            case 3:
                return new AndroidNotificationManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 4:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideVersionNameProvider.getClass();
                return "5.58.0";
            case 5:
                return (Mutex) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideFillrSingletonLockProvider.getValue();
            case 6:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideIsLanguageDisclosureAcceptancePendingKeyValueProvider.getValue();
            case 7:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideHasSeenQrShortcutsOnboardingProvider.getValue();
            case 8:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideQrShortcutsOnboardingAppStartsProvider.getValue();
            case 9:
                return (RealOnboardingFlowTokenManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realOnboardingFlowTokenManagerProvider.invoke();
            case 10:
                return ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).refWatcherInstance;
            case 11:
                return (CashCdpConfigProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).cashCdpConfigProvider.getValue();
            case 12:
                return (AppForegroundStateProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realAppForegroundStateProvider.getValue();
            case 13:
                return new AndroidLocationProvider(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 14:
                return (PermissionChecker) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidPermissionCheckerProvider.getValue();
            case 15:
                return (String) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideEnvironmentProvider.getValue();
            case 16:
                return new RealPlayIntegrityClient(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 17:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideFlavorProvider.getClass();
                return "production";
            case 18:
                return (StorageLinker) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideStorageLinkerProvider.getValue();
            case 19:
                return (String) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideSimInfoProvider.getValue();
            case 20:
                return (SessionManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).doubleWriteSessionManagerProvider.getValue();
            case 21:
                return (ErrorReporter) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realErrorReporterProvider.invoke();
            case 22:
                return ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).bugsnagClientInstance;
            case 23:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidClockProvider.getClass();
                return new AndroidClock(0);
            case 24:
                return (AppAnalyticsQueue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).appAnalyticsQueueProvider.getValue();
            case 25:
                return (Moshi) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideMoshiProvider.getValue();
            case 26:
                return (ObservabilityExecutionContext) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideObservabilityExecutionContextProvider.getValue();
            case 27:
                return (ComponentRegistry) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideComponentRegistryProvider.getValue();
            case 28:
                return (String) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideBaseEndpointProvider.getValue();
            default:
                return (RealSignalsCollector) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realSignalsCollectorProvider.getValue();
        }
    }
}
