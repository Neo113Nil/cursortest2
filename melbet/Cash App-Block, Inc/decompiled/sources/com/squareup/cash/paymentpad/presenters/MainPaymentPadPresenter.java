package com.squareup.cash.paymentpad.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.paraphrase.FormattedResource;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.cash.CashRequestStart;
import com.squareup.cash.cdf.cash.CashSendStart;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$CoreP2pFlowRedesign;
import com.squareup.cash.featureflags.AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePayLinksSender;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pPools;
import com.squareup.cash.featureflags.AmplitudeExperiments$ProjectMintHypeAnimations;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MintHypeDrop;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.presenters.HypeEligibilityProvider;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.paymentpad.viewmodels.FiatResetAmount;
import com.squareup.cash.paymentpad.viewmodels.HypeConfig;
import com.squareup.cash.paymentpad.viewmodels.LimitHelperTextConfiguration;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.internal.GrpcDecoderKt;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class MainPaymentPadPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final KeyValue hypeAnimationLastShownTimestamp;
    public final HypeEligibilityProvider hypeEligibilityProvider;
    public final RealMainPaymentPadRefresher mainPaymentPadRefresher;
    public final MoneyFormatter moneyFormatterNoSymbol;
    public final MoneyFormatter moneyFormatterStandard;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final RealPaymentTabSettings paymentTabSettings;
    public final RealProfileManager profileManager;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final RealTapToPayAnalyticsHelper tapToPayAnalyticsHelper;
    public final RealTapToPayEligibilityProvider tapToPayEligibilityProvider;

    public final class State {
        public final CurrencyCode defaultFiatCurrencyCode;
        public final String errorMessage;
        public final Long fiatAmountCents;
        public final String fiatAmountErrorId;
        public final boolean forceReset;
        public final HypeConfig hypeConfig;
        public final boolean isBusinessAccount;
        public final boolean isRestoring;
        public final boolean isTapToPayEligible;
        public final PaymentPadTheme paymentPadTheme;
        public final String rawAmount;

        public State(String str, CurrencyCode currencyCode, Long l, String str2, String str3, boolean z, boolean z2, PaymentPadTheme paymentPadTheme, boolean z3, boolean z4, HypeConfig hypeConfig) {
            paymentPadTheme.getClass();
            this.rawAmount = str;
            this.defaultFiatCurrencyCode = currencyCode;
            this.fiatAmountCents = l;
            this.fiatAmountErrorId = str2;
            this.errorMessage = str3;
            this.forceReset = z;
            this.isRestoring = z2;
            this.paymentPadTheme = paymentPadTheme;
            this.isTapToPayEligible = z3;
            this.isBusinessAccount = z4;
            this.hypeConfig = hypeConfig;
        }

        public static State copy$default(State state, String str, CurrencyCode currencyCode, Long l, String str2, String str3, boolean z, boolean z2, PaymentPadTheme paymentPadTheme, boolean z3, boolean z4, HypeConfig hypeConfig, int i) {
            if ((i & 1) != 0) {
                str = state.rawAmount;
            }
            String str4 = str;
            if ((i & 2) != 0) {
                state.getClass();
            }
            if ((i & 4) != 0) {
                currencyCode = state.defaultFiatCurrencyCode;
            }
            CurrencyCode currencyCode2 = currencyCode;
            if ((i & 8) != 0) {
                l = state.fiatAmountCents;
            }
            Long l2 = l;
            String str5 = (i & 16) != 0 ? state.fiatAmountErrorId : str2;
            String str6 = (i & 32) != 0 ? state.errorMessage : str3;
            boolean z5 = (i & 64) != 0 ? state.forceReset : z;
            boolean z6 = (i & 128) != 0 ? state.isRestoring : z2;
            PaymentPadTheme paymentPadTheme2 = (i & 256) != 0 ? state.paymentPadTheme : paymentPadTheme;
            boolean z7 = (i & 512) != 0 ? state.isTapToPayEligible : z3;
            boolean z8 = (i & 1024) != 0 ? state.isBusinessAccount : z4;
            HypeConfig hypeConfig2 = (i & 2048) != 0 ? state.hypeConfig : hypeConfig;
            state.getClass();
            paymentPadTheme2.getClass();
            return new State(str4, currencyCode2, l2, str5, str6, z5, z6, paymentPadTheme2, z7, z8, hypeConfig2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.rawAmount, state.rawAmount) && this.defaultFiatCurrencyCode == state.defaultFiatCurrencyCode && Intrinsics.areEqual(this.fiatAmountCents, state.fiatAmountCents) && Intrinsics.areEqual(this.fiatAmountErrorId, state.fiatAmountErrorId) && Intrinsics.areEqual(this.errorMessage, state.errorMessage) && this.forceReset == state.forceReset && this.isRestoring == state.isRestoring && this.paymentPadTheme == state.paymentPadTheme && this.isTapToPayEligible == state.isTapToPayEligible && this.isBusinessAccount == state.isBusinessAccount && Intrinsics.areEqual(this.hypeConfig, state.hypeConfig);
        }

        public final int hashCode() {
            String str = this.rawAmount;
            int hashCode = (str == null ? 0 : str.hashCode()) * 961;
            CurrencyCode currencyCode = this.defaultFiatCurrencyCode;
            int hashCode2 = (hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31;
            Long l = this.fiatAmountCents;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.fiatAmountErrorId;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorMessage;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.paymentPadTheme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.forceReset), 31, this.isRestoring)) * 31, 31, this.isTapToPayEligible), 31, this.isBusinessAccount);
            HypeConfig hypeConfig = this.hypeConfig;
            return m + (hypeConfig != null ? hypeConfig.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(rawAmount=");
            sb.append(this.rawAmount);
            sb.append(", formattedExchangedMoney=null, defaultFiatCurrencyCode=");
            sb.append(this.defaultFiatCurrencyCode);
            sb.append(", fiatAmountCents=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.fiatAmountCents, ", fiatAmountErrorId=", this.fiatAmountErrorId, ", errorMessage=", sb);
            NavAction$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", forceReset=", this.forceReset, ", isRestoring=");
            sb.append(this.isRestoring);
            sb.append(", paymentPadTheme=");
            sb.append(this.paymentPadTheme);
            sb.append(", isTapToPayEligible=");
            re$$ExternalSyntheticOutline0.m(sb, this.isTapToPayEligible, ", isBusinessAccount=", this.isBusinessAccount, ", hypeConfig=");
            sb.append(this.hypeConfig);
            sb.append(")");
            return sb.toString();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MainPaymentPadPresenter(RealUuidGenerator realUuidGenerator, RealMainPaymentPadRefresher realMainPaymentPadRefresher, RealProfileManager realProfileManager, RealPaymentTabSettings realPaymentTabSettings, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, RealTapToPayEligibilityProvider realTapToPayEligibilityProvider, RealP2pSettingsManager realP2pSettingsManager, BetterNavigator.ScreenNavigator screenNavigator, TreehouseScreenFactory treehouseScreenFactory, FeatureFlagManager featureFlagManager, RealFamilyAccountsManager realFamilyAccountsManager, Analytics analytics, AndroidClock androidClock, KeyValue keyValue, HypeEligibilityProvider hypeEligibilityProvider, SyncValueReader syncValueReader) {
        this.mainPaymentPadRefresher = realMainPaymentPadRefresher;
        this.profileManager = realProfileManager;
        this.paymentTabSettings = realPaymentTabSettings;
        this.stringManager = androidStringManager;
        this.tapToPayAnalyticsHelper = realTapToPayAnalyticsHelper;
        this.tapToPayEligibilityProvider = realTapToPayEligibilityProvider;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.navigator = screenNavigator;
        this.featureFlagManager = featureFlagManager;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.analytics = analytics;
        this.clock = androidClock;
        this.hypeAnimationLastShownTimestamp = keyValue;
        this.hypeEligibilityProvider = hypeEligibilityProvider;
        this.syncValueReader = syncValueReader;
        this.moneyFormatterStandard = factory.create(MoneyFormatterConfig.COMPACT);
        this.moneyFormatterNoSymbol = factory.createNoSymbolCompact();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final State access$initiateFiatPayment(MainPaymentPadPresenter mainPaymentPadPresenter, State state, Orientation orientation) {
        FormattedResource formattedResource;
        Event cashRequestStart;
        Screen paymentConfiguration;
        Long l = state.fiatAmountCents;
        CurrencyCode currencyCode = state.defaultFiatCurrencyCode;
        boolean z = false;
        RedactedString redactedString = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!(currencyCode != null) == true || (l != null && l.longValue() < Moneys.displayDivisor(currencyCode))) {
            String format2 = mainPaymentPadPresenter.moneyFormatterStandard.format(new Money(Long.valueOf((long) Moneys.displayDivisor(currencyCode)), (CurrencyCode) null, 6));
            String uuid = RealUuidGenerator.generate().toString();
            AndroidStringManager androidStringManager = mainPaymentPadPresenter.stringManager;
            int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
            if (i == 1) {
                format2.getClass();
                formattedResource = new FormattedResource(R.string.minimum_amount_send_error, new Object[]{format2});
            } else {
                if (i != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                format2.getClass();
                formattedResource = new FormattedResource(R.string.minimum_amount_request_error, new Object[]{format2});
            }
            return State.copy$default(state, null, null, null, uuid, Countries.getString(androidStringManager.resources, formattedResource), false, false, null, false, false, null, 4047);
        }
        UUID generate = RealUuidGenerator.generate();
        String m = re$$ExternalSyntheticOutline0.m();
        Analytics analytics = mainPaymentPadPresenter.analytics;
        if (orientation == Orientation.CASH) {
            cashRequestStart = new CashSendStart(l != null ? Double.valueOf(l.longValue()) : null, m);
        } else {
            cashRequestStart = new CashRequestStart(l != null ? Double.valueOf(l.longValue()) : null, m);
        }
        analytics.track(cashRequestStart, null);
        RealMainPaymentPadRefresher realMainPaymentPadRefresher = mainPaymentPadPresenter.mainPaymentPadRefresher;
        String uuid2 = generate.toString();
        uuid2.getClass();
        realMainPaymentPadRefresher.transactionIdsCreated.add(uuid2);
        BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPadPresenter.navigator;
        FeatureFlagManager featureFlagManager = mainPaymentPadPresenter.paymentTabSettings.featureFlagManager;
        if (orientation == Orientation.BILL) {
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobilePayLinksSender.INSTANCE)).enabled()) {
                z = true;
            }
        }
        if (!z) {
            if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
                paymentConfiguration = new PaymentScreens.MainPayment(new Money(l, currencyCode, 4), orientation, AppCreationActivity.HOMESCREEN, generate, null, null, null, null, 65016);
                screenNavigator.goTo(paymentConfiguration);
                return State.copy$default(state, null, null, null, null, null, false, false, null, false, false, null, 4047);
            }
        }
        Money money = new Money(l, currencyCode, 4);
        int i2 = 3;
        paymentConfiguration = new PaymentScreens.PaymentConfiguration(generate, money, orientation, PaymentScreens$HomeScreens$PaymentPad.INSTANCE, (AppCreationActivity) null, (String) null, (String) null, m, z ? new PaymentConfigurationFlow.PayLink(new PaymentFlowData.StandardFlowData(redactedString, objArr3 == true ? 1 : 0, i2), null) : new PaymentConfigurationFlow.Default(new PaymentFlowData.StandardFlowData(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i2), true), (BlockersData.MoneybotContext) null, 1252);
        screenNavigator.goTo(paymentConfiguration);
        return State.copy$default(state, null, null, null, null, null, false, false, null, false, false, null, 4047);
    }

    public static long getAmountInCents(String str) {
        return MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d);
    }

    public static final State initiateTTPPayment$copyToErrorState(MainPaymentPadPresenter mainPaymentPadPresenter, State state, boolean z, long j) {
        FormattedResource formattedResource;
        String format2 = mainPaymentPadPresenter.moneyFormatterStandard.format(new Money(Long.valueOf(j), (CurrencyCode) null, 6));
        String uuid = RealUuidGenerator.generate().toString();
        AndroidStringManager androidStringManager = mainPaymentPadPresenter.stringManager;
        if (z) {
            format2.getClass();
            formattedResource = new FormattedResource(R.string.minimum_amount_ttp_error, new Object[]{format2});
        } else {
            format2.getClass();
            formattedResource = new FormattedResource(R.string.maximum_amount_ttp_error, new Object[]{format2});
        }
        return State.copy$default(state, null, null, null, uuid, Countries.getString(androidStringManager.resources, formattedResource), false, false, null, false, false, null, 4047);
    }

    public static State updateConvertedFiatMoney(State state) {
        return State.copy$default(state, null, null, null, null, null, false, false, null, false, false, null, 4093);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final MainPaymentPadViewModel models(Flow flow, Composer composer, int i) {
        Object dotGridKt$DotGrid$3$1;
        GapComposer gapComposer;
        CurrencyCode currencyCode;
        MutableState mutableState;
        Boolean bool;
        Boolean bool2;
        MutableState mutableState2;
        MainPaymentPadPresenter mainPaymentPadPresenter;
        MutableState mutableState3;
        LocalizedString localizedString;
        String str;
        Long l;
        FiatResetAmount fiatResetAmount;
        String str2;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1872520466);
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = FlowKt.distinctUntilChanged(new RealDisclosureProvider$special$$inlined$map$1(this.profileManager.profile(), 18));
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        CurrencyCode currencyCode2 = CurrencyCode.USD;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, currencyCode2, null, gapComposer2, 48, 2);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = this.mainPaymentPadRefresher.shouldResetAmount;
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        Boolean bool3 = Boolean.FALSE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, bool3, null, gapComposer2, 48, 2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        RealPaymentTabSettings realPaymentTabSettings = this.paymentTabSettings;
        if (rememberedValue3 == obj) {
            rememberedValue3 = realPaymentTabSettings._paymentPadThemeFlow;
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        Continuation continuation = null;
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue3, null, gapComposer2, 1);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = this.tapToPayEligibilityProvider.isEligible();
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue4, bool3, null, gapComposer2, 48, 2);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(updateConvertedFiatMoney(new State(null, (CurrencyCode) collectAsState.getValue(), null, null, null, false, false, (PaymentPadTheme) collectAsState3.getValue(), false, false, null)));
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState4 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == obj) {
            Object moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.p2pSettingsManager.select(), 24);
            gapComposer2.updateRememberedValue(moneyTabPresenter$models$lambda$31$$inlined$map$1);
            rememberedValue6 = moneyTabPresenter$models$lambda$31$$inlined$map$1;
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer2, 48, 2);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = this.sponsorshipStateProvider.isSponsored();
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue7, bool3, null, gapComposer2, 48, 2);
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) collectAsState3.getValue();
        boolean changed = gapComposer2.changed(collectAsState3);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (changed || rememberedValue8 == obj) {
            rememberedValue8 = new OffersHomePresenter$models$2$1(mutableState4, collectAsState3, continuation, 8);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer2, paymentPadTheme, (Function2) rememberedValue8);
        CurrencyCode currencyCode3 = (CurrencyCode) collectAsState.getValue();
        Boolean bool4 = (Boolean) collectAsState2.getValue();
        bool4.getClass();
        Boolean bool5 = (Boolean) collectAsState4.getValue();
        bool5.getClass();
        boolean changedInstance = gapComposer2.changedInstance(this) | gapComposer2.changed(collectAsState) | gapComposer2.changed(collectAsState4);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue9 == obj) {
            gapComposer = gapComposer2;
            currencyCode = currencyCode3;
            mutableState = collectAsState6;
            bool = bool5;
            bool2 = bool4;
            dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, (Object) mutableState4, (Object) collectAsState, (Object) collectAsState4, (Continuation) null, 17);
            mutableState2 = mutableState4;
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
        } else {
            bool2 = bool4;
            mutableState = collectAsState6;
            dotGridKt$DotGrid$3$1 = rememberedValue9;
            mutableState2 = mutableState4;
            gapComposer = gapComposer2;
            currencyCode = currencyCode3;
            bool = bool5;
        }
        Updater.LaunchedEffect(currencyCode, bool2, bool, (Function2) dotGridKt$DotGrid$3$1, gapComposer);
        Boolean bool6 = (Boolean) collectAsState5.getValue();
        boolean changed2 = gapComposer.changed(collectAsState5);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue10 == obj) {
            rememberedValue10 = new OffersHomePresenter$models$2$1(mutableState2, collectAsState5, null, 9);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect(gapComposer, bool6, (Function2) rememberedValue10);
        Object[] objArr = new Object[0];
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj) {
            rememberedValue11 = new MainPaymentViewKt$$ExternalSyntheticLambda0(3);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Object obj2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue11, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState3) | gapComposer.changed(obj2);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue12 == obj) {
            MutableState mutableState5 = mutableState2;
            Object phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(this, collectAsState3, mutableState5, obj2, null, 3);
            mainPaymentPadPresenter = this;
            mutableState3 = mutableState5;
            gapComposer.updateRememberedValue(phonePlansHomePresenter$models$1$1);
            rememberedValue12 = phonePlansHomePresenter$models$1$1;
        } else {
            mainPaymentPadPresenter = this;
            mutableState3 = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue12);
        AmplitudeExperiments$ProjectMintHypeAnimations amplitudeExperiments$ProjectMintHypeAnimations = AmplitudeExperiments$ProjectMintHypeAnimations.INSTANCE;
        FeatureFlagManager featureFlagManager = mainPaymentPadPresenter.featureFlagManager;
        MutableState collectExperimentAsState = ObjectUtils.collectExperimentAsState(featureFlagManager, amplitudeExperiments$ProjectMintHypeAnimations, gapComposer);
        boolean z = Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState.getValue()).value, "all") || Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState.getValue()).value, "paymentpad");
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj) {
            rememberedValue13 = Trace.valuesState(featureFlagManager, JsonFeatureFlags$MintHypeDrop.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState7 = Updater.collectAsState((StateFlow) rememberedValue13, null, gapComposer, 1);
        String str3 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).symbol;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).launchDate;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).startDate;
        String str6 = str5 != null ? str5 : "";
        AndroidClock androidClock = mainPaymentPadPresenter.clock;
        boolean z2 = GrpcDecoderKt.computeNextAvailableCashTag(str3, str4, str6, DimensionKt.nowLocalDate(androidClock)) != null;
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == obj) {
            rememberedValue14 = mainPaymentPadPresenter.hypeEligibilityProvider.isEligible();
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        GapComposer gapComposer3 = gapComposer;
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue14, bool3, null, gapComposer3, 48, 2);
        Object rememberedValue15 = gapComposer3.rememberedValue();
        if (rememberedValue15 == obj) {
            rememberedValue15 = mainPaymentPadPresenter.hypeAnimationLastShownTimestamp.observe();
            gapComposer3.updateRememberedValue(rememberedValue15);
        }
        MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue15, Long.valueOf(androidClock.millis()), null, gapComposer3, 0, 2);
        Object rememberedValue16 = gapComposer3.rememberedValue();
        if (rememberedValue16 == obj) {
            rememberedValue16 = Updater.mutableStateOf$default(bool3);
            gapComposer3.updateRememberedValue(rememberedValue16);
        }
        MutableState mutableState6 = (MutableState) rememberedValue16;
        if (!((Boolean) mutableState6.getValue()).booleanValue() && ((Boolean) collectAsState8.getValue()).booleanValue() && z && z2 && !Intrinsics.areEqual(DimensionKt.nowLocalDate(androidClock), DimensionKt.millisToLocalDate(((Number) collectAsState9.getValue()).longValue(), androidClock.timeZone()))) {
            mutableState6.setValue(Boolean.TRUE);
        }
        Boolean bool7 = (Boolean) mutableState6.getValue();
        bool7.getClass();
        boolean changedInstance3 = gapComposer3.changedInstance(mainPaymentPadPresenter);
        Object rememberedValue17 = gapComposer3.rememberedValue();
        if (changedInstance3 || rememberedValue17 == obj) {
            rememberedValue17 = new OverlayKt$Overlay$1$1$1$1$1(mutableState6, mainPaymentPadPresenter, null, 13);
            gapComposer3.updateRememberedValue(rememberedValue17);
        }
        Updater.LaunchedEffect(gapComposer3, bool7, (Function2) rememberedValue17);
        Object rememberedValue18 = gapComposer3.rememberedValue();
        if (rememberedValue18 == obj) {
            rememberedValue18 = mainPaymentPadPresenter.syncValueReader.getSingleValue(AndroidSyncValueSpecs.P2pControl);
            gapComposer3.updateRememberedValue(rememberedValue18);
        }
        MutableState collectAsState10 = Updater.collectAsState((StateFlow) rememberedValue18, null, gapComposer3, 1);
        AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment amplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment = AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment.INSTANCE;
        Object rememberedValue19 = gapComposer3.rememberedValue();
        if (rememberedValue19 == obj) {
            rememberedValue19 = new HelpSheetViewKt$$ExternalSyntheticLambda4(28);
            gapComposer3.updateRememberedValue(rememberedValue19);
        }
        Function1 function1 = (Function1) rememberedValue19;
        amplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment.getClass();
        function1.getClass();
        Object rememberedValue20 = gapComposer3.rememberedValue();
        if (rememberedValue20 == obj) {
            rememberedValue20 = StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, amplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment), function1);
            gapComposer3.updateRememberedValue(rememberedValue20);
        }
        MutableState collectAsState11 = Updater.collectAsState((StateFlow) rememberedValue20, null, gapComposer3, 1);
        MutableState mutableState7 = mutableState3;
        Updater.LaunchedEffect(gapComposer3, flow, new DbSessionManager$updateDb$2(flow, null, this, mutableState7, collectAsState2, mutableState6, mutableState, 18));
        State state = (State) mutableState7.getValue();
        boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) collectAsState11.getValue()).booleanValue();
        P2PControl p2PControl = (P2PControl) collectAsState10.getValue();
        LimitHelperTextConfiguration limitHelperTextConfiguration = (p2PControl == null || (localizedString = p2PControl.limit_helper_text) == null || (str = localizedString.translated_value) == null || (l = p2PControl.limit_amount_cents) == null) ? null : new LimitHelperTextConfiguration(str, l.longValue());
        String str7 = state.rawAmount;
        Long l2 = state.fiatAmountCents;
        CurrencyCode currencyCode4 = state.defaultFiatCurrencyCode;
        if (str7 == null) {
            str7 = "0";
        }
        String str8 = str7;
        CurrencyCode currencyCode5 = currencyCode4 == null ? currencyCode2 : currencyCode4;
        String str9 = state.fiatAmountErrorId;
        if (currencyCode4 == null || !state.forceReset || l2 == null) {
            fiatResetAmount = null;
        } else {
            currencyCode4.getClass();
            Money money = new Money(l2, currencyCode4, 4);
            fiatResetAmount = new FiatResetAmount(money, this.moneyFormatterNoSymbol.format(money));
        }
        MainPaymentPadViewModel mainPaymentPadViewModel = new MainPaymentPadViewModel(str8, currencyCode5, str9, state.errorMessage, fiatResetAmount, state.isTapToPayEligible, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realPaymentTabSettings.featureFlagManager).currentValue(AmplitudeExperiments$P2pPools.INSTANCE)).enabled() && Boolean.valueOf(state.isBusinessAccount).equals(bool3), state.isRestoring, state.forceReset, state.paymentPadTheme, state.hypeConfig, booleanValue, (!booleanValue2 || limitHelperTextConfiguration == null || (str2 = state.rawAmount) == null || getAmountInCents(str2) <= limitHelperTextConfiguration.limitAmountCents) ? null : limitHelperTextConfiguration.text);
        gapComposer3.end(false);
        return mainPaymentPadViewModel;
    }
}
