package com.squareup.cash.fillr.real;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import com.fillr.featuretoggle.strategy.StrategyUtils;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.Result;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.pipeline.ReceiptSyncEntityObserver;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datefilterbar.backend.real.RealDateFilterGenerator;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.directdeposit.backend.real.RealDdaManager;
import com.squareup.cash.e2ee.signature.service.RealSigningCertificateService;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.family.familyhub.backend.real.RealDependentPortfolioStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fileupload.real.AndroidFileTypeDescriber;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.tabprovider.real.EmptyTabProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.preferences.SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SafeFlow;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class FillrInitializer implements IoActivitySetupTeardown {
    public final RealFillrWebManager fillrManager;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider fillrManager;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.fillrManager = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 4;
            int i3 = 5;
            int i4 = 1;
            Provider provider = this.fillrManager;
            switch (i) {
                case 0:
                    RealFillrWebManager realFillrWebManager = (RealFillrWebManager) provider.invoke();
                    realFillrWebManager.getClass();
                    return new FillrInitializer(realFillrWebManager);
                case 1:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new RealContactSyncDetailsRepository(cashAccountDatabaseImpl);
                case 2:
                    RealAppConfigManager realAppConfigManager = (RealAppConfigManager) provider.invoke();
                    realAppConfigManager.getClass();
                    return realAppConfigManager;
                case 3:
                    ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) provider.invoke();
                    ziplineHistoryDataJavaScripter.getClass();
                    return new SafeFlow(new RealBoostSelector.AnonymousClass1(ziplineHistoryDataJavaScripter, (Continuation) null, i3));
                case 4:
                    RealIdentityVerificationBadger realIdentityVerificationBadger = (RealIdentityVerificationBadger) provider.invoke();
                    realIdentityVerificationBadger.getClass();
                    return new FinishSetupTileBadgeCounter(13, realIdentityVerificationBadger.identityVerificationRepo.status(), realIdentityVerificationBadger);
                case 5:
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    realProfileManager.getClass();
                    return realProfileManager;
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    return new ReceiptSyncEntityObserver(cashAccountDatabaseImpl2, 1);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    return new ReceiptSyncEntityObserver(cashAccountDatabaseImpl3, 2);
                case 8:
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    androidClock.getClass();
                    return new RealDateFilterGenerator(androidClock);
                case 9:
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider.invoke();
                    realLocaleManager.getClass();
                    return new RealDateTimeFormatterFactory(realLocaleManager);
                case 10:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return StrategyUtils.providePysicalDepositViewedPreference(sharedPreferences);
                case 11:
                    RealDdaManager realDdaManager = (RealDdaManager) provider.invoke();
                    realDdaManager.getClass();
                    return new EmptyTabProvider(realDdaManager, i4);
                case 12:
                    Retrofit retrofit = (Retrofit) provider.invoke();
                    retrofit.getClass();
                    return new RealSigningCertificateService(retrofit);
                case 13:
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    realObservabilityManager.getClass();
                    return new RealTrifleLogger(realObservabilityManager);
                case 14:
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    syncValueReader.getClass();
                    return new RealEarningsSyncStateRepository(syncValueReader);
                case 15:
                    EarningsHomeAnalytics earningsHomeAnalytics = (EarningsHomeAnalytics) provider.invoke();
                    earningsHomeAnalytics.getClass();
                    return new zzb(earningsHomeAnalytics);
                case 16:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new EarningsHomeAnalytics(analytics);
                case 17:
                    Analytics analytics2 = (Analytics) provider.invoke();
                    analytics2.getClass();
                    return new RealEarningsTrackerAnalytics(analytics2);
                case 18:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    return new Result(cashAccountDatabaseImpl4);
                case 19:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    String str = "last-eligibility-policy-change-timestamp";
                    return new SharedPreferencesKeyValue(sharedPreferences2, "last-eligibility-policy-change-timestamp", new SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0(sharedPreferences2, str, i4), new CdpModule$Companion$$ExternalSyntheticLambda1(str, i2), true);
                case 20:
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider.invoke();
                    realFamilyProfileManager.getClass();
                    return new zzb(realFamilyProfileManager);
                case 21:
                    RealTargetEntityManager realTargetEntityManager = (RealTargetEntityManager) provider.invoke();
                    realTargetEntityManager.getClass();
                    return new RealDependentPortfolioStore(realTargetEntityManager);
                case 22:
                    RealTargetEntityManager realTargetEntityManager2 = (RealTargetEntityManager) provider.invoke();
                    realTargetEntityManager2.getClass();
                    return new RealDependentRecurringPreferenceStore(realTargetEntityManager2);
                case 23:
                    AegisService aegisService = (AegisService) provider.invoke();
                    aegisService.getClass();
                    return new JCAContext(aegisService, 21);
                case 24:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new ScoreUiFactory(realImageLoader, 3);
                case 25:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new ScoreUiFactory(realImageLoader2, i2);
                case 26:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                    realImageLoader3.getClass();
                    return new ScoreUiFactory(realImageLoader3, i3);
                case 27:
                    RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) provider.invoke();
                    realFilamentSupportProvider.getClass();
                    return realFilamentSupportProvider;
                case 28:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    androidStringManager.getClass();
                    return new AndroidFileTypeDescriber(androidStringManager);
                default:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new RealAndroidFileParser(context);
            }
        }
    }

    public FillrInitializer(RealFillrWebManager realFillrWebManager) {
        this.fillrManager = realFillrWebManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 18));
    }
}
