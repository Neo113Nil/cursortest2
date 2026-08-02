package com.squareup.cash.banking.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.paraphrase.FormattedResource;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.banking.presenters.BankingSectionsPresenter;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ActivityMobileCashRunningBalance;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenOverdraft;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.unicorn.balance_home_ui.BalanceHomeUi$FocusArea;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes5.dex */
public final class BalanceHomePresenter implements MoleculePresenter {
    public final DemandDepositAccountFormatter accountFormatter;
    public final RealActivityEmbeddedPresenter activityEmbeddedPresenter;
    public final Analytics analytics;
    public final BalanceHomeScreen args;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final UnleashContext bankingOutboundNavigator;
    public final BankingSectionsPresenter bankingSectionsPresenter;
    public final RealBlockersHelper blockersHelper;
    public final RealClipboardManager clipboardManager;
    public final CryptoFlowStarter cryptoFlowStarter;
    public final RealDemandDepositAccountManager demandDepositAccountManager;
    public final RealDisclosureProvider disclosureProvider;
    public final boolean evergreenOverdraftEnabled;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRestrictedBalanceStore restrictedBalanceStore;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final UnicornService unicornAppService;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider accountFormatter;
        public final Provider activitiesCacheManager;
        public final Provider activityEmbeddedPresenterFactory;
        public final Provider activityTokenFactory;
        public final Provider analytics;
        public final Provider balanceSnapshotManager;
        public final Provider bankingOutboundNavigatorFactory;
        public final InstanceFactory bankingSectionsPresenterFactory;
        public final Provider blockersHelperFactory;
        public final Provider clipboardManager;
        public final Provider cryptoFlowStarter;
        public final Provider demandDepositAccountManager;
        public final Provider disclosureProvider;
        public final Provider featureFlagManager;
        public final Provider moneyFormatterFactory;
        public final Provider restrictedBalanceStore;
        public final Provider routerFactory;
        public final Provider stringManager;
        public final Provider syncValueReader;
        public final Provider unicornAppService;

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, InstanceFactory instanceFactory, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19) {
            this.accountFormatter = provider;
            this.stringManager = provider2;
            this.bankingOutboundNavigatorFactory = provider3;
            this.syncValueReader = provider4;
            this.clipboardManager = provider5;
            this.demandDepositAccountManager = provider6;
            this.balanceSnapshotManager = provider7;
            this.restrictedBalanceStore = provider8;
            this.cryptoFlowStarter = provider9;
            this.bankingSectionsPresenterFactory = instanceFactory;
            this.blockersHelperFactory = provider10;
            this.unicornAppService = provider11;
            this.disclosureProvider = provider12;
            this.featureFlagManager = provider13;
            this.moneyFormatterFactory = provider14;
            this.routerFactory = provider15;
            this.analytics = provider16;
            this.activityEmbeddedPresenterFactory = provider17;
            this.activityTokenFactory = provider18;
            this.activitiesCacheManager = provider19;
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BalanceData.Button.Action.values().length];
            try {
                UiControl.Type.Companion companion = BalanceData.Button.Action.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UiControl.Type.Companion companion2 = BalanceData.Button.Action.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UiControl.Type.Companion companion3 = BalanceData.Button.Action.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BalanceHomePresenter(DemandDepositAccountFormatter demandDepositAccountFormatter, AndroidStringManager androidStringManager, RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl, SyncValueReader syncValueReader, RealClipboardManager realClipboardManager, RealDemandDepositAccountManager realDemandDepositAccountManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealRestrictedBalanceStore realRestrictedBalanceStore, CryptoFlowStarter cryptoFlowStarter, BankingSectionsPresenter$Factory$Impl bankingSectionsPresenter$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, UnicornService unicornService, RealDisclosureProvider realDisclosureProvider, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, BalanceHomeScreen balanceHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, RealActivitiesCacheManager realActivitiesCacheManager) {
        balanceHomeScreen.getClass();
        this.accountFormatter = demandDepositAccountFormatter;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.clipboardManager = realClipboardManager;
        this.demandDepositAccountManager = realDemandDepositAccountManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.restrictedBalanceStore = realRestrictedBalanceStore;
        this.cryptoFlowStarter = cryptoFlowStarter;
        this.unicornAppService = unicornService;
        this.disclosureProvider = realDisclosureProvider;
        this.featureFlagManager = featureFlagManager;
        this.args = balanceHomeScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        BankingSectionsPresenter.MetroFactory metroFactory = bankingSectionsPresenter$Factory$Impl.delegateFactory;
        Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
        SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory.syncValueReader.getValue();
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory.featureFlagManager.getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory.blockersHelperFactory.invoke();
        RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater = (RealBankingOptionBadgeUpdater) metroFactory.bankingOptionBadgeUpdater.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
        analytics2.getClass();
        syncValueReader2.getClass();
        featureFlagManager2.getClass();
        realBlockersHelper$Factory$Impl2.getClass();
        realBankingOptionBadgeUpdater.getClass();
        realRouter$Factory$Impl2.getClass();
        this.bankingSectionsPresenter = new BankingSectionsPresenter(analytics2, syncValueReader2, featureFlagManager2, realBlockersHelper$Factory$Impl2, realBankingOptionBadgeUpdater, realRouter$Factory$Impl2, balanceHomeScreen, screenNavigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.bankingOutboundNavigator = realBankingOutboundNavigator$Factory$Impl.create$1(screenNavigator);
        this.activityEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN_RUNNING_BALANCE_CASH), ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) null, 12), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, BalanceFeedScreen.BalanceType.CashBalance), balanceHomeScreen, new ErrorView$$ExternalSyntheticLambda0(this, 12), 3, null, null, null, null, null, 8136));
        this.evergreenOverdraftEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobileBankingEvergreenOverdraft.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$handleOverdraftClicked(BalanceHomePresenter balanceHomePresenter, OverdraftStatus overdraftStatus) {
        OverdraftStatus.Eligible eligible;
        OverdraftStatus.Button button = overdraftStatus.footer_button_override;
        OverdraftStatus.Upsell upsell = null;
        String str = button != null ? button.client_route_url : null;
        if (str == null) {
            OverdraftStatus.State_ state_ = overdraftStatus.State;
            if (state_ != null) {
                OverdraftStatus.State_.Eligible eligible2 = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                if (eligible2 != null) {
                    eligible = eligible2.value;
                    if (eligible == null) {
                        if (state_ != null) {
                            OverdraftStatus.State_.Upsell upsell2 = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                            if (upsell2 != null) {
                                upsell = upsell2.value;
                            }
                        }
                        if (upsell == null) {
                            balanceHomePresenter.navigator.goTo(new OverdraftCoverageSheetScreen(balanceHomePresenter.args));
                            return;
                        }
                    }
                }
            }
            eligible = null;
            if (eligible == null) {
            }
        }
        RealRouter realRouter = balanceHomePresenter.router;
        if (str == null) {
            OverdraftStatus.Button button2 = overdraftStatus.footer_button;
            button2.getClass();
            str = button2.client_route_url;
            str.getClass();
        }
        realRouter.route(new RoutingParams(balanceHomePresenter.args, null, null, null, null, null, 510), str);
    }

    public final String formatOverdraftAmount(OverdraftUsage overdraftUsage, Function1 function1) {
        Money money;
        if (overdraftUsage == null || (money = overdraftUsage.usage) == null) {
            return null;
        }
        return this.stringManager.getString((FormattedResource) function1.invoke(this.moneyFormatter.format(money)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035b  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [squareup.cash.overdraft.OverdraftStatus$State_$PermanentlyDisabled] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [squareup.cash.overdraft.OverdraftStatus$State_$Disabled] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [squareup.cash.overdraft.OverdraftStatus$State_$Activated] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [squareup.cash.overdraft.OverdraftStatus$State_$Eligible] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [squareup.cash.overdraft.OverdraftStatus$State_$Upsell] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v51 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        ?? r4;
        BalanceHomeViewModel.Loaded.AccountDetailsViewModel accountDetailsViewModel;
        BalanceHomeViewModel.Loaded.CallToActionViewModel callToActionViewModel;
        BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel restrictedBalanceViewModel;
        BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel;
        OverdraftStatus overdraftStatus;
        String str;
        BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel overdraftUpsellViewModel;
        ?? r31;
        boolean z;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String formatOverdraftAmount;
        OverdraftStatus.State_ state_;
        OverdraftStatus.State_ state_2;
        OverdraftStatus.State_ state_3;
        OverdraftStatus.State_ state_4;
        OverdraftStatus.State_ state_5;
        Money money;
        BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel overdraftUpsellViewModel2;
        BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel2;
        BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel3;
        LocalizedString localizedString;
        String str3;
        String str4;
        BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel4;
        String str5;
        RestrictedBalance restrictedBalance;
        BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel restrictedBalanceViewModel2;
        Money money2;
        String format2;
        BankingTab.BalanceHomeCallToAction balanceHomeCallToAction;
        BalanceHomeViewModel.Loaded.CallToActionViewModel callToActionViewModel2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-966866608);
        Object rememberedValue = gapComposer.rememberedValue();
        String str6 = "";
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.disclosureProvider.disclosure(DisclosureForScreen.BALANCE_HOME, "");
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = this.demandDepositAccountManager.selectUiDda();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        SyncValueReader syncValueReader = this.syncValueReader;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftStatus);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Continuation continuation = null;
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftUsage);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue5, null, gapComposer, 1);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = this.balanceSnapshotManager.select();
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = this.restrictedBalanceStore.select();
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer, 48, 2);
        Object rememberedValue8 = gapComposer.rememberedValue();
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        int i2 = 0;
        if (rememberedValue8 == neverEqualPolicy) {
            BalanceHomePresenter$models$lambda$14$$inlined$map$1 balanceHomePresenter$models$lambda$14$$inlined$map$1 = new BalanceHomePresenter$models$lambda$14$$inlined$map$1(((RealFeatureFlagManager) featureFlagManager).peekValues(LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance.INSTANCE), i2);
            gapComposer.updateRememberedValue(balanceHomePresenter$models$lambda$14$$inlined$map$1);
            rememberedValue8 = balanceHomePresenter$models$lambda$14$$inlined$map$1;
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue8, bool, null, gapComposer, 48, 2);
        UiCallbackModel models = this.bankingSectionsPresenter.models(gapComposer);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, AmplitudeExperiments$ActivityMobileCashRunningBalance.INSTANCE), new AvatarsKt$$ExternalSyntheticLambda2(22));
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState9 = Updater.collectAsState((StateFlow) rememberedValue9, null, gapComposer, 1);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue10 == neverEqualPolicy) {
            r4 = 0;
            rememberedValue10 = new BalanceHomePresenter$models$1$1(this, continuation, r4);
            gapComposer.updateRememberedValue(rememberedValue10);
        } else {
            r4 = 0;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue10);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new BalanceHomePresenter$models$1$1(this, continuation, r15);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue11);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = new MLKitTitleGenerator$1(this, continuation, 14);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue12);
        boolean z2 = r4;
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, collectAsState2, collectAsState4, 4));
        UiDda uiDda = (UiDda) collectAsState2.getValue();
        if (uiDda == null) {
            gapComposer.startReplaceGroup(-1868593624);
            gapComposer.end(z2);
            gapComposer.end(z2);
            return BalanceHomeViewModel.InitialLoading.INSTANCE;
        }
        gapComposer.startReplaceGroup(-1868593623);
        BalanceData.Button button = uiDda.button;
        if (button == null || button.action == BalanceData.Button.Action.SHOW_DDA_COPY_AND_PASTE) {
            button = null;
        }
        DirectDepositAccount directDepositAccount = uiDda.account;
        AndroidStringManager androidStringManager = this.stringManager;
        if (directDepositAccount != null) {
            accountDetailsViewModel = new BalanceHomeViewModel.Loaded.AccountDetailsViewModel(Intrinsics.areEqual(directDepositAccount.is_placeholder, bool) ? MooncakeTheme.accountDetailsContent(directDepositAccount, this.accountFormatter, androidStringManager) : null, button);
        } else {
            accountDetailsViewModel = null;
        }
        BankingTab bankingTab = (BankingTab) collectAsState3.getValue();
        if (bankingTab == null || (balanceHomeCallToAction = bankingTab.balance_home_call_to_action) == null) {
            callToActionViewModel = null;
        } else {
            LocalizedString localizedString2 = balanceHomeCallToAction.title;
            if ((localizedString2 != null || balanceHomeCallToAction.subtitle != null) && balanceHomeCallToAction.button_text != null) {
                BankingTab.ClientRouteAction clientRouteAction = balanceHomeCallToAction.button_client_route_action;
                if ((clientRouteAction != null ? clientRouteAction.url : null) != null) {
                    String translated = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
                    LocalizedString localizedString3 = balanceHomeCallToAction.subtitle;
                    String translated2 = localizedString3 != null ? StringsKt.translated(localizedString3) : null;
                    LocalizedString localizedString4 = balanceHomeCallToAction.button_text;
                    localizedString4.getClass();
                    String translated3 = StringsKt.translated(localizedString4);
                    BankingTab.ClientRouteAction clientRouteAction2 = balanceHomeCallToAction.button_client_route_action;
                    clientRouteAction2.getClass();
                    String str7 = clientRouteAction2.url;
                    str7.getClass();
                    callToActionViewModel2 = new BalanceHomeViewModel.Loaded.CallToActionViewModel(translated, translated2, translated3, str7);
                    callToActionViewModel = callToActionViewModel2;
                }
            }
            callToActionViewModel2 = null;
            callToActionViewModel = callToActionViewModel2;
        }
        String str8 = androidStringManager.get(R.string.balance_home_title_cash_balance);
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState6.getValue();
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (balanceSnapshot != null && (money2 = balanceSnapshot.balance) != null && (format2 = moneyFormatter.format(money2)) != null) {
            str6 = format2;
        }
        BalanceHomeViewModel.Loaded.BalanceViewModel balanceViewModel = new BalanceHomeViewModel.Loaded.BalanceViewModel(str8, str6);
        if (!((Boolean) collectAsState8.getValue()).booleanValue() || (restrictedBalance = (RestrictedBalance) collectAsState7.getValue()) == null) {
            restrictedBalanceViewModel = null;
        } else {
            Money money3 = restrictedBalance.amount;
            if (Moneys.isZero(money3)) {
                restrictedBalanceViewModel2 = null;
            } else {
                String format3 = moneyFormatter.format(money3);
                format3.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.restricted_balance_label)).format(new Object[]{format3});
                format4.getClass();
                restrictedBalanceViewModel2 = new BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel(format4);
            }
            restrictedBalanceViewModel = restrictedBalanceViewModel2;
        }
        OverdraftStatus overdraftStatus2 = (OverdraftStatus) collectAsState4.getValue();
        if (overdraftStatus2 != null) {
            OverdraftStatus.State_ state_6 = overdraftStatus2.State;
            if (state_6 != null) {
                OverdraftStatus.State_.Eligible eligible = state_6 instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_6 : null;
                if ((eligible != null ? eligible.value : null) != null) {
                    overdraftPillViewModel4 = BalanceHomeViewModel.OverdraftPillViewModel.NewUserExperience.INSTANCE;
                    overdraftPillViewModel = overdraftPillViewModel4;
                    overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
                    if (overdraftStatus == null) {
                        OverdraftStatus.State_ state_7 = overdraftStatus.State;
                        if (state_7 != null) {
                            OverdraftStatus.State_.Upsell upsell = state_7 instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_7 : null;
                            OverdraftStatus.Upsell upsell2 = upsell != null ? upsell.value : null;
                            if (upsell2 != null) {
                                if (!this.evergreenOverdraftEnabled) {
                                    upsell2 = null;
                                }
                                if (upsell2 != null) {
                                    str = null;
                                    overdraftUpsellViewModel2 = new BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel(new Image("https://cash-f.squarecdn.com/static/balance-home-overdraft-upsell-image-square.png", (String) null, 6), androidStringManager.get(R.string.overdraft_upsell_title), androidStringManager.get(R.string.overdraft_upsell_button_text));
                                    overdraftUpsellViewModel = overdraftUpsellViewModel2;
                                }
                            }
                        }
                        str = null;
                        overdraftUpsellViewModel2 = null;
                        overdraftUpsellViewModel = overdraftUpsellViewModel2;
                    } else {
                        str = null;
                        overdraftUpsellViewModel = null;
                    }
                    Disclosure disclosure = (Disclosure) collectAsState.getValue();
                    String str9 = disclosure == null ? disclosure.text : str;
                    Disclosure disclosure2 = (Disclosure) collectAsState.getValue();
                    boolean z3 = disclosure2 == null ? disclosure2.showIcon : z2 ? 1 : 0;
                    BalanceHomeUi$FocusArea balanceHomeUi$FocusArea = this.args.focusArea;
                    if (((Boolean) collectAsState9.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(-725462473);
                        gapComposer.end(z2);
                        r31 = str;
                    } else {
                        gapComposer.startReplaceGroup(1362070862);
                        UiCallbackModel models2 = this.activityEmbeddedPresenter.models(gapComposer, z2 ? 1 : 0);
                        gapComposer.end(z2);
                        r31 = models2;
                    }
                    z = this.evergreenOverdraftEnabled;
                    if (z) {
                        str2 = str;
                    } else {
                        OverdraftStatus overdraftStatus3 = (OverdraftStatus) collectAsState4.getValue();
                        OverdraftUsage overdraftUsage = (OverdraftUsage) collectAsState5.getValue();
                        r15 = (overdraftUsage == null || (money = overdraftUsage.usage) == null || Moneys.isZero(money)) ? z2 ? 1 : 0 : 1;
                        if (overdraftStatus3 != null && (state_5 = overdraftStatus3.State) != null) {
                            ?? r9 = state_5 instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_5 : str;
                            if (r9 != 0) {
                                obj = r9.value;
                                if (obj == null) {
                                    formatOverdraftAmount = androidStringManager.get(R.string.balance_home_overdraft_upsell);
                                } else {
                                    if (overdraftStatus3 != null && (state_4 = overdraftStatus3.State) != null) {
                                        ?? r92 = state_4 instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_4 : str;
                                        if (r92 != 0) {
                                            obj2 = r92.value;
                                            if (obj2 == null) {
                                                formatOverdraftAmount = androidStringManager.get(R.string.balance_home_overdraft_status_off);
                                            } else {
                                                if (overdraftStatus3 != null && (state_3 = overdraftStatus3.State) != null) {
                                                    ?? r93 = state_3 instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_3 : str;
                                                    if (r93 != 0) {
                                                        obj3 = r93.value;
                                                        FormattedResources formattedResources = FormattedResources.INSTANCE;
                                                        if (obj3 == null) {
                                                            formatOverdraftAmount = r15 != 0 ? formatOverdraftAmount(overdraftUsage, new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "balance_home_overdraft_balance", "balance_home_overdraft_balance(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 2)) : androidStringManager.get(R.string.balance_home_overdraft_status_on);
                                                        } else {
                                                            if (overdraftStatus3 != null && (state_2 = overdraftStatus3.State) != null) {
                                                                ?? r94 = state_2 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_2 : str;
                                                                if (r94 != 0) {
                                                                    obj4 = r94.value;
                                                                    if (obj4 == null) {
                                                                        formatOverdraftAmount = r15 != 0 ? formatOverdraftAmount(overdraftUsage, new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "balance_home_overdraft_balance_due", "balance_home_overdraft_balance_due(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 3)) : androidStringManager.get(R.string.balance_home_overdraft_status_off);
                                                                    } else {
                                                                        if (overdraftStatus3 != null && (state_ = overdraftStatus3.State) != null) {
                                                                            ?? r2 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : str;
                                                                            if (r2 != 0) {
                                                                                obj5 = r2.value;
                                                                                formatOverdraftAmount = (obj5 != null || r15 == 0) ? str : formatOverdraftAmount(overdraftUsage, new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "balance_home_overdraft_balance_due", "balance_home_overdraft_balance_due(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 4));
                                                                            }
                                                                        }
                                                                        obj5 = str;
                                                                        if (obj5 != null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            obj4 = str;
                                                            if (obj4 == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                obj3 = str;
                                                FormattedResources formattedResources2 = FormattedResources.INSTANCE;
                                                if (obj3 == null) {
                                                }
                                            }
                                        }
                                    }
                                    obj2 = str;
                                    if (obj2 == null) {
                                    }
                                }
                                str2 = formatOverdraftAmount;
                            }
                        }
                        obj = str;
                        if (obj == null) {
                        }
                        str2 = formatOverdraftAmount;
                    }
                    BalanceHomeViewModel.Loaded loaded = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea, r31, z, str2);
                    gapComposer.end(z2);
                    gapComposer.end(z2);
                    return loaded;
                }
            }
            if (state_6 != null) {
                OverdraftStatus.State_.Activated activated = state_6 instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_6 : null;
                OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                if (activated2 != null) {
                    LocalizedString localizedString5 = activated2.localized_usage_summary_label;
                    if (localizedString5 == null || (str5 = localizedString5.translated_value) == null) {
                        overdraftPillViewModel4 = BalanceHomeViewModel.OverdraftPillViewModel.On.INSTANCE;
                        overdraftPillViewModel = overdraftPillViewModel4;
                        overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
                        if (overdraftStatus == null) {
                        }
                        Disclosure disclosure3 = (Disclosure) collectAsState.getValue();
                        if (disclosure3 == null) {
                        }
                        Disclosure disclosure22 = (Disclosure) collectAsState.getValue();
                        if (disclosure22 == null) {
                        }
                        BalanceHomeUi$FocusArea balanceHomeUi$FocusArea2 = this.args.focusArea;
                        if (((Boolean) collectAsState9.getValue()).booleanValue()) {
                        }
                        z = this.evergreenOverdraftEnabled;
                        if (z) {
                        }
                        BalanceHomeViewModel.Loaded loaded2 = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea2, r31, z, str2);
                        gapComposer.end(z2);
                        gapComposer.end(z2);
                        return loaded2;
                    }
                    overdraftPillViewModel3 = new BalanceHomeViewModel.OverdraftPillViewModel.Used(str5, true, z2);
                    overdraftPillViewModel = overdraftPillViewModel3;
                    overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
                    if (overdraftStatus == null) {
                    }
                    Disclosure disclosure32 = (Disclosure) collectAsState.getValue();
                    if (disclosure32 == null) {
                    }
                    Disclosure disclosure222 = (Disclosure) collectAsState.getValue();
                    if (disclosure222 == null) {
                    }
                    BalanceHomeUi$FocusArea balanceHomeUi$FocusArea22 = this.args.focusArea;
                    if (((Boolean) collectAsState9.getValue()).booleanValue()) {
                    }
                    z = this.evergreenOverdraftEnabled;
                    if (z) {
                    }
                    BalanceHomeViewModel.Loaded loaded22 = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea22, r31, z, str2);
                    gapComposer.end(z2);
                    gapComposer.end(z2);
                    return loaded22;
                }
            }
            if (state_6 != null) {
                OverdraftStatus.State_.Disabled disabled = state_6 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_6 : null;
                OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                if (disabled2 != null) {
                    LocalizedString localizedString6 = disabled2.localized_usage_summary_label;
                    overdraftPillViewModel2 = (localizedString6 == null || (str4 = localizedString6.translated_value) == null) ? BalanceHomeViewModel.OverdraftPillViewModel.Off.INSTANCE : new BalanceHomeViewModel.OverdraftPillViewModel.Used(str4, z2, Intrinsics.areEqual(disabled2.needs_alert_treatment, Boolean.TRUE));
                    if (overdraftPillViewModel2 != null) {
                        if (state_6 != null) {
                            OverdraftStatus.State_.Upsell upsell3 = state_6 instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_6 : null;
                            if ((upsell3 != null ? upsell3.value : null) != null) {
                                overdraftPillViewModel3 = BalanceHomeViewModel.OverdraftPillViewModel.Upsell.INSTANCE;
                                if (overdraftPillViewModel3 == null) {
                                    if (state_6 != null) {
                                        OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled = state_6 instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_6 : null;
                                        OverdraftStatus.PermanentlyDisabled permanentlyDisabled2 = permanentlyDisabled != null ? permanentlyDisabled.value : null;
                                        if (permanentlyDisabled2 != null && (localizedString = permanentlyDisabled2.localized_usage_summary_label) != null && (str3 = localizedString.translated_value) != null) {
                                            overdraftPillViewModel = new BalanceHomeViewModel.OverdraftPillViewModel.Used(str3, z2, Intrinsics.areEqual(permanentlyDisabled2.needs_alert_treatment, Boolean.TRUE));
                                        }
                                    }
                                }
                                overdraftPillViewModel = overdraftPillViewModel3;
                            }
                        }
                        overdraftPillViewModel3 = null;
                        if (overdraftPillViewModel3 == null) {
                        }
                        overdraftPillViewModel = overdraftPillViewModel3;
                    } else {
                        overdraftPillViewModel = overdraftPillViewModel2;
                    }
                    overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
                    if (overdraftStatus == null) {
                    }
                    Disclosure disclosure322 = (Disclosure) collectAsState.getValue();
                    if (disclosure322 == null) {
                    }
                    Disclosure disclosure2222 = (Disclosure) collectAsState.getValue();
                    if (disclosure2222 == null) {
                    }
                    BalanceHomeUi$FocusArea balanceHomeUi$FocusArea222 = this.args.focusArea;
                    if (((Boolean) collectAsState9.getValue()).booleanValue()) {
                    }
                    z = this.evergreenOverdraftEnabled;
                    if (z) {
                    }
                    BalanceHomeViewModel.Loaded loaded222 = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea222, r31, z, str2);
                    gapComposer.end(z2);
                    gapComposer.end(z2);
                    return loaded222;
                }
            }
            overdraftPillViewModel2 = null;
            if (overdraftPillViewModel2 != null) {
            }
            overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
            if (overdraftStatus == null) {
            }
            Disclosure disclosure3222 = (Disclosure) collectAsState.getValue();
            if (disclosure3222 == null) {
            }
            Disclosure disclosure22222 = (Disclosure) collectAsState.getValue();
            if (disclosure22222 == null) {
            }
            BalanceHomeUi$FocusArea balanceHomeUi$FocusArea2222 = this.args.focusArea;
            if (((Boolean) collectAsState9.getValue()).booleanValue()) {
            }
            z = this.evergreenOverdraftEnabled;
            if (z) {
            }
            BalanceHomeViewModel.Loaded loaded2222 = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea2222, r31, z, str2);
            gapComposer.end(z2);
            gapComposer.end(z2);
            return loaded2222;
        }
        overdraftPillViewModel = null;
        overdraftStatus = (OverdraftStatus) collectAsState4.getValue();
        if (overdraftStatus == null) {
        }
        Disclosure disclosure32222 = (Disclosure) collectAsState.getValue();
        if (disclosure32222 == null) {
        }
        Disclosure disclosure222222 = (Disclosure) collectAsState.getValue();
        if (disclosure222222 == null) {
        }
        BalanceHomeUi$FocusArea balanceHomeUi$FocusArea22222 = this.args.focusArea;
        if (((Boolean) collectAsState9.getValue()).booleanValue()) {
        }
        z = this.evergreenOverdraftEnabled;
        if (z) {
        }
        BalanceHomeViewModel.Loaded loaded22222 = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, overdraftPillViewModel, accountDetailsViewModel, overdraftUpsellViewModel, callToActionViewModel, models, str9, z3, balanceHomeUi$FocusArea22222, r31, z, str2);
        gapComposer.end(z2);
        gapComposer.end(z2);
        return loaded22222;
    }
}
