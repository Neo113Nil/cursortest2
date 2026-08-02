package androidx.camera.camera2.impl;

import android.graphics.PointF;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.datastore.core.SimpleActor;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.Result;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.earnings.backend.api.EarnerModeResult;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.protos.cash.paychecks.api.v1.EarnerModeOperation;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.UpdateEarnerModeRequest;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Duration;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import radiography.internal.RenderTreeStringKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FlashControl$applyScreenFlash$3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $onApplyCompletedSignal;
    public final /* synthetic */ int $r8$classId;
    public long $timeoutMillis;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlashControl$applyScreenFlash$3(long j, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$timeoutMillis = j;
        this.$onApplyCompletedSignal = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FlashControl$applyScreenFlash$3((CompletableDeferred) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 0);
            case 1:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (Camera2CameraController) this.$onApplyCompletedSignal, continuation, 1);
            case 2:
                return new FlashControl$applyScreenFlash$3((TextFieldMagnifierNodeImpl28) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 2);
            case 3:
                return new FlashControl$applyScreenFlash$3((Animatable) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 3);
            case 4:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.$onApplyCompletedSignal, continuation, 4);
            case 5:
                return new FlashControl$applyScreenFlash$3((AndroidViewHolder) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 5);
            case 6:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (TooltipState) this.$onApplyCompletedSignal, continuation, 6);
            case 7:
                return new FlashControl$applyScreenFlash$3((MutableSharedFlow) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 7);
            case 8:
                return new FlashControl$applyScreenFlash$3((CardDesignLibraryScene) this.$onApplyCompletedSignal, continuation);
            case 9:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (Result) this.$onApplyCompletedSignal, continuation, 9);
            case 10:
                return new FlashControl$applyScreenFlash$3((RealColdStartIntegrityChecker) this.$onApplyCompletedSignal, this.$timeoutMillis, continuation, 10);
            case 11:
                FlashControl$applyScreenFlash$3 flashControl$applyScreenFlash$3 = new FlashControl$applyScreenFlash$3(this.$timeoutMillis, continuation);
                flashControl$applyScreenFlash$3.$onApplyCompletedSignal = obj;
                return flashControl$applyScreenFlash$3;
            case 12:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (com.squareup.cash.mooncake.compose_ui.components.TooltipState) this.$onApplyCompletedSignal, continuation, 12);
            default:
                return new FlashControl$applyScreenFlash$3(this.$timeoutMillis, (RealThreeDsWarningsRepository) this.$onApplyCompletedSignal, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 8:
                ((FlashControl$applyScreenFlash$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((FlashControl$applyScreenFlash$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f6, code lost:
    
        if (r0.hasActiveTag == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        if (kotlinx.coroutines.channels.BufferedChannel.receive$suspendImpl(r6, r17) == r1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ce, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(8, r17) == r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02c5, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r0 - 8, r17) == r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r0.emit(r2, r17) == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r7, r17) == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (r0.emit(r7, r17) == r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01ce -> B:82:0x01cf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object awaitUntil;
        long nanoTime;
        long j;
        Object updateEarnerMode;
        Object failure;
        Object withTimeout;
        int i = 2;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                long j2 = this.$timeoutMillis;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "applyScreenFlash: Waiting for ScreenFlashListener to be completed");
                    }
                    CompletableDeferred completableDeferred = (CompletableDeferred) this.$onApplyCompletedSignal;
                    this.label = 1;
                    awaitUntil = RenderTreeStringKt.awaitUntil(completableDeferred, j2, this);
                    if (awaitUntil == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    awaitUntil = obj;
                }
                if (((Boolean) awaitUntil).booleanValue()) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "applyScreenFlash: ScreenFlashListener completed");
                    }
                } else if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "applyScreenFlash: ScreenFlashListener completion timed out after " + j2 + " ms");
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j3 = this.$timeoutMillis;
                    this.label = 1;
                    if (JobKt.delay(j3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Camera2CameraController camera2CameraController = (Camera2CameraController) this.$onApplyCompletedSignal;
                synchronized (camera2CameraController.lock) {
                    if (!camera2CameraController.isClosed() && !camera2CameraController.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$6) && !camera2CameraController.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$5)) {
                        Log.d("CXCP", "Restarting " + camera2CameraController + "...");
                        camera2CameraController.surfaceTracker.registerAllSurfaces();
                        Camera2CameraController.access$stopLocked(camera2CameraController);
                        camera2CameraController.startLocked();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = ((TextFieldMagnifierNodeImpl28) this.$onApplyCompletedSignal).animatable;
                    Offset offset = new Offset(this.$timeoutMillis);
                    SpringSpec springSpec = SelectionMagnifierKt.MagnifierSpringSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, offset, springSpec, null, null, this, 12) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable2 = (Animatable) this.$onApplyCompletedSignal;
                    Offset offset2 = new Offset(this.$timeoutMillis);
                    SpringSpec springSpec2 = SelectionMagnifierKt.MagnifierSpringSpec;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, offset2, springSpec2, null, null, this, 12) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                long j4 = this.$timeoutMillis;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        CancellableContinuationImpl cancellableContinuationImpl = ((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.$onApplyCompletedSignal).pointerAwaiter;
                        if (cancellableContinuationImpl != null) {
                            Result.Companion companion = kotlin.Result.Companion;
                            cancellableContinuationImpl.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j4)));
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.label = 2;
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleActor simpleActor = ((AndroidViewHolder) this.$onApplyCompletedSignal).dispatcher;
                    long j5 = this.$timeoutMillis;
                    this.label = 1;
                    if (simpleActor.m1110dispatchPreFlingQWom1Mo(j5, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j6 = this.$timeoutMillis;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j6, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TooltipState tooltipState = (TooltipState) this.$onApplyCompletedSignal;
                StandaloneCoroutine standaloneCoroutine = tooltipState.dismissJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                JobKt.launch$default(tooltipState.scope, null, null, new AmountPickerCondensedView.AnonymousClass14(tooltipState, continuation, 7), 3);
                return Unit.INSTANCE;
            case 7:
                long j7 = this.$timeoutMillis;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$onApplyCompletedSignal;
                    PointF pointF = new PointF(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax)));
                    this.label = 1;
                    if (mutableSharedFlow.emit(pointF, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) this.$onApplyCompletedSignal;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = cardDesignLibraryScene.animationWake;
                    this.label = 1;
                    bufferedChannel.getClass();
                    break;
                } else {
                    if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        nanoTime = System.nanoTime();
                        long nanoTime2 = System.nanoTime();
                        StateFlowImpl stateFlowImpl = cardDesignLibraryScene._animationTime;
                        stateFlowImpl.updateState(null, new Float(((Number) stateFlowImpl.getValue()).floatValue() + ((nanoTime2 - nanoTime) / 1.0E9f)));
                        j = cardDesignLibraryScene.frameIntervalMs;
                        this.$timeoutMillis = nanoTime2;
                        this.label = 2;
                        if (JobKt.delay(j, this) != coroutineSingletons9) {
                        }
                        return coroutineSingletons9;
                    }
                    if (i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nanoTime = this.$timeoutMillis;
                    SafeTrace.throwOnFailure(obj);
                    if (!cardDesignLibraryScene.zoomAnimator.isAnimating()) {
                        if (cardDesignLibraryScene.zoomAnimator.panAnimProgress >= 1.0f) {
                            if (!cardDesignLibraryScene.isCenterZAnimating()) {
                                if (!cardDesignLibraryScene.nearRotationSettling) {
                                    if (!cardDesignLibraryScene.interactionController.isUserInteracting()) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    long nanoTime22 = System.nanoTime();
                    StateFlowImpl stateFlowImpl2 = cardDesignLibraryScene._animationTime;
                    stateFlowImpl2.updateState(null, new Float(((Number) stateFlowImpl2.getValue()).floatValue() + ((nanoTime22 - nanoTime) / 1.0E9f)));
                    j = cardDesignLibraryScene.frameIntervalMs;
                    this.$timeoutMillis = nanoTime22;
                    this.label = 2;
                    if (JobKt.delay(j, this) != coroutineSingletons9) {
                        nanoTime = nanoTime22;
                        if (!cardDesignLibraryScene.zoomAnimator.isAnimating()) {
                        }
                        long nanoTime222 = System.nanoTime();
                        StateFlowImpl stateFlowImpl22 = cardDesignLibraryScene._animationTime;
                        stateFlowImpl22.updateState(null, new Float(((Number) stateFlowImpl22.getValue()).floatValue() + ((nanoTime222 - nanoTime) / 1.0E9f)));
                        j = cardDesignLibraryScene.frameIntervalMs;
                        this.$timeoutMillis = nanoTime222;
                        this.label = 2;
                        if (JobKt.delay(j, this) != coroutineSingletons9) {
                        }
                    }
                    return coroutineSingletons9;
                }
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UpdateEarnerModeRequest updateEarnerModeRequest = new UpdateEarnerModeRequest(EarnerModeOperation.EARNER_MODE_OPERATION_ENABLE, Duration.ofSeconds(this.$timeoutMillis), new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    PaychecksAppService paychecksAppService = (PaychecksAppService) ((com.google.zxing.Result) this.$onApplyCompletedSignal).text;
                    this.label = 1;
                    updateEarnerMode = paychecksAppService.updateEarnerMode(updateEarnerModeRequest, this);
                    if (updateEarnerMode == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    updateEarnerMode = obj;
                }
                ApiResult apiResult = (ApiResult) updateEarnerMode;
                if (apiResult instanceof ApiResult.Success) {
                    return EarnerModeResult.Success.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return new EarnerModeResult.Failure((ApiResult.Failure) apiResult);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 10:
                RealColdStartIntegrityChecker realColdStartIntegrityChecker = (RealColdStartIntegrityChecker) this.$onApplyCompletedSignal;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                realColdStartIntegrityChecker.clientSyncer.sync(SyncTrigger.APP_LAUNCH, SyncScope.Global.INSTANCE);
                long j8 = this.$timeoutMillis;
                RealKeyStoreProvider$load$2 realKeyStoreProvider$load$2 = new RealKeyStoreProvider$load$2(realColdStartIntegrityChecker, continuation, 12);
                this.label = 1;
                Object m4185withTimeoutOrNullKLykuaI = JobKt.m4185withTimeoutOrNullKLykuaI(j8, realKeyStoreProvider$load$2, this);
                return m4185withTimeoutOrNullKLykuaI == coroutineSingletons11 ? coroutineSingletons11 : m4185withTimeoutOrNullKLykuaI;
            case 11:
                FlowCollector flowCollector = (FlowCollector) this.$onApplyCompletedSignal;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.FALSE;
                    this.$onApplyCompletedSignal = flowCollector;
                    this.label = 1;
                    break;
                } else if (i13 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i13 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = Boolean.TRUE;
                    this.$onApplyCompletedSignal = null;
                    this.label = 3;
                    break;
                } else {
                    if (i13 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j9 = this.$timeoutMillis;
                this.$onApplyCompletedSignal = flowCollector;
                this.label = 2;
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j10 = this.$timeoutMillis;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j10, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                com.squareup.cash.mooncake.compose_ui.components.TooltipState tooltipState2 = (com.squareup.cash.mooncake.compose_ui.components.TooltipState) this.$onApplyCompletedSignal;
                StandaloneCoroutine standaloneCoroutine2 = tooltipState2.dismissJob;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(null);
                }
                JobKt.launch$default(tooltipState2.scope, null, null, new MusicPresenter$models$3$1(tooltipState2, continuation, 4), 3);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long j11 = this.$timeoutMillis;
                        ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2((RealThreeDsWarningsRepository) this.$onApplyCompletedSignal, continuation, i);
                        this.label = 1;
                        withTimeout = JobKt.withTimeout(j11, anonymousClass2, this);
                        if (withTimeout == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withTimeout = obj;
                    }
                    failure = ((kotlin.Result) withTimeout).value;
                } catch (TimeoutCancellationException e) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    failure = new Result.Failure(e);
                }
                return new kotlin.Result(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashControl$applyScreenFlash$3(long j, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$timeoutMillis = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashControl$applyScreenFlash$3(CardDesignLibraryScene cardDesignLibraryScene, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$onApplyCompletedSignal = cardDesignLibraryScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlashControl$applyScreenFlash$3(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onApplyCompletedSignal = obj;
        this.$timeoutMillis = j;
    }
}
