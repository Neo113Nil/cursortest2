package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.provider.FontsContractCompat;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.account.AccountSignInReceiveError;
import com.squareup.cash.cdf.account.AccountSignInSwitchAliasEntryType;
import com.squareup.cash.cdf.alias.AliasRegisterComplete;
import com.squareup.cash.cdf.alias.AliasRegisterReceiveError;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractSkipBlocker;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileDiscoverablePasskeysEnabled;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ReturningCustomerPasskeyLoginEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.onboarding.util.AndroidAliasNormalizer;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.passkeys.backend.PasskeyRepository$LoginIdentifier;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyAuthenticationResult;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation;
import com.squareup.cash.registeralias.presenters.real.RealRegisterAliasResultHandler$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SkipBlockerRequest;
import com.squareup.protos.franklin.app.SkipBlockerResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RegisterAliasPresenter implements MoleculePresenter, HasObservability {
    public final RealAliasRegistrar aliasRegistrar;
    public AliasType aliasType;
    public final Analytics analytics;
    public final BlockersScreens.RegisterAliasScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final RealCountryOnboardingConfigRepo countryOnboardingConfigRepo;
    public final ErrorReporter errorReporter;
    public final FlowStarter flowStarter;
    public String flowToken;
    public final AppService franklinAppService;
    public final List helpItems;
    public final RegisterAliasHelper helper;
    public final String initialTitle;
    public final CoroutineContext ioDispatcher;
    public final KeyValue isLanguageDisclosureAcceptancePending;
    public final boolean isOnboarding;
    public final IntentLauncher launcher;
    public final RealLocaleManager localeManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final RealPasskeyFeatureManager passkeyFeatureManager;
    public final RealPasskeyRepository passkeyRepository;
    public final ImageLoader$Builder registerAliasResultHandler;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public CountryOnboardingConfig selectedCountryConfig;
    public final ShippingAddressService service;
    public final SessionManager sessionManager;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;
    public final UserJourneyTracker userJourneyTracker;
    public final String what;

    /* loaded from: classes7.dex */
    public enum ErrorType {
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_ALIAS(AccountSignInReceiveError.ErrorType.INVALID_ALIAS, AliasRegisterReceiveError.ErrorType.INVALID_ALIAS),
        /* JADX INFO: Fake field, exist only in values array */
        TOO_MANY_REQUESTS(AccountSignInReceiveError.ErrorType.TOO_MANY_REQUESTS, AliasRegisterReceiveError.ErrorType.TOO_MANY_REQUESTS),
        /* JADX INFO: Fake field, exist only in values array */
        DUPLICATE_ALIAS(AccountSignInReceiveError.ErrorType.DUPLICATE_ALIAS, AliasRegisterReceiveError.ErrorType.DUPLICATE_ALIAS),
        FAILURE(AccountSignInReceiveError.ErrorType.FAILURE, AliasRegisterReceiveError.ErrorType.FAILURE);

        public final AliasRegisterReceiveError.ErrorType registerType;
        public final AccountSignInReceiveError.ErrorType signInType;

        ErrorType(AccountSignInReceiveError.ErrorType errorType, AliasRegisterReceiveError.ErrorType errorType2) {
            this.signInType = errorType;
            this.registerType = errorType2;
        }

        public final AliasRegisterReceiveError.ErrorType getRegisterType() {
            return this.registerType;
        }

        public final AccountSignInReceiveError.ErrorType getSignInType() {
            return this.signInType;
        }
    }

    /* loaded from: classes5.dex */
    public final class SubmittedAlias {
        public final String alias;
        public final SignalsContext signalsContext;

        public SubmittedAlias(String str, SignalsContext signalsContext) {
            signalsContext.getClass();
            this.alias = str;
            this.signalsContext = signalsContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmittedAlias)) {
                return false;
            }
            SubmittedAlias submittedAlias = (SubmittedAlias) obj;
            return Intrinsics.areEqual(this.alias, submittedAlias.alias) && Intrinsics.areEqual(this.signalsContext, submittedAlias.signalsContext);
        }

        public final int hashCode() {
            String str = this.alias;
            return this.signalsContext.touchEvents.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "SubmittedAlias(alias=" + this.alias + ", signalsContext=" + this.signalsContext + ")";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RegisterAliasPresenter(AndroidStringManager androidStringManager, RealLocaleManager realLocaleManager, KeyValue keyValue, BlockersDataNavigator blockersDataNavigator, RealAliasRegistrar realAliasRegistrar, RealPasskeyRepository realPasskeyRepository, RealPasskeyFeatureManager realPasskeyFeatureManager, Analytics analytics, IntentLauncher intentLauncher, SessionManager sessionManager, ShippingAddressService shippingAddressService, AppService appService, FlowStarter flowStarter, BlockerFlowListener blockerFlowListener, AndroidAliasNormalizer androidAliasNormalizer, RealCountryOnboardingConfigRepo realCountryOnboardingConfigRepo, RegisterAliasHelper registerAliasHelper, SecuritySignalsAggregator securitySignalsAggregator, UserJourneyTracker userJourneyTracker, RealRegisterAliasResultHandler$Factory$Impl realRegisterAliasResultHandler$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, CoroutineContext coroutineContext, Signal signal, ErrorReporter errorReporter, SampleStrategy sampleStrategy, BlockersScreens.RegisterAliasScreen registerAliasScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        String str;
        AliasType aliasType;
        this.stringManager = androidStringManager;
        this.localeManager = realLocaleManager;
        this.isLanguageDisclosureAcceptancePending = keyValue;
        this.blockersNavigator = blockersDataNavigator;
        this.aliasRegistrar = realAliasRegistrar;
        this.passkeyRepository = realPasskeyRepository;
        this.passkeyFeatureManager = realPasskeyFeatureManager;
        this.analytics = analytics;
        this.launcher = intentLauncher;
        this.sessionManager = sessionManager;
        this.service = shippingAddressService;
        this.franklinAppService = appService;
        this.flowStarter = flowStarter;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.countryOnboardingConfigRepo = realCountryOnboardingConfigRepo;
        this.helper = registerAliasHelper;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.userJourneyTracker = userJourneyTracker;
        this.ioDispatcher = coroutineContext;
        this.signOutSignal = signal;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.args = registerAliasScreen;
        this.navigator = screenNavigator;
        this.registerAliasResultHandler = realRegisterAliasResultHandler$Factory$Impl.create$1(screenNavigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        BlockersScreens.RegisterAliasScreen.Mode mode = registerAliasScreen.mode;
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            str = "Sign In";
        } else if (ordinal == 1) {
            str = "Register Email";
        } else if (ordinal == 2) {
            str = "Register Sms";
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            str = "Register Alias";
        }
        this.what = str;
        int ordinal2 = mode.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                aliasType = AliasType.EMAIL;
                this.aliasType = aliasType;
                BlockersData blockersData = registerAliasScreen.blockersData;
                this.flowToken = blockersData.flowToken;
                this.isOnboarding = blockersData.flow == BlockersData.Flow.ONBOARDING;
                this.selectedCountryConfig = realCountryOnboardingConfigRepo.getConfig(blockersData.region);
                this.initialTitle = registerAliasHelper.getTitleText(registerAliasScreen, isSmsOnly(), isSmsPreferredSignIn(), mode);
                this.helpItems = CollectionsKt__CollectionsJVMKt.listOf(new HelpItem(androidStringManager.get(R.string.blockers_register_help_need_help_logging_in), HelpItem.Action.START_CLIENT_SCENARIO, ClientScenario.RECOVER_ACCOUNT.toString(), null, 3962));
            }
            if (ordinal2 != 2 && ordinal2 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        }
        aliasType = AliasType.SMS;
        this.aliasType = aliasType;
        BlockersData blockersData2 = registerAliasScreen.blockersData;
        this.flowToken = blockersData2.flowToken;
        this.isOnboarding = blockersData2.flow == BlockersData.Flow.ONBOARDING;
        this.selectedCountryConfig = realCountryOnboardingConfigRepo.getConfig(blockersData2.region);
        this.initialTitle = registerAliasHelper.getTitleText(registerAliasScreen, isSmsOnly(), isSmsPreferredSignIn(), mode);
        this.helpItems = CollectionsKt__CollectionsJVMKt.listOf(new HelpItem(androidStringManager.get(R.string.blockers_register_help_need_help_logging_in), HelpItem.Action.START_CLIENT_SCENARIO, ClientScenario.RECOVER_ACCOUNT.toString(), null, 3962));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$createShippingAddressWithAlias(RegisterAliasPresenter registerAliasPresenter, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias createShippingAddressWithAlias, Function1 function1, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$createShippingAddressWithAlias$1 registerAliasPresenter$createShippingAddressWithAlias$1;
        int i;
        if (continuationImpl instanceof RegisterAliasPresenter$createShippingAddressWithAlias$1) {
            registerAliasPresenter$createShippingAddressWithAlias$1 = (RegisterAliasPresenter$createShippingAddressWithAlias$1) continuationImpl;
            int i2 = registerAliasPresenter$createShippingAddressWithAlias$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$createShippingAddressWithAlias$1.label = i2 - PKIFailureInfo.systemUnavail;
                RegisterAliasPresenter$createShippingAddressWithAlias$1 registerAliasPresenter$createShippingAddressWithAlias$12 = registerAliasPresenter$createShippingAddressWithAlias$1;
                Object obj = registerAliasPresenter$createShippingAddressWithAlias$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$createShippingAddressWithAlias$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(20));
                    Signal signal = registerAliasPresenter.signOutSignal;
                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(registerAliasPresenter, createShippingAddressWithAlias, deliveryMechanism, str, null, 4);
                    registerAliasPresenter$createShippingAddressWithAlias$12.label = 1;
                    obj = StateFlowKt.until(signal, dataStoreImpl$readDataOrHandleCorruption$3, registerAliasPresenter$createShippingAddressWithAlias$12);
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
                ApiResult apiResult = (ApiResult) obj;
                return apiResult != null ? new ApiResult.Failure.NetworkFailure(new Throwable("Signed out ")) : apiResult;
            }
        }
        registerAliasPresenter$createShippingAddressWithAlias$1 = new RegisterAliasPresenter$createShippingAddressWithAlias$1(registerAliasPresenter, continuationImpl);
        RegisterAliasPresenter$createShippingAddressWithAlias$1 registerAliasPresenter$createShippingAddressWithAlias$122 = registerAliasPresenter$createShippingAddressWithAlias$1;
        Object obj2 = registerAliasPresenter$createShippingAddressWithAlias$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$createShippingAddressWithAlias$122.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        if (apiResult2 != null) {
        }
    }

    public static final void access$handleShippingAddressAliasResult(RegisterAliasPresenter registerAliasPresenter, ApiResult apiResult, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, Function1 function1) {
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            registerAliasPresenter.handleShippingAddressAliasFailure((ApiResult.Failure) apiResult, function1);
            return;
        }
        if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
            registerAliasPresenter.handleShippingAddressAliasFailure((ApiResult.Failure) apiResult, function1);
            return;
        }
        if (!(apiResult instanceof ApiResult.Success)) {
            registerAliasPresenter.getClass();
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BlockersScreens.RegisterAliasScreen registerAliasScreen = registerAliasPresenter.args;
        RedactedString redactedString = new RedactedString(null);
        RedactedString redactedString2 = new RedactedString(null);
        int ordinal = deliveryMechanism.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                redactedString2 = new RedactedString(str);
                RedactedString redactedString3 = redactedString;
                RedactedString redactedString4 = redactedString2;
                registerAliasPresenter.analytics.track(new AliasRegisterComplete(registerAliasPresenter.aliasType, Boolean.FALSE, registerAliasPresenter.flowToken), null);
                registerAliasPresenter.navigator.goTo(registerAliasPresenter.blockersNavigator.getNext(registerAliasScreen, BlockersData.copy$default(registerAliasScreen.blockersData, null, registerAliasPresenter.flowToken, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, redactedString3, redactedString4, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1572867, 65535)));
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        redactedString = new RedactedString(str);
        RedactedString redactedString32 = redactedString;
        RedactedString redactedString42 = redactedString2;
        registerAliasPresenter.analytics.track(new AliasRegisterComplete(registerAliasPresenter.aliasType, Boolean.FALSE, registerAliasPresenter.flowToken), null);
        registerAliasPresenter.navigator.goTo(registerAliasPresenter.blockersNavigator.getNext(registerAliasScreen, BlockersData.copy$default(registerAliasScreen.blockersData, null, registerAliasPresenter.flowToken, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, redactedString32, redactedString42, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1572867, 65535)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$maybeLoginWithDiscoverablePasskey(RegisterAliasPresenter registerAliasPresenter, Function1 function1, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1 registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1;
        int i;
        PasskeyRepository$PasskeyAuthenticationResult passkeyRepository$PasskeyAuthenticationResult;
        FeatureFlagManager featureFlagManager = registerAliasPresenter.passkeyFeatureManager.featureFlagManager;
        if (continuationImpl instanceof RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1) {
            registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1 = (RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1) continuationImpl;
            int i2 = registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ReturningCustomerPasskeyLoginEnabled.INSTANCE)).enabled();
                    if (registerAliasPresenter.isSignIn() && enabled) {
                        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobileDiscoverablePasskeysEnabled.INSTANCE)).enabled()) {
                            ClientScenario clientScenario = registerAliasPresenter.args.blockersData.clientScenario;
                            if (clientScenario == null) {
                                registerAliasPresenter.errorReporter.report(BlockersParsingErrorFactory.INSTANCE.create("BlockersData", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "clientScenario", null), registerAliasPresenter.oneErrorPerAppSessionStrategy);
                            }
                            if (clientScenario != null) {
                                int i3 = 24;
                                function1.invoke(new SvgDecoder$$ExternalSyntheticLambda0(i3));
                                Signal signal = registerAliasPresenter.signOutSignal;
                                PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(registerAliasPresenter, clientScenario, continuation, i3);
                                registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.label = 1;
                                obj = StateFlowKt.until(signal, pagingDataPresenter$collectFrom$2, registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) obj;
                if (passkeyRepository$PasskeyAuthenticationResult instanceof PasskeyRepository$PasskeyAuthenticationResult.Success) {
                    return new AliasRegistrar$Result.Successful(((PasskeyRepository$PasskeyAuthenticationResult.Success) passkeyRepository$PasskeyAuthenticationResult).m3697unboximpl());
                }
                return null;
            }
        }
        registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1 = new RegisterAliasPresenter$maybeLoginWithDiscoverablePasskey$1(registerAliasPresenter, continuationImpl);
        Object obj2 = registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$maybeLoginWithDiscoverablePasskey$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) obj2;
        if (passkeyRepository$PasskeyAuthenticationResult instanceof PasskeyRepository$PasskeyAuthenticationResult.Success) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$maybeLoginWithPasskey(RegisterAliasPresenter registerAliasPresenter, String str, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$maybeLoginWithPasskey$1 registerAliasPresenter$maybeLoginWithPasskey$1;
        int i;
        Object m3693boximpl;
        PasskeyRepository$PasskeyAuthenticationResult passkeyRepository$PasskeyAuthenticationResult;
        if (continuationImpl instanceof RegisterAliasPresenter$maybeLoginWithPasskey$1) {
            registerAliasPresenter$maybeLoginWithPasskey$1 = (RegisterAliasPresenter$maybeLoginWithPasskey$1) continuationImpl;
            int i2 = registerAliasPresenter$maybeLoginWithPasskey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$maybeLoginWithPasskey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = registerAliasPresenter$maybeLoginWithPasskey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$maybeLoginWithPasskey$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) registerAliasPresenter.passkeyFeatureManager.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ReturningCustomerPasskeyLoginEnabled.INSTANCE)).enabled();
                    if (registerAliasPresenter.isSignIn() && enabled) {
                        int ordinal = deliveryMechanism.ordinal();
                        if (ordinal == 0) {
                            PasskeyRepository$LoginIdentifier.SmsNumber.m3694constructorimpl(str);
                            m3693boximpl = PasskeyRepository$LoginIdentifier.SmsNumber.m3693boximpl(str);
                        } else if (ordinal == 1) {
                            PasskeyRepository$LoginIdentifier.Email.m3691constructorimpl(str);
                            m3693boximpl = PasskeyRepository$LoginIdentifier.Email.m3690boximpl(str);
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Object obj2 = m3693boximpl;
                        ClientScenario clientScenario = registerAliasPresenter.args.blockersData.clientScenario;
                        if (clientScenario == null) {
                            registerAliasPresenter.errorReporter.report(BlockersParsingErrorFactory.INSTANCE.create("BlockersData", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "clientScenario", null), registerAliasPresenter.oneErrorPerAppSessionStrategy);
                        }
                        if (clientScenario != null) {
                            Signal signal = registerAliasPresenter.signOutSignal;
                            SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(registerAliasPresenter, obj2, clientScenario, continuation, 10);
                            registerAliasPresenter$maybeLoginWithPasskey$1.label = 1;
                            obj = StateFlowKt.until(signal, sessionWorker$doWork$2$2, registerAliasPresenter$maybeLoginWithPasskey$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) obj;
                if (passkeyRepository$PasskeyAuthenticationResult instanceof PasskeyRepository$PasskeyAuthenticationResult.Success) {
                    return new AliasRegistrar$Result.Successful(((PasskeyRepository$PasskeyAuthenticationResult.Success) passkeyRepository$PasskeyAuthenticationResult).m3697unboximpl());
                }
                return null;
            }
        }
        registerAliasPresenter$maybeLoginWithPasskey$1 = new RegisterAliasPresenter$maybeLoginWithPasskey$1(registerAliasPresenter, continuationImpl);
        Object obj3 = registerAliasPresenter$maybeLoginWithPasskey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$maybeLoginWithPasskey$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) obj3;
        if (passkeyRepository$PasskeyAuthenticationResult instanceof PasskeyRepository$PasskeyAuthenticationResult.Success) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r7, r0, r8) == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r7, r0, r8) == r9) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$register(RegisterAliasPresenter registerAliasPresenter, String str, SignalsContext signalsContext, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, Function1 function1, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$register$1 registerAliasPresenter$register$1;
        int i;
        String str2;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism2;
        String str3;
        Function1 function12;
        ClientScenario clientScenario;
        AliasRegistrar$Result aliasRegistrar$Result;
        CoroutineContext coroutineContext = registerAliasPresenter.ioDispatcher;
        BlockersScreens.RegisterAliasScreen registerAliasScreen = registerAliasPresenter.args;
        BlockersData blockersData = registerAliasScreen.blockersData;
        if (continuationImpl instanceof RegisterAliasPresenter$register$1) {
            registerAliasPresenter$register$1 = (RegisterAliasPresenter$register$1) continuationImpl;
            int i2 = registerAliasPresenter$register$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$register$1.label = i2 - PKIFailureInfo.systemUnavail;
                RegisterAliasPresenter$register$1 registerAliasPresenter$register$12 = registerAliasPresenter$register$1;
                Object obj = registerAliasPresenter$register$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$register$12.label;
                if (i == 0) {
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
                    Function1 function13 = registerAliasPresenter$register$12.L$4;
                    deliveryMechanism2 = registerAliasPresenter$register$12.L$3;
                    String str4 = registerAliasPresenter$register$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function12 = function13;
                    str3 = str4;
                    aliasRegistrar$Result = (AliasRegistrar$Result) obj;
                    if (aliasRegistrar$Result != null) {
                        registerAliasPresenter.processResult(aliasRegistrar$Result, str3, deliveryMechanism2, registerAliasPresenter.flowToken, function12);
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                if ((PlatformKt.getCurrentSessionState(registerAliasPresenter.sessionManager) instanceof SessionState.Authenticated) || (clientScenario = blockersData.clientScenario) == ClientScenario.RECOVER_ACCOUNT || clientScenario == ClientScenario.RECOVER_ALIAS_ACCOUNT) {
                    str2 = blockersData.flowToken;
                } else {
                    BlockersData.Flow.INSTANCE.getClass();
                    str2 = BlockersData.Flow.Companion.generateToken();
                }
                registerAliasPresenter.flowToken = str2;
                BlockersScreens.RegisterAliasScreen.RegisterAliasType registerAliasType = registerAliasScreen.registerAliasType;
                if (Intrinsics.areEqual(registerAliasType, BlockersScreens.RegisterAliasScreen.RegisterAliasType.RegisterAliasOnly.INSTANCE)) {
                    Signal signal = registerAliasPresenter.signOutSignal;
                    RegisterAliasPresenter$register$result$1 registerAliasPresenter$register$result$1 = new RegisterAliasPresenter$register$result$1(function1, registerAliasPresenter, str, deliveryMechanism, signalsContext, (Continuation) null, 0);
                    registerAliasPresenter$register$12.L$0 = str;
                    registerAliasPresenter$register$12.L$3 = deliveryMechanism;
                    registerAliasPresenter$register$12.L$4 = function1;
                    registerAliasPresenter$register$12.label = 1;
                    obj = StateFlowKt.until(signal, registerAliasPresenter$register$result$1, registerAliasPresenter$register$12);
                    if (obj != coroutineSingletons) {
                        deliveryMechanism2 = deliveryMechanism;
                        str3 = str;
                        function12 = function1;
                        aliasRegistrar$Result = (AliasRegistrar$Result) obj;
                        if (aliasRegistrar$Result != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else if (registerAliasType instanceof BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias) {
                    RegisterAliasPresenter$register$2 registerAliasPresenter$register$2 = new RegisterAliasPresenter$register$2(registerAliasPresenter, deliveryMechanism, str, function1, null, 0);
                    registerAliasPresenter$register$12.L$0 = null;
                    registerAliasPresenter$register$12.L$3 = null;
                    registerAliasPresenter$register$12.L$4 = null;
                    registerAliasPresenter$register$12.label = 2;
                } else {
                    if (!(registerAliasType instanceof BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RegisterAliasPresenter$register$2 registerAliasPresenter$register$22 = new RegisterAliasPresenter$register$2(registerAliasPresenter, deliveryMechanism, str, function1, null, 1);
                    registerAliasPresenter$register$12.L$0 = null;
                    registerAliasPresenter$register$12.L$3 = null;
                    registerAliasPresenter$register$12.L$4 = null;
                    registerAliasPresenter$register$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        registerAliasPresenter$register$1 = new RegisterAliasPresenter$register$1(registerAliasPresenter, continuationImpl);
        RegisterAliasPresenter$register$1 registerAliasPresenter$register$122 = registerAliasPresenter$register$1;
        Object obj2 = registerAliasPresenter$register$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$register$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$updateShippingAddressAlias(RegisterAliasPresenter registerAliasPresenter, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias setShippingAddressAlias, Function1 function1, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$updateShippingAddressAlias$1 registerAliasPresenter$updateShippingAddressAlias$1;
        int i;
        if (continuationImpl instanceof RegisterAliasPresenter$updateShippingAddressAlias$1) {
            registerAliasPresenter$updateShippingAddressAlias$1 = (RegisterAliasPresenter$updateShippingAddressAlias$1) continuationImpl;
            int i2 = registerAliasPresenter$updateShippingAddressAlias$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$updateShippingAddressAlias$1.label = i2 - PKIFailureInfo.systemUnavail;
                RegisterAliasPresenter$updateShippingAddressAlias$1 registerAliasPresenter$updateShippingAddressAlias$12 = registerAliasPresenter$updateShippingAddressAlias$1;
                Object obj = registerAliasPresenter$updateShippingAddressAlias$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$updateShippingAddressAlias$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(18));
                    Signal signal = registerAliasPresenter.signOutSignal;
                    RegisterAliasPresenter$updateShippingAddressAlias$3 registerAliasPresenter$updateShippingAddressAlias$3 = new RegisterAliasPresenter$updateShippingAddressAlias$3(registerAliasPresenter, setShippingAddressAlias, deliveryMechanism, str, null, 0);
                    registerAliasPresenter$updateShippingAddressAlias$12.label = 1;
                    obj = StateFlowKt.until(signal, registerAliasPresenter$updateShippingAddressAlias$3, registerAliasPresenter$updateShippingAddressAlias$12);
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
                ApiResult apiResult = (ApiResult) obj;
                return apiResult != null ? new ApiResult.Failure.NetworkFailure(new Throwable("Signed out ")) : apiResult;
            }
        }
        registerAliasPresenter$updateShippingAddressAlias$1 = new RegisterAliasPresenter$updateShippingAddressAlias$1(registerAliasPresenter, continuationImpl);
        RegisterAliasPresenter$updateShippingAddressAlias$1 registerAliasPresenter$updateShippingAddressAlias$122 = registerAliasPresenter$updateShippingAddressAlias$1;
        Object obj2 = registerAliasPresenter$updateShippingAddressAlias$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$updateShippingAddressAlias$122.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        if (apiResult2 != null) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final void handleShippingAddressAliasFailure(ApiResult.Failure failure, Function1 function1) {
        ErrorMessaging errorMessaging;
        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to ", this.what, "."), new Object[0]);
        ErrorType errorType = ErrorType.FAILURE;
        this.analytics.track(isSignIn() ? new AccountSignInReceiveError(this.aliasType, errorType.getSignInType(), this.flowToken) : new AliasRegisterReceiveError(this.aliasType, errorType.getRegisterType(), this.flowToken), null);
        function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(21));
        BlockersData blockersData = this.args.blockersData;
        errorMessaging = TextUtilsCompat.errorMessaging(this.stringManager, failure, null);
        this.navigator.goTo(new FailureMessageBlockerScreen(blockersData, errorMessaging.getMessage(), null, 4));
    }

    public final boolean isSignIn() {
        return this.args.mode == BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN;
    }

    public final boolean isSmsOnly() {
        return this.selectedCountryConfig.getAliasRequirement() == CountryOnboardingConfig.AliasRequirement.SMS_ONLY;
    }

    public final boolean isSmsPreferredSignIn() {
        return isSmsOnly() || this.selectedCountryConfig.getAliasRequirement() == CountryOnboardingConfig.AliasRequirement.SMS_ENCOURAGED;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Function1 function1;
        MutableState mutableState;
        RegisterAliasPresenter registerAliasPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1296319967);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(this.helper.buildInitialViewModel(this.args));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new BasicTextKt$$ExternalSyntheticLambda1(3, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this, function12, mutableState2, continuation, 22);
            function1 = function12;
            mutableState = mutableState2;
            registerAliasPresenter = this;
            gapComposer.updateRememberedValue(dataStoreImpl$data$1);
            rememberedValue4 = dataStoreImpl$data$1;
        } else {
            function1 = function12;
            mutableState = mutableState2;
            registerAliasPresenter = this;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        Versioned versioned = (Versioned) mutableState3.getValue();
        if (versioned != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, versioned, new AndroidSecureStore$read$2(versioned, (Continuation) null, registerAliasPresenter, function1, mutableState, 27));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        MutableState mutableState4 = mutableState;
        Updater.LaunchedEffect(gapComposer, flow, new MutatorMutex$mutate$2(flow, (Continuation) null, registerAliasPresenter, function1, mutableState3, mutableState4));
        RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) mutableState4.getValue();
        gapComposer.end(false);
        return registerAliasViewModel;
    }

    public final void processResult(AliasRegistrar$Result aliasRegistrar$Result, String str, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str2, Function1 function1) {
        FontsContractCompat handleRegisterAliasResult = this.registerAliasResultHandler.handleRegisterAliasResult(aliasRegistrar$Result, str, str2, isSignIn(), deliveryMechanism, this.args, this.what);
        if (handleRegisterAliasResult instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) {
            function1.invoke(new BadgeQueries$$ExternalSyntheticLambda5((RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) handleRegisterAliasResult, 22));
            return;
        }
        if (handleRegisterAliasResult.equals(RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled.INSTANCE)) {
            return;
        }
        if (!(handleRegisterAliasResult instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation = (RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation) handleRegisterAliasResult;
        if (registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.getStopLoadingFirst()) {
            function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(19));
        }
        this.navigator.goTo(registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.getNextScreen());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object skip(Function1 function1, ContinuationImpl continuationImpl) {
        RegisterAliasPresenter$skip$1 registerAliasPresenter$skip$1;
        int i;
        List<BlockerDescriptor> list;
        BlockerDescriptor blockerDescriptor;
        boolean z;
        ErrorMessaging errorMessaging;
        ErrorMessaging errorMessaging2;
        BlockersScreens.RegisterAliasScreen registerAliasScreen = this.args;
        BlockersData blockersData = registerAliasScreen.blockersData;
        if (continuationImpl instanceof RegisterAliasPresenter$skip$1) {
            registerAliasPresenter$skip$1 = (RegisterAliasPresenter$skip$1) continuationImpl;
            int i2 = registerAliasPresenter$skip$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                registerAliasPresenter$skip$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = registerAliasPresenter$skip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerAliasPresenter$skip$1.label;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(22));
                    String str2 = blockersData.requestContext.blocker_descriptor_id;
                    String nextBlockerType = Intrinsics.areEqual(blockersData.getNextBlockerId(), str2) ? blockersData.getNextBlockerType() : null;
                    String str3 = this.flowToken;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    String analyticsName = clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, blockersData.flowType) : null;
                    Flow$Type flow$Type = blockersData.flowType;
                    this.analytics.track(new BlockerFlowInteractSkipBlocker(str2, nextBlockerType, analyticsName, flow$Type != null ? flow$Type.name() : null, str3), null);
                    ClientScenario clientScenario2 = blockersData.clientScenario;
                    if (clientScenario2 == null) {
                        clientScenario2 = ClientScenario.ONBOARDING;
                    }
                    String str4 = this.flowToken;
                    ScenarioPlan scenarioPlan = blockersData.scenarioPlan;
                    SkipBlockerRequest skipBlockerRequest = new SkipBlockerRequest((RequestContext) (objArr == true ? 1 : 0), (scenarioPlan == null || (list = scenarioPlan.blocker_descriptors) == null || (blockerDescriptor = (BlockerDescriptor) CollectionsKt.first((List) list)) == null) ? null : blockerDescriptor.blocker, 5);
                    registerAliasPresenter$skip$1.L$0 = function1;
                    registerAliasPresenter$skip$1.label = 1;
                    obj = this.franklinAppService.skipBlocker(clientScenario2, str4, skipBlockerRequest, registerAliasPresenter$skip$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = registerAliasPresenter$skip$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                int i3 = 4;
                AndroidStringManager androidStringManager = this.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (!z) {
                    ResponseContext responseContext = ((SkipBlockerResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if (responseContext == null) {
                        ProtoParsingError create = BlockersParsingErrorFactory.INSTANCE.create("SkipBlockerResponse", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "response_context", null);
                        this.errorReporter.report(create, this.oneErrorPerAppSessionStrategy);
                        function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(23));
                        errorMessaging2 = TextUtilsCompat.errorMessaging(androidStringManager, new ApiResult.Failure.NetworkFailure(create), null);
                        screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, errorMessaging2.getMessage(), str, i3));
                        return Unit.INSTANCE;
                    }
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(this.blockersNavigator.getNext(registerAliasScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else if (apiResult instanceof ApiResult.Failure) {
                    function1.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(24));
                    errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, errorMessaging.getMessage(), objArr2 == true ? 1 : 0, i3));
                }
                return Unit.INSTANCE;
            }
        }
        registerAliasPresenter$skip$1 = new RegisterAliasPresenter$skip$1(this, continuationImpl);
        Object obj2 = registerAliasPresenter$skip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerAliasPresenter$skip$1.label;
        String str5 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        int i32 = 4;
        AndroidStringManager androidStringManager2 = this.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (!z) {
        }
        return Unit.INSTANCE;
    }

    public final void switchToEmailMode(Function1 function1) {
        this.aliasType = AliasType.EMAIL;
        if (isSignIn()) {
            this.analytics.track(new AccountSignInSwitchAliasEntryType(this.aliasType, this.flowToken), null);
        }
        function1.invoke(new RegisterAliasPresenter$$ExternalSyntheticLambda1(this, 0));
    }

    public final void switchToSmsMode(Function1 function1) {
        this.aliasType = AliasType.SMS;
        if (isSignIn()) {
            this.analytics.track(new AccountSignInSwitchAliasEntryType(this.aliasType, this.flowToken), null);
        }
        function1.invoke(new RegisterAliasPresenter$$ExternalSyntheticLambda1(this, 1));
    }
}
