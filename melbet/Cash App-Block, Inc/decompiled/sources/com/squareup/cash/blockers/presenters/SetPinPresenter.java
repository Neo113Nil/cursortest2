package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PasscodeResetFlow;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SetPasscodeRequest;
import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class SetPinPresenter implements MoleculePresenter {
    public static final RedactedString NoopRedacted = new RedactedString(null);
    public final Analytics analytics;
    public final AppService appService;
    public final AndroidBiometricsStore biometricsStore;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final String defaultTitleText;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPinScreensTitleGenerator pinScreensTitleGenerator;
    public final BlockersScreens.SetPinScreen screen;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;
    public final String titleTextOverride;

    public SetPinPresenter(Analytics analytics, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, AppService appService, AndroidBiometricsStore androidBiometricsStore, FlowStarter flowStarter, BlockerFlowListener blockerFlowListener, Signal signal, BlockersScreens.SetPinScreen setPinScreen, BetterNavigator.ScreenNavigator screenNavigator, FeatureFlagManager featureFlagManager, RealPinScreensTitleGenerator$Factory$Impl realPinScreensTitleGenerator$Factory$Impl) {
        Redacted redacted = setPinScreen.oldPin;
        Redacted redacted2 = setPinScreen.cvv;
        boolean z = setPinScreen.changingPin;
        BlockersScreens.SetPinScreen.TextOverrides textOverrides = setPinScreen.textOverrides;
        boolean z2 = setPinScreen.resettingPin;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.biometricsStore = androidBiometricsStore;
        this.flowStarter = flowStarter;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.signOutSignal = signal;
        this.screen = setPinScreen;
        this.navigator = screenNavigator;
        this.featureFlagManager = featureFlagManager;
        FormattedResources formattedResources = FormattedResources.INSTANCE;
        this.pinScreensTitleGenerator = realPinScreensTitleGenerator$Factory$Impl.create$1(new TitleTemplates(new WorkApplet$applet$1(2, formattedResources, FormattedResources.class, "set_pin_title_format_personal_account", "set_pin_title_format_personal_account(Ljava/lang/Object;Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 16), new WorkApplet$applet$1(2, formattedResources, FormattedResources.class, "set_pin_title_format_business_account", "set_pin_title_format_business_account(Ljava/lang/Object;Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 17)));
        Redacted redacted3 = setPinScreen.unconfirmedPin;
        this.titleTextOverride = redacted3.getValue() != null ? textOverrides.confirmTitle : (z || z2) ? (!z2 && redacted2.getValue() == null && redacted.getValue() == null) ? null : textOverrides.mainTitle : textOverrides.mainTitle;
        this.defaultTitleText = redacted3.getValue() != null ? androidStringManager.get(R.string.set_pin_title_confirm) : (z || z2) ? (!z2 && redacted2.getValue() == null && redacted.getValue() == null) ? androidStringManager.get(R.string.set_pin_title_old) : androidStringManager.get(R.string.set_pin_title_new) : androidStringManager.get(R.string.set_pin_title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$forgotPasscode(SetPinPresenter setPinPresenter, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1, ContinuationImpl continuationImpl) {
        SetPinPresenter$forgotPasscode$1 setPinPresenter$forgotPasscode$1;
        int i;
        String generateToken;
        Object until;
        ApiResult apiResult;
        FlowStarter flowStarter = setPinPresenter.flowStarter;
        BetterNavigator.ScreenNavigator screenNavigator = setPinPresenter.navigator;
        BlockersData blockersData = setPinPresenter.screen.blockersData;
        if (continuationImpl instanceof SetPinPresenter$forgotPasscode$1) {
            setPinPresenter$forgotPasscode$1 = (SetPinPresenter$forgotPasscode$1) continuationImpl;
            int i2 = setPinPresenter$forgotPasscode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setPinPresenter$forgotPasscode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setPinPresenter$forgotPasscode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setPinPresenter$forgotPasscode$1.label;
                int i3 = 0;
                String str = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBrandFollowPresenter$models$2$1$1.invoke(Boolean.TRUE);
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) setPinPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PasscodeResetFlow.INSTANCE)).enabled()) {
                        screenNavigator.goTo(((RealFlowStarter) flowStarter).startPasscodeFlow(Flow$Type.RESET_PASSCODE, blockersData.exitScreen));
                        return Unit.INSTANCE;
                    }
                    BlockersData.Flow.INSTANCE.getClass();
                    generateToken = BlockersData.Flow.Companion.generateToken();
                    Signal signal = setPinPresenter.signOutSignal;
                    SetPinPresenter$forgotPasscode$result$1 setPinPresenter$forgotPasscode$result$1 = new SetPinPresenter$forgotPasscode$result$1(setPinPresenter, generateToken, objArr == true ? 1 : 0, i3);
                    setPinPresenter$forgotPasscode$1.L$0 = realBrandFollowPresenter$models$2$1$1;
                    setPinPresenter$forgotPasscode$1.L$1 = generateToken;
                    setPinPresenter$forgotPasscode$1.label = 1;
                    until = StateFlowKt.until(signal, setPinPresenter$forgotPasscode$result$1, setPinPresenter$forgotPasscode$1);
                    if (until == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = setPinPresenter$forgotPasscode$1.L$1;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = setPinPresenter$forgotPasscode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    generateToken = str2;
                    realBrandFollowPresenter$models$2$1$1 = realBrandFollowPresenter$models$2$1$12;
                    until = obj;
                }
                apiResult = (ApiResult) until;
                if (apiResult != null) {
                    return Unit.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Success) {
                    InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) ((ApiResult.Success) apiResult).response;
                    InitiatePasscodeResetResponse.Status status = initiatePasscodeResetResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.INITIATE_PASSCODE_RESET_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        ClientScenario clientScenario = ClientScenario.RESET_PASSCODE;
                        ResponseContext responseContext = initiatePasscodeResetResponse.response_context;
                        responseContext.getClass();
                        screenNavigator.goTo(((RealFlowStarter) flowStarter).startProfileBlockersFlow(clientScenario, generateToken, responseContext.scenario_plan, blockersData.exitScreen));
                    } else {
                        if (ordinal != 2) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        setPinPresenter.blockerFlowAnalytics.onFlowCancelled(blockersData);
                        screenNavigator.goTo(blockersData.exitScreen);
                    }
                } else {
                    Timber.Forest.e("Failed to initiate passcode reset.", new Object[0]);
                    String str3 = TextUtilsCompat.errorMessaging(setPinPresenter.stringManager, (ApiResult.Failure) apiResult, null).message;
                    realBrandFollowPresenter$models$2$1$1.invoke(Boolean.FALSE);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str3, str, 4));
                }
                return Unit.INSTANCE;
            }
        }
        setPinPresenter$forgotPasscode$1 = new SetPinPresenter$forgotPasscode$1(setPinPresenter, continuationImpl);
        Object obj2 = setPinPresenter$forgotPasscode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setPinPresenter$forgotPasscode$1.label;
        int i32 = 0;
        String str4 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) until;
        if (apiResult != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
    
        if (r11.write("CUSTOMER_PASSCODE", r3, r14) == r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015e, code lost:
    
        if (r5 == r13) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitPin(SetPinPresenter setPinPresenter, String str, KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1, ContinuationImpl continuationImpl) {
        SetPinPresenter$submitPin$1 setPinPresenter$submitPin$1;
        int i;
        BlockersScreens.SetPinScreen.TextOverrides textOverrides;
        BlockersData blockersData;
        BetterNavigator.ScreenNavigator screenNavigator;
        BlockersScreens.SetPinScreen setPinScreen;
        Redacted redacted;
        Redacted redacted2;
        SetPinPresenter$submitPin$1 setPinPresenter$submitPin$12;
        ?? r15;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ApiResult apiResult;
        SetPasscodeResponse setPasscodeResponse;
        int i3;
        Object obj;
        boolean z;
        SetPasscodeResponse.Status status;
        int ordinal;
        BlockersScreens.SetPinScreen setPinScreen2;
        Screen screen;
        RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = realBrandFollowPresenter$models$2$1$1;
        AndroidBiometricsStore androidBiometricsStore = setPinPresenter.biometricsStore;
        BetterNavigator.ScreenNavigator screenNavigator2 = setPinPresenter.navigator;
        BlockersScreens.SetPinScreen setPinScreen3 = setPinPresenter.screen;
        BlockersScreens.SetPinScreen.TextOverrides textOverrides2 = setPinScreen3.textOverrides;
        Redacted redacted3 = setPinScreen3.oldPin;
        Redacted redacted4 = setPinScreen3.cvv;
        BlockersData blockersData2 = setPinScreen3.blockersData;
        if (continuationImpl instanceof SetPinPresenter$submitPin$1) {
            setPinPresenter$submitPin$1 = (SetPinPresenter$submitPin$1) continuationImpl;
            int i4 = setPinPresenter$submitPin$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                setPinPresenter$submitPin$1.label = i4 - PKIFailureInfo.systemUnavail;
                SetPinPresenter$submitPin$1 setPinPresenter$submitPin$13 = setPinPresenter$submitPin$1;
                Object obj2 = setPinPresenter$submitPin$13.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setPinPresenter$submitPin$13.label;
                int i5 = 1;
                if (i == 0) {
                    i3 = 2;
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        setPasscodeResponse = setPinPresenter$submitPin$13.L$6;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            blockersData = blockersData2;
                            textOverrides = textOverrides2;
                            screenNavigator = screenNavigator2;
                            setPinScreen = setPinScreen3;
                            redacted = redacted3;
                            redacted2 = redacted4;
                            obj = null;
                            z = 0;
                        } catch (Throwable th) {
                            th = th;
                            blockersData = blockersData2;
                            textOverrides = textOverrides2;
                            screenNavigator = screenNavigator2;
                            setPinScreen = setPinScreen3;
                            redacted = redacted3;
                            redacted2 = redacted4;
                            r15 = 0;
                            i2 = 0;
                            Timber.Forest.e("Failed to write passcode token.", new Object[i2], th);
                            z = i2;
                            obj = r15;
                            status = setPasscodeResponse.status;
                            ResponseContext responseContext = setPasscodeResponse.response_context;
                            if (status == null) {
                            }
                            responseContext.getClass();
                            String str2 = responseContext.dialog_message;
                            ordinal = status.ordinal();
                            if (ordinal != i5) {
                            }
                            return Unit.INSTANCE;
                        }
                        status = setPasscodeResponse.status;
                        ResponseContext responseContext2 = setPasscodeResponse.response_context;
                        if (status == null) {
                            status = ProtoDefaults.SET_PASSCODE_STATUS;
                        }
                        responseContext2.getClass();
                        String str22 = responseContext2.dialog_message;
                        ordinal = status.ordinal();
                        if (ordinal != i5) {
                            BetterNavigator.ScreenNavigator screenNavigator3 = screenNavigator;
                            BlockersData blockersData3 = blockersData;
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            Screen next = setPinPresenter.blockersNavigator.getNext(setPinScreen, blockersData3.updateFromResponseContext(responseContext2, z));
                            if (str22 == null) {
                                screenNavigator3.goTo(next);
                            } else {
                                screenNavigator3.goTo(new BlockersScreens.SetPinMessageScreen(blockersData3, str22, next));
                            }
                        } else if (ordinal == i3) {
                            screenNavigator.goTo(blockersData.exitScreen);
                        } else if (ordinal == 3) {
                            BetterNavigator.ScreenNavigator screenNavigator4 = screenNavigator;
                            BlockersData blockersData4 = blockersData;
                            if (redacted2.getValue() != null) {
                                screen = new BlockersScreens.ConfirmCvvScreen(blockersData4, setPinScreen.instrumentToken, textOverrides);
                            } else {
                                BlockersScreens.SetPinScreen setPinScreen4 = setPinScreen;
                                Object value = redacted.getValue();
                                BlockersData blockersData5 = setPinScreen4.blockersData;
                                boolean z2 = setPinScreen4.changingPin;
                                boolean z3 = setPinScreen4.resettingPin;
                                if (value != null) {
                                    String str3 = setPinScreen4.instrumentToken;
                                    BlockersScreens.SetPinScreen.TextOverrides textOverrides3 = setPinScreen4.textOverrides;
                                    boolean z4 = setPinScreen4.skippable;
                                    RedactedString redactedString = NoopRedacted;
                                    setPinScreen2 = new BlockersScreens.SetPinScreen(blockersData5, z2, z3, str3, redactedString, redactedString, redactedString, textOverrides3, z4);
                                } else {
                                    setPinScreen2 = new BlockersScreens.SetPinScreen(blockersData5, z2, z3, null, setPinScreen4.textOverrides, setPinScreen4.skippable);
                                }
                                screen = setPinScreen2;
                            }
                            str22.getClass();
                            screenNavigator4.goTo(new BlockersScreens.SetPinMessageScreen(blockersData4, str22, screen));
                        } else {
                            if (ordinal != 4) {
                                OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                                return obj;
                            }
                            str22.getClass();
                            BlockersData blockersData6 = blockersData;
                            screenNavigator.goTo(new BlockersScreens.SetPinMessageScreen(blockersData6, str22, blockersData6.exitScreen));
                        }
                        return Unit.INSTANCE;
                    }
                    realBrandFollowPresenter$models$2$1$12 = setPinPresenter$submitPin$13.L$2;
                    SafeTrace.throwOnFailure(obj2);
                    blockersData = blockersData2;
                    textOverrides = textOverrides2;
                    screenNavigator = screenNavigator2;
                    setPinScreen = setPinScreen3;
                    redacted = redacted3;
                    redacted2 = redacted4;
                    coroutineSingletons = coroutineSingletons2;
                    setPinPresenter$submitPin$12 = setPinPresenter$submitPin$13;
                    r15 = 0;
                    i2 = 0;
                } else {
                    SafeTrace.throwOnFailure(obj2);
                    if (setPinScreen3.changingPin && redacted3.getValue() == null && redacted4.getValue() == null) {
                        String str4 = setPinScreen3.instrumentToken;
                        boolean z5 = setPinScreen3.skippable;
                        blockersData2.getClass();
                        str.getClass();
                        textOverrides2.getClass();
                        screenNavigator2.goTo(new BlockersScreens.SetPinScreen(blockersData2, true, false, str4, new RedactedString(null), new RedactedString(str), new RedactedString(null), textOverrides2, z5));
                        return Unit.INSTANCE;
                    }
                    String str5 = (String) setPinScreen3.unconfirmedPin.getValue();
                    if (str5 == null) {
                        screenNavigator2.goTo(new BlockersScreens.SetPinScreen(setPinScreen3.blockersData, setPinScreen3.changingPin, setPinScreen3.resettingPin, setPinScreen3.instrumentToken, setPinScreen3.cvv, setPinScreen3.oldPin, new RedactedString(str), setPinScreen3.textOverrides, setPinScreen3.skippable));
                        return Unit.INSTANCE;
                    }
                    if (!str5.equals(str)) {
                        kClassImpl$Data$$Lambda$23.invoke();
                        return Unit.INSTANCE;
                    }
                    realBrandFollowPresenter$models$2$1$12.invoke(Boolean.TRUE);
                    String str6 = setPinScreen3.instrumentToken;
                    String str7 = (String) redacted3.getValue();
                    if (str7 == null) {
                        str7 = (String) redacted4.getValue();
                    }
                    RequestContext requestContext = blockersData2.requestContext;
                    textOverrides = textOverrides2;
                    blockersData = blockersData2;
                    screenNavigator = screenNavigator2;
                    setPinScreen = setPinScreen3;
                    redacted = redacted3;
                    redacted2 = redacted4;
                    setPinPresenter$submitPin$12 = setPinPresenter$submitPin$13;
                    int i6 = 0;
                    r15 = 0;
                    coroutineSingletons = coroutineSingletons2;
                    SetPasscodeRequest setPasscodeRequest = new SetPasscodeRequest(requestContext, str, str7, null, str6, requestContext.payment_tokens, requestContext.transfer_token, ByteString.EMPTY);
                    Signal signal = setPinPresenter.signOutSignal;
                    SetPinPresenter$submitPin$result$1 setPinPresenter$submitPin$result$1 = new SetPinPresenter$submitPin$result$1(setPinPresenter, setPasscodeRequest, false ? 1 : 0, i6);
                    setPinPresenter$submitPin$12.L$2 = realBrandFollowPresenter$models$2$1$12;
                    i5 = 1;
                    setPinPresenter$submitPin$12.label = 1;
                    obj2 = StateFlowKt.until(signal, setPinPresenter$submitPin$result$1, setPinPresenter$submitPin$12);
                    i2 = i6;
                }
                apiResult = (ApiResult) obj2;
                if (apiResult != null) {
                    return Unit.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest.e("Failed to set passcode.", new Object[i2]);
                    String str8 = TextUtilsCompat.errorMessaging(setPinPresenter.stringManager, (ApiResult.Failure) apiResult, r15).message;
                    realBrandFollowPresenter$models$2$1$12.invoke(Boolean.FALSE);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str8, r15, 4));
                    return Unit.INSTANCE;
                }
                setPasscodeResponse = (SetPasscodeResponse) ((ApiResult.Success) apiResult).response;
                try {
                    if (androidBiometricsStore.getStatus().secureStoreSupported && setPasscodeResponse.status == SetPasscodeResponse.Status.SUCCESS) {
                        String str9 = setPasscodeResponse.passcode_token;
                        setPinPresenter$submitPin$12.L$2 = r15;
                        setPinPresenter$submitPin$12.L$6 = setPasscodeResponse;
                        i3 = 2;
                        try {
                            setPinPresenter$submitPin$12.label = 2;
                            z = i2;
                            obj = r15;
                        } catch (Throwable th2) {
                            th = th2;
                            Timber.Forest.e("Failed to write passcode token.", new Object[i2], th);
                            z = i2;
                            obj = r15;
                            status = setPasscodeResponse.status;
                            ResponseContext responseContext22 = setPasscodeResponse.response_context;
                            if (status == null) {
                            }
                            responseContext22.getClass();
                            String str222 = responseContext22.dialog_message;
                            ordinal = status.ordinal();
                            if (ordinal != i5) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        i3 = 2;
                        z = i2;
                        obj = r15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i3 = 2;
                }
                status = setPasscodeResponse.status;
                ResponseContext responseContext222 = setPasscodeResponse.response_context;
                if (status == null) {
                }
                responseContext222.getClass();
                String str2222 = responseContext222.dialog_message;
                ordinal = status.ordinal();
                if (ordinal != i5) {
                }
                return Unit.INSTANCE;
            }
        }
        setPinPresenter$submitPin$1 = new SetPinPresenter$submitPin$1(setPinPresenter, continuationImpl);
        SetPinPresenter$submitPin$1 setPinPresenter$submitPin$132 = setPinPresenter$submitPin$1;
        Object obj22 = setPinPresenter$submitPin$132.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setPinPresenter$submitPin$132.label;
        int i52 = 1;
        if (i == 0) {
        }
        apiResult = (ApiResult) obj22;
        if (apiResult != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        int i2;
        int i3;
        SetPinPresenter setPinPresenter;
        Continuation continuation;
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2136314151);
        String str2 = this.titleTextOverride;
        if (str2 == null) {
            str2 = this.defaultTitleText;
        }
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation2 = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new FileBlockerView$6$2$2(this, continuation2, r9);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(gapComposer, str2, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState4 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState5 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState6 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState7 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState8 = (MutableState) rememberedValue6;
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, mutableState5, mutableState8, 28));
        Versioned versioned = (Versioned) mutableState5.getValue();
        if (versioned != null) {
            gapComposer.startReplaceGroup(-1106477359);
            i3 = -1106477359;
            i2 = -1106436997;
            RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(versioned, (Continuation) null, this, mutableState4, mutableState7, mutableState6, 6);
            mutableState = mutableState4;
            mutableState2 = mutableState6;
            mutableState3 = mutableState7;
            Updater.LaunchedEffect(gapComposer, versioned, realIdvPresenter$models$1$1);
            gapComposer.end(false);
        } else {
            mutableState = mutableState4;
            mutableState2 = mutableState6;
            mutableState3 = mutableState7;
            i2 = -1106436997;
            i3 = -1106477359;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Integer num = (Integer) mutableState8.getValue();
        if (num != null) {
            gapComposer.startReplaceGroup(i3);
            setPinPresenter = this;
            continuation = null;
            Updater.LaunchedEffect(gapComposer, num, new RealBoostSelector$removeBoost$1(num, continuation, setPinPresenter, mutableState2, 1));
            gapComposer.end(false);
        } else {
            setPinPresenter = this;
            continuation = null;
            gapComposer.startReplaceGroup(i2);
            gapComposer.end(false);
        }
        BlockersScreens.SetPinScreen setPinScreen = setPinPresenter.screen;
        Redacted redacted = setPinScreen.oldPin;
        boolean z = setPinScreen.changingPin;
        Redacted redacted2 = setPinScreen.unconfirmedPin;
        r9 = (redacted.getValue() == null && setPinScreen.cvv.getValue() == null && redacted2.getValue() == null && z) ? 1 : 0;
        String str3 = (String) mutableState.getValue();
        if (str3 == null) {
            str3 = (String) produceState.getValue();
        }
        String str4 = str3;
        BlockersScreens.SetPinScreen.TextOverrides textOverrides = setPinScreen.textOverrides;
        String str5 = (redacted2.getValue() == null ? z || setPinScreen.resettingPin || (str = textOverrides.mainSubtext) == null || StringsKt.isBlank(str) : (str = textOverrides.confirmSubtext) == null || StringsKt.isBlank(str)) ? continuation : str;
        boolean z2 = setPinScreen.skippable;
        AndroidStringManager androidStringManager = setPinPresenter.stringManager;
        SetPinViewModel setPinViewModel = new SetPinViewModel(str4, str5, z2 ? androidStringManager.get(R.string.blockers_skip) : continuation, r9 != 0 ? androidStringManager.get(R.string.cash_pin_help) : continuation, setPinScreen.blockersData.accentColor, ((Boolean) mutableState2.getValue()).booleanValue(), ((Number) mutableState3.getValue()).intValue());
        gapComposer.end(false);
        return setPinViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider biometricsStore;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersNavigator;
        public final DoubleCheck featureFlagManager;
        public final DoubleCheck flowStarter;
        public final Provider pinScreensTitleGeneratorFactory;
        public final DoubleCheck signOutSignal;
        public final LambdaProvider stringManager;

        public MetroFactory(RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck5, IntentLauncher.MetroFactory metroFactory3) {
            this.blockersNavigator = metroFactory;
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.flowStarter = doubleCheck3;
            this.signOutSignal = doubleCheck4;
            this.biometricsStore = metroFactory2;
            this.stringManager = lambdaProvider;
            this.blockerFlowAnalytics = instanceFactory;
            this.featureFlagManager = doubleCheck5;
            this.pinScreensTitleGeneratorFactory = metroFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, TreehouseFlows.MetroFactory metroFactory2, DoubleCheck doubleCheck3, RealGlobalConfigDataSource.MetroFactory metroFactory3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory) {
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck2;
            this.biometricsStore = metroFactory2;
            this.flowStarter = doubleCheck3;
            this.blockerFlowAnalytics = metroFactory3;
            this.signOutSignal = doubleCheck4;
            this.featureFlagManager = doubleCheck5;
            this.pinScreensTitleGeneratorFactory = instanceFactory;
        }
    }
}
