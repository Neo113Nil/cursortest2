package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.q$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import coil3.size.SizeKt;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.devices.Device;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.core.ids.SectionProviderId;
import com.squareup.cash.money.presenters.MoneyTabLoadedStateHolder;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $animationState;
    public final /* synthetic */ Object $bringIntoViewSpec;
    public final /* synthetic */ int $r8$classId;
    public long $viewportAdjustmentForReverseScroll;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(MutableSharedFlow mutableSharedFlow, long j, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, MutableSharedFlow mutableSharedFlow2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.L$0 = mutableSharedFlow;
        this.$viewportAdjustmentForReverseScroll = j;
        this.this$0 = pointerEventHandlerCoroutine;
        this.$animationState = mutableSharedFlow2;
        this.$bringIntoViewSpec = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$bringIntoViewSpec;
        Object obj3 = this.$animationState;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                int i2 = 0;
                ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(i2, this.$viewportAdjustmentForReverseScroll, (ContentInViewNode) obj4, (UpdatableAnimationState) obj3, (BringIntoViewSpec) obj2, continuation);
                contentInViewNode$launchAnimation$2.L$0 = obj;
                return contentInViewNode$launchAnimation$2;
            case 1:
                ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$22 = new ContentInViewNode$launchAnimation$2((PressGestureScope) obj4, (TextFieldSelectionState) obj3, this.$viewportAdjustmentForReverseScroll, (MutableInteractionSourceImpl) obj2, continuation);
                contentInViewNode$launchAnimation$22.L$0 = obj;
                return contentInViewNode$launchAnimation$22;
            case 2:
                return new ContentInViewNode$launchAnimation$2((RealFidesmoClient) this.L$0, (Device) obj4, this.$viewportAdjustmentForReverseScroll, (ServiceDeliveryClient) obj3, (ProducerScope) obj2, continuation);
            case 3:
                return new ContentInViewNode$launchAnimation$2(3, this.$viewportAdjustmentForReverseScroll, (MoneyTabPresenter) obj4, (SectionProvider) obj3, (SectionProvider.Content) obj2, continuation);
            case 4:
                return new ContentInViewNode$launchAnimation$2((MutableSharedFlow) this.L$0, this.$viewportAdjustmentForReverseScroll, (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj4, (MutableSharedFlow) obj3, (MutableState) obj2, continuation);
            default:
                return new ContentInViewNode$launchAnimation$2((SelfieWorkflow.Input) this.L$0, (StatefulWorkflow.RenderContext) obj4, (SelfieWorkflow) obj3, (SelfieState.CountdownToCapture) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ContentInViewNode$launchAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e8, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r1)._channel.send(r2, r20) == r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fe, code lost:
    
        if (r1 == r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0390, code lost:
    
        if (r6.emit(r3, r20) == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x036c, code lost:
    
        if (r3 == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r2.emit(r6, r20) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r2.emit(r3, r20) == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        Object tryAwaitRelease;
        Object access$awaitInitialConnectionStabilityCheck;
        Integer num;
        Set set;
        long j;
        switch (this.$r8$classId) {
            case 0:
                ContentInViewNode contentInViewNode = (ContentInViewNode) this.this$0;
                MemoryCacheService memoryCacheService = contentInViewNode.bringIntoViewRequests;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        try {
                            contentInViewNode.isAnimationRunning = true;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            MutatePriority mutatePriority = MutatePriority.Default;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1((UpdatableAnimationState) this.$animationState, contentInViewNode, (BringIntoViewSpec) this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, job, null);
                            this.label = 1;
                            if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cancellationException = null;
                            contentInViewNode.isAnimationRunning = false;
                            memoryCacheService.cancelAndRemoveAll(cancellationException);
                            contentInViewNode.trackingFocusedChild = false;
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            cancellationException = null;
                            contentInViewNode.isAnimationRunning = false;
                            memoryCacheService.cancelAndRemoveAll(cancellationException);
                            contentInViewNode.trackingFocusedChild = false;
                            throw th;
                        }
                    }
                    memoryCacheService.resumeAndRemoveAll();
                    contentInViewNode.isAnimationRunning = false;
                    memoryCacheService.cancelAndRemoveAll(null);
                    contentInViewNode.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    cancellationException = e;
                    try {
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        contentInViewNode.isAnimationRunning = false;
                        memoryCacheService.cancelAndRemoveAll(cancellationException);
                        contentInViewNode.trackingFocusedChild = false;
                        throw th;
                    }
                }
            case 1:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.$animationState;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default((CoroutineScope) this.L$0, null, null, new RepeatOnIntervalTaskRunner$repeatOn$2((TextFieldSelectionState) this.$animationState, this.$viewportAdjustmentForReverseScroll, (MutableInteractionSourceImpl) this.$bringIntoViewSpec, (Continuation) null, 8), 3);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.this$0;
                    this.label = 1;
                    tryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        textFieldSelectionState.pressInteraction = null;
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    tryAwaitRelease = obj;
                }
                boolean booleanValue = ((Boolean) tryAwaitRelease).booleanValue();
                PressInteraction.Press press = textFieldSelectionState.pressInteraction;
                if (press != null) {
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.$bringIntoViewSpec;
                    Interaction release = booleanValue ? new PressInteraction.Release(press) : new PressInteraction.Cancel(press);
                    this.label = 2;
                    break;
                }
                textFieldSelectionState.pressInteraction = null;
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealFidesmoClient realFidesmoClient = (RealFidesmoClient) this.L$0;
                    Device device = (Device) this.this$0;
                    RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1 realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1 = new RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1(this.$viewportAdjustmentForReverseScroll, realFidesmoClient, (ServiceDeliveryClient) this.$animationState, (ProducerScope) this.$bringIntoViewSpec, null);
                    q$$ExternalSyntheticLambda1 q__externalsyntheticlambda1 = new q$$ExternalSyntheticLambda1(this.$viewportAdjustmentForReverseScroll, (RealFidesmoClient) this.L$0, (ServiceDeliveryClient) this.$animationState);
                    this.label = 1;
                    access$awaitInitialConnectionStabilityCheck = RealFidesmoClient.access$awaitInitialConnectionStabilityCheck(realFidesmoClient, device, realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1, q__externalsyntheticlambda1, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$awaitInitialConnectionStabilityCheck = obj;
                }
                boolean booleanValue2 = ((Boolean) access$awaitInitialConnectionStabilityCheck).booleanValue();
                if (this.$viewportAdjustmentForReverseScroll != ((RealFidesmoClient) this.L$0).activeDeliveryReconnectAttempt.get()) {
                    Timber.Forest.i(Boxes$$ExternalSyntheticOutline1.m(this.$viewportAdjustmentForReverseScroll, "Reconnect stability check superseded by a newer attempt (attemptId=", "); abandoning result"), new Object[0]);
                    return Unit.INSTANCE;
                }
                if (!RealFidesmoClient.access$isActiveDelivery((RealFidesmoClient) this.L$0, (ServiceDeliveryClient) this.$animationState)) {
                    Timber.Forest.w("Active Fidesmo delivery ended during reconnect stability check; abandoning publish", new Object[0]);
                    return Unit.INSTANCE;
                }
                if (!booleanValue2) {
                    Timber.Forest forest = Timber.Forest;
                    forest.w("Fidesmo device unstable on reconnect during active delivery", new Object[0]);
                    RealObservabilityManager realObservabilityManager = ((RealFidesmoClient) this.L$0).observabilityManager;
                    Pair pair = new Pair("stage", "stability_check_reconnect");
                    FidesmoProvisioningError.ConnectionUnstable connectionUnstable = FidesmoProvisioningError.ConnectionUnstable.INSTANCE;
                    realObservabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(pair, new Pair(BreadcrumbHelper.Category.ERROR, FidesmoProvisioningError.ConnectionUnstable.cdfShortName)));
                    RealFidesmoClient realFidesmoClient2 = (RealFidesmoClient) this.L$0;
                    ServiceDeliveryClient serviceDeliveryClient = (ServiceDeliveryClient) this.$animationState;
                    synchronized (realFidesmoClient2.nfcDiscoveryLock) {
                        RealFidesmoClient.ActiveDelivery activeDelivery = realFidesmoClient2.activeDelivery;
                        if (activeDelivery != null) {
                            RealFidesmoClient.ActiveDelivery activeDelivery2 = activeDelivery.client.equals(serviceDeliveryClient) ? activeDelivery : null;
                            if (activeDelivery2 != null) {
                                realFidesmoClient2.activeDelivery = RealFidesmoClient.ActiveDelivery.copy$default(activeDelivery2, new RealFidesmoClient.ActiveDeliveryState.Failed("Device unstable on reconnect"), false, 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                num = Integer.valueOf(activeDelivery2.reconnectCount);
                            }
                        }
                        num = null;
                    }
                    if (num != null) {
                        if (!realFidesmoClient2.activeDeliveryReconnects.tryEmit(new RealFidesmoClient.ActiveDeliveryReconnectEvent(serviceDeliveryClient, num.intValue(), true))) {
                            forest.w("Failed to publish Fidesmo delivery-failed reconnect event", new Object[0]);
                        }
                    }
                    ProducerScope producerScope = (ProducerScope) this.$bringIntoViewSpec;
                    FidesmoDeviceState.Error error = new FidesmoDeviceState.Error(connectionUnstable);
                    this.label = 2;
                    break;
                } else {
                    if (RealFidesmoClient.access$publishDeviceToActiveDelivery((RealFidesmoClient) this.L$0, (Device) this.this$0)) {
                        Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Published Fidesmo reconnect to SDK session after stability check (device=", RealFidesmoClient.logId((Device) this.this$0), ")"), new Object[0]);
                    } else {
                        Timber.Forest.w("Active Fidesmo delivery ended before reconnect could be published after stability check", new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
            case 3:
                SectionProvider sectionProvider = (SectionProvider) this.$animationState;
                MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) this.this$0;
                MoneyTabLoadedStateHolder moneyTabLoadedStateHolder = moneyTabPresenter.moneyTabLoadedStateHolder;
                StateFlowImpl stateFlowImpl = moneyTabPresenter.missingSectionProviderIds;
                RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = moneyTabPresenter.moneyContentSpanTrackingService;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SectionProviderId id = sectionProvider.getId();
                    id.getClass();
                    LinkedHashMap linkedHashMap = realMoneyContentSpanTrackingService.sectionProviderContentLoadSpanMap;
                    if (!linkedHashMap.containsKey(id)) {
                        String m = Boxes$$ExternalSyntheticOutline1.m();
                        realMoneyContentSpanTrackingService.openSpans.put(m, RealObservabilityManager.startTrackingSpan$default(realMoneyContentSpanTrackingService.observabilityManager, m, "money_section_provider_content_load", MapsKt__MapsKt.mapOf(new Pair("section_provider.id", id.name()), new Pair("home_version", realMoneyContentSpanTrackingService.version)), null, 8));
                        linkedHashMap.put(id, m);
                    }
                    if (!((SectionProvider.Content) this.$bringIntoViewSpec).loading) {
                        SectionProviderId id2 = sectionProvider.getId();
                        id2.getClass();
                        LinkedHashMap linkedHashMap2 = realMoneyContentSpanTrackingService.sectionProviderContentLoadSpanMap;
                        String str = (String) linkedHashMap2.get(id2);
                        if (str != null) {
                            SpanTracking spanTracking = (SpanTracking) realMoneyContentSpanTrackingService.openSpans.get(str);
                            if (spanTracking != null) {
                                SpanTracking.spanEnded$default(spanTracking, null, 3);
                            }
                            linkedHashMap2.remove(id2);
                        }
                        Set set2 = (Set) stateFlowImpl.getValue();
                        set2.remove(sectionProvider.getId());
                        this.L$0 = set2;
                        this.label = 1;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, set2);
                        if (Unit.INSTANCE == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        set = set2;
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = (Set) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (set.isEmpty()) {
                    ((RealMoneyAnalyticsService) moneyTabPresenter.moneyAnalyticsService).submitViewLoadEvent(moneyTabPresenter.args.source, moneyTabPresenter.clock.millis() - this.$viewportAdjustmentForReverseScroll, moneyTabLoadedStateHolder._isLoaded ? null : Boolean.FALSE);
                    moneyTabLoadedStateHolder._isLoaded = true;
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = (MutableState) this.$bringIntoViewSpec;
                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$animationState;
                        Unit unit = Unit.INSTANCE;
                        this.label = 2;
                        break;
                    } else {
                        MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) this.L$0;
                        Offset offset = new Offset(Offset.m627timestuRUvjQ(Offset.m621divtuRUvjQ(this.$viewportAdjustmentForReverseScroll, ((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.this$0).$$delegate_0.getDensity()), 0.8f));
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    input.getClass();
                    this.$viewportAdjustmentForReverseScroll = 1000L;
                    this.label = 1;
                    if (JobKt.delay(1000L, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    j = 1000;
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = this.$viewportAdjustmentForReverseScroll;
                    SafeTrace.throwOnFailure(obj);
                    j = j2;
                }
                ((StatefulWorkflow.RenderContext) this.this$0).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) this.$animationState, new CaptureCheckFaceKt$$ExternalSyntheticLambda7(j, (SelfieState.CountdownToCapture) this.$bringIntoViewSpec, input, 8)));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j, MutableInteractionSourceImpl mutableInteractionSourceImpl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.this$0 = pressGestureScope;
        this.$animationState = textFieldSelectionState;
        this.$viewportAdjustmentForReverseScroll = j;
        this.$bringIntoViewSpec = mutableInteractionSourceImpl;
    }

    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Object $animationJob;
        public final /* synthetic */ Object $animationState;
        public final /* synthetic */ Object $bringIntoViewSpec;
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, String str, long j, TextRange textRange, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, Continuation continuation) {
            super(2, continuation);
            this.L$0 = platformSelectionBehaviorsImpl;
            this.$animationState = str;
            this.$viewportAdjustmentForReverseScroll = j;
            this.this$0 = textRange;
            this.$bringIntoViewSpec = textFieldSelectionManager;
            this.$animationJob = offsetMapping;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$animationJob;
            Object obj3 = this.$bringIntoViewSpec;
            Object obj4 = this.this$0;
            Object obj5 = this.$animationState;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((UpdatableAnimationState) obj5, (ContentInViewNode) obj4, (BringIntoViewSpec) obj3, this.$viewportAdjustmentForReverseScroll, (Job) obj2, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                default:
                    return new AnonymousClass1((PlatformSelectionBehaviorsImpl) this.L$0, (String) obj5, this.$viewportAdjustmentForReverseScroll, (TextRange) obj4, (TextFieldSelectionManager) obj3, (OffsetMapping) obj2, continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            long j = this.$viewportAdjustmentForReverseScroll;
            Object obj3 = this.$bringIntoViewSpec;
            Object obj4 = this.$animationState;
            Object obj5 = this.$animationJob;
            switch (i) {
                case 0:
                    BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) obj3;
                    ContentInViewNode contentInViewNode = (ContentInViewNode) obj2;
                    UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) obj4;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.L$0;
                        updatableAnimationState.value = ContentInViewNode.m193access$calculateScrollDeltaI_oMVgE(contentInViewNode, bringIntoViewSpec, j);
                        MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(contentInViewNode, updatableAnimationState, (Job) obj5, scrollingLogic$nestedScrollScope$1);
                        n$$ExternalSyntheticLambda1 n__externalsyntheticlambda1 = new n$$ExternalSyntheticLambda1(2, contentInViewNode, updatableAnimationState, bringIntoViewSpec);
                        this.label = 1;
                        if (updatableAnimationState.animateToZero(menuKt$$ExternalSyntheticLambda0, n__externalsyntheticlambda1, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    OffsetMapping offsetMapping = (OffsetMapping) obj5;
                    String str = (String) obj4;
                    TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj3;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$0;
                        this.label = 1;
                        obj = platformSelectionBehaviorsImpl.m439suggestSelectionForLongPressOrDoubleClickpYaCww(str, j, this);
                        if (obj == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    TextRange textRange = (TextRange) obj;
                    if (textRange == null) {
                        break;
                    } else {
                        long j2 = textRange.packedValue;
                        long TextRange = SizeKt.TextRange(offsetMapping.transformedToOriginal((int) (j2 >> 32)), offsetMapping.transformedToOriginal((int) (j2 & BodyPartID.bodyIdMax)));
                        if (!TextRange.m985equalsimpl((TextRange) obj2, TextRange) && Intrinsics.areEqual(textFieldSelectionManager.getValue$foundation().annotatedString.text, str) && offsetMapping == textFieldSelectionManager.offsetMapping) {
                            textFieldSelectionManager.onValueChange.invoke(TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().annotatedString, TextRange));
                            textFieldSelectionManager.latestSelection = new TextRange(TextRange);
                        }
                        break;
                    }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, long j, Job job, Continuation continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = bringIntoViewSpec;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = job;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(RealFidesmoClient realFidesmoClient, Device device, long j, ServiceDeliveryClient serviceDeliveryClient, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.L$0 = realFidesmoClient;
        this.this$0 = device;
        this.$viewportAdjustmentForReverseScroll = j;
        this.$animationState = serviceDeliveryClient;
        this.$bringIntoViewSpec = producerScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(SelfieWorkflow.Input input, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, SelfieState.CountdownToCapture countdownToCapture, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.L$0 = input;
        this.this$0 = renderContext;
        this.$animationState = selfieWorkflow;
        this.$bringIntoViewSpec = countdownToCapture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentInViewNode$launchAnimation$2(int i, long j, Object obj, Object obj2, Object obj3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$animationState = obj2;
        this.$bringIntoViewSpec = obj3;
        this.$viewportAdjustmentForReverseScroll = j;
    }
}
