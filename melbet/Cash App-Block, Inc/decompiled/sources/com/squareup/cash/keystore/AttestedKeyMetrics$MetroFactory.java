package com.squareup.cash.keystore;

import _COROUTINE.ArtificialStackFrames;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.CashAccountDatabaseCallback;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.service.real.RealNewsroomStoryService;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.backend.SingleUseInMemoryTreeElementsDataSource;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.google.pay.GooglePayServiceContextWrapper;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.history.backend.real.LoyaltyAccountSyncEntityStorageObserver;
import com.squareup.cash.incentives.finishsetup.applets.presenters.RealFinishSetupAppletTileRepository;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.instruments.presenters.TransferOptionPickerResolver;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.AppAnalyticsQueue;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.presenters.StockMetricFactory;
import com.squareup.cash.limits.backend.real.RealLimitsPageletStore;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.security.service.SecurityService;
import com.squareup.cash.security.service.SecurityServiceContextWrapper;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.android.broadway.TreehouseViewFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.LongPreference;
import com.squareup.preferences.MoshiPreference;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.uicore.elements.H6TextKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;
import retrofit2.OkHttpCall;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class AttestedKeyMetrics$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider errorReporter;
    public final Provider observabilityManager;

    public /* synthetic */ AttestedKeyMetrics$MetroFactory(Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.observabilityManager = provider;
        this.errorReporter = provider2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        Provider provider = this.errorReporter;
        Provider provider2 = this.observabilityManager;
        switch (i) {
            case 0:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider2.invoke();
                ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                realObservabilityManager.getClass();
                errorReporter.getClass();
                return new OkHttpCall.AnonymousClass1(i4, realObservabilityManager, errorReporter);
            case 1:
                Retrofit retrofit = (Retrofit) provider2.invoke();
                Moshi moshi = (Moshi) provider.invoke();
                retrofit.getClass();
                moshi.getClass();
                return new RealNewsroomStoryService(retrofit, moshi);
            case 2:
                RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) provider2.invoke();
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider.invoke();
                realSettingsEligibilityManager.getClass();
                realFeatureEligibilityRepository.getClass();
                return new OkHttpCall.AnonymousClass1(i2, realSettingsEligibilityManager, realFeatureEligibilityRepository);
            case 3:
                Analytics analytics = (Analytics) provider2.invoke();
                RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider.invoke();
                analytics.getClass();
                realDependentCustomerTokenRepository.getClass();
                return new RealDependentBalanceDetailLoggingManager(analytics, realDependentCustomerTokenRepository);
            case 4:
                FormBlockerView$Factory$Impl formBlockerView$Factory$Impl = (FormBlockerView$Factory$Impl) provider2.invoke();
                RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                formBlockerView$Factory$Impl.getClass();
                realImageLoader.getClass();
                return new TreehouseViewFactory(i2, formBlockerView$Factory$Impl, realImageLoader);
            case 5:
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                cashAccountDatabaseImpl.getClass();
                coroutineContext.getClass();
                return new RealLoginFeatureFlagsHandler(cashAccountDatabaseImpl, coroutineContext);
            case 6:
                Context context = (Context) provider2.invoke();
                boolean booleanValue = ((Boolean) provider.invoke()).booleanValue();
                context.getClass();
                return H6TextKt.provideFidesmoAnimationDebugOverrides(context, booleanValue);
            case 7:
                CashFaceClientService cashFaceClientService = (CashFaceClientService) provider2.invoke();
                SingleUseInMemoryTreeElementsDataSource singleUseInMemoryTreeElementsDataSource = (SingleUseInMemoryTreeElementsDataSource) provider.invoke();
                cashFaceClientService.getClass();
                singleUseInMemoryTreeElementsDataSource.getClass();
                return new RealGenericTreeElementsRepo(cashFaceClientService, singleUseInMemoryTreeElementsDataSource);
            case 8:
                RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                realImageLoader2.getClass();
                realCashVibrator.getClass();
                return new BorrowUiFactory(realImageLoader2, realCashVibrator, i3);
            case 9:
                ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                errorReporter2.getClass();
                cashAccountDatabaseImpl2.getClass();
                return new LoyaltyAccountSyncEntityStorageObserver(errorReporter2, cashAccountDatabaseImpl2);
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                SessionManager sessionManager = (SessionManager) provider.invoke();
                sharedPreferences.getClass();
                sessionManager.getClass();
                return new LongPreference(sharedPreferences, Recorder$$ExternalSyntheticOutline2.m("last-seen-identity-verification-version-", PlatformKt.activeAccountTokenOrNull(sessionManager)), Long.MIN_VALUE);
            case 11:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                featureFlagManager.getClass();
                syncValueReader.getClass();
                return new RealFinishSetupAppletTileRepository(syncValueReader, featureFlagManager);
            case 12:
                SharedPreferences sharedPreferences2 = (SharedPreferences) provider2.invoke();
                Moshi moshi2 = (Moshi) provider.invoke();
                sharedPreferences2.getClass();
                moshi2.getClass();
                MoshiPreference.SyntaxExceptionBehavior[] syntaxExceptionBehaviorArr = MoshiPreference.SyntaxExceptionBehavior.$VALUES;
                return new MoshiPreference(sharedPreferences2, moshi2);
            case 13:
                AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                androidStringManager.getClass();
                factory.getClass();
                return new RealInstrumentSelectorManager(factory, androidStringManager);
            case 14:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) provider2.invoke();
                LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                androidStringManager2.getClass();
                factory2.getClass();
                return new TransferOptionPickerResolver(factory2, androidStringManager2);
            case 15:
                AppAnalyticsQueue appAnalyticsQueue = (AppAnalyticsQueue) provider2.invoke();
                Analytics analytics2 = (Analytics) provider.invoke();
                appAnalyticsQueue.getClass();
                analytics2.getClass();
                return new CdpConfigUpdateSetupTeardown(i3, appAnalyticsQueue, analytics2);
            case 16:
                String str = (String) provider2.invoke();
                SessionManager sessionManager2 = (SessionManager) provider.invoke();
                str.getClass();
                sessionManager2.getClass();
                return StateFlowKt.mapState(sessionManager2.getSessionState(), new ImageKt$$ExternalSyntheticLambda0(str, 16));
            case 17:
                Retrofit retrofit3 = (Retrofit) provider2.invoke();
                RealServiceContextManager realServiceContextManager = (RealServiceContextManager) provider.invoke();
                retrofit3.getClass();
                realServiceContextManager.getClass();
                Object create = retrofit3.create(GooglePayService.class);
                create.getClass();
                return new GooglePayServiceContextWrapper((GooglePayService) create, realServiceContextManager);
            case 18:
                Retrofit retrofit4 = (Retrofit) provider2.invoke();
                RealServiceContextManager realServiceContextManager2 = (RealServiceContextManager) provider.invoke();
                retrofit4.getClass();
                realServiceContextManager2.getClass();
                Object create2 = retrofit4.create(SecurityService.class);
                create2.getClass();
                return new SecurityServiceContextWrapper((SecurityService) create2, realServiceContextManager2);
            case 19:
                Context context2 = (Context) provider2.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                context2.getClass();
                featureFlagManager2.getClass();
                return new PlacesAddressSearcher(context2, new RealBrazeManager$$ExternalSyntheticLambda0(featureFlagManager2, 21));
            case 20:
                Context context3 = (Context) provider2.invoke();
                FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                context3.getClass();
                featureFlagManager3.getClass();
                return ArtificialStackFrames.create(context3, new RealGooglePayer$$ExternalSyntheticLambda0(featureFlagManager3, 11));
            case 21:
                Context context4 = (Context) provider2.invoke();
                CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                context4.getClass();
                coroutineContext2.getClass();
                return new RealContactBook(context4, coroutineContext2);
            case 22:
                Context context5 = (Context) provider2.invoke();
                ErrorReporter errorReporter3 = (ErrorReporter) provider.invoke();
                context5.getClass();
                errorReporter3.getClass();
                return new FrameworkSQLiteOpenHelper(context5, "cash_money.db", new CashAccountDatabaseCallback(context5, errorReporter3), false, false);
            case 23:
                AndroidClock androidClock = (AndroidClock) provider2.invoke();
                AndroidStringManager androidStringManager3 = (AndroidStringManager) provider.invoke();
                androidClock.getClass();
                androidStringManager3.getClass();
                return new Lazy(6, androidClock, androidStringManager3);
            case 24:
                CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider2.invoke();
                CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                cashAccountDatabaseImpl3.getClass();
                coroutineContext3.getClass();
                return new PersistentEntityPriceCache(cashAccountDatabaseImpl3, coroutineContext3);
            case 25:
                RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) provider2.invoke();
                RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) provider.invoke();
                realEntityPriceRefresher.getClass();
                realInvestmentEntities.getClass();
                return new RealDependentInvestmentEntities(realEntityPriceRefresher, realInvestmentEntities);
            case 26:
                RealImageLoader realImageLoader3 = (RealImageLoader) provider2.invoke();
                RealCashVibrator realCashVibrator2 = (RealCashVibrator) provider.invoke();
                realImageLoader3.getClass();
                realCashVibrator2.getClass();
                return new BorrowUiFactory(realImageLoader3, realCashVibrator2, i4);
            case 27:
                AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                androidClock2.getClass();
                factory3.getClass();
                return new StockMetricFactory(androidClock2, factory3);
            case 28:
                RealLimitsPageletStore realLimitsPageletStore = (RealLimitsPageletStore) provider2.invoke();
                LongPreference longPreference = (LongPreference) provider.invoke();
                realLimitsPageletStore.getClass();
                longPreference.getClass();
                return new FinishSetupTileBadgeCounter(15, realLimitsPageletStore, longPreference);
            default:
                LimitsHubService limitsHubService = (LimitsHubService) provider2.invoke();
                CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                limitsHubService.getClass();
                coroutineContext4.getClass();
                return new RealLimitsPageletStore(limitsHubService, coroutineContext4);
        }
    }
}
