package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor$CameraStatus;
import androidx.compose.material3.ThumbNode$onAttach$1;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Camera2CameraController {
    public boolean _isForeground;
    public final PruningCamera2DeviceManager camera2DeviceManager;
    public final Camera2Quirks camera2Quirks;
    public CameraStatusMonitor$CameraStatus cameraAvailability;
    public StandaloneCoroutine cameraAvailabilityJob;
    public final CameraGraphId cameraGraphId;
    public StandaloneCoroutine cameraPrioritiesJob;
    public final Camera2CameraStatusMonitor cameraStatusMonitor;
    public final CameraSurfaceManager cameraSurfaceManager;
    public final JWECryptoParts captureSequenceProcessorFactory;
    public final CaptureSessionFactory captureSessionFactory;
    public final CompletableDeferredImpl closedDeferred;
    public AnalyticsMappersKt controllerState;
    public VirtualCameraState currentCamera;
    public StandaloneCoroutine currentCameraStateJob;
    public CaptureSessionState currentSession;
    public Map currentSurfaceMap;
    public final CameraGraph$Config graphConfig;
    public final GraphProcessorImpl graphListener;
    public CameraError lastCameraError;
    public TimestampNs lastCameraPrioritiesChangedTs;
    public final Object lock;
    public StandaloneCoroutine restartJob;
    public final CoroutineScope scope;
    public final Camera2Backend shutdownListener;
    public final StreamGraphImpl streamGraph;
    public final StrictMode strictMode;
    public final SurfaceGraph surfaceTracker;
    public final Threads threads;
    public final SystemTimeSource timeSource;

    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Camera2CameraController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Camera2CameraController camera2CameraController, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = camera2CameraController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Camera2CameraController camera2CameraController = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(camera2CameraController, continuation, 0);
                case 1:
                    return new AnonymousClass1(camera2CameraController, continuation, 1);
                default:
                    return new AnonymousClass1(camera2CameraController, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 1:
                    ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                default:
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VirtualCameraState virtualCameraState;
            CaptureSessionState captureSessionState;
            Object obj2;
            final int i = 1;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        final Camera2CameraController camera2CameraController = this.this$0;
                        ReadonlyStateFlow readonlyStateFlow = camera2CameraController.cameraStatusMonitor.cameraAvailability;
                        final int i3 = 0;
                        FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj3, Continuation continuation) {
                                int i4 = i3;
                                Camera2CameraController camera2CameraController2 = camera2CameraController;
                                switch (i4) {
                                    case 0:
                                        CameraStatusMonitor$CameraStatus cameraStatusMonitor$CameraStatus = (CameraStatusMonitor$CameraStatus) obj3;
                                        CameraGraph$Config cameraGraph$Config = camera2CameraController2.graphConfig;
                                        if (!(cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraAvailable)) {
                                            if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraUnavailable) {
                                                if (!Intrinsics.areEqual(((CameraStatusMonitor$CameraStatus.CameraUnavailable) cameraStatusMonitor$CameraStatus).cameraId, cameraGraph$Config.camera)) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                                    break;
                                                } else {
                                                    Camera2CameraController.access$onCameraStatusChanged(camera2CameraController2, cameraStatusMonitor$CameraStatus);
                                                }
                                            }
                                        } else if (!Intrinsics.areEqual(((CameraStatusMonitor$CameraStatus.CameraAvailable) cameraStatusMonitor$CameraStatus).cameraId, cameraGraph$Config.camera)) {
                                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                            break;
                                        } else {
                                            Camera2CameraController.access$onCameraStatusChanged(camera2CameraController2, cameraStatusMonitor$CameraStatus);
                                        }
                                        break;
                                    default:
                                        Camera2CameraController.access$onCameraStatusChanged(camera2CameraController2, CameraStatusMonitor$CameraStatus.CameraPrioritiesChanged.INSTANCE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (readonlyStateFlow.$$delegate_0.collect(flowCollector, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        final Camera2CameraController camera2CameraController2 = this.this$0;
                        ReadonlySharedFlow readonlySharedFlow = camera2CameraController2.cameraStatusMonitor.cameraPriorities;
                        FlowCollector flowCollector2 = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj3, Continuation continuation) {
                                int i42 = i;
                                Camera2CameraController camera2CameraController22 = camera2CameraController2;
                                switch (i42) {
                                    case 0:
                                        CameraStatusMonitor$CameraStatus cameraStatusMonitor$CameraStatus = (CameraStatusMonitor$CameraStatus) obj3;
                                        CameraGraph$Config cameraGraph$Config = camera2CameraController22.graphConfig;
                                        if (!(cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraAvailable)) {
                                            if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraUnavailable) {
                                                if (!Intrinsics.areEqual(((CameraStatusMonitor$CameraStatus.CameraUnavailable) cameraStatusMonitor$CameraStatus).cameraId, cameraGraph$Config.camera)) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                                    break;
                                                } else {
                                                    Camera2CameraController.access$onCameraStatusChanged(camera2CameraController22, cameraStatusMonitor$CameraStatus);
                                                }
                                            }
                                        } else if (!Intrinsics.areEqual(((CameraStatusMonitor$CameraStatus.CameraAvailable) cameraStatusMonitor$CameraStatus).cameraId, cameraGraph$Config.camera)) {
                                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                            break;
                                        } else {
                                            Camera2CameraController.access$onCameraStatusChanged(camera2CameraController22, cameraStatusMonitor$CameraStatus);
                                        }
                                        break;
                                    default:
                                        Camera2CameraController.access$onCameraStatusChanged(camera2CameraController22, CameraStatusMonitor$CameraStatus.CameraPrioritiesChanged.INSTANCE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (readonlySharedFlow.$$delegate_0.collect(flowCollector2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Camera2CameraController camera2CameraController3 = this.this$0;
                        this.label = 1;
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        synchronized (camera2CameraController3.lock) {
                            virtualCameraState = camera2CameraController3.currentCamera;
                            captureSessionState = camera2CameraController3.currentSession;
                            ref$ObjectRef.element = captureSessionState;
                        }
                        if (virtualCameraState == null || captureSessionState == null) {
                            obj2 = Unit.INSTANCE;
                        } else {
                            obj2 = virtualCameraState._states.collect(new ThumbNode$onAttach$1.AnonymousClass1(2, ref$ObjectRef, camera2CameraController3), this);
                            if (obj2 != coroutineSingletons3) {
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        if (obj2 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public Camera2CameraController(CoroutineScope coroutineScope, Threads threads, StrictMode strictMode, CameraGraph$Config cameraGraph$Config, GraphProcessorImpl graphProcessorImpl, SurfaceGraph surfaceGraph, Camera2CameraStatusMonitor camera2CameraStatusMonitor, CaptureSessionFactory captureSessionFactory, JWECryptoParts jWECryptoParts, PruningCamera2DeviceManager pruningCamera2DeviceManager, CameraSurfaceManager cameraSurfaceManager, Camera2Quirks camera2Quirks, SystemTimeSource systemTimeSource, CameraGraphId cameraGraphId, Camera2Backend camera2Backend, StreamGraphImpl streamGraphImpl, ConcurrentSessionSequencers concurrentSessionSequencers) {
        coroutineScope.getClass();
        threads.getClass();
        strictMode.getClass();
        cameraGraph$Config.getClass();
        camera2CameraStatusMonitor.getClass();
        captureSessionFactory.getClass();
        pruningCamera2DeviceManager.getClass();
        cameraSurfaceManager.getClass();
        camera2Quirks.getClass();
        systemTimeSource.getClass();
        concurrentSessionSequencers.getClass();
        this.scope = coroutineScope;
        this.threads = threads;
        this.strictMode = strictMode;
        this.graphConfig = cameraGraph$Config;
        this.graphListener = graphProcessorImpl;
        this.surfaceTracker = surfaceGraph;
        this.cameraStatusMonitor = camera2CameraStatusMonitor;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = jWECryptoParts;
        this.camera2DeviceManager = pruningCamera2DeviceManager;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.camera2Quirks = camera2Quirks;
        this.timeSource = systemTimeSource;
        this.cameraGraphId = cameraGraphId;
        this.shutdownListener = camera2Backend;
        this.streamGraph = streamGraphImpl;
        this.lock = new Object();
        this._isForeground = true;
        this.controllerState = CameraController$ControllerState$ERROR.INSTANCE$5;
        this.cameraAvailability = new CameraStatusMonitor$CameraStatus.CameraUnavailable(cameraGraph$Config.camera);
        this.closedDeferred = new CompletableDeferredImpl();
        Continuation continuation = null;
        this.cameraAvailabilityJob = JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this, continuation, 0), 3);
        this.cameraPrioritiesJob = JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this, continuation, 1), 3);
    }

    public static final void access$onCameraStatusChanged(Camera2CameraController camera2CameraController, CameraStatusMonitor$CameraStatus cameraStatusMonitor$CameraStatus) {
        Log.d("CXCP", camera2CameraController + " (" + ((Object) CameraId.m46toStringimpl(camera2CameraController.graphConfig.camera)) + ") camera status changed: " + cameraStatusMonitor$CameraStatus);
        synchronized (camera2CameraController.lock) {
            try {
                if (camera2CameraController.isClosed()) {
                    return;
                }
                if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraAvailable) {
                    camera2CameraController.cameraAvailability = cameraStatusMonitor$CameraStatus;
                } else if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraUnavailable) {
                    camera2CameraController.cameraAvailability = cameraStatusMonitor$CameraStatus;
                } else if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraPrioritiesChanged) {
                    camera2CameraController.timeSource.getClass();
                    camera2CameraController.lastCameraPrioritiesChangedTs = new TimestampNs(SystemClock.elapsedRealtimeNanos());
                }
                camera2CameraController.tryRestart();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void access$stopLocked(Camera2CameraController camera2CameraController) {
        if (camera2CameraController.isClosed()) {
            Log.w("CXCP", "Ignoring stop(): " + camera2CameraController + " is already closed");
            return;
        }
        AnalyticsMappersKt analyticsMappersKt = camera2CameraController.controllerState;
        CameraController$ControllerState$ERROR cameraController$ControllerState$ERROR = CameraController$ControllerState$ERROR.INSTANCE$6;
        if (analyticsMappersKt.equals(cameraController$ControllerState$ERROR) || camera2CameraController.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$5)) {
            Log.w("CXCP", "Ignoring stop(): " + camera2CameraController + " already stopping or stopped");
            return;
        }
        VirtualCameraState virtualCameraState = camera2CameraController.currentCamera;
        CaptureSessionState captureSessionState = camera2CameraController.currentSession;
        camera2CameraController.currentCamera = null;
        camera2CameraController.currentSession = null;
        camera2CameraController.controllerState = cameraController$ControllerState$ERROR;
        Log.d("CXCP", "Stopping " + camera2CameraController);
        camera2CameraController.detachSessionAndCamera(captureSessionState, virtualCameraState);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitClosed(ContinuationImpl continuationImpl) {
        Camera2CameraController$awaitClosed$1 camera2CameraController$awaitClosed$1;
        int i;
        if (continuationImpl instanceof Camera2CameraController$awaitClosed$1) {
            camera2CameraController$awaitClosed$1 = (Camera2CameraController$awaitClosed$1) continuationImpl;
            int i2 = camera2CameraController$awaitClosed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2CameraController$awaitClosed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2CameraController$awaitClosed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2CameraController$awaitClosed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Log.d("CXCP", this + "#awaitClosed");
                    synchronized (this.lock) {
                        if (this.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$1)) {
                            Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                            return Boolean.TRUE;
                        }
                        if (!this.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$2)) {
                            Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
                            return Boolean.FALSE;
                        }
                        CompletableDeferredImpl completableDeferredImpl = this.closedDeferred;
                        camera2CameraController$awaitClosed$1.label = 1;
                        if (completableDeferredImpl.awaitInternal(camera2CameraController$awaitClosed$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.TRUE;
            }
        }
        camera2CameraController$awaitClosed$1 = new Camera2CameraController$awaitClosed$1(this, continuationImpl);
        Object obj2 = camera2CameraController$awaitClosed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2CameraController$awaitClosed$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    public final void detachSessionAndCamera(CaptureSessionState captureSessionState, VirtualCameraState virtualCameraState) {
        StandaloneCoroutine launch$default = JobKt.launch$default(this.scope, null, null, new RealBadger2$clear$2(captureSessionState, virtualCameraState, (Continuation) null, 8), 3);
        if (this.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$2)) {
            launch$default.invokeOnCompletion(new Camera2CameraController$$ExternalSyntheticLambda1(this, 0));
        }
    }

    public final boolean isClosed() {
        return this.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$2) || this.controllerState.equals(CameraController$ControllerState$ERROR.INSTANCE$1);
    }

    public final void startLocked() {
        if (isClosed()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        AnalyticsMappersKt analyticsMappersKt = this.controllerState;
        CameraController$ControllerState$ERROR cameraController$ControllerState$ERROR = CameraController$ControllerState$ERROR.INSTANCE$4;
        if (analyticsMappersKt.equals(cameraController$ControllerState$ERROR)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        Continuation continuation = null;
        this.lastCameraError = null;
        CameraGraph$Config cameraGraph$Config = this.graphConfig;
        String str = cameraGraph$Config.camera;
        List list = CollectionsKt.toList(SetsKt___SetsKt.minus(SetsKt__SetsJVMKt.setOf(new CameraId(str)), new CameraId(str)));
        Camera2CameraController$$ExternalSyntheticLambda1 camera2CameraController$$ExternalSyntheticLambda1 = new Camera2CameraController$$ExternalSyntheticLambda1(this, 1);
        PruningCamera2DeviceManager pruningCamera2DeviceManager = this.camera2DeviceManager;
        pruningCamera2DeviceManager.getClass();
        str.getClass();
        list.getClass();
        CoroutineScope coroutineScope = pruningCamera2DeviceManager.scope;
        GraphProcessorImpl graphProcessorImpl = this.graphListener;
        VirtualCameraState virtualCameraState = new VirtualCameraState(str, graphProcessorImpl, coroutineScope);
        if (((BufferedChannel) pruningCamera2DeviceManager.queue.f).mo1159trySendJP2dKIU(new RequestOpen(virtualCameraState, list, graphProcessorImpl, camera2CameraController$$ExternalSyntheticLambda1)) instanceof ChannelResult.Failed) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) CameraId.m46toStringimpl(str)) + '!');
            graphProcessorImpl.onGraphError(new GraphState.GraphStateError(12, false));
            virtualCameraState = null;
        }
        if (virtualCameraState == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.currentCamera != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        if (this.currentSession != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        this.currentCamera = virtualCameraState;
        CaptureSessionState captureSessionState = new CaptureSessionState(graphProcessorImpl, this.captureSessionFactory, this.captureSequenceProcessorFactory, this.cameraSurfaceManager, this.timeSource, cameraGraph$Config.flags, null, this.streamGraph, this.strictMode, this.threads, this.scope);
        this.currentSession = captureSessionState;
        Map map = this.currentSurfaceMap;
        if (map != null) {
            captureSessionState.configureSurfaceMap(map);
        }
        this.controllerState = cameraController$ControllerState$ERROR;
        Log.d("CXCP", "Started " + this);
        StandaloneCoroutine standaloneCoroutine = this.currentCameraStateJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.currentCameraStateJob = JobKt.launch$default(this.scope, null, null, new AnonymousClass1(this, continuation, 2), 3);
    }

    public final String toString() {
        return "Camera2CameraController(" + this.cameraGraphId + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r3.value != 9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        if (r3.value != 8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void tryRestart() {
        StandaloneCoroutine standaloneCoroutine;
        this.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        AnalyticsMappersKt analyticsMappersKt = this.controllerState;
        CameraError cameraError = this.lastCameraError;
        CameraStatusMonitor$CameraStatus cameraStatusMonitor$CameraStatus = this.cameraAvailability;
        TimestampNs timestampNs = this.lastCameraPrioritiesChangedTs;
        cameraStatusMonitor$CameraStatus.getClass();
        boolean z = false;
        boolean z2 = (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraAvailable) && (cameraError == null || cameraError.value != 3);
        if (timestampNs != null && DurationNs.m81compareTozYRVrok(elapsedRealtimeNanos - timestampNs.value, 200000000L) <= 0) {
            z = true;
        }
        if (!analyticsMappersKt.equals(CameraController$ControllerState$ERROR.INSTANCE$3)) {
            if (analyticsMappersKt.equals(CameraController$ControllerState$ERROR.INSTANCE)) {
                if (z2) {
                    if (cameraError != null) {
                    }
                    if (cameraError != null) {
                    }
                    long j = !this.graphConfig.flags.enableRestartDelays ? 700L : 0L;
                    standaloneCoroutine = this.restartJob;
                    Continuation continuation = null;
                    if (standaloneCoroutine != null) {
                    }
                    this.restartJob = JobKt.launch$default(this.scope, null, null, new FlashControl$applyScreenFlash$3(j, this, continuation, 1), 3);
                }
            }
            Log.d("CXCP", this + ": Not restarting. Controller state = " + this.controllerState + ", last camera error = " + this.lastCameraError + ", camera availability = " + this.cameraAvailability + ", last camera priorities changed = " + this.lastCameraPrioritiesChangedTs + ", current timestamp = " + ((Object) TimestampNs.m82toStringimpl(elapsedRealtimeNanos)) + '.');
            return;
        }
        if (!z2 && !z) {
            if (Build.VERSION.SDK_INT < 33) {
                Log.d("CXCP", "Quirk for multi-resume activated: Kicking off restart.");
            }
            Log.d("CXCP", this + ": Not restarting. Controller state = " + this.controllerState + ", last camera error = " + this.lastCameraError + ", camera availability = " + this.cameraAvailability + ", last camera priorities changed = " + this.lastCameraPrioritiesChangedTs + ", current timestamp = " + ((Object) TimestampNs.m82toStringimpl(elapsedRealtimeNanos)) + '.');
            return;
        }
        long j2 = !this.graphConfig.flags.enableRestartDelays ? 700L : 0L;
        standaloneCoroutine = this.restartJob;
        Continuation continuation2 = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.restartJob = JobKt.launch$default(this.scope, null, null, new FlashControl$applyScreenFlash$3(j2, this, continuation2, 1), 3);
    }
}
