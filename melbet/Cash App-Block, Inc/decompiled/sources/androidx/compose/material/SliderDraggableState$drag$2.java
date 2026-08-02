package androidx.compose.material;

import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.AndroidCameraState;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.ClosedReason;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RequestCloseAll;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Config;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.compose.SurfaceReplacedCancellationException;
import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl;
import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;
import androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DefaultTransformableState;
import androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1;
import androidx.compose.foundation.gestures.Draggable2DNode;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.presenters.RecipientAvatars;
import com.stripe.hcaptcha.HCaptcha;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.sync.MutexImpl;
import okio.Okio;
import papa.InteractionResult;
import papa.SafeTrace;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes3.dex */
public final class SliderDraggableState$drag$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public Object $dragPriority;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDraggableState$drag$2(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, Map map, Config.OptionPriority optionPriority) {
        super(2, continuation);
        this.$r8$classId = 2;
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$dragPriority = map;
        this.$block = optionPriority;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i) {
            case 0:
                return new SliderDraggableState$drag$2((SliderDraggableState) this.this$0, (MutatePriority) this.$dragPriority, (Function2) obj2, continuation, 0);
            case 1:
                SliderDraggableState$drag$2 sliderDraggableState$drag$2 = new SliderDraggableState$drag$2((PipeCameraPresenceSource) this.$dragPriority, (Ref$BooleanRef) obj2, continuation, 1);
                sliderDraggableState$drag$2.this$0 = obj;
                return sliderDraggableState$drag$2;
            case 2:
                DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl = (DeferredUseCaseCameraRequestControl) this.this$0;
                Map map = (Map) this.$dragPriority;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                return new SliderDraggableState$drag$2(deferredUseCaseCameraRequestControl, continuation, map, (Config.OptionPriority) obj2);
            case 3:
                return new SliderDraggableState$drag$2((DeferredUseCaseCameraRequestControl) this.this$0, continuation, (Camera2ImplConfig) this.$dragPriority, (Map) obj2);
            case 4:
                return new SliderDraggableState$drag$2((StillCaptureRequestControl) obj2, continuation, 4);
            case 5:
                return new SliderDraggableState$drag$2((Camera2Backend) obj2, continuation, 5);
            case 6:
                return new SliderDraggableState$drag$2((UnleashContext) this.this$0, (String) this.$dragPriority, (Camera2CameraAvailabilityMonitor$startMonitoring$2) obj2, continuation, 6);
            case 7:
                return new SliderDraggableState$drag$2((HCaptcha) this.this$0, (String) this.$dragPriority, (AndroidCameraState) obj2, continuation, 7);
            case 8:
                SliderDraggableState$drag$2 sliderDraggableState$drag$22 = new SliderDraggableState$drag$2((e0) obj2, continuation, 8);
                sliderDraggableState$drag$22.$dragPriority = obj;
                return sliderDraggableState$drag$22;
            case 9:
                SliderDraggableState$drag$2 sliderDraggableState$drag$23 = new SliderDraggableState$drag$2((SurfaceRequest) this.$dragPriority, (MutableState) obj2, continuation, 9);
                sliderDraggableState$drag$23.this$0 = obj;
                return sliderDraggableState$drag$23;
            case 10:
                SliderDraggableState$drag$2 sliderDraggableState$drag$24 = new SliderDraggableState$drag$2((Function2) obj2, (FilamentDisplayHelper) this.$dragPriority, continuation);
                sliderDraggableState$drag$24.this$0 = obj;
                return sliderDraggableState$drag$24;
            case 11:
                SliderDraggableState$drag$2 sliderDraggableState$drag$25 = new SliderDraggableState$drag$2((BaseViewfinderExternalSurfaceState) this.$dragPriority, (ViewfinderExternalSurfaceHolder) obj2, continuation, 11);
                sliderDraggableState$drag$25.this$0 = obj;
                return sliderDraggableState$drag$25;
            case 12:
                return new SliderDraggableState$drag$2((InteractionResult) obj2, continuation, 12);
            case 13:
                return new SliderDraggableState$drag$2((MutableInteractionSourceImpl) this.this$0, (PressInteraction.Cancel) this.$dragPriority, (DisposableHandle) obj2, continuation, 13);
            case 14:
                SliderDraggableState$drag$2 sliderDraggableState$drag$26 = new SliderDraggableState$drag$2((Function3) this.$dragPriority, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2, continuation, 14);
                sliderDraggableState$drag$26.this$0 = obj;
                return sliderDraggableState$drag$26;
            case 15:
                SliderDraggableState$drag$2 sliderDraggableState$drag$27 = new SliderDraggableState$drag$2((Function4) this.$dragPriority, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2, continuation, 15);
                sliderDraggableState$drag$27.this$0 = obj;
                return sliderDraggableState$drag$27;
            case 16:
                return new SliderDraggableState$drag$2((DefaultDraggableState) this.this$0, (MutatePriority) this.$dragPriority, (Function2) obj2, continuation, 16);
            case 17:
                SliderDraggableState$drag$2 sliderDraggableState$drag$28 = new SliderDraggableState$drag$2((DefaultTransformableState) this.$dragPriority, (PoolsListPresenter$models$2$2) obj2, continuation, 17);
                sliderDraggableState$drag$28.this$0 = obj;
                return sliderDraggableState$drag$28;
            case 18:
                SliderDraggableState$drag$2 sliderDraggableState$drag$29 = new SliderDraggableState$drag$2((DragGestureNode$startListeningForEvents$1) this.$dragPriority, (Draggable2DNode) obj2, continuation, 18);
                sliderDraggableState$drag$29.this$0 = obj;
                return sliderDraggableState$drag$29;
            case 19:
                SliderDraggableState$drag$2 sliderDraggableState$drag$210 = new SliderDraggableState$drag$2((DragGestureNode$startListeningForEvents$1) this.$dragPriority, (DraggableNode) obj2, continuation, 19);
                sliderDraggableState$drag$210.this$0 = obj;
                return sliderDraggableState$drag$210;
            case 20:
                SliderDraggableState$drag$2 sliderDraggableState$drag$211 = new SliderDraggableState$drag$2((DraggableNode) this.$dragPriority, (DragEvent.DragStopped) obj2, continuation, 20);
                sliderDraggableState$drag$211.this$0 = obj;
                return sliderDraggableState$drag$211;
            case 21:
                SliderDraggableState$drag$2 sliderDraggableState$drag$212 = new SliderDraggableState$drag$2((DragGestureNode$startListeningForEvents$1) this.$dragPriority, (ScrollingLogic) obj2, continuation, 21);
                sliderDraggableState$drag$212.this$0 = obj;
                return sliderDraggableState$drag$212;
            case 22:
                SliderDraggableState$drag$2 sliderDraggableState$drag$213 = new SliderDraggableState$drag$2((ScrollingLogic) this.$dragPriority, (Function2) obj2, continuation, 22);
                sliderDraggableState$drag$213.this$0 = obj;
                return sliderDraggableState$drag$213;
            case 23:
                SliderDraggableState$drag$2 sliderDraggableState$drag$214 = new SliderDraggableState$drag$2((Job) this.$dragPriority, (Function2) obj2, continuation, 23);
                sliderDraggableState$drag$214.this$0 = obj;
                return sliderDraggableState$drag$214;
            case 24:
                return new SliderDraggableState$drag$2((LazyLayoutItemAnimation) this.this$0, (FiniteAnimationSpec) this.$dragPriority, (GraphicsLayer) obj2, continuation, 24);
            case 25:
                return new SliderDraggableState$drag$2((TextContextMenuToolbarHandlerNode) this.$dragPriority, (TextContextMenuProvider) obj2, continuation, 25);
            case 26:
                return new SliderDraggableState$drag$2((TextFieldSelectionState) this.this$0, (PointerInputScope) this.$dragPriority, (DialogHostKt$$ExternalSyntheticLambda0) obj2, continuation, 26);
            case 27:
                SliderDraggableState$drag$2 sliderDraggableState$drag$215 = new SliderDraggableState$drag$2((State) this.$dragPriority, (Animatable) obj2, continuation, 27);
                sliderDraggableState$drag$215.this$0 = obj;
                return sliderDraggableState$drag$215;
            case 28:
                SliderDraggableState$drag$2 sliderDraggableState$drag$216 = new SliderDraggableState$drag$2((Function3) this.$dragPriority, (AnchoredDraggableState) obj2, continuation, 28);
                sliderDraggableState$drag$216.this$0 = obj;
                return sliderDraggableState$drag$216;
            default:
                SliderDraggableState$drag$2 sliderDraggableState$drag$217 = new SliderDraggableState$drag$2((Function4) this.$dragPriority, (AnchoredDraggableState) obj2, continuation, 29);
                sliderDraggableState$drag$217.this$0 = obj;
                return sliderDraggableState$drag$217;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((SliderDraggableState$drag$2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((SliderDraggableState$drag$2) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((SliderDraggableState$drag$2) create((DefaultDraggableAnchors) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((SliderDraggableState$drag$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((SliderDraggableState$drag$2) create((DefaultTransformableState$transformScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((SliderDraggableState$drag$2) create((DefaultDraggable2DState$drag2DScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((SliderDraggableState$drag$2) create((SliderState$dragScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((SliderDraggableState$drag$2) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((SliderDraggableState$drag$2) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((SliderDraggableState$drag$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((SliderDraggableState$drag$2) create((MapDraggableAnchors) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((SliderDraggableState$drag$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0207, code lost:
    
        if (r2.invoke(r1, r18) == r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f8, code lost:
    
        if (r2.join(r18) == r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x051d, code lost:
    
        if (r3.invokeSuspend(kotlin.Unit.INSTANCE) == r1) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04f3, code lost:
    
        if (r3.join(r18) == r1) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x079f, code lost:
    
        if (r3 == r0) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0808, code lost:
    
        if (r1 == r0) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
    
        if (r0.invoke(r18) == r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        if (r0.showTextContextMenu(r2, r18) == r7) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0619 A[Catch: all -> 0x05f8, CancellationException -> 0x0698, TRY_ENTER, TryCatch #9 {CancellationException -> 0x0698, all -> 0x05f8, blocks: (B:346:0x05f4, B:351:0x0619, B:353:0x063a, B:354:0x0646), top: B:345:0x05f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07c3  */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v58, types: [android.hardware.camera2.CameraDevice$StateCallback, androidx.camera.camera2.pipe.compat.AndroidCameraState] */
    /* JADX WARN: Type inference failed for: r1v59, types: [androidx.camera.camera2.pipe.compat.AndroidCameraState] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v26, types: [androidx.camera.video.Recorder$1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.hardware.camera2.CameraDevice] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0650 -> B:303:0x0654). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x079f -> B:367:0x07a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StillCaptureRequestControl stillCaptureRequestControl;
        MutexImpl mutexImpl;
        LinkedHashSet linkedHashSet;
        Iterator it;
        CoroutineScope coroutineScope;
        Ref$ObjectRef ref$ObjectRef;
        DeferredCoroutine async$default;
        CoroutineScope coroutineScope2;
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2;
        ?? r1;
        CoroutineScope coroutineScope3;
        int i = 4;
        int i2 = 6;
        int i3 = 0;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        ?? r8 = 0;
        r8 = 0;
        r8 = 0;
        r8 = 0;
        switch (this.$r8$classId) {
            case 0:
                SliderDraggableState sliderDraggableState = (SliderDraggableState) this.this$0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = sliderDraggableState.isDragging$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    MutatorMutex mutatorMutex = sliderDraggableState.scrollMutex;
                    SliderState$dragScope$1 sliderState$dragScope$1 = sliderDraggableState.dragScope;
                    MutatePriority mutatePriority = (MutatePriority) this.$dragPriority;
                    Function2 function2 = (Function2) this.$block;
                    this.label = 1;
                    if (mutatorMutex.mutateWith(sliderState$dragScope$1, mutatePriority, function2, this) == coroutineSingletons) {
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
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.$block;
                PipeCameraPresenceSource pipeCameraPresenceSource = (PipeCameraPresenceSource) this.$dragPriority;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) this.this$0;
                    Log.d("PipePresenceSrc", "Flow emitted new camera set: ".concat(CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63)));
                    if (!pipeCameraPresenceSource.isMonitoring.get()) {
                        Okio.boxInt(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
                    } else if (ref$BooleanRef.element) {
                        Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
                        ListenableFuture fetchData = pipeCameraPresenceSource.fetchData();
                        this.label = 1;
                        if (RecipientAvatars.await(fetchData, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        pipeCameraPresenceSource.updateState(list, null);
                    }
                    return Unit.INSTANCE;
                }
                if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ref$BooleanRef.element = false;
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 != 0) {
                    if (i9 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UseCaseCameraRequestControlImpl access$getOrCreateImpl = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) this.this$0);
                Map map = (Map) this.$dragPriority;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                Deferred parametersAsync = access$getOrCreateImpl.setParametersAsync(map, (Config.OptionPriority) this.$block);
                this.label = 1;
                Object awaitInternal = ((CompletableDeferredImpl) parametersAsync).awaitInternal(this);
                return awaitInternal == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Deferred updateCamera2ConfigAsync = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) this.this$0).updateCamera2ConfigAsync((Camera2ImplConfig) this.$dragPriority, (Map) this.$block);
                this.label = 1;
                Object awaitInternal2 = ((CompletableDeferredImpl) updateCamera2ConfigAsync).awaitInternal(this);
                return awaitInternal2 == coroutineSingletons4 ? coroutineSingletons4 : awaitInternal2;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StillCaptureRequestControl stillCaptureRequestControl2 = (StillCaptureRequestControl) this.$block;
                    MutexImpl mutexImpl2 = stillCaptureRequestControl2.mutex;
                    this.this$0 = mutexImpl2;
                    this.$dragPriority = stillCaptureRequestControl2;
                    this.label = 1;
                    if (mutexImpl2.lock(this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    stillCaptureRequestControl = stillCaptureRequestControl2;
                    mutexImpl = mutexImpl2;
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stillCaptureRequestControl = (StillCaptureRequestControl) this.$dragPriority;
                    mutexImpl = (MutexImpl) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                while (!stillCaptureRequestControl.pendingRequests.isEmpty()) {
                    try {
                        StillCaptureRequestControl.CaptureRequest captureRequest = (StillCaptureRequestControl.CaptureRequest) stillCaptureRequestControl.pendingRequests.poll();
                        if (captureRequest != null) {
                            captureRequest.result.completeExceptionally(new ImageCaptureException(3, "Capture request is cancelled due to a reset", null));
                        }
                    } finally {
                        mutexImpl.unlock(null);
                    }
                }
                mutexImpl.unlock(null);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Camera2Backend camera2Backend = (Camera2Backend) this.$block;
                    synchronized (camera2Backend.lock) {
                        linkedHashSet = camera2Backend.activeCameraControllers;
                    }
                    it = linkedHashSet.iterator();
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons6;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Camera2CameraController camera2CameraController = (Camera2CameraController) this.$dragPriority;
                it = (Iterator) this.this$0;
                SafeTrace.throwOnFailure(obj);
                Object awaitClosed = obj;
                if (!((Boolean) awaitClosed).booleanValue()) {
                    Log.w("CXCP", "Failed to await closure from " + camera2CameraController + '!');
                }
                if (!it.hasNext()) {
                    camera2CameraController = (Camera2CameraController) it.next();
                    Log.d("CXCP", "Camera2Backend#shutdownAsync: Awaiting closure from " + camera2CameraController);
                    this.this$0 = it;
                    this.$dragPriority = camera2CameraController;
                    this.label = 1;
                    awaitClosed = camera2CameraController.awaitClosed(this);
                    break;
                } else {
                    Log.d("CXCP", "Camera2Backend#shutdownAsync: Closing all cameras (if any)");
                    PruningCamera2DeviceManager pruningCamera2DeviceManager = ((Camera2Backend) this.$block).camera2DeviceManager;
                    CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) pruningCamera2DeviceManager.retryingCameraStateOpener.cameraStateOpener.captchaVerifier;
                    Unit unit = Unit.INSTANCE;
                    completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                    RequestCloseAll requestCloseAll = new RequestCloseAll();
                    CompletableDeferredImpl completableDeferredImpl2 = requestCloseAll.deferred;
                    if (((BufferedChannel) pruningCamera2DeviceManager.queue.f).mo1159trySendJP2dKIU(requestCloseAll) instanceof ChannelResult.Failed) {
                        Log.e("CXCP", "Camera close all request failed!");
                        completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(unit);
                    }
                    this.this$0 = null;
                    this.$dragPriority = null;
                    this.label = 2;
                    Object awaitInternal3 = completableDeferredImpl2.awaitInternal(this);
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    break;
                }
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CallbackFlowBuilder callbackFlowBuilder = (CallbackFlowBuilder) ((UnleashContext) this.this$0).properties;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(i6, (String) this.$dragPriority, (Camera2CameraAvailabilityMonitor$startMonitoring$2) this.$block);
                    this.label = 1;
                    if (callbackFlowBuilder.collect(anonymousClass1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
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
                ?? r12 = (AndroidCameraState) this.$block;
                String str = (String) this.$dragPriority;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                try {
                } catch (Exception e) {
                    Log.w("CXCP", "Failed to open " + ((Object) CameraId.m46toStringimpl(str)), e);
                    int m4396fromPVuDhNw$camera_camera2_pipe = SavingsAction.Action.m4396fromPVuDhNw$camera_camera2_pipe(e);
                    if (m4396fromPVuDhNw$camera_camera2_pipe != 0) {
                        r12.closeWith(r8, new AndroidCameraState.ClosingInfo(ClosedReason.CAMERA2_EXCEPTION, new CameraError(m4396fromPVuDhNw$camera_camera2_pipe), e, 2));
                    }
                    SavingsAction.Action.m4396fromPVuDhNw$camera_camera2_pipe(e);
                }
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ?? r3 = (Recorder.AnonymousClass1) ((HCaptcha) this.this$0).result;
                    this.label = 1;
                    Unit m111openCameraRzXb1QE = r3.m111openCameraRzXb1QE(str, r12);
                    r12 = m111openCameraRzXb1QE;
                    if (m111openCameraRzXb1QE == coroutineSingletons9) {
                        r8 = coroutineSingletons9;
                        r12 = m111openCameraRzXb1QE;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return r8;
                    }
                    SafeTrace.throwOnFailure(obj);
                    r12 = r12;
                }
                return r8;
            case 8:
                e0 e0Var = (e0) this.$block;
                ArrayDeque arrayDeque = (ArrayDeque) e0Var.h;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.$dragPriority;
                    ref$ObjectRef = new Ref$ObjectRef();
                    if (JobKt.isActive(coroutineScope)) {
                    }
                    th = null;
                    e0.access$closeAndReleaseUnprocessedElements(e0Var, th);
                    if (th == null) {
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) this.this$0;
                    coroutineScope = (CoroutineScope) this.$dragPriority;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (CancellationException unused) {
                        Log.d("CXCP", "PruningProcessingQueue: Scope cancelled");
                    } catch (Throwable th) {
                        th = th;
                        Log.e("CXCP", "Encountered exception during processing", th);
                    }
                    if (!arrayDeque.isEmpty() && ref$ObjectRef.element == null) {
                        Object first = arrayDeque.first();
                        async$default = JobKt.async$default(coroutineScope, null, null, new VirtualCameraState$connect$2$1(e0Var, first, r8, 13), 3);
                        if (!async$default.isCancelled()) {
                            Log.i("CXCP", "Unable to process " + first + " due to Job cancellation");
                            th = null;
                            e0.access$closeAndReleaseUnprocessedElements(e0Var, th);
                            if (th == null) {
                                return null;
                            }
                            throw th;
                        }
                        arrayDeque.removeFirst();
                        ref$ObjectRef.element = async$default;
                    }
                    if (JobKt.isActive(coroutineScope)) {
                        SelectImplementation selectImplementation = new SelectImplementation(getContext());
                        selectImplementation.invoke(((BufferedChannel) e0Var.f).getOnReceive(), new RealBadger2$clear$2(e0Var, r8, 11));
                        Deferred deferred = (Deferred) ref$ObjectRef.element;
                        if (deferred != null) {
                            selectImplementation.invoke(deferred.getOnAwait(), new DiskLruCache$launchCleanup$1(ref$ObjectRef, (Continuation) r8, i2));
                        }
                        this.$dragPriority = coroutineScope;
                        this.this$0 = ref$ObjectRef;
                        this.label = 1;
                        if (selectImplementation.doSelect(this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                        if (!arrayDeque.isEmpty()) {
                            Object first2 = arrayDeque.first();
                            async$default = JobKt.async$default(coroutineScope, null, null, new VirtualCameraState$connect$2$1(e0Var, first2, r8, 13), 3);
                            if (!async$default.isCancelled()) {
                            }
                        }
                        if (JobKt.isActive(coroutineScope)) {
                        }
                    }
                    th = null;
                    e0.access$closeAndReleaseUnprocessedElements(e0Var, th);
                    if (th == null) {
                    }
                }
            case 9:
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.$dragPriority;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                    surfaceRequest.mRequestCancellationCompleter.addCancellationListener(new Preview$$ExternalSyntheticLambda0(produceStateScope, 8), new ArchTaskExecutor$$ExternalSyntheticLambda0(1));
                    StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
                    surfaceRequest.setTransformationInfoListener(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new StreamSharing$$ExternalSyntheticLambda1(MutableStateFlow, i));
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Updater.snapshotFlow(new TooltipKt$$ExternalSyntheticLambda1(i5, (MutableState) this.$block)), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.asStateFlow(MutableStateFlow), 24), new CardModelView.AnonymousClass1.AnonymousClass4(i4, (Continuation) r8, i5), i3), new AnimatedImageDecoder$wrapDrawable$2(new Ref$ObjectRef(), surfaceRequest, (Continuation) r8, i6), i3);
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass12 = new ThumbNode$onAttach$1.AnonymousClass1(i4, produceStateScope, surfaceRequest);
                    this.label = 1;
                    if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(anonymousClass12, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
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
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = new ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1((CoroutineScope) this.this$0, (FilamentDisplayHelper) this.$dragPriority);
                    Function2 function22 = (Function2) this.$block;
                    this.label = 1;
                    if (function22.invoke(viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
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
                BaseViewfinderExternalSurfaceState baseViewfinderExternalSurfaceState = (BaseViewfinderExternalSurfaceState) this.$dragPriority;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope2 = (CoroutineScope) this.this$0;
                    StandaloneCoroutine standaloneCoroutine = baseViewfinderExternalSurfaceState.job;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancelInternal(new SurfaceReplacedCancellationException("Surface replaced"));
                        this.this$0 = coroutineScope2;
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope2 = (CoroutineScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (JobKt.isActive(coroutineScope2) && (anchoredDraggableNode$drag$2 = baseViewfinderExternalSurfaceState.onSurface) != null) {
                    ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = (ViewfinderExternalSurfaceHolder) this.$block;
                    this.this$0 = null;
                    this.label = 2;
                    AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$22 = new AnchoredDraggableNode$drag$2((ViewfinderInitScopeImpl) anchoredDraggableNode$drag$2.$forEachDelta, (MutableState) anchoredDraggableNode$drag$2.this$0, this, i6);
                    anchoredDraggableNode$drag$22.L$0 = viewfinderExternalSurfaceHolder;
                    break;
                }
                return Unit.INSTANCE;
            case 12:
                InteractionResult interactionResult = (InteractionResult) this.$block;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SeekableTransitionState seekableTransitionState = (SeekableTransitionState) interactionResult;
                    SnapshotStateObserver snapshotStateObserver = seekableTransitionState.snapshotStateObserver;
                    if (snapshotStateObserver != null) {
                        snapshotStateObserver.observeReads(seekableTransitionState, AnimatableKt.SeekableTransitionStateTotalDurationChanged, seekableTransitionState.recalculateTotalDurationNanos);
                    }
                    MutexImpl mutexImpl3 = seekableTransitionState.compositionContinuationMutex;
                    this.this$0 = mutexImpl3;
                    this.$dragPriority = interactionResult;
                    this.label = 1;
                    if (mutexImpl3.lock(this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                    r1 = mutexImpl3;
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interactionResult = (InteractionResult) this.$dragPriority;
                    MutexImpl mutexImpl4 = (MutexImpl) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    r1 = mutexImpl4;
                }
                try {
                    ((SeekableTransitionState) interactionResult).composedTargetState = ((SeekableTransitionState) interactionResult).targetState$delegate.getValue();
                    CancellableContinuationImpl cancellableContinuationImpl = ((SeekableTransitionState) interactionResult).compositionContinuation;
                    if (cancellableContinuationImpl != null) {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(((SeekableTransitionState) interactionResult).targetState$delegate.getValue());
                    }
                    ((SeekableTransitionState) interactionResult).compositionContinuation = null;
                    r1.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 13:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.this$0;
                    PressInteraction.Cancel cancel = (PressInteraction.Cancel) this.$dragPriority;
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(cancel, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DisposableHandle disposableHandle = (DisposableHandle) this.$block;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) this.this$0;
                    Function3 function3 = (Function3) this.$dragPriority;
                    androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((androidx.compose.foundation.gestures.AnchoredDraggableState) this.$block).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDraggableState$anchoredDragScope$1, defaultDraggableAnchors, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
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
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = (Pair) this.this$0;
                    DefaultDraggableAnchors defaultDraggableAnchors2 = (DefaultDraggableAnchors) pair.first;
                    Object obj2 = pair.second;
                    Function4 function4 = (Function4) this.$dragPriority;
                    androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$12 = ((androidx.compose.foundation.gestures.AnchoredDraggableState) this.$block).anchoredDragScope;
                    this.label = 1;
                    if (function4.invoke(anchoredDraggableState$anchoredDragScope$12, defaultDraggableAnchors2, obj2, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultDraggableState defaultDraggableState = (DefaultDraggableState) this.this$0;
                    MutatorMutex mutatorMutex2 = defaultDraggableState.scrollMutex;
                    SliderState$dragScope$1 sliderState$dragScope$12 = defaultDraggableState.dragScope;
                    MutatePriority mutatePriority2 = (MutatePriority) this.$dragPriority;
                    Function2 function23 = (Function2) this.$block;
                    this.label = 1;
                    if (mutatorMutex2.mutateWith(sliderState$dragScope$12, mutatePriority2, function23, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = ((DefaultTransformableState) this.$dragPriority).isTransformingState;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                try {
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DefaultTransformableState$transformScope$1 defaultTransformableState$transformScope$1 = (DefaultTransformableState$transformScope$1) this.this$0;
                        parcelableSnapshotMutableState2.setValue(Boolean.TRUE);
                        PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = (PoolsListPresenter$models$2$2) this.$block;
                        this.label = 1;
                        if (poolsListPresenter$models$2$2.invoke(defaultTransformableState$transformScope$1, this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                    throw th3;
                }
            case 18:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultDraggable2DState$drag2DScope$1 defaultDraggable2DState$drag2DScope$1 = (DefaultDraggable2DState$drag2DScope$1) this.this$0;
                    DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = (DragGestureNode$startListeningForEvents$1) this.$dragPriority;
                    ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = new ObjectList$$ExternalSyntheticLambda0(15, defaultDraggable2DState$drag2DScope$1, (Draggable2DNode) this.$block);
                    this.label = 1;
                    if (dragGestureNode$startListeningForEvents$1.invoke(objectList$$ExternalSyntheticLambda0, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
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
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SliderState$dragScope$1 sliderState$dragScope$13 = (SliderState$dragScope$1) this.this$0;
                    DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12 = (DragGestureNode$startListeningForEvents$1) this.$dragPriority;
                    ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(17, sliderState$dragScope$13, (DraggableNode) this.$block);
                    this.label = 1;
                    if (dragGestureNode$startListeningForEvents$12.invoke(clickableKt$$ExternalSyntheticLambda0, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                DraggableNode draggableNode = (DraggableNode) this.$dragPriority;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                    Function3 function32 = draggableNode.onDragStopped;
                    long m1071timesadjELrA = Velocity.m1071timesadjELrA(((DragEvent.DragStopped) this.$block).velocity, draggableNode.reverseDirection ? -1.0f : 1.0f);
                    Orientation orientation = draggableNode.orientation;
                    CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
                    Float f = new Float(orientation == Orientation.Vertical ? Velocity.m1068getYimpl(m1071timesadjELrA) : Velocity.m1067getXimpl(m1071timesadjELrA));
                    this.label = 1;
                    if (function32.invoke(coroutineScope4, f, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
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
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.this$0;
                    DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$13 = (DragGestureNode$startListeningForEvents$1) this.$dragPriority;
                    ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda02 = new ClickableKt$$ExternalSyntheticLambda0(18, scrollingLogic$nestedScrollScope$1, (ScrollingLogic) this.$block);
                    this.label = 1;
                    if (dragGestureNode$startListeningForEvents$13.invoke(clickableKt$$ExternalSyntheticLambda02, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollScope scrollScope = (ScrollScope) this.this$0;
                    ScrollingLogic scrollingLogic = (ScrollingLogic) this.$dragPriority;
                    scrollingLogic.outerStateScope = scrollScope;
                    Function2 function24 = (Function2) this.$block;
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$12 = scrollingLogic.nestedScrollScope;
                    this.label = 1;
                    if (function24.invoke(scrollingLogic$nestedScrollScope$12, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope3 = (CoroutineScope) this.this$0;
                    Job job = (Job) this.$dragPriority;
                    this.this$0 = coroutineScope3;
                    this.label = 1;
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope3 = (CoroutineScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Function2 function25 = (Function2) this.$block;
                this.this$0 = null;
                this.label = 2;
                break;
            case 24:
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                try {
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = lazyLayoutItemAnimation.visibilityAnimation;
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        FiniteAnimationSpec finiteAnimationSpec = (FiniteAnimationSpec) this.$dragPriority;
                        LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0 lazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0 = new LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0((GraphicsLayer) this.$block, lazyLayoutItemAnimation, i6);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f2, finiteAnimationSpec, null, lazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    lazyLayoutItemAnimation.isDisappearanceAnimationFinished$delegate.setValue(Boolean.TRUE);
                    lazyLayoutItemAnimation.setDisappearanceAnimationInProgress(false);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    lazyLayoutItemAnimation.setDisappearanceAnimationInProgress(false);
                    throw th4;
                }
            case 25:
                TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = (TextContextMenuToolbarHandlerNode) this.$dragPriority;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                try {
                } catch (Throwable th5) {
                    Function1 function1 = textContextMenuToolbarHandlerNode.onHide;
                    if (function1 == null) {
                        throw th5;
                    }
                    this.this$0 = th5;
                    this.label = 4;
                    if (function1.invoke(this) != coroutineSingletons27) {
                        throw th5;
                    }
                }
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function12 = textContextMenuToolbarHandlerNode.onShow;
                    if (function12 != null) {
                        this.label = 1;
                        if (function12.invoke(this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            Function1 function13 = textContextMenuToolbarHandlerNode.onHide;
                            if (function13 != null) {
                                this.label = 3;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i32 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i32 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th6 = (Throwable) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        throw th6;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TextContextMenuProvider textContextMenuProvider = (TextContextMenuProvider) this.$block;
                this.label = 2;
                break;
            case 26:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.this$0;
                    PointerInputScope pointerInputScope = (PointerInputScope) this.$dragPriority;
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = (DialogHostKt$$ExternalSyntheticLambda0) this.$block;
                    this.label = 1;
                    textFieldSelectionState.getClass();
                    FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
                    fixedFrameRateEstimator.candidateMatcher = textFieldSelectionState;
                    fixedFrameRateEstimator.currentMatcher = dialogHostKt$$ExternalSyntheticLambda0;
                    fixedFrameRateEstimator.framesWithoutSyncCount = -1;
                    fixedFrameRateEstimator.lastFramePresentationTimeNs = 9205357640488583168L;
                    fixedFrameRateEstimator.candidateMatcherActive = true;
                    Object awaitSelectionGestures = SimpleLayoutKt.awaitSelectionGestures(pointerInputScope, fixedFrameRateEstimator, textFieldSelectionState.new TextFieldTextDragObserver(dialogHostKt$$ExternalSyntheticLambda0), this);
                    Object obj3 = awaitSelectionGestures;
                    if (awaitSelectionGestures != coroutineSingletons28) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 != coroutineSingletons28) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 != coroutineSingletons28) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8((State) this.$dragPriority, i5));
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass13 = new ThumbNode$onAttach$1.AnonymousClass1(i2, (Animatable) this.$block, coroutineScope5);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass13, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MapDraggableAnchors mapDraggableAnchors = (MapDraggableAnchors) this.this$0;
                    Function3 function33 = (Function3) this.$dragPriority;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$13 = (AnchoredDraggableState$anchoredDragScope$1) ((AnchoredDraggableState) this.$block).anchoredDragScope;
                    this.label = 1;
                    if (function33.invoke(anchoredDraggableState$anchoredDragScope$13, mapDraggableAnchors, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair2 = (Pair) this.this$0;
                    MapDraggableAnchors mapDraggableAnchors2 = (MapDraggableAnchors) pair2.first;
                    Object obj4 = pair2.second;
                    Function4 function42 = (Function4) this.$dragPriority;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$14 = (AnchoredDraggableState$anchoredDragScope$1) ((AnchoredDraggableState) this.$block).anchoredDragScope;
                    this.label = 1;
                    if (function42.invoke(anchoredDraggableState$anchoredDragScope$14, mapDraggableAnchors2, obj4, this) == coroutineSingletons31) {
                        return coroutineSingletons31;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDraggableState$drag$2(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, Camera2ImplConfig camera2ImplConfig, Map map) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$dragPriority = camera2ImplConfig;
        this.$block = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderDraggableState$drag$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$dragPriority = obj2;
        this.$block = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderDraggableState$drag$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$dragPriority = obj;
        this.$block = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderDraggableState$drag$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$block = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDraggableState$drag$2(Function2 function2, FilamentDisplayHelper filamentDisplayHelper, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.$block = function2;
        this.$dragPriority = filamentDisplayHelper;
    }
}
