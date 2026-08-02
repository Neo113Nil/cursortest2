package com.squareup.cash.music.presenters;

import android.animation.ValueAnimator;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.TransactionWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.asset.AssetRequestViewReviewPaymentScreen;
import com.squareup.cash.cdf.asset.AssetSendViewReviewPaymentScreen;
import com.squareup.cash.cdf.filesystem.FileSystemAlertLowDiskSpaceMessage;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pPools;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$PersonalizePaymentResourceConfig;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PreloadExpressivePaymentResources;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.presenters.RealMoneybotInboundNavigator$showMoneybot$1$WhenMappings;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState$hide$1$$ExternalSyntheticLambda0;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.Background;
import com.squareup.cash.mosaic.resources.api.v2.BackgroundEffect;
import com.squareup.cash.mosaic.resources.api.v2.GetAllResourcesRequest;
import com.squareup.cash.mosaic.resources.api.v2.GetAllResourcesResponse;
import com.squareup.cash.mosaic.resources.api.v2.GetFeaturedMusicRequest;
import com.squareup.cash.mosaic.resources.api.v2.GetFeaturedMusicResponse;
import com.squareup.cash.mosaic.resources.api.v2.MusicService;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.mosaic.resources.api.v2.ResourceService;
import com.squareup.cash.mosaic.resources.api.v2.Sticker;
import com.squareup.cash.mosaic.resources.api.v2.StickerEffect;
import com.squareup.cash.mosaic.resources.api.v2.Tag;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersRepositoryService;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersHomePresenterV2$models$2$1$1;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.checkers.AppLockSyncValueIntegrityCheck;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.applets.presenters.RealPaychecksAppletTileRepository;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.backend.real.RealRawOfflineActivityService;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowUserDismissMode;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.pools.backend.real.PoolsRefresher;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.views.PoolGoalMetKt$PoolGoalMet$1$1$1;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda8;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.protos.cash.pools.GetPoolsAppletRequest;
import com.squareup.protos.cash.pools.GetPoolsAppletResponse;
import com.squareup.protos.cash.pools.HighlightedPoolsSelectionMode;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import okio.internal.DefaultSocket;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MusicPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$3$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new MusicPresenter$models$3$1((MusicPresenter) obj2, continuation, 0);
            case 1:
                return new MusicPresenter$models$3$1((MusicPresenter) obj2, continuation, 1);
            case 2:
                MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
                return new MusicPresenter$models$3$1((n) obj2, continuation);
            case 3:
                return new MusicPresenter$models$3$1((ValueAnimator) obj2, continuation, 3);
            case 4:
                return new MusicPresenter$models$3$1((TooltipState) obj2, continuation, 4);
            case 5:
                return new MusicPresenter$models$3$1((ToolbarTuckTargets) obj2, continuation, 5);
            case 6:
                return new MusicPresenter$models$3$1((DefaultSocket) obj2, continuation, 6);
            case 7:
                return new MusicPresenter$models$3$1((RealOffersRepositoryService) obj2, continuation, 7);
            case 8:
                return new MusicPresenter$models$3$1((CardLockPresenter) obj2, continuation, 8);
            case 9:
                return new MusicPresenter$models$3$1((LocalHomePresenter) obj2, continuation, 9);
            case 10:
                return new MusicPresenter$models$3$1((RealOffersSearchPresenter) obj2, continuation, 10);
            case 11:
                return new MusicPresenter$models$3$1((IntegrityCheck) obj2, continuation, 11);
            case 12:
                return new MusicPresenter$models$3$1((AppLockSyncValueIntegrityCheck) obj2, continuation, 12);
            case 13:
                return new MusicPresenter$models$3$1((RealPaychecksAppletTileRepository) obj2, continuation, 13);
            case 14:
                return new MusicPresenter$models$3$1((CardLockPresenter) obj2, continuation, 14);
            case 15:
                return new MusicPresenter$models$3$1((ShareSheetPresenter) obj2, continuation, 15);
            case 16:
                return new MusicPresenter$models$3$1((ComponentRegistry.Builder) obj2, continuation, 16);
            case 17:
                return new MusicPresenter$models$3$1((RealPersonalizationRepository) obj2, continuation, 17);
            case 18:
                return new MusicPresenter$models$3$1((RealRawOfflineActivityService) obj2, continuation, 18);
            case 19:
                return new MusicPresenter$models$3$1((MainPaymentPresenter) obj2, continuation, 19);
            case 20:
                return new MusicPresenter$models$3$1((PaymentConfigurationPresenter) obj2, continuation, 20);
            case 21:
                return new MusicPresenter$models$3$1((CoreFlowBasicShieetScope) obj2, continuation, 21);
            case 22:
                return new MusicPresenter$models$3$1((JankStatsAggregator) obj2, continuation, 22);
            case 23:
                return new MusicPresenter$models$3$1((WorkHomePresenter) obj2, continuation, 23);
            case 24:
                return new MusicPresenter$models$3$1((WorkHomePresenter) obj2, continuation, 24);
            case 25:
                return new MusicPresenter$models$3$1((RealPhonePlansAppletTileAvailabilityManager) obj2, continuation, 25);
            case 26:
                return new MusicPresenter$models$3$1((WorkHomePresenter) obj2, continuation, 26);
            case 27:
                return new MusicPresenter$models$3$1((PoolsRefresher) obj2, continuation, 27);
            case 28:
                return new MusicPresenter$models$3$1((RealPoolsRepository) obj2, continuation, 28);
            default:
                return new MusicPresenter$models$3$1((ProfilePresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 3:
                ((MusicPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((MusicPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02a6, code lost:
    
        if (r0 == r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0291, code lost:
    
        if (r2 == r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x035b, code lost:
    
        if (r1.set(r3, r16) == r0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x030f, code lost:
    
        if (r1 == r0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03e7, code lost:
    
        if (r0.set(r3, r16) == r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0397, code lost:
    
        if (r2 == r1) goto L201;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        AppNavigateOpenSpace.Source source;
        AppNavigateOpenSpace.Source source2;
        Object featuredMusic;
        Object withContext;
        Object allResources;
        Object allResources2;
        Object shouldShowRequestPermissionRationale;
        Object shouldShowOverridePrompt;
        Object obj2;
        Object obj3;
        Object poolsApplet;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        int i2 = 7;
        final int i3 = 0;
        int i4 = 2;
        Object obj4 = this.this$0;
        final int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MusicPresenter musicPresenter = (MusicPresenter) obj4;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = ((MusicScreen) musicPresenter.args).currentTrackId;
                    RealMusicPlayer realMusicPlayer = (RealMusicPlayer) musicPresenter.musicPlayer;
                    if (str != null) {
                        this.label = 1;
                        if (realMusicPlayer.play(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        realMusicPlayer.stop();
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                return Unit.INSTANCE;
            case 1:
                MusicPresenter musicPresenter2 = (MusicPresenter) obj4;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotPreambleManager realMoneybotPreambleManager = (RealMoneybotPreambleManager) musicPresenter2.musicPlayer;
                    this.label = 1;
                    Object obj5 = realMoneybotPreambleManager.moneybotPreambleOverride.set(null, this);
                    if (obj5 != coroutineSingletons2) {
                        obj5 = Unit.INSTANCE;
                    }
                    if (obj5 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) musicPresenter2.navigator).goTo(back);
                return Unit.INSTANCE;
            case 2:
                MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
                n nVar = (n) obj4;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow moneybotHomeEnabled = ((MoneybotFlagsHelper) nVar.b).moneybotHomeEnabled();
                    this.label = 1;
                    first = FlowKt.first(moneybotHomeEnabled, this);
                    if (first == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                if (((Boolean) first).booleanValue()) {
                    ((Navigator) nVar.a).goTo(MoneybotHomeScreen.INSTANCE);
                    int i9 = RealMoneybotInboundNavigator$showMoneybot$1$WhenMappings.$EnumSwitchMapping$0[0];
                    if (i9 == 1) {
                        source = AppNavigateOpenSpace.Source.TOP_NAV_BAR_BUTTON;
                    } else if (i9 != 2) {
                        source2 = null;
                        ((RealMoneybotAnalyticsService) nVar.c).analytics.track(new AppNavigateOpenSpace(source2, null, AppNavigateOpenSpace.Space.MONEYBOT_HOME, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), null);
                    } else {
                        source = AppNavigateOpenSpace.Source.DEEP_LINK;
                    }
                    source2 = source;
                    ((RealMoneybotAnalyticsService) nVar.c).analytics.track(new AppNavigateOpenSpace(source2, null, AppNavigateOpenSpace.Space.MONEYBOT_HOME, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), null);
                } else {
                    nVar.showMoneybotChat();
                }
                return Unit.INSTANCE;
            case 3:
                ValueAnimator valueAnimator = (ValueAnimator) obj4;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    SafeTrace.throwOnFailure(obj);
                    valueAnimator.start();
                    this.label = 1;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons4;
                } catch (Throwable th) {
                    valueAnimator.cancel();
                    throw th;
                }
            case 4:
                TooltipState tooltipState = (TooltipState) obj4;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue = tooltipState._alpha$delegate.getFloatValue();
                    TweenSpec tween$default = AnimatableKt.tween$default(0, 0, null, 7);
                    TooltipState$hide$1$$ExternalSyntheticLambda0 tooltipState$hide$1$$ExternalSyntheticLambda0 = new TooltipState$hide$1$$ExternalSyntheticLambda0(tooltipState, i3);
                    this.label = 1;
                    if (AnimatableKt.animate$default(floatValue, RecyclerView.DECELERATION_RATE, tween$default, tooltipState$hide$1$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicService musicService = (MusicService) ((ToolbarTuckTargets) obj4).startCornerCenterX$delegate;
                    GetFeaturedMusicRequest getFeaturedMusicRequest = new GetFeaturedMusicRequest(ByteString.EMPTY);
                    this.label = 1;
                    featuredMusic = musicService.getFeaturedMusic(getFeaturedMusicRequest, this);
                    if (featuredMusic == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    featuredMusic = obj;
                }
                ApiResult apiResult = (ApiResult) featuredMusic;
                if (apiResult instanceof ApiResult.Success) {
                    return ((GetFeaturedMusicResponse) ((ApiResult.Success) apiResult).response).musics;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
                    this.label = 1;
                    if (((DefaultSocket) obj4).m4350initializeChannelsVtjQ1oo(duration, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                RealOffersRepositoryService realOffersRepositoryService = (RealOffersRepositoryService) obj4;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealBoostRepository realBoostRepository = realOffersRepositoryService.boostRepository;
                ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.transformLatest(realBoostRepository.boostProvider.getBoostSlots(true), new AnchoredDraggableNode$drag$2(continuation, new RewardSlotQueries$$ExternalSyntheticLambda0(realBoostRepository, 4), 8)), new AnchoredDraggableNode$drag$2(continuation, realOffersRepositoryService, 29));
                this.label = 1;
                Object firstOrNull = FlowKt.firstOrNull(transformLatest, this);
                return firstOrNull == coroutineSingletons8 ? coroutineSingletons8 : firstOrNull;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 != 0) {
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj4;
                SharedFlowImpl sharedFlowImpl = ((RealBoostRepository) cardLockPresenter.args).boostSelector.actions;
                OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(cardLockPresenter, i3);
                this.label = 1;
                sharedFlowImpl.collect(offersDetailsPresenterV2$models$1$1$1, this);
                return coroutineSingletons9;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0) {
                    if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                SharedFlowImpl sharedFlowImpl2 = ((RealBoostRepository) localHomePresenter.store).boostSelector.actions;
                OffersHomePresenterV2$models$2$1$1 offersHomePresenterV2$models$2$1$1 = new OffersHomePresenterV2$models$2$1$1(localHomePresenter);
                this.label = 1;
                sharedFlowImpl2.collect(offersHomePresenterV2$models$2$1$1, this);
                return coroutineSingletons10;
            case 10:
                RealOffersSearchPresenter realOffersSearchPresenter = (RealOffersSearchPresenter) obj4;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowTokenUpdates = realOffersSearchPresenter.analyticsHelper.flowTokenUpdates(OffersAnalyticsHelper$Flow.SHOP);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(realOffersSearchPresenter, i4);
                    this.label = 1;
                    if (flowTokenUpdates.collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object check = ((IntegrityCheck) obj4).check(this);
                    return check == coroutineSingletons12 ? coroutineSingletons12 : check;
                }
                if (i18 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                SyncValueReader syncValueReader = ((AppLockSyncValueIntegrityCheck) obj4).syncValueReader;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (syncValueReader.awaitReady(this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return syncValueReader.getSingleValue(AndroidSyncValueSpecs.Access).getValue();
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealPaychecksAppletTileRepository.access$refresh((RealPaychecksAppletTileRepository) obj4, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SubmitSetPaycheckMultiAllocationRequest.Cancel cancel = new SubmitSetPaycheckMultiAllocationRequest.Cancel(ByteString.EMPTY);
                    this.label = 1;
                    if (CardLockPresenter.submit$default((CardLockPresenter) obj4, null, null, cancel, null, true, this, 11) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj4;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Storage storage = (Storage) shareSheetPresenter.profileManager;
                    this.label = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CashApp$onCreate$1((RealStorage) storage, continuation, i2), this);
                    if (withContext == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                ((Analytics) shareSheetPresenter.analytics).track(new FileSystemAlertLowDiskSpaceMessage(new Double(((Number) withContext).doubleValue() / 1000000.0d)), null);
                return Unit.INSTANCE;
            case 16:
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) obj4;
                final RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) builder.interceptors;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ResourceService resourceService = (ResourceService) builder.mappers;
                    GetAllResourcesRequest getAllResourcesRequest = new GetAllResourcesRequest();
                    this.label = 1;
                    allResources = resourceService.getAllResources(getAllResourcesRequest, this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.TRUE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    allResources = obj;
                }
                ApiResult apiResult2 = (ApiResult) allResources;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    return Boolean.FALSE;
                }
                GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) ((ApiResult.Success) apiResult2).response;
                final List list = getAllResourcesResponse.backgrounds;
                final List list2 = getAllResourcesResponse.stickers;
                list.getClass();
                realPersonalizationRepository.backgroundQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.payments.backend.real.RealPersonalizationRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i24 = i3;
                        List<Background> list3 = list;
                        RealPersonalizationRepository realPersonalizationRepository2 = realPersonalizationRepository;
                        switch (i24) {
                            case 0:
                                ((TransactionWrapper) obj6).getClass();
                                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository2.backgroundQueries;
                                localTabContentQueries.driver.execute(-998611349, "DELETE FROM expressivePaymentsBackgroundConfig", null);
                                localTabContentQueries.notifyQueries(-998611349, new SessionQueries$$ExternalSyntheticLambda1(24, false));
                                for (Background background : list3) {
                                    String str2 = background.name;
                                    String str3 = background.main_url;
                                    String str4 = background.preview_url;
                                    Color color = background.background_color;
                                    TextFormat textFormat = background.default_text_format;
                                    List<BackgroundEffect> list4 = background.effects;
                                    Integer num = background.priority;
                                    ReleaseState releaseState = background.release_state;
                                    if (releaseState == null) {
                                        releaseState = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState2 = releaseState;
                                    List<Tag> list5 = background.tags;
                                    Boolean bool = background.is_default;
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    String str5 = background.accessibility_description;
                                    localTabContentQueries.getClass();
                                    releaseState2.getClass();
                                    localTabContentQueries.driver.execute(1034096740, "INSERT INTO expressivePaymentsBackgroundConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(str2, str3, str4, color, textFormat, list4, num, localTabContentQueries, releaseState2, list5, booleanValue, str5));
                                    localTabContentQueries.notifyQueries(1034096740, new SessionQueries$$ExternalSyntheticLambda1(25, false));
                                }
                                break;
                            default:
                                ((TransactionWrapper) obj6).getClass();
                                InstrumentQueries instrumentQueries = realPersonalizationRepository2.stickerQueries;
                                instrumentQueries.driver.execute(1670261750, "DELETE FROM expressivePaymentsStickerConfig", null);
                                instrumentQueries.notifyQueries(1670261750, new SessionQueries$$ExternalSyntheticLambda1(27, false));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    Sticker sticker = (Sticker) it.next();
                                    String str6 = sticker.name;
                                    String str7 = sticker.main_url;
                                    String str8 = sticker.preview_url;
                                    List<StickerEffect> list6 = sticker.effects;
                                    Integer num2 = sticker.priority;
                                    ReleaseState releaseState3 = sticker.release_state;
                                    if (releaseState3 == null) {
                                        releaseState3 = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState4 = releaseState3;
                                    List<Tag> list7 = sticker.tags;
                                    Boolean bool2 = sticker.is_default;
                                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                    String str9 = sticker.accessibility_description;
                                    instrumentQueries.getClass();
                                    releaseState4.getClass();
                                    instrumentQueries.driver.execute(1083780793, "INSERT INTO expressivePaymentsStickerConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new WorkWebViewKt$$ExternalSyntheticLambda8(str6, str7, str8, list6, num2, instrumentQueries, releaseState4, list7, booleanValue2, str9));
                                    instrumentQueries.notifyQueries(1083780793, new SessionQueries$$ExternalSyntheticLambda1(28, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                list2.getClass();
                realPersonalizationRepository.stickerQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.payments.backend.real.RealPersonalizationRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i24 = i5;
                        List<Background> list3 = list2;
                        RealPersonalizationRepository realPersonalizationRepository2 = realPersonalizationRepository;
                        switch (i24) {
                            case 0:
                                ((TransactionWrapper) obj6).getClass();
                                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository2.backgroundQueries;
                                localTabContentQueries.driver.execute(-998611349, "DELETE FROM expressivePaymentsBackgroundConfig", null);
                                localTabContentQueries.notifyQueries(-998611349, new SessionQueries$$ExternalSyntheticLambda1(24, false));
                                for (Background background : list3) {
                                    String str2 = background.name;
                                    String str3 = background.main_url;
                                    String str4 = background.preview_url;
                                    Color color = background.background_color;
                                    TextFormat textFormat = background.default_text_format;
                                    List<BackgroundEffect> list4 = background.effects;
                                    Integer num = background.priority;
                                    ReleaseState releaseState = background.release_state;
                                    if (releaseState == null) {
                                        releaseState = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState2 = releaseState;
                                    List<Tag> list5 = background.tags;
                                    Boolean bool = background.is_default;
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    String str5 = background.accessibility_description;
                                    localTabContentQueries.getClass();
                                    releaseState2.getClass();
                                    localTabContentQueries.driver.execute(1034096740, "INSERT INTO expressivePaymentsBackgroundConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(str2, str3, str4, color, textFormat, list4, num, localTabContentQueries, releaseState2, list5, booleanValue, str5));
                                    localTabContentQueries.notifyQueries(1034096740, new SessionQueries$$ExternalSyntheticLambda1(25, false));
                                }
                                break;
                            default:
                                ((TransactionWrapper) obj6).getClass();
                                InstrumentQueries instrumentQueries = realPersonalizationRepository2.stickerQueries;
                                instrumentQueries.driver.execute(1670261750, "DELETE FROM expressivePaymentsStickerConfig", null);
                                instrumentQueries.notifyQueries(1670261750, new SessionQueries$$ExternalSyntheticLambda1(27, false));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    Sticker sticker = (Sticker) it.next();
                                    String str6 = sticker.name;
                                    String str7 = sticker.main_url;
                                    String str8 = sticker.preview_url;
                                    List<StickerEffect> list6 = sticker.effects;
                                    Integer num2 = sticker.priority;
                                    ReleaseState releaseState3 = sticker.release_state;
                                    if (releaseState3 == null) {
                                        releaseState3 = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState4 = releaseState3;
                                    List<Tag> list7 = sticker.tags;
                                    Boolean bool2 = sticker.is_default;
                                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                    String str9 = sticker.accessibility_description;
                                    instrumentQueries.getClass();
                                    releaseState4.getClass();
                                    instrumentQueries.driver.execute(1083780793, "INSERT INTO expressivePaymentsStickerConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new WorkWebViewKt$$ExternalSyntheticLambda8(str6, str7, str8, list6, num2, instrumentQueries, releaseState4, list7, booleanValue2, str9));
                                    instrumentQueries.notifyQueries(1083780793, new SessionQueries$$ExternalSyntheticLambda1(28, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                KeyValue keyValue = (KeyValue) builder.lazyDecoderFactories;
                Integer num = new Integer(((JsonFeatureFlags$PersonalizePaymentResourceConfig.ResourceConfigVersion) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) ((FeatureFlagManager) builder.lazyFetcherFactories)).peekCurrentValue(JsonFeatureFlags$PersonalizePaymentResourceConfig.INSTANCE)).value).version);
                this.label = 2;
                break;
            case 17:
                final RealPersonalizationRepository realPersonalizationRepository2 = (RealPersonalizationRepository) obj4;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ResourceService resourceService2 = realPersonalizationRepository2.resourceService;
                    GetAllResourcesRequest getAllResourcesRequest2 = new GetAllResourcesRequest();
                    this.label = 1;
                    allResources2 = resourceService2.getAllResources(getAllResourcesRequest2, this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.TRUE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    allResources2 = obj;
                }
                ApiResult apiResult3 = (ApiResult) allResources2;
                if (!(apiResult3 instanceof ApiResult.Success)) {
                    return Boolean.FALSE;
                }
                GetAllResourcesResponse getAllResourcesResponse2 = (GetAllResourcesResponse) ((ApiResult.Success) apiResult3).response;
                final List list3 = getAllResourcesResponse2.backgrounds;
                final List list4 = getAllResourcesResponse2.stickers;
                list3.getClass();
                realPersonalizationRepository2.backgroundQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.payments.backend.real.RealPersonalizationRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i242 = i3;
                        List<Background> list32 = list3;
                        RealPersonalizationRepository realPersonalizationRepository22 = realPersonalizationRepository2;
                        switch (i242) {
                            case 0:
                                ((TransactionWrapper) obj6).getClass();
                                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository22.backgroundQueries;
                                localTabContentQueries.driver.execute(-998611349, "DELETE FROM expressivePaymentsBackgroundConfig", null);
                                localTabContentQueries.notifyQueries(-998611349, new SessionQueries$$ExternalSyntheticLambda1(24, false));
                                for (Background background : list32) {
                                    String str2 = background.name;
                                    String str3 = background.main_url;
                                    String str4 = background.preview_url;
                                    Color color = background.background_color;
                                    TextFormat textFormat = background.default_text_format;
                                    List<BackgroundEffect> list42 = background.effects;
                                    Integer num2 = background.priority;
                                    ReleaseState releaseState = background.release_state;
                                    if (releaseState == null) {
                                        releaseState = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState2 = releaseState;
                                    List<Tag> list5 = background.tags;
                                    Boolean bool = background.is_default;
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    String str5 = background.accessibility_description;
                                    localTabContentQueries.getClass();
                                    releaseState2.getClass();
                                    localTabContentQueries.driver.execute(1034096740, "INSERT INTO expressivePaymentsBackgroundConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(str2, str3, str4, color, textFormat, list42, num2, localTabContentQueries, releaseState2, list5, booleanValue, str5));
                                    localTabContentQueries.notifyQueries(1034096740, new SessionQueries$$ExternalSyntheticLambda1(25, false));
                                }
                                break;
                            default:
                                ((TransactionWrapper) obj6).getClass();
                                InstrumentQueries instrumentQueries = realPersonalizationRepository22.stickerQueries;
                                instrumentQueries.driver.execute(1670261750, "DELETE FROM expressivePaymentsStickerConfig", null);
                                instrumentQueries.notifyQueries(1670261750, new SessionQueries$$ExternalSyntheticLambda1(27, false));
                                Iterator it = list32.iterator();
                                while (it.hasNext()) {
                                    Sticker sticker = (Sticker) it.next();
                                    String str6 = sticker.name;
                                    String str7 = sticker.main_url;
                                    String str8 = sticker.preview_url;
                                    List<StickerEffect> list6 = sticker.effects;
                                    Integer num22 = sticker.priority;
                                    ReleaseState releaseState3 = sticker.release_state;
                                    if (releaseState3 == null) {
                                        releaseState3 = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState4 = releaseState3;
                                    List<Tag> list7 = sticker.tags;
                                    Boolean bool2 = sticker.is_default;
                                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                    String str9 = sticker.accessibility_description;
                                    instrumentQueries.getClass();
                                    releaseState4.getClass();
                                    instrumentQueries.driver.execute(1083780793, "INSERT INTO expressivePaymentsStickerConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new WorkWebViewKt$$ExternalSyntheticLambda8(str6, str7, str8, list6, num22, instrumentQueries, releaseState4, list7, booleanValue2, str9));
                                    instrumentQueries.notifyQueries(1083780793, new SessionQueries$$ExternalSyntheticLambda1(28, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                list4.getClass();
                realPersonalizationRepository2.stickerQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.payments.backend.real.RealPersonalizationRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i242 = i5;
                        List<Background> list32 = list4;
                        RealPersonalizationRepository realPersonalizationRepository22 = realPersonalizationRepository2;
                        switch (i242) {
                            case 0:
                                ((TransactionWrapper) obj6).getClass();
                                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository22.backgroundQueries;
                                localTabContentQueries.driver.execute(-998611349, "DELETE FROM expressivePaymentsBackgroundConfig", null);
                                localTabContentQueries.notifyQueries(-998611349, new SessionQueries$$ExternalSyntheticLambda1(24, false));
                                for (Background background : list32) {
                                    String str2 = background.name;
                                    String str3 = background.main_url;
                                    String str4 = background.preview_url;
                                    Color color = background.background_color;
                                    TextFormat textFormat = background.default_text_format;
                                    List<BackgroundEffect> list42 = background.effects;
                                    Integer num2 = background.priority;
                                    ReleaseState releaseState = background.release_state;
                                    if (releaseState == null) {
                                        releaseState = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState2 = releaseState;
                                    List<Tag> list5 = background.tags;
                                    Boolean bool = background.is_default;
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    String str5 = background.accessibility_description;
                                    localTabContentQueries.getClass();
                                    releaseState2.getClass();
                                    localTabContentQueries.driver.execute(1034096740, "INSERT INTO expressivePaymentsBackgroundConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(str2, str3, str4, color, textFormat, list42, num2, localTabContentQueries, releaseState2, list5, booleanValue, str5));
                                    localTabContentQueries.notifyQueries(1034096740, new SessionQueries$$ExternalSyntheticLambda1(25, false));
                                }
                                break;
                            default:
                                ((TransactionWrapper) obj6).getClass();
                                InstrumentQueries instrumentQueries = realPersonalizationRepository22.stickerQueries;
                                instrumentQueries.driver.execute(1670261750, "DELETE FROM expressivePaymentsStickerConfig", null);
                                instrumentQueries.notifyQueries(1670261750, new SessionQueries$$ExternalSyntheticLambda1(27, false));
                                Iterator it = list32.iterator();
                                while (it.hasNext()) {
                                    Sticker sticker = (Sticker) it.next();
                                    String str6 = sticker.name;
                                    String str7 = sticker.main_url;
                                    String str8 = sticker.preview_url;
                                    List<StickerEffect> list6 = sticker.effects;
                                    Integer num22 = sticker.priority;
                                    ReleaseState releaseState3 = sticker.release_state;
                                    if (releaseState3 == null) {
                                        releaseState3 = ReleaseState.RELEASE_STATE_UNSPECIFIED;
                                    }
                                    ReleaseState releaseState4 = releaseState3;
                                    List<Tag> list7 = sticker.tags;
                                    Boolean bool2 = sticker.is_default;
                                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                    String str9 = sticker.accessibility_description;
                                    instrumentQueries.getClass();
                                    releaseState4.getClass();
                                    instrumentQueries.driver.execute(1083780793, "INSERT INTO expressivePaymentsStickerConfig VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new WorkWebViewKt$$ExternalSyntheticLambda8(str6, str7, str8, list6, num22, instrumentQueries, releaseState4, list7, booleanValue2, str9));
                                    instrumentQueries.notifyQueries(1083780793, new SessionQueries$$ExternalSyntheticLambda1(28, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                KeyValue keyValue2 = realPersonalizationRepository2.personalizePaymentResourceVersion;
                Integer num2 = new Integer(((JsonFeatureFlags$PersonalizePaymentResourceConfig.ResourceConfigVersion) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) realPersonalizationRepository2.featureFlagManager).peekCurrentValue(JsonFeatureFlags$PersonalizePaymentResourceConfig.INSTANCE)).value).version);
                this.label = 2;
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OfflineManager offlineManager = ((RealRawOfflineActivityService) obj4).offlineManager;
                    this.label = 1;
                    if (((RealOfflineManager) offlineManager).forceRetryAll(this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) obj4;
                ModifiablePermissions modifiablePermissions = mainPaymentPresenter.contactsPermission;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    shouldShowRequestPermissionRationale = modifiablePermissions.shouldShowRequestPermissionRationale(this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        shouldShowOverridePrompt = obj;
                        if (((Boolean) shouldShowOverridePrompt).booleanValue()) {
                            mainPaymentPresenter.navigator.goTo(new BlockersScreens.ReadContactsPermissionScreen());
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    shouldShowRequestPermissionRationale = obj;
                }
                if (!((Boolean) shouldShowRequestPermissionRationale).booleanValue()) {
                    this.label = 2;
                    shouldShowOverridePrompt = modifiablePermissions.shouldShowOverridePrompt(this);
                    break;
                } else {
                    modifiablePermissions.request();
                    return Unit.INSTANCE;
                }
            case 20:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj4;
                PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter.args;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = paymentConfigurationPresenter.analytics;
                    Orientation orientation = paymentConfiguration.orientation;
                    String uuid = paymentConfigurationPresenter.paymentToken.toString();
                    uuid.getClass();
                    String str2 = paymentConfigurationPresenter.flowToken;
                    orientation.getClass();
                    int i28 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                    if (i28 == 1) {
                        analytics.track(new AssetSendViewReviewPaymentScreen(uuid, str2), null);
                    } else {
                        if (i28 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        analytics.track(new AssetRequestViewReviewPaymentScreen(uuid, str2), null);
                    }
                    if (paymentConfiguration.orientation == Orientation.CASH) {
                        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PreloadExpressivePaymentResources.INSTANCE)).enabled()) {
                            RealPersonalizePaymentManager realPersonalizePaymentManager = paymentConfigurationPresenter.personalizePaymentManager;
                            this.label = 1;
                            Object cacheTopResources = realPersonalizePaymentManager.personalizationRepository.cacheTopResources(ReleaseState.RELEASE_STATE_ACTIVE, this);
                            if (cacheTopResources != coroutineSingletons21) {
                                cacheTopResources = Unit.INSTANCE;
                            }
                            if (cacheTopResources == coroutineSingletons21) {
                                return coroutineSingletons21;
                            }
                        }
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoreFlowRealSheetState coreFlowRealSheetState = ((CoreFlowBasicShieetScope) obj4).state;
                    this.label = 1;
                    if (((CoreFlowUserDismissMode) coreFlowRealSheetState.userDismissMode$delegate.getValue()).drag) {
                        obj2 = Draggable2DKt.animateTo$default(coreFlowRealSheetState.draggableState, CoreFlowSheetPosition.Hidden, this);
                        if (obj2 != obj6) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        coreFlowRealSheetState.dismissedWhenDraggingDisabled$delegate.setValue(Boolean.TRUE);
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1((JankStatsAggregator) obj4, continuation, 25);
                    this.label = 1;
                    if (JobKt.withContext(defaultScheduler2, overlayKt$Overlay$1$1$1$1$1, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj4;
                    this.label = 1;
                    PhonePlansEsimCheckBlockerScreen phonePlansEsimCheckBlockerScreen = (PhonePlansEsimCheckBlockerScreen) workHomePresenter.shiftSection2Presenter;
                    BlockerAction blockerAction = phonePlansEsimCheckBlockerScreen.retreatAction;
                    if (blockerAction == null) {
                        blockerAction = phonePlansEsimCheckBlockerScreen.dismissAction;
                    }
                    BlockerAction blockerAction2 = blockerAction;
                    if (blockerAction2 != null) {
                        obj3 = BlockersHelper.handleBlockerAction$default((RealBlockersHelper) workHomePresenter.youPresenter, blockerAction2, phonePlansEsimCheckBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (obj3 != obj7) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else {
                        ((BetterNavigator.ScreenNavigator) workHomePresenter.payPresenter).goTo(phonePlansEsimCheckBlockerScreen.blockersData.exitScreen);
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPhonePlansAppletTileAvailabilityManager realPhonePlansAppletTileAvailabilityManager = (RealPhonePlansAppletTileAvailabilityManager) ((WorkHomePresenter) obj4).shiftsAnalytics;
                    this.label = 1;
                    if (realPhonePlansAppletTileAvailabilityManager.refresh(this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealPhonePlansAppletTileAvailabilityManager) obj4).refresh(this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPoolsRepository realPoolsRepository = (RealPoolsRepository) ((WorkHomePresenter) obj4).titleBarPresenter;
                    this.label = 1;
                    if (JobKt.withContext(realPoolsRepository.ioDispatcher, new RingtoneView.AnonymousClass1(realPoolsRepository, continuation, i4), this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                PoolsRefresher poolsRefresher = (PoolsRefresher) obj4;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 != 0) {
                    if (i35 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DerivedStateFlow valuesStateExperiment = Trace.valuesStateExperiment(poolsRefresher.featureFlagManager, AmplitudeExperiments$P2pPools.INSTANCE);
                PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$1 = new PoolGoalMetKt$PoolGoalMet$1$1$1(poolsRefresher, i5);
                this.label = 1;
                valuesStateExperiment.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(poolGoalMetKt$PoolGoalMet$1$1$1, 9), this);
                return coroutineSingletons26;
            case 28:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolsService poolsService = ((RealPoolsRepository) obj4).poolsService;
                    GetPoolsAppletRequest getPoolsAppletRequest = new GetPoolsAppletRequest(HighlightedPoolsSelectionMode.HIGHLIGHTED_POOLS_SELECTION_MODE_ACTIVE_ONLY, new Integer(2), ByteString.EMPTY);
                    this.label = 1;
                    poolsApplet = poolsService.getPoolsApplet(getPoolsAppletRequest, this);
                    if (poolsApplet == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    poolsApplet = obj;
                }
                ApiResult apiResult4 = (ApiResult) poolsApplet;
                if ((apiResult4 instanceof ApiResult.Failure.HttpFailure) || (apiResult4 instanceof ApiResult.Failure.NetworkFailure)) {
                    return null;
                }
                if (apiResult4 instanceof ApiResult.Success) {
                    return (GetPoolsAppletResponse) ((ApiResult.Success) apiResult4).response;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfilePresenter profilePresenter = (ProfilePresenter) obj4;
                    RealPoolsRepository realPoolsRepository2 = (RealPoolsRepository) profilePresenter.profileRepo;
                    String str3 = ((PoolDetailsScreen) profilePresenter.paymentsInboundNavigator).token;
                    this.label = 1;
                    if (realPoolsRepository2.saveGoalMetAnimationShown(str3, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$3$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
