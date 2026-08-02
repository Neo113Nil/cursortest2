package com.squareup.cash.arcade.components;

import android.util.Log;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1;
import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.components.internal.TooltipState$hide$1$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.notifications.channels.MiscNotificationChannelContributor;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.util.coroutines.ThrottleFirstKt$throttleFirst$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.ByteString;
import okio.internal.DefaultSocket;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ToastKt$Toast$8$1 extends SuspendLambda implements Function2 {
    public long $duration;
    public Object $onDismiss;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $visible$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$8$1(MutableState mutableState, MutableState mutableState2, long j, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.$visible$delegate = mutableState;
        this.$onDismiss = mutableState2;
        this.$duration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$visible$delegate;
        switch (i) {
            case 0:
                return new ToastKt$Toast$8$1(this.$duration, (Function0) this.$onDismiss, (MutableState) obj2, continuation, 0);
            case 1:
                ToastKt$Toast$8$1 toastKt$Toast$8$1 = new ToastKt$Toast$8$1(this.$duration, (CaptureSessionState) obj2, continuation, 1);
                toastKt$Toast$8$1.$onDismiss = obj;
                return toastKt$Toast$8$1;
            case 2:
                return new ToastKt$Toast$8$1((Threads) this.$onDismiss, (Function1) obj2, this.$duration, continuation);
            case 3:
                return new ToastKt$Toast$8$1((SizeAnimationModifierNode.AnimData) this.$onDismiss, this.$duration, (SizeAnimationModifierNode) obj2, continuation, 3);
            case 4:
                ToastKt$Toast$8$1 toastKt$Toast$8$12 = new ToastKt$Toast$8$1((DraggableNode) obj2, this.$duration, continuation, 4);
                toastKt$Toast$8$12.$onDismiss = obj;
                return toastKt$Toast$8$12;
            case 5:
                ToastKt$Toast$8$1 toastKt$Toast$8$13 = new ToastKt$Toast$8$1((TooltipState) obj2, this.$duration, continuation, 5);
                toastKt$Toast$8$13.$onDismiss = obj;
                return toastKt$Toast$8$13;
            case 6:
                return new ToastKt$Toast$8$1((MutableFloatState) obj2, continuation);
            case 7:
                ToastKt$Toast$8$1 toastKt$Toast$8$14 = new ToastKt$Toast$8$1(this.$duration, (NetworkStatus) obj2, continuation, 7);
                toastKt$Toast$8$14.$onDismiss = obj;
                return toastKt$Toast$8$14;
            case 8:
                ToastKt$Toast$8$1 toastKt$Toast$8$15 = new ToastKt$Toast$8$1((com.squareup.cash.mooncake.compose_ui.components.TooltipState) obj2, this.$duration, continuation, 8);
                toastKt$Toast$8$15.$onDismiss = obj;
                return toastKt$Toast$8$15;
            case 9:
                return new ToastKt$Toast$8$1(this.$duration, (MiscNotificationChannelContributor) this.$onDismiss, (DefaultSocket) obj2, continuation, 9);
            case 10:
                return new ToastKt$Toast$8$1((RealOffersTabRepository) this.$onDismiss, this.$duration, (OffersTabSearchResponse) obj2, continuation, 10);
            case 11:
                ToastKt$Toast$8$1 toastKt$Toast$8$16 = new ToastKt$Toast$8$1(this.$duration, (AndroidClock) obj2, continuation, 11);
                toastKt$Toast$8$16.$onDismiss = obj;
                return toastKt$Toast$8$16;
            case 12:
                ToastKt$Toast$8$1 toastKt$Toast$8$17 = new ToastKt$Toast$8$1((ByteString) obj2, this.$duration, continuation, 12);
                toastKt$Toast$8$17.$onDismiss = obj;
                return toastKt$Toast$8$17;
            case 13:
                ToastKt$Toast$8$1 toastKt$Toast$8$18 = new ToastKt$Toast$8$1(this.$duration, (ProduceStateScope) obj2, continuation, 13);
                toastKt$Toast$8$18.$onDismiss = obj;
                return toastKt$Toast$8$18;
            case 14:
                return new ToastKt$Toast$8$1((MutableSharedFlow) this.$onDismiss, this.$duration, (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj2, continuation, 14);
            case 15:
                return new ToastKt$Toast$8$1((MutableState) obj2, (MutableState) this.$onDismiss, this.$duration, continuation);
            default:
                ToastKt$Toast$8$1 toastKt$Toast$8$19 = new ToastKt$Toast$8$1((Flow) obj2, this.$duration, continuation, 16);
                toastKt$Toast$8$19.$onDismiss = obj;
                return toastKt$Toast$8$19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 7:
                return ((ToastKt$Toast$8$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((ToastKt$Toast$8$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((ToastKt$Toast$8$1) create((ActivityDataBridge) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((ToastKt$Toast$8$1) create((CardRegistry$CardTransition$TransitionType) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((ToastKt$Toast$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ToastKt$Toast$8$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a6, code lost:
    
        if (r0.emit((com.squareup.cash.investing.backend.api.NetworkStatus) r5, r16) == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0299, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r6, r16) == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x030a, code lost:
    
        if (r7 != r0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e5, code lost:
    
        if (r1 == r0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r1, r1, r0, null, r6, r16, 4) == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r1, r16) == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r2.emit(r7, r16) == r10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r16) == r10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0193, code lost:
    
        if (r2.emit(r7, r16) == r10) goto L89;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x030a -> B:139:0x030e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b5 -> B:77:0x0196). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object animateTo$default;
        Object withFrameNanos;
        long longValue;
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = 2;
        Object obj2 = this.$visible$delegate;
        int i4 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = this.$duration;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.FALSE);
                    ((Function0) this.$onDismiss).invoke();
                }
                break;
            case 1:
                long j2 = this.$duration;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", "Finalizing " + ((CoroutineScope) this.$onDismiss) + " in " + j2 + " ms");
                    this.label = 1;
                    if (JobKt.delay(j2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((CaptureSessionState) obj2).finalizeSession$camera_camera2_pipe(0L);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Threads threads = (Threads) this.$onDismiss;
                    DeferredCoroutine async$default = JobKt.async$default(threads.cameraPipeDispatchScope, threads.backgroundDispatcher, null, new GLThread$launch$1((Function1) obj2, continuation, i4), 2);
                    long j3 = this.$duration;
                    Threads$runBlockingCheckedOrNull$1$1 threads$runBlockingCheckedOrNull$1$1 = new Threads$runBlockingCheckedOrNull$1$1(async$default, continuation, i2);
                    this.label = 1;
                    Object withTimeoutOrNull = JobKt.withTimeoutOrNull(j3, threads$runBlockingCheckedOrNull$1$1, this);
                    if (withTimeoutOrNull != coroutineSingletons3) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 3:
                SizeAnimationModifierNode sizeAnimationModifierNode = (SizeAnimationModifierNode) obj2;
                SizeAnimationModifierNode.AnimData animData = (SizeAnimationModifierNode.AnimData) this.$onDismiss;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = animData.anim;
                    IntSize intSize = new IntSize(this.$duration);
                    AnimationSpec animationSpec = sizeAnimationModifierNode.animationSpec;
                    this.label = 1;
                    animateTo$default = Animatable.animateTo$default(animatable, intSize, animationSpec, null, null, this, 12);
                    if (animateTo$default == coroutineSingletons4) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    animateTo$default = obj;
                }
                AnimationEndReason animationEndReason = ((AnimationResult) animateTo$default).endReason;
                AnimationEndReason animationEndReason2 = AnimationEndReason.BoundReached;
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.$onDismiss;
                    Function3 function3 = ((DraggableNode) obj2).onDragStarted;
                    Offset offset = new Offset(this.$duration);
                    this.label = 1;
                    if (function3.invoke(coroutineScope, offset, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                TooltipState tooltipState = (TooltipState) obj2;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                Continuation continuation2 = null;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue = tooltipState._alpha$delegate.getFloatValue();
                    TweenSpec tween$default = AnimatableKt.tween$default(0, 0, null, 7);
                    TooltipState$hide$1$$ExternalSyntheticLambda0 tooltipState$hide$1$$ExternalSyntheticLambda0 = new TooltipState$hide$1$$ExternalSyntheticLambda0(tooltipState, 1);
                    this.$onDismiss = coroutineScope2;
                    this.label = 1;
                    if (AnimatableKt.animate$default(floatValue, 1.0f, tween$default, tooltipState$hide$1$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons6) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                tooltipState.dismissJob = JobKt.launch$default(coroutineScope2, null, null, new FlashControl$applyScreenFlash$3(this.$duration, tooltipState, continuation2, 6), 3);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda3 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
                    this.label = 1;
                    withFrameNanos = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda3);
                    break;
                } else if (i11 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    withFrameNanos = obj;
                } else if (i11 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    longValue = this.$duration;
                    MutableFloatState mutableFloatState = (MutableFloatState) this.$onDismiss;
                    SafeTrace.throwOnFailure(obj);
                    Object withFrameNanos2 = obj;
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(((Number) withFrameNanos2).floatValue());
                    mutableFloatState = (MutableFloatState) obj2;
                    c7$$ExternalSyntheticLambda6 c7__externalsyntheticlambda6 = new c7$$ExternalSyntheticLambda6(longValue, 12);
                    this.$onDismiss = mutableFloatState;
                    this.$duration = longValue;
                    this.label = 2;
                    withFrameNanos2 = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, c7__externalsyntheticlambda6);
                    break;
                }
                longValue = ((Number) withFrameNanos).longValue();
                mutableFloatState = (MutableFloatState) obj2;
                c7$$ExternalSyntheticLambda6 c7__externalsyntheticlambda62 = new c7$$ExternalSyntheticLambda6(longValue, 12);
                this.$onDismiss = mutableFloatState;
                this.$duration = longValue;
                this.label = 2;
                withFrameNanos2 = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, c7__externalsyntheticlambda62);
            case 7:
                FlowCollector flowCollector = (FlowCollector) this.$onDismiss;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j4 = this.$duration;
                    this.$onDismiss = flowCollector;
                    this.label = 1;
                    break;
                } else if (i12 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i12 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.$onDismiss = null;
                this.label = 2;
                break;
            case 8:
                com.squareup.cash.mooncake.compose_ui.components.TooltipState tooltipState2 = (com.squareup.cash.mooncake.compose_ui.components.TooltipState) obj2;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                Continuation continuation3 = null;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue2 = tooltipState2._alpha$delegate.getFloatValue();
                    TweenSpec tween$default2 = AnimatableKt.tween$default(0, 0, null, 7);
                    com.squareup.cash.mooncake.compose_ui.components.TooltipState$hide$1$$ExternalSyntheticLambda0 tooltipState$hide$1$$ExternalSyntheticLambda02 = new com.squareup.cash.mooncake.compose_ui.components.TooltipState$hide$1$$ExternalSyntheticLambda0(tooltipState2, i4);
                    this.$onDismiss = coroutineScope3;
                    this.label = 1;
                    if (AnimatableKt.animate$default(floatValue2, 1.0f, tween$default2, tooltipState$hide$1$$ExternalSyntheticLambda02, this, 4) == coroutineSingletons9) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                tooltipState2.dismissJob = JobKt.launch$default(coroutineScope3, null, null, new FlashControl$applyScreenFlash$3(this.$duration, tooltipState2, continuation3, 12), 3);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j5 = this.$duration;
                    MusicPresenter$models$2$1 musicPresenter$models$2$1 = new MusicPresenter$models$2$1((MiscNotificationChannelContributor) this.$onDismiss, (DefaultSocket) obj2, continuation, 25);
                    this.label = 1;
                    if (JobKt.m4184withTimeoutKLykuaI(j5, musicPresenter$models$2$1, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.$onDismiss;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realOffersTabRepository.ioDispatcher, new FlashControl$applyScreenFlash$2(realOffersTabRepository, this.$duration, (OffersTabSearchResponse) obj2, (Continuation) null, 9), this);
                    if (withContext != obj3) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj3) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                AndroidClock androidClock = (AndroidClock) obj2;
                long j6 = this.$duration;
                FlowCollector flowCollector2 = (FlowCollector) this.$onDismiss;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (j6 > androidClock.millis()) {
                        Unit unit = Unit.INSTANCE;
                        this.$onDismiss = flowCollector2;
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            Unit unit2 = Unit.INSTANCE;
                            this.$onDismiss = flowCollector2;
                            this.label = 3;
                            break;
                        } else if (i16 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (j6 <= androidClock.millis()) {
                    break;
                } else {
                    this.$onDismiss = flowCollector2;
                    this.label = 2;
                    break;
                }
            case 12:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.$onDismiss;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j7 = this.$duration;
                    this.$onDismiss = null;
                    this.label = 1;
                    if (activityDataBridge.setCachedActivityItemFromTransferFundsRequest((ByteString) obj2, j7, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                ProduceStateScope produceStateScope = (ProduceStateScope) obj2;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) this.$onDismiss;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cardRegistry$CardTransition$TransitionType == CardRegistry$CardTransition$TransitionType.TARGET) {
                        long j8 = this.$duration;
                        this.$onDismiss = cardRegistry$CardTransition$TransitionType;
                        this.label = 1;
                        break;
                    }
                } else if (i18 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i18 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Animatable Animatable = AnimatableKt.Animatable(((Number) produceStateScope.getValue()).floatValue(), 0.01f);
                Float f = new Float(cardRegistry$CardTransition$TransitionType == CardRegistry$CardTransition$TransitionType.SOURCE ? RecyclerView.DECELERATION_RATE : 1.0f);
                SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 1000.0f, null, 4);
                CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 cardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 = new CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(produceStateScope, i3);
                this.$onDismiss = null;
                this.label = 2;
                break;
            case 14:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$onDismiss;
                    Offset offset2 = new Offset(Offset.m627timestuRUvjQ(Offset.m621divtuRUvjQ(this.$duration, ((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj2).$$delegate_0.getDensity()), 0.8f));
                    this.label = 1;
                    if (mutableSharedFlow.emit(offset2, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView cardModelView = (CardModelView) ((MutableState) obj2).getValue();
                    if (cardModelView != null) {
                        MutableState mutableState2 = (MutableState) this.$onDismiss;
                        long j9 = this.$duration;
                        this.label = 1;
                        if (Hero3DCardViewKt.fadeIn(cardModelView, mutableState2, j9, this) == coroutineSingletons15) {
                            break;
                        }
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector3 = (FlowCollector) this.$onDismiss;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = System.currentTimeMillis();
                    ThrottleFirstKt$throttleFirst$1$1 throttleFirstKt$throttleFirst$1$1 = new ThrottleFirstKt$throttleFirst$1$1(ref$LongRef, this.$duration, new Ref$BooleanRef(), flowCollector3);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(throttleFirstKt$throttleFirst$1$1, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i21 != 1) {
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
    public /* synthetic */ ToastKt$Toast$8$1(long j, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$duration = j;
        this.$visible$delegate = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$8$1(Threads threads, Function1 function1, long j, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$onDismiss = threads;
        this.$visible$delegate = function1;
        this.$duration = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$8$1(MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$visible$delegate = mutableFloatState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$8$1(long j, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$duration = j;
        this.$onDismiss = obj;
        this.$visible$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$8$1(Object obj, long j, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onDismiss = obj;
        this.$duration = j;
        this.$visible$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$8$1(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visible$delegate = obj;
        this.$duration = j;
    }
}
