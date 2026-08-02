package com.squareup.cash.music.views;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.Room;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzado;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.navigation.CashTabProviderNavigatorHelper;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyProvider;
import com.squareup.cash.observability.backend.real.InMemoryReportedErrorCache;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.observability.backend.real.RealDatadogService;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.sampling.OneErrorPerAppSessionStrategy;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.onboarding.check.checkers.AppLockSyncValueIntegrityCheck;
import com.squareup.cash.onboarding.check.checkers.TabIntegrityCheck;
import com.squareup.cash.overrides.DenylistScreenOverrideRule;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.storage.TempStorageCleaner;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cropview.Edge;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.preferences.StringPreference;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class MusicViewFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider imageLoader;

    public /* synthetic */ MusicViewFactory$MetroFactory(Provider provider, int i) {
        this.$r8$classId = i;
        this.imageLoader = provider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferencesKeyValue SerDeKeyValue$default;
        SharedPreferencesKeyValue SerDeKeyValue$default2;
        int i = this.$r8$classId;
        int i2 = 1;
        Provider provider = this.imageLoader;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                realImageLoader.getClass();
                return new ScoreUiFactory(realImageLoader, 10);
            case 1:
                Context context = (Context) provider.invoke();
                context.getClass();
                return zzado.provideExoPlayer$real(context);
            case 2:
                RealSupportNavigator realSupportNavigator = (RealSupportNavigator) provider.invoke();
                realSupportNavigator.getClass();
                return new zzb(realSupportNavigator);
            case 3:
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) provider.invoke();
                realMoneyNavigatorHelper.getClass();
                return new CashTabProviderNavigatorHelper(realMoneyNavigatorHelper);
            case 4:
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider.invoke();
                realFamilyProfileManager.getClass();
                return new ConnectionPool(realFamilyProfileManager);
            case 5:
                RealBleManager realBleManager = (RealBleManager) provider.invoke();
                realBleManager.getClass();
                return new Edge.Companion(realBleManager);
            case 6:
                RealContactRepository realContactRepository = (RealContactRepository) provider.invoke();
                realContactRepository.getClass();
                return new NotificationPhotoLookupKeyProvider(realContactRepository);
            case 7:
                SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                sharedPreferences.getClass();
                return new StringPreference(sharedPreferences, "temporary-crash-reporter-user-identifier");
            case 8:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                realObservabilityManager.getClass();
                return new RealDatadogService(realObservabilityManager);
            case 9:
                RealDatadogClient realDatadogClient = (RealDatadogClient) provider.invoke();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                AndroidClock androidClock = new AndroidClock(0);
                realDatadogClient.getClass();
                defaultIoScheduler.getClass();
                return new RealObservabilityManager(realDatadogClient, defaultIoScheduler, androidClock);
            case 10:
                InMemoryReportedErrorCache inMemoryReportedErrorCache = (InMemoryReportedErrorCache) provider.invoke();
                inMemoryReportedErrorCache.getClass();
                return new TempStorageCleaner(inMemoryReportedErrorCache, i2);
            case 11:
                InMemoryReportedErrorCache inMemoryReportedErrorCache2 = (InMemoryReportedErrorCache) provider.invoke();
                inMemoryReportedErrorCache2.getClass();
                return new OneErrorPerAppSessionStrategy(inMemoryReportedErrorCache2);
            case 12:
                RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) provider.invoke();
                realObservabilityManager2.getClass();
                return new RealOffersSpanManager(realObservabilityManager2);
            case 13:
                RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                realImageLoader2.getClass();
                return new ScoreUiFactory(realImageLoader2, 11);
            case 14:
                SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                sharedPreferences2.getClass();
                return new BooleanPreference(sharedPreferences2, "account-picker-session-expired", false);
            case 15:
                RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                realImageLoader3.getClass();
                return new ScoreUiFactory(realImageLoader3, 12);
            case 16:
                SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                sharedPreferences3.getClass();
                return Room.BooleanKeyValue(sharedPreferences3, "onboarding-integrity-checks-in-progress", false, true);
            case 17:
                SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                syncValueReader.getClass();
                return new AppLockSyncValueIntegrityCheck(syncValueReader);
            case 18:
                RealMarketCapabilitiesManager realMarketCapabilitiesManager = (RealMarketCapabilitiesManager) provider.invoke();
                realMarketCapabilitiesManager.getClass();
                return new TabIntegrityCheck(realMarketCapabilitiesManager);
            case 19:
                RealTabPublisher realTabPublisher = (RealTabPublisher) provider.invoke();
                realTabPublisher.getClass();
                return new TabIntegrityCheck(realTabPublisher);
            case 20:
                RealImageLoader realImageLoader4 = (RealImageLoader) provider.invoke();
                realImageLoader4.getClass();
                return new ScoreUiFactory(realImageLoader4, 13);
            case 21:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                featureFlagManager.getClass();
                return new DenylistScreenOverrideRule(featureFlagManager);
            case 22:
                RealImageLoader realImageLoader5 = (RealImageLoader) provider.invoke();
                realImageLoader5.getClass();
                return new ScoreUiFactory(realImageLoader5, 14);
            case 23:
                Analytics analytics = (Analytics) provider.invoke();
                analytics.getClass();
                return new RealPasskeyAnalytics(analytics);
            case 24:
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                featureFlagManager2.getClass();
                return new RealPasskeyFeatureManager(featureFlagManager2);
            case 25:
                RealImageLoader realImageLoader6 = (RealImageLoader) provider.invoke();
                realImageLoader6.getClass();
                return new ScoreUiFactory(realImageLoader6, 15);
            case 26:
                FlowStarter flowStarter = (FlowStarter) provider.invoke();
                flowStarter.getClass();
                return new ConnectionPool(flowStarter);
            case 27:
                SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                sharedPreferences4.getClass();
                SerDeKeyValue$default = Room.SerDeKeyValue$default(sharedPreferences4, "personalize_payment_animation_counter", new MainPaymentViewKt$$ExternalSyntheticLambda25(2), new MainPaymentViewKt$$ExternalSyntheticLambda25(3), new MainPaymentViewKt$$ExternalSyntheticLambda0(5), 96);
                return SerDeKeyValue$default;
            case 28:
                SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                sharedPreferences5.getClass();
                SerDeKeyValue$default2 = Room.SerDeKeyValue$default(sharedPreferences5, "show_personalize_payment_tooltip", new MainPaymentViewKt$$ExternalSyntheticLambda25(4), new MainPaymentViewKt$$ExternalSyntheticLambda25(5), new MainPaymentViewKt$$ExternalSyntheticLambda0(6), 96);
                return SerDeKeyValue$default2;
            default:
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                realFamilyAccountsManager.getClass();
                return new ToolbarTuckTargets(realFamilyAccountsManager);
        }
    }
}
