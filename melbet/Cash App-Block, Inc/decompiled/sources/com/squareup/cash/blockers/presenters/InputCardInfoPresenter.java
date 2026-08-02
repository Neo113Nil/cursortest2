package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.activity.InitiatePaymentResult;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.activity.RealPaymentNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.featureflags.AmplitudeExperiments$ScanBankCard;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InputCardInfoAppConfigRefreshOnlyWhenOnboarded;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.InstrumentLinkingPostcodeItem;
import com.squareup.cash.gcl.RealGlobalConfigProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.LinkCardResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InputCardInfoPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfigManager;
    public final boolean appConfigRefreshOnlyWhenOnboarded;
    public final AppService appService;
    public final BlockersScreens.InputCardInfoScreen args;
    public final AndroidBiometricsStore biometricsStore;
    public final MultiBlockerFacilitator$Resolver blockerResolver;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final boolean cardScanningEnabled;
    public final ClientScenario clientScenario;
    public final RealClientSyncer clientSyncer;
    public final FeatureFlagManager featureFlagManager;
    public final BlockersData.Flow flow;
    public final FlowStarter flowStarter;
    public final RealGlobalConfigProvider globalConfigProvider;
    public final BetterNavigator.ScreenNavigator navigator;
    public final PaymentNavigator paymentNavigator;
    public final SessionManager sessionManager;
    public final boolean skippable;
    public final AndroidStringManager stringManager;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InputCardInfoPresenter(AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, AppConfigManager appConfigManager, PaymentNavigator paymentNavigator, FeatureFlagManager featureFlagManager, FlowStarter flowStarter, Analytics analytics, RealClientSyncer realClientSyncer, AndroidBiometricsStore androidBiometricsStore, BlockersScreens.InputCardInfoScreen inputCardInfoScreen, BetterNavigator.ScreenNavigator screenNavigator, RealGlobalConfigProvider realGlobalConfigProvider, BlockersDataNavigator blockersDataNavigator2, SessionManager sessionManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealMultiBlockerFacilitator realMultiBlockerFacilitator) {
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.appConfigManager = appConfigManager;
        this.paymentNavigator = paymentNavigator;
        this.featureFlagManager = featureFlagManager;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.clientSyncer = realClientSyncer;
        this.biometricsStore = androidBiometricsStore;
        this.args = inputCardInfoScreen;
        this.navigator = screenNavigator;
        this.globalConfigProvider = realGlobalConfigProvider;
        this.blockersDataNavigator = blockersDataNavigator2;
        this.sessionManager = sessionManager;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.blockerResolver = realMultiBlockerFacilitator.getResolver(screenNavigator, inputCardInfoScreen);
        BlockersData blockersData = inputCardInfoScreen.blockersData;
        ClientScenario clientScenario = blockersData.clientScenario;
        clientScenario.getClass();
        this.clientScenario = clientScenario;
        BlockersData.Flow flow = blockersData.flow;
        this.flow = flow;
        this.skippable = flow == BlockersData.Flow.ONBOARDING || inputCardInfoScreen.skippable;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.cardScanningEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ScanBankCard.INSTANCE)).enabled();
        this.appConfigRefreshOnlyWhenOnboarded = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$InputCardInfoAppConfigRefreshOnlyWhenOnboarded.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initiatePayment(InputCardInfoPresenter inputCardInfoPresenter, PaymentInitiatorData paymentInitiatorData, ContinuationImpl continuationImpl) {
        InputCardInfoPresenter$initiatePayment$1 inputCardInfoPresenter$initiatePayment$1;
        int i;
        ScenarioPlan scenarioPlan;
        BetterNavigator.ScreenNavigator screenNavigator = inputCardInfoPresenter.navigator;
        BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
        BlockersData blockersData = inputCardInfoScreen.blockersData;
        if (continuationImpl instanceof InputCardInfoPresenter$initiatePayment$1) {
            inputCardInfoPresenter$initiatePayment$1 = (InputCardInfoPresenter$initiatePayment$1) continuationImpl;
            int i2 = inputCardInfoPresenter$initiatePayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inputCardInfoPresenter$initiatePayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inputCardInfoPresenter$initiatePayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputCardInfoPresenter$initiatePayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentNavigator paymentNavigator = inputCardInfoPresenter.paymentNavigator;
                    ClientScenario clientScenario = inputCardInfoPresenter.clientScenario;
                    String str = blockersData.flowToken;
                    inputCardInfoPresenter$initiatePayment$1.label = 1;
                    obj = ((RealPaymentNavigator) paymentNavigator).sendInitiatePayment(clientScenario, str, paymentInitiatorData, inputCardInfoPresenter$initiatePayment$1);
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
                InitiatePaymentResult initiatePaymentResult = (InitiatePaymentResult) obj;
                ResponseContext responseContext = initiatePaymentResult.responseContext;
                scenarioPlan = responseContext.scenario_plan;
                if ((scenarioPlan != null ? scenarioPlan.blocker_descriptors : null) == null) {
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(inputCardInfoPresenter.blockersNavigator.getNext(inputCardInfoScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    Screen screen = initiatePaymentResult.success ? blockersData.exitScreenOnSuccess : blockersData.exitScreen;
                    StatusResult statusResult = responseContext.status_result;
                    if (statusResult != null) {
                        screenNavigator.goTo(FlowStarter.startStatusResultFlow$default(inputCardInfoPresenter.flowStarter, statusResult, Room.getTokens(responseContext.payments), screen, null, blockersData.flowToken, 40));
                    } else {
                        screenNavigator.goTo(screen);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        inputCardInfoPresenter$initiatePayment$1 = new InputCardInfoPresenter$initiatePayment$1(inputCardInfoPresenter, continuationImpl);
        Object obj2 = inputCardInfoPresenter$initiatePayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputCardInfoPresenter$initiatePayment$1.label;
        if (i != 0) {
        }
        InitiatePaymentResult initiatePaymentResult2 = (InitiatePaymentResult) obj2;
        ResponseContext responseContext2 = initiatePaymentResult2.responseContext;
        scenarioPlan = responseContext2.scenario_plan;
        if ((scenarioPlan != null ? scenarioPlan.blocker_descriptors : null) == null) {
        }
        return Unit.INSTANCE;
    }

    public static final void access$showErrorDialog(InputCardInfoPresenter inputCardInfoPresenter, LinkCardResponse linkCardResponse) {
        String str;
        AndroidStringManager androidStringManager = inputCardInfoPresenter.stringManager;
        ResponseContext responseContext = linkCardResponse.response_context;
        if (responseContext == null || (str = responseContext.dialog_message) == null) {
            str = responseContext != null ? responseContext.failure_message : null;
        }
        inputCardInfoPresenter.navigator.goTo(new BlockersScreens.InvalidInputScreen(BlockersData.copy$default(inputCardInfoPresenter.args.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, BlockersData.Style.DIALOG, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -131073, 65535), str == null ? androidStringManager.get(R.string.input_card_info_failure_subtitle) : str, str == null ? androidStringManager.get(R.string.input_card_info_failure_title) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Object ready;
        BlockersScreens.InputCardInfoScreen inputCardInfoScreen = this.args;
        boolean z = inputCardInfoScreen.expired;
        CashInstrumentType cashInstrumentType = inputCardInfoScreen.instrumentType;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(440293274);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = cashInstrumentType != CashInstrumentType.DEBIT_CARD ? new RealTransferManager$addCash$$inlined$map$1(FlowKt.distinctUntilChanged(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig(), 3)), this, 1) : new AppLockMonitor$special$$inlined$map$2(null, 19);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Boolean.FALSE;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        ref$BooleanRef.element = ((Boolean) rememberedValue2).booleanValue();
        boolean changed = gapComposer.changed((String) collectAsState.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        RealGlobalConfigProvider realGlobalConfigProvider = this.globalConfigProvider;
        AndroidStringManager androidStringManager = this.stringManager;
        if (changed || rememberedValue3 == neverEqualPolicy) {
            if (cashInstrumentType != CashInstrumentType.DEBIT_CARD) {
                str = (String) collectAsState.getValue();
            } else if (z) {
                str = androidStringManager.get(R.string.input_card_info_title_expired_debit);
            } else {
                if (z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = (String) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$4);
            }
            rememberedValue3 = str;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        String str5 = (String) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(new Versioned(null, 0));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState2 = (MutableState) rememberedValue6;
        boolean changed2 = gapComposer.changed((Versioned) mutableState.getValue()) | gapComposer.changed(str5) | gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue()) | gapComposer.changed(((Boolean) mutableState2.getValue()).booleanValue());
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == neverEqualPolicy) {
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                ready = new InputCardInfoViewModel.Loading(androidStringManager.get(R.string.profile_link_card_linking_progress_message));
            } else if (str5 == null) {
                ready = InputCardInfoViewModel.InitialLoading.INSTANCE;
            } else {
                Country country = Regions.toCountry(inputCardInfoScreen.blockersData.region);
                CashInstrumentType cashInstrumentType2 = CashInstrumentType.DEBIT_CARD;
                if (cashInstrumentType != cashInstrumentType2 || z) {
                    str2 = null;
                } else {
                    if (z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = (String) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$3);
                }
                String str6 = (String) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE);
                String str7 = androidStringManager.get(R.string.input_card_info_link_label);
                if (this.skippable) {
                    str4 = androidStringManager.get(R.string.blockers_skip);
                } else if (inputCardInfoScreen.bankAccountAllowed) {
                    str4 = androidStringManager.get(R.string.blockers_link_card_no_card);
                } else {
                    str3 = null;
                    ready = new InputCardInfoViewModel.Ready(new InputCardInfoViewModel.TextContent(str5, str2, str6, str3, str7, androidStringManager.get(R.string.link_card_security_text), country), this.flow == BlockersData.Flow.ONBOARDING, WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()] != 1 ? androidStringManager.get(R.string.credit_card_number_hint) : androidStringManager.get(R.string.debit_card_number_hint), parcelableSnapshotMutableIntState.getIntValue(), (Versioned) mutableState.getValue(), cashInstrumentType != cashInstrumentType2 ? ((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$5)).booleanValue() : false, ((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$6)).booleanValue(), this.cardScanningEnabled);
                }
                str3 = str4;
                if (this.flow == BlockersData.Flow.ONBOARDING) {
                }
                ready = new InputCardInfoViewModel.Ready(new InputCardInfoViewModel.TextContent(str5, str2, str6, str3, str7, androidStringManager.get(R.string.link_card_security_text), country), this.flow == BlockersData.Flow.ONBOARDING, WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()] != 1 ? androidStringManager.get(R.string.credit_card_number_hint) : androidStringManager.get(R.string.debit_card_number_hint), parcelableSnapshotMutableIntState.getIntValue(), (Versioned) mutableState.getValue(), cashInstrumentType != cashInstrumentType2 ? ((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$5)).booleanValue() : false, ((Boolean) realGlobalConfigProvider.get(InstrumentLinkingPostcodeItem.INSTANCE$6)).booleanValue(), this.cardScanningEnabled);
            }
            rememberedValue7 = Updater.mutableStateOf$default(ready);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState3 = (MutableState) rememberedValue7;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new MLKitTitleGenerator$1(this, continuation, 27);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        Updater.LaunchedEffect(gapComposer, flow, new EngineInterceptor$intercept$2(19, mutableState, flow, this, ref$BooleanRef, mutableState2, parcelableSnapshotMutableIntState, (Continuation) null));
        InputCardInfoViewModel inputCardInfoViewModel = (InputCardInfoViewModel) mutableState3.getValue();
        gapComposer.end(false);
        return inputCardInfoViewModel;
    }
}
