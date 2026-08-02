package com.squareup.cash.initialscreenloader.backend;

import android.content.Intent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.viewbinding.ViewBindings;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.AccountSwitcher$Result;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.account.AccountReturningLoginAccountListLoaded;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileToken;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$ContextualOnboardingVideoAssets;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.backend.InitialScreenLoader$TriggeredBy;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$models$1$1$1;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.IntentHandler;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import com.squareup.cash.onboarding.backend.OnboardingFlowType;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.session.backend.RealSessionInitiator;
import com.squareup.cash.session.backend.RealSessionRefresher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.userjourneys.tracker.ActiveUserJourney;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$AppLock;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$MarketCapabilities;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$Profile;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$Tabs;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountAuthorizedRelationship;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountRequest;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountResponse;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.staff.plasma.v1.SquareStaffOnboardingFlowParameter;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetLinkedAccountsResponse;
import com.squareup.protos.franklin.app.GetScenarioPlanResponse;
import com.squareup.protos.franklin.app.InitiateSessionResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;
import okio.ByteString;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealInitialScreenLoader {
    public final BooleanPreference accountPickerSessionExpired;
    public final AccountSwitchScreenStateRelay accountSwitchScreenStateRelay;
    public final RealAccountSwitcher accountSwitcher;
    public final AndroidActivityFinisher activityFinisher;
    public final Analytics analytics;
    public final JanusService appService;
    public final RealBackupService backupService;
    public final RealClientRouteFormatter clientRouteFormatter;
    public final RealColdStartIntegrityChecker coldStartIntegrityChecker;
    public final CoroutineContext computationDispatcher;
    public final CoroutineScope coroutineScope;
    public final DeepLinkCompletableNavigator deepLinkCompletableNavigator;
    public final DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkEmitter;
    public final RealDeviceManagerRepo deviceUpdater;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final DefaultSocket forcedLogoutNotifier;
    public final AppService franklinAppService;
    public final JobImpl initialScreenLoaded;
    public final IntentHandler intentHandler;
    public final CoroutineContext ioDispatcher;
    public final UserJourneyTracker journeyTracker;
    public final MainActivity$navigatorSwitcher$1 navigatorSwitcher;
    public final Provider onSessionChangeActionsExecutorProvider;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;
    public final EnumPreference onboardingFlowTypePreference;
    public final RealOnboardingIntegrityChecker onboardingIntegrityChecker;
    public final OpenTheAppUserJourney openTheAppUserJourney;
    public final RealPreSignInScreenLoader preSignInScreenLoader;
    public final KeyValue principalAccountToken;
    public final InstrumentQueries profileQueries;
    public final RealSessionInitiator sessionInitiator;
    public final SessionManager sessionManager;
    public final RealSessionRefresher sessionRefresher;
    public final Signal signOutSignal;
    public final SignedInStateManager signedInStateManager;
    public final RealSquareStaffSwitchAccountContextStore squareStaffSwitchAccountContextStore;
    public final StorageLink storageLink;
    public final StorageLinker storageLinker;
    public final CoroutineContext uiDispatcher;
    public final Navigator unlockedNavigator;
    public final HttpUrl.Builder versionUpdater;

    public final class MetroFactory {
        public final Provider accountPickerSessionExpired;
        public final InstanceFactory accountSwitchScreenStateRelay;
        public final Provider accountSwitcher;
        public final Provider activityFinisher;
        public final Provider analytics;
        public final Provider appService;
        public final Provider backupService;
        public final Provider cashDatabase;
        public final Provider clientRouteFormatter;
        public final Provider coldStartIntegrityChecker;
        public final Provider computationDispatcher;
        public final InstanceFactory coroutineScope;
        public final Provider deepLinkCompletableNavigator;
        public final Provider deferredDeepLinkEmitter;
        public final Provider deviceUpdater;
        public final Provider featureFlagManager;
        public final Provider flowStarter;
        public final WalletUiFactory$MetroFactory forcedLogoutNotifier;
        public final Provider franklinAppService;
        public final Provider initialScreenLoaded;
        public final Provider intentHandler;
        public final Provider ioDispatcher;
        public final Provider journeyTracker;
        public final InstanceFactory navigatorSwitcher;
        public final Provider onSessionChangeActionsExecutorProvider;
        public final Provider onboardingFlowTokenManager;
        public final RealCurrentUserSetter.MetroFactory onboardingFlowTypePreference;
        public final Provider onboardingIntegrityChecker;
        public final Provider openTheAppUserJourney;
        public final Provider preSignInScreenLoader;
        public final Provider principalAccountToken;
        public final Provider sessionInitiator;
        public final Provider sessionManager;
        public final Provider sessionRefresher;
        public final Provider signOutSignal;
        public final Provider signedInStateManager;
        public final Provider squareStaffSwitchAccountContextStore;
        public final InstanceFactory storageLink;
        public final Provider storageLinker;
        public final Provider uiDispatcher;
        public final RealAppMessageManager.MetroFactory versionUpdater;

        public MetroFactory(RealAppMessageManager.MetroFactory metroFactory, Provider provider, Provider provider2, RealCurrentUserSetter.MetroFactory metroFactory2, Provider provider3, Provider provider4, InstanceFactory instanceFactory, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, Provider provider25, Provider provider26, InstanceFactory instanceFactory4, Provider provider27, Provider provider28, Provider provider29, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34) {
            this.versionUpdater = metroFactory;
            this.deepLinkCompletableNavigator = provider;
            this.accountPickerSessionExpired = provider2;
            this.onboardingFlowTypePreference = metroFactory2;
            this.onboardingFlowTokenManager = provider3;
            this.intentHandler = provider4;
            this.navigatorSwitcher = instanceFactory;
            this.sessionManager = provider5;
            this.onSessionChangeActionsExecutorProvider = provider6;
            this.flowStarter = provider7;
            this.appService = provider8;
            this.franklinAppService = provider9;
            this.cashDatabase = provider10;
            this.coldStartIntegrityChecker = provider11;
            this.onboardingIntegrityChecker = provider12;
            this.initialScreenLoaded = provider13;
            this.sessionInitiator = provider14;
            this.sessionRefresher = provider15;
            this.activityFinisher = provider16;
            this.backupService = provider17;
            this.analytics = provider18;
            this.signedInStateManager = provider19;
            this.signOutSignal = provider20;
            this.ioDispatcher = provider21;
            this.computationDispatcher = provider22;
            this.uiDispatcher = provider23;
            this.deviceUpdater = provider24;
            this.coroutineScope = instanceFactory2;
            this.storageLink = instanceFactory3;
            this.storageLinker = provider25;
            this.accountSwitcher = provider26;
            this.accountSwitchScreenStateRelay = instanceFactory4;
            this.journeyTracker = provider27;
            this.openTheAppUserJourney = provider28;
            this.preSignInScreenLoader = provider29;
            this.forcedLogoutNotifier = walletUiFactory$MetroFactory;
            this.squareStaffSwitchAccountContextStore = provider30;
            this.deferredDeepLinkEmitter = provider31;
            this.clientRouteFormatter = provider32;
            this.principalAccountToken = provider33;
            this.featureFlagManager = provider34;
        }
    }

    public final class ScreenLoaded {
        public final boolean loaded;

        public /* synthetic */ ScreenLoaded(boolean z) {
            this.loaded = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ScreenLoaded) {
                return this.loaded == ((ScreenLoaded) obj).loaded;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.loaded);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ScreenLoaded(loaded=", ")", this.loaded);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StartSignedInResult {
        public static final /* synthetic */ StartSignedInResult[] $VALUES;
        public static final StartSignedInResult Failed;
        public static final StartSignedInResult SignedOut;
        public static final StartSignedInResult Success;

        static {
            StartSignedInResult startSignedInResult = new StartSignedInResult("Failed", 0);
            Failed = startSignedInResult;
            StartSignedInResult startSignedInResult2 = new StartSignedInResult("Success", 1);
            Success = startSignedInResult2;
            StartSignedInResult startSignedInResult3 = new StartSignedInResult("SignedOut", 2);
            SignedOut = startSignedInResult3;
            $VALUES = new StartSignedInResult[]{startSignedInResult, startSignedInResult2, startSignedInResult3};
        }

        public static StartSignedInResult valueOf(String str) {
            return (StartSignedInResult) Enum.valueOf(StartSignedInResult.class, str);
        }

        public static StartSignedInResult[] values() {
            return (StartSignedInResult[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StartSignedInResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StartSignedInResult startSignedInResult = StartSignedInResult.Failed;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StartSignedInResult startSignedInResult2 = StartSignedInResult.Failed;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GetScenarioPlanResponse.Status.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IntegrityCheckFactory$Type.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IntegrityCheckFactory$Type integrityCheckFactory$Type = IntegrityCheckFactory$Type.PROFILE;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RealInitialScreenLoader(HttpUrl.Builder builder, DeepLinkCompletableNavigator deepLinkCompletableNavigator, BooleanPreference booleanPreference, EnumPreference enumPreference, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager, IntentHandler intentHandler, MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1, SessionManager sessionManager, Provider provider, FlowStarter flowStarter, JanusService janusService, AppService appService, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealColdStartIntegrityChecker realColdStartIntegrityChecker, RealOnboardingIntegrityChecker realOnboardingIntegrityChecker, JobImpl jobImpl, RealSessionInitiator realSessionInitiator, RealSessionRefresher realSessionRefresher, AndroidActivityFinisher androidActivityFinisher, RealBackupService realBackupService, Analytics analytics, SignedInStateManager signedInStateManager, Signal signal, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, Navigator navigator, RealDeviceManagerRepo realDeviceManagerRepo, CoroutineScope coroutineScope, StorageLink storageLink, StorageLinker storageLinker, RealAccountSwitcher realAccountSwitcher, AccountSwitchScreenStateRelay accountSwitchScreenStateRelay, UserJourneyTracker userJourneyTracker, OpenTheAppUserJourney openTheAppUserJourney, RealPreSignInScreenLoader realPreSignInScreenLoader, DefaultSocket defaultSocket, RealSquareStaffSwitchAccountContextStore realSquareStaffSwitchAccountContextStore, DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, RealClientRouteFormatter realClientRouteFormatter, KeyValue keyValue, FeatureFlagManager featureFlagManager) {
        provider.getClass();
        this.versionUpdater = builder;
        this.deepLinkCompletableNavigator = deepLinkCompletableNavigator;
        this.accountPickerSessionExpired = booleanPreference;
        this.onboardingFlowTypePreference = enumPreference;
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
        this.intentHandler = intentHandler;
        this.navigatorSwitcher = mainActivity$navigatorSwitcher$1;
        this.sessionManager = sessionManager;
        this.onSessionChangeActionsExecutorProvider = provider;
        this.flowStarter = flowStarter;
        this.appService = janusService;
        this.franklinAppService = appService;
        this.coldStartIntegrityChecker = realColdStartIntegrityChecker;
        this.onboardingIntegrityChecker = realOnboardingIntegrityChecker;
        this.initialScreenLoaded = jobImpl;
        this.sessionInitiator = realSessionInitiator;
        this.sessionRefresher = realSessionRefresher;
        this.activityFinisher = androidActivityFinisher;
        this.backupService = realBackupService;
        this.analytics = analytics;
        this.signedInStateManager = signedInStateManager;
        this.signOutSignal = signal;
        this.ioDispatcher = coroutineContext;
        this.computationDispatcher = coroutineContext2;
        this.uiDispatcher = coroutineContext3;
        this.unlockedNavigator = navigator;
        this.deviceUpdater = realDeviceManagerRepo;
        this.coroutineScope = coroutineScope;
        this.storageLink = storageLink;
        this.storageLinker = storageLinker;
        this.accountSwitcher = realAccountSwitcher;
        this.accountSwitchScreenStateRelay = accountSwitchScreenStateRelay;
        this.journeyTracker = userJourneyTracker;
        this.openTheAppUserJourney = openTheAppUserJourney;
        this.preSignInScreenLoader = realPreSignInScreenLoader;
        this.forcedLogoutNotifier = defaultSocket;
        this.squareStaffSwitchAccountContextStore = realSquareStaffSwitchAccountContextStore;
        this.deferredDeepLinkEmitter = deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
        this.clientRouteFormatter = realClientRouteFormatter;
        this.principalAccountToken = keyValue;
        this.featureFlagManager = featureFlagManager;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public static final void access$logError(RealInitialScreenLoader realInitialScreenLoader, IntegrityChecker$Result.Failure failure) {
        UserJourney$Friction userJourney$Friction;
        int ordinal = failure.getIntegrityCheck().getType().ordinal();
        if (ordinal == 1) {
            ProfileToken profileToken = (ProfileToken) realInitialScreenLoader.profileQueries.profileToken().executeAsOneOrNull();
            Timber.Forest.e(new IllegalStateException(Recorder$$ExternalSyntheticOutline2.m("No valid MCF data after retry. profile_token: ", profileToken != null ? profileToken.profile_token : null)));
        } else if (ordinal == 2) {
            Timber.Forest.e(new IllegalStateException("Missing AppLock SyncValue."));
        }
        OpenTheAppUserJourney openTheAppUserJourney = realInitialScreenLoader.openTheAppUserJourney;
        IntegrityCheck integrityCheck = failure.getIntegrityCheck();
        RealOpenTheAppUserJourney realOpenTheAppUserJourney = (RealOpenTheAppUserJourney) openTheAppUserJourney;
        integrityCheck.getClass();
        int ordinal2 = integrityCheck.getType().ordinal();
        if (ordinal2 == 0) {
            userJourney$Friction = UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$Profile.INSTANCE;
        } else if (ordinal2 == 1) {
            userJourney$Friction = UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$MarketCapabilities.INSTANCE;
        } else if (ordinal2 == 2) {
            userJourney$Friction = UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$AppLock.INSTANCE;
        } else {
            if (ordinal2 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            userJourney$Friction = UserJourney$Frustration$OpenTheApp$IntegrityCheckFailed$Tabs.INSTANCE;
        }
        ((RealUserJourneyTracker) ((UserJourneyTracker) realOpenTheAppUserJourney.userJourneyTrackerProvider.invoke())).addFrustrationSignal(UserJourney$Name.OPEN_THE_APP, userJourney$Friction);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$recoverPrincipalAccountToken(RealInitialScreenLoader realInitialScreenLoader, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$recoverPrincipalAccountToken$1 realInitialScreenLoader$recoverPrincipalAccountToken$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealInitialScreenLoader$recoverPrincipalAccountToken$1) {
            realInitialScreenLoader$recoverPrincipalAccountToken$1 = (RealInitialScreenLoader$recoverPrincipalAccountToken$1) continuationImpl;
            int i2 = realInitialScreenLoader$recoverPrincipalAccountToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$recoverPrincipalAccountToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$recoverPrincipalAccountToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$recoverPrincipalAccountToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    JanusService janusService = realInitialScreenLoader.appService;
                    GetAuthorizedAccountRequest getAuthorizedAccountRequest = new GetAuthorizedAccountRequest(ByteString.EMPTY);
                    realInitialScreenLoader$recoverPrincipalAccountToken$1.label = 1;
                    obj = janusService.getAuthorizedAccount(getAuthorizedAccountRequest, realInitialScreenLoader$recoverPrincipalAccountToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetAuthorizedAccountResponse getAuthorizedAccountResponse = (GetAuthorizedAccountResponse) ((ApiResult.Success) apiResult).response;
                    String str = getAuthorizedAccountResponse.principal_token;
                    if (getAuthorizedAccountResponse.authorized_relationship == GetAuthorizedAccountAuthorizedRelationship.RELATIONSHIP_SPONSOR && str != null) {
                        return new PrincipalAccountToken.Some(str, null);
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return PrincipalAccountToken.None.INSTANCE;
            }
        }
        realInitialScreenLoader$recoverPrincipalAccountToken$1 = new RealInitialScreenLoader$recoverPrincipalAccountToken$1(realInitialScreenLoader, continuationImpl);
        Object obj2 = realInitialScreenLoader$recoverPrincipalAccountToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$recoverPrincipalAccountToken$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return PrincipalAccountToken.None.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        if (r0 == r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        if (r0 == r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0085, code lost:
    
        if (r0 == r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        if (r0 == r8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* renamed from: access$resolveInitialScreen-zO7DZzo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3567access$resolveInitialScreenzO7DZzo(RealInitialScreenLoader realInitialScreenLoader, Intent intent, Function2 function2, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$resolveInitialScreen$1 realInitialScreenLoader$resolveInitialScreen$1;
        int i;
        boolean z;
        boolean z2;
        Function2 function22 = function2;
        OpenTheAppUserJourney openTheAppUserJourney = realInitialScreenLoader.openTheAppUserJourney;
        SessionManager sessionManager = realInitialScreenLoader.sessionManager;
        Navigator navigator = realInitialScreenLoader.unlockedNavigator;
        MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = realInitialScreenLoader.navigatorSwitcher;
        if (continuationImpl instanceof RealInitialScreenLoader$resolveInitialScreen$1) {
            realInitialScreenLoader$resolveInitialScreen$1 = (RealInitialScreenLoader$resolveInitialScreen$1) continuationImpl;
            int i2 = realInitialScreenLoader$resolveInitialScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$resolveInitialScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$resolveInitialScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$resolveInitialScreen$1.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1) realInitialScreenLoader.deepLinkCompletableNavigator).complete(navigator);
                    if (((SessionState) sessionManager.getSessionState().getValue()) instanceof SwitchingState) {
                        realInitialScreenLoader$resolveInitialScreen$1.L$1 = null;
                        realInitialScreenLoader$resolveInitialScreen$1.label = 1;
                        obj = realInitialScreenLoader.m3573switchAccountFlowK3MVf5E(function22, realInitialScreenLoader$resolveInitialScreen$1);
                    } else if (((Function0) realInitialScreenLoader.signedInStateManager.state.getValue).invoke() == SignedInState.SIGNED_OUT || !PlatformKt.hasOnboardedAccount(sessionManager)) {
                        ((RealOpenTheAppUserJourney) openTheAppUserJourney).setIsSignedIn(false);
                        RealIntentHandler realIntentHandler = (RealIntentHandler) realInitialScreenLoader.intentHandler;
                        intent.getClass();
                        r14 = PlatformKt.hasOnboardedAccount(realIntentHandler.sessionManager) ? false : Intrinsics.areEqual(realIntentHandler.handleDeepLink(intent, navigator, null, false), Boolean.TRUE);
                        intent.putExtra("deep_link_consumed", true);
                        realInitialScreenLoader$resolveInitialScreen$1.L$1 = function22;
                        realInitialScreenLoader$resolveInitialScreen$1.Z$0 = r14;
                        realInitialScreenLoader$resolveInitialScreen$1.label = 2;
                        if (realInitialScreenLoader.emitDeferredDeepLinkForPendingSquareStaffInvitation(realInitialScreenLoader$resolveInitialScreen$1) != obj2) {
                            z = r14;
                            if (z) {
                            }
                        }
                    } else {
                        ((RealOpenTheAppUserJourney) openTheAppUserJourney).setIsSignedIn(true);
                        Signal signal = realInitialScreenLoader.signOutSignal;
                        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(realInitialScreenLoader, intent, function22, continuation, 14);
                        realInitialScreenLoader$resolveInitialScreen$1.L$1 = null;
                        realInitialScreenLoader$resolveInitialScreen$1.label = 5;
                        obj = StateFlowKt.until(signal, dataStoreImpl$readDataOrHandleCorruption$3, realInitialScreenLoader$resolveInitialScreen$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z3 = ((ScreenLoaded) obj).loaded;
                    if (z3) {
                        mainActivity$navigatorSwitcher$1.coldStartFinished(true);
                    }
                    return new ScreenLoaded(z3);
                }
                if (i == 2) {
                    z = realInitialScreenLoader$resolveInitialScreen$1.Z$0;
                    function22 = realInitialScreenLoader$resolveInitialScreen$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        realInitialScreenLoader$resolveInitialScreen$1.L$1 = null;
                        realInitialScreenLoader$resolveInitialScreen$1.Z$0 = z;
                        realInitialScreenLoader$resolveInitialScreen$1.label = 4;
                        obj = realInitialScreenLoader.m3572startOnboardingFlowzO7DZzo(function22, true, realInitialScreenLoader$resolveInitialScreen$1);
                    } else {
                        realInitialScreenLoader$resolveInitialScreen$1.L$1 = null;
                        realInitialScreenLoader$resolveInitialScreen$1.Z$0 = z;
                        realInitialScreenLoader$resolveInitialScreen$1.label = 3;
                        obj = realInitialScreenLoader.m3568clearDataAndInitiateSessionzO7DZzo(function22, true, realInitialScreenLoader$resolveInitialScreen$1);
                    }
                    return obj2;
                }
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    z2 = ((ScreenLoaded) obj).loaded;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        StartSignedInResult startSignedInResult = (StartSignedInResult) obj;
                        if (startSignedInResult == null) {
                            startSignedInResult = StartSignedInResult.SignedOut;
                        }
                        JobKt.launch$default(realInitialScreenLoader.coroutineScope, realInitialScreenLoader.ioDispatcher, null, new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i3), 2);
                        int ordinal = startSignedInResult.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                mainActivity$navigatorSwitcher$1.coldStartFinished(false);
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                mainActivity$navigatorSwitcher$1.coldStartFinished(true);
                            }
                            r14 = true;
                        }
                        return new ScreenLoaded(r14);
                    }
                    SafeTrace.throwOnFailure(obj);
                    z2 = ((ScreenLoaded) obj).loaded;
                }
                if (z2) {
                    mainActivity$navigatorSwitcher$1.coldStartFinished(true);
                }
                return new ScreenLoaded(z2);
            }
        }
        realInitialScreenLoader$resolveInitialScreen$1 = new RealInitialScreenLoader$resolveInitialScreen$1(realInitialScreenLoader, continuationImpl);
        Object obj3 = realInitialScreenLoader$resolveInitialScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$resolveInitialScreen$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (z2) {
        }
        return new ScreenLoaded(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6.ioDispatcher, r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: clearDataAndInitiateSession-zO7DZzo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3568clearDataAndInitiateSessionzO7DZzo(Function2 function2, boolean z, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$clearDataAndInitiateSession$1 realInitialScreenLoader$clearDataAndInitiateSession$1;
        int i;
        if (continuationImpl instanceof RealInitialScreenLoader$clearDataAndInitiateSession$1) {
            realInitialScreenLoader$clearDataAndInitiateSession$1 = (RealInitialScreenLoader$clearDataAndInitiateSession$1) continuationImpl;
            int i2 = realInitialScreenLoader$clearDataAndInitiateSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$clearDataAndInitiateSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$clearDataAndInitiateSession$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$clearDataAndInitiateSession$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashApp$onCreate$4$1$1 cashApp$onCreate$4$1$1 = new CashApp$onCreate$4$1$1(this, continuation, 22);
                    realInitialScreenLoader$clearDataAndInitiateSession$1.L$0 = function2;
                    realInitialScreenLoader$clearDataAndInitiateSession$1.Z$0 = z;
                    realInitialScreenLoader$clearDataAndInitiateSession$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realInitialScreenLoader$clearDataAndInitiateSession$1.Z$0;
                    function2 = realInitialScreenLoader$clearDataAndInitiateSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                realInitialScreenLoader$clearDataAndInitiateSession$1.L$0 = null;
                realInitialScreenLoader$clearDataAndInitiateSession$1.Z$0 = z;
                realInitialScreenLoader$clearDataAndInitiateSession$1.label = 2;
                Object m3569initiateSessionzO7DZzo = m3569initiateSessionzO7DZzo(function2, z, realInitialScreenLoader$clearDataAndInitiateSession$1);
                return m3569initiateSessionzO7DZzo != obj2 ? obj2 : m3569initiateSessionzO7DZzo;
            }
        }
        realInitialScreenLoader$clearDataAndInitiateSession$1 = new RealInitialScreenLoader$clearDataAndInitiateSession$1(this, continuationImpl);
        Object obj3 = realInitialScreenLoader$clearDataAndInitiateSession$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$clearDataAndInitiateSession$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        realInitialScreenLoader$clearDataAndInitiateSession$1.L$0 = null;
        realInitialScreenLoader$clearDataAndInitiateSession$1.Z$0 = z;
        realInitialScreenLoader$clearDataAndInitiateSession$1.label = 2;
        Object m3569initiateSessionzO7DZzo2 = m3569initiateSessionzO7DZzo(function2, z, realInitialScreenLoader$clearDataAndInitiateSession$1);
        if (m3569initiateSessionzO7DZzo2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitDeferredDeepLinkForPendingSquareStaffInvitation(ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1 realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1;
        int i;
        String str;
        if (continuationImpl instanceof RealInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1) {
            realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1 = (RealInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1) continuationImpl;
            int i2 = realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.label = 1;
                    obj = this.squareStaffSwitchAccountContextStore.pendingInvitationToken(realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return Unit.INSTANCE;
                }
                this.deferredDeepLinkEmitter.defer(new DeepLink(zzjm.format(this.clientRouteFormatter, new ClientRoute.Flow(ViewBindings.buildInitiationData(Flow$Type.SQUARE_STAFF_ONBOARDING, new SquareStaffOnboardingFlowParameter(str)))).toString(), null, null));
                return Unit.INSTANCE;
            }
        }
        realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1 = new RealInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1(this, continuationImpl);
        Object obj2 = realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$emitDeferredDeepLinkForPendingSquareStaffInvitation$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    public final void goToOnboardingEntry(Screen screen, OpenTheAppUserJourney.InitialScreen initialScreen, boolean z) {
        JsonFeatureFlags$ContextualOnboardingVideoAssets.Config config = (JsonFeatureFlags$ContextualOnboardingVideoAssets.Config) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(JsonFeatureFlags$ContextualOnboardingVideoAssets.INSTANCE)).value;
        if (!(screen instanceof OnboardingLandingScreen) && z) {
            boolean z2 = config.enabled;
            String str = config.videoUrl;
            if (z2 && !StringsKt.isBlank(str)) {
                screen = new OnboardingLandingScreen(screen, config.placeholderImageUrl, str);
            }
        }
        this.unlockedNavigator.goTo(screen);
        ((RealOpenTheAppUserJourney) this.openTheAppUserJourney).onInitialScreenLoaded(initialScreen);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r4.notify(r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r4.notify(r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005f, code lost:
    
        if (r12 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: initiateSession-zO7DZzo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3569initiateSessionzO7DZzo(Function2 function2, boolean z, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$initiateSession$1 realInitialScreenLoader$initiateSession$1;
        int i;
        Function2 function22;
        boolean z2;
        Screen screen;
        boolean z3;
        if (continuationImpl instanceof RealInitialScreenLoader$initiateSession$1) {
            realInitialScreenLoader$initiateSession$1 = (RealInitialScreenLoader$initiateSession$1) continuationImpl;
            int i2 = realInitialScreenLoader$initiateSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$initiateSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$initiateSession$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$initiateSession$1.label;
                UserJourneyTracker userJourneyTracker = this.journeyTracker;
                DefaultSocket defaultSocket = this.forcedLogoutNotifier;
                EnumPreference enumPreference = this.onboardingFlowTypePreference;
                boolean z4 = true;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        realInitialScreenLoader$initiateSession$1.L$0 = function2;
                        realInitialScreenLoader$initiateSession$1.Z$0 = z;
                        realInitialScreenLoader$initiateSession$1.label = 1;
                        obj = this.sessionInitiator.call(realInitialScreenLoader$initiateSession$1);
                        break;
                    case 1:
                        z = realInitialScreenLoader$initiateSession$1.Z$0;
                        function2 = realInitialScreenLoader$initiateSession$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            if (((InitiateSessionResponse) ((ApiResult.Success) apiResult).response).account_list_config != null) {
                                enumPreference.set(OnboardingFlowType.RETURNING_CUSTOMER);
                                if (!isLoginJourneyActive()) {
                                    UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, UserJourney$Name.LOGIN);
                                }
                                this.unlockedNavigator.goTo(OnboardingAccountPickerScreen.INSTANCE);
                                ((RealOpenTheAppUserJourney) this.openTheAppUserJourney).onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen.ACCOUNT_PICKER);
                                realInitialScreenLoader$initiateSession$1.L$0 = null;
                                realInitialScreenLoader$initiateSession$1.Z$0 = z;
                                realInitialScreenLoader$initiateSession$1.label = 2;
                                break;
                            } else {
                                if (!z) {
                                    screen = null;
                                    if (screen == null) {
                                    }
                                    return new ScreenLoaded(z4);
                                }
                                realInitialScreenLoader$initiateSession$1.L$0 = null;
                                realInitialScreenLoader$initiateSession$1.Z$0 = z;
                                realInitialScreenLoader$initiateSession$1.label = 3;
                                RealPreSignInScreenLoader realPreSignInScreenLoader = this.preSignInScreenLoader;
                                obj = realPreSignInScreenLoader.loadPreSignInScreen(new RealBrazeManager$$ExternalSyntheticLambda0(realPreSignInScreenLoader, 19), true, true, realInitialScreenLoader$initiateSession$1);
                                if (obj != obj2) {
                                    z3 = z;
                                    screen = (Screen) obj;
                                    z = z3;
                                    if (screen == null) {
                                        enumPreference.set(OnboardingFlowType.CLASSIC);
                                        if (!isLoginJourneyActive()) {
                                            UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, UserJourney$Name.LOGIN);
                                        }
                                        goToOnboardingEntry(FlowStarter.startOnboardingFlow$default(this.flowStarter), OpenTheAppUserJourney.InitialScreen.ONBOARDING_FLOW, z);
                                        realInitialScreenLoader$initiateSession$1.L$0 = null;
                                        realInitialScreenLoader$initiateSession$1.Z$0 = z;
                                        realInitialScreenLoader$initiateSession$1.label = 4;
                                        break;
                                    } else {
                                        goToOnboardingEntry(screen, OpenTheAppUserJourney.InitialScreen.PRE_SIGN_IN, true);
                                    }
                                    return new ScreenLoaded(z4);
                                }
                            }
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure) && apiResult != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            realInitialScreenLoader$initiateSession$1.L$0 = function2;
                            realInitialScreenLoader$initiateSession$1.Z$0 = z;
                            realInitialScreenLoader$initiateSession$1.label = 5;
                            obj = function2.invoke(InitiateSessionFailedScreen.INSTANCE, realInitialScreenLoader$initiateSession$1);
                            if (obj != obj2) {
                                boolean z5 = z;
                                function22 = function2;
                                z2 = z5;
                                if (((Boolean) obj).booleanValue()) {
                                    return new ScreenLoaded(false);
                                }
                                realInitialScreenLoader$initiateSession$1.L$0 = null;
                                realInitialScreenLoader$initiateSession$1.Z$0 = z2;
                                realInitialScreenLoader$initiateSession$1.label = 6;
                                Object m3569initiateSessionzO7DZzo = m3569initiateSessionzO7DZzo(function22, z2, realInitialScreenLoader$initiateSession$1);
                                if (m3569initiateSessionzO7DZzo != obj2) {
                                    return m3569initiateSessionzO7DZzo;
                                }
                            }
                        }
                        return obj2;
                    case 2:
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        return new ScreenLoaded(z4);
                    case 3:
                        z3 = realInitialScreenLoader$initiateSession$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                        screen = (Screen) obj;
                        z = z3;
                        if (screen == null) {
                        }
                        return new ScreenLoaded(z4);
                    case 5:
                        z2 = realInitialScreenLoader$initiateSession$1.Z$0;
                        function22 = realInitialScreenLoader$initiateSession$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realInitialScreenLoader$initiateSession$1 = new RealInitialScreenLoader$initiateSession$1(this, continuationImpl);
        Object obj3 = realInitialScreenLoader$initiateSession$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$initiateSession$1.label;
        UserJourneyTracker userJourneyTracker2 = this.journeyTracker;
        DefaultSocket defaultSocket2 = this.forcedLogoutNotifier;
        EnumPreference enumPreference2 = this.onboardingFlowTypePreference;
        boolean z42 = true;
        switch (i) {
        }
    }

    public final boolean isLoginJourneyActive() {
        List activeUserJourneys = ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) ((RealUserJourneyTracker) this.journeyTracker).signalProcessorProvider.getValue())).getActiveUserJourneys();
        if ((activeUserJourneys instanceof Collection) && activeUserJourneys.isEmpty()) {
            return false;
        }
        Iterator it = activeUserJourneys.iterator();
        while (it.hasNext()) {
            if (((ActiveUserJourney) it.next()).name == UserJourney$Name.LOGIN) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r12.uiDispatcher, r0, r6) != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r12.ioDispatcher, r0, r6) == r7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadInitialScreen(InitialScreenLoader$TriggeredBy initialScreenLoader$TriggeredBy, InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$1, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$loadInitialScreen$1 realInitialScreenLoader$loadInitialScreen$1;
        int i;
        InitialScreenLoader$TriggeredBy initialScreenLoader$TriggeredBy2;
        InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$12;
        if (continuationImpl instanceof RealInitialScreenLoader$loadInitialScreen$1) {
            realInitialScreenLoader$loadInitialScreen$1 = (RealInitialScreenLoader$loadInitialScreen$1) continuationImpl;
            int i2 = realInitialScreenLoader$loadInitialScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$loadInitialScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealInitialScreenLoader$loadInitialScreen$1 realInitialScreenLoader$loadInitialScreen$12 = realInitialScreenLoader$loadInitialScreen$1;
                Object obj = realInitialScreenLoader$loadInitialScreen$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$loadInitialScreen$12.label;
                int i3 = 3;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (initialScreenLoader$TriggeredBy instanceof InitialScreenLoader$TriggeredBy.ActivityLaunch) {
                        Timber.Forest.d("Loading initial screen for activity launch", new Object[0]);
                        CashApp$onCreate$1 cashApp$onCreate$1 = new CashApp$onCreate$1(this, continuation, i3);
                        realInitialScreenLoader$loadInitialScreen$12.L$0 = (InitialScreenLoader$TriggeredBy.ActivityLaunch) initialScreenLoader$TriggeredBy;
                        realInitialScreenLoader$loadInitialScreen$12.L$1 = initialScreenLoaderPresenter$models$1$1$1;
                        realInitialScreenLoader$loadInitialScreen$12.label = 1;
                        if (JobKt.withContext(this.computationDispatcher, cashApp$onCreate$1, realInitialScreenLoader$loadInitialScreen$12) != coroutineSingletons) {
                            initialScreenLoader$TriggeredBy2 = initialScreenLoader$TriggeredBy;
                            initialScreenLoaderPresenter$models$1$1$12 = initialScreenLoaderPresenter$models$1$1$1;
                            DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this, initialScreenLoader$TriggeredBy2, initialScreenLoaderPresenter$models$1$1$12, continuation, 28);
                            realInitialScreenLoader$loadInitialScreen$12.L$0 = null;
                            realInitialScreenLoader$loadInitialScreen$12.L$1 = null;
                            realInitialScreenLoader$loadInitialScreen$12.label = 2;
                        }
                    } else {
                        if (!(initialScreenLoader$TriggeredBy instanceof InitialScreenLoader$TriggeredBy.SignOut)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        DefaultStripeImageLoader$load$2 defaultStripeImageLoader$load$2 = new DefaultStripeImageLoader$load$2(this, initialScreenLoaderPresenter$models$1$1$1, null);
                        realInitialScreenLoader$loadInitialScreen$12.L$0 = null;
                        realInitialScreenLoader$loadInitialScreen$12.L$1 = null;
                        realInitialScreenLoader$loadInitialScreen$12.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$13 = realInitialScreenLoader$loadInitialScreen$12.L$1;
                initialScreenLoader$TriggeredBy2 = realInitialScreenLoader$loadInitialScreen$12.L$0;
                SafeTrace.throwOnFailure(obj);
                initialScreenLoaderPresenter$models$1$1$12 = initialScreenLoaderPresenter$models$1$1$13;
                DataStoreImpl$data$1 dataStoreImpl$data$12 = new DataStoreImpl$data$1(this, initialScreenLoader$TriggeredBy2, initialScreenLoaderPresenter$models$1$1$12, continuation, 28);
                realInitialScreenLoader$loadInitialScreen$12.L$0 = null;
                realInitialScreenLoader$loadInitialScreen$12.L$1 = null;
                realInitialScreenLoader$loadInitialScreen$12.label = 2;
            }
        }
        realInitialScreenLoader$loadInitialScreen$1 = new RealInitialScreenLoader$loadInitialScreen$1(this, continuationImpl);
        RealInitialScreenLoader$loadInitialScreen$1 realInitialScreenLoader$loadInitialScreen$122 = realInitialScreenLoader$loadInitialScreen$1;
        Object obj2 = realInitialScreenLoader$loadInitialScreen$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$loadInitialScreen$122.label;
        int i32 = 3;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: resumeAccountPickerFlow-K3MVf5E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3570resumeAccountPickerFlowK3MVf5E(Function2 function2, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$resumeAccountPickerFlow$1 realInitialScreenLoader$resumeAccountPickerFlow$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealInitialScreenLoader$resumeAccountPickerFlow$1) {
            realInitialScreenLoader$resumeAccountPickerFlow$1 = (RealInitialScreenLoader$resumeAccountPickerFlow$1) continuationImpl;
            int i2 = realInitialScreenLoader$resumeAccountPickerFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$resumeAccountPickerFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$resumeAccountPickerFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$resumeAccountPickerFlow$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, null);
                    realInitialScreenLoader$resumeAccountPickerFlow$1.L$0 = function2;
                    realInitialScreenLoader$resumeAccountPickerFlow$1.label = 1;
                    obj = StateFlowKt.until(this.signOutSignal, sessionWorker$doWork$2$2, realInitialScreenLoader$resumeAccountPickerFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function2 = realInitialScreenLoader$resumeAccountPickerFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    AccountListConfig accountListConfig = ((GetLinkedAccountsResponse) ((ApiResult.Success) apiResult).response).account_list_config;
                    accountListConfig.getClass();
                    int size = accountListConfig.accounts.size();
                    this.analytics.track(new AccountReturningLoginAccountListLoaded(size), null);
                    this.accountPickerSessionExpired.set(false);
                    if (size <= 0) {
                        realInitialScreenLoader$resumeAccountPickerFlow$1.L$0 = null;
                        realInitialScreenLoader$resumeAccountPickerFlow$1.label = 2;
                        Object m3571resumeClassicOnboardingFlowK3MVf5E = m3571resumeClassicOnboardingFlowK3MVf5E(function2, realInitialScreenLoader$resumeAccountPickerFlow$1);
                        return m3571resumeClassicOnboardingFlowK3MVf5E == obj2 ? obj2 : m3571resumeClassicOnboardingFlowK3MVf5E;
                    }
                    this.unlockedNavigator.goTo(OnboardingAccountPickerScreen.INSTANCE);
                    ((RealOpenTheAppUserJourney) this.openTheAppUserJourney).onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen.ACCOUNT_PICKER);
                } else if (apiResult instanceof ApiResult.Failure) {
                    goToOnboardingEntry(FlowStarter.startOnboardingFlow$default(this.flowStarter), OpenTheAppUserJourney.InitialScreen.ONBOARDING_FLOW, false);
                } else if (apiResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return new ScreenLoaded(z);
            }
        }
        realInitialScreenLoader$resumeAccountPickerFlow$1 = new RealInitialScreenLoader$resumeAccountPickerFlow$1(this, continuationImpl);
        Object obj3 = realInitialScreenLoader$resumeAccountPickerFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$resumeAccountPickerFlow$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return new ScreenLoaded(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0086, code lost:
    
        if (r1 == r3) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: resumeClassicOnboardingFlow-K3MVf5E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3571resumeClassicOnboardingFlowK3MVf5E(Function2 function2, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$resumeClassicOnboardingFlow$1 realInitialScreenLoader$resumeClassicOnboardingFlow$1;
        int i;
        String generateToken;
        String str;
        Function2 function22;
        ApiResult apiResult;
        Function2 function23;
        List<BlockerDescriptor> list;
        if (continuationImpl instanceof RealInitialScreenLoader$resumeClassicOnboardingFlow$1) {
            realInitialScreenLoader$resumeClassicOnboardingFlow$1 = (RealInitialScreenLoader$resumeClassicOnboardingFlow$1) continuationImpl;
            int i2 = realInitialScreenLoader$resumeClassicOnboardingFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$resumeClassicOnboardingFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$resumeClassicOnboardingFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$resumeClassicOnboardingFlow$1.label;
                boolean z = false;
                boolean z2 = true;
                char c = 1;
                char c2 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) this.onboardingFlowTokenManager.flowToken.$$delegate_0.getValue();
                    if (onboardingFlowTokenManager$FlowToken == null || !onboardingFlowTokenManager$FlowToken.completedAliasVerification) {
                        BlockersData.Flow.INSTANCE.getClass();
                        generateToken = BlockersData.Flow.Companion.generateToken();
                    } else {
                        generateToken = onboardingFlowTokenManager$FlowToken.value;
                    }
                    str = generateToken;
                    FlowExtensionsKt$runUntil$1$1 flowExtensionsKt$runUntil$1$1 = new FlowExtensionsKt$runUntil$1$1(this, str, continuation, c == true ? 1 : 0);
                    function22 = function2;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0 = function22;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$2 = str;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.label = 1;
                    obj = StateFlowKt.until(this.signOutSignal, flowExtensionsKt$runUntil$1$1, realInitialScreenLoader$resumeClassicOnboardingFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return new ScreenLoaded(z2);
                        }
                        if (i != 3) {
                            if (i == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function23 = realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return new ScreenLoaded(z);
                        }
                        realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0 = null;
                        realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$2 = null;
                        realInitialScreenLoader$resumeClassicOnboardingFlow$1.label = 4;
                        Object m3572startOnboardingFlowzO7DZzo = m3572startOnboardingFlowzO7DZzo(function23, true, realInitialScreenLoader$resumeClassicOnboardingFlow$1);
                        return m3572startOnboardingFlowzO7DZzo == obj2 ? obj2 : m3572startOnboardingFlowzO7DZzo;
                    }
                    str = realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$2;
                    function22 = realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return new ScreenLoaded(c2 == true ? 1 : 0);
                }
                if (apiResult instanceof ApiResult.Success) {
                    GetScenarioPlanResponse getScenarioPlanResponse = (GetScenarioPlanResponse) ((ApiResult.Success) apiResult).response;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0 = null;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$2 = null;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.label = 2;
                    GetScenarioPlanResponse.Status status = getScenarioPlanResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.GET_SCENARIO_PLAN_STATUS;
                    }
                    if (WhenMappings.$EnumSwitchMapping$1[status.ordinal()] != 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                        return null;
                    }
                    ResponseContext responseContext = getScenarioPlanResponse.response_context;
                    RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
                    str.getClass();
                    String persistedOnboardingFlowToken = realFlowStarter.persistedOnboardingFlowToken();
                    BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.ONBOARDING, persistedOnboardingFlowToken == null ? str : persistedOnboardingFlowToken, null, null, null, null, 980);
                    if (responseContext != null) {
                        BlockersData updateFromResponseContext = startFlow$default.updateFromResponseContext(responseContext, false);
                        ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                        if (scenarioPlan != null && (list = scenarioPlan.blocker_descriptors) != null) {
                            List<BlockerDescriptor> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    Blockers blockers = ((BlockerDescriptor) it.next()).blocker;
                                    if ((blockers != null ? blockers.alias_blocker : null) != null) {
                                        startFlow$default = BlockersData.copy$default(updateFromResponseContext, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, Countries.toRegion(realFlowStarter.regionProvider.guessCountry()), null, null, null, null, null, null, false, null, null, null, -1, 65503);
                                        break;
                                    }
                                }
                            }
                        }
                        startFlow$default = updateFromResponseContext;
                    }
                    goToOnboardingEntry(realFlowStarter.blockersDataNavigator.getNext(null, startFlow$default), OpenTheAppUserJourney.InitialScreen.ONBOARDING_FLOW, false);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$0 = function22;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.L$2 = null;
                    realInitialScreenLoader$resumeClassicOnboardingFlow$1.label = 3;
                    obj = function22.invoke(ScenarioPlanErrorScreen.INSTANCE, realInitialScreenLoader$resumeClassicOnboardingFlow$1);
                    if (obj != obj2) {
                        function23 = function22;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
            }
        }
        realInitialScreenLoader$resumeClassicOnboardingFlow$1 = new RealInitialScreenLoader$resumeClassicOnboardingFlow$1(this, continuationImpl);
        Object obj3 = realInitialScreenLoader$resumeClassicOnboardingFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$resumeClassicOnboardingFlow$1.label;
        boolean z3 = false;
        boolean z22 = true;
        char c3 = 1;
        char c22 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (r3 == r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: startOnboardingFlow-zO7DZzo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3572startOnboardingFlowzO7DZzo(Function2 function2, boolean z, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$startOnboardingFlow$1 realInitialScreenLoader$startOnboardingFlow$1;
        Object obj;
        int i;
        Function2 function22 = function2;
        boolean z2 = z;
        if (continuationImpl instanceof RealInitialScreenLoader$startOnboardingFlow$1) {
            realInitialScreenLoader$startOnboardingFlow$1 = (RealInitialScreenLoader$startOnboardingFlow$1) continuationImpl;
            int i2 = realInitialScreenLoader$startOnboardingFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$startOnboardingFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realInitialScreenLoader$startOnboardingFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$startOnboardingFlow$1.label;
                UserJourneyTracker userJourneyTracker = this.journeyTracker;
                boolean z3 = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManager sessionManager = this.sessionManager;
                    if (!(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated)) {
                        realInitialScreenLoader$startOnboardingFlow$1.L$0 = null;
                        realInitialScreenLoader$startOnboardingFlow$1.Z$0 = z2;
                        realInitialScreenLoader$startOnboardingFlow$1.label = 5;
                        Object m3568clearDataAndInitiateSessionzO7DZzo = m3568clearDataAndInitiateSessionzO7DZzo(function22, z2, realInitialScreenLoader$startOnboardingFlow$1);
                        if (m3568clearDataAndInitiateSessionzO7DZzo != obj2) {
                            return m3568clearDataAndInitiateSessionzO7DZzo;
                        }
                    } else if (this.onboardingFlowTypePreference.get() != OnboardingFlowType.RETURNING_CUSTOMER || (PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated)) {
                        realInitialScreenLoader$startOnboardingFlow$1.L$0 = function22;
                        realInitialScreenLoader$startOnboardingFlow$1.Z$0 = z2;
                        realInitialScreenLoader$startOnboardingFlow$1.label = 2;
                        obj = this.onboardingIntegrityChecker.onboardingIntegrityChecksInProgress.get(realInitialScreenLoader$startOnboardingFlow$1);
                    } else {
                        if (!isLoginJourneyActive()) {
                            UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, UserJourney$Name.LOGIN);
                        }
                        realInitialScreenLoader$startOnboardingFlow$1.L$0 = null;
                        realInitialScreenLoader$startOnboardingFlow$1.Z$0 = z2;
                        realInitialScreenLoader$startOnboardingFlow$1.label = 1;
                        Object m3570resumeAccountPickerFlowK3MVf5E = m3570resumeAccountPickerFlowK3MVf5E(function22, realInitialScreenLoader$startOnboardingFlow$1);
                        if (m3570resumeAccountPickerFlowK3MVf5E != obj2) {
                            return m3570resumeAccountPickerFlowK3MVf5E;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 5) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z4 = realInitialScreenLoader$startOnboardingFlow$1.Z$0;
                Function2 function23 = realInitialScreenLoader$startOnboardingFlow$1.L$0;
                SafeTrace.throwOnFailure(obj);
                z2 = z4;
                function22 = function23;
                if (((Boolean) obj).booleanValue()) {
                    if (!isLoginJourneyActive()) {
                        UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, UserJourney$Name.LOGIN);
                    }
                    realInitialScreenLoader$startOnboardingFlow$1.L$0 = null;
                    realInitialScreenLoader$startOnboardingFlow$1.Z$0 = z2;
                    realInitialScreenLoader$startOnboardingFlow$1.label = 4;
                    Object m3571resumeClassicOnboardingFlowK3MVf5E = m3571resumeClassicOnboardingFlowK3MVf5E(function22, realInitialScreenLoader$startOnboardingFlow$1);
                    if (m3571resumeClassicOnboardingFlowK3MVf5E != obj2) {
                        return m3571resumeClassicOnboardingFlowK3MVf5E;
                    }
                } else {
                    realInitialScreenLoader$startOnboardingFlow$1.L$0 = null;
                    realInitialScreenLoader$startOnboardingFlow$1.Z$0 = z2;
                    realInitialScreenLoader$startOnboardingFlow$1.label = 3;
                    goToOnboardingEntry(new BlockersScreens.WelcomeScreen(BlockersData.copy$default(BlockersData.DUMMY, BlockersData.Flow.ONBOARDING, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -2, 65535)), OpenTheAppUserJourney.InitialScreen.ONBOARDING_FLOW, false);
                    Object screenLoaded = new ScreenLoaded(z3);
                    if (screenLoaded != obj2) {
                        return screenLoaded;
                    }
                }
                return obj2;
            }
        }
        realInitialScreenLoader$startOnboardingFlow$1 = new RealInitialScreenLoader$startOnboardingFlow$1(this, continuationImpl);
        obj = realInitialScreenLoader$startOnboardingFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$startOnboardingFlow$1.label;
        UserJourneyTracker userJourneyTracker2 = this.journeyTracker;
        boolean z32 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r1 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: switchAccountFlow-K3MVf5E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3573switchAccountFlowK3MVf5E(Function2 function2, ContinuationImpl continuationImpl) {
        RealInitialScreenLoader$switchAccountFlow$1 realInitialScreenLoader$switchAccountFlow$1;
        int i;
        Function2 function22;
        AccountSwitcher$Result accountSwitcher$Result;
        if (continuationImpl instanceof RealInitialScreenLoader$switchAccountFlow$1) {
            realInitialScreenLoader$switchAccountFlow$1 = (RealInitialScreenLoader$switchAccountFlow$1) continuationImpl;
            int i2 = realInitialScreenLoader$switchAccountFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInitialScreenLoader$switchAccountFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInitialScreenLoader$switchAccountFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInitialScreenLoader$switchAccountFlow$1.label;
                AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = this.accountSwitchScreenStateRelay;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation = accountSwitchScreenStateRelay.accountSwitchContinuation;
                    if (accountSwitcher$AccountSwitchContinuation == null) {
                        BlockersData.Flow.INSTANCE.getClass();
                        String generateToken = BlockersData.Flow.Companion.generateToken();
                        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = AccountSwitcher$AccountSwitchInitiationSource.UNKNOWN;
                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                        if (activeAccountTokenOrNull == null) {
                            activeAccountTokenOrNull = "unknown";
                        }
                        accountSwitcher$AccountSwitchContinuation = new AccountSwitcher$AccountSwitchContinuation(generateToken, accountSwitcher$AccountSwitchInitiationSource, activeAccountTokenOrNull, null, -1L, new TargetDestination.ScreenDestination(PaymentScreens$HomeScreens$Home.INSTANCE));
                    }
                    function22 = function2;
                    realInitialScreenLoader$switchAccountFlow$1.L$0 = function22;
                    realInitialScreenLoader$switchAccountFlow$1.label = 1;
                    obj = this.accountSwitcher.finish(accountSwitcher$AccountSwitchContinuation, this.unlockedNavigator, realInitialScreenLoader$switchAccountFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function22 = realInitialScreenLoader$switchAccountFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                accountSwitcher$Result = (AccountSwitcher$Result) obj;
                if (!(accountSwitcher$Result instanceof AccountSwitcher$Result.Success)) {
                    return new ScreenLoaded(z);
                }
                if (!(accountSwitcher$Result instanceof AccountSwitcher$Result.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                accountSwitchScreenStateRelay.accountSwitchContinuation = null;
                realInitialScreenLoader$switchAccountFlow$1.L$0 = null;
                realInitialScreenLoader$switchAccountFlow$1.label = 2;
                Object m3568clearDataAndInitiateSessionzO7DZzo = m3568clearDataAndInitiateSessionzO7DZzo(function22, true, realInitialScreenLoader$switchAccountFlow$1);
                return m3568clearDataAndInitiateSessionzO7DZzo == obj2 ? obj2 : m3568clearDataAndInitiateSessionzO7DZzo;
            }
        }
        realInitialScreenLoader$switchAccountFlow$1 = new RealInitialScreenLoader$switchAccountFlow$1(this, continuationImpl);
        Object obj3 = realInitialScreenLoader$switchAccountFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInitialScreenLoader$switchAccountFlow$1.label;
        AccountSwitchScreenStateRelay accountSwitchScreenStateRelay2 = this.accountSwitchScreenStateRelay;
        boolean z2 = true;
        if (i != 0) {
        }
        accountSwitcher$Result = (AccountSwitcher$Result) obj3;
        if (!(accountSwitcher$Result instanceof AccountSwitcher$Result.Success)) {
        }
    }
}
