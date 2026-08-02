package com.squareup.cash.blockers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.alias.AliasRegisterComplete;
import com.squareup.cash.cdf.alias.AliasRegisterReceiveError;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.CashtagBlocker;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetCashtagStatusRequest;
import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class CashtagPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.CashtagScreen args;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;
    public final TimeToLiveSyncState profileSyncState;
    public final Signal signOut;
    public final AndroidStringManager stringManager;

    public interface CashtagStatus {

        public final class Available implements CashtagStatus {
            public final String displayText;

            public Available(String str) {
                this.displayText = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Available) && Intrinsics.areEqual(this.displayText, ((Available) obj).displayText);
            }

            public final int hashCode() {
                String str = this.displayText;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Available(displayText=", this.displayText, ")");
            }
        }

        public final class LookingUp implements CashtagStatus {
            public static final LookingUp INSTANCE = new LookingUp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LookingUp);
            }

            public final int hashCode() {
                return -1019748132;
            }

            public final String toString() {
                return "LookingUp";
            }
        }

        public final class Unavailable implements CashtagStatus {
            public final String message;

            public Unavailable(String str) {
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unavailable) && Intrinsics.areEqual(this.message, ((Unavailable) obj).message);
            }

            public final int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unavailable(message=", this.message, ")");
            }
        }

        public final class Unknown implements CashtagStatus {
            public static final Unknown INSTANCE = new Unknown();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unknown);
            }

            public final int hashCode() {
                return -336249400;
            }

            public final String toString() {
                return "Unknown";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.squareup.protos.franklin.api.CashtagStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResourceFileSystem.Companion companion = com.squareup.protos.franklin.api.CashtagStatus.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResourceFileSystem.Companion companion2 = com.squareup.protos.franklin.api.CashtagStatus.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GetCashtagStatusResponse.Status.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ByteString.Companion companion3 = GetCashtagStatusResponse.Status.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[CashtagBlocker.CashtagRestriction.values().length];
            try {
                iArr3[CashtagBlocker.CashtagRestriction.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CashtagBlocker.CashtagRestriction.NO_CASHTAG_REUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SetCashtagResponse.Status.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                UiAlias.Type.Companion companion4 = SetCashtagResponse.Status.Companion;
                iArr4[2] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                UiAlias.Type.Companion companion5 = SetCashtagResponse.Status.Companion;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                UiAlias.Type.Companion companion6 = SetCashtagResponse.Status.Companion;
                iArr4[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public CashtagPresenter(TimeToLiveSyncState timeToLiveSyncState, BlockersDataNavigator blockersDataNavigator, AppService appService, Signal signal, Analytics analytics, AndroidStringManager androidStringManager, RealProfileManager realProfileManager, ProductionAttributionEventEmitter productionAttributionEventEmitter, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.CashtagScreen cashtagScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.profileSyncState = timeToLiveSyncState;
        this.blockersNavigator = blockersDataNavigator;
        this.appService = appService;
        this.signOut = signal;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.profileManager = realProfileManager;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.args = cashtagScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkCashtagAndSubmit(CashtagPresenter cashtagPresenter, String str, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12, ContinuationImpl continuationImpl) {
        CashtagPresenter$checkCashtagAndSubmit$1 cashtagPresenter$checkCashtagAndSubmit$1;
        int i;
        ApiResult apiResult;
        Object submitCashtag;
        if (continuationImpl instanceof CashtagPresenter$checkCashtagAndSubmit$1) {
            cashtagPresenter$checkCashtagAndSubmit$1 = (CashtagPresenter$checkCashtagAndSubmit$1) continuationImpl;
            int i2 = cashtagPresenter$checkCashtagAndSubmit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashtagPresenter$checkCashtagAndSubmit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashtagPresenter$checkCashtagAndSubmit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashtagPresenter$checkCashtagAndSubmit$1.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBrandFollowPresenter$models$2$1$12.invoke(Boolean.TRUE);
                    Signal signal = cashtagPresenter.signOut;
                    CashtagPresenter$submitCashtag$result$1 cashtagPresenter$submitCashtag$result$1 = new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, i3);
                    cashtagPresenter$checkCashtagAndSubmit$1.L$1 = realBrandFollowPresenter$models$2$1$1;
                    cashtagPresenter$checkCashtagAndSubmit$1.L$2 = realBrandFollowPresenter$models$2$1$12;
                    cashtagPresenter$checkCashtagAndSubmit$1.label = 1;
                    obj = StateFlowKt.until(signal, cashtagPresenter$submitCashtag$result$1, cashtagPresenter$checkCashtagAndSubmit$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realBrandFollowPresenter$models$2$1$12 = cashtagPresenter$checkCashtagAndSubmit$1.L$2;
                    realBrandFollowPresenter$models$2$1$1 = cashtagPresenter$checkCashtagAndSubmit$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) ((ApiResult.Success) apiResult).response;
                    com.squareup.protos.franklin.api.CashtagStatus cashtagStatus = getCashtagStatusResponse.cashtag_status;
                    String str2 = getCashtagStatusResponse.confirm_message;
                    if (cashtagStatus == com.squareup.protos.franklin.api.CashtagStatus.AVAILABLE) {
                        cashtagPresenter$checkCashtagAndSubmit$1.L$1 = null;
                        cashtagPresenter$checkCashtagAndSubmit$1.L$2 = null;
                        cashtagPresenter$checkCashtagAndSubmit$1.label = 2;
                        String str3 = getCashtagStatusResponse.cashtag_candidate;
                        if (str2 == null || str2.length() == 0) {
                            str3.getClass();
                            submitCashtag = cashtagPresenter.submitCashtag(str3, realBrandFollowPresenter$models$2$1$1, realBrandFollowPresenter$models$2$1$12, cashtagPresenter$checkCashtagAndSubmit$1);
                            if (submitCashtag != obj2) {
                                submitCashtag = Unit.INSTANCE;
                            }
                        } else {
                            BetterNavigator.ScreenNavigator screenNavigator = cashtagPresenter.navigator;
                            BlockersData blockersData = cashtagPresenter.args.blockersData;
                            str2.getClass();
                            str3.getClass();
                            screenNavigator.goTo(new BlockersScreens.CashtagConfirmationScreen(blockersData, str2, str3));
                            submitCashtag = Unit.INSTANCE;
                        }
                    } else {
                        realBrandFollowPresenter$models$2$1$1.invoke(new CashtagStatus.Unavailable(getCashtagStatusResponse.failure_message));
                        realBrandFollowPresenter$models$2$1$12.invoke(Boolean.FALSE);
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    realBrandFollowPresenter$models$2$1$12.invoke(Boolean.FALSE);
                    cashtagPresenter.handleLookupFailure((ApiResult.Failure) apiResult, realBrandFollowPresenter$models$2$1$1, true);
                } else if (apiResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            }
        }
        cashtagPresenter$checkCashtagAndSubmit$1 = new CashtagPresenter$checkCashtagAndSubmit$1(cashtagPresenter, continuationImpl);
        Object obj3 = cashtagPresenter$checkCashtagAndSubmit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashtagPresenter$checkCashtagAndSubmit$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static final Object access$getCashtagStatus(CashtagPresenter cashtagPresenter, String str, SuspendLambda suspendLambda) {
        GetCashtagStatusRequest.CashtagRestriction cashtagRestriction;
        AppService appService = cashtagPresenter.appService;
        BlockersScreens.CashtagScreen cashtagScreen = cashtagPresenter.args;
        BlockersData blockersData = cashtagScreen.blockersData;
        ClientScenario clientScenario = blockersData.clientScenario;
        clientScenario.getClass();
        String str2 = blockersData.flowToken;
        CashtagBlocker.CashtagRestriction cashtagRestriction2 = cashtagScreen.cashtagRestriction;
        GetCashtagStatusRequest.CashtagRestriction cashtagRestriction3 = null;
        if (cashtagRestriction2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[cashtagRestriction2.ordinal()];
            if (i == 1) {
                cashtagRestriction = GetCashtagStatusRequest.CashtagRestriction.DEFAULT;
            } else {
                if (i != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                cashtagRestriction = GetCashtagStatusRequest.CashtagRestriction.NO_CASHTAG_REUSE;
            }
            cashtagRestriction3 = cashtagRestriction;
        }
        return appService.getCashtagStatus(clientScenario, str2, new GetCashtagStatusRequest(str, cashtagRestriction3, 4), suspendLambda);
    }

    public final void handleLookupFailure(ApiResult.Failure failure, Function1 function1, boolean z) {
        BlockersData blockersData = this.args.blockersData;
        Timber.Forest.e("Failed to get cashtag status.", new Object[0]);
        if (z) {
            this.analytics.track(new AliasRegisterReceiveError(AliasType.CASHTAG, AliasRegisterReceiveError.ErrorType.FAILURE, blockersData.flowToken, Boolean.FALSE), null);
            this.navigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(this.stringManager, failure, null).message, null, 4));
        }
        function1.invoke(CashtagStatus.Unknown.INSTANCE);
    }

    public final void handleSetCashtagFailure(SetCashtagResponse setCashtagResponse) {
        AliasRegisterReceiveError.ErrorType errorType;
        AliasType aliasType = AliasType.CASHTAG;
        BlockersData blockersData = this.args.blockersData;
        String str = blockersData.flowToken;
        com.squareup.protos.franklin.api.CashtagStatus cashtagStatus = setCashtagResponse.cashtag_status;
        if (cashtagStatus != null) {
            int ordinal = cashtagStatus.ordinal();
            if (ordinal == 0) {
                errorType = AliasRegisterReceiveError.ErrorType.FAILURE;
            } else if (ordinal == 1) {
                errorType = AliasRegisterReceiveError.ErrorType.INVALID_ALIAS;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                errorType = AliasRegisterReceiveError.ErrorType.FAILURE;
            }
        } else {
            errorType = null;
        }
        this.analytics.track(new AliasRegisterReceiveError(aliasType, errorType, str, Boolean.FALSE), null);
        ResponseContext responseContext = setCashtagResponse.response_context;
        responseContext.getClass();
        String str2 = responseContext.dialog_message;
        str2.getClass();
        this.navigator.goTo(new BlockersScreens.CashtagErrorScreen(blockersData, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableStateFlow mutableStateFlow;
        Object cashtagPresenter$models$2$1;
        CoroutineContext coroutineContext;
        boolean z;
        String str;
        BlockersScreens.CashtagScreen cashtagScreen = this.args;
        Redacted redacted = cashtagScreen.suggestedCashTag;
        BlockersData blockersData = cashtagScreen.blockersData;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2117966009);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new MLKitTitleGenerator$1(this, continuation, 25);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 1;
        if (rememberedValue2 == neverEqualPolicy) {
            if (blockersData.flow == BlockersData.Flow.ONBOARDING) {
                Set set = Cashtags.SUPPORTED_SYMBOLS;
                rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(Moneys.symbol(Cashtags.guessCashtagCurrency(blockersData.region)), 19);
            } else {
                rememberedValue2 = FlowKt.distinctUntilChanged(new RealDisclosureProvider$special$$inlined$map$1(this.profileManager.region(), i2));
            }
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, Moneys.symbol(CurrencyCode.USD), null, gapComposer, 0, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            String str2 = (String) redacted.getValue();
            if (str2 == null) {
                str2 = "";
            }
            rememberedValue3 = FlowKt.MutableStateFlow(str2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        CashtagStatus.Unknown unknown = CashtagStatus.Unknown.INSTANCE;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(unknown);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState2 = (MutableState) rememberedValue5;
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(mutableStateFlow2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
            mutableStateFlow = mutableStateFlow2;
            cashtagPresenter$models$2$1 = new CashtagPresenter$models$2$1(0, mutableState, this, mutableStateFlow, continuation);
            coroutineContext = null;
            gapComposer.updateRememberedValue(cashtagPresenter$models$2$1);
        } else {
            mutableStateFlow = mutableStateFlow2;
            cashtagPresenter$models$2$1 = rememberedValue6;
            coroutineContext = null;
        }
        Updater.LaunchedEffect(gapComposer, this, (Function2) cashtagPresenter$models$2$1);
        MutableStateFlow mutableStateFlow3 = mutableStateFlow;
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, mutableStateFlow3, this, mutableState, mutableState2, 1));
        boolean z2 = ((CharSequence) Updater.collectAsState(mutableStateFlow3, coroutineContext, gapComposer, 1).getValue()).length() > 0;
        CashtagStatus cashtagStatus = (CashtagStatus) mutableState.getValue();
        boolean z3 = cashtagStatus instanceof CashtagStatus.Available;
        CashtagStatus.LookingUp lookingUp = CashtagStatus.LookingUp.INSTANCE;
        if (z3 || Intrinsics.areEqual(cashtagStatus, unknown)) {
            z = true;
        } else {
            if (!Intrinsics.areEqual(cashtagStatus, lookingUp) && !(cashtagStatus instanceof CashtagStatus.Unavailable)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            z = false;
        }
        CashtagStatus cashtagStatus2 = (CashtagStatus) mutableState.getValue();
        if (cashtagStatus2 instanceof CashtagStatus.Available) {
            str = ((CashtagStatus.Available) cashtagStatus2).displayText;
        } else if (cashtagStatus2 instanceof CashtagStatus.Unavailable) {
            str = ((CashtagStatus.Unavailable) cashtagStatus2).message;
        } else {
            if (!Intrinsics.areEqual(cashtagStatus2, lookingUp) && !Intrinsics.areEqual(cashtagStatus2, unknown)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = coroutineContext;
        }
        String str3 = (String) collectAsState.getValue();
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        boolean z4 = z2 && z && !((Boolean) mutableState2.getValue()).booleanValue();
        String str4 = cashtagScreen.buttonText;
        AndroidStringManager androidStringManager = this.stringManager;
        if (str4 == null) {
            str4 = blockersData.clientScenario == ClientScenario.PROFILE ? androidStringManager.get(R.string.blockers_cashtag_set) : androidStringManager.get(R.string.blockers_next);
        }
        String str5 = str4;
        String str6 = androidStringManager.get(R.string.blockers_cashtag_hint);
        String str7 = cashtagScreen.title;
        if (str7 == null) {
            str3.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str7 = new MessageFormat(resources.getString(R.string.blockers_cashtag_title)).format(new Object[]{str3});
            str7.getClass();
        }
        String str8 = str7;
        String str9 = cashtagScreen.subtitle;
        if (str9 == null) {
            str9 = androidStringManager.get(R.string.blockers_cashtag_subtitle);
        }
        CashtagViewModel cashtagViewModel = new CashtagViewModel(str5, str3, (String) redacted.getValue(), str6, str8, str9, cashtagScreen.labelText, new CashtagViewModel.CashtagLookupViewModel(str, booleanValue, z4), cashtagScreen.dismissButtonEnabled);
        gapComposer.end(false);
        return cashtagViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitCashtag(String str, Function1 function1, Function1 function12, ContinuationImpl continuationImpl) {
        CashtagPresenter$submitCashtag$1 cashtagPresenter$submitCashtag$1;
        int i;
        boolean z;
        AliasRegisterReceiveError.ErrorType errorType;
        BlockersScreens.CashtagScreen cashtagScreen = this.args;
        BlockersData blockersData = cashtagScreen.blockersData;
        if (continuationImpl instanceof CashtagPresenter$submitCashtag$1) {
            cashtagPresenter$submitCashtag$1 = (CashtagPresenter$submitCashtag$1) continuationImpl;
            int i2 = cashtagPresenter$submitCashtag$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashtagPresenter$submitCashtag$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashtagPresenter$submitCashtag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashtagPresenter$submitCashtag$1.label;
                int i3 = 0;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashtagPresenter$submitCashtag$result$1 cashtagPresenter$submitCashtag$result$1 = new CashtagPresenter$submitCashtag$result$1(this, str, objArr == true ? 1 : 0, i3);
                    cashtagPresenter$submitCashtag$1.L$1 = function1;
                    cashtagPresenter$submitCashtag$1.L$2 = function12;
                    cashtagPresenter$submitCashtag$1.label = 1;
                    obj = StateFlowKt.until(this.signOut, cashtagPresenter$submitCashtag$result$1, cashtagPresenter$submitCashtag$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = cashtagPresenter$submitCashtag$1.L$2;
                    function1 = cashtagPresenter$submitCashtag$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                Analytics analytics = this.analytics;
                if (!z) {
                    SetCashtagResponse setCashtagResponse = (SetCashtagResponse) ((ApiResult.Success) apiResult).response;
                    SetCashtagResponse.Status status = setCashtagResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.SET_CASHTAG_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 0) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return null;
                    }
                    if (ordinal == 1) {
                        ResponseContext responseContext = setCashtagResponse.response_context;
                        String str2 = responseContext != null ? responseContext.dialog_message : null;
                        if (str2 == null || str2.length() == 0) {
                            analytics.track(new AliasRegisterComplete(AliasType.CASHTAG, Boolean.FALSE, blockersData.flowToken), null);
                            BlockersData.Flow flow = blockersData.flow;
                            flow.getClass();
                            if (flow == BlockersData.Flow.ONBOARDING) {
                                this.attributionEventEmitter.trackEvent("Cashtag Selected", new LinkedHashMap());
                            }
                            this.profileSyncState.lastAttemptedRefresh = 0L;
                            ResponseContext responseContext2 = setCashtagResponse.response_context;
                            responseContext2.getClass();
                            screenNavigator.goTo(this.blockersNavigator.getNext(cashtagScreen, blockersData.updateFromResponseContext(responseContext2, false)));
                        } else {
                            handleSetCashtagFailure(setCashtagResponse);
                        }
                    } else if (ordinal == 2) {
                        AliasType aliasType = AliasType.CASHTAG;
                        String str3 = blockersData.flowToken;
                        com.squareup.protos.franklin.api.CashtagStatus cashtagStatus = setCashtagResponse.cashtag_status;
                        if (cashtagStatus != null) {
                            int ordinal2 = cashtagStatus.ordinal();
                            if (ordinal2 == 0) {
                                errorType = AliasRegisterReceiveError.ErrorType.FAILURE;
                            } else if (ordinal2 == 1) {
                                errorType = AliasRegisterReceiveError.ErrorType.INVALID_ALIAS;
                            } else {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                errorType = AliasRegisterReceiveError.ErrorType.FAILURE;
                            }
                        } else {
                            errorType = null;
                        }
                        analytics.track(new AliasRegisterReceiveError(aliasType, errorType, str3, Boolean.FALSE), null);
                        ResponseContext responseContext3 = setCashtagResponse.response_context;
                        function1.invoke(new CashtagStatus.Unavailable(responseContext3 != null ? responseContext3.dialog_message : null));
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        handleSetCashtagFailure(setCashtagResponse);
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to set cashtag.", new Object[0]);
                    analytics.track(new AliasRegisterReceiveError(AliasType.CASHTAG, AliasRegisterReceiveError.ErrorType.FAILURE, blockersData.flowToken, Boolean.FALSE), null);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, null).message, null, 4));
                    function1.invoke(CashtagStatus.Unknown.INSTANCE);
                } else if (apiResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                function12.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        cashtagPresenter$submitCashtag$1 = new CashtagPresenter$submitCashtag$1(this, continuationImpl);
        Object obj2 = cashtagPresenter$submitCashtag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashtagPresenter$submitCashtag$1.label;
        int i32 = 0;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        Analytics analytics2 = this.analytics;
        if (!z) {
        }
        function12.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
