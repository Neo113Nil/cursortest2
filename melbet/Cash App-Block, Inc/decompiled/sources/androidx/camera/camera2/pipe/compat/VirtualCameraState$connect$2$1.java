package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.ResultListener;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConfigQueryResult;
import androidx.camera.camera2.pipe.OutputStream$Config;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.SharedElement;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1;
import androidx.compose.foundation.gestures.DefaultTransformableState;
import androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NonTouchScrollingLogic;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda8;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import radiography.internal.RenderTreeStringKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VirtualCameraState$connect$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $state;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCameraState$connect$2$1(Recorder.AnonymousClass3 anonymousClass3, SliderDraggableState$drag$2 sliderDraggableState$drag$2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        MutatePriority mutatePriority = MutatePriority.Default;
        this.$state = anonymousClass3;
        this.this$0 = sliderDraggableState$drag$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new VirtualCameraState$connect$2$1((Flow) this.$state, (VirtualCameraState) obj2, continuation, 0);
            case 1:
                return new VirtualCameraState$connect$2$1((ComposePredictiveBackHandler) obj2, continuation, 1);
            case 2:
                return new VirtualCameraState$connect$2$1((List) this.$state, (CapturePipelineTorchCorrection) obj2, continuation, 2);
            case 3:
                return new VirtualCameraState$connect$2$1((ResultListener) this.$state, (CapturePipelineImpl) obj2, continuation, 3);
            case 4:
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                return new VirtualCameraState$connect$2$1((DeferredUseCaseCameraRequestControl) this.$state, continuation, (List) obj2);
            case 5:
                return new VirtualCameraState$connect$2$1((Recorder.AnonymousClass3) this.$state, (CameraGraphConfigProvider.CameraGraphCreationResult) obj2, continuation, 5);
            case 6:
                return new VirtualCameraState$connect$2$1((List) this.$state, (StillCaptureRequestControl.CaptureRequest) obj2, continuation, 6);
            case 7:
                return new VirtualCameraState$connect$2$1((Function1) this.$state, (CompletableDeferredImpl) obj2, continuation, 7);
            case 8:
                return new VirtualCameraState$connect$2$1((UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1) this.$state, (ArrayList) obj2, continuation, 8);
            case 9:
                VirtualCameraState$connect$2$1 virtualCameraState$connect$2$1 = new VirtualCameraState$connect$2$1((UnleashContext) obj2, continuation, 9);
                virtualCameraState$connect$2$1.$state = obj;
                return virtualCameraState$connect$2$1;
            case 10:
                VirtualCameraState$connect$2$1 virtualCameraState$connect$2$12 = new VirtualCameraState$connect$2$1((Camera2CameraStatusMonitor) obj2, continuation, 10);
                virtualCameraState$connect$2$12.$state = obj;
                return virtualCameraState$connect$2$12;
            case 11:
                VirtualCameraState$connect$2$1 virtualCameraState$connect$2$13 = new VirtualCameraState$connect$2$1((Camera2DeviceCache) obj2, continuation, 11);
                virtualCameraState$connect$2$13.$state = obj;
                return virtualCameraState$connect$2$13;
            case 12:
                VirtualCameraState$connect$2$1 virtualCameraState$connect$2$14 = new VirtualCameraState$connect$2$1((PruningCamera2DeviceManager) obj2, continuation, 12);
                virtualCameraState$connect$2$14.$state = obj;
                return virtualCameraState$connect$2$14;
            case 13:
                return new VirtualCameraState$connect$2$1((e0) this.$state, obj2, continuation, 13);
            case 14:
                return new VirtualCameraState$connect$2$1((SharedElement) this.$state, (SpringSpec) obj2, continuation, 14);
            case 15:
                return new VirtualCameraState$connect$2$1((MutableInteractionSourceImpl) this.$state, (HoverInteraction$Enter) obj2, continuation, 15);
            case 16:
                return new VirtualCameraState$connect$2$1((MutableInteractionSourceImpl) this.$state, (HoverInteraction$Exit) obj2, continuation, 16);
            case 17:
                return new VirtualCameraState$connect$2$1((AnchoredDraggableNode) this.$state, (DragEvent.DragStopped) obj2, continuation, 17);
            case 18:
                Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) this.$state;
                MutatePriority mutatePriority = MutatePriority.Default;
                return new VirtualCameraState$connect$2$1(anonymousClass3, (SliderDraggableState$drag$2) obj2, continuation);
            case 19:
                DefaultTransformableState defaultTransformableState = (DefaultTransformableState) this.$state;
                MutatePriority mutatePriority2 = MutatePriority.Default;
                return new VirtualCameraState$connect$2$1(defaultTransformableState, (PoolsListPresenter$models$2$2) obj2, continuation);
            case 20:
                VirtualCameraState$connect$2$1 virtualCameraState$connect$2$15 = new VirtualCameraState$connect$2$1((MouseWheelScrollingLogic) obj2, continuation, 20);
                virtualCameraState$connect$2$15.$state = obj;
                return virtualCameraState$connect$2$15;
            case 21:
                return new VirtualCameraState$connect$2$1((NonTouchScrollingLogic) this.$state, (Function2) obj2, continuation, 21);
            case 22:
                return new VirtualCameraState$connect$2$1((DragEvent.DragStopped) this.$state, (ScrollableNode) obj2, continuation, 22);
            case 23:
                return new VirtualCameraState$connect$2$1((Job) this.$state, (PressGestureScopeImpl) obj2, continuation, 23);
            case 24:
                return new VirtualCameraState$connect$2$1((MutableInteractionSourceImpl) this.$state, (MutableState) obj2, continuation, 24);
            case 25:
                return new VirtualCameraState$connect$2$1((PointerInputScope) this.$state, (PagerState) obj2, continuation, 25);
            case 26:
                return new VirtualCameraState$connect$2$1((PointerInputScope) this.$state, (TextFieldSelectionManager) obj2, continuation, 26);
            case 27:
                return new VirtualCameraState$connect$2$1((AndroidLegacyPlatformTextInputServiceAdapter) this.$state, (Recorder.AnonymousClass1) obj2, continuation, 27);
            case 28:
                return new VirtualCameraState$connect$2$1((LegacyAdaptingPlatformTextInputModifierNode) this.$state, (FlowExtKt$simpleScan$1) obj2, continuation, 28);
            default:
                return new VirtualCameraState$connect$2$1((KeyCommand) this.$state, (TextFieldDecoratorModifierNode) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((VirtualCameraState$connect$2$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((VirtualCameraState$connect$2$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((VirtualCameraState$connect$2$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((VirtualCameraState$connect$2$1) create((CameraRequest) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((VirtualCameraState$connect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0.cut(r4) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.paste(r4) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r0.copy(false, r4) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0827, code lost:
    
        if (r0.join(r4) == r3) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x081a, code lost:
    
        if (r5.join(r4) == r3) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0802, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r7, r4) == r3) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (androidx.compose.runtime.Updater.withFrameMillis(r1, r4) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0196, code lost:
    
        if (r1.reset(r4) == r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        if (r1.join(r4) == r0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0271  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0271 -> B:117:0x0234). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        CompletableDeferredImpl m36setTorchAsyncOup_wC0$camera_camera2;
        CompletableDeferredImpl m36setTorchAsyncOup_wC0$camera_camera22;
        Camera2Backend camera2Backend;
        Object m63isConfigSupportedNpXggIU;
        Object awaitAll;
        Object invoke;
        Object invoke2;
        ArrayList arrayList;
        Object processRequestCloseAll;
        CoroutineScope coroutineScope;
        Object obj2;
        float mo236toPx0680j_4;
        float mo236toPx0680j_42;
        ScrollingLogic scrollingLogic;
        VirtualCameraState$connect$2$1 virtualCameraState$connect$2$1;
        VirtualCameraState$connect$2$1 virtualCameraState$connect$2$12 = this;
        int i = 6;
        int i2 = 4;
        int i3 = 0;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        Continuation continuation = null;
        switch (virtualCameraState$connect$2$12.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = virtualCameraState$connect$2$12.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) virtualCameraState$connect$2$12.$state;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2((VirtualCameraState) virtualCameraState$connect$2$12.this$0, i5);
                    virtualCameraState$connect$2$12.label = 1;
                    if (flow.collect(lazyPagingItems$collectLoadState$2, virtualCameraState$connect$2$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = virtualCameraState$connect$2$12.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (composePredictiveBackHandler.isBackEnabled()) {
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        Function2 function2 = composePredictiveBackHandler.currentOnBack;
                        BufferedChannel bufferedChannel = composePredictiveBackHandler.activeChannel;
                        bufferedChannel.getClass();
                        FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i2, FlowKt.consumeAsFlow(bufferedChannel), new MulticastedPagingData$asPagingData$2(ref$BooleanRef2, continuation, i6));
                        virtualCameraState$connect$2$12.$state = ref$BooleanRef2;
                        virtualCameraState$connect$2$12.label = 1;
                        if (function2.invoke(flowKt__MergeKt$flatMapMerge$$inlined$map$1, virtualCameraState$connect$2$12) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                    }
                    return Unit.INSTANCE;
                }
                if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) virtualCameraState$connect$2$12.$state;
                SafeTrace.throwOnFailure(obj);
                if (!ref$BooleanRef.element) {
                    a$$ExternalSyntheticBUOutline0.m$1("You must collect the progress flow");
                    return null;
                }
                return Unit.INSTANCE;
            case 2:
                TorchControl torchControl = ((CapturePipelineTorchCorrection) virtualCameraState$connect$2$12.this$0).torchControl;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = virtualCameraState$connect$2$12.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) virtualCameraState$connect$2$12.$state;
                    virtualCameraState$connect$2$12.label = 1;
                    break;
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Re-enable Torch to correct the Torch state, done");
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m36setTorchAsyncOup_wC0$camera_camera22 = torchControl.m36setTorchAsyncOup_wC0$camera_camera2(2, true, (r3 & 4) == 0);
                    virtualCameraState$connect$2$12.label = 3;
                    break;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "Re-enable Torch to correct the Torch state");
                }
                m36setTorchAsyncOup_wC0$camera_camera2 = torchControl.m36setTorchAsyncOup_wC0$camera_camera2(0, true, (r3 & 4) == 0);
                virtualCameraState$connect$2$12.label = 2;
                break;
            case 3:
                ResultListener resultListener = (ResultListener) virtualCameraState$connect$2$12.$state;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = virtualCameraState$connect$2$12.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl completableDeferredImpl = resultListener.completeSignal;
                    virtualCameraState$connect$2$12.label = 1;
                    if (completableDeferredImpl.join(virtualCameraState$connect$2$12) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((CapturePipelineImpl) virtualCameraState$connect$2$12.this$0).requestListener.removeListener(resultListener);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = virtualCameraState$connect$2$12.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UseCaseCameraRequestControlImpl access$getOrCreateImpl = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) virtualCameraState$connect$2$12.$state);
                List list2 = (List) virtualCameraState$connect$2$12.this$0;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                Deferred removeParametersAsync = access$getOrCreateImpl.removeParametersAsync(list2);
                virtualCameraState$connect$2$12.label = 1;
                Object awaitInternal = ((CompletableDeferredImpl) removeParametersAsync).awaitInternal(virtualCameraState$connect$2$12);
                return awaitInternal == coroutineSingletons5 ? coroutineSingletons5 : awaitInternal;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = virtualCameraState$connect$2$12.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) ((Recorder.AnonymousClass3) virtualCameraState$connect$2$12.$state).val$recordingToStart;
                    CameraGraph$Config cameraGraph$Config = ((CameraGraphConfigProvider.CameraGraphCreationResult) virtualCameraState$connect$2$12.this$0).config;
                    virtualCameraState$connect$2$12.label = 1;
                    synchronized (cameraPipeImpl.lock) {
                        if (cameraPipeImpl.shutdown) {
                            throw new IllegalStateException("Check failed.");
                        }
                        camera2Backend = ((CameraBackendsImpl) cameraPipeImpl.component.provideCameraBackendsProvider.get()).f1default;
                    }
                    if (camera2Backend == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    m63isConfigSupportedNpXggIU = camera2Backend.m63isConfigSupportedNpXggIU(cameraGraph$Config, virtualCameraState$connect$2$12);
                    if (m63isConfigSupportedNpXggIU == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m63isConfigSupportedNpXggIU = obj;
                }
                CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult = (CameraGraphConfigProvider.CameraGraphCreationResult) virtualCameraState$connect$2$12.this$0;
                ConfigQueryResult configQueryResult = (ConfigQueryResult) m63isConfigSupportedNpXggIU;
                int i13 = configQueryResult.value;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    List list3 = cameraGraphCreationResult.config.streams;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        List<OutputStream$Config> list4 = ((CameraStream.Config) it.next()).outputs;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        for (OutputStream$Config outputStream$Config : list4) {
                            arrayList3.add("size=" + outputStream$Config.size + ", format=" + ((Object) StreamFormat.m56toStringimpl(outputStream$Config.f838format)) + ", dynamicRangeProfile" + outputStream$Config.dynamicRangeProfile);
                        }
                        arrayList2.add(arrayList3);
                    }
                    StringBuilder sb = new StringBuilder("FeatureCombinationQueryImpl#isSupported: result = ");
                    sb.append((Object) (i13 == 1 ? "SUPPORTED" : i13 == 2 ? "UNSUPPORTED" : "UNKNOWN"));
                    sb.append(" for sessionParameters = ");
                    sb.append(cameraGraphCreationResult.config.sessionParameters);
                    sb.append(" and streams = ");
                    sb.append(arrayList2);
                    Log.d("CXCP", sb.toString());
                }
                return Boolean.valueOf(configQueryResult.value == 1);
            case 6:
                StillCaptureRequestControl.CaptureRequest captureRequest = (StillCaptureRequestControl.CaptureRequest) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = virtualCameraState$connect$2$12.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: Waiting for deferred list from " + captureRequest);
                    }
                    List list5 = (List) virtualCameraState$connect$2$12.$state;
                    virtualCameraState$connect$2$12.label = 1;
                    awaitAll = AwaitKt.awaitAll(list5, virtualCameraState$connect$2$12);
                    if (awaitAll == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    awaitAll = obj;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: Waiting for deferred list from " + captureRequest + " done");
                }
                return awaitAll;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = virtualCameraState$connect$2$12.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = (Function1) virtualCameraState$connect$2$12.$state;
                    virtualCameraState$connect$2$12.label = 1;
                    invoke = function1.invoke(virtualCameraState$connect$2$12);
                    if (invoke == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                RenderTreeStringKt.propagateTo((Deferred) invoke, (CompletableDeferredImpl) virtualCameraState$connect$2$12.this$0);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = virtualCameraState$connect$2$12.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 = (UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1) virtualCameraState$connect$2$12.$state;
                    virtualCameraState$connect$2$12.label = 1;
                    invoke2 = useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1.invoke(virtualCameraState$connect$2$12);
                    if (invoke2 == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke2 = obj;
                }
                ArrayList arrayList4 = (ArrayList) virtualCameraState$connect$2$12.this$0;
                for (Object obj3 : (Iterable) invoke2) {
                    int i17 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    RenderTreeStringKt.propagateTo((Deferred) obj3, (CompletableDeferred) arrayList4.get(i3));
                    i3 = i17;
                }
                return Unit.INSTANCE;
            case 9:
                UnleashContext unleashContext = (UnleashContext) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = virtualCameraState$connect$2$12.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final ProducerScope producerScope = (ProducerScope) virtualCameraState$connect$2$12.$state;
                    CameraManager.AvailabilityCallback availabilityCallback = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1
                        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                        public final void onCameraAvailable(String str) {
                            str.getClass();
                            CameraId.m45constructorimpl(str);
                            ChannelsKt__ChannelsKt.trySendBlocking(new CameraId(str), ProducerScope.this);
                        }
                    };
                    CameraManager cameraManager = (CameraManager) ((Provider) unleashContext.userId).get();
                    cameraManager.getClass();
                    Executor executor = (Executor) ((Threads) unleashContext.sessionId)._camera2Executor.getValue();
                    executor.getClass();
                    cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(i2, cameraManager, availabilityCallback);
                    virtualCameraState$connect$2$12.label = 1;
                    if (TuplesKt.awaitClose(producerScope, dialogHostKt$$ExternalSyntheticLambda0, virtualCameraState$connect$2$12) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                Camera2CameraStatusMonitor camera2CameraStatusMonitor = (Camera2CameraStatusMonitor) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = virtualCameraState$connect$2$12.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerScope producerScope2 = (ProducerScope) virtualCameraState$connect$2$12.$state;
                    Camera2DeviceCache$createCameraIdListFlow$1$callback$1 camera2DeviceCache$createCameraIdListFlow$1$callback$1 = new Camera2DeviceCache$createCameraIdListFlow$1$callback$1(producerScope2, camera2CameraStatusMonitor);
                    CameraManager cameraManager2 = camera2CameraStatusMonitor.manager;
                    cameraManager2.getClass();
                    Executor executor2 = camera2CameraStatusMonitor.threads.lightweightExecutor;
                    executor2.getClass();
                    cameraManager2.registerAvailabilityCallback(executor2, camera2DeviceCache$createCameraIdListFlow$1$callback$1);
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda02 = new DialogHostKt$$ExternalSyntheticLambda0(5, camera2CameraStatusMonitor, camera2DeviceCache$createCameraIdListFlow$1$callback$1);
                    virtualCameraState$connect$2$12.label = 1;
                    if (TuplesKt.awaitClose(producerScope2, dialogHostKt$$ExternalSyntheticLambda02, virtualCameraState$connect$2$12) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = virtualCameraState$connect$2$12.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerScope producerScope3 = (ProducerScope) virtualCameraState$connect$2$12.$state;
                    Camera2DeviceCache$createCameraIdListFlow$1$callback$1 camera2DeviceCache$createCameraIdListFlow$1$callback$12 = new Camera2DeviceCache$createCameraIdListFlow$1$callback$1((Camera2DeviceCache) virtualCameraState$connect$2$12.this$0, producerScope3);
                    CameraManager cameraManager3 = (CameraManager) ((Camera2DeviceCache) virtualCameraState$connect$2$12.this$0).cameraManager.get();
                    cameraManager3.registerAvailabilityCallback(camera2DeviceCache$createCameraIdListFlow$1$callback$12, ((Camera2DeviceCache) virtualCameraState$connect$2$12.this$0).threads.getCamera2Handler());
                    Camera2DeviceCache camera2DeviceCache = (Camera2DeviceCache) virtualCameraState$connect$2$12.this$0;
                    synchronized (camera2DeviceCache.lock) {
                        arrayList = camera2DeviceCache.openableCameras;
                    }
                    Camera2DeviceCache camera2DeviceCache2 = (Camera2DeviceCache) virtualCameraState$connect$2$12.this$0;
                    if (arrayList != null) {
                        Camera2DeviceCache.sendCameraIdList(producerScope3, arrayList);
                    } else {
                        ArrayList readCameraIds = camera2DeviceCache2.readCameraIds();
                        if (readCameraIds != null) {
                            Camera2DeviceCache.sendCameraIdList(producerScope3, readCameraIds);
                        }
                    }
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda03 = new DialogHostKt$$ExternalSyntheticLambda0(i, cameraManager3, camera2DeviceCache$createCameraIdListFlow$1$callback$12);
                    virtualCameraState$connect$2$12.label = 1;
                    if (TuplesKt.awaitClose(producerScope3, dialogHostKt$$ExternalSyntheticLambda03, virtualCameraState$connect$2$12) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = virtualCameraState$connect$2$12.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraRequest cameraRequest = (CameraRequest) virtualCameraState$connect$2$12.$state;
                    PruningCamera2DeviceManager pruningCamera2DeviceManager = (PruningCamera2DeviceManager) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (cameraRequest instanceof RequestOpen) {
                        processRequestCloseAll = pruningCamera2DeviceManager.processRequestOpen((RequestOpen) cameraRequest, virtualCameraState$connect$2$12);
                        if (processRequestCloseAll != coroutineSingletons13) {
                            processRequestCloseAll = Unit.INSTANCE;
                        }
                    } else if (cameraRequest instanceof RequestClose) {
                        processRequestCloseAll = pruningCamera2DeviceManager.processRequestClose((RequestClose) cameraRequest, virtualCameraState$connect$2$12);
                        if (processRequestCloseAll != coroutineSingletons13) {
                            processRequestCloseAll = Unit.INSTANCE;
                        }
                    } else if (cameraRequest instanceof RequestCloseById) {
                        processRequestCloseAll = pruningCamera2DeviceManager.processRequestCloseById((RequestCloseById) cameraRequest, virtualCameraState$connect$2$12);
                        if (processRequestCloseAll != coroutineSingletons13) {
                            processRequestCloseAll = Unit.INSTANCE;
                        }
                    } else {
                        if (!(cameraRequest instanceof RequestCloseAll)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        processRequestCloseAll = pruningCamera2DeviceManager.processRequestCloseAll((RequestCloseAll) cameraRequest, virtualCameraState$connect$2$12);
                        if (processRequestCloseAll != coroutineSingletons13) {
                            processRequestCloseAll = Unit.INSTANCE;
                        }
                    }
                    if (processRequestCloseAll == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                Object obj4 = virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = virtualCameraState$connect$2$12.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", "PruningProcessingQueue: Processing " + obj4);
                    VirtualCameraState$connect$2$1 virtualCameraState$connect$2$13 = (VirtualCameraState$connect$2$1) ((e0) virtualCameraState$connect$2$12.$state).c;
                    virtualCameraState$connect$2$12.label = 1;
                    if (virtualCameraState$connect$2$13.invoke(obj4, virtualCameraState$connect$2$12) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = virtualCameraState$connect$2$12.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = ((SharedElement) virtualCameraState$connect$2$12.$state).momentumAnimation;
                    Offset offset = new Offset(0L);
                    SpringSpec springSpec = (SpringSpec) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (Animatable.animateTo$default(animatable, offset, springSpec, null, null, this, 12) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = virtualCameraState$connect$2$12.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) virtualCameraState$connect$2$12.$state;
                    HoverInteraction$Enter hoverInteraction$Enter = (HoverInteraction$Enter) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (mutableInteractionSourceImpl.emit(hoverInteraction$Enter, virtualCameraState$connect$2$12) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = virtualCameraState$connect$2$12.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) virtualCameraState$connect$2$12.$state;
                    HoverInteraction$Exit hoverInteraction$Exit = (HoverInteraction$Exit) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (mutableInteractionSourceImpl2.emit(hoverInteraction$Exit, virtualCameraState$connect$2$12) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) virtualCameraState$connect$2$12.$state;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = virtualCameraState$connect$2$12.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = ((DragEvent.DragStopped) virtualCameraState$connect$2$12.this$0).velocity;
                    long m1071timesadjELrA = anchoredDraggableNode.isReverseDirection$1() ? Velocity.m1071timesadjELrA(j, -1.0f) : Velocity.m1071timesadjELrA(j, 1.0f);
                    float m1068getYimpl = anchoredDraggableNode.orientation == Orientation.Vertical ? Velocity.m1068getYimpl(m1071timesadjELrA) : Velocity.m1067getXimpl(m1071timesadjELrA);
                    virtualCameraState$connect$2$12.label = 1;
                    if (AnchoredDraggableNode.access$fling(anchoredDraggableNode, m1068getYimpl, virtualCameraState$connect$2$12) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i26 != 1 && i26 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = virtualCameraState$connect$2$12.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) virtualCameraState$connect$2$12.$state;
                    MutatorMutex mutatorMutex = (MutatorMutex) anonymousClass3.this$0;
                    DefaultDraggable2DState$drag2DScope$1 defaultDraggable2DState$drag2DScope$1 = (DefaultDraggable2DState$drag2DScope$1) anonymousClass3.val$recordingToStart;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    SliderDraggableState$drag$2 sliderDraggableState$drag$2 = (SliderDraggableState$drag$2) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (mutatorMutex.mutateWith(defaultDraggable2DState$drag2DScope$1, mutatePriority, sliderDraggableState$drag$2, virtualCameraState$connect$2$12) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = virtualCameraState$connect$2$12.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultTransformableState defaultTransformableState = (DefaultTransformableState) virtualCameraState$connect$2$12.$state;
                    MutatorMutex mutatorMutex2 = defaultTransformableState.transformMutex;
                    DefaultTransformableState$transformScope$1 defaultTransformableState$transformScope$1 = defaultTransformableState.transformScope;
                    MutatePriority mutatePriority2 = MutatePriority.UserInput;
                    SliderDraggableState$drag$2 sliderDraggableState$drag$22 = new SliderDraggableState$drag$2(defaultTransformableState, (PoolsListPresenter$models$2$2) virtualCameraState$connect$2$12.this$0, continuation, 17);
                    virtualCameraState$connect$2$12.label = 1;
                    if (mutatorMutex2.mutateWith(defaultTransformableState$transformScope$1, mutatePriority2, sliderDraggableState$drag$22, virtualCameraState$connect$2$12) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = virtualCameraState$connect$2$12.label;
                try {
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) virtualCameraState$connect$2$12.$state;
                    } else {
                        if (i29 == 1) {
                            coroutineScope = (CoroutineScope) virtualCameraState$connect$2$12.$state;
                            SafeTrace.throwOnFailure(obj);
                            obj2 = obj;
                            CoroutineScope coroutineScope2 = coroutineScope;
                            mo236toPx0680j_4 = mouseWheelScrollingLogic.density.mo236toPx0680j_4(6.0f);
                            mo236toPx0680j_42 = mouseWheelScrollingLogic.density.mo236toPx0680j_4(1.0f);
                            scrollingLogic = mouseWheelScrollingLogic.scrollingLogic;
                            virtualCameraState$connect$2$12.$state = coroutineScope2;
                            virtualCameraState$connect$2$12.label = 2;
                            virtualCameraState$connect$2$1 = virtualCameraState$connect$2$12;
                            virtualCameraState$connect$2$12 = virtualCameraState$connect$2$1;
                            if (MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(mouseWheelScrollingLogic, scrollingLogic, (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj2, mo236toPx0680j_4, mo236toPx0680j_42, virtualCameraState$connect$2$1) != coroutineSingletons21) {
                                coroutineScope = coroutineScope2;
                            }
                            return coroutineSingletons21;
                        }
                        if (i29 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        coroutineScope = (CoroutineScope) virtualCameraState$connect$2$12.$state;
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                        mouseWheelScrollingLogic.receivingMouseWheelEventsJob = null;
                        return Unit.INSTANCE;
                    }
                    BufferedChannel bufferedChannel2 = mouseWheelScrollingLogic.channel;
                    virtualCameraState$connect$2$12.$state = coroutineScope;
                    virtualCameraState$connect$2$12.label = 1;
                    bufferedChannel2.getClass();
                    obj2 = BufferedChannel.receive$suspendImpl(bufferedChannel2, virtualCameraState$connect$2$12);
                    if (obj2 == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                    CoroutineScope coroutineScope22 = coroutineScope;
                    mo236toPx0680j_4 = mouseWheelScrollingLogic.density.mo236toPx0680j_4(6.0f);
                    mo236toPx0680j_42 = mouseWheelScrollingLogic.density.mo236toPx0680j_4(1.0f);
                    scrollingLogic = mouseWheelScrollingLogic.scrollingLogic;
                    virtualCameraState$connect$2$12.$state = coroutineScope22;
                    virtualCameraState$connect$2$12.label = 2;
                    virtualCameraState$connect$2$1 = virtualCameraState$connect$2$12;
                    virtualCameraState$connect$2$12 = virtualCameraState$connect$2$1;
                    if (MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(mouseWheelScrollingLogic, scrollingLogic, (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj2, mo236toPx0680j_4, mo236toPx0680j_42, virtualCameraState$connect$2$1) != coroutineSingletons21) {
                    }
                    return coroutineSingletons21;
                } catch (Throwable th) {
                    mouseWheelScrollingLogic.receivingMouseWheelEventsJob = null;
                    throw th;
                }
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = virtualCameraState$connect$2$12.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic scrollingLogic2 = ((NonTouchScrollingLogic) virtualCameraState$connect$2$12.$state).scrollingLogic;
                    MutatePriority mutatePriority3 = MutatePriority.UserInput;
                    Function2 function22 = (Function2) virtualCameraState$connect$2$12.this$0;
                    virtualCameraState$connect$2$12.label = 1;
                    if (scrollingLogic2.scroll(mutatePriority3, function22, virtualCameraState$connect$2$12) == coroutineSingletons22) {
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
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = virtualCameraState$connect$2$12.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DragEvent.DragStopped dragStopped = (DragEvent.DragStopped) virtualCameraState$connect$2$12.$state;
                    float f = dragStopped.isIndirectPointerEvent ? -1.0f : 1.0f;
                    ScrollingLogic scrollingLogic3 = ((ScrollableNode) virtualCameraState$connect$2$12.this$0).scrollingLogic;
                    long m1071timesadjELrA2 = Velocity.m1071timesadjELrA(dragStopped.velocity, f);
                    virtualCameraState$connect$2$12.label = 1;
                    if (scrollingLogic3.m244onScrollStoppedBMRW4eQ(m1071timesadjELrA2, false, virtualCameraState$connect$2$12) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = virtualCameraState$connect$2$12.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) virtualCameraState$connect$2$12.$state;
                    virtualCameraState$connect$2$12.label = 1;
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                PressGestureScopeImpl pressGestureScopeImpl = (PressGestureScopeImpl) virtualCameraState$connect$2$12.this$0;
                virtualCameraState$connect$2$12.label = 2;
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = virtualCameraState$connect$2$12.label;
                if (i33 != 0) {
                    if (i33 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList5 = new ArrayList();
                SharedFlowImpl sharedFlowImpl = ((MutableInteractionSourceImpl) virtualCameraState$connect$2$12.$state).interactions;
                ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(i2, arrayList5, (MutableState) virtualCameraState$connect$2$12.this$0);
                virtualCameraState$connect$2$12.label = 1;
                sharedFlowImpl.collect(anonymousClass1, virtualCameraState$connect$2$12);
                return coroutineSingletons25;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = virtualCameraState$connect$2$12.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) virtualCameraState$connect$2$12.$state;
                    LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1 anonymousClass12 = new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((PagerState) virtualCameraState$connect$2$12.this$0, continuation, i6);
                    virtualCameraState$connect$2$12.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, anonymousClass12, virtualCameraState$connect$2$12) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = virtualCameraState$connect$2$12.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope2 = (PointerInputScope) virtualCameraState$connect$2$12.$state;
                    CoreTextFieldKt$$ExternalSyntheticLambda8 coreTextFieldKt$$ExternalSyntheticLambda8 = new CoreTextFieldKt$$ExternalSyntheticLambda8((TextFieldSelectionManager) virtualCameraState$connect$2$12.this$0, i6);
                    virtualCameraState$connect$2$12.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope2, null, null, coreTextFieldKt$$ExternalSyntheticLambda8, virtualCameraState$connect$2$12, 7) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = virtualCameraState$connect$2$12.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(27);
                    virtualCameraState$connect$2$12.label = 1;
                    break;
                } else {
                    if (i36 != 1) {
                        if (i36 == 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                MutableSharedFlow stylusHandwritingTrigger = ((AndroidLegacyPlatformTextInputServiceAdapter) virtualCameraState$connect$2$12.$state).getStylusHandwritingTrigger();
                if (stylusHandwritingTrigger == null) {
                    return Unit.INSTANCE;
                }
                LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2((Recorder.AnonymousClass1) virtualCameraState$connect$2$12.this$0, i4);
                virtualCameraState$connect$2$12.label = 2;
                SharedFlowImpl.collect$suspendImpl((SharedFlowImpl) stylusHandwritingTrigger, lazyPagingItems$collectLoadState$22, virtualCameraState$connect$2$12);
                return coroutineSingletons28;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = virtualCameraState$connect$2$12.label;
                if (i37 != 0) {
                    if (i37 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = (LegacyAdaptingPlatformTextInputModifierNode) virtualCameraState$connect$2$12.$state;
                FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = (FlowExtKt$simpleScan$1) virtualCameraState$connect$2$12.this$0;
                virtualCameraState$connect$2$12.label = 1;
                PlatformTextInputModifierNodeKt.establishTextInputSession(legacyAdaptingPlatformTextInputModifierNode, flowExtKt$simpleScan$1, virtualCameraState$connect$2$12);
                return coroutineSingletons29;
            default:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) virtualCameraState$connect$2$12.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = virtualCameraState$connect$2$12.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    switch (((KeyCommand) virtualCameraState$connect$2$12.$state).ordinal()) {
                        case 17:
                            TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.textFieldSelectionState;
                            virtualCameraState$connect$2$12.label = 1;
                            break;
                        case 18:
                            TextFieldSelectionState textFieldSelectionState2 = textFieldDecoratorModifierNode.textFieldSelectionState;
                            virtualCameraState$connect$2$12.label = 3;
                            break;
                        case 19:
                            TextFieldSelectionState textFieldSelectionState3 = textFieldDecoratorModifierNode.textFieldSelectionState;
                            virtualCameraState$connect$2$12.label = 2;
                            break;
                    }
                    return coroutineSingletons30;
                }
                if (i38 != 1 && i38 != 2 && i38 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCameraState$connect$2$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, List list) {
        super(2, continuation);
        this.$r8$classId = 4;
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        this.$state = deferredUseCaseCameraRequestControl;
        this.this$0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCameraState$connect$2$1(DefaultTransformableState defaultTransformableState, PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        MutatePriority mutatePriority = MutatePriority.Default;
        this.$state = defaultTransformableState;
        this.this$0 = poolsListPresenter$models$2$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VirtualCameraState$connect$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VirtualCameraState$connect$2$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
