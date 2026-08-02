package com.squareup.cash.bitcoin.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import app.cash.paraphrase.FormattedResource;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.libraries.places.api.model.zzco;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadError$MaxLimitError;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadError$MinLimitError;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.Dependent;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Gone;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$InitialLoading;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsFooterViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsPrivacySectionModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$FamiliesSponsorDrivenAllowlist;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Countries;
import com.stripe.android.stripe3ds2.transaction.Logger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class RealBitcoinAmountPickerPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object activityEvents;
    public final Object appBackgroundedListener;
    public final Object args;
    public boolean hasError;
    public Object initialAmount;
    public final Object initialMoneyFormatter;
    public final Object keypadEvents;
    public final Object keypadPresenter;
    public final Object keypadStateStore;
    public final Object maximumAmount;
    public final Object minimumAmount;
    public final Object moneyFormatter;
    public final Object navigator;
    public final Object purpose;
    public final AndroidStringManager stringManager;

    public final class State implements BitcoinKeypadStateStore$SharedState {
        public final boolean actionTapped;
        public final BitcoinKeypadStateStore$State bitcoinKeypadState;
        public final String note;

        public State(BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State, boolean z, String str) {
            this.bitcoinKeypadState = bitcoinKeypadStateStore$State;
            this.actionTapped = z;
            this.note = str;
        }

        public static State copy$default(State state, BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State, String str, int i) {
            if ((i & 1) != 0) {
                bitcoinKeypadStateStore$State = state.bitcoinKeypadState;
            }
            boolean z = (i & 2) != 0 ? state.actionTapped : true;
            if ((i & 4) != 0) {
                str = state.note;
            }
            state.getClass();
            return new State(bitcoinKeypadStateStore$State, z, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.bitcoinKeypadState.equals(state.bitcoinKeypadState) && this.actionTapped == state.actionTapped && Intrinsics.areEqual(this.note, state.note);
        }

        @Override // com.squareup.cash.bitcoin.presenters.BitcoinKeypadStateStore$SharedState
        public final BitcoinKeypadStateStore$State getBitcoinKeypadState() {
            return this.bitcoinKeypadState;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bitcoinKeypadState.hashCode() * 31, 31, this.actionTapped);
            String str = this.note;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(bitcoinKeypadState=");
            sb.append(this.bitcoinKeypadState);
            sb.append(", actionTapped=");
            sb.append(this.actionTapped);
            sb.append(", note=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.note, ")");
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BitcoinAmountPickerScreen.AmountPickerPurpose.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BitcoinAmountPickerScreen.AmountPickerPurpose amountPickerPurpose = BitcoinAmountPickerScreen.AmountPickerPurpose.WITHDRAWAL;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BitcoinDisplayUnits.values().length];
            try {
                iArr2[BitcoinDisplayUnits.BITCOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BitcoinDisplayUnits.SATOSHIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BitcoinDisplayUnits.BITCOIN_SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CurrencyCode.values().length];
            try {
                iArr3[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public RealBitcoinAmountPickerPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen, BetterNavigator.ScreenNavigator screenNavigator, RealDependentControlStatusManager.Factory factory, RealFamilyAccountsManager realFamilyAccountsManager, BlocklyService blocklyService, Analytics analytics) {
        final int i = 1;
        dependentControlsAndLimitsScreen.getClass();
        this.keypadPresenter = realCustomerStore;
        this.stringManager = androidStringManager;
        this.activityEvents = dependentControlsAndLimitsScreen;
        this.minimumAmount = screenNavigator;
        this.maximumAmount = factory;
        this.initialAmount = realFamilyAccountsManager;
        this.args = blocklyService;
        this.navigator = analytics;
        this.appBackgroundedListener = realRouter$Factory$Impl.create$1(screenNavigator);
        ControlType controlType = ControlType.P2P;
        String str = dependentControlsAndLimitsScreen.dependentCustomerToken;
        this.moneyFormatter = factory.create(controlType, str);
        this.initialMoneyFormatter = factory.create(ControlType.CASH_CARD, str);
        this.purpose = factory.create(ControlType.PROMOTIONS, str);
        final int i2 = 0;
        this.keypadStateStore = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ RealBitcoinAmountPickerPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = this.f$0;
                switch (i3) {
                    case 0:
                        ControlType controlType2 = ControlType.STOCKS;
                        RealDependentControlStatusManager.Factory factory2 = (RealDependentControlStatusManager.Factory) realBitcoinAmountPickerPresenter.maximumAmount;
                        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen2 = (DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents;
                        RealDependentControlStatusManager create = factory2.create(controlType2, dependentControlsAndLimitsScreen2.dependentCustomerToken);
                        if (dependentControlsAndLimitsScreen2.forManagedAccount) {
                            return null;
                        }
                        return create;
                    default:
                        ControlType controlType3 = ControlType.BITCOIN;
                        RealDependentControlStatusManager.Factory factory3 = (RealDependentControlStatusManager.Factory) realBitcoinAmountPickerPresenter.maximumAmount;
                        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen3 = (DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents;
                        RealDependentControlStatusManager create2 = factory3.create(controlType3, dependentControlsAndLimitsScreen3.dependentCustomerToken);
                        if (dependentControlsAndLimitsScreen3.forManagedAccount) {
                            return null;
                        }
                        return create2;
                }
            }
        });
        this.keypadEvents = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ RealBitcoinAmountPickerPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = this.f$0;
                switch (i3) {
                    case 0:
                        ControlType controlType2 = ControlType.STOCKS;
                        RealDependentControlStatusManager.Factory factory2 = (RealDependentControlStatusManager.Factory) realBitcoinAmountPickerPresenter.maximumAmount;
                        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen2 = (DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents;
                        RealDependentControlStatusManager create = factory2.create(controlType2, dependentControlsAndLimitsScreen2.dependentCustomerToken);
                        if (dependentControlsAndLimitsScreen2.forManagedAccount) {
                            return null;
                        }
                        return create;
                    default:
                        ControlType controlType3 = ControlType.BITCOIN;
                        RealDependentControlStatusManager.Factory factory3 = (RealDependentControlStatusManager.Factory) realBitcoinAmountPickerPresenter.maximumAmount;
                        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen3 = (DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents;
                        RealDependentControlStatusManager create2 = factory3.create(controlType3, dependentControlsAndLimitsScreen3.dependentCustomerToken);
                        if (dependentControlsAndLimitsScreen3.forManagedAccount) {
                            return null;
                        }
                        return create2;
                }
            }
        });
        this.hasError = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$FamiliesSponsorDrivenAllowlist.INSTANCE)).enabled();
    }

    public DependentControlsAndLimitsViewModel createBaseViewModel(String str, String str2, String str3, DependentControlStatus dependentControlStatus, zzco zzcoVar, DependentControlStatus dependentControlStatus2, DependentControlStatus dependentControlStatus3, DependentControlStatus dependentControlStatus4, DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel, String str4, boolean z, boolean z2) {
        return new DependentControlsAndLimitsViewModel(this.stringManager.get(R.string.family_account_dependent_controls_and_limits_screen_toolbar_title), str2, str3, toRowState(dependentControlStatus, ControlType.P2P, str), zzcoVar, dependentControlStatus2 != null ? toRowState(dependentControlStatus2, ControlType.STOCKS, str) : null, dependentControlStatus3 != null ? toRowState(dependentControlStatus3, ControlType.BITCOIN, str) : null, toRowState(dependentControlStatus4, ControlType.PROMOTIONS, str), dependentControlsAndLimitsPrivacySectionModel, new DependentControlsAndLimitsFooterViewModel(str4, z), z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x04ec, code lost:
    
        if (r12 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04ee, code lost:
    
        r37 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x052d, code lost:
    
        if (r9 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x052f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04fb, code lost:
    
        if (r12 == null) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.String] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Money money;
        boolean z;
        String str;
        Continuation continuation;
        Lazy lazy;
        Continuation continuation2;
        DependentControlsAndLimitsViewModel createBaseViewModel;
        List list;
        int i2 = this.$r8$classId;
        Object obj4 = this.purpose;
        Object obj5 = this.initialMoneyFormatter;
        Object obj6 = this.moneyFormatter;
        Object obj7 = this.keypadPresenter;
        Object obj8 = Composer.Companion.Empty;
        Object obj9 = this.activityEvents;
        AndroidStringManager androidStringManager = this.stringManager;
        Object obj10 = this.keypadStateStore;
        Object obj11 = this.keypadEvents;
        switch (i2) {
            case 0:
                BitcoinAmountPickerScreen.AmountPickerPurpose amountPickerPurpose = (BitcoinAmountPickerScreen.AmountPickerPurpose) obj4;
                BitcoinAmountPickerScreen bitcoinAmountPickerScreen = (BitcoinAmountPickerScreen) this.args;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(541934371);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj8) {
                    String str2 = bitcoinAmountPickerScreen.note;
                    BitcoinDisplayUnits bitcoinDisplayUnits = BitcoinDisplayUnits.BITCOIN;
                    CurrencyCode currencyCode = CurrencyCode.BTC;
                    obj = obj9;
                    Money money2 = new Money((Long) 0L, currencyCode, 4);
                    obj2 = obj10;
                    obj3 = obj5;
                    CurrencyCode currencyCode2 = CurrencyCode.USD;
                    BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = new BitcoinKeypadStateStore$State(money2, new Money((Long) 0L, currencyCode2, 4), new Money((Long) 0L, currencyCode, 4), bitcoinDisplayUnits, new Money((Long) 0L, currencyCode, 4), new Money((Long) 0L, currencyCode2, 4), false, 3458);
                    Money money3 = (Money) this.initialAmount;
                    if (money3 == null) {
                        money3 = bitcoinKeypadStateStore$State.transferAmount;
                    }
                    rememberedValue = Updater.mutableStateOf$default(new State(BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State, money3, null, null, null, null, null, null, null, false, 4094), false, str2));
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    obj = obj9;
                    obj2 = obj10;
                    obj3 = obj5;
                }
                MutableState mutableState = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj8) {
                    rememberedValue2 = (Flow) obj;
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ActivityEvent activityEvent = (ActivityEvent) Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2).getValue();
                Continuation continuation3 = null;
                if (activityEvent != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer, activityEvent, new SetNameViewKt$SetName$2$1(activityEvent, continuation3, this, 10));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(1107907737);
                State state = (State) mutableState.getValue();
                BitcoinKeypadStateStore$State models = ((RealBitcoinKeypadStateStore) obj2).models((State) mutableState.getValue(), (SharedFlowImpl) obj11, gapComposer);
                state.getClass();
                models.getClass();
                mutableState.setValue(State.copy$default(state, models, null, 6));
                gapComposer.end(false);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == obj8) {
                    rememberedValue3 = new SearchBarBinding$Content$1$1(this, mutableState, continuation3, 29);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, amountPickerPurpose, (Function2) rememberedValue3);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj8) {
                    rememberedValue4 = new HeroTagViewKt$$ExternalSyntheticLambda12(5, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function2 function2 = (Function2) rememberedValue4;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changedInstance2 = gapComposer.changedInstance(answerDispatcher);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue5 == obj8) {
                    rememberedValue5 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 13);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, gapComposer);
                Updater.LaunchedEffect(gapComposer, flow, new BenefitsHubPresenter$models$1$1(20, mutableState, flow, this, continuation3));
                State state2 = (State) mutableState.getValue();
                String str3 = androidStringManager.get(R.string.bitcoin_amount_picker_next_button);
                boolean z2 = !state2.actionTapped;
                BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State2 = state2.bitcoinKeypadState;
                Money money4 = bitcoinKeypadStateStore$State2.lightningDepositLimitUsd;
                Money money5 = bitcoinKeypadStateStore$State2.availableBalance;
                RealBitcoinKeypadPresenter realBitcoinKeypadPresenter = (RealBitcoinKeypadPresenter) obj7;
                Money money6 = (Money) this.minimumAmount;
                if (money6 == null) {
                    money6 = bitcoinKeypadStateStore$State2.minimumWithdrawalLimit;
                }
                Money money7 = money6;
                Money money8 = (Money) this.maximumAmount;
                int ordinal = amountPickerPurpose.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (money8 == null) {
                        Money money9 = bitcoinKeypadStateStore$State2.valuePerBitcoin;
                        if (money9 != null && money4 != null) {
                            money8 = Moneys.convertBitcoinEquivalentAmount(money4, money9);
                            break;
                        } else {
                            money8 = null;
                            break;
                        }
                    }
                    money = money8;
                }
                BitcoinKeypadModel buildViewModel = realBitcoinKeypadPresenter.buildViewModel(BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State2, null, null, null, money, null, money7, null, null, bitcoinAmountPickerScreen.useSendVerbInLimitMessages, 2007));
                AndroidTileMode_androidKt androidTileMode_androidKt = buildViewModel.error;
                int ordinal2 = amountPickerPurpose.ordinal();
                if (ordinal2 == 0) {
                    if (androidTileMode_androidKt instanceof BitcoinKeypadError$MaxLimitError) {
                        z = false;
                        break;
                    } else {
                        z = false;
                    }
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!(androidTileMode_androidKt instanceof BitcoinKeypadError$MinLimitError)) {
                    }
                    z = false;
                }
                this.hasError = z;
                if (!z || androidTileMode_androidKt == null) {
                    androidTileMode_androidKt = null;
                } else {
                    int ordinal3 = amountPickerPurpose.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        } else if (androidTileMode_androidKt instanceof BitcoinKeypadError$MaxLimitError) {
                            if (money4 != null) {
                                String format2 = ((MoneyFormatter) obj6).format(money4);
                                format2.getClass();
                                Resources resources = androidStringManager.resources;
                                resources.getClass();
                                String format3 = new MessageFormat(resources.getString(R.string.weekly_limit)).format(new Object[]{format2});
                                format3.getClass();
                                androidTileMode_androidKt = new BitcoinKeypadError$MaxLimitError(format3, ((BitcoinKeypadError$MaxLimitError) androidTileMode_androidKt).depositLimitMessage);
                            } else {
                                androidTileMode_androidKt = (BitcoinKeypadError$MaxLimitError) androidTileMode_androidKt;
                            }
                        } else if (!(androidTileMode_androidKt instanceof BitcoinKeypadError$MinLimitError)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        return null;
                    }
                }
                BitcoinKeypadModel copy$default = BitcoinKeypadModel.copy$default(buildViewModel, "", androidTileMode_androidKt, 30);
                if (amountPickerPurpose == BitcoinAmountPickerScreen.AmountPickerPurpose.DEPOSIT) {
                    String str4 = state2.note;
                    if (str4 == null) {
                        str4 = androidStringManager.get(R.string.bitcoin_amount_add_note_button);
                    }
                    str = str4;
                } else {
                    str = null;
                }
                Money money10 = (Money) this.initialAmount;
                if (money10 != null) {
                    BitcoinDisplayUnits bitcoinDisplayUnits2 = bitcoinKeypadStateStore$State2.displayUnits;
                    bitcoinDisplayUnits2.getClass();
                    CurrencyCode currencyCode3 = money10.currency_code;
                    if ((currencyCode3 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[currencyCode3.ordinal()]) == 1) {
                        int i3 = WhenMappings.$EnumSwitchMapping$1[bitcoinDisplayUnits2.ordinal()];
                        if (i3 == 1) {
                            Long l = money10.amount;
                            l.getClass();
                            BigDecimal valueOf = BigDecimal.valueOf(l.longValue());
                            valueOf.getClass();
                            BigDecimal valueOf2 = BigDecimal.valueOf(100000000L);
                            valueOf2.getClass();
                            ?? bigDecimal = valueOf.divide(valueOf2, MathContext.DECIMAL32).toString();
                            bigDecimal.getClass();
                            continuation = bigDecimal;
                        } else {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    throw new NotImplementedError(null, 1, null);
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Long l2 = money10.amount;
                            l2.getClass();
                            continuation = String.valueOf(l2.longValue());
                        }
                    } else {
                        continuation = ((MoneyFormatter) obj3).format(money10);
                    }
                    continuation3 = continuation;
                }
                BitcoinAmountViewModel bitcoinAmountViewModel = new BitcoinAmountViewModel(2, copy$default, str3, str, continuation3, true, true, z2);
                gapComposer.end(false);
                return bitcoinAmountViewModel;
            default:
                Lazy lazy2 = (Lazy) obj11;
                Lazy lazy3 = (Lazy) obj10;
                Resources resources2 = androidStringManager.resources;
                DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen = (DependentControlsAndLimitsScreen) obj9;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(322685604);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue6 == obj8) {
                    rememberedValue6 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState2 = (MutableState) rememberedValue6;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(this);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue7 == obj8) {
                    rememberedValue7 = new GLSceneScopeProvider$SceneScope$2$1$1(this, mutableState2, continuation4, 7);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue7);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == obj8) {
                    rememberedValue8 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(((RealCustomerStore) obj7).getCustomerForId(dependentControlsAndLimitsScreen.dependentCustomerToken), 16), 3);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue8, "", null, gapComposer2, 48, 2);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (rememberedValue9 == obj8) {
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) this.initialAmount;
                    String str5 = dependentControlsAndLimitsScreen.dependentCustomerToken;
                    str5.getClass();
                    lazy = lazy3;
                    rememberedValue9 = new Transform$special$$inlined$map$1(new Transform$special$$inlined$map$1(realFamilyAccountsManager.syncValueReader.getAllValues(AndroidSyncValueSpecs.FamilyAccount, new RecipientQueries$$ExternalSyntheticLambda0(realFamilyAccountsManager, 24)), realFamilyAccountsManager, 3), str5, 2);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                } else {
                    lazy = lazy3;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer2, 48, 2);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (rememberedValue10 == obj8) {
                    rememberedValue10 = ((RealDependentControlStatusManager) obj6).dependentControlStatus;
                    gapComposer2.updateRememberedValue(rememberedValue10);
                }
                DependentControlStatus.InitialLoading initialLoading = DependentControlStatus.InitialLoading.INSTANCE;
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue10, initialLoading, null, gapComposer2, 0, 2);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                if (rememberedValue11 == obj8) {
                    rememberedValue11 = ((RealDependentControlStatusManager) obj5).dependentControlStatus;
                    gapComposer2.updateRememberedValue(rememberedValue11);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue11, initialLoading, null, gapComposer2, 0, 2);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (rememberedValue12 == obj8) {
                    RealDependentControlStatusManager realDependentControlStatusManager = (RealDependentControlStatusManager) lazy.getValue();
                    if (realDependentControlStatusManager == null || (rememberedValue12 = realDependentControlStatusManager.dependentControlStatus) == null) {
                        rememberedValue12 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    }
                    gapComposer2.updateRememberedValue(rememberedValue12);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue12, ((RealDependentControlStatusManager) lazy.getValue()) != null ? initialLoading : null, null, gapComposer2, 0, 2);
                Object rememberedValue13 = gapComposer2.rememberedValue();
                if (rememberedValue13 == obj8) {
                    RealDependentControlStatusManager realDependentControlStatusManager2 = (RealDependentControlStatusManager) lazy2.getValue();
                    if (realDependentControlStatusManager2 == null || (rememberedValue13 = realDependentControlStatusManager2.dependentControlStatus) == null) {
                        rememberedValue13 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    }
                    gapComposer2.updateRememberedValue(rememberedValue13);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue13, ((RealDependentControlStatusManager) lazy2.getValue()) != null ? initialLoading : null, null, gapComposer2, 0, 2);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (rememberedValue14 == obj8) {
                    rememberedValue14 = ((RealDependentControlStatusManager) obj4).dependentControlStatus;
                    gapComposer2.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue14, initialLoading, null, gapComposer2, 0, 2);
                Dependent dependent = (Dependent) collectAsState2.getValue();
                boolean z3 = (dependent != null ? dependent.sponsorshipState : null) == SponsorshipState.SUSPENDED;
                Dependent dependent2 = (Dependent) collectAsState2.getValue();
                SponsorshipState sponsorshipState = dependent2 != null ? dependent2.sponsorshipState : null;
                boolean changed = gapComposer2.changed(collectAsState2) | gapComposer2.changed(z3) | gapComposer2.changedInstance(this);
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (changed || rememberedValue15 == obj8) {
                    continuation2 = null;
                    rememberedValue15 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z3, collectAsState2, this, (Continuation) null);
                    gapComposer2.updateRememberedValue(rememberedValue15);
                } else {
                    continuation2 = null;
                }
                Updater.LaunchedEffect(gapComposer2, sponsorshipState, (Function2) rememberedValue15);
                boolean z4 = z3;
                Updater.LaunchedEffect(gapComposer2, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation2, this, mutableState2, 12));
                zzco rowState = z4 ? DependentControlRowState$Gone.INSTANCE : toRowState((DependentControlStatus) collectAsState4.getValue(), ControlType.CASH_CARD, (String) collectAsState.getValue());
                if (this.hasError) {
                    String str6 = (String) collectAsState.getValue();
                    DependentControlStatus dependentControlStatus = (DependentControlStatus) collectAsState3.getValue();
                    DependentControlStatus dependentControlStatus2 = (DependentControlStatus) collectAsState5.getValue();
                    DependentControlStatus dependentControlStatus3 = (DependentControlStatus) collectAsState6.getValue();
                    DependentControlStatus dependentControlStatus4 = (DependentControlStatus) collectAsState7.getValue();
                    String str7 = androidStringManager.get(R.string.family_account_dependent_controls_and_limits_screen_title_allowlist);
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("link", "https://internal.cash.app/dl/view/support/FAMILIES_LIMITS");
                    resources2.getClass();
                    String format4 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_and_limits_screen_footer_allowlist)).format(arrayMap);
                    format4.getClass();
                    createBaseViewModel = createBaseViewModel(str6, str7, null, dependentControlStatus, rowState, dependentControlStatus2, dependentControlStatus3, dependentControlStatus4, null, format4, true, true);
                } else {
                    String str8 = (String) collectAsState.getValue();
                    DependentControlStatus dependentControlStatus5 = (DependentControlStatus) collectAsState3.getValue();
                    DependentControlStatus dependentControlStatus6 = (DependentControlStatus) collectAsState5.getValue();
                    DependentControlStatus dependentControlStatus7 = (DependentControlStatus) collectAsState6.getValue();
                    DependentControlStatus dependentControlStatus8 = (DependentControlStatus) collectAsState7.getValue();
                    GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) mutableState2.getValue();
                    String str9 = androidStringManager.get(R.string.family_account_dependent_controls_and_limits_screen_title);
                    str8.getClass();
                    resources2.getClass();
                    String format5 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_and_limits_screen_subtitle)).format(new Object[]{str8});
                    format5.getClass();
                    if (str8.length() <= 0) {
                        format5 = null;
                    }
                    String str10 = androidStringManager.get(R.string.family_account_dependent_controls_privacy_section_title);
                    String str11 = androidStringManager.get(R.string.family_account_dependent_controls_blocked_accounts_label);
                    String str12 = format5;
                    String format6 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_privacy_section_subtitle)).format(new Object[]{str8});
                    format6.getClass();
                    DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel = new DependentControlsAndLimitsPrivacySectionModel((getBlockedCustomersResponse == null || (list = getBlockedCustomersResponse.blocked_customers) == null) ? null : Integer.valueOf(list.size()), str10, str11, format6);
                    String format7 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_and_limits_screen_footer)).format(zzel$EnumUnboxingLocalUtility.m(1, "link", "https://internal.cash.app/dl/view/support/FAMILIES_LIMITS"));
                    format7.getClass();
                    createBaseViewModel = createBaseViewModel(str8, str9, str12, dependentControlStatus5, rowState, dependentControlStatus6, dependentControlStatus7, dependentControlStatus8, dependentControlsAndLimitsPrivacySectionModel, format7, false, false);
                }
                gapComposer2.end(false);
                return createBaseViewModel;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzco toRowState(DependentControlStatus dependentControlStatus, ControlType controlType, String str) {
        FormattedResource formattedResource;
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl;
        String str2;
        boolean z = this.hasError;
        AndroidStringManager androidStringManager = this.stringManager;
        Pair pair = (z && controlType == ControlType.P2P) ? new Pair(androidStringManager.get(R.string.family_account_p2p_allow_list_no_limit_label), androidStringManager.get(R.string.family_account_p2p_allow_list_limited_label)) : new Pair(androidStringManager.get(R.string.family_account_dependent_controls_and_limits_screen_enabled), androidStringManager.get(R.string.family_account_dependent_controls_and_limits_screen_disabled));
        String str3 = (String) pair.first;
        String str4 = (String) pair.second;
        int ordinal = controlType.ordinal();
        if (ordinal == 2) {
            str.getClass();
            formattedResource = new FormattedResource(R.string.family_account_dependent_controls_cash_card_description, new Object[]{str});
        } else if (ordinal == 3) {
            str.getClass();
            formattedResource = new FormattedResource(R.string.family_account_dependent_controls_stock_description, new Object[]{str});
        } else if (ordinal == 4) {
            str.getClass();
            formattedResource = new FormattedResource(R.string.family_account_dependent_controls_bitcoin_description, new Object[]{str});
        } else if (ordinal != 5) {
            formattedResource = null;
        } else {
            str.getClass();
            formattedResource = new FormattedResource(R.string.family_account_dependent_controls_promotions_description, new Object[]{str});
        }
        String string2 = formattedResource != null ? Countries.getString(androidStringManager.resources, formattedResource) : null;
        if (controlType == ControlType.CASH_CARD) {
            if (dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) dependentControlStatus;
            } else {
                if (dependentControlStatus instanceof DependentControlStatus.Error) {
                    DependentControlStatus.Loaded loaded = ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
                    if (loaded instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                        loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded;
                    }
                }
                loadedCardControl = null;
            }
            if (loadedCardControl != null && !loadedCardControl.sponseeTags.isEmpty()) {
                str2 = androidStringManager.get(R.string.family_account_dependent_cash_app_card_and_tag_toggle_title);
                dependentControlStatus.getClass();
                str3.getClass();
                str4.getClass();
                if (!(dependentControlStatus instanceof DependentControlStatus.Error)) {
                    DependentControlStatus.Loaded loaded2 = ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
                    if (loaded2 != null) {
                        return Logger.toDependentControlRowState$toRowState(loaded2, str3, str4, string2, str2);
                    }
                } else if (!(dependentControlStatus instanceof DependentControlStatus.Updating) && !dependentControlStatus.equals(DependentControlStatus.InitialLoading.INSTANCE)) {
                    if (dependentControlStatus instanceof DependentControlStatus.Loaded) {
                        return Logger.toDependentControlRowState$toRowState((DependentControlStatus.Loaded) dependentControlStatus, str3, str4, string2, str2);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return DependentControlRowState$InitialLoading.INSTANCE;
            }
        }
        str2 = null;
        dependentControlStatus.getClass();
        str3.getClass();
        str4.getClass();
        if (!(dependentControlStatus instanceof DependentControlStatus.Error)) {
        }
        return DependentControlRowState$InitialLoading.INSTANCE;
    }

    public RealBitcoinAmountPickerPresenter(AndroidStringManager androidStringManager, RealBitcoinKeypadStateStore$Factory$Impl realBitcoinKeypadStateStore$Factory$Impl, RealBitcoinKeypadPresenter realBitcoinKeypadPresenter, Flow flow, LocalizedMoneyFormatter.Factory factory, AndroidClock androidClock, Money money, Money money2, BitcoinAmountPickerScreen bitcoinAmountPickerScreen, Navigator navigator) {
        bitcoinAmountPickerScreen.getClass();
        this.stringManager = androidStringManager;
        this.keypadPresenter = realBitcoinKeypadPresenter;
        this.activityEvents = flow;
        this.minimumAmount = money;
        this.maximumAmount = money2;
        this.args = bitcoinAmountPickerScreen;
        this.navigator = navigator;
        this.appBackgroundedListener = new Result(androidClock);
        this.initialAmount = bitcoinAmountPickerScreen.initialAmount;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.initialMoneyFormatter = factory.create(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.COMPACT, null, CurrencyRepresentationOption.NONE, null, 29));
        this.purpose = bitcoinAmountPickerScreen.purpose;
        this.keypadStateStore = realBitcoinKeypadStateStore$Factory$Impl.create$1(navigator);
        this.keypadEvents = FlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, null, 5);
    }
}
