package androidx.paging;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonElevationAnimatable;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.InfiniteAnimationPolicy$Key;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.scrollcapture.RelativeScroller;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1;
import androidx.compose.ui.window.PopupLayout;
import androidx.core.net.UriKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.glance.action.ActionParameters$Key;
import androidx.glance.action.ActionParameters$Pair;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.appwidget.action.ActionCallback;
import androidx.glance.appwidget.action.ToggleableKt;
import androidx.glance.session.SessionManager;
import androidx.glance.session.SessionManagerImpl;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.session.SessionWorker;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LiveDataScopeImpl;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.Player;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.compose.state.PresentationState;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.PageFetcher;
import androidx.paging.PagingSource;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.util.AndroidSystemCallbacks;
import com.fillr.e0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$LoadingPriceMovement;
import com.squareup.cash.blockers.viewmodels.RemoteSkipEvent$Retry;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$cashtag$$inlined$map$1;
import com.squareup.cash.cdf.recipient.RecipientSearchLatencyMeasurement;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.contacts.ContactVerifier$Result;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.viewmodels.categories.InvestingFilterPillViewModel;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.moneybot.backend.api.managers.ChatResult;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$lambda$0$$inlined$map$1;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.util.coroutines.TakeUntilKt;
import com.squareup.util.coroutines.TickerKt$tickerFlow$1;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onNewBankAccountClick$1;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.SubscribedSharedFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PageFetcher$flow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* renamed from: androidx.paging.PageFetcher$flow$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ SimpleProducerScopeImpl $tmp0;

        public AnonymousClass4(SimpleProducerScopeImpl simpleProducerScopeImpl) {
            this.$tmp0 = simpleProducerScopeImpl;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object send = this.$tmp0.channel.send((PagingData) obj, continuation);
            return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return new FunctionReferenceImpl(2, 0, SimpleProducerScopeImpl.class, this.$tmp0, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(LiveDataScopeImpl liveDataScopeImpl, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.this$0 = liveDataScopeImpl;
        this.L$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1((PageFetcher) obj2, continuation, 0);
                pageFetcher$flow$1.L$0 = obj;
                return pageFetcher$flow$1;
            case 1:
                return new PageFetcher$flow$1((TextClassifier) this.L$0, (Function2) obj2, continuation, 1);
            case 2:
                return new PageFetcher$flow$1((AndroidClipboard) this.L$0, (AnnotatedString) obj2, continuation, 2);
            case 3:
                return new PageFetcher$flow$1((DraggableState) this.L$0, (MutableState) obj2, continuation, 3);
            case 4:
                return new PageFetcher$flow$1((AndroidSystemCallbacks) this.L$0, (AnimationSpec) obj2, continuation, 4);
            case 5:
                return new PageFetcher$flow$1((FloatingActionButtonElevationAnimatable) this.L$0, (FloatingActionButtonElevation) obj2, continuation, 5);
            case 6:
                return new PageFetcher$flow$1((FloatingActionButtonElevationAnimatable) this.L$0, (Interaction) obj2, continuation, 6);
            case 7:
                return new PageFetcher$flow$1((FocusStateImpl) this.L$0, (TooltipStateImpl) obj2, continuation, 7);
            case 8:
                return new PageFetcher$flow$1((ComposeScrollCaptureCallback) this.L$0, (Runnable) obj2, continuation, 8);
            case 9:
                PageFetcher$flow$1 pageFetcher$flow$12 = new PageFetcher$flow$1((PopupLayout) obj2, continuation, 9);
                pageFetcher$flow$12.L$0 = obj;
                return pageFetcher$flow$12;
            case 10:
                PageFetcher$flow$1 pageFetcher$flow$13 = new PageFetcher$flow$1((AppWidgetId) obj2, continuation, 10);
                pageFetcher$flow$13.L$0 = obj;
                return pageFetcher$flow$13;
            case 11:
                return new PageFetcher$flow$1((Context) this.L$0, (CashQrWidgetReceiver) obj2, continuation, 11);
            case 12:
                return new PageFetcher$flow$1((Intent) this.L$0, (Context) obj2, continuation, 12);
            case 13:
                PageFetcher$flow$1 pageFetcher$flow$14 = new PageFetcher$flow$1((AppWidgetSession) obj2, continuation, 13);
                pageFetcher$flow$14.L$0 = obj;
                return pageFetcher$flow$14;
            case 14:
                return new PageFetcher$flow$1((SessionWorker) this.L$0, (AppWidgetSession) obj2, continuation, 14);
            case 15:
                PageFetcher$flow$1 pageFetcher$flow$15 = new PageFetcher$flow$1((SessionWorker) obj2, continuation, 15);
                pageFetcher$flow$15.L$0 = obj;
                return pageFetcher$flow$15;
            case 16:
                PageFetcher$flow$1 pageFetcher$flow$16 = new PageFetcher$flow$1((e0) obj2, continuation, 16);
                pageFetcher$flow$16.L$0 = obj;
                return pageFetcher$flow$16;
            case 17:
                return new PageFetcher$flow$1((LifecycleCoroutineScopeImpl) this.L$0, (WorkflowLayout$start$1) obj2, continuation, 17);
            case 18:
                return new PageFetcher$flow$1((LifecycleCoroutineScopeImpl) this.L$0, (HazeSourceNode$launchPreDraw$1) obj2, continuation, 18);
            case 19:
                PageFetcher$flow$1 pageFetcher$flow$17 = new PageFetcher$flow$1((Lifecycle) obj2, continuation, 19);
                pageFetcher$flow$17.L$0 = obj;
                return pageFetcher$flow$17;
            case 20:
                return new PageFetcher$flow$1((LiveDataScopeImpl) obj2, this.L$0, continuation);
            case 21:
                return new PageFetcher$flow$1((Player) this.L$0, (Function2) obj2, continuation, 21);
            case 22:
                return new PageFetcher$flow$1((PresentationState) this.L$0, (ExoPlayer) obj2, continuation, 22);
            case 23:
                PageFetcher$flow$1 pageFetcher$flow$18 = new PageFetcher$flow$1((JWECryptoParts) obj2, continuation, 23);
                pageFetcher$flow$18.L$0 = obj;
                return pageFetcher$flow$18;
            case 24:
                return new PageFetcher$flow$1((Flow) this.L$0, (JWECryptoParts) obj2, continuation, 24);
            case 25:
                return new PageFetcher$flow$1((PageFetcherSnapshot) this.L$0, (SimpleProducerScopeImpl) obj2, continuation, 25);
            case 26:
                return new PageFetcher$flow$1((PageFetcherSnapshot) this.L$0, (BufferedChannel) obj2, continuation, 26);
            case 27:
                return new PageFetcher$flow$1((BufferedChannel) this.L$0, (Function2) obj2, continuation, 27);
            case 28:
                PageFetcher$flow$1 pageFetcher$flow$19 = new PageFetcher$flow$1((LazyPagingItems) obj2, continuation, 28);
                pageFetcher$flow$19.L$0 = obj;
                return pageFetcher$flow$19;
            default:
                return new PageFetcher$flow$1((MeasurementManagerFutures$Api33Ext5JavaImpl) this.L$0, (Uri) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((PageFetcher$flow$1) create((SimpleProducerScopeImpl) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((PageFetcher$flow$1) create((SessionManagerImpl$scope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((PageFetcher$flow$1) create((SessionManagerImpl$scope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((PageFetcher$flow$1) create((TimerScopeKt$withTimer$2$1$blockScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((PageFetcher$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 22:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((PageFetcher$flow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((PageFetcher$flow$1) create((PagingData) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((PageFetcher$flow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0533  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x050a -> B:263:0x050e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i = this.$r8$classId;
        String str = "Error in Glance App Widget";
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        Object obj2 = this.this$0;
        int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                PageFetcher pageFetcher = (PageFetcher) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleProducerScopeImpl simpleProducerScopeImpl = (SimpleProducerScopeImpl) this.L$0;
                    Flow simpleChannelFlow = FlowExtKt.simpleChannelFlow(new FlowExtKt$simpleRunningReduce$1(FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new SafeFlow(new FlowExtKt$simpleScan$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AnonymousClass1(i3, continuation, i4), (CachedPagingDataKt$cachedIn$$inlined$map$1) pageFetcher.loadRequests.renderOptions), new AnonymousClass2(pageFetcher, null), continuation, i4)), 24)), new AnchoredDraggableNode$drag$2(continuation, pageFetcher, i2), continuation, i5));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(simpleProducerScopeImpl);
                    this.label = 1;
                    if (simpleChannelFlow.collect(anonymousClass4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TextClassifier textClassifier = (TextClassifier) this.L$0;
                if (textClassifier == null) {
                    return null;
                }
                this.label = 1;
                Object invoke = ((Function2) obj2).invoke(textClassifier, this);
                return invoke == coroutineSingletons2 ? coroutineSingletons2 : invoke;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidClipboard androidClipboard = (AndroidClipboard) this.L$0;
                    ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry((AnnotatedString) obj2);
                    this.label = 1;
                    if (androidClipboard.setClipEntry(clipEntry) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DraggableState draggableState = (DraggableState) this.L$0;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(i3, continuation, 4);
                    this.label = 1;
                    if (draggableState.drag(mutatePriority, anonymousClass2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((Function1) ((MutableState) obj2).getValue()).invoke(new Float(RecyclerView.DECELERATION_RATE));
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default((Animatable) ((AndroidSystemCallbacks) this.L$0).activityCallbacks, new Float(RecyclerView.DECELERATION_RATE), (AnimationSpec) obj2, null, null, this, 12) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) this.L$0;
                    FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj2;
                    float f = floatingActionButtonElevation.defaultElevation;
                    float f2 = floatingActionButtonElevation.pressedElevation;
                    float f3 = floatingActionButtonElevation.hoveredElevation;
                    float f4 = floatingActionButtonElevation.focusedElevation;
                    this.label = 1;
                    floatingActionButtonElevationAnimatable.defaultElevation = f;
                    floatingActionButtonElevationAnimatable.pressedElevation = f2;
                    floatingActionButtonElevationAnimatable.hoveredElevation = f3;
                    floatingActionButtonElevationAnimatable.focusedElevation = f4;
                    Object snapElevation = floatingActionButtonElevationAnimatable.snapElevation(this);
                    if (snapElevation != coroutineSingletons6) {
                        snapElevation = Unit.INSTANCE;
                    }
                    if (snapElevation == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((FloatingActionButtonElevationAnimatable) this.L$0).animateElevation((Interaction) obj2, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                FocusStateImpl focusStateImpl = (FocusStateImpl) this.L$0;
                TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) obj2;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (focusStateImpl.isFocused()) {
                        MutatePriority mutatePriority2 = MutatePriority.PreventUserInput;
                        this.label = 1;
                        if (tooltipStateImpl.show(mutatePriority2, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (tooltipStateImpl.isVisible() && !focusStateImpl.isFocused()) {
                    tooltipStateImpl.dismiss();
                }
                return Unit.INSTANCE;
            case 8:
                ComposeScrollCaptureCallback composeScrollCaptureCallback = (ComposeScrollCaptureCallback) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RelativeScroller relativeScroller = composeScrollCaptureCallback.scrollTracker;
                    this.label = 1;
                    Object scrollBy = relativeScroller.scrollBy(RecyclerView.DECELERATION_RATE - relativeScroller.scrollAmount, this);
                    if (scrollBy != coroutineSingletons9) {
                        scrollBy = Unit.INSTANCE;
                    }
                    if (scrollBy == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                composeScrollCaptureCallback.listener.scrollCaptureInProgress$delegate.setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    if (JobKt.isActive(coroutineScope)) {
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    PopupLayout popupLayout = (PopupLayout) obj2;
                    int[] iArr = popupLayout.locationOnScreen;
                    if (popupLayout.isAttachedToWindow()) {
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        popupLayout.composeView.getLocationOnScreen(iArr);
                        if (i16 != iArr[0] || i17 != iArr[1]) {
                            popupLayout.updateParentBounds$ui();
                        }
                    }
                    if (JobKt.isActive(coroutineScope)) {
                        AndroidPopup_androidKt$Popup$5$1$1 androidPopup_androidKt$Popup$5$1$1 = AndroidPopup_androidKt$Popup$5$1$1.INSTANCE;
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (getContext().get(InfiniteAnimationPolicy$Key.$$INSTANCE) != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            return null;
                        }
                        if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, androidPopup_androidKt$Popup$5$1$1) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                        PopupLayout popupLayout2 = (PopupLayout) obj2;
                        int[] iArr2 = popupLayout2.locationOnScreen;
                        if (popupLayout2.isAttachedToWindow()) {
                        }
                        if (JobKt.isActive(coroutineScope)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManagerImpl$scope$1 sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) this.L$0;
                    String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(((AppWidgetId) obj2).appWidgetId);
                    this.label = 1;
                    AppWidgetSession appWidgetSession = (AppWidgetSession) sessionManagerImpl$scope$1.sessions.remove(createUniqueRemoteUiName);
                    if (appWidgetSession != null) {
                        appWidgetSession.eventChannel.close(null);
                        appWidgetSession._isOpen.set(false);
                        appWidgetSession.parentJob.cancel(null);
                    }
                    if (Unit.INSTANCE == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                try {
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CashQrWidgetReceiver cashQrWidgetReceiver = (CashQrWidgetReceiver) obj2;
                        GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager((Context) this.L$0);
                        CashQrWidget cashQrWidget = cashQrWidgetReceiver.glanceAppWidget;
                        this.label = 1;
                        Object updateReceiver$glance_appwidget_release = glanceAppWidgetManager.updateReceiver$glance_appwidget_release(cashQrWidgetReceiver, cashQrWidget, this);
                        str = updateReceiver$glance_appwidget_release;
                        if (updateReceiver$glance_appwidget_release == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        str = str;
                    }
                } catch (CancellationException unused) {
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", str, th);
                }
                return Unit.INSTANCE;
            case 12:
                Intent intent = (Intent) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
                }
                if (i20 != 0) {
                    if (i20 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    throw new IllegalArgumentException("The intent must have action parameters extras.");
                }
                Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                if (bundle == null) {
                    throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                }
                LinkedHashMap linkedHashMap = ActionParametersKt.mutableActionParametersOf(new ActionParameters$Pair[0]).map;
                for (String str2 : bundle.keySet()) {
                    ActionParameters$Key actionParameters$Key = new ActionParameters$Key(str2);
                    Object obj3 = bundle.get(str2);
                    linkedHashMap.get(actionParameters$Key);
                    if (obj3 == null) {
                        linkedHashMap.remove(actionParameters$Key);
                    } else {
                        linkedHashMap.put(actionParameters$Key, obj3);
                    }
                }
                if (extras.containsKey("android.widget.extra.CHECKED")) {
                    ActionParameters$Key actionParameters$Key2 = ToggleableKt.ToggleableStateKey;
                    Boolean valueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
                    linkedHashMap.get(actionParameters$Key2);
                    linkedHashMap.put(actionParameters$Key2, valueOf);
                }
                String string2 = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                if (string2 == null) {
                    throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                }
                if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                    throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                }
                extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
                this.label = 1;
                Class<?> cls = Class.forName(string2);
                if (!ActionCallback.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("Provided class must implement ActionCallback.");
                }
                cls.getDeclaredConstructor(null).newInstance(null).getClass();
                throw new ClassCastException();
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManagerImpl$scope$1 sessionManagerImpl$scope$12 = (SessionManagerImpl$scope$1) this.L$0;
                    String str3 = ((AppWidgetSession) obj2).key;
                    this.label = 1;
                    AppWidgetSession appWidgetSession2 = (AppWidgetSession) sessionManagerImpl$scope$12.sessions.remove(str3);
                    if (appWidgetSession2 != null) {
                        appWidgetSession2.eventChannel.close(null);
                        appWidgetSession2._isOpen.set(false);
                        appWidgetSession2.parentJob.cancel(null);
                    }
                    if (Unit.INSTANCE == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManager sessionManager = ((SessionWorker) this.L$0).sessionManager;
                    PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1((AppWidgetSession) obj2, continuation, 13);
                    this.label = 1;
                    if (((SessionManagerImpl) sessionManager).runWithLock(pageFetcher$flow$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                SessionWorker sessionWorker = (SessionWorker) obj2;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = (TimerScopeKt$withTimer$2$1$blockScope$1) this.L$0;
                Context applicationContext = sessionWorker.getApplicationContext();
                Continuation continuation2 = null;
                SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1(timerScopeKt$withTimer$2$1$blockScope$1, sessionWorker, continuation2, i4);
                SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(sessionWorker, timerScopeKt$withTimer$2$1$blockScope$1, continuation2, i4);
                this.label = 1;
                Object coroutineScope2 = JobKt.coroutineScope(new FlowExtKt$simpleScan$1(applicationContext, sessionWorker$doWork$2$2, sessionWorker$doWork$2$1, continuation2, 21), this);
                return coroutineScope2 == coroutineSingletons16 ? coroutineSingletons16 : coroutineScope2;
            case 16:
                e0 e0Var = (e0) obj2;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl((CoroutineLiveData) e0Var.a, ((CoroutineScope) this.L$0).getCoroutineContext());
                    Function2 function2 = (Function2) e0Var.b;
                    this.label = 1;
                    if (function2.invoke(liveDataScopeImpl, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((Worker$$ExternalSyntheticLambda0) e0Var.i).invoke();
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    if (JobKt.withContext(MainDispatcherLoader.dispatcher.immediate, new PausingDispatcherKt$whenStateAtLeast$2(((LifecycleCoroutineScopeImpl) this.L$0).lifecycle, state, (WorkflowLayout$start$1) obj2, null), this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    if (JobKt.withContext(MainDispatcherLoader.dispatcher.immediate, new PausingDispatcherKt$whenStateAtLeast$2(((LifecycleCoroutineScopeImpl) this.L$0).lifecycle, state2, (HazeSourceNode$launchPreDraw$1) obj2, null), this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                Lifecycle lifecycle = (Lifecycle) obj2;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerScope producerScope = (ProducerScope) this.L$0;
                    Lifecycle$$ExternalSyntheticLambda0 lifecycle$$ExternalSyntheticLambda0 = new Lifecycle$$ExternalSyntheticLambda0(producerScope, i5);
                    lifecycle.addObserver(lifecycle$$ExternalSyntheticLambda0);
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(26, lifecycle, lifecycle$$ExternalSyntheticLambda0);
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, dialogHostKt$$ExternalSyntheticLambda0, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineLiveData coroutineLiveData = ((LiveDataScopeImpl) obj2).target;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (coroutineLiveData.clearSource$lifecycle_livedata(this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                coroutineLiveData.setValue(this.L$0);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 != 0) {
                    if (i29 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                PlayerExtensionsKt.listenImpl((Player) this.L$0, (Function2) obj2, this);
                return coroutineSingletons22;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((PresentationState) this.L$0).observe((ExoPlayer) obj2, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
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
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = PKIFailureInfo.systemUnavail;
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1((SubscribedSharedFlow) ((JWECryptoParts) obj2).iv, new DataStoreImpl$data$1.AnonymousClass2(i3, continuation, 5), i4);
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(7, ref$IntRef, flowCollector);
                    this.label = 1;
                    if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(anonymousClass1, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
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
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$0;
                    ChannelFlowCollector channelFlowCollector = new ChannelFlowCollector((JWECryptoParts) obj2, i5);
                    this.label = 1;
                    Object collect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(channelFlowCollector, new Ref$IntRef(), i4), this);
                    if (collect != coroutineSingletons25) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons25) {
                        return coroutineSingletons25;
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
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow(((PageFetcherSnapshot) this.L$0).pageEventCh);
                    ChannelFlowCollector channelFlowCollector2 = new ChannelFlowCollector((SimpleProducerScopeImpl) obj2, i3);
                    this.label = 1;
                    if (consumeAsFlow.collect(channelFlowCollector2, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
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
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = ((PageFetcherSnapshot) this.L$0).retryFlow;
                    ChannelFlowCollector channelFlowCollector3 = new ChannelFlowCollector((BufferedChannel) obj2, i2);
                    this.label = 1;
                    if (flow2.collect(channelFlowCollector3, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
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
                BufferedChannel bufferedChannel = (BufferedChannel) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                try {
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(bufferedChannel, (Function2) obj2, continuation, 12);
                        this.label = 1;
                        if (JobKt.coroutineScope(sliderState$drag$2, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    bufferedChannel.close(null);
                } catch (Throwable th3) {
                    bufferedChannel.closeOrCancelImpl(th3, false);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagingData pagingData = (PagingData) this.L$0;
                    LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = ((LazyPagingItems) obj2).pagingDataPresenter;
                    this.label = 1;
                    Object runInIsolation = lazyPagingItems$pagingDataPresenter$1.collectFromRunner.runInIsolation(new PagingDataPresenter$collectFrom$2(lazyPagingItems$pagingDataPresenter$1, pagingData, continuation, i4), this);
                    if (runInIsolation != coroutineSingletons29) {
                        runInIsolation = Unit.INSTANCE;
                    }
                    if (runInIsolation == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((MeasurementManagerFutures$Api33Ext5JavaImpl) this.L$0).mMeasurementManager.registerTrigger((Uri) obj2, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
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

    /* renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i) {
            super(2, null);
            this.$r8$classId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(2, continuation, 1);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 2:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(2, continuation, 2);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 3:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(2, continuation, 3);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 4:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(2, continuation, 4);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 5:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(2, continuation, 5);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                case 6:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1(2, continuation, 6);
                    anonymousClass17.L$0 = obj;
                    return anonymousClass17;
                case 7:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1(2, continuation, 7);
                    anonymousClass18.L$0 = obj;
                    return anonymousClass18;
                case 8:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1(2, continuation, 8);
                    anonymousClass19.L$0 = obj;
                    return anonymousClass19;
                case 9:
                    AnonymousClass1 anonymousClass110 = new AnonymousClass1(2, continuation, 9);
                    anonymousClass110.L$0 = obj;
                    return anonymousClass110;
                case 10:
                    AnonymousClass1 anonymousClass111 = new AnonymousClass1(2, continuation, 10);
                    anonymousClass111.L$0 = obj;
                    return anonymousClass111;
                case 11:
                    AnonymousClass1 anonymousClass112 = new AnonymousClass1(2, continuation, 11);
                    anonymousClass112.L$0 = obj;
                    return anonymousClass112;
                case 12:
                    AnonymousClass1 anonymousClass113 = new AnonymousClass1(2, continuation, 12);
                    anonymousClass113.L$0 = obj;
                    return anonymousClass113;
                case 13:
                    AnonymousClass1 anonymousClass114 = new AnonymousClass1(2, continuation, 13);
                    anonymousClass114.L$0 = obj;
                    return anonymousClass114;
                case 14:
                    AnonymousClass1 anonymousClass115 = new AnonymousClass1(2, continuation, 14);
                    anonymousClass115.L$0 = obj;
                    return anonymousClass115;
                case 15:
                    AnonymousClass1 anonymousClass116 = new AnonymousClass1(2, continuation, 15);
                    anonymousClass116.L$0 = obj;
                    return anonymousClass116;
                case 16:
                    AnonymousClass1 anonymousClass117 = new AnonymousClass1(2, continuation, 16);
                    anonymousClass117.L$0 = obj;
                    return anonymousClass117;
                case 17:
                    AnonymousClass1 anonymousClass118 = new AnonymousClass1(2, continuation, 17);
                    anonymousClass118.L$0 = obj;
                    return anonymousClass118;
                case 18:
                    AnonymousClass1 anonymousClass119 = new AnonymousClass1(2, continuation, 18);
                    anonymousClass119.L$0 = obj;
                    return anonymousClass119;
                case 19:
                    AnonymousClass1 anonymousClass120 = new AnonymousClass1(2, continuation, 19);
                    anonymousClass120.L$0 = obj;
                    return anonymousClass120;
                case 20:
                    AnonymousClass1 anonymousClass121 = new AnonymousClass1(2, continuation, 20);
                    anonymousClass121.L$0 = obj;
                    return anonymousClass121;
                case 21:
                    AnonymousClass1 anonymousClass122 = new AnonymousClass1(2, continuation, 21);
                    anonymousClass122.L$0 = obj;
                    return anonymousClass122;
                case 22:
                    AnonymousClass1 anonymousClass123 = new AnonymousClass1(2, continuation, 22);
                    anonymousClass123.L$0 = obj;
                    return anonymousClass123;
                case 23:
                    AnonymousClass1 anonymousClass124 = new AnonymousClass1(2, continuation, 23);
                    anonymousClass124.L$0 = obj;
                    return anonymousClass124;
                case 24:
                    AnonymousClass1 anonymousClass125 = new AnonymousClass1(2, continuation, 24);
                    anonymousClass125.L$0 = obj;
                    return anonymousClass125;
                case 25:
                    AnonymousClass1 anonymousClass126 = new AnonymousClass1(2, continuation, 25);
                    anonymousClass126.L$0 = obj;
                    return anonymousClass126;
                case 26:
                    AnonymousClass1 anonymousClass127 = new AnonymousClass1(2, continuation, 26);
                    anonymousClass127.L$0 = obj;
                    return anonymousClass127;
                case 27:
                    AnonymousClass1 anonymousClass128 = new AnonymousClass1(2, continuation, 27);
                    anonymousClass128.L$0 = obj;
                    return anonymousClass128;
                case 28:
                    AnonymousClass1 anonymousClass129 = new AnonymousClass1(2, continuation, 28);
                    anonymousClass129.L$0 = obj;
                    return anonymousClass129;
                default:
                    AnonymousClass1 anonymousClass130 = new AnonymousClass1(2, continuation, 29);
                    anonymousClass130.L$0 = obj;
                    return anonymousClass130;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:183:0x02a3, code lost:
        
            if (androidx.compose.animation.core.AnimatableKt.animate$default(2.0f, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, r2, r3, r22, 4) == r13) goto L156;
         */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x0286, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(500, r22) == r13) goto L156;
         */
        /* JADX WARN: Code restructure failed: missing block: B:199:0x02ec, code lost:
        
            if (androidx.compose.animation.core.AnimatableKt.animate$default(2.0f, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, r2, r3, r22, 4) == r13) goto L171;
         */
        /* JADX WARN: Code restructure failed: missing block: B:203:0x02cf, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(500, r22) == r13) goto L171;
         */
        /* JADX WARN: Code restructure failed: missing block: B:231:0x03a0, code lost:
        
            if (r0.emit(r2, r22) == r1) goto L202;
         */
        /* JADX WARN: Code restructure failed: missing block: B:235:0x038e, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r22) == r1) goto L202;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x03e8, code lost:
        
            if (r0.emit(r2, r22) == r1) goto L217;
         */
        /* JADX WARN: Code restructure failed: missing block: B:251:0x03d6, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r22) == r1) goto L217;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            RemoteMediator$InitializeAction remoteMediator$InitializeAction;
            CoroutineScope coroutineScope;
            int i = 3;
            int i2 = 2;
            Object[] objArr = 0;
            final int i3 = 1;
            PriceHistory priceHistory = null;
            Object[] objArr2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        remoteMediator$InitializeAction = null;
                    } else if (i4 == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        remoteMediator$InitializeAction = (RemoteMediator$InitializeAction) obj;
                    } else if (i4 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    PageFetcher$LoadRequest$Refresh pageFetcher$LoadRequest$Refresh = new PageFetcher$LoadRequest$Refresh(remoteMediator$InitializeAction == RemoteMediator$InitializeAction.LAUNCH_INITIAL_REFRESH, PageFetcher$RefreshType$All.INSTANCE$2);
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(pageFetcher$LoadRequest$Refresh, this) == coroutineSingletons) {
                        break;
                    }
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        coroutineScope = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    while (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = new BorderKt$$ExternalSyntheticLambda1(27);
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, borderKt$$ExternalSyntheticLambda1) == coroutineSingletons2) {
                            break;
                        }
                    }
                    break;
                case 2:
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool = Boolean.TRUE;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector2.emit(bool, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool2 = Boolean.FALSE;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector3.emit(bool2, this) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 4:
                    FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool3 = Boolean.FALSE;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector4.emit(bool3, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 5:
                    FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FullscreenAdViewModel.Loading loading = new FullscreenAdViewModel.Loading(null);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector5.emit(loading, this) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 6:
                    FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector6.emit(BitcoinRepositoryModel$Installed$LoadingPriceMovement.INSTANCE, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 7:
                    FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InvestingGraphViewEvent.SelectRange selectRange = new InvestingGraphViewEvent.SelectRange(HistoricalRange.DAY);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector7.emit(selectRange, this) == coroutineSingletons8) {
                            break;
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector8.emit(RemoteSkipEvent$Retry.INSTANCE, this) == coroutineSingletons9) {
                            break;
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 9:
                    FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector9.emit(ContactVerifier$Result.Loading.INSTANCE, this) == coroutineSingletons10) {
                            break;
                        }
                    } else if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 10:
                    FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector10.emit(null, this) == coroutineSingletons11) {
                            break;
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 11:
                    FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(8415L, DurationUnit.MILLISECONDS);
                        this.L$0 = flowCollector11;
                        this.label = 1;
                        break;
                    } else if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i15 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Long l = new Long(0L);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                case 12:
                    FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion2 = Duration.Companion;
                        long duration2 = DurationKt.toDuration(8415L, DurationUnit.MILLISECONDS);
                        this.L$0 = flowCollector12;
                        this.label = 1;
                        break;
                    } else if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i16 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    Long l2 = new Long(0L);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                case 13:
                    FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion3 = Duration.Companion;
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        TakeUntil takeUntil = TakeUntilKt.takeUntil(FlowKt.buffer$default(new SafeFlow(new TickerKt$tickerFlow$1(DurationKt.toDuration(10000L, durationUnit), DurationKt.toDuration(33L, durationUnit), (Continuation) null)), 0, 3), new SafeFlow(new AnonymousClass1(i2, objArr2 == true ? 1 : 0, 12)));
                        this.L$0 = null;
                        this.label = 1;
                        FlowKt.ensureActive(flowCollector13);
                        Object collect = takeUntil.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector13, 13), this);
                        if (collect != coroutineSingletons14) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect != coroutineSingletons14) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons14) {
                            break;
                        }
                    } else if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 14:
                    final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = produceStateScope;
                        this.label = 1;
                        break;
                    } else if (i18 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i18 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    TweenSpec tween$default = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, new CubicBezierEasing(0.4f, 1.0f, 0.6f, RecyclerView.DECELERATION_RATE), 2);
                    final Object[] objArr3 = objArr == true ? 1 : 0;
                    Function2 function2 = new Function2() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$PatternGrid$segmentRange$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i19 = objArr3;
                            float floatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).floatValue();
                            switch (i19) {
                                case 0:
                                    produceStateScope.setValue(new ClosedFloatRange(RangesKt___RangesKt.coerceIn(floatValue - 1.0f, RecyclerView.DECELERATION_RATE, 1.0f), RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f)));
                                    break;
                                default:
                                    produceStateScope.setValue(new ClosedFloatRange(RangesKt___RangesKt.coerceIn(floatValue - 1.0f, RecyclerView.DECELERATION_RATE, 1.0f), RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 2;
                    break;
                case 15:
                    final ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = produceStateScope2;
                        this.label = 1;
                        break;
                    } else if (i19 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i19 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    TweenSpec tween$default2 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, new CubicBezierEasing(0.4f, 1.0f, 0.6f, RecyclerView.DECELERATION_RATE), 2);
                    Function2 function22 = new Function2() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$PatternGrid$segmentRange$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i192 = i3;
                            float floatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).floatValue();
                            switch (i192) {
                                case 0:
                                    produceStateScope2.setValue(new ClosedFloatRange(RangesKt___RangesKt.coerceIn(floatValue - 1.0f, RecyclerView.DECELERATION_RATE, 1.0f), RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f)));
                                    break;
                                default:
                                    produceStateScope2.setValue(new ClosedFloatRange(RangesKt___RangesKt.coerceIn(floatValue - 1.0f, RecyclerView.DECELERATION_RATE, 1.0f), RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 2;
                    break;
                case 16:
                    FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector14.emit(null, this) == coroutineSingletons17) {
                            break;
                        }
                    } else if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 17:
                    FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector15.emit(null, this) == coroutineSingletons18) {
                            break;
                        }
                    } else if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 18:
                    FlowCollector flowCollector16 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector16.emit(null, this) == coroutineSingletons19) {
                            break;
                        }
                    } else if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 19:
                    FlowCollector flowCollector17 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PolledData polledData = new PolledData(new GetHistoricalExchangeDataResponse(priceHistory, i), false);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector17.emit(polledData, this) == coroutineSingletons20) {
                            break;
                        }
                    } else if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 20:
                    FlowCollector flowCollector18 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PolledData polledData2 = new PolledData(new GetPortfoliosHistoricalDataResponse(null, 127), false);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector18.emit(polledData2, this) == coroutineSingletons21) {
                            break;
                        }
                    } else if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 21:
                    FlowCollector flowCollector19 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool4 = Boolean.FALSE;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector19.emit(bool4, this) == coroutineSingletons22) {
                            break;
                        }
                    } else if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 22:
                    FlowCollector flowCollector20 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector20.emit(null, this) == coroutineSingletons23) {
                            break;
                        }
                    } else if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 23:
                    FlowCollector flowCollector21 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ActivityEvent activityEvent = ActivityEvent.START;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector21.emit(activityEvent, this) == coroutineSingletons24) {
                            break;
                        }
                    } else if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 24:
                    FlowCollector flowCollector22 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector22.emit(unit, this) == coroutineSingletons25) {
                            break;
                        }
                    } else if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 25:
                    FlowCollector flowCollector23 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector23.emit("", this) == coroutineSingletons26) {
                            break;
                        }
                    } else if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 26:
                    FlowCollector flowCollector24 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector24.emit("", this) == coroutineSingletons27) {
                            break;
                        }
                    } else if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 27:
                    FlowCollector flowCollector25 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InviteContactsViewEvent.TextChanged textChanged = new InviteContactsViewEvent.TextChanged("");
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector25.emit(textChanged, this) == coroutineSingletons28) {
                            break;
                        }
                    } else if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 28:
                    FlowCollector flowCollector26 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InviteContactsViewEvent.TextChanged textChanged2 = new InviteContactsViewEvent.TextChanged("");
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector26.emit(textChanged2, this) == coroutineSingletons29) {
                            break;
                        }
                    } else if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    FlowCollector flowCollector27 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ApiResult.Success success = new ApiResult.Success(new ChatResult(null));
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector27.emit(success, this) == coroutineSingletons30) {
                            break;
                        }
                    } else if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageFetcher$flow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    /* renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ Object this$0;

        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function0 {
            public final /* synthetic */ int $r8$classId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
                super(i, i2, cls, obj, str, str2);
                this.$r8$classId = i3;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Continuation continuation = null;
                switch (this.$r8$classId) {
                    case 0:
                        ((PageFetcher) this.receiver).loadRequests.send(new PageFetcher$LoadRequest$Refresh(true, PageFetcher$RefreshType$All.INSTANCE$1));
                        break;
                    case 1:
                        ((PageFetcher) this.receiver).loadRequests.send(new PageFetcher$LoadRequest$Refresh(true, PageFetcher$RefreshType$All.INSTANCE$1));
                        break;
                    case 2:
                        ErrorViewModel errorViewModel = (ErrorViewModel) this.receiver;
                        errorViewModel.getClass();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(errorViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(errorViewModel, continuation, 1), 3);
                        break;
                    case 3:
                        ExitViewModel exitViewModel = (ExitViewModel) this.receiver;
                        exitViewModel.getClass();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(exitViewModel), null, null, new ExoPlayerVideoView.AnonymousClass2(exitViewModel, continuation, 23), 3);
                        break;
                    case 4:
                        LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) this.receiver;
                        linkAccountPickerViewModel.getClass();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(linkAccountPickerViewModel), null, null, new LinkAccountPickerViewModel$onNewBankAccountClick$1(linkAccountPickerViewModel, continuation, 0), 3);
                        break;
                    case 5:
                        NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.receiver;
                        networkingLinkSignupViewModel.getClass();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(networkingLinkSignupViewModel), null, null, new CameraHelper$unbind$2(networkingLinkSignupViewModel, continuation, 14), 3);
                        break;
                    default:
                        SuccessViewModel successViewModel = (SuccessViewModel) this.receiver;
                        successViewModel.getClass();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(successViewModel), null, null, new ExoPlayerVideoView.AnonymousClass2(successViewModel, continuation, 25), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
            super(3, continuation);
            this.$r8$classId = i;
            this.L$1 = obj;
            this.L$4 = obj2;
            this.L$0 = obj3;
            this.this$0 = obj4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = this.$r8$classId;
            Object obj4 = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((PageFetcher) obj4, (Continuation) obj3);
                    anonymousClass2.L$0 = (PageFetcher.GenerationInfo) obj;
                    anonymousClass2.L$1 = (PageFetcher$LoadRequest$Refresh) obj2;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                case 1:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2((FilterConfiguration.SubFilters) this.L$1, (FilterGroup) this.L$4, (ColorModel) this.L$0, (InvestingSearchPresenter) obj4, (Continuation) obj3, 1);
                    anonymousClass22.L$3 = (FlowCollector) obj;
                    anonymousClass22.L$2 = obj2;
                    return anonymousClass22.invokeSuspend(Unit.INSTANCE);
                case 2:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2((MainPaymentPresenter) this.L$1, (MutableState) this.L$4, (State) this.L$0, (MutableState) obj4, (Continuation) obj3, 2);
                    anonymousClass23.L$3 = (FlowCollector) obj;
                    anonymousClass23.L$2 = obj2;
                    return anonymousClass23.invokeSuspend(Unit.INSTANCE);
                case 3:
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2((PaymentConfigurationPresenter) this.L$1, (MutableStateFlow) this.L$4, (MutableState) this.L$0, (State) obj4, (Continuation) obj3, 3);
                    anonymousClass24.L$3 = (FlowCollector) obj;
                    anonymousClass24.L$2 = obj2;
                    return anonymousClass24.invokeSuspend(Unit.INSTANCE);
                default:
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2((RealPayDataLoader) this.L$1, (MerchantIdentifier) this.L$4, (RealPayDataLoader.Identity) this.L$0, (AtomicBoolean) obj4, (Continuation) obj3, 4);
                    anonymousClass25.L$3 = (FlowCollector) obj;
                    anonymousClass25.L$2 = obj2;
                    return anonymousClass25.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:235:0x044f, code lost:
        
            if (r10 == r3) goto L215;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x028f, code lost:
        
            r3.add(r9);
         */
        /* JADX WARN: Removed duplicated region for block: B:147:0x05fb A[LOOP:6: B:145:0x05f5->B:147:0x05fb, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x049e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PageFetcher.GenerationInfo generationInfo;
            PageFetcher$LoadRequest$Refresh pageFetcher$LoadRequest$Refresh;
            Object access$generateNewPagingSource;
            Object access$generateNewPagingSource2;
            PageFetcher.GenerationInfo generationInfo2;
            PagingSource pagingSource;
            Ref$ObjectRef ref$ObjectRef;
            Object currentPagingState;
            PageFetcher$LoadRequest$Refresh pageFetcher$LoadRequest$Refresh2;
            Ref$ObjectRef ref$ObjectRef2;
            Object refreshKey;
            Pair pair;
            Ref$ObjectRef ref$ObjectRef3;
            PagingSource pagingSource2;
            Object loadKey$paging_common;
            Ref$ObjectRef ref$ObjectRef4;
            PagingSource pagingSource3;
            Object obj2;
            Object obj3;
            Object loadKey$paging_common2;
            PagingSource pagingSource4;
            Object obj4;
            PagingState pagingState;
            List list;
            Iterator it;
            int i;
            CoroutineSingletons coroutineSingletons;
            Flow realShareableAssetsManager$download$lambda$0$$inlined$map$1;
            Region region;
            Flow flow;
            int i2 = this.$r8$classId;
            int i3 = 19;
            int i4 = 4;
            int i5 = 10;
            Object obj5 = this.this$0;
            int i6 = 1;
            Continuation continuation = null;
            switch (i2) {
                case 0:
                    PageFetcher pageFetcher = (PageFetcher) obj5;
                    PagingConfig pagingConfig = pageFetcher.config;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (this.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            generationInfo = (PageFetcher.GenerationInfo) this.L$0;
                            pageFetcher$LoadRequest$Refresh = (PageFetcher$LoadRequest$Refresh) this.L$1;
                            if (pageFetcher$LoadRequest$Refresh != null) {
                                if (generationInfo == null) {
                                    this.L$0 = null;
                                    this.label = 1;
                                    access$generateNewPagingSource2 = PageFetcher.access$generateNewPagingSource(pageFetcher, null, this);
                                    if (access$generateNewPagingSource2 != coroutineSingletons2) {
                                        generationInfo2 = null;
                                        PagingSource pagingSource5 = (PagingSource) access$generateNewPagingSource2;
                                        PagingConfig pagingConfig2 = pageFetcher.config;
                                        break;
                                    }
                                } else {
                                    PagingSource pagingSource6 = generationInfo.snapshot.pagingSource;
                                    this.L$0 = generationInfo;
                                    this.L$1 = pageFetcher$LoadRequest$Refresh;
                                    this.label = 2;
                                    access$generateNewPagingSource = PageFetcher.access$generateNewPagingSource(pageFetcher, pagingSource6, this);
                                    break;
                                }
                            } else if (generationInfo != null) {
                                PageFetcherSnapshot pageFetcherSnapshot = generationInfo.snapshot;
                                LoadType loadType = pageFetcher$LoadRequest$Refresh.loadType;
                                this.L$0 = generationInfo;
                                this.label = 6;
                                if (pageFetcherSnapshot.forceSetHint(loadType, this) != coroutineSingletons2) {
                                    break;
                                }
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("Append or Prepend request should be sent after a Refresh. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                                break;
                            }
                            break;
                        case 1:
                            PageFetcher.GenerationInfo generationInfo3 = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            generationInfo2 = generationInfo3;
                            access$generateNewPagingSource2 = obj;
                            PagingSource pagingSource52 = (PagingSource) access$generateNewPagingSource2;
                            PagingConfig pagingConfig22 = pageFetcher.config;
                            break;
                        case 2:
                            pageFetcher$LoadRequest$Refresh = (PageFetcher$LoadRequest$Refresh) this.L$1;
                            generationInfo = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            access$generateNewPagingSource = obj;
                            PageFetcher$LoadRequest$Refresh pageFetcher$LoadRequest$Refresh3 = pageFetcher$LoadRequest$Refresh;
                            pagingSource = (PagingSource) access$generateNewPagingSource;
                            ref$ObjectRef = new Ref$ObjectRef();
                            PageFetcherSnapshot pageFetcherSnapshot2 = generationInfo.snapshot;
                            this.L$0 = generationInfo;
                            this.L$1 = pageFetcher$LoadRequest$Refresh3;
                            this.L$2 = pagingSource;
                            this.L$3 = ref$ObjectRef;
                            this.L$4 = ref$ObjectRef;
                            this.label = 3;
                            currentPagingState = pageFetcherSnapshot2.currentPagingState(this);
                            if (currentPagingState != coroutineSingletons2) {
                                pageFetcher$LoadRequest$Refresh2 = pageFetcher$LoadRequest$Refresh3;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef2.element = currentPagingState;
                                if (((PagingState) ref$ObjectRef.element).pages.isEmpty() && (pagingState = generationInfo.cachedInitialState) != null && (list = pagingState.pages) != null && (!list.isEmpty())) {
                                    ref$ObjectRef.element = generationInfo.cachedInitialState;
                                }
                                if (((PagingState) ref$ObjectRef.element).anchorPosition == null) {
                                    PagingState pagingState2 = generationInfo.cachedInitialState;
                                    if ((pagingState2 != null ? pagingState2.anchorPosition : null) != null) {
                                        ref$ObjectRef.element = pagingState2;
                                    }
                                }
                                if (!Intrinsics.areEqual(pageFetcher$LoadRequest$Refresh2.f905type, PageFetcher$RefreshType$All.INSTANCE$1) || (((PagingState) ref$ObjectRef.element).pages.isEmpty() && ((PagingState) ref$ObjectRef.element).anchorPosition == null)) {
                                    refreshKey = pagingSource.getRefreshKey((PagingState) ref$ObjectRef.element);
                                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                        Log.d("Paging", "Refresh key " + refreshKey + " returned from PagingSource " + pagingSource, null);
                                    }
                                    pair = new Pair(refreshKey, new Integer(pagingConfig.initialLoadSize));
                                    ref$ObjectRef3 = ref$ObjectRef;
                                    pagingSource2 = pagingSource;
                                    int intValue = ((Number) pair.second).intValue();
                                    generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                                    generationInfo.job.cancel(null);
                                    break;
                                } else {
                                    FlowExtKt flowExtKt = pageFetcher$LoadRequest$Refresh2.f905type;
                                    if (flowExtKt instanceof PageFetcher$RefreshType$Item) {
                                        Iterator it2 = ((PagingState) ref$ObjectRef.element).pages.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next = it2.next();
                                                obj2 = null;
                                                if (CollectionsKt.contains(((PagingSource.LoadResult.Page) next).data, null)) {
                                                    obj3 = next;
                                                }
                                            } else {
                                                obj2 = null;
                                                obj3 = null;
                                            }
                                        }
                                        PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) obj3;
                                        if (page == null) {
                                            StringBuilder sb = new StringBuilder("Invalid Refresh item. Item ");
                                            sb.append(obj2);
                                            sb.append(" not found in ");
                                            Iterator it3 = ((PagingState) ref$ObjectRef.element).pages.iterator();
                                            int i7 = 0;
                                            while (it3.hasNext()) {
                                                i7 += ((PagingSource.LoadResult.Page) it3.next()).data.size();
                                            }
                                            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i7, " loaded items.", sb));
                                            break;
                                        } else {
                                            PageFetcherSnapshot pageFetcherSnapshot3 = generationInfo.snapshot;
                                            this.L$0 = generationInfo;
                                            this.L$1 = pagingSource;
                                            this.L$2 = ref$ObjectRef;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.label = 4;
                                            loadKey$paging_common2 = pageFetcherSnapshot3.getLoadKey$paging_common(page, this);
                                            if (loadKey$paging_common2 != coroutineSingletons2) {
                                                pagingSource4 = pagingSource;
                                                obj4 = null;
                                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                    Log.d("Paging", "Refresh key " + loadKey$paging_common2 + " based around item " + obj4, null);
                                                }
                                                pair = new Pair(loadKey$paging_common2, new Integer(pagingConfig.initialLoadSize));
                                                ref$ObjectRef3 = ref$ObjectRef;
                                                pagingSource2 = pagingSource4;
                                                int intValue2 = ((Number) pair.second).intValue();
                                                generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                                                generationInfo.job.cancel(null);
                                            }
                                        }
                                    } else if (!Intrinsics.areEqual(flowExtKt, PageFetcher$RefreshType$All.INSTANCE)) {
                                        a$$ExternalSyntheticBUOutline0.m$1("should not get here");
                                        break;
                                    } else {
                                        PageFetcherSnapshot pageFetcherSnapshot4 = generationInfo.snapshot;
                                        PagingSource.LoadResult.Page page2 = (PagingSource.LoadResult.Page) CollectionsKt.first(((PagingState) ref$ObjectRef.element).pages);
                                        this.L$0 = generationInfo;
                                        this.L$1 = pagingSource;
                                        this.L$2 = ref$ObjectRef;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.label = 5;
                                        loadKey$paging_common = pageFetcherSnapshot4.getLoadKey$paging_common(page2, this);
                                        if (loadKey$paging_common != coroutineSingletons2) {
                                            ref$ObjectRef4 = ref$ObjectRef;
                                            pagingSource3 = pagingSource;
                                            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                Log.d("Paging", "Refresh key " + loadKey$paging_common + " from first item " + CollectionsKt.first((Iterable) CollectionsKt.first(((PagingState) ref$ObjectRef4.element).pages)), null);
                                            }
                                            it = ((PagingState) ref$ObjectRef4.element).pages.iterator();
                                            int i8 = 0;
                                            while (it.hasNext()) {
                                                i8 += ((PagingSource.LoadResult.Page) it.next()).data.size();
                                            }
                                            ref$ObjectRef3 = ref$ObjectRef4;
                                            pagingSource2 = pagingSource3;
                                            pair = new Pair(loadKey$paging_common, new Integer(i8));
                                            int intValue22 = ((Number) pair.second).intValue();
                                            generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                                            generationInfo.job.cancel(null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.L$4;
                            Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.L$3;
                            pagingSource = (PagingSource) this.L$2;
                            PageFetcher$LoadRequest$Refresh pageFetcher$LoadRequest$Refresh4 = (PageFetcher$LoadRequest$Refresh) this.L$1;
                            PageFetcher.GenerationInfo generationInfo4 = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            pageFetcher$LoadRequest$Refresh2 = pageFetcher$LoadRequest$Refresh4;
                            ref$ObjectRef2 = ref$ObjectRef5;
                            ref$ObjectRef = ref$ObjectRef6;
                            generationInfo = generationInfo4;
                            currentPagingState = obj;
                            ref$ObjectRef2.element = currentPagingState;
                            if (((PagingState) ref$ObjectRef.element).pages.isEmpty()) {
                                ref$ObjectRef.element = generationInfo.cachedInitialState;
                                break;
                            }
                            if (((PagingState) ref$ObjectRef.element).anchorPosition == null) {
                            }
                            if (!Intrinsics.areEqual(pageFetcher$LoadRequest$Refresh2.f905type, PageFetcher$RefreshType$All.INSTANCE$1)) {
                                break;
                            }
                            refreshKey = pagingSource.getRefreshKey((PagingState) ref$ObjectRef.element);
                            if (Build.ID != null) {
                                Log.d("Paging", "Refresh key " + refreshKey + " returned from PagingSource " + pagingSource, null);
                                break;
                            }
                            pair = new Pair(refreshKey, new Integer(pagingConfig.initialLoadSize));
                            ref$ObjectRef3 = ref$ObjectRef;
                            pagingSource2 = pagingSource;
                            int intValue222 = ((Number) pair.second).intValue();
                            generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                            generationInfo.job.cancel(null);
                            break;
                        case 4:
                            obj4 = this.L$3;
                            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                            pagingSource4 = (PagingSource) this.L$1;
                            PageFetcher.GenerationInfo generationInfo5 = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            generationInfo = generationInfo5;
                            loadKey$paging_common2 = obj;
                            if (Build.ID != null) {
                                Log.d("Paging", "Refresh key " + loadKey$paging_common2 + " based around item " + obj4, null);
                                break;
                            }
                            pair = new Pair(loadKey$paging_common2, new Integer(pagingConfig.initialLoadSize));
                            ref$ObjectRef3 = ref$ObjectRef;
                            pagingSource2 = pagingSource4;
                            int intValue2222 = ((Number) pair.second).intValue();
                            generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                            generationInfo.job.cancel(null);
                            break;
                        case 5:
                            ref$ObjectRef4 = (Ref$ObjectRef) this.L$2;
                            pagingSource3 = (PagingSource) this.L$1;
                            PageFetcher.GenerationInfo generationInfo6 = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            generationInfo = generationInfo6;
                            loadKey$paging_common = obj;
                            if (Build.ID != null) {
                                Log.d("Paging", "Refresh key " + loadKey$paging_common + " from first item " + CollectionsKt.first((Iterable) CollectionsKt.first(((PagingState) ref$ObjectRef4.element).pages)), null);
                                break;
                            }
                            it = ((PagingState) ref$ObjectRef4.element).pages.iterator();
                            int i82 = 0;
                            while (it.hasNext()) {
                            }
                            ref$ObjectRef3 = ref$ObjectRef4;
                            pagingSource2 = pagingSource3;
                            pair = new Pair(loadKey$paging_common, new Integer(i82));
                            int intValue22222 = ((Number) pair.second).intValue();
                            generationInfo.snapshot.pageEventChannelFlowJob.cancel(null);
                            generationInfo.job.cancel(null);
                            break;
                        case 6:
                            PageFetcher.GenerationInfo generationInfo7 = (PageFetcher.GenerationInfo) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            break;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                    }
                case 1:
                    FilterGroup filterGroup = (FilterGroup) this.L$4;
                    FlowCollector flowCollector = (FlowCollector) this.L$3;
                    Object obj6 = this.L$2;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FilterDetails.Subfilters subfilters = (FilterDetails.Subfilters) obj6;
                        List list2 = subfilters.mapNodes;
                        ArrayList arrayList = new ArrayList();
                        Iterator it4 = ((FilterConfiguration.SubFilters) this.L$1).subFilterSelections.entrySet().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                if (arrayList.isEmpty()) {
                                    FilterToken filterToken = filterGroup.token;
                                    ColorModel colorModel = (ColorModel) this.L$0;
                                    String str = filterGroup.name;
                                    Flow appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new InvestingFilterPillViewModel(filterToken, colorModel, null, str, 0, str), 19);
                                    coroutineSingletons = coroutineSingletons3;
                                    realShareableAssetsManager$download$lambda$0$$inlined$map$1 = appLockMonitor$special$$inlined$map$2;
                                    i = 1;
                                } else {
                                    List<SyncInvestmentFilterGroup.SubfilterOption> sortedWith = CollectionsKt.sortedWith(arrayList, new RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1(list2, 1));
                                    SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = new SyncInvestmentFilterGroup.CategoryMapNode(list2);
                                    for (SyncInvestmentFilterGroup.SubfilterOption subfilterOption : sortedWith) {
                                        Iterator it5 = categoryMapNode.sub_nodes.iterator();
                                        Object obj7 = null;
                                        boolean z = false;
                                        while (true) {
                                            if (it5.hasNext()) {
                                                Object next2 = it5.next();
                                                if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) next2).option_token, subfilterOption.token)) {
                                                    if (z) {
                                                        a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                                                        break;
                                                    } else {
                                                        obj7 = next2;
                                                        z = true;
                                                    }
                                                }
                                            } else if (!z) {
                                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                                break;
                                            } else {
                                                categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj7;
                                            }
                                        }
                                    }
                                    String str2 = categoryMapNode.category_token;
                                    str2.getClass();
                                    i = 1;
                                    CardPreviewPresenter$cashtag$$inlined$map$1 cardPreviewPresenter$cashtag$$inlined$map$1 = new CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt.take(((InvestingSearchPresenter) obj5).categoryBackend.categoryDetails(new CategoryToken(str2)), 1), 5);
                                    coroutineSingletons = coroutineSingletons3;
                                    realShareableAssetsManager$download$lambda$0$$inlined$map$1 = new RealShareableAssetsManager$download$lambda$0$$inlined$map$1(cardPreviewPresenter$cashtag$$inlined$map$1, arrayList, filterGroup, (ColorModel) this.L$0, 6);
                                }
                                this.L$3 = null;
                                this.L$2 = null;
                                this.label = i;
                                if (FlowKt.emitAll(flowCollector, realShareableAssetsManager$download$lambda$0$$inlined$map$1, this) == coroutineSingletons) {
                                    break;
                                }
                            } else {
                                Map.Entry entry = (Map.Entry) it4.next();
                                String str3 = (String) entry.getKey();
                                String str4 = (String) entry.getValue();
                                List list3 = subfilters.subfilters;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj8 : list3) {
                                    if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.Subfilter) obj8).token, str3)) {
                                        arrayList2.add(obj8);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    for (SyncInvestmentFilterGroup.SubfilterOption subfilterOption2 : ((SyncInvestmentFilterGroup.Subfilter) it6.next()).options) {
                                        if (Intrinsics.areEqual(subfilterOption2.token, str4)) {
                                            break;
                                        }
                                    }
                                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                    break;
                                }
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
                            }
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    final MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.L$1;
                    PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                    MutableState mutableState = (MutableState) this.L$4;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$3;
                    Object obj9 = this.L$2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Triple triple = (Triple) obj9;
                        final String str5 = (String) triple.first;
                        CryptoPaymentManager.SelectedRecipient selectedRecipient = (CryptoPaymentManager.SelectedRecipient) triple.second;
                        final boolean booleanValue = ((Boolean) triple.third).booleanValue();
                        mutableState.setValue(Boolean.TRUE);
                        if (mainPayment.isFiatPayment) {
                            RealRecipientRepository realRecipientRepository = mainPaymentPresenter.repository;
                            UUID uuid = mainPayment.paymentToken;
                            Profile profile = (Profile) ((State) this.L$0).getValue();
                            if (profile == null || (region = profile.region) == null) {
                                region = Region.USA;
                            }
                            final Flow search$default = RealRecipientRepository.search$default(realRecipientRepository, str5, mainPayment.orientation, uuid, region, null, 15996);
                            final MutableState mutableState2 = (MutableState) this.L$4;
                            final MutableState mutableState3 = (MutableState) obj5;
                            final State state = (State) this.L$0;
                            Flow flow2 = new Flow() { // from class: com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$61$0$$inlined$map$1

                                /* renamed from: com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$61$0$$inlined$map$1$2, reason: invalid class name */
                                public final class AnonymousClass2 implements FlowCollector {
                                    public final /* synthetic */ boolean $hideSections$inlined;
                                    public final /* synthetic */ State $profile$delegate$inlined;
                                    public final /* synthetic */ String $query$inlined;
                                    public final /* synthetic */ MutableState $selectedRecipients$delegate$inlined;
                                    public final /* synthetic */ MutableState $showLoadingIndicator$delegate$inlined;
                                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                                    public final /* synthetic */ MainPaymentPresenter this$0;

                                    /* renamed from: com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$61$0$$inlined$map$1$2$1, reason: invalid class name */
                                    public final class AnonymousClass1 extends ContinuationImpl {
                                        public int label;
                                        public /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= PKIFailureInfo.systemUnavail;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector, String str, MainPaymentPresenter mainPaymentPresenter, boolean z, MutableState mutableState, MutableState mutableState2, State state) {
                                        this.$this_unsafeFlow = flowCollector;
                                        this.$query$inlined = str;
                                        this.this$0 = mainPaymentPresenter;
                                        this.$hideSections$inlined = z;
                                        this.$showLoadingIndicator$delegate$inlined = mutableState;
                                        this.$selectedRecipients$delegate$inlined = mutableState2;
                                        this.$profile$delegate$inlined = state;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                                    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        int i;
                                        Object mapSectionsToViewModels$default;
                                        Object obj2;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i2 = anonymousClass1.label;
                                            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i2 - PKIFailureInfo.systemUnavail;
                                                Object obj3 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj3);
                                                    List list = ((RecipientRepository$Result) obj).sections;
                                                    String str = this.$query$inlined;
                                                    int length = str.length();
                                                    MainPaymentPresenter mainPaymentPresenter = this.this$0;
                                                    if (length > 0 && mainPaymentPresenter.searchFlowToken == null) {
                                                        mainPaymentPresenter.searchFlowToken = RealUuidGenerator.generate().toString();
                                                    }
                                                    this.$showLoadingIndicator$delegate$inlined.setValue(Boolean.FALSE);
                                                    if (str.length() > 0 && mainPaymentPresenter.searchQueryStartTimestamp != null) {
                                                        Iterator it = list.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = it.next();
                                                            if (((Section) obj2).f1192type == Section.Type.RESULTS) {
                                                                break;
                                                            }
                                                        }
                                                        Section section = (Section) obj2;
                                                        if (section != null) {
                                                            Recipient recipient = (Recipient) CollectionsKt.firstOrNull(section.recipients);
                                                            Recipient.Analytics analytics = recipient != null ? recipient.analytics : null;
                                                            Analytics analytics2 = mainPaymentPresenter.analytics;
                                                            String uuid = mainPaymentPresenter.args.paymentToken.toString();
                                                            uuid.getClass();
                                                            RecipientSearchLatencyMeasurement.Origin origin = RecipientSearchLatencyMeasurement.Origin.AMOUNT_FIRST;
                                                            analytics2.track(new RecipientSearchLatencyMeasurement(uuid, Integer.valueOf(str.length()), analytics != null ? analytics.queryToken : null, mainPaymentPresenter.searchQueryStartTimestamp, new Long(mainPaymentPresenter.clock.millis())), null);
                                                            mainPaymentPresenter.searchQueryStartTimestamp = null;
                                                        }
                                                    }
                                                    if (this.$hideSections$inlined) {
                                                        mapSectionsToViewModels$default = EmptyList.INSTANCE;
                                                    } else {
                                                        List list2 = CollectionsKt.toList(((Map) this.$selectedRecipients$delegate$inlined.getValue()).keySet());
                                                        Profile profile = (Profile) this.$profile$delegate$inlined.getValue();
                                                        mapSectionsToViewModels$default = UriKt.mapSectionsToViewModels$default(list, list2, profile != null ? profile.region : null, mainPaymentPresenter.stringManager);
                                                    }
                                                    anonymousClass1.label = 1;
                                                    if (this.$this_unsafeFlow.emit(mapSectionsToViewModels$default, anonymousClass1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        return null;
                                                    }
                                                    SafeTrace.throwOnFailure(obj3);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj32 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.Flow
                                public final Object collect(FlowCollector flowCollector3, Continuation continuation2) {
                                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector3, str5, mainPaymentPresenter, booleanValue, mutableState2, mutableState3, state), continuation2);
                                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                                }
                            };
                            str5 = str5;
                            flow = flow2;
                        } else {
                            mutableState.setValue(Boolean.FALSE);
                            flow = new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, i3);
                        }
                        this.L$3 = null;
                        this.L$2 = null;
                        this.label = 1;
                        FlowKt.ensureActive(flowCollector2);
                        Object collect = flow.collect(new CardSchemePresenter$toHeroModule$3$1$1(flowCollector2, selectedRecipient, str5, mainPaymentPresenter, (MutableState) obj5), this);
                        if (collect != coroutineSingletons4) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect != coroutineSingletons4) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons4) {
                            break;
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) this.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) this.L$3;
                    Object obj10 = this.L$2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String str6 = (String) obj10;
                        if (str6.length() > 0 && paymentConfigurationPresenter.searchFlowToken == null) {
                            paymentConfigurationPresenter.searchFlowToken = RealUuidGenerator.generate().toString();
                        }
                        MutableState mutableState4 = (MutableState) this.L$0;
                        mutableState4.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState4.getValue(), null, null, null, false, false, false, null, (String) ((StateFlowImpl) ((MutableStateFlow) this.L$4)).getValue(), true, null, false, false, null, null, null, null, null, null, false, 16774655));
                        RealRecipientRepository realRecipientRepository2 = paymentConfigurationPresenter.recipientRepository;
                        SelectRegion selectRegion = (SelectRegion) ((State) obj5).getValue();
                        Flow search$default2 = RealRecipientRepository.search$default(realRecipientRepository2, str6, paymentConfigurationPresenter.args.orientation, null, selectRegion != null ? selectRegion.region : null, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new CashQrScannerPresenter$special$$inlined$filter$1(paymentConfigurationPresenter.clipboardObserver.observeClipboard(), i6), 24), 3836);
                        this.L$3 = null;
                        this.L$2 = null;
                        this.label = 1;
                        if (FlowKt.emitAll(flowCollector3, search$default2, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    FlowCollector flowCollector4 = (FlowCollector) this.L$3;
                    Object obj11 = this.L$2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i4, new SafeFlow(new RealPayDataLoader$fetchData$1((RealPayDataLoader) this.L$1, (MerchantIdentifier) this.L$4, ((RealPayDataLoader.Identity) this.L$0).teamMemberId, (Continuation) null)), new MulticastedPagingData$asPagingData$2((AtomicBoolean) obj5, continuation, i5));
                        this.L$3 = null;
                        this.L$2 = null;
                        this.label = 1;
                        if (FlowKt.emitAll(flowCollector4, flowKt__MergeKt$flatMapMerge$$inlined$map$1, this) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageFetcher pageFetcher, Continuation continuation) {
            super(3, continuation);
            this.$r8$classId = 0;
            this.this$0 = pageFetcher;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageFetcher$flow$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
