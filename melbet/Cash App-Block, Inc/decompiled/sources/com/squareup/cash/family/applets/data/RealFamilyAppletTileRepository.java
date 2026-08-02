package com.squareup.cash.family.applets.data;

import app.cash.local.views.LocalViewFactory;
import app.cash.mooncake.values.MooncakeColors;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.appupdate.navigation.real.RealAppUpdateInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphPresenter$Factory$Impl;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.applets.backend.real.RealFamilyAppletConfigProvider;
import com.squareup.cash.family.applets.data.FormattedTimestamp;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter$Factory$Impl;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.wire.MoshiJsonIntegration;
import com.stripe.hcaptcha.HCaptcha;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes6.dex */
public final class RealFamilyAppletTileRepository {
    public final FamilySharedActivityCache$Factory$Impl activitiesCacheFactory;
    public final ActivitiesManager.Factory activitiesManagerFactory;
    public final String appletSubtitle;
    public final String appletTitle;
    public final ReadonlyStateFlow availabilityState;
    public final RealCustomerStore customerStore;
    public final ReadonlyStateFlow dependentAvatars;
    public final ReadonlyStateFlow familyAppletConfig;
    public final ReadonlyStateFlow familyAppletTileViewModel;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final ReadonlyStateFlow formattedTimestamp;
    public final CoroutineScope scope;
    public final AndroidStringManager stringManager;
    public final AssetPublicSuffixList timestampFormatter;
    public static final LinkedHashMap formattedTimestampCache = new LinkedHashMap();
    public static final StackedAvatarViewModel.Avatar LOADING_AVATAR = new StackedAvatarViewModel.Avatar(MoshiJsonIntegration.toModel$default(MooncakeColors.secondaryButtonBackground), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068);

    public RealFamilyAppletTileRepository(RealCustomerStore realCustomerStore, ActivitiesManager.Factory factory, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealFamilyAppletConfigProvider realFamilyAppletConfigProvider, AndroidStringManager androidStringManager, CoroutineScope coroutineScope, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl, FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl) {
        this.customerStore = realCustomerStore;
        this.activitiesManagerFactory = factory;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.stringManager = androidStringManager;
        this.scope = coroutineScope;
        this.activitiesCacheFactory = familySharedActivityCache$Factory$Impl;
        String str = androidStringManager.get(R.string.family_applet_fallback_title);
        this.appletTitle = str;
        this.appletSubtitle = androidStringManager.get(R.string.family_applet_subtitle);
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.timestampFormatter = realTimestampFormatter$Factory$Impl.create$1(locale, TimestampFormatter$DisplayContext.IN_PHRASE);
        Continuation continuation = null;
        ReadonlyStateFlow stateIn = FlowKt.stateIn(realFamilyAppletConfigProvider.getFamilyAppletConfig(), coroutineScope, SharingStarted.Companion.Eagerly, null);
        this.familyAppletConfig = stateIn;
        this.familyAppletTileViewModel = FlowKt.stateIn(FlowKt.transformLatest(stateIn, new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, this, 0)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), new FamilyAppletTileViewModel.Loading(str));
        this.availabilityState = FlowKt.stateIn(FlowKt.transformLatest(stateIn, new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, this, 1)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), AppletAvailabilityState.LOADING);
        this.formattedTimestamp = FlowKt.stateIn(FlowKt.transformLatest(stateIn, new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, this, 2)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), FormattedTimestamp.Loading.INSTANCE);
        this.dependentAvatars = FlowKt.stateIn(FlowKt.transformLatest(stateIn, new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, this, 3)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), EmptyList.INSTANCE);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 0;
        public final Provider activitiesCacheFactory;
        public final Provider activitiesManagerFactory;
        public final Provider customerStore;
        public final Provider familyAppletConfigProvider;
        public final Provider featureEligibilityRepository;
        public final InstanceFactory scope;
        public final Provider stringManager;
        public final InstanceFactory timestampFormatterFactory;

        public MetroFactory(RetroUiFactory.MetroFactory metroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LocalViewFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4) {
            this.customerStore = metroFactory;
            this.activitiesManagerFactory = instanceFactory;
            this.featureEligibilityRepository = doubleCheck;
            this.familyAppletConfigProvider = metroFactory2;
            this.stringManager = lambdaProvider;
            this.scope = instanceFactory2;
            this.timestampFormatterFactory = instanceFactory3;
            this.activitiesCacheFactory = instanceFactory4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.timestampFormatterFactory;
            Provider provider = this.activitiesCacheFactory;
            Provider provider2 = this.stringManager;
            Provider provider3 = this.familyAppletConfigProvider;
            Provider provider4 = this.featureEligibilityRepository;
            InstanceFactory instanceFactory2 = this.scope;
            Provider provider5 = this.activitiesManagerFactory;
            Provider provider6 = this.customerStore;
            switch (i) {
                case 0:
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider6.invoke();
                    ActivitiesManager.Factory factory = (ActivitiesManager.Factory) provider5.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider4.invoke();
                    RealFamilyAppletConfigProvider realFamilyAppletConfigProvider = (RealFamilyAppletConfigProvider) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory2.value;
                    RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl = (RealTimestampFormatter$Factory$Impl) instanceFactory.value;
                    FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl = (FamilySharedActivityCache$Factory$Impl) provider.invoke();
                    realCustomerStore.getClass();
                    factory.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realFamilyAppletConfigProvider.getClass();
                    androidStringManager.getClass();
                    coroutineScope.getClass();
                    realTimestampFormatter$Factory$Impl.getClass();
                    familySharedActivityCache$Factory$Impl.getClass();
                    return new RealFamilyAppletTileRepository(realCustomerStore, factory, realFeatureEligibilityRepository, realFamilyAppletConfigProvider, androidStringManager, coroutineScope, realTimestampFormatter$Factory$Impl, familySharedActivityCache$Factory$Impl);
                case 1:
                    RealInvestingCryptoGraphHeaderPresenter$Factory$Impl realInvestingCryptoGraphHeaderPresenter$Factory$Impl = (RealInvestingCryptoGraphHeaderPresenter$Factory$Impl) instanceFactory2.value;
                    RealProfileManager realProfileManager = (RealProfileManager) provider6.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider5.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider4.invoke();
                    RealBitcoinGraphPresenter$Factory$Impl realBitcoinGraphPresenter$Factory$Impl = (RealBitcoinGraphPresenter$Factory$Impl) instanceFactory.value;
                    RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) provider3.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider2.invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    realInvestingCryptoGraphHeaderPresenter$Factory$Impl.getClass();
                    realProfileManager.getClass();
                    realBitcoinProfileRepo.getClass();
                    realBitcoinFormatter.getClass();
                    realBitcoinGraphPresenter$Factory$Impl.getClass();
                    realBitcoinActivityProvider.getClass();
                    realJurisdictionConfigManager.getClass();
                    analytics.getClass();
                    return new HCaptcha(realInvestingCryptoGraphHeaderPresenter$Factory$Impl, realProfileManager, realBitcoinProfileRepo, realBitcoinFormatter, realBitcoinGraphPresenter$Factory$Impl, realBitcoinActivityProvider, realJurisdictionConfigManager, analytics);
                default:
                    Analytics analytics2 = (Analytics) provider6.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider5.invoke();
                    RealAppUpdateInboundNavigator$Factory$Impl realAppUpdateInboundNavigator$Factory$Impl = (RealAppUpdateInboundNavigator$Factory$Impl) instanceFactory2.value;
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider4.invoke();
                    RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    analytics2.getClass();
                    appConfigManager.getClass();
                    realAppUpdateInboundNavigator$Factory$Impl.getClass();
                    realClientRouteParser.getClass();
                    realDeepLinkParser.getClass();
                    featureFlagManager.getClass();
                    userJourneyTracker.getClass();
                    coroutineScope2.getClass();
                    return new RealSelectiveUnrecognizedURLNavigator(analytics2, appConfigManager, realAppUpdateInboundNavigator$Factory$Impl, realClientRouteParser, realDeepLinkParser, featureFlagManager, userJourneyTracker, coroutineScope2);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, InstanceFactory instanceFactory2) {
            this.customerStore = doubleCheck;
            this.activitiesManagerFactory = doubleCheck2;
            this.scope = instanceFactory;
            this.featureEligibilityRepository = doubleCheck3;
            this.familyAppletConfigProvider = doubleCheck4;
            this.stringManager = doubleCheck5;
            this.activitiesCacheFactory = lambdaProvider;
            this.timestampFormatterFactory = instanceFactory2;
        }

        public MetroFactory(InstanceFactory instanceFactory, DelegateFactory delegateFactory, TreehouseFlows.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, InstanceFactory instanceFactory2, RealAppLockState.MetroFactory metroFactory3, LocalViewFactory.MetroFactory metroFactory4, DoubleCheck doubleCheck) {
            this.scope = instanceFactory;
            this.customerStore = delegateFactory;
            this.activitiesManagerFactory = metroFactory;
            this.featureEligibilityRepository = metroFactory2;
            this.timestampFormatterFactory = instanceFactory2;
            this.familyAppletConfigProvider = metroFactory3;
            this.stringManager = metroFactory4;
            this.activitiesCacheFactory = doubleCheck;
        }
    }
}
