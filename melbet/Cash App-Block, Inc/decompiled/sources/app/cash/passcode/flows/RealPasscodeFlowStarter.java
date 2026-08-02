package app.cash.passcode.flows;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.room.Room;
import app.cash.badging.backend.RealBadgingStateAccessibilityHelper;
import app.cash.broadway.screen.Screen;
import app.cash.cdp.api.CashCDP;
import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.backend.jvm.ActivityEventFlushStrategy;
import app.cash.cdp.backend.jvm.OneTimeFlushStrategy;
import app.cash.cdp.backend.jvm.TimeIntervalFlushStrategy;
import app.cash.local.backend.real.LocalInMemoryDatabase;
import app.cash.local.backend.real.RealLocalBrandProfileBannerDismissalTracker;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.service.LocalService;
import app.cash.molecule.PlatformKt;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import coil3.Extras;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.presenters.settings.LimitsSetting;
import com.squareup.cash.activity.backend.ActivityZiplineManifestWatcher;
import com.squareup.cash.activity.backend.RealActivityFeedProducer;
import com.squareup.cash.activity.backend.contacts.RealDeviceContactItemTransformer;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.PaymentHistoryAvatarFactory;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.appintro.views.AppIntroViewFactory;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.data.api.PayDataKt;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.workmanager.AndroidWorkManager;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealPasscodeFlowStarter {
    public final FlowStarter blockersNavigator;

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.ENABLE_APP_LOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.DISABLE_APP_LOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientScenario.UNLOCK_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealPasscodeFlowStarter(FlowStarter flowStarter) {
        this.blockersNavigator = flowStarter;
    }

    public final BlockersScreens.PasscodeScreen startLocalClientScenarioHackFlow(Screen screen, ClientScenario clientScenario, String str, Instrument instrument) {
        BlockersScreens.PasscodeScreen.Type type2;
        if (str == null) {
            str = "CUSTOMER_PASSCODE";
        }
        String str2 = str;
        BlockersData startProfileBlockersFlow$default = FlowStarter.startProfileBlockersFlow$default(this.blockersNavigator, clientScenario, screen, null, 12);
        int i = WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
        if (i == 1) {
            type2 = BlockersScreens.PasscodeScreen.Type.ENABLE_APP_LOCK;
        } else if (i == 2) {
            type2 = BlockersScreens.PasscodeScreen.Type.DISABLE_APP_LOCK;
        } else {
            if (i != 3) {
                Path$$ExternalSyntheticBUOutline0.m$1(clientScenario, "No local hack for client scenario ");
                return null;
            }
            type2 = BlockersScreens.PasscodeScreen.Type.UNLOCK_APP;
        }
        BlockersScreens.PasscodeScreen.Type type3 = type2;
        String str3 = null;
        InstrumentType cardBrand = instrument != null ? instrument.getCardBrand() : null;
        if (instrument != null) {
            str3 = instrument.getSuffix();
        }
        return new BlockersScreens.PasscodeScreen(startProfileBlockersFlow$default, cardBrand, str3, str2, null, type3, null, false, null, null);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider blockersNavigator;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.blockersNavigator = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            int i3 = 3;
            int i4 = 0;
            Provider provider = this.blockersNavigator;
            switch (i) {
                case 0:
                    FlowStarter flowStarter = (FlowStarter) provider.invoke();
                    flowStarter.getClass();
                    return new RealPasscodeFlowStarter(flowStarter);
                case 1:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    androidStringManager.getClass();
                    return new RealBadgingStateAccessibilityHelper(androidStringManager);
                case 2:
                    AndroidWorkManager androidWorkManager = (AndroidWorkManager) provider.invoke();
                    androidWorkManager.getClass();
                    return new Extras.Key(androidWorkManager);
                case 3:
                    CashCDP cashCDP = (CashCDP) provider.invoke();
                    cashCDP.getClass();
                    return cashCDP.consumer;
                case 4:
                    CashCDP cashCDP2 = (CashCDP) provider.invoke();
                    cashCDP2.getClass();
                    return cashCDP2.flusher;
                case 5:
                    ActivityEventFlushStrategy activityEventFlushStrategy = (ActivityEventFlushStrategy) provider.invoke();
                    activityEventFlushStrategy.getClass();
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new FlushStrategy[]{new OneTimeFlushStrategy(), new TimeIntervalFlushStrategy(), activityEventFlushStrategy});
                case 6:
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    androidClock.getClass();
                    return new RealLocalBrandProfileBannerDismissalTracker(androidClock);
                case 7:
                    LocalInMemoryDatabase localInMemoryDatabase = (LocalInMemoryDatabase) provider.invoke();
                    localInMemoryDatabase.getClass();
                    return new RealLocalBrandRepository(localInMemoryDatabase);
                case 8:
                    LocalService localService = (LocalService) provider.invoke();
                    localService.getClass();
                    return new RealLocalOrderRepository(localService);
                case 9:
                    Application application = (Application) provider.invoke();
                    application.getClass();
                    return Boolean.valueOf(PayDataKt.provideGmsWalletApiEnabled(application));
                case 10:
                    RealRegionProvider realRegionProvider = (RealRegionProvider) provider.invoke();
                    realRegionProvider.getClass();
                    return new RealCountryOnboardingConfigRepo(realRegionProvider);
                case 11:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    return new LimitsSetting(realBitcoinCapabilityProvider, i4);
                case 12:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider.invoke();
                    realBitcoinCapabilityProvider2.getClass();
                    return new LimitsSetting(realBitcoinCapabilityProvider2, i2);
                case 13:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider3 = (RealBitcoinCapabilityProvider) provider.invoke();
                    realBitcoinCapabilityProvider3.getClass();
                    return new LimitsSetting(realBitcoinCapabilityProvider3, i3);
                case 14:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider4 = (RealBitcoinCapabilityProvider) provider.invoke();
                    realBitcoinCapabilityProvider4.getClass();
                    return new LimitsSetting(realBitcoinCapabilityProvider4, 4);
                case 15:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return Room.StringKeyValue(sharedPreferences, "payment-pad-theme-selection", "GREEN", false);
                case 16:
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) provider.invoke();
                    realAccountholderAccountRepository.getClass();
                    return new JCAContext(realAccountholderAccountRepository, 13);
                case 17:
                    ActivityZiplineManifestWatcher activityZiplineManifestWatcher = (ActivityZiplineManifestWatcher) provider.invoke();
                    activityZiplineManifestWatcher.getClass();
                    return activityZiplineManifestWatcher;
                case 18:
                    AndroidClock androidClock2 = (AndroidClock) provider.invoke();
                    androidClock2.getClass();
                    return new RealActivityFeedProducer(androidClock2, i4);
                case 19:
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    sessionManager.getClass();
                    return new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountTokenOrNull(sessionManager), (String) null, 12);
                case 20:
                    RealContactRepository realContactRepository = (RealContactRepository) provider.invoke();
                    realContactRepository.getClass();
                    return new RealDeviceContactItemTransformer(realContactRepository);
                case 21:
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    sessionManager2.getClass();
                    return new RealActivityTokenFactory(sessionManager2);
                case 22:
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider.invoke();
                    androidStringManager2.getClass();
                    return new PaymentHistoryAvatarFactory(androidStringManager2);
                case 23:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda0 = new SvgDecoder$$ExternalSyntheticLambda0(7);
                    SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda02 = new SvgDecoder$$ExternalSyntheticLambda0(8);
                    DataStoreKey$$ExternalSyntheticLambda0 dataStoreKey$$ExternalSyntheticLambda0 = new DataStoreKey$$ExternalSyntheticLambda0(18);
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
                    return Room.SerDeKeyValue$default(sharedPreferences2, "AFTERPAY_APPLET_VIEWED_MESSAGE_IDS", svgDecoder$$ExternalSyntheticLambda0, svgDecoder$$ExternalSyntheticLambda02, dataStoreKey$$ExternalSyntheticLambda0, 64);
                case 24:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda03 = new SvgDecoder$$ExternalSyntheticLambda0(9);
                    SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda04 = new SvgDecoder$$ExternalSyntheticLambda0(10);
                    DataStoreKey$$ExternalSyntheticLambda0 dataStoreKey$$ExternalSyntheticLambda02 = new DataStoreKey$$ExternalSyntheticLambda0(19);
                    KeyValue.OnDeserializationFailure onDeserializationFailure2 = KeyValue.OnDeserializationFailure.Delete;
                    return Room.SerDeKeyValue$default(sharedPreferences3, "AFTERPAY_APPLET_VIEWED_SECTION_IDS", svgDecoder$$ExternalSyntheticLambda03, svgDecoder$$ExternalSyntheticLambda04, dataStoreKey$$ExternalSyntheticLambda02, 64);
                case 25:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return Room.BooleanKeyValue(sharedPreferences4, "HAS_VIEWED_AFTERPAY_APPLET", false, false);
                case 26:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return Room.BooleanKeyValue(sharedPreferences5, "SEEN_AFTERPAY_INSTALLED_TILE", false, false);
                case 27:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new RealAfterpayAppletAnalytics(analytics);
                case 28:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                    sharedPreferences6.getClass();
                    return Room.BooleanKeyValue(sharedPreferences6, "contacts_permission_prompt_responded", false, false);
                default:
                    FormBlockerView$Factory$Impl formBlockerView$Factory$Impl = (FormBlockerView$Factory$Impl) provider.invoke();
                    formBlockerView$Factory$Impl.getClass();
                    return new AppIntroViewFactory(formBlockerView$Factory$Impl, i4);
            }
        }

        public /* synthetic */ MetroFactory(Object obj, Provider provider, int i) {
            this.$r8$classId = i;
            this.blockersNavigator = provider;
        }
    }
}
