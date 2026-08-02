package com.squareup.cash.account.presenters.settings;

import android.content.SharedPreferences;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.badging.api.BadgingState;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.integration.CashCdpConfigProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.api.AppServiceContextWrapper;
import com.squareup.cash.api.AppServiceResponseInterceptorWrapper;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.education.stories.service.real.RealCashAppStoryService;
import com.squareup.cash.education.stories.service.real.RealNewsroomStoryService;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$FavoritesSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecuritySettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlsCache;
import com.squareup.cash.family.familyhub.backend.real.RealTagLockService;
import com.squareup.cash.family.familyhub.backend.real.SponseeWalletSnapshotFetcher;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$15$$inlined$map$1;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePasskeysEnabled;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinBasicsProxy;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.api.CashApiInterceptor;
import com.squareup.cash.integration.api.CashBackoffInterceptor;
import com.squareup.cash.integration.api.CommonApiModule;
import com.squareup.cash.integration.encryption.EncryptionModule$DeviceKeySource;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataSource;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesValidator;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersRepositoryService;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.real.CdpExposureTracker;
import com.squareup.cash.real.CompositeExposureTracker;
import com.squareup.cash.real.InMemoryExperimentExposureCache;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import com.squareup.protos.cash.disputron.core.DisputeService;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.taply.app.v1.TaplyAppService;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.OkHttpClient;
import okio.AsyncTimeout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class PasskeysSetting extends AccountSettingsCapability {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final Object passkeyFeatureManager;
    public final RealSettingsEligibilityManager settingsEligibilityManager;

    public /* synthetic */ PasskeysSetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, Object obj, RealSettingsEligibilityManager realSettingsEligibilityManager, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.passkeyFeatureManager = obj;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if ((kotlin.jvm.internal.Intrinsics.areEqual(r6, java.lang.Boolean.FALSE) ? com.squareup.cash.eligibility.backend.api.SettingVisibility.DISABLED : kotlin.jvm.internal.Intrinsics.areEqual(r6, java.lang.Boolean.TRUE) ? com.squareup.cash.eligibility.backend.api.SettingVisibility.VISIBLE : com.squareup.cash.eligibility.backend.api.SettingVisibility.HIDDEN) != com.squareup.cash.eligibility.backend.api.SettingVisibility.HIDDEN) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAdditionalIsAvailable(Continuation continuation) {
        PasskeysSetting$checkAdditionalIsAvailable$1 passkeysSetting$checkAdditionalIsAvailable$1;
        int i;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        FavoritesSetting$checkAdditionalIsAvailable$1 favoritesSetting$checkAdditionalIsAvailable$1;
        int i2;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult2;
        int i3 = this.$r8$classId;
        RealSettingsEligibilityManager realSettingsEligibilityManager = this.settingsEligibilityManager;
        boolean z = true;
        boolean z2 = false;
        switch (i3) {
            case 0:
                if (continuation instanceof PasskeysSetting$checkAdditionalIsAvailable$1) {
                    passkeysSetting$checkAdditionalIsAvailable$1 = (PasskeysSetting$checkAdditionalIsAvailable$1) continuation;
                    int i4 = passkeysSetting$checkAdditionalIsAvailable$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        passkeysSetting$checkAdditionalIsAvailable$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj = passkeysSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = passkeysSetting$checkAdditionalIsAvailable$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((RealPasskeyFeatureManager) this.passkeyFeatureManager).featureFlagManager).currentValue(AmplitudeExperiments$MobilePasskeysEnabled.INSTANCE)).enabled()) {
                                break;
                            } else {
                                passkeysSetting$checkAdditionalIsAvailable$1.label = 1;
                                obj = realSettingsEligibilityManager.settings(passkeysSetting$checkAdditionalIsAvailable$1);
                                if (obj == coroutineSingletons) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                z2 = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.security.isSubSettingEnabled(AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_PASSKEYS);
                            }
                        }
                        break;
                    }
                }
                passkeysSetting$checkAdditionalIsAvailable$1 = new PasskeysSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj2 = passkeysSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeysSetting$checkAdditionalIsAvailable$1.label;
                if (i != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
            default:
                if (continuation instanceof FavoritesSetting$checkAdditionalIsAvailable$1) {
                    favoritesSetting$checkAdditionalIsAvailable$1 = (FavoritesSetting$checkAdditionalIsAvailable$1) continuation;
                    int i5 = favoritesSetting$checkAdditionalIsAvailable$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        favoritesSetting$checkAdditionalIsAvailable$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = favoritesSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = favoritesSetting$checkAdditionalIsAvailable$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            favoritesSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj3 = realSettingsEligibilityManager.settings(favoritesSetting$checkAdditionalIsAvailable$1);
                            if (obj3 == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj3;
                        if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult2).cache.favorites.cache.get(AccountSettingType$FavoritesSettings.FavoritesSubSetting.MANAGE_FAVORITES);
                                Boolean bool = setting != null ? setting.editable : null;
                                break;
                            }
                        }
                        z = false;
                        break;
                    }
                }
                favoritesSetting$checkAdditionalIsAvailable$1 = new FavoritesSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj32 = favoritesSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = favoritesSetting$checkAdditionalIsAvailable$1.label;
                if (i2 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj32;
                if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
                z = false;
        }
        return null;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                badgingState.getClass();
                gapComposer.startReplaceGroup(1887693727);
                gapComposer.end(false);
                return AccountSettingsRow.Passkeys.INSTANCE;
            default:
                badgingState.getClass();
                gapComposer.startReplaceGroup(73765160);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new AddFavoritesPresenter$models$lambda$15$$inlined$map$1(((RealFavoritesManager) this.passkeyFeatureManager).getFavorites(), 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
                boolean changed = gapComposer.changed((List) collectAsState.getValue());
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = CollectionsKt.take((List) collectAsState.getValue(), 5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AccountSettingsRow.Favorites favorites = new AccountSettingsRow.Favorites(((List) collectAsState.getValue()).size(), (List) rememberedValue2);
                gapComposer.end(false);
                return favorites;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bitcoinCapabilityProvider;
        public final Provider passkeyFeatureManager;
        public final DoubleCheck settingsEligibilityManager;

        public MetroFactory(AndroidClock.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.$r8$classId = 13;
            this.bitcoinCapabilityProvider = metroFactory;
            this.settingsEligibilityManager = doubleCheck;
            this.passkeyFeatureManager = doubleCheck2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 0;
            Provider provider = this.passkeyFeatureManager;
            DoubleCheck doubleCheck = this.settingsEligibilityManager;
            Provider provider2 = this.bitcoinCapabilityProvider;
            switch (i) {
                case 0:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealPasskeyFeatureManager realPasskeyFeatureManager = (RealPasskeyFeatureManager) provider.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) doubleCheck.getValue();
                    realBitcoinCapabilityProvider.getClass();
                    realPasskeyFeatureManager.getClass();
                    realSettingsEligibilityManager.getClass();
                    return new PasskeysSetting(realBitcoinCapabilityProvider, realPasskeyFeatureManager, realSettingsEligibilityManager, i2);
                case 1:
                    CoroutineScope coroutineScope = (CoroutineScope) provider2.invoke();
                    CashCdpConfigProvider cashCdpConfigProvider = (CashCdpConfigProvider) provider.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) doubleCheck.getValue();
                    coroutineScope.getClass();
                    cashCdpConfigProvider.getClass();
                    appForegroundStateProvider.getClass();
                    return new AndroidSessionIdProvider(cashCdpConfigProvider, appForegroundStateProvider, coroutineScope);
                case 2:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealFavoritesManager realFavoritesManager = (RealFavoritesManager) provider.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) doubleCheck.getValue();
                    realBitcoinCapabilityProvider2.getClass();
                    realFavoritesManager.getClass();
                    realSettingsEligibilityManager2.getClass();
                    return new PasskeysSetting(realBitcoinCapabilityProvider2, realFavoritesManager, realSettingsEligibilityManager2, 1);
                case 3:
                    RealNewsroomStoryService realNewsroomStoryService = (RealNewsroomStoryService) doubleCheck.getValue();
                    RealCashAppStoryService realCashAppStoryService = (RealCashAppStoryService) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    realNewsroomStoryService.getClass();
                    realCashAppStoryService.getClass();
                    featureFlagManager.getClass();
                    return ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinBasicsProxy.INSTANCE)).enabled() ? realCashAppStoryService : realNewsroomStoryService;
                case 4:
                    JanusService janusService = (JanusService) doubleCheck.getValue();
                    AndroidClock androidClock = (AndroidClock) provider2.invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    janusService.getClass();
                    androidClock.getClass();
                    analytics.getClass();
                    return new RealSettingsEligibilityManager(janusService, androidClock, analytics);
                case 5:
                    TaplyAppService taplyAppService = (TaplyAppService) doubleCheck.getValue();
                    SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher = (SponseeWalletSnapshotFetcher) provider2.invoke();
                    RealDependentControlsCache realDependentControlsCache = (RealDependentControlsCache) provider.invoke();
                    taplyAppService.getClass();
                    sponseeWalletSnapshotFetcher.getClass();
                    realDependentControlsCache.getClass();
                    return new RealTagLockService(taplyAppService, sponseeWalletSnapshotFetcher, realDependentControlsCache);
                case 6:
                    CashApiInterceptor cashApiInterceptor = (CashApiInterceptor) provider2.invoke();
                    CashBackoffInterceptor cashBackoffInterceptor = (CashBackoffInterceptor) provider.invoke();
                    EventStore$$ExternalSyntheticLambda0 eventStore$$ExternalSyntheticLambda0 = new EventStore$$ExternalSyntheticLambda0(5);
                    OkHttpClient okHttpClient = (OkHttpClient) doubleCheck.getValue();
                    cashApiInterceptor.getClass();
                    cashBackoffInterceptor.getClass();
                    okHttpClient.getClass();
                    OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                    ArrayList arrayList = newBuilder.interceptors;
                    arrayList.add(cashApiInterceptor);
                    arrayList.add(cashBackoffInterceptor);
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, eventStore$$ExternalSyntheticLambda0);
                    return new OkHttpClient(newBuilder);
                case 7:
                    AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper = (AppServiceResponseInterceptorWrapper) doubleCheck.getValue();
                    RealServiceContextManager realServiceContextManager = (RealServiceContextManager) provider2.invoke();
                    RealActivityUpdatesNotifier realActivityUpdatesNotifier = (RealActivityUpdatesNotifier) provider.invoke();
                    appServiceResponseInterceptorWrapper.getClass();
                    realServiceContextManager.getClass();
                    realActivityUpdatesNotifier.getClass();
                    return new AppServiceContextWrapper(appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, realActivityUpdatesNotifier, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper, realServiceContextManager);
                case 8:
                    String str = (String) provider2.invoke();
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) doubleCheck.getValue();
                    forcedLazyKt$forcedLazy$1.getClass();
                    sharedPreferences.getClass();
                    String str2 = str == null ? (String) forcedLazyKt$forcedLazy$1.$$delegate_0.getValue() : str;
                    EncryptionModule$DeviceKeySource encryptionModule$DeviceKeySource = str != null ? EncryptionModule$DeviceKeySource.MEDIA_DRM : EncryptionModule$DeviceKeySource.DEVICE_ID;
                    if (sharedPreferences.getString("device_key", null) == null) {
                        Timber.Forest.i("Engine encryption being created with " + encryptionModule$DeviceKeySource, new Object[0]);
                        sharedPreferences.edit().putString("en_decision", encryptionModule$DeviceKeySource.toString()).apply();
                    } else {
                        String string2 = sharedPreferences.getString("en_decision", "unknown");
                        Timber.Forest.i("Engine created with " + string2 + ", being opened with " + encryptionModule$DeviceKeySource, new Object[0]);
                    }
                    sharedPreferences.edit().putString("de_decision", encryptionModule$DeviceKeySource.toString()).apply();
                    return new EllipticCurveEncryptionEngine(sharedPreferences, str2);
                case 9:
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    RealMarketCapabilitiesDataSource realMarketCapabilitiesDataSource = (RealMarketCapabilitiesDataSource) provider.invoke();
                    RealMarketCapabilitiesValidator realMarketCapabilitiesValidator = (RealMarketCapabilitiesValidator) doubleCheck.getValue();
                    coroutineContext.getClass();
                    realMarketCapabilitiesDataSource.getClass();
                    realMarketCapabilitiesValidator.getClass();
                    return new RealMarketCapabilitiesDataManager(coroutineContext, realMarketCapabilitiesDataSource, realMarketCapabilitiesValidator);
                case 10:
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) doubleCheck.getValue();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    realOffersTabRepository.getClass();
                    realBoostRepository.getClass();
                    coroutineContext2.getClass();
                    return new RealOffersRepositoryService(realOffersTabRepository, realBoostRepository, coroutineContext2);
                case 11:
                    Analytics analytics2 = (Analytics) provider2.invoke();
                    BugsnagClient bugsnagClient = (BugsnagClient) provider.invoke();
                    InMemoryExperimentExposureCache inMemoryExperimentExposureCache = (InMemoryExperimentExposureCache) doubleCheck.getValue();
                    analytics2.getClass();
                    bugsnagClient.getClass();
                    inMemoryExperimentExposureCache.getClass();
                    return new CompositeExposureTracker(new CdpExposureTracker(analytics2, bugsnagClient), inMemoryExperimentExposureCache);
                case 12:
                    DisputeService disputeService = (DisputeService) doubleCheck.getValue();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    disputeService.getClass();
                    androidStringManager.getClass();
                    errorReporter.getClass();
                    return new RealDisputesTrackerService(disputeService, androidStringManager, errorReporter);
                default:
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    androidClock2.getClass();
                    provider.getClass();
                    return new RealUserJourneyTracker(androidClock2, doubleCheck, provider);
            }
        }

        public MetroFactory(CommonApiModule commonApiModule, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.$r8$classId = 6;
            this.bitcoinCapabilityProvider = doubleCheck;
            this.passkeyFeatureManager = doubleCheck2;
            this.settingsEligibilityManager = doubleCheck3;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.bitcoinCapabilityProvider = provider;
            this.passkeyFeatureManager = provider2;
            this.settingsEligibilityManager = doubleCheck;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.settingsEligibilityManager = doubleCheck;
            this.bitcoinCapabilityProvider = provider;
            this.passkeyFeatureManager = provider2;
        }

        public MetroFactory(AsyncTimeout.Companion companion, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.$r8$classId = 3;
            this.settingsEligibilityManager = doubleCheck;
            this.bitcoinCapabilityProvider = doubleCheck2;
            this.passkeyFeatureManager = doubleCheck3;
        }
    }
}
