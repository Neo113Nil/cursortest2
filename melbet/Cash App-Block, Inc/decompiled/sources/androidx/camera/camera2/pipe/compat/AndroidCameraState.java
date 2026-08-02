package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.paging.FlowExtKt$simpleScan$1;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class AndroidCameraState extends CameraDevice.StateCallback {
    public final StateFlowImpl _state;
    public final int attemptNumber;
    public final long attemptTimestampNanos;
    public final AudioRestrictionControllerImpl audioRestrictionController;
    public final Camera2DeviceCloserImpl camera2DeviceCloser;
    public final Camera2Quirks camera2Quirks;
    public final CountDownLatch cameraDeviceClosed;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final String cameraId;
    public final int debugId;
    public final CameraDevice.StateCallback interopCameraDeviceStateCallback;
    public final Recorder.AnonymousClass4 interopCaptureSessionListener;
    public final Object lock;
    public final CameraMetadata metadata;
    public TimestampNs openTimestampNanos;
    public boolean opening;
    public ClosingInfo pendingClose;
    public final long requestTimestampNanos;
    public final Threads threads;
    public final SystemTimeSource timeSource;

    public final class ClosingInfo {
        public final long closingTimestamp;
        public final CameraError errorCode;
        public final Throwable exception;
        public final ClosedReason reason;

        public ClosingInfo(ClosedReason closedReason, CameraError cameraError, Exception exc, int i) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            cameraError = (i & 4) != 0 ? null : cameraError;
            exc = (i & 8) != 0 ? null : exc;
            this.reason = closedReason;
            this.closingTimestamp = elapsedRealtimeNanos;
            this.errorCode = cameraError;
            this.exception = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosingInfo)) {
                return false;
            }
            ClosingInfo closingInfo = (ClosingInfo) obj;
            return this.reason == closingInfo.reason && this.closingTimestamp == closingInfo.closingTimestamp && Intrinsics.areEqual(this.errorCode, closingInfo.errorCode) && Intrinsics.areEqual(this.exception, closingInfo.exception);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.reason.hashCode() * 31, 31, this.closingTimestamp);
            CameraError cameraError = this.errorCode;
            int hashCode = (m + (cameraError == null ? 0 : Integer.hashCode(cameraError.value))) * 31;
            Throwable th = this.exception;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ClosingInfo(reason=" + this.reason + ", closingTimestamp=" + ((Object) TimestampNs.m82toStringimpl(this.closingTimestamp)) + ", errorCode=" + this.errorCode + ", exception=" + this.exception + ')';
        }
    }

    public AndroidCameraState(String str, CameraMetadata cameraMetadata, int i, long j, SystemTimeSource systemTimeSource, Camera2ErrorProcessor camera2ErrorProcessor, Camera2DeviceCloserImpl camera2DeviceCloserImpl, Camera2Quirks camera2Quirks, Threads threads, AudioRestrictionControllerImpl audioRestrictionControllerImpl, CameraDevice.StateCallback stateCallback, Recorder.AnonymousClass4 anonymousClass4) {
        str.getClass();
        cameraMetadata.getClass();
        systemTimeSource.getClass();
        camera2ErrorProcessor.getClass();
        camera2DeviceCloserImpl.getClass();
        camera2Quirks.getClass();
        threads.getClass();
        audioRestrictionControllerImpl.getClass();
        this.cameraId = str;
        this.metadata = cameraMetadata;
        this.attemptNumber = i;
        this.attemptTimestampNanos = j;
        this.timeSource = systemTimeSource;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.camera2DeviceCloser = camera2DeviceCloserImpl;
        this.camera2Quirks = camera2Quirks;
        this.threads = threads;
        this.audioRestrictionController = audioRestrictionControllerImpl;
        this.interopCameraDeviceStateCallback = stateCallback;
        this.interopCaptureSessionListener = anonymousClass4;
        AtomicInt atomicInt = VirtualCameraKt.androidCameraDebugIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.lock = new Object();
        this.cameraDeviceClosed = new CountDownLatch(1);
        this._state = FlowKt.MutableStateFlow(CameraStateUnopened.INSTANCE);
        Log.i("CXCP", "Opening " + ((Object) CameraId.m46toStringimpl(str)));
        this.requestTimestampNanos = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    /* renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-_z0IXec, reason: not valid java name */
    public static void m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(Camera2Quirks camera2Quirks, String str) {
        camera2Quirks.getClass();
        str.getClass();
        camera2Quirks.strictMode.getClass();
    }

    public final void close() {
        CameraState cameraState = (CameraState) this._state.getValue();
        CameraDeviceWrapper cameraDeviceWrapper = cameraState instanceof CameraStateOpen ? ((CameraStateOpen) cameraState).cameraDevice : null;
        closeWith(cameraDeviceWrapper != null ? (CameraDevice) cameraDeviceWrapper.unwrapAs(Reflection.factory.getOrCreateKotlinClass(CameraDevice.class)) : null, new ClosingInfo(ClosedReason.APP_CLOSED, null, null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r6.opening == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void closeWith(CameraDevice cameraDevice, ClosingInfo closingInfo) {
        CameraState cameraState = (CameraState) this._state.getValue();
        CameraDeviceWrapper cameraDeviceWrapper = cameraState instanceof CameraStateOpen ? ((CameraStateOpen) cameraState).cameraDevice : null;
        synchronized (this.lock) {
            if (this.pendingClose == null) {
                this.pendingClose = closingInfo;
            }
            closingInfo = null;
        }
        if (closingInfo != null) {
            CameraError cameraError = closingInfo.errorCode;
            if (cameraError != null && closingInfo.reason != ClosedReason.CAMERA2_EXCEPTION) {
                this.cameraErrorListener.m69onCameraError3M5Xam4(this.cameraId, cameraError.value, false);
            }
            StateFlowImpl stateFlowImpl = this._state;
            CameraStateClosing cameraStateClosing = new CameraStateClosing(closingInfo.errorCode);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, cameraStateClosing);
            if (closingInfo.reason != ClosedReason.CAMERA2_CLOSED) {
                m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
                Camera2DeviceCloserImpl camera2DeviceCloserImpl = this.camera2DeviceCloser;
                AudioRestrictionControllerImpl audioRestrictionControllerImpl = this.audioRestrictionController;
                m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
                camera2DeviceCloserImpl.closeCamera(cameraDeviceWrapper, cameraDevice, this, audioRestrictionControllerImpl);
            }
            StateFlowImpl stateFlowImpl2 = this._state;
            CameraStateClosed computeClosedState = computeClosedState(closingInfo);
            stateFlowImpl2.getClass();
            stateFlowImpl2.updateState(null, computeClosedState);
        }
    }

    public final CameraStateClosed computeClosedState(ClosingInfo closingInfo) {
        this.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        TimestampNs timestampNs = this.openTimestampNanos;
        long j = closingInfo.closingTimestamp;
        DurationNs durationNs = timestampNs != null ? new DurationNs(timestampNs.value - this.attemptTimestampNanos) : null;
        DurationNs durationNs2 = timestampNs != null ? new DurationNs(timestampNs.value - this.requestTimestampNanos) : null;
        DurationNs durationNs3 = timestampNs == null ? null : new DurationNs(j - timestampNs.value);
        long j2 = elapsedRealtimeNanos - j;
        ClosedReason closedReason = closingInfo.reason;
        int i = this.attemptNumber - 1;
        return new CameraStateClosed(this.cameraId, closedReason, Integer.valueOf(i), durationNs, closingInfo.exception, durationNs2, durationNs3, new DurationNs(j2), closingInfo.errorCode);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!Intrinsics.areEqual(cameraDevice.getId(), this.cameraId)) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) CameraId.m46toStringimpl(this.cameraId)) + ": onClosed");
        this.cameraDeviceClosed.countDown();
        synchronized (this.lock) {
        }
        Trace.beginSection(((Object) CameraId.m46toStringimpl(this.cameraId)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_CLOSED, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.cameraId;
        if (!Intrinsics.areEqual(id, str)) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) CameraId.m46toStringimpl(str)) + ": onDisconnected");
        this.cameraDeviceClosed.countDown();
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_DISCONNECTED, new CameraError(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.cameraId;
        if (!Intrinsics.areEqual(id, str)) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) CameraId.m46toStringimpl(str)) + ": onError " + i);
        this.cameraDeviceClosed.countDown();
        ClosedReason closedReason = ClosedReason.CAMERA2_ERROR;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        closeWith(cameraDevice, new ClosingInfo(closedReason, new CameraError(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String m;
        ClosingInfo closingInfo;
        ClosingInfo closingInfo2;
        cameraDevice.getClass();
        if (!Intrinsics.areEqual(cameraDevice.getId(), this.cameraId)) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        this.timeSource.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.openTimestampNanos = new TimestampNs(elapsedRealtimeNanos);
        Trace.beginSection(((Object) CameraId.m46toStringimpl(this.cameraId)) + "#onOpened");
        long j = elapsedRealtimeNanos - this.requestTimestampNanos;
        long j2 = elapsedRealtimeNanos - this.attemptTimestampNanos;
        int i = this.attemptNumber;
        String str = this.cameraId;
        Continuation continuation = null;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) CameraId.m46toStringimpl(str));
            sb.append(" in ");
            m = CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, (Locale) null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) CameraId.m46toStringimpl(str));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.attemptNumber, " attempts.", sb2);
        }
        Log.i("CXCP", m);
        synchronized (this.lock) {
            closingInfo = this.pendingClose;
            if (closingInfo == null) {
                this.opening = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (closingInfo != null) {
            Camera2DeviceCloserImpl camera2DeviceCloserImpl = this.camera2DeviceCloser;
            AudioRestrictionControllerImpl audioRestrictionControllerImpl = this.audioRestrictionController;
            m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
            m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
            camera2DeviceCloserImpl.closeCamera(null, cameraDevice, this, audioRestrictionControllerImpl);
            return;
        }
        AndroidCameraDevice androidCameraDevice = new AndroidCameraDevice(this.metadata, cameraDevice, this.cameraId, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads);
        AudioRestrictionControllerImpl audioRestrictionControllerImpl2 = this.audioRestrictionController;
        audioRestrictionControllerImpl2.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (audioRestrictionControllerImpl2.lock) {
                audioRestrictionControllerImpl2.activeListeners.add(androidCameraDevice);
                AudioRestrictionMode m62computeAudioRestrictionMode4o0Og1A = audioRestrictionControllerImpl2.m62computeAudioRestrictionMode4o0Og1A();
                if (m62computeAudioRestrictionMode4o0Og1A != null) {
                    PreviewView.AnonymousClass1 anonymousClass1 = audioRestrictionControllerImpl2.coroutineMutex;
                    ContextScope contextScope = audioRestrictionControllerImpl2.scope;
                    RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(androidCameraDevice, m62computeAudioRestrictionMode4o0Og1A, continuation, 6);
                    anonymousClass1.getClass();
                    contextScope.getClass();
                    JobKt.launch$default(contextScope, null, CoroutineStart.UNDISPATCHED, new FlowExtKt$simpleScan$1(anonymousClass1, realBadger2$clear$2, continuation, 5), 1);
                }
            }
        }
        StateFlowImpl stateFlowImpl = this._state;
        CameraStateOpen cameraStateOpen = new CameraStateOpen(androidCameraDevice);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, cameraStateOpen);
        synchronized (this.lock) {
            this.opening = false;
            closingInfo2 = this.pendingClose;
        }
        if (closingInfo2 != null) {
            StateFlowImpl stateFlowImpl2 = this._state;
            CameraStateClosing cameraStateClosing = new CameraStateClosing(closingInfo2.errorCode);
            stateFlowImpl2.getClass();
            stateFlowImpl2.updateState(null, cameraStateClosing);
            Camera2DeviceCloserImpl camera2DeviceCloserImpl2 = this.camera2DeviceCloser;
            AudioRestrictionControllerImpl audioRestrictionControllerImpl3 = this.audioRestrictionController;
            m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
            m61shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId);
            camera2DeviceCloserImpl2.closeCamera(androidCameraDevice, cameraDevice, this, audioRestrictionControllerImpl3);
            StateFlowImpl stateFlowImpl3 = this._state;
            CameraStateClosed computeClosedState = computeClosedState(closingInfo2);
            stateFlowImpl3.getClass();
            stateFlowImpl3.updateState(null, computeClosedState);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.debugId;
    }
}
