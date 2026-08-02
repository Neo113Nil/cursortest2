package com.squareup.cash.directdeposit.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.directdeposit.viewmodels.AccountDetailsContent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileDirectDepositSetupManualFlow;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DirectDepositLogNullAccountDetails;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$OctPaychecksOnDirectDepositSetup;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class DirectDepositSetupPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final DirectDepositSetupScreen args;
    public final RealBankingOptionBadgeUpdater bankingOptionBadgeUpdater;
    public final RealBlockersHelper blockersHelper;
    public final RealClipboardManager clipboardManager;
    public final RealDemandDepositAccountManager demandDepositAccountManager;
    public final ErrorReporter errorReporter;
    public final boolean manualDirectDepositSetupFlow;
    public final BetterNavigator.ScreenNavigator navigator;
    public final boolean originalCardTransactionCountsAsPaycheck;
    public final PostbankAppService postbankAppService;
    public final boolean reportNullAccountDetails;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public DirectDepositSetupPresenter(RealDemandDepositAccountManager realDemandDepositAccountManager, DemandDepositAccountFormatter demandDepositAccountFormatter, AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Analytics analytics, RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater, RealMoneyNavigatorHelper realMoneyNavigatorHelper, ErrorReporter errorReporter, PostbankAppService postbankAppService, SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager, RealRouter$Factory$Impl realRouter$Factory$Impl, DirectDepositSetupScreen directDepositSetupScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        directDepositSetupScreen.getClass();
        this.demandDepositAccountManager = realDemandDepositAccountManager;
        this.stringManager = androidStringManager;
        this.clipboardManager = realClipboardManager;
        this.analytics = analytics;
        this.bankingOptionBadgeUpdater = realBankingOptionBadgeUpdater;
        this.errorReporter = errorReporter;
        this.postbankAppService = postbankAppService;
        this.syncValueReader = syncValueReader;
        this.args = directDepositSetupScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.manualDirectDepositSetupFlow = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MobileDirectDepositSetupManualFlow.INSTANCE)).enabled();
        this.reportNullAccountDetails = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$DirectDepositLogNullAccountDetails.INSTANCE)).enabled();
        this.originalCardTransactionCountsAsPaycheck = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$OctPaychecksOnDirectDepositSetup.INSTANCE)).enabled();
    }

    public static final void access$completeScenario(DirectDepositSetupPresenter directDepositSetupPresenter, ClientScenario clientScenario) {
        BlockersData.AnalyticsData analyticsData;
        RealBlockersHelper realBlockersHelper = directDepositSetupPresenter.blockersHelper;
        BlockersData.Flow flow = BlockersData.Flow.PROFILE_BLOCKERS;
        DirectDepositSetupScreen directDepositSetupScreen = directDepositSetupPresenter.args;
        Screen screen = directDepositSetupScreen.exitScreen;
        if (screen == null) {
            screen = RealMoneyNavigatorHelper.moneyTabScreen();
        }
        Screen screen2 = screen;
        int i = 6;
        String str = null;
        switch (directDepositSetupScreen.origin.ordinal()) {
            case 0:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.ADD_MONEY, str, i);
                break;
            case 1:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.HOME_TAB, str, i);
                break;
            case 2:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BALANCE_HOME, str, i);
                break;
            case 3:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.DEEP_LINK, str, i);
                break;
            case 4:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.PAID_IN_BITCOIN, str, i);
                break;
            case 5:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.RECURRING_DEPOSITS, str, i);
                break;
            case 6:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.PAYCHECKS, str, i);
                break;
            case 7:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BENEFITS_HUB, str, i);
                break;
            case 8:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.SAVINGS_YIELD_UPSELL, str, i);
                break;
            case 9:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.OVERDRAFT, str, i);
                break;
            case 10:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.PAPER_MONEY_DEPOSIT, str, i);
                break;
            case 11:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.ATM_WITHDRAWAL, str, i);
                break;
            case 12:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.CARD_ONBOARDING, str, i);
                break;
            case 13:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BORROW, str, i);
                break;
            case 14:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.EMAIL_CAMPAIGN, str, i);
                break;
            case 15:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.PUSH_CAMPAIGN, str, i);
                break;
            case 16:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.IN_APP_CAMPAIGN, str, i);
                break;
            case 17:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.SMS_CAMPAIGN, str, i);
                break;
            case 18:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.MARKETING_CAMPAIGN, str, i);
                break;
            case 19:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.PAYCHECKS_BENEFITS_BOOKLET, str, i);
                break;
            case 20:
                analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.UNDETERMINED, str, i);
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        BlockersHelper.launchClientScenario$default(realBlockersHelper, flow, clientScenario, screen2, null, null, null, true, analyticsData, null, false, 3304);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        AccountDetailsContent accountDetailsContent;
        String str;
        String m$1;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(316419282);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new DirectDepositSetupPresenter$models$1$1(this, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i3 = 1;
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new DirectDepositSetupPresenter$models$1$1(this, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i4 = 2;
        if (rememberedValue3 == neverEqualPolicy) {
            MoneyTabPresenter$models$lambda$17$$inlined$map$1 moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(this.demandDepositAccountManager.selectUiDda(), i4);
            gapComposer.updateRememberedValue(moneyTabPresenter$models$lambda$17$$inlined$map$1);
            rememberedValue3 = moneyTabPresenter$models$lambda$17$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PaychecksUiConfiguration), new DirectDepositSetupPresenter$models$1$1(this, continuation, i4), i2), i3);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, (State) collectAsState, 28));
        DirectDepositAccount directDepositAccount = (DirectDepositAccount) collectAsState.getValue();
        DirectDepositAccount directDepositAccount2 = (DirectDepositAccount) collectAsState.getValue();
        String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{directDepositAccount2 != null ? directDepositAccount2.dda_explanation_text : null, (String) collectAsState2.getValue()}), "\n\n", null, null, 0, null, null, 62);
        AndroidStringManager androidStringManager = this.stringManager;
        DirectDepositSetupViewModel.HeaderSection headerSection = new DirectDepositSetupViewModel.HeaderSection(androidStringManager.get(R.string.direct_deposit_home_header_title), androidStringManager.get(R.string.direct_deposit_home_cash_green_header_subtitle));
        if (directDepositAccount != null) {
            String str2 = directDepositAccount.account_number;
            if (str2 == null) {
                m$1 = Recorder$$ExternalSyntheticOutline2.m$1(directDepositAccount.account_number_prefix, " •••• ••••");
            } else if (str2.length() <= 4 || (str2.length() - 5) % 4 != 0) {
                m$1 = StringsKt___StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(4, StringsKt___StringsKt.reversed(str2).toString()), " ", null, null, 0, null, null, 62)).toString();
            } else {
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(str2.substring(0, 2));
                createListBuilder.add(str2.substring(2, 5));
                createListBuilder.addAll(StringsKt___StringsKt.chunked(4, str2.substring(5)));
                m$1 = CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder), " ", null, null, 0, null, null, 62);
            }
            String str3 = m$1;
            String str4 = directDepositAccount.routing_number;
            str4.getClass();
            accountDetailsContent = new AccountDetailsContent(StringsKt___StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(3, StringsKt___StringsKt.reversed(str4).toString()), " ", null, null, 0, null, null, 62)).toString(), androidStringManager.get(R.string.routing_number_label), str3, androidStringManager.get(R.string.account_number_label), str2 != null && Intrinsics.areEqual(directDepositAccount.is_placeholder, Boolean.FALSE));
        } else {
            accountDetailsContent = null;
        }
        DirectDepositSetupViewModel directDepositSetupViewModel = new DirectDepositSetupViewModel(headerSection, new DirectDepositSetupViewModel.SetupYourselfSection(androidStringManager.get(R.string.direct_deposit_home_setup_yourself_title), androidStringManager.get(R.string.direct_deposit_home_setup_yourself_description), new DirectDepositSetupViewModel.AccountDetailsContentHome(androidStringManager.get(R.string.routing_number_label), (accountDetailsContent == null || (str = accountDetailsContent.routingNumber) == null) ? null : new RedactedString(str), androidStringManager.get(R.string.direct_deposit_home_routing_copy_description), androidStringManager.get(R.string.account_number_label), accountDetailsContent != null ? new RedactedString(accountDetailsContent.accountNumber) : null, androidStringManager.get(R.string.direct_deposit_home_account_copy_description))), new DirectDepositSetupViewModel.CreateFormSection(androidStringManager.get(R.string.direct_deposit_home_create_form_label), androidStringManager.get(R.string.direct_deposit_home_create_form_description)), androidStringManager.get(R.string.direct_deposit_home_help_label), joinToString$default);
        gapComposer.end(false);
        return directDepositSetupViewModel;
    }
}
