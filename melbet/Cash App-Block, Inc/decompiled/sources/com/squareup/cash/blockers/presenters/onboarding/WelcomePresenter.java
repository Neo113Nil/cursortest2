package com.squareup.cash.blockers.presenters.onboarding;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchType;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.WelcomeViewModel;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.cdf.endofonboarding.EndOfOnboardingCheckLockedRegion;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.initialscreenloader.backend.ColdStartIntegrityChecker$ColdStartIntegrityCheckResult;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.screens.MarketCapabilitiesErrorScreen;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.onboarding.backend.OnboardingIntegrityChecker$OnboardingIntegrityCheckResult;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileUnavailableScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Toaster$Length;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class WelcomePresenter implements MoleculePresenter {
    public final RealAccountSwitchAnalytics accountSwitchAnalytics;
    public final AccountSwitcher$AccountSwitchingMetadata accountSwitchMetadata;
    public final AccountSwitchScreenStateRelay accountSwitchScreenStateRelay;
    public final AcceptableScrim activityScrim;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final RealAppLockState appLockState;
    public final BlockersScreens.WelcomeScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final RealColdStartIntegrityChecker coldStartIntegrityChecker;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioContext;
    public final UserJourneyTracker journeyTracker;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOnboardingIntegrityChecker onboardingIntegrityChecker;
    public final KeyValue principalAccountToken;
    public final RealProfileManager profileManager;
    public final RealProfileSyncSetupTeardown profileSyncWorker;
    public final TimeToLiveSyncState referralSyncState;
    public final RealRouter router;
    public final RealSessionFlags sessionFlags;
    public final SessionManager sessionManager;
    public final Lazy simplifiedIntegrityChecksEnabled$delegate;
    public final AndroidStringManager stringManager;
    public final AndroidToaster toaster;

    public interface IntegrityCheckResult {

        public final class FromColdStartChecker implements IntegrityCheckResult {
            public final ColdStartIntegrityChecker$ColdStartIntegrityCheckResult result;

            public FromColdStartChecker(ColdStartIntegrityChecker$ColdStartIntegrityCheckResult coldStartIntegrityChecker$ColdStartIntegrityCheckResult) {
                coldStartIntegrityChecker$ColdStartIntegrityCheckResult.getClass();
                this.result = coldStartIntegrityChecker$ColdStartIntegrityCheckResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromColdStartChecker) && Intrinsics.areEqual(this.result, ((FromColdStartChecker) obj).result);
            }

            @Override // com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.IntegrityCheckResult
            public final IntegrityCheckFactory$Type getFirstFailureType() {
                ColdStartIntegrityChecker$ColdStartIntegrityCheckResult coldStartIntegrityChecker$ColdStartIntegrityCheckResult = this.result;
                coldStartIntegrityChecker$ColdStartIntegrityCheckResult.getClass();
                return ((ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Failure) coldStartIntegrityChecker$ColdStartIntegrityCheckResult).mandatoryCheckFailure.integrityCheck.getType();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            @Override // com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.IntegrityCheckResult
            public final boolean isSuccess() {
                return this.result instanceof ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success;
            }

            public final String toString() {
                return "FromColdStartChecker(result=" + this.result + ")";
            }
        }

        public final class FromOnboardingChecker implements IntegrityCheckResult {
            public final OnboardingIntegrityChecker$OnboardingIntegrityCheckResult result;

            public FromOnboardingChecker(OnboardingIntegrityChecker$OnboardingIntegrityCheckResult onboardingIntegrityChecker$OnboardingIntegrityCheckResult) {
                onboardingIntegrityChecker$OnboardingIntegrityCheckResult.getClass();
                this.result = onboardingIntegrityChecker$OnboardingIntegrityCheckResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromOnboardingChecker) && Intrinsics.areEqual(this.result, ((FromOnboardingChecker) obj).result);
            }

            @Override // com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.IntegrityCheckResult
            public final IntegrityCheckFactory$Type getFirstFailureType() {
                OnboardingIntegrityChecker$OnboardingIntegrityCheckResult onboardingIntegrityChecker$OnboardingIntegrityCheckResult = this.result;
                onboardingIntegrityChecker$OnboardingIntegrityCheckResult.getClass();
                return ((OnboardingIntegrityChecker$OnboardingIntegrityCheckResult.Failure) onboardingIntegrityChecker$OnboardingIntegrityCheckResult).firstFailureType;
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            @Override // com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.IntegrityCheckResult
            public final boolean isSuccess() {
                return this.result instanceof OnboardingIntegrityChecker$OnboardingIntegrityCheckResult.Success;
            }

            public final String toString() {
                return "FromOnboardingChecker(result=" + this.result + ")";
            }
        }

        IntegrityCheckFactory$Type getFirstFailureType();

        boolean isSuccess();
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSwitcher$AccountSwitchType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = AccountSwitcher$AccountSwitchType.TO_MANAGED_ACCOUNT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IntegrityCheckFactory$Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IntegrityCheckFactory$Type integrityCheckFactory$Type = IntegrityCheckFactory$Type.PROFILE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public WelcomePresenter(BlockersDataNavigator blockersDataNavigator, AppConfigManager appConfigManager, RealProfileSyncSetupTeardown realProfileSyncSetupTeardown, RealOnboardingIntegrityChecker realOnboardingIntegrityChecker, RealColdStartIntegrityChecker realColdStartIntegrityChecker, AcceptableScrim acceptableScrim, RealAppLockState realAppLockState, CoroutineContext coroutineContext, RealSessionFlags realSessionFlags, SessionManager sessionManager, Analytics analytics, RealAccountSwitchAnalytics realAccountSwitchAnalytics, RealRouter$Factory$Impl realRouter$Factory$Impl, RealMoneyNavigatorHelper realMoneyNavigatorHelper, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, AndroidToaster androidToaster, RealProfileManager realProfileManager, KeyValue keyValue, UserJourneyTracker userJourneyTracker, AccountSwitchScreenStateRelay accountSwitchScreenStateRelay, TimeToLiveSyncState timeToLiveSyncState, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.WelcomeScreen welcomeScreen) {
        this.blockersNavigator = blockersDataNavigator;
        this.appConfig = appConfigManager;
        this.profileSyncWorker = realProfileSyncSetupTeardown;
        this.onboardingIntegrityChecker = realOnboardingIntegrityChecker;
        this.coldStartIntegrityChecker = realColdStartIntegrityChecker;
        this.activityScrim = acceptableScrim;
        this.appLockState = realAppLockState;
        this.ioContext = coroutineContext;
        this.sessionFlags = realSessionFlags;
        this.sessionManager = sessionManager;
        this.analytics = analytics;
        this.accountSwitchAnalytics = realAccountSwitchAnalytics;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.toaster = androidToaster;
        this.profileManager = realProfileManager;
        this.principalAccountToken = keyValue;
        this.journeyTracker = userJourneyTracker;
        this.accountSwitchScreenStateRelay = accountSwitchScreenStateRelay;
        this.referralSyncState = timeToLiveSyncState;
        this.navigator = screenNavigator;
        this.args = welcomeScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = accountSwitchScreenStateRelay.accountSwitchingMetadata;
        accountSwitchScreenStateRelay.accountSwitchingMetadata = null;
        this.accountSwitchMetadata = accountSwitcher$AccountSwitchingMetadata;
        this.simplifiedIntegrityChecksEnabled$delegate = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (r1 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0067, code lost:
    
        if (r59.completeOnboardingTasks(r5) == r6) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleIntegrityCheckResult(WelcomePresenter welcomePresenter, IntegrityCheckResult integrityCheckResult, ContinuationImpl continuationImpl) {
        WelcomePresenter$handleIntegrityCheckResult$1 welcomePresenter$handleIntegrityCheckResult$1;
        int i;
        Object obj;
        IntegrityCheckResult integrityCheckResult2;
        Object obj2;
        Redacted redacted;
        String str;
        AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource;
        int ordinal;
        Screen screen;
        AcceptableScrim acceptableScrim = welcomePresenter.activityScrim;
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = welcomePresenter.accountSwitchMetadata;
        BetterNavigator.ScreenNavigator screenNavigator = welcomePresenter.navigator;
        if (continuationImpl instanceof WelcomePresenter$handleIntegrityCheckResult$1) {
            welcomePresenter$handleIntegrityCheckResult$1 = (WelcomePresenter$handleIntegrityCheckResult$1) continuationImpl;
            int i2 = welcomePresenter$handleIntegrityCheckResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                welcomePresenter$handleIntegrityCheckResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = welcomePresenter$handleIntegrityCheckResult$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = welcomePresenter$handleIntegrityCheckResult$1.label;
                int i3 = 11;
                int i4 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    boolean isSuccess = integrityCheckResult.isSuccess();
                    UserJourneyTracker userJourneyTracker = welcomePresenter.journeyTracker;
                    if (isSuccess) {
                        ((RealUserJourneyTracker) userJourneyTracker).endJourney(UserJourney$Name.LOGIN, UserJourney$Outcome.Succeeded.INSTANCE);
                        welcomePresenter$handleIntegrityCheckResult$1.L$0 = null;
                        welcomePresenter$handleIntegrityCheckResult$1.label = 1;
                    } else {
                        ((RealUserJourneyTracker) userJourneyTracker).endJourney(UserJourney$Name.LOGIN, UserJourney$Outcome.Failed.INSTANCE);
                        welcomePresenter$handleIntegrityCheckResult$1.L$0 = integrityCheckResult;
                        welcomePresenter$handleIntegrityCheckResult$1.label = 3;
                        if (welcomePresenter.managedAccountFlipDirection() != null) {
                            obj = acceptableScrim.interact(new DataStoreImpl$data$1.AnonymousClass2(i4, continuation, i3), welcomePresenter$handleIntegrityCheckResult$1);
                            if (obj != obj4) {
                                obj = Unit.INSTANCE;
                            }
                        } else {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != obj4) {
                            integrityCheckResult2 = integrityCheckResult;
                            IntegrityCheckFactory$Type firstFailureType = integrityCheckResult2.getFirstFailureType();
                            ordinal = firstFailureType.ordinal();
                            if (ordinal != 0) {
                            }
                            screenNavigator.goTo(screen);
                        }
                    }
                    return obj4;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj3);
                    welcomePresenter$handleIntegrityCheckResult$1.L$0 = null;
                    welcomePresenter$handleIntegrityCheckResult$1.label = 2;
                    if (welcomePresenter.managedAccountFlipDirection() != null) {
                        obj2 = acceptableScrim.interact(new DataStoreImpl$data$1.AnonymousClass2(i4, continuation, i3), welcomePresenter$handleIntegrityCheckResult$1);
                        if (obj2 != obj4) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                } else if (i == 2) {
                    SafeTrace.throwOnFailure(obj3);
                    BlockersScreens.WelcomeScreen welcomeScreen = welcomePresenter.args;
                    AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = welcomePresenter.accountSwitchScreenStateRelay;
                    AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation = accountSwitchScreenStateRelay.accountSwitchContinuation;
                    accountSwitchScreenStateRelay.accountSwitchContinuation = null;
                    TargetDestination targetDestination = accountSwitcher$AccountSwitchContinuation != null ? accountSwitcher$AccountSwitchContinuation.destination : null;
                    if (targetDestination instanceof TargetDestination.RouteDestination) {
                        TargetDestination.RouteDestination routeDestination = (TargetDestination.RouteDestination) targetDestination;
                        welcomePresenter.router.route(RoutingParams.copy$default(routeDestination.routingParams, null, (accountSwitcher$AccountSwitchingMetadata == null || (switchSource = accountSwitcher$AccountSwitchingMetadata.source) == null) ? null : switchSource.name(), null, 507), routeDestination.routeUrl);
                    } else if (targetDestination instanceof TargetDestination.ScreenDestination) {
                        screenNavigator.goTo(((TargetDestination.ScreenDestination) targetDestination).screen);
                    } else {
                        Screen screen2 = welcomeScreen.blockersData.exitScreen;
                        screen2.getClass();
                        boolean z = screen2 instanceof MoneyTabScreen;
                        BlockersData blockersData = welcomeScreen.blockersData;
                        if (!z) {
                            blockersData = BlockersData.copy$default(blockersData, null, null, null, null, null, null, PaymentScreens$HomeScreens$Home.INSTANCE, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535);
                        }
                        screenNavigator.goTo(welcomePresenter.blockersNavigator.getNext(welcomeScreen, blockersData));
                    }
                    if (accountSwitcher$AccountSwitchingMetadata != null && (redacted = accountSwitcher$AccountSwitchingMetadata.targetAccountCashtag) != null && (str = (String) redacted.getValue()) != null) {
                        AndroidToaster androidToaster = welcomePresenter.toaster;
                        AndroidStringManager androidStringManager = welcomePresenter.stringManager;
                        ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "cashtag", str);
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.toast_text_signed_in)).format(m);
                        format2.getClass();
                        androidToaster.makeToast(format2, Toaster$Length.LONG);
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    integrityCheckResult2 = welcomePresenter$handleIntegrityCheckResult$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    IntegrityCheckFactory$Type firstFailureType2 = integrityCheckResult2.getFirstFailureType();
                    ordinal = firstFailureType2.ordinal();
                    if (ordinal != 0) {
                        screen = ProfileUnavailableScreen.INSTANCE;
                    } else {
                        if (ordinal != 1) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(firstFailureType2, "Missing error handling for ");
                            return null;
                        }
                        screen = MarketCapabilitiesErrorScreen.INSTANCE;
                    }
                    screenNavigator.goTo(screen);
                }
                return Unit.INSTANCE;
            }
        }
        welcomePresenter$handleIntegrityCheckResult$1 = new WelcomePresenter$handleIntegrityCheckResult$1(welcomePresenter, continuationImpl);
        Object obj32 = welcomePresenter$handleIntegrityCheckResult$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = welcomePresenter$handleIntegrityCheckResult$1.label;
        int i32 = 11;
        int i42 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
    
        if (r7.principalAccountToken.set(com.squareup.cash.account.types.PrincipalAccountToken.None.INSTANCE, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeOnboardingTasks(ContinuationImpl continuationImpl) {
        WelcomePresenter$completeOnboardingTasks$1 welcomePresenter$completeOnboardingTasks$1;
        int i;
        RealSessionFlags realSessionFlags;
        Object obj;
        if (continuationImpl instanceof WelcomePresenter$completeOnboardingTasks$1) {
            welcomePresenter$completeOnboardingTasks$1 = (WelcomePresenter$completeOnboardingTasks$1) continuationImpl;
            int i2 = welcomePresenter$completeOnboardingTasks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                welcomePresenter$completeOnboardingTasks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = welcomePresenter$completeOnboardingTasks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = welcomePresenter$completeOnboardingTasks$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (this.accountSwitchMetadata == null) {
                        welcomePresenter$completeOnboardingTasks$1.label = 1;
                    }
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                        Profile profile = (Profile) obj2;
                        if (profile != null) {
                            Region region = profile.region;
                            this.analytics.track(new EndOfOnboardingCheckLockedRegion(region != null ? region.toString() : null), null);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    this.appLockState.sendEvent(RealAppLockState.AppLockEvent.AppUnlocked.INSTANCE);
                    welcomePresenter$completeOnboardingTasks$1.label = 3;
                    RealProfileManager realProfileManager = this.profileManager;
                    obj2 = JobKt.withContext(realProfileManager.ioDispatcher, new RealProfileManager$profileOrNull$2(realProfileManager, continuation, 0), welcomePresenter$completeOnboardingTasks$1);
                }
                realSessionFlags = this.sessionFlags;
                if (!realSessionFlags.onboarded) {
                    realSessionFlags.onboarded = true;
                    StateFlowImpl stateFlowImpl = realSessionFlags.showModernTabs;
                    Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realSessionFlags.liquidGlassKeyValue.blockingGetFlagOption()).enabled());
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                }
                welcomePresenter$completeOnboardingTasks$1.label = 2;
                if (this.args.blockersData.flow == BlockersData.Flow.ONBOARDING) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                if (((Boolean) this.simplifiedIntegrityChecksEnabled$delegate.getValue()).booleanValue()) {
                    obj = Unit.INSTANCE;
                } else {
                    obj = this.sessionManager.updateOnboardedState(true, welcomePresenter$completeOnboardingTasks$1);
                    if (obj != coroutineSingletons) {
                        obj = Unit.INSTANCE;
                    }
                }
            }
        }
        welcomePresenter$completeOnboardingTasks$1 = new WelcomePresenter$completeOnboardingTasks$1(this, continuationImpl);
        Object obj22 = welcomePresenter$completeOnboardingTasks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = welcomePresenter$completeOnboardingTasks$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        realSessionFlags = this.sessionFlags;
        if (!realSessionFlags.onboarded) {
        }
        welcomePresenter$completeOnboardingTasks$1.label = 2;
        if (this.args.blockersData.flow == BlockersData.Flow.ONBOARDING) {
        }
    }

    public final ManagedAccountFlipDirection managedAccountFlipDirection() {
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = this.accountSwitchMetadata;
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = accountSwitcher$AccountSwitchingMetadata != null ? accountSwitcher$AccountSwitchingMetadata.switchType : null;
        int i = accountSwitcher$AccountSwitchType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accountSwitcher$AccountSwitchType.ordinal()];
        if (i == 1) {
            return ManagedAccountFlipDirection.TO_KID;
        }
        if (i != 2) {
            return null;
        }
        return ManagedAccountFlipDirection.TO_SPONSOR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        Object standard;
        Redacted redacted;
        String str2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2127075553);
        Object[] objArr = 0;
        Updater.LaunchedEffect(gapComposer, flow, new FileBlockerView$6$2$2(flow, (Continuation) (0 == true ? 1 : 0), (Object) this, 15));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new WelcomePresenter$models$2$1(this, objArr == true ? 1 : 0, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        ManagedAccountFlipDirection managedAccountFlipDirection = managedAccountFlipDirection();
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = this.accountSwitchMetadata;
        String str3 = accountSwitcher$AccountSwitchingMetadata != null ? accountSwitcher$AccountSwitchingMetadata.managedAccountWelcomeMessage : null;
        if (str3 == null || managedAccountFlipDirection == null) {
            AndroidStringManager androidStringManager = this.stringManager;
            if (accountSwitcher$AccountSwitchingMetadata == null || (redacted = accountSwitcher$AccountSwitchingMetadata.targetAccountCashtag) == null || (str2 = (String) redacted.getValue()) == null) {
                str = androidStringManager.get(R.string.blockers_welcome_title);
            } else {
                ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "cashtag", str2);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.blockers_welcome_title_cashtag)).format(m);
                str.getClass();
            }
            standard = new WelcomeViewModel.Standard(str);
        } else {
            standard = new WelcomeViewModel.ManagedAccount(str3, managedAccountFlipDirection);
        }
        gapComposer.end(false);
        return standard;
    }
}
