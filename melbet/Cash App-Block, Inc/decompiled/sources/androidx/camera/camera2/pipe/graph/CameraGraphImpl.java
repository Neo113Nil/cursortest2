package androidx.camera.camera2.pipe.graph;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputStream$DynamicRangeProfile;
import androidx.camera.camera2.pipe.OutputStream$MirrorMode;
import androidx.camera.camera2.pipe.OutputStream$StreamUseCase;
import androidx.camera.camera2.pipe.OutputStream$StreamUseHint;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.compat.VirtualCameraState;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.view.PreviewView;
import androidx.paging.FlowExtKt$simpleScan$1;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CameraGraphImpl implements AutoCloseable, CameraControls3A {
    public final AudioRestrictionControllerImpl audioRestrictionController;
    public final Camera2CameraController cameraController;
    public final AtomicBoolean closed;
    public final Controller3A controller3A;
    public final FrameCaptureQueue frameCaptureQueue;
    public final FrameDistributor frameDistributor;
    public final GraphProcessorImpl graphListener;
    public final GraphProcessorImpl graphProcessor;
    public final CoroutineScope graphScope;
    public final CameraGraphId id;
    public final CameraGraphRequestListenersImpl listeners;
    public final CameraGraphParametersImpl parameters;
    public final GraphSessionLock sessionLock;
    public final StreamGraphImpl streamGraph;
    public final SurfaceGraph surfaceGraph;

    public CameraGraphImpl(CameraGraph$Config cameraGraph$Config, CameraMetadata cameraMetadata, GraphProcessorImpl graphProcessorImpl, GraphProcessorImpl graphProcessorImpl2, StreamGraphImpl streamGraphImpl, SurfaceGraph surfaceGraph, Camera2CameraController camera2CameraController, FrameDistributor frameDistributor, FrameCaptureQueue frameCaptureQueue, AudioRestrictionControllerImpl audioRestrictionControllerImpl, CameraGraphId cameraGraphId, CameraGraphParametersImpl cameraGraphParametersImpl, CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, GraphSessionLock graphSessionLock, CoroutineScope coroutineScope, Controller3A controller3A) {
        String str;
        cameraGraph$Config.getClass();
        int i = cameraGraph$Config.sessionMode;
        cameraMetadata.getClass();
        graphProcessorImpl.getClass();
        graphProcessorImpl2.getClass();
        streamGraphImpl.getClass();
        List<StreamGraphImpl.InputStreamImpl> list = streamGraphImpl.inputs;
        surfaceGraph.getClass();
        camera2CameraController.getClass();
        frameDistributor.getClass();
        frameCaptureQueue.getClass();
        audioRestrictionControllerImpl.getClass();
        cameraGraphParametersImpl.getClass();
        cameraGraphRequestListenersImpl.getClass();
        graphSessionLock.getClass();
        coroutineScope.getClass();
        controller3A.getClass();
        this.graphProcessor = graphProcessorImpl;
        this.graphListener = graphProcessorImpl2;
        this.streamGraph = streamGraphImpl;
        this.surfaceGraph = surfaceGraph;
        this.cameraController = camera2CameraController;
        this.frameDistributor = frameDistributor;
        this.frameCaptureQueue = frameCaptureQueue;
        this.audioRestrictionController = audioRestrictionControllerImpl;
        this.id = cameraGraphId;
        this.parameters = cameraGraphParametersImpl;
        this.listeners = cameraGraphRequestListenersImpl;
        this.sessionLock = graphSessionLock;
        this.graphScope = coroutineScope;
        this.controller3A = controller3A;
        this.closed = AtomicFU.atomic(false);
        String str2 = cameraGraph$Config.camera;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        Integer num = (Integer) camera2CameraMetadata.get(key);
        String str3 = "External";
        String str4 = "Unknown";
        int i2 = 1;
        String str5 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? Constants.META_BACK_BUTTON : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) camera2CameraMetadata.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            str3 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str3 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str3 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str3 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str3 = "Unknown";
        }
        if (i == 1) {
            str4 = "High Speed";
        } else if (i == 0) {
            str4 = "Normal";
        } else if (i == 2) {
            str4 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) camera2CameraMetadata.get(key3);
        String str6 = (iArr == null || !ArraysKt___ArraysKt.contains(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str2 + ")\n");
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("  Facing:    ", str5, " (", str6, ", ");
        m.append(str3);
        m.append(")\n");
        sb.append(m.toString());
        sb.append("  Mode:      " + str4 + '\n');
        sb.append("Outputs:\n");
        Iterator it = streamGraphImpl.streams.iterator();
        while (true) {
            String str7 = "\n";
            int i3 = 12;
            char c = ' ';
            if (!it.hasNext()) {
                int i4 = i2;
                if (!list.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (StreamGraphImpl.InputStreamImpl inputStreamImpl : list) {
                        sb.append(" ");
                        sb.append(StringsKt.padEnd("Input-" + inputStreamImpl.id, 12, ' '));
                        sb.append(StringsKt.padEnd(StreamFormat.m56toStringimpl(inputStreamImpl.f840format), 12, ' '));
                        sb.append(StringsKt.padEnd(String.valueOf(i4), 12, ' '));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + RequestTemplate.m53getNameimpl(cameraGraph$Config.sessionTemplate) + '\n');
                Debug.appendParameters("Session Parameters", sb, cameraGraph$Config.sessionParameters);
                sb.append("Default Template: " + RequestTemplate.m53getNameimpl(cameraGraph$Config.defaultTemplate) + '\n');
                Debug.appendParameters("Default Parameters", sb, cameraGraph$Config.defaultParameters);
                Debug.appendParameters("Required Parameters", sb, cameraGraph$Config.requiredParameters);
                Log.i("CXCP", sb.toString());
                ArrayList arrayList = cameraGraph$Config.input;
                if (i == i4) {
                    if (this.streamGraph.outputs.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.streamGraph.outputs.size();
                    StreamGraphImpl streamGraphImpl2 = this.streamGraph;
                    if (size > 2) {
                        Path$$ExternalSyntheticBUOutline0.m$3(streamGraphImpl2.outputs, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList2 = streamGraphImpl2.outputs;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((StreamGraphImpl.OutputStreamImpl) it2.next()).isValidForHighSpeedOperatingMode()) {
                                Path$$ExternalSyntheticBUOutline0.m$3(this.streamGraph.outputs, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$3("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList.size() > 1) {
                        a$$ExternalSyntheticBUOutline0.m$3("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.streamGraph.imageSourceMap.isEmpty()) {
                    return;
                }
                this.surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
                return;
            }
            int i5 = 0;
            for (Object obj : ((CameraStream) it.next()).outputs) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                StreamGraphImpl.OutputStreamImpl outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) obj;
                sb.append("  ");
                if (i5 == 0) {
                    CameraStream cameraStream = outputStreamImpl.stream;
                    if (cameraStream == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stream");
                        throw null;
                    }
                    str = StreamId.m57toStringimpl(cameraStream.id);
                } else {
                    str = "";
                }
                sb.append(StringsKt.padEnd(str, i3, c));
                int i7 = outputStreamImpl.id;
                String str8 = outputStreamImpl.camera;
                int i8 = i2;
                sb.append(StringsKt.padEnd("Output-" + i7, i3, c));
                String size2 = outputStreamImpl.size.toString();
                size2.getClass();
                sb.append(StringsKt.padEnd(size2, i3, c));
                sb.append(StringsKt.padEnd(StreamFormat.m55getNameimpl(outputStreamImpl.f842format), 16, c));
                OutputStream$MirrorMode outputStream$MirrorMode = outputStreamImpl.mirrorMode;
                if (outputStream$MirrorMode != null) {
                    sb.append(" [" + ((Object) OutputStream$MirrorMode.m50toStringimpl(outputStream$MirrorMode.value)) + ']');
                }
                OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile = outputStreamImpl.dynamicRangeProfile;
                String str9 = str7;
                if (outputStream$DynamicRangeProfile != null) {
                    sb.append(" [" + ((Object) OutputStream$DynamicRangeProfile.m49toStringimpl(outputStream$DynamicRangeProfile.value)) + ']');
                }
                OutputStream$StreamUseCase outputStream$StreamUseCase = outputStreamImpl.streamUseCase;
                if (outputStream$StreamUseCase != null) {
                    long j = outputStream$StreamUseCase.value;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                OutputStream$StreamUseHint outputStream$StreamUseHint = outputStreamImpl.streamUseHint;
                if (outputStream$StreamUseHint != null) {
                    long j2 = outputStream$StreamUseHint.value;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!Intrinsics.areEqual(str8, str2)) {
                    sb.append(" [");
                    sb.append(new CameraId(str8));
                    sb.append("]");
                }
                sb.append(str9);
                i2 = i8;
                str7 = str9;
                i5 = i6;
                i3 = 12;
                c = ' ';
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquireSession(ContinuationImpl continuationImpl) {
        CameraGraphImpl$acquireSession$1 cameraGraphImpl$acquireSession$1;
        int i;
        if (continuationImpl instanceof CameraGraphImpl$acquireSession$1) {
            cameraGraphImpl$acquireSession$1 = (CameraGraphImpl$acquireSession$1) continuationImpl;
            int i2 = cameraGraphImpl$acquireSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraGraphImpl$acquireSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraGraphImpl$acquireSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraGraphImpl$acquireSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cameraGraphImpl$acquireSession$1.label = 1;
                    obj = this.sessionLock.acquireToken$camera_camera2_pipe(cameraGraphImpl$acquireSession$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new CameraGraphSessionImpl((MutexToken) obj, this.graphProcessor, this.controller3A, this.frameCaptureQueue, this.parameters, this.listeners);
            }
        }
        cameraGraphImpl$acquireSession$1 = new CameraGraphImpl$acquireSession$1(this, continuationImpl);
        Object obj2 = cameraGraphImpl$acquireSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraGraphImpl$acquireSession$1.label;
        if (i != 0) {
        }
        return new CameraGraphSessionImpl((MutexToken) obj2, this.graphProcessor, this.controller3A, this.frameCaptureQueue, this.parameters, this.listeners);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Continuation continuation;
        if (this.closed.compareAndSet()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.graphProcessor.graphLoop.close();
            Camera2CameraController camera2CameraController = this.cameraController;
            synchronized (camera2CameraController.lock) {
                try {
                    continuation = null;
                    if (!camera2CameraController.isClosed()) {
                        camera2CameraController.controllerState = CameraController$ControllerState$ERROR.INSTANCE$2;
                        Log.d("CXCP", "Closed " + camera2CameraController);
                        VirtualCameraState virtualCameraState = camera2CameraController.currentCamera;
                        CaptureSessionState captureSessionState = camera2CameraController.currentSession;
                        camera2CameraController.currentCamera = null;
                        camera2CameraController.currentSession = null;
                        StandaloneCoroutine standaloneCoroutine = camera2CameraController.restartJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        StandaloneCoroutine standaloneCoroutine2 = camera2CameraController.currentCameraStateJob;
                        if (standaloneCoroutine2 != null) {
                            standaloneCoroutine2.cancel(null);
                        }
                        camera2CameraController.currentCameraStateJob = null;
                        StandaloneCoroutine standaloneCoroutine3 = camera2CameraController.cameraAvailabilityJob;
                        if (standaloneCoroutine3 != null) {
                            standaloneCoroutine3.cancel(null);
                        }
                        camera2CameraController.cameraAvailabilityJob = null;
                        StandaloneCoroutine standaloneCoroutine4 = camera2CameraController.cameraPrioritiesJob;
                        if (standaloneCoroutine4 != null) {
                            standaloneCoroutine4.cancel(null);
                        }
                        camera2CameraController.cameraPrioritiesJob = null;
                        CameraState$Type$EnumUnboxingLocalUtility.m(camera2CameraController.cameraStatusMonitor);
                        camera2CameraController.detachSessionAndCamera(captureSessionState, virtualCameraState);
                        CameraGraph$Config cameraGraph$Config = camera2CameraController.graphConfig;
                        if (cameraGraph$Config.flags.closeCameraDeviceOnClose || camera2CameraController.camera2Quirks.m74x552c1673(cameraGraph$Config.camera)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) CameraId.m46toStringimpl(camera2CameraController.graphConfig.camera)) + " during " + camera2CameraController + "#close");
                            camera2CameraController.camera2DeviceManager.m76closeEfqyGwQ(camera2CameraController.graphConfig.camera);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.frameDistributor.close();
            this.frameCaptureQueue.close();
            this.surfaceGraph.close();
            this.streamGraph.close();
            AudioRestrictionControllerImpl audioRestrictionControllerImpl = this.audioRestrictionController;
            audioRestrictionControllerImpl.getClass();
            synchronized (audioRestrictionControllerImpl.lock) {
                AudioRestrictionMode m62computeAudioRestrictionMode4o0Og1A = audioRestrictionControllerImpl.m62computeAudioRestrictionMode4o0Og1A();
                audioRestrictionControllerImpl.audioRestrictionModeMap.remove(this);
                AudioRestrictionMode m62computeAudioRestrictionMode4o0Og1A2 = audioRestrictionControllerImpl.m62computeAudioRestrictionMode4o0Og1A();
                if (m62computeAudioRestrictionMode4o0Og1A2 != null && !m62computeAudioRestrictionMode4o0Og1A2.equals(m62computeAudioRestrictionMode4o0Og1A)) {
                    PreviewView.AnonymousClass1 anonymousClass1 = audioRestrictionControllerImpl.coroutineMutex;
                    ContextScope contextScope = audioRestrictionControllerImpl.scope;
                    RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(audioRestrictionControllerImpl, m62computeAudioRestrictionMode4o0Og1A2, continuation, 7);
                    anonymousClass1.getClass();
                    contextScope.getClass();
                    JobKt.launch$default(contextScope, null, CoroutineStart.UNDISPATCHED, new FlowExtKt$simpleScan$1(anonymousClass1, realBadger2$clear$2, continuation, 5), 1);
                }
            }
            JobKt.cancel(this.graphScope, (CancellationException) null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* renamed from: setSurface-NYG5g8E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m83setSurfaceNYG5g8E(int i, Surface surface) {
        String str;
        AutoCloseable autoCloseable;
        boolean isTerminated;
        Trace.beginSection(((Object) StreamId.m57toStringimpl(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        SurfaceGraph surfaceGraph = this.surfaceGraph;
        if (surfaceGraph.imageSources.keySet().contains(new StreamId(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) StreamId.m57toStringimpl(i));
            ZslControlImpl$$ExternalSyntheticLambda1.m(sb, ", it is permanently assigned to ", surfaceGraph.imageSources.get(new StreamId(i)));
            return;
        }
        synchronized (surfaceGraph.lock) {
            if (!surfaceGraph.closed) {
                if (surface != null) {
                    str = "Configured " + ((Object) StreamId.m57toStringimpl(i)) + " with " + surface;
                } else {
                    str = "Removed surface for " + ((Object) StreamId.m57toStringimpl(i));
                }
                Log.i("CXCP", str);
                LinkedHashMap linkedHashMap = surfaceGraph.surfaceMap;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new StreamId(i));
                    if (surfaceGraph.shouldRegisterSurfaces && surface2 != null) {
                        autoCloseable = (AutoCloseable) surfaceGraph.surfaceUsageMap.remove(surface2);
                        surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
                        if (autoCloseable != null) {
                            if (autoCloseable instanceof AutoCloseable) {
                                autoCloseable.close();
                            } else if (autoCloseable instanceof ExecutorService) {
                                ExecutorService executorService = (ExecutorService) autoCloseable;
                                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                    executorService.shutdown();
                                    boolean z = false;
                                    while (!isTerminated) {
                                        try {
                                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                        } catch (InterruptedException unused) {
                                            if (!z) {
                                                executorService.shutdownNow();
                                                z = true;
                                            }
                                        }
                                    }
                                    if (z) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            } else {
                                if (!(autoCloseable instanceof TypedArray)) {
                                    Path$$ExternalSyntheticBUOutline0.m$3();
                                    return;
                                }
                                ((TypedArray) autoCloseable).recycle();
                            }
                        }
                    }
                    autoCloseable = null;
                    surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
                    if (autoCloseable != null) {
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new StreamId(i));
                    surfaceGraph.surfaceMap.put(new StreamId(i), surface);
                    if (surfaceGraph.shouldRegisterSurfaces && !Intrinsics.areEqual(surface3, surface)) {
                        if (surfaceGraph.surfaceUsageMap.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        autoCloseable = (AutoCloseable) TypeIntrinsics.asMutableMap(surfaceGraph.surfaceUsageMap).remove(surface3);
                        surfaceGraph.surfaceUsageMap.put(surface, surfaceGraph.surfaceManager.registerSurface$camera_camera2_pipe(surface));
                        surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
                        if (autoCloseable != null) {
                        }
                    }
                    autoCloseable = null;
                    surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
                    if (autoCloseable != null) {
                    }
                }
            } else if (surface != null) {
                Log.w("CXCP", "Refusing to configure " + ((Object) StreamId.m57toStringimpl(i)) + " with " + surface + " after close!");
            }
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.id.name;
    }
}
