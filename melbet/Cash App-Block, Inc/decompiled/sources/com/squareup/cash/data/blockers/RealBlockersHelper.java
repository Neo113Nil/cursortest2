package com.squareup.cash.data.blockers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.os.Vibrator;
import android.webkit.MimeTypeMap;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.blockers.actions.util.CdfUtilsKt;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractClick;
import com.squareup.cash.cdf.productdiscovery.ProductDiscoveryContentInteractClick;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientHapticsImprovements;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Intents;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealBlockersHelper implements BlockersHelper {
    public final AndroidActivityFinisher activityFinisher;
    public final Analytics analytics;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final AppService appService;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final RealClientScenarioCompleter clientScenarioCompleter;
    public final RealClipboardManager clipboardManager;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final RealFileDownloader fileDownloader;
    public final AndroidFileProvider fileProvider;
    public final RealHapticVibrator hapticVibrator;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final Navigator navigator;
    public final RealRouter router;
    public final CoroutineScope scope;
    public final SignedInStateManager signedInStateManager;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;
    public final CoroutineContext uiDispatcher;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[HelpItem.Action.values().length];
            try {
                iArr[HelpItem.Action.SELECT_OPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HelpItem.Action.OPEN_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HelpItem.Action.RESOLVE_MERGE_FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HelpItem.Action.SKIP_BLOCKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HelpItem.Action.SIGN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HelpItem.Action.START_SUPPORT_FLOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HelpItem.Action.SHOW_MESSAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HelpItem.Action.START_CLIENT_SCENARIO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HelpItem.Action.BLOCKER_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelectOptionResponse.Status.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ByteString.Companion companion = SelectOptionResponse.Status.Companion;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ByteString.Companion companion2 = SelectOptionResponse.Status.Companion;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[BlockerAction.EndFlowAction.Result.values().length];
            try {
                iArr3[BlockerAction.EndFlowAction.Result.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[BlockerAction.EndFlowAction.Result.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BlockerAction.OpenURLAction.Behavior.values().length];
            try {
                iArr4[BlockerAction.OpenURLAction.Behavior.REDIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[BlockerAction.OpenURLAction.Behavior.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BlockerAction.HapticFeedbackAction.Type.values().length];
            try {
                iArr5[BlockerAction.HapticFeedbackAction.Type.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[BlockerAction.HapticFeedbackAction.Type.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public RealBlockersHelper(AppForegroundStateProvider appForegroundStateProvider, RealClientScenarioCompleter realClientScenarioCompleter, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, AppService appService, Analytics analytics, SignedInStateManager signedInStateManager, RealSupportNavigator realSupportNavigator, AndroidToaster androidToaster, IntentLauncher intentLauncher, RealFileDownloader realFileDownloader, AndroidFileProvider androidFileProvider, BlockerFlowListener blockerFlowListener, RealRouter$Factory$Impl realRouter$Factory$Impl, RealClipboardManager realClipboardManager, AndroidActivityFinisher androidActivityFinisher, RealHapticVibrator realHapticVibrator, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineScope coroutineScope, Navigator navigator, AndroidClock androidClock) {
        navigator.getClass();
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.appService = appService;
        this.analytics = analytics;
        this.signedInStateManager = signedInStateManager;
        this.supportNavigator = realSupportNavigator;
        this.launcher = intentLauncher;
        this.fileDownloader = realFileDownloader;
        this.fileProvider = androidFileProvider;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.clipboardManager = realClipboardManager;
        this.activityFinisher = androidActivityFinisher;
        this.hapticVibrator = realHapticVibrator;
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.uiDispatcher = coroutineContext2;
        this.scope = coroutineScope;
        this.navigator = navigator;
        this.clock = androidClock;
        this.router = realRouter$Factory$Impl.create$1(navigator);
    }

    public static final StartedLazily$command$$inlined$unsafeFlow$1 access$blockersFailure(RealBlockersHelper realBlockersHelper, ApiResult.Failure failure, BlockersData blockersData) {
        ErrorMessaging errorMessaging;
        BlockersHelper.BlockersAction.ToggleSpinner toggleSpinner = new BlockersHelper.BlockersAction.ToggleSpinner(false);
        errorMessaging = TextUtilsCompat.errorMessaging(realBlockersHelper.stringManager, failure, null);
        return new StartedLazily$command$$inlined$unsafeFlow$1(new BlockersHelper.BlockersAction[]{toggleSpinner, new BlockersHelper.BlockersAction.ShowError(blockersData, errorMessaging.getMessage())}, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r14.invoke(r15, r4) == r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSubmitAction(RealBlockersHelper realBlockersHelper, BlockerAction.SubmitAction submitAction, BlockersScreens blockersScreens, Function2 function2, ContinuationImpl continuationImpl) {
        RealBlockersHelper$handleSubmitAction$1 realBlockersHelper$handleSubmitAction$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        BlockersScreens blockersScreens2;
        Function2 function22;
        BlockersData blockersData;
        Boolean bool;
        BlockersData blockersData2;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = realBlockersHelper.stringManager;
        Navigator navigator = realBlockersHelper.navigator;
        if (continuationImpl instanceof RealBlockersHelper$handleSubmitAction$1) {
            realBlockersHelper$handleSubmitAction$1 = (RealBlockersHelper$handleSubmitAction$1) continuationImpl;
            int i2 = realBlockersHelper$handleSubmitAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBlockersHelper$handleSubmitAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealBlockersHelper$handleSubmitAction$1 realBlockersHelper$handleSubmitAction$12 = realBlockersHelper$handleSubmitAction$1;
                obj = realBlockersHelper$handleSubmitAction$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBlockersHelper$handleSubmitAction$12.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = Boolean.TRUE;
                    realBlockersHelper$handleSubmitAction$12.L$0 = submitAction;
                    realBlockersHelper$handleSubmitAction$12.L$1 = blockersScreens;
                    realBlockersHelper$handleSubmitAction$12.L$2 = function2;
                    realBlockersHelper$handleSubmitAction$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            blockersData = realBlockersHelper$handleSubmitAction$12.L$3;
                            function22 = realBlockersHelper$handleSubmitAction$12.L$2;
                            blockersScreens2 = realBlockersHelper$handleSubmitAction$12.L$1;
                            SafeTrace.throwOnFailure(obj);
                            ApiResult apiResult2 = (ApiResult) obj;
                            bool = Boolean.FALSE;
                            realBlockersHelper$handleSubmitAction$12.L$0 = null;
                            realBlockersHelper$handleSubmitAction$12.L$1 = blockersScreens2;
                            realBlockersHelper$handleSubmitAction$12.L$2 = null;
                            realBlockersHelper$handleSubmitAction$12.L$3 = blockersData;
                            realBlockersHelper$handleSubmitAction$12.L$4 = apiResult2;
                            realBlockersHelper$handleSubmitAction$12.label = 3;
                            if (function22.invoke(bool, realBlockersHelper$handleSubmitAction$12) != coroutineSingletons) {
                                blockersData2 = blockersData;
                                apiResult = apiResult2;
                                if (!(apiResult instanceof ApiResult.Success)) {
                                }
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        apiResult = realBlockersHelper$handleSubmitAction$12.L$4;
                        blockersData2 = realBlockersHelper$handleSubmitAction$12.L$3;
                        blockersScreens2 = realBlockersHelper$handleSubmitAction$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        if (!(apiResult instanceof ApiResult.Success)) {
                            ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                            responseContext.getClass();
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            BlockersData updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                            String str2 = responseContext.dialog_message;
                            if (str2 != null) {
                                navigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str2, responseContext.dialog_title, 2));
                            } else {
                                navigator.goTo(realBlockersHelper.blockersNavigator.getNext(blockersScreens2, updateFromResponseContext));
                            }
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            navigator.goTo(new FailureMessageBlockerScreen(blockersData2, androidStringManager.get(R.string.generic_network_error), str, 4));
                        }
                        return Unit.INSTANCE;
                    }
                    function2 = realBlockersHelper$handleSubmitAction$12.L$2;
                    blockersScreens = realBlockersHelper$handleSubmitAction$12.L$1;
                    submitAction = realBlockersHelper$handleSubmitAction$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                BlockersData blockersData3 = blockersScreens.getBlockersData();
                Analytics analytics = realBlockersHelper.analytics;
                RealBlockersHelper$handleSubmitAction$apiResult$1 realBlockersHelper$handleSubmitAction$apiResult$1 = new RealBlockersHelper$handleSubmitAction$apiResult$1(realBlockersHelper, submitAction, blockersData3, null);
                realBlockersHelper$handleSubmitAction$12.L$0 = null;
                realBlockersHelper$handleSubmitAction$12.L$1 = blockersScreens;
                realBlockersHelper$handleSubmitAction$12.L$2 = function2;
                realBlockersHelper$handleSubmitAction$12.L$3 = blockersData3;
                realBlockersHelper$handleSubmitAction$12.label = 2;
                obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData3, analytics, androidStringManager, realBlockersHelper$handleSubmitAction$12, null, realBlockersHelper$handleSubmitAction$apiResult$1);
                if (obj != coroutineSingletons) {
                    Function2 function23 = function2;
                    blockersScreens2 = blockersScreens;
                    function22 = function23;
                    blockersData = blockersData3;
                    ApiResult apiResult22 = (ApiResult) obj;
                    bool = Boolean.FALSE;
                    realBlockersHelper$handleSubmitAction$12.L$0 = null;
                    realBlockersHelper$handleSubmitAction$12.L$1 = blockersScreens2;
                    realBlockersHelper$handleSubmitAction$12.L$2 = null;
                    realBlockersHelper$handleSubmitAction$12.L$3 = blockersData;
                    realBlockersHelper$handleSubmitAction$12.L$4 = apiResult22;
                    realBlockersHelper$handleSubmitAction$12.label = 3;
                    if (function22.invoke(bool, realBlockersHelper$handleSubmitAction$12) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realBlockersHelper$handleSubmitAction$1 = new RealBlockersHelper$handleSubmitAction$1(realBlockersHelper, continuationImpl);
        RealBlockersHelper$handleSubmitAction$1 realBlockersHelper$handleSubmitAction$122 = realBlockersHelper$handleSubmitAction$1;
        obj = realBlockersHelper$handleSubmitAction$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBlockersHelper$handleSubmitAction$122.label;
        String str3 = null;
        if (i != 0) {
        }
        BlockersData blockersData32 = blockersScreens.getBlockersData();
        Analytics analytics2 = realBlockersHelper.analytics;
        RealBlockersHelper$handleSubmitAction$apiResult$1 realBlockersHelper$handleSubmitAction$apiResult$12 = new RealBlockersHelper$handleSubmitAction$apiResult$1(realBlockersHelper, submitAction, blockersData32, null);
        realBlockersHelper$handleSubmitAction$122.L$0 = null;
        realBlockersHelper$handleSubmitAction$122.L$1 = blockersScreens;
        realBlockersHelper$handleSubmitAction$122.L$2 = function2;
        realBlockersHelper$handleSubmitAction$122.L$3 = blockersData32;
        realBlockersHelper$handleSubmitAction$122.label = 2;
        obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData32, analytics2, androidStringManager, realBlockersHelper$handleSubmitAction$122, null, realBlockersHelper$handleSubmitAction$apiResult$12);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static /* synthetic */ Object handleBlockerAction$default(RealBlockersHelper realBlockersHelper, BlockerAction blockerAction, BlockersScreens blockersScreens, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Continuation continuation, int i) {
        return realBlockersHelper.handleBlockerAction(blockerAction, blockersScreens, null, null, false, null, (i & 64) != 0 ? new CachedPagingDataKt$cachedIn$4(8) : function2, (i & 128) != 0 ? null : function22, function23, function24, continuation);
    }

    public final Object collectBlockersActions(Flow flow, Function2 function2, Function2 function22, SuspendLambda suspendLambda) {
        Object collect = flow.collect(new RealBlockersHelper$collectBlockersActions$2(0, this, function2, function22), suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (com.squareup.cash.data.blockers.BlockersHelper.handleBlockerAction$default(r3, r4, r13, r6, r10, r8, r9, r0, r11, 64) != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delay(BlockerAction.DelayedAction delayedAction, BlockersScreens blockersScreens, SubmitFormRequest submitFormRequest, Screen screen, boolean z, BlockerAction blockerAction, Function2 function2, Continuation continuation) {
        RealBlockersHelper$delay$1 realBlockersHelper$delay$1;
        RealBlockersHelper realBlockersHelper;
        int i;
        BlockerAction blockerAction2;
        Screen screen2;
        int i2;
        BlockersScreens blockersScreens2;
        Function2 function22;
        SubmitFormRequest submitFormRequest2;
        BlockerAction blockerAction3;
        boolean z2;
        BlockerAction blockerAction4;
        if (continuation instanceof RealBlockersHelper$delay$1) {
            realBlockersHelper$delay$1 = (RealBlockersHelper$delay$1) continuation;
            int i3 = realBlockersHelper$delay$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realBlockersHelper$delay$1.label = i3 - PKIFailureInfo.systemUnavail;
                realBlockersHelper = this;
                RealBlockersHelper$delay$1 realBlockersHelper$delay$12 = realBlockersHelper$delay$1;
                Object obj = realBlockersHelper$delay$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBlockersHelper$delay$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (delayedAction != null && (blockerAction2 = delayedAction.action) != null) {
                        Long l = delayedAction.delay_ms;
                        long longValue = l != null ? l.longValue() : 0L;
                        realBlockersHelper$delay$12.L$1 = blockersScreens;
                        realBlockersHelper$delay$12.L$2 = submitFormRequest;
                        screen2 = screen;
                        realBlockersHelper$delay$12.L$3 = screen2;
                        realBlockersHelper$delay$12.L$4 = blockerAction;
                        realBlockersHelper$delay$12.L$5 = function2;
                        realBlockersHelper$delay$12.L$6 = blockerAction2;
                        realBlockersHelper$delay$12.Z$0 = z;
                        i2 = 0;
                        realBlockersHelper$delay$12.I$0 = 0;
                        realBlockersHelper$delay$12.label = 1;
                        if (JobKt.delay(longValue, realBlockersHelper$delay$12) != coroutineSingletons) {
                            blockersScreens2 = blockersScreens;
                            function22 = function2;
                            submitFormRequest2 = submitFormRequest;
                            blockerAction3 = blockerAction;
                            z2 = z;
                            blockerAction4 = blockerAction2;
                            realBlockersHelper$delay$12.L$1 = null;
                            realBlockersHelper$delay$12.L$2 = null;
                            realBlockersHelper$delay$12.L$3 = null;
                            realBlockersHelper$delay$12.L$4 = null;
                            realBlockersHelper$delay$12.L$5 = null;
                            realBlockersHelper$delay$12.L$6 = null;
                            realBlockersHelper$delay$12.Z$0 = z2;
                            realBlockersHelper$delay$12.I$0 = i2;
                            realBlockersHelper$delay$12.label = 2;
                        }
                        return coroutineSingletons;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = realBlockersHelper$delay$12.I$0;
                boolean z3 = realBlockersHelper$delay$12.Z$0;
                BlockerAction blockerAction5 = realBlockersHelper$delay$12.L$6;
                Function2 function23 = realBlockersHelper$delay$12.L$5;
                blockerAction3 = realBlockersHelper$delay$12.L$4;
                screen2 = realBlockersHelper$delay$12.L$3;
                SubmitFormRequest submitFormRequest3 = realBlockersHelper$delay$12.L$2;
                blockersScreens2 = realBlockersHelper$delay$12.L$1;
                SafeTrace.throwOnFailure(obj);
                i2 = i4;
                function22 = function23;
                z2 = z3;
                blockerAction4 = blockerAction5;
                submitFormRequest2 = submitFormRequest3;
                realBlockersHelper$delay$12.L$1 = null;
                realBlockersHelper$delay$12.L$2 = null;
                realBlockersHelper$delay$12.L$3 = null;
                realBlockersHelper$delay$12.L$4 = null;
                realBlockersHelper$delay$12.L$5 = null;
                realBlockersHelper$delay$12.L$6 = null;
                realBlockersHelper$delay$12.Z$0 = z2;
                realBlockersHelper$delay$12.I$0 = i2;
                realBlockersHelper$delay$12.label = 2;
            }
        }
        realBlockersHelper = this;
        realBlockersHelper$delay$1 = new RealBlockersHelper$delay$1(realBlockersHelper, continuation);
        RealBlockersHelper$delay$1 realBlockersHelper$delay$122 = realBlockersHelper$delay$1;
        Object obj2 = realBlockersHelper$delay$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBlockersHelper$delay$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object download(e0 e0Var, BlockersScreens blockersScreens, Continuation continuation) {
        RealBlockersHelper$download$1 realBlockersHelper$download$1;
        int i;
        RealBlockersHelper realBlockersHelper;
        Uri uri;
        String str;
        if (continuation instanceof RealBlockersHelper$download$1) {
            realBlockersHelper$download$1 = (RealBlockersHelper$download$1) continuation;
            int i2 = realBlockersHelper$download$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBlockersHelper$download$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBlockersHelper$download$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBlockersHelper$download$1.label;
                Navigator navigator = this.navigator;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator.goTo(new BlockersScreens.BlockerActionFileDownloadDialogScreen(blockersScreens.getBlockersData(), e0Var.getLoadingText()));
                    ByteString.Companion companion = ByteString.Companion;
                    String hex = ByteString.Companion.encodeUtf8(e0Var.getFileUrl()).digest$okio("SHA-256").hex();
                    String fileUrl = e0Var.getFileUrl();
                    String m$1 = Boxes$$ExternalSyntheticOutline1.m$1(e0Var.getTitle(), "-", hex, ".", e0Var.getExtension());
                    realBlockersHelper$download$1.L$0 = e0Var;
                    realBlockersHelper$download$1.L$1 = blockersScreens;
                    realBlockersHelper$download$1.label = 1;
                    realBlockersHelper = this;
                    obj = JobKt.withContext(realBlockersHelper.ioDispatcher, new SetNameViewKt$SetName$2$1(realBlockersHelper, m$1, fileUrl, continuation2, 26), realBlockersHelper$download$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersScreens = realBlockersHelper$download$1.L$1;
                    e0Var = realBlockersHelper$download$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realBlockersHelper = this;
                }
                uri = (Uri) obj;
                navigator.goTo(Back.INSTANCE);
                if (uri == null) {
                    String uri2 = uri.toString();
                    uri2.getClass();
                    CreationExtrasKtxKt distributionMethod = e0Var.getDistributionMethod();
                    boolean z = distributionMethod instanceof RealBlockersHelper$FileAction$DistributionMethod$Share;
                    IntentLauncher intentLauncher = realBlockersHelper.launcher;
                    if (z) {
                        Activity activity = intentLauncher.activity;
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri2);
                        if (fileExtensionFromUrl == null || (str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
                            str = "*/*";
                        }
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType(str);
                        intent.putExtra("android.intent.extra.STREAM", Uri.parse(uri2));
                        intent.addFlags(1);
                        Intent createChooser = Intent.createChooser(intent, null);
                        createChooser.getClass();
                        Intents.maybeStartActivity(activity, createChooser, new CameraX$$ExternalSyntheticLambda0(activity, 12));
                    } else if (distributionMethod instanceof RealBlockersHelper$FileAction$DistributionMethod$Email) {
                        RealBlockersHelper$FileAction$DistributionMethod$Email realBlockersHelper$FileAction$DistributionMethod$Email = (RealBlockersHelper$FileAction$DistributionMethod$Email) distributionMethod;
                        intentLauncher.sendEmail(realBlockersHelper$FileAction$DistributionMethod$Email.getSubject(), realBlockersHelper$FileAction$DistributionMethod$Email.getBody(), uri2);
                    } else {
                        if (!(distributionMethod instanceof RealBlockersHelper$FileAction$DistributionMethod$View)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        intentLauncher.viewData(uri2, false);
                    }
                } else {
                    navigator.goTo(new BlockersScreens.BlockerActionFileDownloadFailureDialogScreen(blockersScreens.getBlockersData(), e0Var.getRetryAction()));
                }
                return Unit.INSTANCE;
            }
        }
        realBlockersHelper$download$1 = new RealBlockersHelper$download$1(this, continuation);
        Object obj2 = realBlockersHelper$download$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBlockersHelper$download$1.label;
        Navigator navigator2 = this.navigator;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        uri = (Uri) obj2;
        navigator2.goTo(Back.INSTANCE);
        if (uri == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:408:0x068d, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L432;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0636 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x09d4  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.squareup.protos.franklin.api.BlockerAction] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBlockerAction(BlockerAction blockerAction, BlockersScreens blockersScreens, SubmitFormRequest submitFormRequest, Screen screen, boolean z, BlockerAction blockerAction2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Continuation continuation) {
        Continuation continuation2;
        BlockerAction.ConfirmationDialog confirmationDialog;
        BlockerAction.ConfirmationSheet confirmationSheet;
        BlockerAction.EndFlowAction endFlowAction;
        BlockerAction.MenuAction menuAction;
        BlockerAction.OpenURLAction openURLAction;
        BlockerAction.SkipBlockerAction skipBlockerAction;
        BlockerAction.InternalNavigationAction internalNavigationAction;
        BlockerAction.SignOutAction signOutAction;
        BlockerAction.ShareFileAction shareFileAction;
        BlockerAction.ShareTextAction shareTextAction;
        BlockerAction.ViewFileAction viewFileAction;
        BlockerAction.DialogAction dialogAction;
        BlockerAction.CopyAction copyAction;
        BlockerAction.BackNavigationAction backNavigationAction;
        BlockerAction.EndActivityAction endActivityAction;
        BlockerAction.SubmitAction submitAction;
        BlockerAction.DelayedAction delayedAction;
        BlockerAction.HapticFeedbackAction hapticFeedbackAction;
        BlockerAction.ShowOverlayScreenAction showOverlayScreenAction;
        BlockerAction.OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction;
        Map map;
        FormBlocker formBlocker;
        Integer num;
        Object obj;
        BlockerAction.ShareFileAction.ViewOption viewOption;
        BlockerAction.ShareFileAction.EmailOption emailOption;
        CreationExtrasKtxKt realBlockersHelper$FileAction$DistributionMethod$Email;
        Object download;
        CoroutineSingletons coroutineSingletons;
        BlockerAction.InternalNavigationAction.Support support;
        BlockerAction.InternalNavigationAction.ClientRoute clientRoute;
        FormBlocker.Element.UpsellElement upsellElement;
        FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData;
        BlockerAction.OpenURLAction value;
        FormBlocker.Element.UpsellElement upsellElement2;
        FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData;
        String str;
        BlockersData.AnalyticsData analyticsData;
        String str2;
        String str3;
        ClientScenario clientScenario;
        Flow$Type flow$Type;
        String str4;
        BlockerFlowReferrerType blockerFlowReferrerType;
        String str5 = blockersScreens.getBlockersData().requestContext.blocker_descriptor_id;
        String nextBlockerType = Intrinsics.areEqual(blockersScreens.getBlockersData().getNextBlockerId(), str5) ? blockersScreens.getBlockersData().getNextBlockerType() : null;
        com.squareup.cash.cdf.BlockerAction cdfBlockerAction = CdfUtilsKt.toCdfBlockerAction(blockerAction);
        FormBlocker.Element.UpsellElement upsellElement3 = null;
        Analytics analytics = this.analytics;
        if (cdfBlockerAction != null) {
            BlockerAction.Action action = blockerAction.action;
            if (action != null) {
                BlockerAction.Action.SubmitAction submitAction2 = action instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action : null;
                BlockerAction.SubmitAction value2 = submitAction2 != null ? submitAction2.getValue() : null;
                if (value2 != null) {
                    str = value2.id;
                    String str6 = blockerAction.text;
                    String str7 = blockersScreens.getBlockersData().flowToken;
                    ClientScenario clientScenario2 = blockersScreens.getBlockersData().clientScenario;
                    Flow$Type flow$Type2 = blockersScreens.getBlockersData().flowType;
                    BlockersData.AnalyticsData analyticsData2 = blockersScreens.getBlockersData().analyticsData;
                    String str8 = analyticsData2 == null ? analyticsData2.referrerFlowToken : null;
                    analyticsData = blockersScreens.getBlockersData().analyticsData;
                    if (analyticsData == null) {
                        str2 = str6;
                        str3 = str7;
                        clientScenario = clientScenario2;
                        flow$Type = flow$Type2;
                        str4 = str8;
                        blockerFlowReferrerType = analyticsData.referrerFlowType;
                    } else {
                        str2 = str6;
                        str3 = str7;
                        clientScenario = clientScenario2;
                        flow$Type = flow$Type2;
                        str4 = str8;
                        blockerFlowReferrerType = null;
                    }
                    upsellElement3 = null;
                    BlockerFlowAnalyticsHelperKt.trackTapBlockerAction(analytics, cdfBlockerAction, str3, clientScenario, flow$Type, str5, nextBlockerType, str, str2, str4, blockerFlowReferrerType);
                }
            }
            str = null;
            String str62 = blockerAction.text;
            String str72 = blockersScreens.getBlockersData().flowToken;
            ClientScenario clientScenario22 = blockersScreens.getBlockersData().clientScenario;
            Flow$Type flow$Type22 = blockersScreens.getBlockersData().flowType;
            BlockersData.AnalyticsData analyticsData22 = blockersScreens.getBlockersData().analyticsData;
            if (analyticsData22 == null) {
            }
            analyticsData = blockersScreens.getBlockersData().analyticsData;
            if (analyticsData == null) {
            }
            upsellElement3 = null;
            BlockerFlowAnalyticsHelperKt.trackTapBlockerAction(analytics, cdfBlockerAction, str3, clientScenario, flow$Type, str5, nextBlockerType, str, str2, str4, blockerFlowReferrerType);
        }
        boolean z2 = blockersScreens instanceof BlockersScreens.FormScreen;
        if (z2) {
            List list = ((BlockersScreens.FormScreen) blockersScreens).elements;
            ProductDiscoveryContentInteractClick.ClickElement clickElement = ProductDiscoveryContentInteractClick.ClickElement.CONTENT_CTA;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                FormBlocker.Element.UpsellElement upsellElement4 = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it.next());
                FormBlocker.Element.UpsellElement upsellElement5 = upsellElement4 != null ? upsellElement4.button_action : upsellElement3;
                if (upsellElement5 != null) {
                    arrayList.add(upsellElement5);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (blockerAction.equals((BlockerAction) it2.next())) {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                upsellElement2 = upsellElement3;
                                break;
                            }
                            upsellElement2 = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it3.next());
                            if (upsellElement2 != null) {
                                break;
                            }
                        }
                        if (upsellElement2 != null && (productDiscoveryData = upsellElement2.product_discovery_data) != null) {
                            analytics.track(new ProductDiscoveryContentInteractClick(productDiscoveryData.product_discovery_flow_token, productDiscoveryData.product_major, productDiscoveryData.product_minor, productDiscoveryData.product_category, productDiscoveryData.content_token, productDiscoveryData.content_template_token, clickElement), null);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                FormBlocker.Element.UpsellElement upsellElement6 = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it4.next());
                BlockerAction blockerAction3 = upsellElement6 != null ? upsellElement6.button_action : null;
                if (blockerAction3 != null) {
                    arrayList2.add(blockerAction3);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it5 = arrayList2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    if (blockerAction.equals((BlockerAction) it5.next())) {
                        Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                upsellElement = null;
                                break;
                            }
                            upsellElement = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it6.next());
                            if (upsellElement != null) {
                                break;
                            }
                        }
                        if (upsellElement != null && (onDemandMessageData = upsellElement.on_demand_message_data) != null) {
                            String str9 = onDemandMessageData.product_type;
                            List listOf = str9 != null ? CollectionsKt__CollectionsJVMKt.listOf(str9) : null;
                            String str10 = onDemandMessageData.campaign_token;
                            Long valueOf = Long.valueOf(this.clock.millis());
                            BlockerAction.Action action2 = blockerAction.action;
                            BlockerAction.Action.OpenUrlAction openUrlAction = action2 instanceof BlockerAction.Action.OpenUrlAction ? (BlockerAction.Action.OpenUrlAction) action2 : null;
                            String str11 = (openUrlAction == null || (value = openUrlAction.getValue()) == null) ? null : value.url;
                            String str12 = onDemandMessageData.placement;
                            OnDemandMessageInteractClick onDemandMessageInteractClick = new OnDemandMessageInteractClick(str10, valueOf, str11, str12 != null ? Placement.valueOf(str12) : null, onDemandMessageData.template_token, onDemandMessageData.template_version, AppMessageFormat.CARD, listOf != null ? CollectionsKt.joinToString$default(listOf, null, null, null, 0, null, null, 63) : null, 16);
                            continuation2 = 0;
                            analytics.track(onDemandMessageInteractClick, null);
                        }
                    }
                }
            }
            continuation2 = 0;
        } else {
            continuation2 = upsellElement3;
        }
        Function2 realBlockersHelper$handleBlockerAction$submitActionHandler$1 = function22 == null ? new RealBlockersHelper$handleBlockerAction$submitActionHandler$1(this, blockersScreens, function2, continuation2) : function22;
        BlockerAction.Action action3 = blockerAction.action;
        BlockerAction.ConfirmationElement confirmationElement = blockerAction.confirmation_element;
        if (confirmationElement != null) {
            BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog2 = confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement : continuation2;
            if (confirmationDialog2 != null) {
                confirmationDialog = confirmationDialog2.getValue();
                Navigator navigator = this.navigator;
                if (confirmationDialog == null) {
                    BlockersData blockersData = blockersScreens.getBlockersData();
                    BlockerAction.ConfirmationElement confirmationElement2 = blockerAction.confirmation_element;
                    confirmationElement2.getClass();
                    BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog3 = confirmationElement2 instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement2 : continuation2;
                    BlockerAction.ConfirmationDialog value3 = confirmationDialog3 != null ? confirmationDialog3.getValue() : continuation2;
                    value3.getClass();
                    navigator.goTo(new BlockersScreens.BlockerActionConfirmDialogScreen(blockersData, value3, BlockersOneofExtensionsKt.copy$default(2, blockerAction)));
                } else {
                    if (confirmationElement != null) {
                        BlockerAction.ConfirmationElement.ConfirmationSheet confirmationSheet2 = confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet ? (BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement : continuation2;
                        if (confirmationSheet2 != null) {
                            confirmationSheet = confirmationSheet2.getValue();
                            int i = 1;
                            if (confirmationSheet == null) {
                                BlockersData blockersData2 = blockersScreens.getBlockersData();
                                BlockerAction.ConfirmationElement confirmationElement3 = blockerAction.confirmation_element;
                                confirmationElement3.getClass();
                                BlockerAction.ConfirmationElement.ConfirmationSheet confirmationSheet3 = confirmationElement3 instanceof BlockerAction.ConfirmationElement.ConfirmationSheet ? (BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement3 : continuation2;
                                BlockerAction.ConfirmationSheet value4 = confirmationSheet3 != null ? confirmationSheet3.getValue() : continuation2;
                                value4.getClass();
                                navigator.goTo(new BlockersScreens.BlockerActionConfirmSheetScreen(blockersData2, value4, BlockersOneofExtensionsKt.copy$default(1, blockerAction), submitFormRequest, screen, z, blockerAction2));
                            } else {
                                if (action3 != null) {
                                    BlockerAction.Action.EndFlowAction endFlowAction2 = action3 instanceof BlockerAction.Action.EndFlowAction ? (BlockerAction.Action.EndFlowAction) action3 : continuation2;
                                    if (endFlowAction2 != null) {
                                        endFlowAction = endFlowAction2.getValue();
                                        if (endFlowAction == null) {
                                            BlockerAction.Action.EndFlowAction endFlowAction3 = action3 instanceof BlockerAction.Action.EndFlowAction ? (BlockerAction.Action.EndFlowAction) action3 : continuation2;
                                            BlockerAction.EndFlowAction value5 = endFlowAction3 != null ? endFlowAction3.getValue() : continuation2;
                                            value5.getClass();
                                            BlockerAction.EndFlowAction.Result result = value5.result;
                                            if (result == null) {
                                                result = BlockerAction.EndFlowAction.Result.COMPLETE;
                                            }
                                            int i2 = WhenMappings.$EnumSwitchMapping$2[result.ordinal()];
                                            BlockerFlowListener blockerFlowListener = this.blockerFlowAnalytics;
                                            if (i2 == 1) {
                                                blockerFlowListener.onFlowCompleted(blockersScreens.getBlockersData());
                                            } else {
                                                if (i2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                blockerFlowListener.onFlowCancelled(blockersScreens.getBlockersData());
                                            }
                                            String str13 = value5.notify_end_flow_id;
                                            if (str13 != null) {
                                                JobKt.launch$default(this.scope, continuation2, continuation2, new RealProfileManager$setPhoto$2(this, blockersScreens, str13, continuation2, 17), 3);
                                            }
                                            navigator.goTo(blockersScreens.getBlockersData().exitScreen);
                                        } else {
                                            if (action3 != null) {
                                                BlockerAction.Action.MenuAction menuAction2 = action3 instanceof BlockerAction.Action.MenuAction ? (BlockerAction.Action.MenuAction) action3 : continuation2;
                                                if (menuAction2 != null) {
                                                    menuAction = menuAction2.getValue();
                                                    if (menuAction == null) {
                                                        BlockerAction.Action.MenuAction menuAction3 = action3 instanceof BlockerAction.Action.MenuAction ? (BlockerAction.Action.MenuAction) action3 : continuation2;
                                                        BlockerAction.MenuAction value6 = menuAction3 != null ? menuAction3.getValue() : continuation2;
                                                        value6.getClass();
                                                        navigator.goTo(new BlockersScreens.FormMenuActionSheet(blockersScreens.getBlockersData(), value6));
                                                    } else {
                                                        if (action3 != null) {
                                                            BlockerAction.Action.OpenUrlAction openUrlAction2 = action3 instanceof BlockerAction.Action.OpenUrlAction ? (BlockerAction.Action.OpenUrlAction) action3 : continuation2;
                                                            if (openUrlAction2 != null) {
                                                                openURLAction = openUrlAction2.getValue();
                                                                IntentLauncher intentLauncher = this.launcher;
                                                                if (openURLAction != null) {
                                                                    if (action3 != null) {
                                                                        BlockerAction.Action.SkipBlockerAction skipBlockerAction2 = action3 instanceof BlockerAction.Action.SkipBlockerAction ? (BlockerAction.Action.SkipBlockerAction) action3 : null;
                                                                        if (skipBlockerAction2 != null) {
                                                                            skipBlockerAction = skipBlockerAction2.getValue();
                                                                            if (skipBlockerAction != null) {
                                                                                if (action3 != null) {
                                                                                    BlockerAction.Action.InternalNavigationAction internalNavigationAction2 = action3 instanceof BlockerAction.Action.InternalNavigationAction ? (BlockerAction.Action.InternalNavigationAction) action3 : null;
                                                                                    if (internalNavigationAction2 != null) {
                                                                                        internalNavigationAction = internalNavigationAction2.getValue();
                                                                                        if (internalNavigationAction == null) {
                                                                                            BlockerAction.Action.InternalNavigationAction internalNavigationAction3 = action3 instanceof BlockerAction.Action.InternalNavigationAction ? (BlockerAction.Action.InternalNavigationAction) action3 : null;
                                                                                            BlockerAction.InternalNavigationAction value7 = internalNavigationAction3 != null ? internalNavigationAction3.getValue() : null;
                                                                                            value7.getClass();
                                                                                            if ((blockersScreens.getBlockersData().exitScreen instanceof MoneybotChatScreen) && value7.necessity == BlockerAction.InternalNavigationAction.Necessity.PREFERRED) {
                                                                                                navigator.goTo(blockersScreens.getBlockersData().exitScreen);
                                                                                            } else {
                                                                                                BlockerAction.InternalNavigationAction.Destination destination = value7.destination;
                                                                                                if (destination != null) {
                                                                                                    BlockerAction.InternalNavigationAction.Destination.Support support2 = destination instanceof BlockerAction.InternalNavigationAction.Destination.Support ? (BlockerAction.InternalNavigationAction.Destination.Support) destination : null;
                                                                                                    if (support2 != null) {
                                                                                                        support = support2.getValue();
                                                                                                        BlockerAction.InternalNavigationAction.Destination destination2 = value7.destination;
                                                                                                        if (support == null) {
                                                                                                            destination2.getClass();
                                                                                                            BlockerAction.InternalNavigationAction.Destination.Support support3 = destination2 instanceof BlockerAction.InternalNavigationAction.Destination.Support ? (BlockerAction.InternalNavigationAction.Destination.Support) destination2 : null;
                                                                                                            BlockerAction.InternalNavigationAction.Support value8 = support3 != null ? support3.getValue() : null;
                                                                                                            value8.getClass();
                                                                                                            ClientScenario clientScenario3 = blockersScreens.getBlockersData().clientScenario;
                                                                                                            Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_scenario", clientScenario3 != null ? clientScenario3.name() : null), new Pair("blocker_id", blockersScreens.getBlockersData().blockerId), new Pair("node_token", value8.support_flow_node));
                                                                                                            Timber.Forest.e(new IllegalStateException("Deprecated API BlockerAction.InternalNavigationAction.Support is used: " + mapOf));
                                                                                                            navigator.goTo(RealSupportNavigator.startSupportFlow$default(this.supportNavigator, value8.support_flow_node, null, blockersScreens, SupportNavigator$Source.BLOCKER_FLOW, null, null, 102));
                                                                                                        } else {
                                                                                                            if (destination2 != null) {
                                                                                                                BlockerAction.InternalNavigationAction.Destination.ClientRoute clientRoute2 = destination2 instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute ? (BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination2 : null;
                                                                                                                if (clientRoute2 != null) {
                                                                                                                    clientRoute = clientRoute2.getValue();
                                                                                                                    if (clientRoute != null) {
                                                                                                                        Path$$ExternalSyntheticBUOutline0.m$1(blockerAction, "Nothing set inside internal_navigation_action for ");
                                                                                                                        return null;
                                                                                                                    }
                                                                                                                    BlockerAction.InternalNavigationAction.Destination destination3 = value7.destination;
                                                                                                                    destination3.getClass();
                                                                                                                    BlockerAction.InternalNavigationAction.Destination.ClientRoute clientRoute3 = destination3 instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute ? (BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination3 : null;
                                                                                                                    BlockerAction.InternalNavigationAction.ClientRoute value9 = clientRoute3 != null ? clientRoute3.getValue() : null;
                                                                                                                    value9.getClass();
                                                                                                                    String str14 = value9.url;
                                                                                                                    str14.getClass();
                                                                                                                    internalNavigation(str14, blockersScreens);
                                                                                                                }
                                                                                                            }
                                                                                                            clientRoute = null;
                                                                                                            if (clientRoute != null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                support = null;
                                                                                                BlockerAction.InternalNavigationAction.Destination destination22 = value7.destination;
                                                                                                if (support == null) {
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (action3 != null) {
                                                                                                BlockerAction.Action.SignOutAction signOutAction2 = action3 instanceof BlockerAction.Action.SignOutAction ? (BlockerAction.Action.SignOutAction) action3 : null;
                                                                                                if (signOutAction2 != null) {
                                                                                                    signOutAction = signOutAction2.getValue();
                                                                                                    if (signOutAction == null) {
                                                                                                        this.signedInStateManager.update(SignedInState.SIGNED_OUT);
                                                                                                    } else {
                                                                                                        if (action3 != null) {
                                                                                                            BlockerAction.Action.ShareAction shareAction = action3 instanceof BlockerAction.Action.ShareAction ? (BlockerAction.Action.ShareAction) action3 : null;
                                                                                                            if (shareAction != null) {
                                                                                                                shareFileAction = shareAction.getValue();
                                                                                                                if (shareFileAction == null) {
                                                                                                                    BlockerAction.Action action4 = blockerAction.action;
                                                                                                                    action4.getClass();
                                                                                                                    BlockerAction.Action.ShareAction shareAction2 = action4 instanceof BlockerAction.Action.ShareAction ? (BlockerAction.Action.ShareAction) action4 : null;
                                                                                                                    BlockerAction.ShareFileAction value10 = shareAction2 != null ? shareAction2.getValue() : null;
                                                                                                                    value10.getClass();
                                                                                                                    BlockerAction.ShareFileAction.ShareOption shareOption = value10.options.get(0);
                                                                                                                    BlockerAction.ShareFileAction.ShareOption.Option option = shareOption.option;
                                                                                                                    if (option != null) {
                                                                                                                        BlockerAction.ShareFileAction.ShareOption.Option.View view = option instanceof BlockerAction.ShareFileAction.ShareOption.Option.View ? (BlockerAction.ShareFileAction.ShareOption.Option.View) option : null;
                                                                                                                        if (view != null) {
                                                                                                                            viewOption = view.getValue();
                                                                                                                            if (viewOption == null) {
                                                                                                                                realBlockersHelper$FileAction$DistributionMethod$Email = RealBlockersHelper$FileAction$DistributionMethod$Share.INSTANCE;
                                                                                                                            } else {
                                                                                                                                BlockerAction.ShareFileAction.ShareOption.Option option2 = shareOption.option;
                                                                                                                                if (option2 != null) {
                                                                                                                                    BlockerAction.ShareFileAction.ShareOption.Option.Email email = option2 instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email ? (BlockerAction.ShareFileAction.ShareOption.Option.Email) option2 : null;
                                                                                                                                    if (email != null) {
                                                                                                                                        emailOption = email.getValue();
                                                                                                                                        if (emailOption != null) {
                                                                                                                                            a$$ExternalSyntheticBUOutline0.m$1("No ShareOption provided!");
                                                                                                                                            return null;
                                                                                                                                        }
                                                                                                                                        BlockerAction.ShareFileAction.ShareOption.Option option3 = shareOption.option;
                                                                                                                                        option3.getClass();
                                                                                                                                        BlockerAction.ShareFileAction.ShareOption.Option.Email email2 = option3 instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email ? (BlockerAction.ShareFileAction.ShareOption.Option.Email) option3 : null;
                                                                                                                                        BlockerAction.ShareFileAction.EmailOption value11 = email2 != null ? email2.getValue() : null;
                                                                                                                                        value11.getClass();
                                                                                                                                        String str15 = value11.subject;
                                                                                                                                        str15.getClass();
                                                                                                                                        BlockerAction.ShareFileAction.ShareOption.Option option4 = shareOption.option;
                                                                                                                                        option4.getClass();
                                                                                                                                        BlockerAction.ShareFileAction.ShareOption.Option.Email email3 = option4 instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email ? (BlockerAction.ShareFileAction.ShareOption.Option.Email) option4 : null;
                                                                                                                                        BlockerAction.ShareFileAction.EmailOption value12 = email3 != null ? email3.getValue() : null;
                                                                                                                                        value12.getClass();
                                                                                                                                        String str16 = value12.body;
                                                                                                                                        str16.getClass();
                                                                                                                                        realBlockersHelper$FileAction$DistributionMethod$Email = new RealBlockersHelper$FileAction$DistributionMethod$Email(str15, str16);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                emailOption = null;
                                                                                                                                if (emailOption != null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                            String str17 = value10.file_url;
                                                                                                                            str17.getClass();
                                                                                                                            String str18 = value10.title;
                                                                                                                            str18.getClass();
                                                                                                                            String str19 = value10.extension;
                                                                                                                            str19.getClass();
                                                                                                                            String str20 = value10.loading_text;
                                                                                                                            str20.getClass();
                                                                                                                            download = download(new e0(str17, str18, str19, str20, realBlockersHelper$FileAction$DistributionMethod$Email, blockerAction), blockersScreens, continuation);
                                                                                                                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                            if (download != coroutineSingletons) {
                                                                                                                                download = Unit.INSTANCE;
                                                                                                                            }
                                                                                                                            return download != coroutineSingletons ? download : Unit.INSTANCE;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    viewOption = null;
                                                                                                                    if (viewOption == null) {
                                                                                                                    }
                                                                                                                    String str172 = value10.file_url;
                                                                                                                    str172.getClass();
                                                                                                                    String str182 = value10.title;
                                                                                                                    str182.getClass();
                                                                                                                    String str192 = value10.extension;
                                                                                                                    str192.getClass();
                                                                                                                    String str202 = value10.loading_text;
                                                                                                                    str202.getClass();
                                                                                                                    download = download(new e0(str172, str182, str192, str202, realBlockersHelper$FileAction$DistributionMethod$Email, blockerAction), blockersScreens, continuation);
                                                                                                                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                    if (download != coroutineSingletons) {
                                                                                                                    }
                                                                                                                    if (download != coroutineSingletons) {
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (action3 != null) {
                                                                                                                        BlockerAction.Action.ShareTextAction shareTextAction2 = action3 instanceof BlockerAction.Action.ShareTextAction ? (BlockerAction.Action.ShareTextAction) action3 : null;
                                                                                                                        if (shareTextAction2 != null) {
                                                                                                                            shareTextAction = shareTextAction2.getValue();
                                                                                                                            if (shareTextAction == null) {
                                                                                                                                BlockerAction.Action.ShareTextAction shareTextAction3 = action3 instanceof BlockerAction.Action.ShareTextAction ? (BlockerAction.Action.ShareTextAction) action3 : null;
                                                                                                                                BlockerAction.ShareTextAction value13 = shareTextAction3 != null ? shareTextAction3.getValue() : null;
                                                                                                                                value13.getClass();
                                                                                                                                String str21 = value13.sms_recipient;
                                                                                                                                if (str21 == null || StringsKt.isBlank(str21)) {
                                                                                                                                    String str22 = value13.text_data;
                                                                                                                                    str22.getClass();
                                                                                                                                    intentLauncher.shareText(str22, value13.title, value13.email_subject);
                                                                                                                                } else {
                                                                                                                                    String str23 = value13.text_data;
                                                                                                                                    str23.getClass();
                                                                                                                                    String str24 = value13.sms_recipient;
                                                                                                                                    str24.getClass();
                                                                                                                                    intentLauncher.sendSms(str23, str24);
                                                                                                                                    BlockerAction blockerAction4 = value13.after_successful_sms_blocker_action;
                                                                                                                                    if (blockerAction4 != null) {
                                                                                                                                        obj = handleBlockerAction$default(this, blockerAction4, blockersScreens, null, realBlockersHelper$handleBlockerAction$submitActionHandler$1, function23, function24, continuation, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                obj = Unit.INSTANCE;
                                                                                                                                return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
                                                                                                                            }
                                                                                                                            if (action3 != null) {
                                                                                                                                BlockerAction.Action.ViewAction viewAction = action3 instanceof BlockerAction.Action.ViewAction ? (BlockerAction.Action.ViewAction) action3 : null;
                                                                                                                                if (viewAction != null) {
                                                                                                                                    viewFileAction = viewAction.getValue();
                                                                                                                                    if (viewFileAction == null) {
                                                                                                                                        BlockerAction.Action action5 = blockerAction.action;
                                                                                                                                        action5.getClass();
                                                                                                                                        BlockerAction.Action.ViewAction viewAction2 = action5 instanceof BlockerAction.Action.ViewAction ? (BlockerAction.Action.ViewAction) action5 : null;
                                                                                                                                        BlockerAction.ViewFileAction value14 = viewAction2 != null ? viewAction2.getValue() : null;
                                                                                                                                        value14.getClass();
                                                                                                                                        String str25 = value14.file_url;
                                                                                                                                        str25.getClass();
                                                                                                                                        String str26 = value14.title;
                                                                                                                                        str26.getClass();
                                                                                                                                        String str27 = value14.extension;
                                                                                                                                        str27.getClass();
                                                                                                                                        String str28 = value14.loading_text;
                                                                                                                                        str28.getClass();
                                                                                                                                        Object download2 = download(new e0(str25, str26, str27, str28, RealBlockersHelper$FileAction$DistributionMethod$View.INSTANCE, blockerAction), blockersScreens, continuation);
                                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                        if (download2 != coroutineSingletons2) {
                                                                                                                                            download2 = Unit.INSTANCE;
                                                                                                                                        }
                                                                                                                                        return download2 == coroutineSingletons2 ? download2 : Unit.INSTANCE;
                                                                                                                                    }
                                                                                                                                    if (action3 != null) {
                                                                                                                                        BlockerAction.Action.DialogAction dialogAction2 = action3 instanceof BlockerAction.Action.DialogAction ? (BlockerAction.Action.DialogAction) action3 : null;
                                                                                                                                        if (dialogAction2 != null) {
                                                                                                                                            dialogAction = dialogAction2.getValue();
                                                                                                                                            if (dialogAction == null) {
                                                                                                                                                BlockerAction.Action.DialogAction dialogAction3 = action3 instanceof BlockerAction.Action.DialogAction ? (BlockerAction.Action.DialogAction) action3 : null;
                                                                                                                                                BlockerAction.DialogAction value15 = dialogAction3 != null ? dialogAction3.getValue() : null;
                                                                                                                                                value15.getClass();
                                                                                                                                                navigator.goTo(new BlockersScreens.BlockerActionDialogActionScreen(blockersScreens.getBlockersData(), value15));
                                                                                                                                            } else {
                                                                                                                                                if (action3 != null) {
                                                                                                                                                    BlockerAction.Action.CopyAction copyAction2 = action3 instanceof BlockerAction.Action.CopyAction ? (BlockerAction.Action.CopyAction) action3 : null;
                                                                                                                                                    if (copyAction2 != null) {
                                                                                                                                                        copyAction = copyAction2.getValue();
                                                                                                                                                        if (copyAction == null) {
                                                                                                                                                            BlockerAction.Action.CopyAction copyAction3 = action3 instanceof BlockerAction.Action.CopyAction ? (BlockerAction.Action.CopyAction) action3 : null;
                                                                                                                                                            BlockerAction.CopyAction value16 = copyAction3 != null ? copyAction3.getValue() : null;
                                                                                                                                                            value16.getClass();
                                                                                                                                                            String str29 = value16.text;
                                                                                                                                                            if (str29 != null && !StringsKt.isBlank(str29)) {
                                                                                                                                                                AndroidStringManager androidStringManager = this.stringManager;
                                                                                                                                                                this.clipboardManager.copy(androidStringManager.get(R.string.copy_action_label), str29);
                                                                                                                                                                navigator.goTo(new BlockersScreens.BlockerActionDialogActionScreen(blockersScreens.getBlockersData(), new BlockerAction.DialogAction("", androidStringManager.get(R.string.copy_action_successful_dialog_message), new BlockerAction.DialogAction.Button(androidStringManager.get(R.string.ok), null, null, null, 14, null), false ? 1 : 0, false ? 1 : 0, 24, null)));
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            if (action3 != null) {
                                                                                                                                                                BlockerAction.Action.BackNavigationAction backNavigationAction2 = action3 instanceof BlockerAction.Action.BackNavigationAction ? (BlockerAction.Action.BackNavigationAction) action3 : null;
                                                                                                                                                                if (backNavigationAction2 != null) {
                                                                                                                                                                    backNavigationAction = backNavigationAction2.getValue();
                                                                                                                                                                    if (backNavigationAction == null) {
                                                                                                                                                                        intentLauncher.activity.moveTaskToBack(true);
                                                                                                                                                                        navigator.goTo(blockersScreens.getBlockersData().exitScreen);
                                                                                                                                                                    } else {
                                                                                                                                                                        if (action3 != null) {
                                                                                                                                                                            BlockerAction.Action.EndActivityAction endActivityAction2 = action3 instanceof BlockerAction.Action.EndActivityAction ? (BlockerAction.Action.EndActivityAction) action3 : null;
                                                                                                                                                                            if (endActivityAction2 != null) {
                                                                                                                                                                                endActivityAction = endActivityAction2.getValue();
                                                                                                                                                                                if (endActivityAction == null) {
                                                                                                                                                                                    BlockerAction.Action.EndActivityAction endActivityAction3 = action3 instanceof BlockerAction.Action.EndActivityAction ? (BlockerAction.Action.EndActivityAction) action3 : null;
                                                                                                                                                                                    BlockerAction.EndActivityAction value17 = endActivityAction3 != null ? endActivityAction3.getValue() : null;
                                                                                                                                                                                    value17.getClass();
                                                                                                                                                                                    BlockerAction.EndActivityResult endActivityResult = value17.end_activity_result_status;
                                                                                                                                                                                    if (endActivityResult != null && (num = endActivityResult.result_status) != null) {
                                                                                                                                                                                        i = num.intValue();
                                                                                                                                                                                    }
                                                                                                                                                                                    Intent intent = new Intent();
                                                                                                                                                                                    for (Map.Entry<String, String> entry : value17.intent_resolution_data.entrySet()) {
                                                                                                                                                                                        intent.putExtra(entry.getKey(), entry.getValue());
                                                                                                                                                                                    }
                                                                                                                                                                                    Activity activity = this.activityFinisher.activity;
                                                                                                                                                                                    activity.setResult(i, intent);
                                                                                                                                                                                    activity.finish();
                                                                                                                                                                                } else {
                                                                                                                                                                                    if (action3 != null) {
                                                                                                                                                                                        BlockerAction.Action.SubmitAction submitAction3 = action3 instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action3 : null;
                                                                                                                                                                                        if (submitAction3 != null) {
                                                                                                                                                                                            submitAction = submitAction3.getValue();
                                                                                                                                                                                            if (submitAction == null) {
                                                                                                                                                                                                BlockerAction.Action.SubmitAction submitAction4 = action3 instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action3 : null;
                                                                                                                                                                                                BlockerAction.SubmitAction value18 = submitAction4 != null ? submitAction4.getValue() : null;
                                                                                                                                                                                                value18.getClass();
                                                                                                                                                                                                Object invoke = realBlockersHelper$handleBlockerAction$submitActionHandler$1.invoke(value18, continuation);
                                                                                                                                                                                                return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.INSTANCE;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (action3 != null) {
                                                                                                                                                                                                BlockerAction.Action.DelayedAction delayedAction2 = action3 instanceof BlockerAction.Action.DelayedAction ? (BlockerAction.Action.DelayedAction) action3 : null;
                                                                                                                                                                                                if (delayedAction2 != null) {
                                                                                                                                                                                                    delayedAction = delayedAction2.getValue();
                                                                                                                                                                                                    if (delayedAction == null) {
                                                                                                                                                                                                        BlockerAction.Action.DelayedAction delayedAction3 = action3 instanceof BlockerAction.Action.DelayedAction ? (BlockerAction.Action.DelayedAction) action3 : null;
                                                                                                                                                                                                        Object delay = delay(delayedAction3 != null ? delayedAction3.getValue() : null, blockersScreens, submitFormRequest, screen, z, blockerAction2, realBlockersHelper$handleBlockerAction$submitActionHandler$1, continuation);
                                                                                                                                                                                                        return delay == CoroutineSingletons.COROUTINE_SUSPENDED ? delay : Unit.INSTANCE;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (action3 != null) {
                                                                                                                                                                                                        BlockerAction.Action.HapticFeedbackAction hapticFeedbackAction2 = action3 instanceof BlockerAction.Action.HapticFeedbackAction ? (BlockerAction.Action.HapticFeedbackAction) action3 : null;
                                                                                                                                                                                                        if (hapticFeedbackAction2 != null) {
                                                                                                                                                                                                            hapticFeedbackAction = hapticFeedbackAction2.getValue();
                                                                                                                                                                                                            if (hapticFeedbackAction == null) {
                                                                                                                                                                                                                BlockerAction.Action.HapticFeedbackAction hapticFeedbackAction3 = action3 instanceof BlockerAction.Action.HapticFeedbackAction ? (BlockerAction.Action.HapticFeedbackAction) action3 : null;
                                                                                                                                                                                                                BlockerAction.HapticFeedbackAction value19 = hapticFeedbackAction3 != null ? hapticFeedbackAction3.getValue() : null;
                                                                                                                                                                                                                value19.getClass();
                                                                                                                                                                                                                Object triggerHaptic = triggerHaptic(value19, continuation);
                                                                                                                                                                                                                return triggerHaptic == CoroutineSingletons.COROUTINE_SUSPENDED ? triggerHaptic : Unit.INSTANCE;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (action3 != null) {
                                                                                                                                                                                                                BlockerAction.Action.ShowOverlayScreenAction showOverlayScreenAction2 = action3 instanceof BlockerAction.Action.ShowOverlayScreenAction ? (BlockerAction.Action.ShowOverlayScreenAction) action3 : null;
                                                                                                                                                                                                                if (showOverlayScreenAction2 != null) {
                                                                                                                                                                                                                    showOverlayScreenAction = showOverlayScreenAction2.getValue();
                                                                                                                                                                                                                    if (showOverlayScreenAction == null) {
                                                                                                                                                                                                                        BlockerAction.Action.ShowOverlayScreenAction showOverlayScreenAction3 = action3 instanceof BlockerAction.Action.ShowOverlayScreenAction ? (BlockerAction.Action.ShowOverlayScreenAction) action3 : null;
                                                                                                                                                                                                                        BlockerAction.ShowOverlayScreenAction value20 = showOverlayScreenAction3 != null ? showOverlayScreenAction3.getValue() : null;
                                                                                                                                                                                                                        value20.getClass();
                                                                                                                                                                                                                        String str30 = value20.subform_id;
                                                                                                                                                                                                                        if (str30 != null) {
                                                                                                                                                                                                                            BlockersScreens.FormScreen formScreen = z2 ? (BlockersScreens.FormScreen) blockersScreens : null;
                                                                                                                                                                                                                            if (formScreen != null && (map = formScreen.subforms) != null && (formBlocker = (FormBlocker) map.get(str30)) != null) {
                                                                                                                                                                                                                                BlockersData blockersData3 = ((BlockersScreens.FormScreen) blockersScreens).blockersData;
                                                                                                                                                                                                                                List<FormBlocker.Element> list3 = formBlocker.elements;
                                                                                                                                                                                                                                BlockerAction blockerAction5 = formBlocker.primary_action;
                                                                                                                                                                                                                                FormBlocker.Icon icon = formBlocker.primary_action_icon;
                                                                                                                                                                                                                                BlockerAction blockerAction6 = formBlocker.secondary_action;
                                                                                                                                                                                                                                String str31 = formBlocker.disclaimer_text;
                                                                                                                                                                                                                                BlockerAction blockerAction7 = formBlocker.help_action;
                                                                                                                                                                                                                                Boolean bool = formBlocker.requires_full_scroll;
                                                                                                                                                                                                                                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                                                                                                                                                                                                                FormBlocker.Element.ButtonElement.Type type2 = formBlocker.primary_action_type;
                                                                                                                                                                                                                                if (type2 == null) {
                                                                                                                                                                                                                                    type2 = FormBlocker.Element.ButtonElement.Type.NORMAL;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                FormBlocker.Element.ButtonElement.Type type3 = type2;
                                                                                                                                                                                                                                FormBlocker.Element.ButtonElement.Style style = formBlocker.primary_action_style;
                                                                                                                                                                                                                                if (style == null) {
                                                                                                                                                                                                                                    style = FormBlocker.Element.ButtonElement.Style.PRIMARY;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                FormBlocker.Element.ButtonElement.Style style2 = style;
                                                                                                                                                                                                                                FormBlocker.Element.ButtonElement.Style style3 = formBlocker.secondary_action_style;
                                                                                                                                                                                                                                if (style3 == null) {
                                                                                                                                                                                                                                    style3 = FormBlocker.Element.ButtonElement.Style.SECONDARY;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                navigator.goTo(new BlockersScreens.FormScreen(blockersData3, list3, blockerAction5, icon, blockerAction6, str31, blockerAction7, booleanValue, type3, style2, style3, 508800));
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        if (action3 != null) {
                                                                                                                                                                                                                            BlockerAction.Action.OpenExternalUrlAndSubmitAction openExternalUrlAndSubmitAction = action3 instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction ? (BlockerAction.Action.OpenExternalUrlAndSubmitAction) action3 : null;
                                                                                                                                                                                                                            if (openExternalUrlAndSubmitAction != null) {
                                                                                                                                                                                                                                openExternalURLAndSubmitAction = openExternalUrlAndSubmitAction.getValue();
                                                                                                                                                                                                                                if (openExternalURLAndSubmitAction != null) {
                                                                                                                                                                                                                                    a$$ExternalSyntheticBUOutline0.m$1("Action ", blockerAction, " not supported.");
                                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                BlockerAction.Action.OpenExternalUrlAndSubmitAction openExternalUrlAndSubmitAction2 = action3 instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction ? (BlockerAction.Action.OpenExternalUrlAndSubmitAction) action3 : null;
                                                                                                                                                                                                                                BlockerAction.OpenExternalURLAndSubmitAction value21 = openExternalUrlAndSubmitAction2 != null ? openExternalUrlAndSubmitAction2.getValue() : null;
                                                                                                                                                                                                                                value21.getClass();
                                                                                                                                                                                                                                Object openExternalUrlAndSubmit = openExternalUrlAndSubmit(value21, blockersScreens, function2, continuation);
                                                                                                                                                                                                                                return openExternalUrlAndSubmit == CoroutineSingletons.COROUTINE_SUSPENDED ? openExternalUrlAndSubmit : Unit.INSTANCE;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        openExternalURLAndSubmitAction = null;
                                                                                                                                                                                                                        if (openExternalURLAndSubmitAction != null) {
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            showOverlayScreenAction = null;
                                                                                                                                                                                                            if (showOverlayScreenAction == null) {
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    hapticFeedbackAction = null;
                                                                                                                                                                                                    if (hapticFeedbackAction == null) {
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            delayedAction = null;
                                                                                                                                                                                            if (delayedAction == null) {
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    submitAction = null;
                                                                                                                                                                                    if (submitAction == null) {
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        endActivityAction = null;
                                                                                                                                                                        if (endActivityAction == null) {
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            backNavigationAction = null;
                                                                                                                                                            if (backNavigationAction == null) {
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                copyAction = null;
                                                                                                                                                if (copyAction == null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    dialogAction = null;
                                                                                                                                    if (dialogAction == null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            viewFileAction = null;
                                                                                                                            if (viewFileAction == null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    shareTextAction = null;
                                                                                                                    if (shareTextAction == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        shareFileAction = null;
                                                                                                        if (shareFileAction == null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            signOutAction = null;
                                                                                            if (signOutAction == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                internalNavigationAction = null;
                                                                                if (internalNavigationAction == null) {
                                                                                }
                                                                            } else {
                                                                                if (function24 != null) {
                                                                                    BlockerAction.Action.SkipBlockerAction skipBlockerAction3 = action3 instanceof BlockerAction.Action.SkipBlockerAction ? (BlockerAction.Action.SkipBlockerAction) action3 : null;
                                                                                    BlockerAction.SkipBlockerAction value22 = skipBlockerAction3 != null ? skipBlockerAction3.getValue() : null;
                                                                                    value22.getClass();
                                                                                    Object invoke2 = function24.invoke(value22, continuation);
                                                                                    return invoke2 == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke2 : Unit.INSTANCE;
                                                                                }
                                                                                navigator.goTo(this.blockersNavigator.getSkip(blockersScreens, blockersScreens.getBlockersData()));
                                                                            }
                                                                        }
                                                                    }
                                                                    skipBlockerAction = null;
                                                                    if (skipBlockerAction != null) {
                                                                    }
                                                                } else {
                                                                    if (function23 != null) {
                                                                        BlockerAction.Action.OpenUrlAction openUrlAction3 = action3 instanceof BlockerAction.Action.OpenUrlAction ? (BlockerAction.Action.OpenUrlAction) action3 : null;
                                                                        BlockerAction.OpenURLAction value23 = openUrlAction3 != null ? openUrlAction3.getValue() : null;
                                                                        value23.getClass();
                                                                        Object invoke3 = function23.invoke(value23, continuation);
                                                                        return invoke3 == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke3 : Unit.INSTANCE;
                                                                    }
                                                                    BlockerAction.Action.OpenUrlAction openUrlAction4 = action3 instanceof BlockerAction.Action.OpenUrlAction ? (BlockerAction.Action.OpenUrlAction) action3 : null;
                                                                    BlockerAction.OpenURLAction value24 = openUrlAction4 != null ? openUrlAction4.getValue() : null;
                                                                    value24.getClass();
                                                                    String str32 = value24.url;
                                                                    str32.getClass();
                                                                    BlockerAction.OpenURLAction.Behavior behavior = value24.behavior;
                                                                    int i3 = behavior == null ? -1 : WhenMappings.$EnumSwitchMapping$3[behavior.ordinal()];
                                                                    if (i3 != -1) {
                                                                        if (i3 == 1) {
                                                                            intentLauncher.launchUrlInExternalApp(str32);
                                                                            if (Intrinsics.areEqual(value24.end_flow, Boolean.TRUE)) {
                                                                                navigator.goTo(blockersScreens.getBlockersData().exitScreen);
                                                                            }
                                                                        } else if (i3 != 2) {
                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                            return null;
                                                                        }
                                                                    }
                                                                    internalNavigation(str32, blockersScreens);
                                                                    if (Intrinsics.areEqual(value24.end_flow, Boolean.TRUE)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        openURLAction = continuation2;
                                                        IntentLauncher intentLauncher2 = this.launcher;
                                                        if (openURLAction != null) {
                                                        }
                                                    }
                                                }
                                            }
                                            menuAction = continuation2;
                                            if (menuAction == null) {
                                            }
                                        }
                                    }
                                }
                                endFlowAction = continuation2;
                                if (endFlowAction == null) {
                                }
                            }
                        }
                    }
                    confirmationSheet = continuation2;
                    int i4 = 1;
                    if (confirmationSheet == null) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        confirmationDialog = continuation2;
        Navigator navigator2 = this.navigator;
        if (confirmationDialog == null) {
        }
        return Unit.INSTANCE;
    }

    public final void internalNavigation(String str, BlockersScreens blockersScreens) {
        BlockersScreens blockersScreens2;
        BlockersScreens blockersScreens3 = null;
        if (!blockersScreens.getBlockersData().getNextBlockers().isEmpty()) {
            Screen skip = this.blockersNavigator.getSkip(blockersScreens, blockersScreens.getBlockersData());
            if (skip instanceof BlockersScreens.WelcomeScreen) {
                blockersScreens2 = blockersScreens;
                this.router.route(new RoutingParams(blockersScreens.getBlockersData().exitScreen, null, blockersScreens2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
            } else if (skip instanceof BlockersScreens.OnboardingInternalRouteScreen) {
                blockersScreens3 = (BlockersScreens) skip;
            }
        }
        blockersScreens2 = blockersScreens3;
        this.router.route(new RoutingParams(blockersScreens.getBlockersData().exitScreen, null, blockersScreens2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r1.invoke(r2, r8) != r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r2, r4, r8) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openExternalUrlAndSubmit(BlockerAction.OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction, BlockersScreens blockersScreens, Function2 function2, Continuation continuation) {
        RealBlockersHelper$openExternalUrlAndSubmit$1 realBlockersHelper$openExternalUrlAndSubmit$1;
        RealBlockersHelper$openExternalUrlAndSubmit$1 realBlockersHelper$openExternalUrlAndSubmit$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        BlockersScreens blockersScreens2;
        Function2 function22;
        ReadonlyStateFlow readonlyStateFlow;
        RealBlockersHelper$openExternalUrlAndSubmit$3 realBlockersHelper$openExternalUrlAndSubmit$3;
        BlockerAction.OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction2;
        BlockersScreens blockersScreens3;
        Function2 function23;
        BlockersScreens blockersScreens4;
        BlockersData blockersData;
        Function2 function24;
        Boolean bool;
        BlockersData blockersData2;
        ApiResult apiResult;
        BlockersScreens blockersScreens5;
        boolean z;
        Screen next;
        BlockerAction.OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction3 = openExternalURLAndSubmitAction;
        if (continuation instanceof RealBlockersHelper$openExternalUrlAndSubmit$1) {
            realBlockersHelper$openExternalUrlAndSubmit$1 = (RealBlockersHelper$openExternalUrlAndSubmit$1) continuation;
            int i2 = realBlockersHelper$openExternalUrlAndSubmit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBlockersHelper$openExternalUrlAndSubmit$1.label = i2 - PKIFailureInfo.systemUnavail;
                realBlockersHelper$openExternalUrlAndSubmit$12 = realBlockersHelper$openExternalUrlAndSubmit$1;
                Object obj = realBlockersHelper$openExternalUrlAndSubmit$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBlockersHelper$openExternalUrlAndSubmit$12.label;
                AndroidStringManager androidStringManager = this.stringManager;
                AppForegroundStateProvider appForegroundStateProvider = this.appForegroundStateProvider;
                int i3 = 4;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = openExternalURLAndSubmitAction3.url;
                    str2.getClass();
                    this.launcher.launchUrlInExternalApp(str2);
                    ReadonlyStateFlow readonlyStateFlow2 = ((RealAppForegroundStateProvider) appForegroundStateProvider).appForegroundState;
                    RealBlockersHelper$openExternalUrlAndSubmit$2 realBlockersHelper$openExternalUrlAndSubmit$2 = new RealBlockersHelper$openExternalUrlAndSubmit$2();
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = openExternalURLAndSubmitAction3;
                    blockersScreens2 = blockersScreens;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens2;
                    function22 = function2;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function22;
                    realBlockersHelper$openExternalUrlAndSubmit$12.label = 1;
                } else if (i == 1) {
                    Function2 function25 = realBlockersHelper$openExternalUrlAndSubmit$12.L$2;
                    BlockersScreens blockersScreens6 = realBlockersHelper$openExternalUrlAndSubmit$12.L$1;
                    BlockerAction.OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction4 = realBlockersHelper$openExternalUrlAndSubmit$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function25;
                    blockersScreens2 = blockersScreens6;
                    openExternalURLAndSubmitAction3 = openExternalURLAndSubmitAction4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            function23 = realBlockersHelper$openExternalUrlAndSubmit$12.L$2;
                            blockersScreens3 = realBlockersHelper$openExternalUrlAndSubmit$12.L$1;
                            openExternalURLAndSubmitAction2 = realBlockersHelper$openExternalUrlAndSubmit$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Function2 function26 = function23;
                            BlockersScreens blockersScreens7 = blockersScreens3;
                            BlockersData blockersData3 = blockersScreens7.getBlockersData();
                            RealBlockersHelper$openExternalUrlAndSubmit$apiResult$1 realBlockersHelper$openExternalUrlAndSubmit$apiResult$1 = new RealBlockersHelper$openExternalUrlAndSubmit$apiResult$1(this, openExternalURLAndSubmitAction2, blockersData3, null);
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = null;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens7;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function26;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$3 = blockersData3;
                            realBlockersHelper$openExternalUrlAndSubmit$12.label = 4;
                            Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData3, this.analytics, androidStringManager, realBlockersHelper$openExternalUrlAndSubmit$12, null, realBlockersHelper$openExternalUrlAndSubmit$apiResult$1);
                            if (trackBlockerSubmissionAnalytics$default != coroutineSingletons) {
                                blockersScreens4 = blockersScreens7;
                                blockersData = blockersData3;
                                function24 = function26;
                                obj = trackBlockerSubmissionAnalytics$default;
                                ApiResult apiResult2 = (ApiResult) obj;
                                bool = Boolean.FALSE;
                                realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = null;
                                realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens4;
                                realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = null;
                                realBlockersHelper$openExternalUrlAndSubmit$12.L$3 = blockersData;
                                realBlockersHelper$openExternalUrlAndSubmit$12.L$4 = apiResult2;
                                realBlockersHelper$openExternalUrlAndSubmit$12.label = 5;
                                if (function24.invoke(bool, realBlockersHelper$openExternalUrlAndSubmit$12) != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i == 4) {
                            blockersData = realBlockersHelper$openExternalUrlAndSubmit$12.L$3;
                            function24 = realBlockersHelper$openExternalUrlAndSubmit$12.L$2;
                            blockersScreens4 = realBlockersHelper$openExternalUrlAndSubmit$12.L$1;
                            SafeTrace.throwOnFailure(obj);
                            ApiResult apiResult22 = (ApiResult) obj;
                            bool = Boolean.FALSE;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = null;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens4;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = null;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$3 = blockersData;
                            realBlockersHelper$openExternalUrlAndSubmit$12.L$4 = apiResult22;
                            realBlockersHelper$openExternalUrlAndSubmit$12.label = 5;
                            if (function24.invoke(bool, realBlockersHelper$openExternalUrlAndSubmit$12) != coroutineSingletons) {
                                blockersData2 = blockersData;
                                apiResult = apiResult22;
                                blockersScreens5 = blockersScreens4;
                                z = apiResult instanceof ApiResult.Success;
                                Navigator navigator = this.navigator;
                                if (!z) {
                                }
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        apiResult = realBlockersHelper$openExternalUrlAndSubmit$12.L$4;
                        blockersData2 = realBlockersHelper$openExternalUrlAndSubmit$12.L$3;
                        blockersScreens5 = realBlockersHelper$openExternalUrlAndSubmit$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        z = apiResult instanceof ApiResult.Success;
                        Navigator navigator2 = this.navigator;
                        if (!z) {
                            ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                            responseContext.getClass();
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            BlockersData updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                            String str3 = responseContext.dialog_message;
                            if (str3 != null) {
                                next = new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str3, responseContext.dialog_title, 2);
                            } else {
                                next = this.blockersNavigator.getNext(blockersScreens5, updateFromResponseContext);
                            }
                            navigator2.goTo(next);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            navigator2.goTo(new FailureMessageBlockerScreen(blockersData2, androidStringManager.get(R.string.generic_network_error), str, i3));
                        }
                        return Unit.INSTANCE;
                    }
                    function23 = realBlockersHelper$openExternalUrlAndSubmit$12.L$2;
                    blockersScreens3 = realBlockersHelper$openExternalUrlAndSubmit$12.L$1;
                    openExternalURLAndSubmitAction2 = realBlockersHelper$openExternalUrlAndSubmit$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = Boolean.TRUE;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = openExternalURLAndSubmitAction2;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens3;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function23;
                    realBlockersHelper$openExternalUrlAndSubmit$12.label = 3;
                }
                readonlyStateFlow = ((RealAppForegroundStateProvider) appForegroundStateProvider).appForegroundState;
                realBlockersHelper$openExternalUrlAndSubmit$3 = new RealBlockersHelper$openExternalUrlAndSubmit$3();
                realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = openExternalURLAndSubmitAction3;
                realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens2;
                realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function22;
                realBlockersHelper$openExternalUrlAndSubmit$12.label = 2;
                if (FlowKt.first(readonlyStateFlow, realBlockersHelper$openExternalUrlAndSubmit$3, realBlockersHelper$openExternalUrlAndSubmit$12) != coroutineSingletons) {
                    openExternalURLAndSubmitAction2 = openExternalURLAndSubmitAction3;
                    blockersScreens3 = blockersScreens2;
                    function23 = function22;
                    Boolean bool22 = Boolean.TRUE;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = openExternalURLAndSubmitAction2;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens3;
                    realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function23;
                    realBlockersHelper$openExternalUrlAndSubmit$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        realBlockersHelper$openExternalUrlAndSubmit$1 = new RealBlockersHelper$openExternalUrlAndSubmit$1(this, continuation);
        realBlockersHelper$openExternalUrlAndSubmit$12 = realBlockersHelper$openExternalUrlAndSubmit$1;
        Object obj2 = realBlockersHelper$openExternalUrlAndSubmit$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBlockersHelper$openExternalUrlAndSubmit$12.label;
        AndroidStringManager androidStringManager2 = this.stringManager;
        AppForegroundStateProvider appForegroundStateProvider2 = this.appForegroundStateProvider;
        int i32 = 4;
        String str4 = null;
        if (i != 0) {
        }
        readonlyStateFlow = ((RealAppForegroundStateProvider) appForegroundStateProvider2).appForegroundState;
        realBlockersHelper$openExternalUrlAndSubmit$3 = new RealBlockersHelper$openExternalUrlAndSubmit$3();
        realBlockersHelper$openExternalUrlAndSubmit$12.L$0 = openExternalURLAndSubmitAction3;
        realBlockersHelper$openExternalUrlAndSubmit$12.L$1 = blockersScreens2;
        realBlockersHelper$openExternalUrlAndSubmit$12.L$2 = function22;
        realBlockersHelper$openExternalUrlAndSubmit$12.label = 2;
        if (FlowKt.first(readonlyStateFlow, realBlockersHelper$openExternalUrlAndSubmit$3, realBlockersHelper$openExternalUrlAndSubmit$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object performHelpAction(HelpItem helpItem, BlockersScreens blockersScreens, Function2 function2, Function2 function22, SuspendLambda suspendLambda) {
        ChannelFlowTransformLatest completeClientScenario;
        BlockersData blockersData = blockersScreens.getBlockersData();
        ClientScenario clientScenario = blockersData.clientScenario;
        clientScenario.getClass();
        String str = helpItem.confirm_dialog_text;
        Navigator navigator = this.navigator;
        if (str != null) {
            navigator.goTo(new BlockersScreens.ConfirmHelp(blockersData, helpItem));
            return Unit.INSTANCE;
        }
        Function2 setNameViewKt$SetName$2$1 = function2 == null ? new SetNameViewKt$SetName$2$1((Object) this, (Object) blockersData, (Continuation) (0 == true ? 1 : 0), 27) : function2;
        HelpItem.Action action = helpItem.action;
        switch (action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                String str2 = helpItem.select_option_action;
                str2.getClass();
                Object collectBlockersActions = collectBlockersActions(selectOption(blockersScreens, str2, blockersData, clientScenario), setNameViewKt$SetName$2$1, function22, suspendLambda);
                return collectBlockersActions == CoroutineSingletons.COROUTINE_SUSPENDED ? collectBlockersActions : Unit.INSTANCE;
            case 2:
                String str3 = helpItem.url;
                str3.getClass();
                this.launcher.launchUrlInInternalBrowser(str3);
                break;
            case 3:
                Object collectBlockersActions2 = collectBlockersActions(new SafeFlow(new RealBlockersHelper$skipBlocker$1(this, blockersData, blockersScreens, clientScenario, null)), setNameViewKt$SetName$2$1, function22, suspendLambda);
                return collectBlockersActions2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collectBlockersActions2 : Unit.INSTANCE;
            case 4:
                Object collectBlockersActions3 = collectBlockersActions(skipBlocker(blockersScreens, blockersData, clientScenario), setNameViewKt$SetName$2$1, function22, suspendLambda);
                return collectBlockersActions3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collectBlockersActions3 : Unit.INSTANCE;
            case 5:
                this.signedInStateManager.update(SignedInState.SIGNED_OUT);
                break;
            case 6:
                ClientScenario clientScenario2 = blockersData.clientScenario;
                Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_scenario", clientScenario2 != null ? clientScenario2.name() : null), new Pair("blocker_id", blockersData.blockerId), new Pair("node_token", helpItem.support_node_token));
                Timber.Forest.e(new IllegalStateException("Deprecated API HelpItem.Action.START_SUPPORT_FLOW is used: " + mapOf));
                navigator.goTo(RealSupportNavigator.startSupportFlow$default(this.supportNavigator, helpItem.support_node_token, null, blockersScreens, SupportNavigator$Source.BLOCKER_FLOW, null, null, 102));
                break;
            case 7:
                String str4 = helpItem.message_title;
                str4.getClass();
                String str5 = helpItem.message_text;
                str5.getClass();
                navigator.goTo(new BlockersScreens.HelpItemMessage(blockersData, str4, str5));
                break;
            case 8:
                String str6 = helpItem.client_scenario;
                str6.getClass();
                completeClientScenario = this.clientScenarioCompleter.completeClientScenario(ClientScenario.valueOf(str6), (r24 & 2) != 0 ? null : null, blockersScreens, (r24 & 8) != 0 ? null : null, blockersData.flow, true, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
                Object collectBlockersActions4 = collectBlockersActions(completeClientScenario, setNameViewKt$SetName$2$1, function22, suspendLambda);
                return collectBlockersActions4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collectBlockersActions4 : Unit.INSTANCE;
            case 9:
                BlockerAction blockerAction = helpItem.blocker_action;
                if (blockerAction != null) {
                    Object handleBlockerAction$default = handleBlockerAction$default(this, blockerAction, blockersScreens, function22, null, new RealBlockersHelper$performHelpAction$3(this, null), new RealBlockersHelper$performHelpAction$4(this, blockersScreens, blockersData, clientScenario, setNameViewKt$SetName$2$1, function22, null), suspendLambda, 188);
                    return handleBlockerAction$default == CoroutineSingletons.COROUTINE_SUSPENDED ? handleBlockerAction$default : Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("HelpItem with action == BLOCKER_ACTION must have a blocker_action set!");
                return null;
            default:
                throw new AssertionError(helpItem.action + " is not supported!");
        }
        return Unit.INSTANCE;
    }

    public final SafeFlow selectOption(Screen screen, String str, BlockersData blockersData, ClientScenario clientScenario) {
        screen.getClass();
        str.getClass();
        blockersData.getClass();
        clientScenario.getClass();
        return new SafeFlow(new RealIdvPresenter$models$1$1(blockersData, str, this, screen, clientScenario, (Continuation) null));
    }

    public final SafeFlow skipBlocker(Screen screen, BlockersData blockersData, ClientScenario clientScenario) {
        screen.getClass();
        blockersData.getClass();
        clientScenario.getClass();
        return new SafeFlow(new RealBlockersHelper$skipBlocker$1(this, blockersData, clientScenario, screen, (Continuation) null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object triggerHaptic(BlockerAction.HapticFeedbackAction hapticFeedbackAction, Continuation continuation) {
        RealBlockersHelper$triggerHaptic$1 realBlockersHelper$triggerHaptic$1;
        Object obj;
        int i;
        Vibrator vibrator = this.hapticVibrator.vibrator;
        if (continuation instanceof RealBlockersHelper$triggerHaptic$1) {
            realBlockersHelper$triggerHaptic$1 = (RealBlockersHelper$triggerHaptic$1) continuation;
            int i2 = realBlockersHelper$triggerHaptic$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBlockersHelper$triggerHaptic$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realBlockersHelper$triggerHaptic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBlockersHelper$triggerHaptic$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DerivedStateFlow valuesStateExperiment = Trace.valuesStateExperiment(this.featureFlagManager, AmplitudeExperiments$ClientHapticsImprovements.INSTANCE);
                    realBlockersHelper$triggerHaptic$1.L$0 = hapticFeedbackAction;
                    realBlockersHelper$triggerHaptic$1.label = 1;
                    obj = FlowKt.first(valuesStateExperiment, realBlockersHelper$triggerHaptic$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hapticFeedbackAction = realBlockersHelper$triggerHaptic$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled()) {
                    BlockerAction.HapticFeedbackAction.Type type2 = hapticFeedbackAction.type;
                    int i3 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$4[type2.ordinal()];
                    if (i3 == 1) {
                        vibrator.vibrate(WindowCompat$Api35Impl.access$Success$lambda$3());
                    } else if (i3 == 2) {
                        vibrator.vibrate(WindowCompat$Api35Impl.access$Failure$lambda$4());
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realBlockersHelper$triggerHaptic$1 = new RealBlockersHelper$triggerHaptic$1(this, continuation);
        obj = realBlockersHelper$triggerHaptic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBlockersHelper$triggerHaptic$1.label;
        if (i != 0) {
        }
        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled()) {
        }
        return Unit.INSTANCE;
    }

    public final class MetroFactory {
        public final Provider activityFinisher;
        public final Provider analytics;
        public final Provider appForegroundStateProvider;
        public final Provider appService;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersNavigator;
        public final Provider clientScenarioCompleter;
        public final Provider clipboardManager;
        public final Provider clock;
        public final Provider featureFlagManager;
        public final Provider fileDownloader;
        public final Provider fileProvider;
        public final Provider hapticVibrator;
        public final Provider ioDispatcher;
        public final Provider launcher;
        public final InstanceFactory routerFactory;
        public final InstanceFactory scope;
        public final Provider signedInStateManager;
        public final Provider stringManager;
        public final Provider supportNavigator;
        public final Provider toaster;
        public final Provider uiDispatcher;

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealBadger2.MetroFactory metroFactory2, LambdaProvider lambdaProvider3, IntentLauncher.MetroFactory metroFactory3, RealFileDownloader.MetroFactory metroFactory4, LambdaProvider lambdaProvider4, RealGlobalConfigDataSource.MetroFactory metroFactory5, InstanceFactory instanceFactory, LambdaProvider lambdaProvider5, AndroidToaster.MetroFactory metroFactory6, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider6, LambdaProvider lambdaProvider7, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider8) {
            this.appForegroundStateProvider = lambdaProvider;
            this.clientScenarioCompleter = doubleCheck;
            this.stringManager = lambdaProvider2;
            this.blockersNavigator = metroFactory;
            this.appService = doubleCheck2;
            this.analytics = doubleCheck3;
            this.signedInStateManager = doubleCheck4;
            this.supportNavigator = metroFactory2;
            this.toaster = lambdaProvider3;
            this.launcher = metroFactory3;
            this.fileDownloader = metroFactory4;
            this.fileProvider = lambdaProvider4;
            this.blockerFlowAnalytics = metroFactory5;
            this.routerFactory = instanceFactory;
            this.clipboardManager = lambdaProvider5;
            this.activityFinisher = metroFactory6;
            this.hapticVibrator = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.featureFlagManager = doubleCheck5;
            this.ioDispatcher = lambdaProvider6;
            this.uiDispatcher = lambdaProvider7;
            this.scope = instanceFactory2;
            this.clock = lambdaProvider8;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, InstanceFactory instanceFactory, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, InstanceFactory instanceFactory2, Provider provider20) {
            this.appForegroundStateProvider = provider;
            this.clientScenarioCompleter = provider2;
            this.stringManager = provider3;
            this.blockersNavigator = provider4;
            this.appService = provider5;
            this.routerFactory = instanceFactory;
            this.analytics = provider6;
            this.signedInStateManager = provider7;
            this.supportNavigator = provider8;
            this.toaster = provider9;
            this.launcher = provider10;
            this.fileDownloader = provider11;
            this.fileProvider = provider12;
            this.blockerFlowAnalytics = provider13;
            this.clipboardManager = provider14;
            this.activityFinisher = provider15;
            this.featureFlagManager = provider16;
            this.ioDispatcher = provider17;
            this.uiDispatcher = provider18;
            this.clock = provider19;
            this.scope = instanceFactory2;
            this.hapticVibrator = provider20;
        }
    }
}
