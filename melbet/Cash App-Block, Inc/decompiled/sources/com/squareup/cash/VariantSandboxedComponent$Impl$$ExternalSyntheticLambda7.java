package com.squareup.cash;

import android.app.Application;
import android.content.SharedPreferences;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.integration.CashCdpConfigProvider;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.biometrics.AndroidBiometrics;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.backend.real.InMemoryReportedErrorCache;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.performance.MemoryInfo;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.FileProviderAuthority;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository;
import com.squareup.cash.util.clock.AndroidAccurateClock;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.RealBackupService;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final /* synthetic */ class VariantSandboxedComponent$Impl$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VariantSandboxedComponent.Impl f$0;

    public /* synthetic */ VariantSandboxedComponent$Impl$$ExternalSyntheticLambda7(VariantSandboxedComponent.Impl impl, int i) {
        this.$r8$classId = i;
        this.f$0 = impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        VariantSandboxedComponent.Impl impl = this.f$0;
        switch (i) {
            case 0:
                return (RealLanguageManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realLanguageManagerProvider.getValue();
            case 1:
                Application application = ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                return new AndroidBiometrics(application, MainDispatcherLoader.dispatcher);
            case 2:
                return ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).thisGraphInstance;
            case 3:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideUserJourneyNotifierProvider.getClass();
                return NoOpUserJourneyNotifier.INSTANCE;
            case 4:
                return (RealUserJourneyRepository) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realUserJourneyRepositoryProvider.getValue();
            case 5:
                return (RealBackupService) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realBackupServiceProvider.getValue();
            case 6:
                return new AndroidFileProvider(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance, new FileProviderAuthority("com.squareup.cash.fileprovider"));
            case 7:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).memoryInfoReaderProvider.getClass();
                return MemoryInfo.Reader;
            case 8:
                VariantAppComponent.Impl impl2 = (VariantAppComponent.Impl) impl.variantAppComponentInstance$1;
                Analytics analytics = (Analytics) impl2.appAnalyticsQueueProvider.getValue();
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) impl2.realObservabilityManagerProvider.getValue();
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                analytics.getClass();
                realObservabilityManager.getClass();
                defaultIoScheduler.getClass();
                return new RealScrollPerformanceTrackerFactory(analytics, realObservabilityManager, defaultIoScheduler);
            case 9:
                return ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).getProvideClearAppUserDataOnNextLaunch();
            case 10:
                return (CashCdpConfigProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).cashCdpConfigProvider.getValue();
            case 11:
                return (RealCashVibrator) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realCashVibratorProvider.getValue();
            case 12:
                return (AndroidAccurateClock) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidAccurateClockProvider.getValue();
            case 13:
                return (SharedPreferences) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideEncryptionPrefsProvider.getValue();
            case 14:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).providePromotedAppletTileCacheLocaleProvider.getValue();
            case 15:
                return (InMemoryReportedErrorCache) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).inMemoryReportedErrorCacheProvider.getValue();
            case 16:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideClientSyncLocaleProvider.getValue();
            case 17:
                return (RealLocaleManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realLocaleManagerProvider.getValue();
            case 18:
                return (RealObservabilityManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realObservabilityManagerProvider.getValue();
            case 19:
                return (AndroidDeviceInfoProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideDeviceInfoProvider.invoke();
            case 20:
                return (AndroidOperatingSystemInfoProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideOperatingSystemInfoProvider.invoke();
            case 21:
                return (AndroidSessionIdProvider) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideSessionIdProvider.getValue();
            case 22:
                return (CashAppDatabaseImpl) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideCashAppDatabaseProvider.getValue();
            case 23:
                ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideDebugProvider.getClass();
                return Boolean.FALSE;
            default:
                return (RealScreenshotManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realScreenshotManagerProvider.getValue();
        }
    }
}
