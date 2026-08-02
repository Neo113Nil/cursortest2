package androidx.compose.material3;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.InputEvent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoEncoderSession;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.emoji2.text.MetadataRepo;
import androidx.glance.appwidget.AppWidgetId;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2;
import androidx.navigation.NavBackStackEntry;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.paging.ChannelFlowCollector;
import androidx.paging.CombinedLoadStates;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.HintHandler;
import androidx.paging.HintReceiver;
import androidx.paging.LoadStates;
import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PageStore;
import androidx.paging.PagingData;
import androidx.paging.SimpleProducerScopeImpl;
import androidx.paging.SingleRunner$Holder;
import androidx.paging.TransformablePage;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import androidx.room.InvalidationTracker;
import androidx.room.ObserverWrapper;
import androidx.room.coroutines.Pool;
import app.cash.api.ApiResult;
import app.cash.badging.backend.InternalBadger;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.BuyerIntentSyncManager$$ExternalSyntheticLambda2;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.backend.real.RealBuyerIntentManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.PaymentMethod;
import app.cash.local.screens.app.HasAttributionKeyScreenScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.molecule.RecompositionMode;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.size.DimensionKt;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.badging.db.BadgeQueries$badgesToClear$2;
import com.squareup.cash.badging.db.BadgesToClear;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.protos.cash.badging.api.BadgingApp;
import com.squareup.protos.cash.badging.api.BatchClearBadgeClientRequest;
import com.squareup.protos.cash.badging.api.ClearBadgeClientRequest;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesRequest;
import com.squareup.protos.cash.local.client.app.v1.ListMarketingMessagesResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessage;
import com.squareup.protos.cash.local.client.app.v1.UpdateEarningCardRequest;
import com.squareup.protos.cash.local.client.v1.GetEditorialRequest;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class SliderState$drag$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public Object $dragPriority;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderState$drag$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$dragPriority = obj2;
        this.$block = obj3;
    }

    private final Object invokeSuspend$app$cash$local$presenters$RealOrderBuilder$models$1$1(Object obj) {
        RealOrderBuilder realOrderBuilder;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ArrayList arrayList = (ArrayList) this.$dragPriority;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((PaymentMethod) it.next()).getPaymentOption() == LocalPaymentOption.LOCAL_PAYMENT_OPTION_GOOGLE_PAY) {
                        RealOrderBuilder realOrderBuilder2 = (RealOrderBuilder) this.$block;
                        MetadataRepo metadataRepo = realOrderBuilder2.googlePayPaymentsClient;
                        this.this$0 = realOrderBuilder2;
                        this.label = 1;
                        Object isReadyToPay = metadataRepo.isReadyToPay(this);
                        if (isReadyToPay == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = isReadyToPay;
                        realOrderBuilder = realOrderBuilder2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        realOrderBuilder = (RealOrderBuilder) this.this$0;
        SafeTrace.throwOnFailure(obj);
        realOrderBuilder.googlePayReadyToPay$delegate.setValue((Boolean) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r5, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$app$cash$local$presenters$brand$orders$LocalOrderStatusPresenter$models$6$1(Object obj) {
        OrderStatus orderStatus;
        MutableState mutableState = (MutableState) this.$block;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            orderStatus = (OrderStatus) this.this$0;
            if (orderStatus.currentStatusIndex != CollectionsKt__CollectionsKt.getLastIndex(orderStatus.statuses)) {
            }
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
            RealLocalOrderRepository realLocalOrderRepository = ((LocalOrderStatusPresenter) this.$dragPriority).localOrderRepository;
            String str = ((LocalOrder) mutableState.getValue()).token;
            str.getClass();
            this.label = 2;
            obj = realLocalOrderRepository.m1206getOrderh2CDXeg(str, this);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            LocalOrder localOrder = (LocalOrder) obj;
            if (localOrder != null) {
                mutableState.setValue(localOrder);
            }
            orderStatus = (OrderStatus) this.this$0;
            if (orderStatus.currentStatusIndex != CollectionsKt__CollectionsKt.getLastIndex(orderStatus.statuses)) {
                return Unit.INSTANCE;
            }
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
            this.label = 1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i) {
            case 0:
                return new SliderState$drag$2((SliderState) this.this$0, (MutatePriority) this.$dragPriority, (Function2) obj2, continuation, 0);
            case 1:
                SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2((MutableInteractionSourceImpl) this.$dragPriority, (FloatingActionButtonElevationAnimatable) obj2, continuation, 1);
                sliderState$drag$2.this$0 = obj;
                return sliderState$drag$2;
            case 2:
                return new SliderState$drag$2((MutableStateFlow) this.$dragPriority, (TooltipStateImpl) obj2, continuation, 2);
            case 3:
                return new SliderState$drag$2((CashQrWidget) this.this$0, (Context) this.$dragPriority, (AppWidgetId) obj2, continuation, 3);
            case 4:
                SliderState$drag$2 sliderState$drag$22 = new SliderState$drag$2((Function2) obj2, (DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.$dragPriority, continuation);
                sliderState$drag$22.this$0 = obj;
                return sliderState$drag$22;
            case 5:
                return new SliderState$drag$2((CoroutineContext) this.this$0, (Flow) this.$dragPriority, (ProduceStateScope) obj2, continuation, 5);
            case 6:
                return new SliderState$drag$2((SeekableTransitionState) this.this$0, (MutableState) this.$dragPriority, (MutableFloatState) obj2, continuation, 6);
            case 7:
                SliderState$drag$2 sliderState$drag$23 = new SliderState$drag$2((JWECryptoParts) obj2, continuation, 7);
                sliderState$drag$23.$dragPriority = obj;
                return sliderState$drag$23;
            case 8:
                SliderState$drag$2 sliderState$drag$24 = new SliderState$drag$2((JobImpl) this.$dragPriority, (FlowExtKt$simpleScan$1) obj2, continuation, 8);
                sliderState$drag$24.this$0 = obj;
                return sliderState$drag$24;
            case 9:
                SliderState$drag$2 sliderState$drag$25 = new SliderState$drag$2((Function3) this.$dragPriority, (ChannelFlowCollector) obj2, continuation, 9);
                sliderState$drag$25.this$0 = obj;
                return sliderState$drag$25;
            case 10:
                SliderState$drag$2 sliderState$drag$26 = new SliderState$drag$2((BufferedChannel) this.$dragPriority, (PageFetcherSnapshot) obj2, continuation, 10);
                sliderState$drag$26.this$0 = obj;
                return sliderState$drag$26;
            case 11:
                return new SliderState$drag$2((PageEvent) this.this$0, (LazyPagingItems$pagingDataPresenter$1) this.$dragPriority, (PagingData) obj2, continuation, 11);
            case 12:
                SliderState$drag$2 sliderState$drag$27 = new SliderState$drag$2((BufferedChannel) this.$dragPriority, (Function2) obj2, continuation, 12);
                sliderState$drag$27.this$0 = obj;
                return sliderState$drag$27;
            case 13:
                SliderState$drag$2 sliderState$drag$28 = new SliderState$drag$2((HintHandler) this.$dragPriority, (Function1) obj2, continuation, 13);
                sliderState$drag$28.this$0 = obj;
                return sliderState$drag$28;
            case 14:
                return new SliderState$drag$2((MeasurementManagerFutures$Api33Ext5JavaImpl) this.this$0, (Uri) this.$dragPriority, (InputEvent) obj2, continuation, 14);
            case 15:
                return new SliderState$drag$2((String[]) this.$dragPriority, (VideoEncoderSession) obj2, continuation, 15);
            case 16:
                return new SliderState$drag$2((Ref$ObjectRef) this.$dragPriority, (Pool) obj2, continuation, 16);
            case 17:
                return new SliderState$drag$2((RealBadger2) obj2, continuation, 17);
            case 18:
                SliderState$drag$2 sliderState$drag$29 = new SliderState$drag$2((Flow) this.$dragPriority, continuation, (UiCallbackModel) obj2, 18);
                sliderState$drag$29.this$0 = obj;
                return sliderState$drag$29;
            case 19:
                return new SliderState$drag$2((BuyerIntentSyncManager) this.this$0, (BuyerIntentScope) this.$dragPriority, (CartBuilder) obj2, continuation, 19);
            case 20:
                SliderState$drag$2 sliderState$drag$210 = new SliderState$drag$2((CalculateLineItemsManager) this.$dragPriority, (CartBuilder) obj2, continuation, 20);
                sliderState$drag$210.this$0 = obj;
                return sliderState$drag$210;
            case 21:
                SliderState$drag$2 sliderState$drag$211 = new SliderState$drag$2((RealMarketingMessageRepository) this.$dragPriority, (String) obj2, continuation, 21);
                sliderState$drag$211.this$0 = obj;
                return sliderState$drag$211;
            case 22:
                SliderState$drag$2 sliderState$drag$212 = new SliderState$drag$2((Flow) this.$dragPriority, continuation, (LocalEditorialPresenter) obj2, 22);
                sliderState$drag$212.this$0 = obj;
                return sliderState$drag$212;
            case 23:
                return new SliderState$drag$2((LocalCashBalancePresenter) this.this$0, (UpdateEarningCardRequest) this.$dragPriority, (MutableState) obj2, continuation, 23);
            case 24:
                return new SliderState$drag$2((LocalEditorialPresenter) this.this$0, (MutableState) this.$dragPriority, (MutableState) obj2, continuation, 24);
            case 25:
                return new SliderState$drag$2((RealBrandFollowPresenter) this.this$0, (BrandSpotSyncTokens) this.$dragPriority, (MutableState) obj2, continuation, 25);
            case 26:
                return new SliderState$drag$2((RealBrandFollowPresenter) this.this$0, (State) this.$dragPriority, (MutableState) obj2, continuation, 26);
            case 27:
                return new SliderState$drag$2((ArrayList) this.$dragPriority, (RealOrderBuilder) obj2, continuation, 27);
            case 28:
                return new SliderState$drag$2((OrderStatus) this.this$0, (LocalOrderStatusPresenter) this.$dragPriority, (MutableState) obj2, continuation, 28);
            default:
                SliderState$drag$2 sliderState$drag$213 = new SliderState$drag$2((Flow) this.$dragPriority, continuation, (LocalBrandProfilePresenter) obj2, 29);
                sliderState$drag$213.this$0 = obj;
                return sliderState$drag$213;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((SliderState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0250, code lost:
    
        if (r2.emit(r6, r5) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01fd, code lost:
    
        if (r7 == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01eb, code lost:
    
        if (r2.emit(null, r5) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x042a, code lost:
    
        if (r1 == r2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05d5, code lost:
    
        if (r1.onFinish(r6, r5) != r2) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05b1, code lost:
    
        if (r6 == r2) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x093e, code lost:
    
        if (r3 == r1) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x09fd, code lost:
    
        if (r1.collect(r2, r5) == r3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a0c, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r4, r5) == r3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0af2, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r0, r5) == r4) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0b0f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0add, code lost:
    
        if (r3.show(r0, r5) == r4) goto L495;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0853 A[LOOP:3: B:353:0x084d->B:355:0x0853, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:387:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0956  */
    /* JADX WARN: Type inference failed for: r6v35, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutineScope;
        AtomicReference atomicReference;
        FlowCollector flowCollector;
        Object stateAsEvents;
        Iterator it;
        PageEvent pageEvent;
        Iterator it2;
        LoadStates loadStates;
        Job job;
        Object tryEnqueue;
        Job job2;
        Set set;
        Object acquire;
        Ref$ObjectRef ref$ObjectRef;
        List executeAsList;
        Object batchClearBadgeClient;
        InternalBadger.ClearResult clearResult;
        MutableStateFlow orPutFulfillmentFlow;
        Object listMarketingMessages;
        Object obj2;
        Object editorial;
        AttributionKey attributionKey;
        SliderState$drag$2 sliderState$drag$2 = this;
        int i = 10;
        int i2 = 7;
        int i3 = 4;
        int i4 = 0;
        int i5 = 2;
        int i6 = 1;
        String str = null;
        switch (sliderState$drag$2.$r8$classId) {
            case 0:
                SliderState sliderState = (SliderState) sliderState$drag$2.this$0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = sliderState.isDragging$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = sliderState$drag$2.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    MutatorMutex mutatorMutex = sliderState.scrollMutex;
                    SliderState$dragScope$1 sliderState$dragScope$1 = sliderState.dragScope;
                    MutatePriority mutatePriority = (MutatePriority) sliderState$drag$2.$dragPriority;
                    Function2 function2 = (Function2) sliderState$drag$2.$block;
                    sliderState$drag$2.label = 1;
                    if (mutatorMutex.mutateWith(sliderState$dragScope$1, mutatePriority, function2, sliderState$drag$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = sliderState$drag$2.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) sliderState$drag$2.this$0;
                ArrayList arrayList = new ArrayList();
                SharedFlowImpl sharedFlowImpl = ((MutableInteractionSourceImpl) sliderState$drag$2.$dragPriority).interactions;
                SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(i6, arrayList, coroutineScope2, (FloatingActionButtonElevationAnimatable) sliderState$drag$2.$block);
                sliderState$drag$2.label = 1;
                sharedFlowImpl.collect(swipeableState$animateTo$2, sliderState$drag$2);
                return coroutineSingletons2;
            case 2:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) sliderState$drag$2.$dragPriority;
                TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) sliderState$drag$2.$block;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = sliderState$drag$2.label;
                try {
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool = Boolean.TRUE;
                        StateFlowImpl stateFlowImpl = (StateFlowImpl) mutableStateFlow;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, bool);
                        MutatePriority mutatePriority2 = MutatePriority.PreventUserInput;
                        sliderState$drag$2.label = 1;
                        break;
                    } else {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i9 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) sliderState$drag$2.this$0;
                            SafeTrace.throwOnFailure(obj);
                            throw th;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (tooltipStateImpl.isVisible()) {
                        RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$3 = new RealBadger2$scheduleBadgeClearingWork$3(tooltipStateImpl, (Continuation) null, i5);
                        sliderState$drag$2.label = 2;
                        break;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    if (!tooltipStateImpl.isVisible()) {
                        throw th2;
                    }
                    RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$32 = new RealBadger2$scheduleBadgeClearingWork$3(tooltipStateImpl, (Continuation) null, i5);
                    sliderState$drag$2.this$0 = th2;
                    sliderState$drag$2.label = 3;
                    if (FlowKt.collectLatest(mutableStateFlow, realBadger2$scheduleBadgeClearingWork$32, sliderState$drag$2) != coroutineSingletons3) {
                        throw th2;
                    }
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = sliderState$drag$2.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CashQrWidget cashQrWidget = (CashQrWidget) sliderState$drag$2.this$0;
                Context context = (Context) sliderState$drag$2.$dragPriority;
                sliderState$drag$2.label = 1;
                cashQrWidget.provideGlance(context, sliderState$drag$2);
                return coroutineSingletons4;
            case 4:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = sliderState$drag$2.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) sliderState$drag$2.this$0;
                    AtomicReference atomicReference2 = new AtomicReference(null);
                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1((Function2) sliderState$drag$2.$block, (DifferentialMotionFlingController$$ExternalSyntheticLambda0) sliderState$drag$2.$dragPriority, coroutineScope3, atomicReference2, (Continuation) null, 8);
                    sliderState$drag$2.this$0 = atomicReference2;
                    sliderState$drag$2.label = 1;
                    coroutineScope = JobKt.coroutineScope(realImageLoader$execute$result$1, sliderState$drag$2);
                    if (coroutineScope == obj3) {
                        return obj3;
                    }
                    atomicReference = atomicReference2;
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = (AtomicReference) sliderState$drag$2.this$0;
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope = obj;
                }
                Job job3 = (Job) atomicReference.get();
                if (job3 != null) {
                    job3.cancel(null);
                }
                return coroutineScope;
            case 5:
                ProduceStateScope produceStateScope = (ProduceStateScope) sliderState$drag$2.$block;
                Flow flow = (Flow) sliderState$drag$2.$dragPriority;
                CoroutineContext coroutineContext = (CoroutineContext) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = sliderState$drag$2.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
                        FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, i4);
                        sliderState$drag$2.label = 1;
                        break;
                    } else {
                        FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 flowExtKt$collectAsStateWithLifecycle$1$1$1$2 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(flow, produceStateScope, null, i4);
                        sliderState$drag$2.label = 2;
                        break;
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState = (MutableState) sliderState$drag$2.$dragPriority;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = sliderState$drag$2.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((List) mutableState.getValue()).size() > 1) {
                        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) ((List) mutableState.getValue()).get(((List) mutableState.getValue()).size() - 2);
                        SeekableTransitionState seekableTransitionState = (SeekableTransitionState) sliderState$drag$2.this$0;
                        float floatValue = ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) sliderState$drag$2.$block)).getFloatValue();
                        sliderState$drag$2.label = 1;
                        if (seekableTransitionState.seekTo(floatValue, navBackStackEntry, sliderState$drag$2) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
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
                JWECryptoParts jWECryptoParts = (JWECryptoParts) sliderState$drag$2.$block;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = sliderState$drag$2.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) sliderState$drag$2.$dragPriority;
                    HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) jWECryptoParts.header;
                    sliderState$drag$2.$dragPriority = flowCollector;
                    sliderState$drag$2.label = 1;
                    stateAsEvents = huffmanTreeGroup.getStateAsEvents(sliderState$drag$2);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) sliderState$drag$2.this$0;
                        flowCollector = (FlowCollector) sliderState$drag$2.$dragPriority;
                        SafeTrace.throwOnFailure(obj);
                        while (it.hasNext()) {
                            IndexedValue indexedValue = (IndexedValue) it.next();
                            sliderState$drag$2.$dragPriority = flowCollector;
                            sliderState$drag$2.this$0 = it;
                            sliderState$drag$2.label = 2;
                            if (flowCollector.emit(indexedValue, sliderState$drag$2) == obj4) {
                                return obj4;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) sliderState$drag$2.$dragPriority;
                    SafeTrace.throwOnFailure(obj);
                    stateAsEvents = obj;
                }
                ((StandaloneCoroutine) jWECryptoParts.cipherText).start();
                it = ((List) stateAsEvents).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = sliderState$drag$2.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleProducerScopeImpl simpleProducerScopeImpl = (SimpleProducerScopeImpl) sliderState$drag$2.this$0;
                    ((JobImpl) sliderState$drag$2.$dragPriority).invokeOnCompletion(new CachedPageEventFlow$$ExternalSyntheticLambda0(simpleProducerScopeImpl, 14));
                    FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = (FlowExtKt$simpleScan$1) sliderState$drag$2.$block;
                    sliderState$drag$2.label = 1;
                    if (flowExtKt$simpleScan$1.invoke(simpleProducerScopeImpl, sliderState$drag$2) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = sliderState$drag$2.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj5 = sliderState$drag$2.this$0;
                    Function3 function3 = (Function3) sliderState$drag$2.$dragPriority;
                    ChannelFlowCollector channelFlowCollector = (ChannelFlowCollector) sliderState$drag$2.$block;
                    sliderState$drag$2.label = 1;
                    if (function3.invoke(channelFlowCollector, obj5, sliderState$drag$2) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = sliderState$drag$2.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) sliderState$drag$2.this$0;
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow((BufferedChannel) sliderState$drag$2.$dragPriority);
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(9, (PageFetcherSnapshot) sliderState$drag$2.$block, coroutineScope4);
                    sliderState$drag$2.label = 1;
                    if (consumeAsFlow.collect(anonymousClass1, sliderState$drag$2) == coroutineSingletons9) {
                        return coroutineSingletons9;
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
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (sliderState$drag$2.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        PageEvent pageEvent2 = (PageEvent) sliderState$drag$2.this$0;
                        if (pageEvent2 instanceof PageEvent.StaticList) {
                            LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new TransformablePage(0, ((PageEvent.StaticList) pageEvent2).data));
                            ((PageEvent.StaticList) ((PageEvent) sliderState$drag$2.this$0)).getClass();
                            HintReceiver hintReceiver = ((PagingData) sliderState$drag$2.$block).hintReceiver;
                            sliderState$drag$2.label = 1;
                            sliderState$drag$2 = this;
                            if (LazyPagingItems$pagingDataPresenter$1.access$presentNewList(lazyPagingItems$pagingDataPresenter$1, listOf, 0, 0, false, null, null, hintReceiver, this) == coroutineSingletons10) {
                                return coroutineSingletons10;
                            }
                        } else {
                            boolean z = pageEvent2 instanceof PageEvent.Insert;
                            if (z) {
                                PageEvent.Insert insert = (PageEvent.Insert) pageEvent2;
                                if (insert.loadType == LoadType.REFRESH) {
                                    LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$12 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                    List list = insert.pages;
                                    int i18 = insert.placeholdersBefore;
                                    int i19 = insert.placeholdersAfter;
                                    LoadStates loadStates2 = insert.sourceLoadStates;
                                    LoadStates loadStates3 = insert.mediatorLoadStates;
                                    HintReceiver hintReceiver2 = ((PagingData) sliderState$drag$2.$block).hintReceiver;
                                    sliderState$drag$2.label = 2;
                                    sliderState$drag$2 = this;
                                    if (LazyPagingItems$pagingDataPresenter$1.access$presentNewList(lazyPagingItems$pagingDataPresenter$12, list, i18, i19, true, loadStates2, loadStates3, hintReceiver2, this) == coroutineSingletons10) {
                                        return coroutineSingletons10;
                                    }
                                }
                            }
                            if (z) {
                                if (((Boolean) ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).inGetItem.getValue()).booleanValue()) {
                                    sliderState$drag$2.label = 3;
                                    if (JobKt.yield(sliderState$drag$2) == coroutineSingletons10) {
                                        return coroutineSingletons10;
                                    }
                                }
                                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$13 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                lazyPagingItems$pagingDataPresenter$13.pageStore.processEvent((PageEvent) sliderState$drag$2.this$0);
                                sliderState$drag$2.label = 4;
                                LazyPagingItems lazyPagingItems = lazyPagingItems$pagingDataPresenter$13.this$0;
                                lazyPagingItems.itemSnapshotList$delegate.setValue(lazyPagingItems.pagingDataPresenter.snapshot());
                                if (Unit.INSTANCE == coroutineSingletons10) {
                                    return coroutineSingletons10;
                                }
                                SingleRunner$Holder singleRunner$Holder = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                                PageEvent.Insert insert2 = (PageEvent.Insert) ((PageEvent) sliderState$drag$2.this$0);
                                singleRunner$Holder.set(insert2.sourceLoadStates, insert2.mediatorLoadStates);
                                CombinedLoadStates combinedLoadStates = (CombinedLoadStates) ((ReadonlyStateFlow) ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection.previous).$$delegate_0.getValue();
                                loadStates = combinedLoadStates != null ? combinedLoadStates.source : null;
                                if (loadStates == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                                    return null;
                                }
                                boolean z2 = loadStates.prepend.endOfPaginationReached;
                                boolean z3 = loadStates.append.endOfPaginationReached;
                                PageEvent.Insert insert3 = (PageEvent.Insert) ((PageEvent) sliderState$drag$2.this$0);
                                LoadType loadType = insert3.loadType;
                                boolean z4 = ((loadType == LoadType.PREPEND && z2) || (loadType == LoadType.APPEND && z3)) ? false : true;
                                List list2 = insert3.pages;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!((TransformablePage) it3.next()).data.isEmpty()) {
                                                i6 = 0;
                                            }
                                        }
                                    }
                                }
                                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$14 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                if (!z4) {
                                    lazyPagingItems$pagingDataPresenter$14.lastAccessedIndexUnfulfilled = false;
                                } else if (lazyPagingItems$pagingDataPresenter$14.lastAccessedIndexUnfulfilled || i6 != 0) {
                                    if (i6 == 0) {
                                        int i20 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).lastAccessedIndex;
                                        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$15 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                        if (i20 >= lazyPagingItems$pagingDataPresenter$15.pageStore.placeholdersBefore) {
                                            int i21 = lazyPagingItems$pagingDataPresenter$15.lastAccessedIndex;
                                            LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$16 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                            PageStore pageStore = lazyPagingItems$pagingDataPresenter$16.pageStore;
                                            if (i21 <= pageStore.placeholdersBefore + pageStore.dataCount) {
                                                lazyPagingItems$pagingDataPresenter$16.lastAccessedIndexUnfulfilled = false;
                                            }
                                        }
                                    }
                                    LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$17 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                    HintReceiver hintReceiver3 = lazyPagingItems$pagingDataPresenter$17.hintReceiver;
                                    if (hintReceiver3 != null) {
                                        hintReceiver3.processHint(lazyPagingItems$pagingDataPresenter$17.pageStore.createAccessHintForIndex(lazyPagingItems$pagingDataPresenter$17.lastAccessedIndex));
                                    }
                                }
                            } else {
                                if (pageEvent2 instanceof PageEvent.Drop) {
                                    if (((Boolean) ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).inGetItem.getValue()).booleanValue()) {
                                        sliderState$drag$2.label = 5;
                                        if (JobKt.yield(sliderState$drag$2) == coroutineSingletons10) {
                                            return coroutineSingletons10;
                                        }
                                    }
                                    LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$18 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                                    lazyPagingItems$pagingDataPresenter$18.pageStore.processEvent((PageEvent) sliderState$drag$2.this$0);
                                    sliderState$drag$2.label = 6;
                                    LazyPagingItems lazyPagingItems2 = lazyPagingItems$pagingDataPresenter$18.this$0;
                                    lazyPagingItems2.itemSnapshotList$delegate.setValue(lazyPagingItems2.pagingDataPresenter.snapshot());
                                    if (Unit.INSTANCE == coroutineSingletons10) {
                                        return coroutineSingletons10;
                                    }
                                    SingleRunner$Holder singleRunner$Holder2 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                                    ((PageEvent.Drop) ((PageEvent) sliderState$drag$2.this$0)).getClass();
                                    singleRunner$Holder2.getClass();
                                    throw null;
                                }
                                if (pageEvent2 instanceof PageEvent.LoadStateUpdate) {
                                    PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent2;
                                    ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection.set(loadStateUpdate.source, loadStateUpdate.mediator);
                                }
                            }
                        }
                        pageEvent = (PageEvent) sliderState$drag$2.this$0;
                        if (!(pageEvent instanceof PageEvent.Insert) || (pageEvent instanceof PageEvent.Drop) || (pageEvent instanceof PageEvent.StaticList)) {
                            it2 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).onPagesUpdatedListeners.iterator();
                            while (it2.hasNext()) {
                                ((Function0) it2.next()).invoke();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        pageEvent = (PageEvent) sliderState$drag$2.this$0;
                        if (!(pageEvent instanceof PageEvent.Insert)) {
                            break;
                        }
                        it2 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).onPagesUpdatedListeners.iterator();
                        while (it2.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$132 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                        lazyPagingItems$pagingDataPresenter$132.pageStore.processEvent((PageEvent) sliderState$drag$2.this$0);
                        sliderState$drag$2.label = 4;
                        LazyPagingItems lazyPagingItems3 = lazyPagingItems$pagingDataPresenter$132.this$0;
                        lazyPagingItems3.itemSnapshotList$delegate.setValue(lazyPagingItems3.pagingDataPresenter.snapshot());
                        if (Unit.INSTANCE == coroutineSingletons10) {
                        }
                        SingleRunner$Holder singleRunner$Holder3 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                        PageEvent.Insert insert22 = (PageEvent.Insert) ((PageEvent) sliderState$drag$2.this$0);
                        singleRunner$Holder3.set(insert22.sourceLoadStates, insert22.mediatorLoadStates);
                        CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) ((ReadonlyStateFlow) ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection.previous).$$delegate_0.getValue();
                        if (combinedLoadStates2 != null) {
                        }
                        if (loadStates == null) {
                        }
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        SingleRunner$Holder singleRunner$Holder32 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                        PageEvent.Insert insert222 = (PageEvent.Insert) ((PageEvent) sliderState$drag$2.this$0);
                        singleRunner$Holder32.set(insert222.sourceLoadStates, insert222.mediatorLoadStates);
                        CombinedLoadStates combinedLoadStates22 = (CombinedLoadStates) ((ReadonlyStateFlow) ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection.previous).$$delegate_0.getValue();
                        if (combinedLoadStates22 != null) {
                        }
                        if (loadStates == null) {
                        }
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$182 = (LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority;
                        lazyPagingItems$pagingDataPresenter$182.pageStore.processEvent((PageEvent) sliderState$drag$2.this$0);
                        sliderState$drag$2.label = 6;
                        LazyPagingItems lazyPagingItems22 = lazyPagingItems$pagingDataPresenter$182.this$0;
                        lazyPagingItems22.itemSnapshotList$delegate.setValue(lazyPagingItems22.pagingDataPresenter.snapshot());
                        if (Unit.INSTANCE == coroutineSingletons10) {
                        }
                        SingleRunner$Holder singleRunner$Holder22 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                        ((PageEvent.Drop) ((PageEvent) sliderState$drag$2.this$0)).getClass();
                        singleRunner$Holder22.getClass();
                        throw null;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        SingleRunner$Holder singleRunner$Holder222 = ((LazyPagingItems$pagingDataPresenter$1) sliderState$drag$2.$dragPriority).combinedLoadStatesCollection;
                        ((PageEvent.Drop) ((PageEvent) sliderState$drag$2.this$0)).getClass();
                        singleRunner$Holder222.getClass();
                        throw null;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 12:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = sliderState$drag$2.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleProducerScopeImpl simpleProducerScopeImpl2 = new SimpleProducerScopeImpl((CoroutineScope) sliderState$drag$2.this$0, (BufferedChannel) sliderState$drag$2.$dragPriority);
                    Function2 function22 = (Function2) sliderState$drag$2.$block;
                    sliderState$drag$2.label = 1;
                    if (function22.invoke(simpleProducerScopeImpl2, sliderState$drag$2) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                SingleRunner$Holder singleRunner$Holder4 = (SingleRunner$Holder) ((HintHandler) sliderState$drag$2.$dragPriority).state;
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = sliderState$drag$2.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext.Element element = ((CoroutineScope) sliderState$drag$2.this$0).getCoroutineContext().get(Job.Key.$$INSTANCE);
                    if (element == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Internal error. coroutineScope should've created a job.");
                        return null;
                    }
                    job = (Job) element;
                    sliderState$drag$2.this$0 = job;
                    sliderState$drag$2.label = 1;
                    tryEnqueue = singleRunner$Holder4.tryEnqueue(job, sliderState$drag$2);
                    break;
                } else if (i23 == 1) {
                    job = (Job) sliderState$drag$2.this$0;
                    SafeTrace.throwOnFailure(obj);
                    tryEnqueue = obj;
                    Job job4 = job;
                    if (((Boolean) tryEnqueue).booleanValue()) {
                        try {
                            Function1 function1 = (Function1) sliderState$drag$2.$block;
                            sliderState$drag$2.this$0 = job4;
                            sliderState$drag$2.label = 2;
                            if (function1.invoke(sliderState$drag$2) != obj6) {
                                job2 = job4;
                                sliderState$drag$2.this$0 = null;
                                sliderState$drag$2.label = 3;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            job2 = job4;
                            sliderState$drag$2.this$0 = th;
                            sliderState$drag$2.label = 4;
                            if (singleRunner$Holder4.onFinish(job2, sliderState$drag$2) != obj6) {
                            }
                            return obj6;
                        }
                        return obj6;
                    }
                } else if (i23 == 2) {
                    job2 = (Job) sliderState$drag$2.this$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        sliderState$drag$2.this$0 = null;
                        sliderState$drag$2.label = 3;
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                        sliderState$drag$2.this$0 = th;
                        sliderState$drag$2.label = 4;
                        if (singleRunner$Holder4.onFinish(job2, sliderState$drag$2) != obj6) {
                            throw th;
                        }
                        return obj6;
                    }
                } else {
                    if (i23 != 3) {
                        if (i23 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th5 = (Throwable) sliderState$drag$2.this$0;
                        SafeTrace.throwOnFailure(obj);
                        throw th5;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = sliderState$drag$2.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AmountChangedSource amountChangedSource = ((MeasurementManagerFutures$Api33Ext5JavaImpl) sliderState$drag$2.this$0).mMeasurementManager;
                    Uri uri = (Uri) sliderState$drag$2.$dragPriority;
                    InputEvent inputEvent = (InputEvent) sliderState$drag$2.$block;
                    sliderState$drag$2.label = 1;
                    if (amountChangedSource.registerSource(uri, inputEvent, sliderState$drag$2) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                VideoEncoderSession videoEncoderSession = (VideoEncoderSession) sliderState$drag$2.$block;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = sliderState$drag$2.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String[] strArr = (String[]) sliderState$drag$2.$dragPriority;
                    Set set2 = ArraysKt___ArraysKt.toSet(Arrays.copyOf(strArr, strArr.length));
                    SharedFlowImpl sharedFlowImpl2 = (SharedFlowImpl) videoEncoderSession.mReleasedFuture;
                    sliderState$drag$2.this$0 = set2;
                    sliderState$drag$2.label = 1;
                    if (sharedFlowImpl2.emit(set2, sliderState$drag$2) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                    set = set2;
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) sliderState$drag$2.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                InvalidationTracker invalidationTracker = (InvalidationTracker) videoEncoderSession.mSequentialExecutor;
                set.getClass();
                ReentrantLock reentrantLock = invalidationTracker.observerMapLock;
                reentrantLock.lock();
                try {
                    List list3 = CollectionsKt.toList(invalidationTracker.observerMap.values());
                    reentrantLock.unlock();
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        ((ObserverWrapper) it4.next()).observer.getClass();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th6) {
                    reentrantLock.unlock();
                    throw th6;
                }
            case 16:
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = sliderState$drag$2.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) sliderState$drag$2.$dragPriority;
                    Pool pool = (Pool) sliderState$drag$2.$block;
                    sliderState$drag$2.this$0 = ref$ObjectRef2;
                    sliderState$drag$2.label = 1;
                    acquire = pool.acquire(sliderState$drag$2);
                    if (acquire == obj7) {
                        return obj7;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) sliderState$drag$2.this$0;
                    SafeTrace.throwOnFailure(obj);
                    acquire = obj;
                }
                ref$ObjectRef.element = acquire;
                return Unit.INSTANCE;
            case 17:
                RealBadger2 realBadger2 = (RealBadger2) sliderState$drag$2.$block;
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = sliderState$drag$2.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalTabContentQueries localTabContentQueries = realBadger2.badgeQueries;
                    localTabContentQueries.getClass();
                    BadgeQueries$badgesToClear$2 badgeQueries$badgesToClear$2 = BadgeQueries$badgesToClear$2.INSTANCE;
                    SqlDriver sqlDriver = localTabContentQueries.driver;
                    BadgeQueries$$ExternalSyntheticLambda5 badgeQueries$$ExternalSyntheticLambda5 = new BadgeQueries$$ExternalSyntheticLambda5(localTabContentQueries);
                    sqlDriver.getClass();
                    executeAsList = new SimpleQuery(-1614395987, new String[]{"badge"}, sqlDriver, "Badge.sq", "badgesToClear", "SELECT external_token, item_type, badge_version\nFROM badge\nWHERE cleared_at IS NOT NULL\nAND clear_succeeded_at IS NULL", badgeQueries$$ExternalSyntheticLambda5).executeAsList();
                    if (executeAsList.isEmpty()) {
                        return InternalBadger.ClearResult.Success;
                    }
                    BadgingApp badgingApp = realBadger2.appService;
                    List<BadgesToClear> list4 = executeAsList;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (BadgesToClear badgesToClear : list4) {
                        arrayList2.add(new ClearBadgeClientRequest(badgesToClear.external_token, badgesToClear.item_type, new Long(badgesToClear.badge_version), ByteString.EMPTY));
                    }
                    BatchClearBadgeClientRequest batchClearBadgeClientRequest = new BatchClearBadgeClientRequest(arrayList2, ByteString.EMPTY);
                    sliderState$drag$2.this$0 = executeAsList;
                    sliderState$drag$2.label = 1;
                    batchClearBadgeClient = badgingApp.batchClearBadgeClient(batchClearBadgeClientRequest, sliderState$drag$2);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        InternalBadger.ClearResult clearResult2 = (InternalBadger.ClearResult) sliderState$drag$2.$dragPriority;
                        SafeTrace.throwOnFailure(obj);
                        return clearResult2;
                    }
                    List list5 = (List) sliderState$drag$2.this$0;
                    SafeTrace.throwOnFailure(obj);
                    executeAsList = list5;
                    batchClearBadgeClient = obj;
                }
                ApiResult apiResult = (ApiResult) batchClearBadgeClient;
                if (apiResult instanceof ApiResult.Success) {
                    realBadger2.badgeQueries.transactionWithWrapper(new androidx.compose.material.MenuKt$$ExternalSyntheticLambda0(26, (ApiResult.Success) apiResult, realBadger2, executeAsList));
                    clearResult = InternalBadger.ClearResult.Success;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.w("Failed to remotely clear badges. Will try again later.", new Object[0]);
                    clearResult = InternalBadger.ClearResult.Retry;
                }
                SharedFlowImpl sharedFlowImpl3 = realBadger2.workCheckTrigger;
                Unit unit = Unit.INSTANCE;
                sliderState$drag$2.this$0 = null;
                sliderState$drag$2.$dragPriority = clearResult;
                sliderState$drag$2.label = 2;
                if (sharedFlowImpl3.emit(unit, sliderState$drag$2) != obj8) {
                    return clearResult;
                }
                return obj8;
            case 18:
                CoroutineScope coroutineScope5 = (CoroutineScope) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = sliderState$drag$2.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) sliderState$drag$2.$dragPriority;
                    HomeViewPresenter$models$$inlined$CollectEffect$1$1 homeViewPresenter$models$$inlined$CollectEffect$1$1 = new HomeViewPresenter$models$$inlined$CollectEffect$1$1(coroutineScope5, (UiCallbackModel) sliderState$drag$2.$block, i6);
                    sliderState$drag$2.this$0 = null;
                    sliderState$drag$2.label = 1;
                    if (flow2.collect(homeViewPresenter$models$$inlined$CollectEffect$1$1, sliderState$drag$2) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = sliderState$drag$2.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BuyerIntentSyncManager buyerIntentSyncManager = (BuyerIntentSyncManager) sliderState$drag$2.this$0;
                    BuyerIntentScope buyerIntentScope = (BuyerIntentScope) sliderState$drag$2.$dragPriority;
                    CartBuilder cartBuilder = (CartBuilder) sliderState$drag$2.$block;
                    buyerIntentScope.getClass();
                    cartBuilder.getClass();
                    RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealLocalInstalledStore$hideBrands$$inlined$map$1(BundleKt.moleculeFlow$default(new BuyerIntentSyncManager$$ExternalSyntheticLambda2(cartBuilder, i4)), i5));
                    Flow moleculeFlow$default = BundleKt.moleculeFlow$default(new BuyerIntentSyncManager$$ExternalSyntheticLambda2(cartBuilder, i6));
                    RealBuyerIntentManager realBuyerIntentManager = (RealBuyerIntentManager) buyerIntentSyncManager.buyerIntentManager;
                    synchronized (realBuyerIntentManager.lock) {
                        orPutFulfillmentFlow = RealBuyerIntentManager.getOrPutFulfillmentFlow(realBuyerIntentManager.fulfillmentConfigurations, buyerIntentScope);
                    }
                    Flow m4195debounceHG0u8IE = FlowKt.m4195debounceHG0u8IE(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.combine(distinctUntilChanged, moleculeFlow$default, orPutFulfillmentFlow, new AnchoredDraggableKt$snapTo$2(i3, null, i6)), 24), BuyerIntentSyncManager.debounceInterval);
                    Savers_androidKt$$ExternalSyntheticLambda0 savers_androidKt$$ExternalSyntheticLambda0 = new Savers_androidKt$$ExternalSyntheticLambda0(buyerIntentSyncManager, i);
                    SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = FlowKt.defaultKeySelector;
                    TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, savers_androidKt$$ExternalSyntheticLambda0);
                    Continuation continuation = null;
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new FlowExtKt$simpleScan$1(buyerIntentSyncManager, buyerIntentScope, cartBuilder, continuation, 29), FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(m4195debounceHG0u8IE, saversKt$$ExternalSyntheticLambda2, savers_androidKt$$ExternalSyntheticLambda0));
                    AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2((CartBuilder) sliderState$drag$2.$block, (BuyerIntentSyncManager) sliderState$drag$2.this$0, continuation, i2);
                    sliderState$drag$2.label = 1;
                    if (FlowKt.collectLatest(mapLatest, animatedImageDecoder$wrapDrawable$2, sliderState$drag$2) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CalculateLineItemsManager.Combination combination = (CalculateLineItemsManager.Combination) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = sliderState$drag$2.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = combination.flagEnablement;
                List list6 = combination.selections;
                List list7 = combination.discountCodes;
                FulfillmentConfiguration fulfillmentConfiguration = combination.fulfillmentConfiguration;
                if (featureFlag$EnabledDisabledFeatureFlag$Options != FeatureFlag$EnabledDisabledFeatureFlag$Options.Enabled) {
                    return CalculateLineItemsManager.CalculateLineItemsResult.FlagDisabled.INSTANCE;
                }
                CalculateLineItemsManager calculateLineItemsManager = (CalculateLineItemsManager) sliderState$drag$2.$dragPriority;
                BrandSpot brandSpot = ((RealCartBuilder) ((CartBuilder) sliderState$drag$2.$block)).brandSpot;
                sliderState$drag$2.this$0 = null;
                sliderState$drag$2.label = 1;
                Object access$performRequest = CalculateLineItemsManager.access$performRequest(calculateLineItemsManager, brandSpot, list6, list7, fulfillmentConfiguration, sliderState$drag$2);
                return access$performRequest == coroutineSingletons16 ? coroutineSingletons16 : access$performRequest;
            case 21:
                String str2 = (String) sliderState$drag$2.$block;
                RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) sliderState$drag$2.$dragPriority;
                FlowCollector flowCollector2 = (FlowCollector) sliderState$drag$2.this$0;
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = sliderState$drag$2.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sliderState$drag$2.this$0 = flowCollector2;
                    sliderState$drag$2.label = 1;
                    break;
                } else if (i31 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i31 != 2) {
                        if (i31 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    listMarketingMessages = obj;
                    ApiResult apiResult2 = (ApiResult) listMarketingMessages;
                    if (apiResult2 instanceof ApiResult.Success) {
                        List<MarketingMessage> list8 = ((ListMarketingMessagesResponse) ((ApiResult.Success) apiResult2).response).marketing_messages;
                        obj2 = new ArrayList();
                        for (MarketingMessage marketingMessage : list8) {
                            Parcelable.Creator<MarketingMessageData> creator = MarketingMessageData.CREATOR;
                            MarketingMessageData create = DimensionKt.create(marketingMessage, realMarketingMessageRepository.isBadgesEnabled());
                            if (create != null) {
                                obj2.add(create);
                            }
                        }
                    } else {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to fetch marketing messages for brand ", str2), new Object[0]);
                        obj2 = EmptyList.INSTANCE;
                    }
                    sliderState$drag$2.this$0 = null;
                    sliderState$drag$2.label = 3;
                    break;
                }
                LocalService localService = realMarketingMessageRepository.service;
                ListMarketingMessagesRequest listMarketingMessagesRequest = new ListMarketingMessagesRequest(str2, i5);
                sliderState$drag$2.this$0 = flowCollector2;
                sliderState$drag$2.label = 2;
                listMarketingMessages = localService.listMarketingMessages(listMarketingMessagesRequest, sliderState$drag$2);
                break;
            case 22:
                CoroutineScope coroutineScope6 = (CoroutineScope) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = sliderState$drag$2.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) sliderState$drag$2.$dragPriority;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(coroutineScope6, (LocalEditorialPresenter) sliderState$drag$2.$block, i2);
                    sliderState$drag$2.this$0 = null;
                    sliderState$drag$2.label = 1;
                    if (flow3.collect(lazyPagingItems$collectLoadState$2, sliderState$drag$2) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = sliderState$drag$2.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalService localService2 = (LocalService) ((LocalCashBalancePresenter) sliderState$drag$2.this$0).service;
                    UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) sliderState$drag$2.$dragPriority;
                    sliderState$drag$2.label = 1;
                    if (localService2.updateEarningCard(updateEarningCardRequest, sliderState$drag$2) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableState) sliderState$drag$2.$block).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) sliderState$drag$2.this$0;
                Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = sliderState$drag$2.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalService localService3 = (LocalService) localEditorialPresenter.service;
                    LocalEditorialScreen localEditorialScreen = (LocalEditorialScreen) localEditorialPresenter.screen;
                    GetEditorialRequest getEditorialRequest = new GetEditorialRequest(localEditorialScreen.editorialToken, localEditorialScreen.attributionKey.value, null, ByteString.EMPTY);
                    sliderState$drag$2.label = 1;
                    editorial = localService3.getEditorial(getEditorialRequest, sliderState$drag$2);
                    if (editorial == obj10) {
                        return obj10;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    editorial = obj;
                }
                ApiResult apiResult3 = (ApiResult) editorial;
                if (apiResult3 instanceof ApiResult.Success) {
                    ((MutableState) sliderState$drag$2.$dragPriority).setValue((GetEditorialResponse) ((ApiResult.Success) apiResult3).response);
                }
                ((MutableState) sliderState$drag$2.$block).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = sliderState$drag$2.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBrandFollowPresenter realBrandFollowPresenter = (RealBrandFollowPresenter) sliderState$drag$2.this$0;
                    if (realBrandFollowPresenter.needToFetchBanner) {
                        RealLocalBrandSyncer realLocalBrandSyncer = realBrandFollowPresenter.syncer;
                        BrandSpot brandSpot2 = realBrandFollowPresenter.brandSpot;
                        Screen screen = realBrandFollowPresenter.currentScreen;
                        HasAttributionKeyScreenScreen hasAttributionKeyScreenScreen = screen instanceof HasAttributionKeyScreenScreen ? (HasAttributionKeyScreenScreen) screen : null;
                        if (hasAttributionKeyScreenScreen != null && (attributionKey = hasAttributionKeyScreenScreen.getAttributionKey()) != null) {
                            str = attributionKey.value;
                        }
                        BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) sliderState$drag$2.$dragPriority;
                        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType((FulfillmentConfiguration) ((MutableState) sliderState$drag$2.$block).getValue());
                        sliderState$drag$2.label = 1;
                        if (RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer, brandSpot2, str, brandSpotSyncTokens, type2, sliderState$drag$2, 16) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                RealBrandFollowPresenter realBrandFollowPresenter2 = (RealBrandFollowPresenter) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = sliderState$drag$2.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = (Boolean) ((State) sliderState$drag$2.$dragPriority).getValue();
                    bool2.getClass();
                    boolean booleanValue = bool2.booleanValue();
                    BrandSpot brandSpot3 = realBrandFollowPresenter2.brandSpot;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(i4, (MutableState) sliderState$drag$2.$block);
                    sliderState$drag$2.label = 1;
                    if (RealBrandFollowPresenter.access$handleBrandAddRemove(realBrandFollowPresenter2, booleanValue, brandSpot3, realBrandFollowPresenter$models$2$1$1, sliderState$drag$2) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                return invokeSuspend$app$cash$local$presenters$RealOrderBuilder$models$1$1(obj);
            case 28:
                return invokeSuspend$app$cash$local$presenters$brand$orders$LocalOrderStatusPresenter$models$6$1(obj);
            default:
                CoroutineScope coroutineScope7 = (CoroutineScope) sliderState$drag$2.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = sliderState$drag$2.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) sliderState$drag$2.$dragPriority;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2(coroutineScope7, (LocalBrandProfilePresenter) sliderState$drag$2.$block, 8);
                    sliderState$drag$2.this$0 = null;
                    sliderState$drag$2.label = 1;
                    if (flow4.collect(lazyPagingItems$collectLoadState$22, sliderState$drag$2) == coroutineSingletons21) {
                        return coroutineSingletons21;
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
    public /* synthetic */ SliderState$drag$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$dragPriority = obj;
        this.$block = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderState$drag$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$block = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderState$drag$2(Function2 function2, DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.$block = function2;
        this.$dragPriority = differentialMotionFlingController$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderState$drag$2(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$dragPriority = flow;
        this.$block = obj;
    }
}
