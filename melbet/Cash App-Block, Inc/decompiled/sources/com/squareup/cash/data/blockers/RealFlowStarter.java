package com.squareup.cash.data.blockers;

import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.LinkingFlowsData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.navigation.InstitutionLinkingNavigator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountFlowParameters;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountPlaidFlowParameters;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountSubflow;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.cashidv.flows.PersonalInformationRefreshFlowParameters;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountFlowParams;
import com.squareup.protos.cash.kycrefresh.common.RefreshType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.CloseMoneyPoolFlowParameters;
import com.squareup.protos.cash.pools.LeaveMoneyPoolFlowParameters;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import com.squareup.protos.cash.requirements.SetLinkCardRequirementData;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealFlowStarter implements FlowStarter, IoSetupTeardown {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public BlockersConfig blockersConfig;
    public final BlockersDataNavigator blockersDataNavigator;
    public final BlockerFlowListener blockersFlowAnalytics;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public InstrumentLinkingConfig instrumentLinkingConfig;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;
    public final StringPreference pendingEmailPreference;
    public final RealRegionProvider regionProvider;
    public final SessionManager sessionManager;
    public final JobImpl instrumentLinkingConfigReady = JobKt.Job$default();
    public final JobImpl blockersConfigReady = JobKt.Job$default();

    public RealFlowStarter(StringPreference stringPreference, AppConfigManager appConfigManager, BlockersDataNavigator blockersDataNavigator, BlockerFlowListener blockerFlowListener, AndroidClock androidClock, FeatureFlagManager featureFlagManager, SessionManager sessionManager, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager, RealRegionProvider realRegionProvider, Analytics analytics) {
        this.pendingEmailPreference = stringPreference;
        this.appConfig = appConfigManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.blockersFlowAnalytics = blockerFlowListener;
        this.clock = androidClock;
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
        this.regionProvider = realRegionProvider;
        this.analytics = analytics;
    }

    public final BlockersScreens.StartFlowEntryPoint confirmPersonalInformationRefreshFlow() {
        RetailerType.Companion companion = RefreshType.Companion;
        Flow$Type flow$Type = Flow$Type.PERSONAL_INFORMATION_REFRESH_FLOW;
        UiAppLock.Builder builder = new UiAppLock.Builder(4);
        builder.confirm_without_review();
        PersonalInformationRefreshFlowParameters build = builder.build();
        ProfileScreens.AccountInfoScreen accountInfoScreen = ProfileScreens.AccountInfoScreen.INSTANCE;
        return FlowStarter.startPlasmaFlowWithParams$default(this, flow$Type, build, accountInfoScreen, null, accountInfoScreen, null, null, 984);
    }

    public final String persistedOnboardingFlowToken() {
        OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) this.onboardingFlowTokenManager.flowToken.$$delegate_0.getValue();
        if (onboardingFlowTokenManager$FlowToken == null) {
            Timber.Forest.e(new IllegalStateException("On-boarding flow token is null."));
            return null;
        }
        if (onboardingFlowTokenManager$FlowToken.completedAliasVerification) {
            return onboardingFlowTokenManager$FlowToken.value;
        }
        Timber.Forest.e(new IllegalStateException("On-boarding flow token verification not completed."));
        return null;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, coroutineStart, new RealFlowStarter$setup$1$1(this, continuation, 0), 1);
        JobKt.launch$default(coroutineScope, null, coroutineStart, new RealFlowStarter$setup$1$1(this, continuation, 1), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final InitialScreenPlaceholder signOut() {
        return new InitialScreenPlaceholder(InitialScreenPlaceholder.TriggeredBy.SignOut.INSTANCE);
    }

    public final BlockersScreens startActivityLinkingFlow(String str, CashInstrumentType cashInstrumentType, boolean z, boolean z2, Role role, String str2, Screen screen) {
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow;
        str.getClass();
        cashInstrumentType.getClass();
        role.getClass();
        str2.getClass();
        screen.getClass();
        BlockersData startFlow$default = FlowStarter.startFlow$default(this, BlockersData.Flow.LINK_CARD, screen, null, ClientScenario.PAYMENT_FLOW, str, null, null, null, new BadgeKt$$ExternalSyntheticLambda3(str2, 27), 468);
        if (cashInstrumentType != CashInstrumentType.BANK_ACCOUNT) {
            return new BlockersScreens.InputCardInfoScreen(startFlow$default, cashInstrumentType, z, z2, false, false, false, (BlockerAction) null, 484);
        }
        ClientScenario clientScenario = startFlow$default.clientScenario;
        int i = clientScenario == null ? -1 : RealFlowStarter$startActivityLinkingFlow$$inlined$getStartScreenForLinkingService$default$1$wm$InstitutionLinkingNavigator$WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
        boolean z3 = false;
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        boolean enabled = i != 1 ? i != 2 ? i != 3 ? false : ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled.INSTANCE)).enabled() : ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled.INSTANCE)).enabled() : ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled.INSTANCE)).enabled();
        int i2 = 32;
        RedactedString redactedString = null;
        if (startFlow$default.forceManualAch || startFlow$default.bankAccountOauthConfig == null) {
            return new BlockersScreens.BankAccountLinkingScreen(startFlow$default, redactedString, z3, i2);
        }
        LinkingFlowsData linkingFlowsData = startFlow$default.linkingFlowsData;
        return (linkingFlowsData == null || (supportedLinkingFlow = linkingFlowsData.preferred) == null) ? InstitutionLinkingNavigator.linkWithPlaid(startFlow$default, null) : supportedLinkingFlow == BankAccountLinkingConfig.SupportedLinkingFlow.MANUAL ? new BlockersScreens.BankAccountLinkingScreen(startFlow$default, redactedString, z3, i2) : (supportedLinkingFlow == BankAccountLinkingConfig.SupportedLinkingFlow.STRIPE && enabled) ? InstitutionLinkingNavigator.linkWithStripe(startFlow$default) : InstitutionLinkingNavigator.linkWithPlaid(startFlow$default, null);
    }

    public final BlockersScreens.StartFlowEntryPoint startBusinessAccountCreationFlow(Screen screen, C4BOnboardingFlowParameters.EntryPoint entryPoint, String str) {
        str.getClass();
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.BUSINESS_ACCOUNT_CREATION, new C4BOnboardingFlowParameters(entryPoint, str), screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, null, null, 984);
    }

    public final BlockersScreens.StartFlowEntryPoint startBusinessAccountDowngradeFlow(DowngradeBusinessAccountFlowParameters.EntryPoint entryPoint, Screen screen) {
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.DOWNGRADE_BUSINESS_ACCOUNT, new DowngradeBusinessAccountFlowParameters(entryPoint), screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, null, null, 984);
    }

    public final BlockersScreens.StartFlowEntryPoint startBusinessAccountOnboardingFlow(Screen screen, C4BOnboardingFlowParameters.EntryPoint entryPoint, String str) {
        str.getClass();
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.C4B_ONBOARDING, new C4BOnboardingFlowParameters(entryPoint, str), screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, null, null, 984);
    }

    public final BlockersScreens.CashtagScreen startCashtagFlow(Screen screen, RedactedString redactedString) {
        screen.getClass();
        return new BlockersScreens.CashtagScreen(FlowStarter.startFlow$default(this, BlockersData.Flow.CASHTAG, screen, null, ClientScenario.PROFILE, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), null, null, null, null, redactedString, null, null, false);
    }

    public final BlockersScreens.StartFlowEntryPoint startClosePoolFlow(String str, PoolDetailsScreen poolDetailsScreen) {
        str.getClass();
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.CLOSE_MONEY_POOL, new CloseMoneyPoolFlowParameters(str), poolDetailsScreen, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
    }

    public final Screen startEditPaycheckDistributionFlow(String str, ResponseContext responseContext, Screen screen, ColorModel colorModel) {
        str.getClass();
        responseContext.getClass();
        screen.getClass();
        return this.blockersDataNavigator.getNext(null, BlockersData.copy$default(FlowStarter.startFlow$default(this, BlockersData.Flow.CLIENT_SCENARIO, screen, null, ClientScenario.PLASMA, str, null, null, null, null, 980).updateFromResponseContext(responseContext, false), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, colorModel, null, null, null, null, false, null, null, null, -1, 65407));
    }

    public final BlockersScreens.InputCardInfoScreen startInstrumentLinkingFlow(CashInstrumentType cashInstrumentType, Orientation orientation, boolean z, ClientScenario clientScenario, Screen screen) {
        cashInstrumentType.getClass();
        orientation.getClass();
        clientScenario.getClass();
        screen.getClass();
        return new BlockersScreens.InputCardInfoScreen(FlowStarter.startFlow$default(this, BlockersData.Flow.LINK_CARD, screen, null, clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), cashInstrumentType, false, z, false, false, false, (BlockerAction) null, 492);
    }

    public final BlockersScreens.StartFlowEntryPointScreen startInviteFlow(Screen screen, BlockersScreens.StartFlowEntryPointScreen.Origin origin) {
        screen.getClass();
        return FlowStarter.startPlasmaFlow$default(this, Flow$Type.INVITE_FRIENDS, screen, null, origin, 4);
    }

    public final BlockersScreens.StartFlowEntryPoint startLeavePoolFlow(String str, MoneyPoolVisitOrigin moneyPoolVisitOrigin) {
        str.getClass();
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.LEAVE_MONEY_POOL, new LeaveMoneyPoolFlowParameters(str, moneyPoolVisitOrigin), PaymentScreens$HomeScreens$Home.INSTANCE, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
    }

    public final Screen startOfflineErrorTransfersFlow(TransferManager.TransferFundsResult.Error.ErrorResult errorResult, Screen screen) {
        StatusResult errorStatusResult = errorResult.getErrorStatusResult();
        PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
        if (errorStatusResult != null) {
            StatusResult errorStatusResult2 = errorResult.getErrorStatusResult();
            errorStatusResult2.getClass();
            return FlowStarter.startStatusResultFlow$default(this, errorStatusResult2, EmptyList.INSTANCE, screen == null ? paymentScreens$HomeScreens$Home : screen, null, null, 56);
        }
        if (errorResult.getErrorScenarioPlan() != null) {
            return this.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(this, BlockersData.Flow.CLIENT_SCENARIO, screen == null ? paymentScreens$HomeScreens$Home : screen, errorResult.getErrorScenarioPlan(), null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Must provide either errorStatusResult or errorScenarioPlan");
        return null;
    }

    public final BlockersScreens.StartFlowEntryPointScreen startPasscodeFlow(Flow$Type flow$Type, Screen screen) {
        screen.getClass();
        return new BlockersScreens.StartFlowEntryPointScreen(BlockersData.copy$default(FlowStarter.startFlow$default(this, BlockersData.Flow.CLIENT_SCENARIO, screen, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), null, null, null, flow$Type, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535), (String) null, screen, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 26);
    }

    public final Screen startPaymentBlockersFlow(String str, ScenarioPlan scenarioPlan, StatusResult statusResult, List list, Screen screen, ClientScenario clientScenario) {
        str.getClass();
        list.getClass();
        screen.getClass();
        clientScenario.getClass();
        return this.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(this, BlockersData.Flow.PAYMENT, screen, scenarioPlan, clientScenario, str, null, null, null, new RealFlowStarter$$ExternalSyntheticLambda2(list, statusResult), 464));
    }

    public final PaymentScreens.PaymentLoading startPaymentFlow(PaymentInitiatorData paymentInitiatorData, Screen screen, Screen screen2, ClientScenario clientScenario) {
        screen.getClass();
        screen2.getClass();
        clientScenario.getClass();
        return new PaymentScreens.PaymentLoading(FlowStarter.startFlow$default(this, BlockersData.Flow.PAYMENT, screen, null, clientScenario, null, screen2, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.P2P, paymentInitiatorData.getFlowToken(), 4), paymentInitiatorData.getMoneybotContext(), new StampsConfigQueries$$ExternalSyntheticLambda0(paymentInitiatorData, 3), 52), new RedactedParcelable(paymentInitiatorData));
    }

    public final BlockersScreens.StartFlowEntryPoint startPersonalAccountCreationFlow(String str, Screen screen, CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint) {
        str.getClass();
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.CREATE_SECONDARY_PERSONAL_PROFILE, new CreateSecondaryPersonalAccountFlowParams(createSecondaryPersonalAccountEntryPoint, str), screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, null, null, 984);
    }

    public final BlockersScreens.StartFlowEntryPoint startPlasmaFlowWithParams(String str, Screen screen, ScenarioInitiatorType scenarioInitiatorType, String str2, Screen screen2, BlockersData.AnalyticsData analyticsData, ColorModel colorModel, boolean z, BlockersData.MoneybotContext moneybotContext) {
        str.getClass();
        screen.getClass();
        BlockersData startFlow$default = FlowStarter.startFlow$default(this, PlatformKt.hasOnboardedAccount(this.sessionManager) ? BlockersData.Flow.SERVER_FLOW : BlockersData.Flow.ONBOARDING, screen, null, ClientScenario.PLASMA, null, null, analyticsData, null, new SessionQueries$$ExternalSyntheticLambda0(scenarioInitiatorType, str2, this, str, z, colorModel, moneybotContext), 356);
        return z ? new BlockersScreens.StartFlowEntryPointSheet(startFlow$default, str, screen2, BlockersScreens.StartFlowEntryPoint.Route.FRANKLIN) : new BlockersScreens.StartFlowEntryPointScreen(startFlow$default, str, screen2, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 24);
    }

    public final Screen startProfileBlockersFlow(ClientScenario clientScenario, String str, ScenarioPlan scenarioPlan, Screen screen) {
        clientScenario.getClass();
        str.getClass();
        screen.getClass();
        return this.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(this, BlockersData.Flow.PROFILE_BLOCKERS, screen, scenarioPlan, clientScenario, str, null, null, null, null, 976));
    }

    public final BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow(List list, Screen screen, String str) {
        list.getClass();
        screen.getClass();
        CashInstrumentType cashInstrumentType = (CashInstrumentType) list.get(0);
        CashInstrumentType cashInstrumentType2 = CashInstrumentType.BANK_ACCOUNT;
        if (cashInstrumentType != cashInstrumentType2) {
            if (list.contains(CashInstrumentType.DEBIT_CARD) && !list.contains(cashInstrumentType2)) {
                list = CollectionsKt.plus((Collection) list, (Object) cashInstrumentType2);
            }
            return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.LINK_CARD, new SetLinkCardRequirementData(list, str), screen, null, screen, null, null, 984);
        }
        return FlowStarter.startPlasmaFlowWithParams$default(this, Flow$Type.LINK_BANK_ACCOUNT, new LinkBankAccountFlowParameters(CollectionsKt__CollectionsKt.listOf((Object[]) new LinkBankAccountSubflow[]{new LinkBankAccountSubflow(4, "LINK_BANK_ACCOUNT_PLAID", new LinkBankAccountPlaidFlowParameters(str).encodeByteString()), new LinkBankAccountSubflow(6, "LINK_BANK_ACCOUNT_MANUAL", (ByteString) null)})), screen, null, screen, null, null, 984);
    }

    public final BlockersScreens.StatusResultFullScreen startStatusResultFlow(StatusResult statusResult, List list, Screen screen, ClientScenario clientScenario, String str, BlockersData.AnalyticsData analyticsData) {
        statusResult.getClass();
        list.getClass();
        screen.getClass();
        BlockersData.Flow flow = BlockersData.Flow.STATUS_RESULT;
        return new BlockersScreens.StatusResultFullScreen(FlowStarter.startFlow$default(this, flow, screen, null, clientScenario, str, null, analyticsData, null, new OpenSourceKt$$ExternalSyntheticLambda6(list, 5), 340), flow, statusResult);
    }

    public final BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow(Screen screen, CashInstrumentType cashInstrumentType, String str) {
        cashInstrumentType.getClass();
        screen.getClass();
        return startProfileLinkingFlow(CollectionsKt__CollectionsJVMKt.listOf(cashInstrumentType), screen, str);
    }
}
