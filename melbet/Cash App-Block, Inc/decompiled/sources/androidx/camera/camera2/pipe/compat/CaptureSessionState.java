package androidx.camera.camera2.pipe.compat;

import android.content.res.TypedArray;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.pipe.CameraGraph$Flags;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.paging.Pager$pageFetcher$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.bugsnag.android.TraceParser;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.atomicfu.AtomicRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CaptureSessionState implements SessionStateCallback {
    public CameraDeviceWrapper _cameraDevice;
    public Map _surfaceMap;
    public final LinkedHashMap _surfaceTokenMap;
    public final Map activeOutputSurfaceMap;
    public final Map activeStreamSurfaceMap;
    public ConfiguredCameraCaptureSession cameraCaptureSession;
    public final CameraGraph$Flags cameraGraphFlags;
    public final CameraSurfaceManager cameraSurfaceManager;
    public final JWECryptoParts captureSequenceProcessorFactory;
    public final CountDownLatch captureSessionAttemptCompleted;
    public final CaptureSessionFactory captureSessionFactory;
    public final int debugId;
    public final AtomicRef finalized;
    public final GraphProcessorImpl graphListener;
    public boolean hasAttemptedCaptureSession;
    public final Object lock;
    public Map pendingOutputMap;
    public LinkedHashMap pendingSurfaceMap;
    public final CoroutineScope scope;
    public TimestampNs sessionCreatingTimestamp;
    public final CountDownLatch sessionDisconnected;
    public final Toolbar.AnonymousClass1 sessionSequencer;
    public State state;
    public final StreamGraphImpl streamGraph;
    public final Threads threads;
    public final SystemTimeSource timeSource;

    public final class ConfiguredCameraCaptureSession {
        public final Camera2CaptureSequenceProcessor captureSequenceProcessor;
        public final TraceParser processor;
        public final CameraCaptureSessionWrapper session;

        public ConfiguredCameraCaptureSession(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, TraceParser traceParser, Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor) {
            cameraCaptureSessionWrapper.getClass();
            this.session = cameraCaptureSessionWrapper;
            this.processor = traceParser;
            this.captureSequenceProcessor = camera2CaptureSequenceProcessor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ConfiguredCameraCaptureSession) {
                ConfiguredCameraCaptureSession configuredCameraCaptureSession = (ConfiguredCameraCaptureSession) obj;
                return Intrinsics.areEqual(this.session, configuredCameraCaptureSession.session) && this.processor == configuredCameraCaptureSession.processor && this.captureSequenceProcessor == configuredCameraCaptureSession.captureSequenceProcessor;
            }
            return false;
        }

        public final int hashCode() {
            return this.captureSequenceProcessor.hashCode() + ((this.processor.hashCode() + (this.session.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ConfiguredCameraCaptureSession(session=" + this.session + ", processor=" + this.processor + ", captureSequenceProcessor=" + this.captureSequenceProcessor + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State CLOSED;
        public static final State CLOSING;
        public static final State CREATED;
        public static final State CREATING;
        public static final State PENDING;

        static {
            State state = new State("PENDING", 0);
            PENDING = state;
            State state2 = new State("CREATING", 1);
            CREATING = state2;
            State state3 = new State("CREATED", 2);
            CREATED = state3;
            State state4 = new State("CLOSING", 3);
            CLOSING = state4;
            State state5 = new State("CLOSED", 4);
            CLOSED = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CaptureSessionState(GraphProcessorImpl graphProcessorImpl, CaptureSessionFactory captureSessionFactory, JWECryptoParts jWECryptoParts, CameraSurfaceManager cameraSurfaceManager, SystemTimeSource systemTimeSource, CameraGraph$Flags cameraGraph$Flags, CaptureSessionFactoryKt captureSessionFactoryKt, StreamGraphImpl streamGraphImpl, StrictMode strictMode, Threads threads, CoroutineScope coroutineScope) {
        captureSessionFactory.getClass();
        cameraSurfaceManager.getClass();
        systemTimeSource.getClass();
        cameraGraph$Flags.getClass();
        strictMode.getClass();
        threads.getClass();
        coroutineScope.getClass();
        this.graphListener = graphProcessorImpl;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = jWECryptoParts;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.timeSource = systemTimeSource;
        this.cameraGraphFlags = cameraGraph$Flags;
        this.streamGraph = streamGraphImpl;
        this.threads = threads;
        this.scope = coroutineScope;
        AtomicInt atomicInt = CaptureSessionStateKt.captureSessionDebugIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.lock = new Object();
        this.finalized = AtomicFU.atomic(Boolean.FALSE);
        this.activeStreamSurfaceMap = Collections.synchronizedMap(new HashMap());
        this.activeOutputSurfaceMap = Collections.synchronizedMap(new HashMap());
        this.sessionSequencer = null;
        this.state = State.PENDING;
        this.sessionDisconnected = new CountDownLatch(1);
        this.captureSessionAttemptCompleted = new CountDownLatch(1);
        this._surfaceTokenMap = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$tryCreateCaptureSession(CaptureSessionState captureSessionState, ContinuationImpl continuationImpl) {
        CaptureSessionState$tryCreateCaptureSession$1 captureSessionState$tryCreateCaptureSession$1;
        int i;
        Ref$ObjectRef m;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        CaptureSessionFactory.Result create;
        LinkedHashMap linkedHashMap;
        captureSessionState.getClass();
        try {
            if (continuationImpl instanceof CaptureSessionState$tryCreateCaptureSession$1) {
                captureSessionState$tryCreateCaptureSession$1 = (CaptureSessionState$tryCreateCaptureSession$1) continuationImpl;
                int i2 = captureSessionState$tryCreateCaptureSession$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    captureSessionState$tryCreateCaptureSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = captureSessionState$tryCreateCaptureSession$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = captureSessionState$tryCreateCaptureSession$1.label;
                    if (i != 0) {
                        m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                        ref$ObjectRef = new Ref$ObjectRef();
                        synchronized (captureSessionState.lock) {
                            if (captureSessionState.state != State.PENDING) {
                                return Unit.INSTANCE;
                            }
                            m.element = captureSessionState._surfaceMap;
                            CameraDeviceWrapper cameraDeviceWrapper = captureSessionState._cameraDevice;
                            ref$ObjectRef.element = cameraDeviceWrapper;
                            if (m.element != null && cameraDeviceWrapper != null) {
                                captureSessionState.state = State.CREATING;
                                captureSessionState.hasAttemptedCaptureSession = true;
                                captureSessionState.timeSource.getClass();
                                captureSessionState.sessionCreatingTimestamp = new TimestampNs(SystemClock.elapsedRealtimeNanos());
                                Toolbar.AnonymousClass1 anonymousClass1 = captureSessionState.sessionSequencer;
                                if (anonymousClass1 != null) {
                                    Log.d("CXCP", "Awaiting session lock");
                                    captureSessionState$tryCreateCaptureSession$1.L$0 = m;
                                    captureSessionState$tryCreateCaptureSession$1.L$1 = ref$ObjectRef;
                                    captureSessionState$tryCreateCaptureSession$1.label = 1;
                                    if (anonymousClass1.awaitSessionLock(captureSessionState$tryCreateCaptureSession$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    ref$ObjectRef2 = m;
                                    ref$ObjectRef3 = ref$ObjectRef;
                                }
                                StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                                CameraDeviceWrapper cameraDeviceWrapper2 = (CameraDeviceWrapper) ref$ObjectRef.element;
                                String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper2 != null ? cameraDeviceWrapper2.mo59getCameraIdDz_R5H8() : null;
                                sb.append((Object) (mo59getCameraIdDz_R5H8 == null ? "null" : CameraId.m46toStringimpl(mo59getCameraIdDz_R5H8)));
                                sb.append(" using ");
                                sb.append(captureSessionState);
                                sb.append(" with ");
                                sb.append(m.element);
                                Log.i("CXCP", sb.toString());
                                StringBuilder sb2 = new StringBuilder("CameraDevice-");
                                CameraDeviceWrapper cameraDeviceWrapper3 = (CameraDeviceWrapper) ref$ObjectRef.element;
                                Trace.beginSection(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, cameraDeviceWrapper3 != null ? cameraDeviceWrapper3.mo59getCameraIdDz_R5H8() : null, "#createCaptureSession"));
                                CaptureSessionFactory captureSessionFactory = captureSessionState.captureSessionFactory;
                                Object obj2 = ref$ObjectRef.element;
                                obj2.getClass();
                                Object obj3 = m.element;
                                obj3.getClass();
                                create = captureSessionFactory.create((CameraDeviceWrapper) obj2, (Map) obj3, captureSessionState);
                                Trace.endSection();
                                if (!(create instanceof CaptureSessionFactory.Result.Success)) {
                                    Log.e("CXCP", "Failed to create capture session for " + captureSessionState + '!');
                                    return Unit.INSTANCE;
                                }
                                synchronized (captureSessionState.lock) {
                                    try {
                                        State state = captureSessionState.state;
                                        if (state != State.CLOSING && state != State.CLOSED) {
                                            if (state != State.CREATING) {
                                                throw new IllegalStateException(("Unexpected state: " + captureSessionState.state).toString());
                                            }
                                            captureSessionState.state = State.CREATED;
                                            Map map = captureSessionState.activeStreamSurfaceMap;
                                            Object obj4 = m.element;
                                            obj4.getClass();
                                            map.putAll((Map) obj4);
                                            captureSessionState.activeOutputSurfaceMap.putAll(((CaptureSessionFactory.Result.Success) create).outputSurfaceMap);
                                            Map map2 = ((CaptureSessionFactory.Result.Success) create).deferred;
                                            if (!map2.isEmpty()) {
                                                Log.i("CXCP", "Created " + captureSessionState + " with " + CollectionsKt.toList(((Map) m.element).keySet()) + ". Waiting to finalize " + CollectionsKt.toList(map2.keySet()));
                                                captureSessionState.pendingOutputMap = map2;
                                                Map map3 = captureSessionState._surfaceMap;
                                                if (map3 != null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                    for (Map.Entry entry : map3.entrySet()) {
                                                        if (map2.containsKey(entry.getKey())) {
                                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                                        }
                                                    }
                                                } else {
                                                    linkedHashMap = null;
                                                }
                                                if (linkedHashMap != null && linkedHashMap.size() == map2.size()) {
                                                    captureSessionState.pendingSurfaceMap = linkedHashMap;
                                                }
                                            }
                                            captureSessionState.configure(null);
                                            return Unit.INSTANCE;
                                        }
                                        Log.i("CXCP", "Warning: " + captureSessionState + " was " + captureSessionState.state + " while configuration was in progress.");
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef3 = captureSessionState$tryCreateCaptureSession$1.L$1;
                    ref$ObjectRef2 = captureSessionState$tryCreateCaptureSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m = ref$ObjectRef2;
                    ref$ObjectRef = ref$ObjectRef3;
                    StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
                    CameraDeviceWrapper cameraDeviceWrapper22 = (CameraDeviceWrapper) ref$ObjectRef.element;
                    if (cameraDeviceWrapper22 != null) {
                    }
                    sb3.append((Object) (mo59getCameraIdDz_R5H8 == null ? "null" : CameraId.m46toStringimpl(mo59getCameraIdDz_R5H8)));
                    sb3.append(" using ");
                    sb3.append(captureSessionState);
                    sb3.append(" with ");
                    sb3.append(m.element);
                    Log.i("CXCP", sb3.toString());
                    StringBuilder sb22 = new StringBuilder("CameraDevice-");
                    CameraDeviceWrapper cameraDeviceWrapper32 = (CameraDeviceWrapper) ref$ObjectRef.element;
                    Trace.beginSection(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb22, cameraDeviceWrapper32 != null ? cameraDeviceWrapper32.mo59getCameraIdDz_R5H8() : null, "#createCaptureSession"));
                    CaptureSessionFactory captureSessionFactory2 = captureSessionState.captureSessionFactory;
                    Object obj22 = ref$ObjectRef.element;
                    obj22.getClass();
                    Object obj32 = m.element;
                    obj32.getClass();
                    create = captureSessionFactory2.create((CameraDeviceWrapper) obj22, (Map) obj32, captureSessionState);
                    Trace.endSection();
                    if (!(create instanceof CaptureSessionFactory.Result.Success)) {
                    }
                }
            }
            Trace.beginSection(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb22, cameraDeviceWrapper32 != null ? cameraDeviceWrapper32.mo59getCameraIdDz_R5H8() : null, "#createCaptureSession"));
            CaptureSessionFactory captureSessionFactory22 = captureSessionState.captureSessionFactory;
            Object obj222 = ref$ObjectRef.element;
            obj222.getClass();
            Object obj322 = m.element;
            obj322.getClass();
            create = captureSessionFactory22.create((CameraDeviceWrapper) obj222, (Map) obj322, captureSessionState);
            Trace.endSection();
            if (!(create instanceof CaptureSessionFactory.Result.Success)) {
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        captureSessionState$tryCreateCaptureSession$1 = new CaptureSessionState$tryCreateCaptureSession$1(captureSessionState, continuationImpl);
        Object obj5 = captureSessionState$tryCreateCaptureSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = captureSessionState$tryCreateCaptureSession$1.label;
        if (i != 0) {
        }
        m = ref$ObjectRef2;
        ref$ObjectRef = ref$ObjectRef3;
        StringBuilder sb32 = new StringBuilder("Creating CameraCaptureSession from ");
        CameraDeviceWrapper cameraDeviceWrapper222 = (CameraDeviceWrapper) ref$ObjectRef.element;
        if (cameraDeviceWrapper222 != null) {
        }
        sb32.append((Object) (mo59getCameraIdDz_R5H8 == null ? "null" : CameraId.m46toStringimpl(mo59getCameraIdDz_R5H8)));
        sb32.append(" using ");
        sb32.append(captureSessionState);
        sb32.append(" with ");
        sb32.append(m.element);
        Log.i("CXCP", sb32.toString());
        StringBuilder sb222 = new StringBuilder("CameraDevice-");
        CameraDeviceWrapper cameraDeviceWrapper322 = (CameraDeviceWrapper) ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void configure(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        boolean z;
        synchronized (this.lock) {
            try {
                ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
                if (configuredCameraCaptureSession == null && cameraCaptureSessionWrapper != null) {
                    JWECryptoParts jWECryptoParts = this.captureSequenceProcessorFactory;
                    Map map = this.activeStreamSurfaceMap;
                    map.getClass();
                    Map map2 = this.activeOutputSurfaceMap;
                    map2.getClass();
                    Camera2CaptureSequenceProcessor create = jWECryptoParts.create(cameraCaptureSessionWrapper, map, map2);
                    ConfiguredCameraCaptureSession configuredCameraCaptureSession2 = new ConfiguredCameraCaptureSession(cameraCaptureSessionWrapper, new TraceParser(create), create);
                    this.cameraCaptureSession = configuredCameraCaptureSession2;
                    configuredCameraCaptureSession = configuredCameraCaptureSession2;
                }
                if (this.state == State.CREATED && configuredCameraCaptureSession != null) {
                    if (this.pendingOutputMap != null) {
                        if (this.pendingSurfaceMap != null) {
                            z = true;
                            if (z) {
                                finalizeOutputsIfAvailable(false);
                            }
                            synchronized (this.lock) {
                                this.timeSource.getClass();
                                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                TimestampNs timestampNs = this.sessionCreatingTimestamp;
                                timestampNs.getClass();
                                Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((elapsedRealtimeNanos - timestampNs.value) / 1000000.0d)}, 1)));
                                this.graphListener.onGraphStarted(configuredCameraCaptureSession.processor);
                            }
                            return;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    synchronized (this.lock) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void configureSurfaceMap(Map map) {
        map.getClass();
        synchronized (this.lock) {
            try {
                State state = this.state;
                if (state != State.CLOSING && state != State.CLOSED) {
                    Map map2 = this._surfaceMap;
                    if (map2 == null) {
                        map2 = EmptyMap.INSTANCE;
                        map2.getClass();
                    }
                    updateTrackedSurfaces(map2, map);
                    this._surfaceMap = map;
                    Map map3 = this.pendingOutputMap;
                    Continuation continuation = null;
                    if (map3 != null && this.pendingSurfaceMap == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.pendingSurfaceMap = linkedHashMap;
                            JobKt.launch$default(this.scope, null, null, new DiskLruCache$launchCleanup$1(this, continuation, 5), 3);
                        }
                    }
                    JobKt.launch$default(this.scope, null, null, new CaptureSessionState$cameraDevice$2$1(this, continuation, 1), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void disconnect() {
        ConfiguredCameraCaptureSession configuredCameraCaptureSession;
        synchronized (this.lock) {
            try {
                State state = this.state;
                State state2 = State.CLOSING;
                if (state != state2 && state != State.CLOSED) {
                    this.state = state2;
                    ConfiguredCameraCaptureSession configuredCameraCaptureSession2 = this.cameraCaptureSession;
                    Continuation continuation = null;
                    boolean z = false;
                    if (configuredCameraCaptureSession2 != null) {
                        this.cameraCaptureSession = null;
                    } else {
                        if (this.cameraGraphFlags.closeCaptureSessionOnDisconnect && this.hasAttemptedCaptureSession) {
                            z = true;
                        }
                        configuredCameraCaptureSession2 = null;
                    }
                    Toolbar.AnonymousClass1 anonymousClass1 = this.sessionSequencer;
                    if (anonymousClass1 != null) {
                        anonymousClass1.release();
                    }
                    int i = 2;
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((Unit) this.threads.runBlockingCheckedOrNull(3000L, new Pager$pageFetcher$2(this, continuation, i))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.lock) {
                            configuredCameraCaptureSession = this.cameraCaptureSession;
                            this.cameraCaptureSession = null;
                        }
                        configuredCameraCaptureSession2 = configuredCameraCaptureSession;
                    }
                    Trace.beginSection(this.graphListener + "#onGraphStopping");
                    GraphProcessorImpl graphProcessorImpl = this.graphListener;
                    Log.d("CXCP", graphProcessorImpl + " onGraphStopping");
                    graphProcessorImpl._graphState.setValue(GraphState.GraphStateStopping.INSTANCE);
                    graphProcessorImpl.graphLoop.setRequestProcessor(null);
                    for (GraphStateToCameraStateAdapter graphStateToCameraStateAdapter : graphProcessorImpl.externalStateGraphListeners) {
                        graphStateToCameraStateAdapter.cameraStateAdapter.onGraphStateUpdated(graphStateToCameraStateAdapter.getCameraGraph(), GraphState.GraphStateStopping.INSTANCE);
                    }
                    Trace.endSection();
                    if (configuredCameraCaptureSession2 != null) {
                        TraceParser traceParser = configuredCameraCaptureSession2.processor;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.cameraGraphFlags.abortCapturesOnStop && ((Unit) this.threads.runBlockingCheckedOrNull(2000L, new SessionWorker$doWork$2$1(this, traceParser, continuation, 3))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        configuredCameraCaptureSession2.captureSequenceProcessor.disconnect$camera_camera2_pipe();
                        Trace.endSection();
                        if (this.cameraGraphFlags.closeCaptureSessionOnDisconnect && ((Unit) this.threads.runBlockingCheckedOrNull(3000L, new SessionWorker$doWork$2$1(this, configuredCameraCaptureSession2, continuation, i))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.onGraphStopped();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.onGraphStopped();
                        Trace.endSection();
                    }
                    this.sessionDisconnected.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalizeOutputsIfAvailable(boolean z) {
        ConfiguredCameraCaptureSession configuredCameraCaptureSession;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.lock) {
            configuredCameraCaptureSession = this.cameraCaptureSession;
            map = this.pendingOutputMap;
            linkedHashMap = this.pendingSurfaceMap;
        }
        if (configuredCameraCaptureSession == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i = ((StreamId) entry.getKey()).value;
            AndroidOutputConfiguration androidOutputConfiguration = (AndroidOutputConfiguration) entry.getValue();
            Object obj = linkedHashMap.get(new StreamId(i));
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            } else {
                androidOutputConfiguration.getClass();
                androidOutputConfiguration.output.addSurface((Surface) obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((AndroidOutputConfiguration) ((Map.Entry) it.next()).getValue());
        }
        configuredCameraCaptureSession.session.finalizeOutputConfigurations(CollectionsKt.toList(linkedHashSet));
        synchronized (this.lock) {
            try {
                if (this.state == State.CREATED) {
                    this.activeStreamSurfaceMap.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z2 = true;
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            int i2 = ((StreamId) entry2.getKey()).value;
                            Surface surface = (Surface) entry2.getValue();
                            CameraStream m89getaKI5c8E = this.streamGraph.m89getaKI5c8E(i2);
                            if (m89getaKI5c8E == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (m89getaKI5c8E.outputs.size() != 1) {
                                throw new IllegalStateException("Cannot finalize a multi-output stream!");
                            }
                            Map map2 = this.activeOutputSurfaceMap;
                            map2.getClass();
                            map2.put(new OutputId(((StreamGraphImpl.OutputStreamImpl) CollectionsKt.single((List) m89getaKI5c8E.outputs)).id), surface);
                        } else {
                            this.timeSource.getClass();
                            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new StreamId(((StreamId) ((Map.Entry) it3.next()).getKey()).value));
                            }
                            sb.append(arrayList);
                            sb.append(" for ");
                            sb.append(this);
                            sb.append(" in ");
                            sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                            Log.i("CXCP", sb.toString());
                        }
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            GraphProcessorImpl graphProcessorImpl = this.graphListener;
            Log.d("CXCP", graphProcessorImpl + " onGraphModified");
            graphProcessorImpl.graphLoop.processingQueue.tryEmit(GraphCommand.Stop.INSTANCE$2);
        }
        Trace.endSection();
    }

    public final void finalizeSession$camera_camera2_pipe(long j) {
        List<AutoCloseable> list;
        boolean isTerminated;
        if (j != 0) {
            JobKt.launch$default(this.scope, null, null, new ToastKt$Toast$8$1(j, this, (Continuation) null, 1), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.lock) {
            list = CollectionsKt.toList(this._surfaceTokenMap.values());
            this._surfaceTokenMap.clear();
        }
        for (AutoCloseable autoCloseable : list) {
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

    public final void onClosed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        Toolbar.AnonymousClass1 anonymousClass1 = this.sessionSequencer;
        if (anonymousClass1 != null) {
            anonymousClass1.release();
        }
        Trace.endSection();
    }

    public final void onConfigureFailed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.graphListener.onGraphError(new GraphState.GraphStateError(9, false));
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        Toolbar.AnonymousClass1 anonymousClass1 = this.sessionSequencer;
        if (anonymousClass1 != null) {
            anonymousClass1.release();
        }
        Trace.endSection();
    }

    public final void onConfigured(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        configure(cameraCaptureSessionWrapper);
        this.captureSessionAttemptCompleted.countDown();
        Toolbar.AnonymousClass1 anonymousClass1 = this.sessionSequencer;
        if (anonymousClass1 != null) {
            anonymousClass1.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionDisconnected() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        disconnect();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.sessionDisconnected.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionFinalized() {
        if (this.finalized.compareAndSet(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            shutdown();
            finalizeSession$camera_camera2_pipe(0L);
            Trace.endSection();
        }
    }

    public final void shutdown() {
        long j;
        boolean z;
        int i;
        disconnect();
        synchronized (this.lock) {
            try {
                State state = this.state;
                State state2 = State.CLOSED;
                j = 0;
                if (state != state2) {
                    z = true;
                    if (this._cameraDevice != null && this.hasAttemptedCaptureSession && (i = this.cameraGraphFlags.finalizeSessionOnCloseBehavior) != 1) {
                        if (i == 2) {
                            j = 2000;
                        }
                    }
                    this._cameraDevice = null;
                    this.state = state2;
                }
                z = false;
                this._cameraDevice = null;
                this.state = state2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            finalizeSession$camera_camera2_pipe(j);
        }
    }

    public final String toString() {
        return "CaptureSessionState-" + this.debugId;
    }

    public final void updateTrackedSurfaces(Map map, Map map2) {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean isTerminated;
        Set set = CollectionsKt.toSet(map.values());
        Set set2 = CollectionsKt.toSet(map2.values());
        Iterator it = SetsKt___SetsKt.minus(set, (Iterable) set2).iterator();
        do {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this._surfaceTokenMap;
            if (!hasNext) {
                for (Surface surface2 : SetsKt___SetsKt.minus(set2, (Iterable) set)) {
                    linkedHashMap.put(surface2, this.cameraSurfaceManager.registerSurface$camera_camera2_pipe(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
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
        } while (autoCloseable != null);
        Handlers$$ExternalSyntheticBUOutline0.m("Surface ", surface, " doesn't have a matching surface token!");
    }
}
