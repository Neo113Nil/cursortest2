package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicLong;
import kotlinx.coroutines.CompletableDeferredImpl;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Camera2CaptureSequence extends CameraCaptureSession.CaptureCallback {
    public volatile Integer _sequenceNumber;
    public final String cameraId;
    public final ArrayList captureMetadataList;
    public final ArrayList captureRequestList;
    public final long debugId;
    public final CompletableDeferredImpl hasStarted;
    public final List listeners;
    public final boolean repeating;
    public final Toolbar.AnonymousClass1 sequenceListener;
    public final StreamGraphImpl streamGraph;
    public final StrictMode strictMode;
    public final ArrayMap surfaceToOutputMap;
    public final ArrayMap surfaceToStreamMap;

    public Camera2CaptureSequence(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, Toolbar.AnonymousClass1 anonymousClass1, ArrayMap arrayMap, ArrayMap arrayMap2, StreamGraphImpl streamGraphImpl, StrictMode strictMode) {
        str.getClass();
        list.getClass();
        anonymousClass1.getClass();
        strictMode.getClass();
        this.cameraId = str;
        this.repeating = z;
        this.captureRequestList = arrayList;
        this.captureMetadataList = arrayList2;
        this.listeners = list;
        this.sequenceListener = anonymousClass1;
        this.surfaceToStreamMap = arrayMap;
        this.surfaceToOutputMap = arrayMap2;
        this.streamGraph = streamGraphImpl;
        this.strictMode = strictMode;
        AtomicLong atomicLong = Camera2CaptureSequenceProcessorKt.captureSequenceDebugIds;
        atomicLong.getClass();
        this.debugId = AtomicLong.FU.incrementAndGet(atomicLong);
        this.hasStarted = new CompletableDeferredImpl();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int getSequenceNumber() {
        int intValue;
        if (this._sequenceNumber != null) {
            Integer num = this._sequenceNumber;
            if (num != null) {
                return num.intValue();
            }
            ZslControlImpl$$ExternalSyntheticLambda1.m("SequenceNumber has not been set for ", 33, this);
            return 0;
        }
        synchronized (this) {
            Integer num2 = this._sequenceNumber;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            intValue = num2.intValue();
        }
        return intValue;
    }

    /* renamed from: invokeCaptureFailure-CcXjc1I, reason: not valid java name */
    public final void m64invokeCaptureFailureCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
        this.sequenceListener.onCaptureSequenceComplete(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Request.Listener) list.get(i)).mo17onFailedCcXjc1I(requestMetadata, j, requestFailure);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().listeners.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Request.Listener) requestMetadata.getRequest().listeners.get(i2)).mo17onFailedCcXjc1I(requestMetadata, j, requestFailure);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        StreamGraphImpl.OutputStreamImpl outputStreamImpl;
        Object obj;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        StreamId streamId = (StreamId) this.surfaceToStreamMap.get(surface);
        ArrayMap arrayMap = this.surfaceToOutputMap;
        if (streamId == null) {
            OutputId outputId = (OutputId) arrayMap.get(surface);
            StreamId streamId2 = null;
            if (outputId != null) {
                int i = outputId.value;
                Iterator it = this.streamGraph.outputs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((StreamGraphImpl.OutputStreamImpl) obj).id == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) obj;
            } else {
                outputStreamImpl = null;
            }
            if (outputStreamImpl != null) {
                CameraStream cameraStream = outputStreamImpl.stream;
                if (cameraStream == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stream");
                    throw null;
                }
                streamId2 = new StreamId(cameraStream.id);
            }
            streamId = streamId2;
        }
        OutputId outputId2 = (OutputId) arrayMap.get(surface);
        if (streamId == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            ZslControlImpl$$ExternalSyntheticLambda1.m(sb, " on ", FrameNumber.m47toStringimpl(j));
            return;
        }
        if (outputId2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            ZslControlImpl$$ExternalSyntheticLambda1.m(sb2, " on ", FrameNumber.m47toStringimpl(j));
            return;
        }
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Request.Listener) list.get(i2)).getClass();
            readRequestMetadata.getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((Request.Listener) list.get(i4)).mo26onBufferLostiiEMlm4(readRequestMetadata, j, streamId.value, outputId2.value);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = readRequestMetadata.getRequest().listeners.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i5)).mo26onBufferLostiiEMlm4(readRequestMetadata, j, streamId.value, outputId2.value);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        m65onCaptureCompletedrmrZIYk(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    /* renamed from: onCaptureCompleted-rmrZIYk, reason: not valid java name */
    public final void m65onCaptureCompletedrmrZIYk(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        captureRequest.getClass();
        totalCaptureResult.getClass();
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.sequenceListener.onCaptureSequenceComplete(this);
        Trace.endSection();
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        AndroidFrameInfo androidFrameInfo = new AndroidFrameInfo(totalCaptureResult, this.cameraId, readRequestMetadata);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((Request.Listener) list.get(i)).mo18onTotalCaptureResultCcXjc1I(readRequestMetadata, j, androidFrameInfo);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i2)).mo18onTotalCaptureResultCcXjc1I(readRequestMetadata, j, androidFrameInfo);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((Request.Listener) list.get(i3)).mo16onCompleteCcXjc1I(readRequestMetadata, j, androidFrameInfo);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = readRequestMetadata.getRequest().listeners.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i4)).mo16onCompleteCcXjc1I(readRequestMetadata, j, androidFrameInfo);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        m64invokeCaptureFailureCcXjc1I(readRequestMetadata, captureFailure.getFrameNumber(), new AndroidCaptureFailure(readRequestMetadata, captureFailure));
        Trace.endSection();
    }

    /* renamed from: onCaptureFailed-RuT0dZU, reason: not valid java name */
    public final void m66onCaptureFailedRuT0dZU(CaptureRequest captureRequest, long j) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        m64invokeCaptureFailureCcXjc1I(readRequestMetadata, j, new ExtensionRequestFailure(readRequestMetadata, j));
        Trace.endSection();
    }

    public final void onCaptureProcessProgressed(CaptureRequest captureRequest, int i) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureProcessProgressed");
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Request.Listener) list.get(i2)).onCaptureProgress(readRequestMetadata, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i3)).onCaptureProgress(readRequestMetadata, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        AndroidFrameMetadata androidFrameMetadata = new AndroidFrameMetadata(captureResult, this.cameraId);
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Request.Listener) list.get(i)).mo27onPartialCaptureResultCcXjc1I(readRequestMetadata, frameNumber, androidFrameMetadata);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i2)).mo27onPartialCaptureResultCcXjc1I(readRequestMetadata, frameNumber, androidFrameMetadata);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void onCaptureSequenceAborted(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.hasStarted.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        this.sequenceListener.onCaptureSequenceComplete(this);
        if (getSequenceNumber() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + getSequenceNumber() + ", but expected " + i + '!';
            this.strictMode.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.captureMetadataList;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = (RequestMetadata) arrayList.get(i2);
            List list = this.listeners;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((Request.Listener) list.get(i3)).onRequestSequenceAborted(requestMetadata);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = (RequestMetadata) arrayList.get(i4);
            int size4 = requestMetadata2.getRequest().listeners.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((Request.Listener) requestMetadata2.getRequest().listeners.get(i5)).onRequestSequenceAborted(requestMetadata2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void onCaptureSequenceCompleted(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.hasStarted.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        this.sequenceListener.onCaptureSequenceComplete(this);
        if (getSequenceNumber() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + getSequenceNumber() + ", but expected " + i + '!';
            this.strictMode.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.captureMetadataList;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = (RequestMetadata) arrayList.get(i2);
            List list = this.listeners;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((Request.Listener) list.get(i3)).mo29onRequestSequenceCompletedRuT0dZU(requestMetadata, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = (RequestMetadata) arrayList.get(i4);
            int size4 = requestMetadata2.getRequest().listeners.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((Request.Listener) requestMetadata2.getRequest().listeners.get(i5)).mo29onRequestSequenceCompletedRuT0dZU(requestMetadata2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void onCaptureStarted(CaptureRequest captureRequest, long j, long j2) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureStarted");
        this.hasStarted.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Request.Listener) list.get(i)).mo30onStarteduGKBvU4(readRequestMetadata, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i2)).mo30onStarteduGKBvU4(readRequestMetadata, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        RequestMetadata readRequestMetadata = readRequestMetadata(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.listeners;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Request.Listener) list.get(i)).mo28onReadoutStartedmP9r9w(readRequestMetadata, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = readRequestMetadata.getRequest().listeners.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Request.Listener) readRequestMetadata.getRequest().listeners.get(i2)).mo28onReadoutStartedmP9r9w(readRequestMetadata, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final RequestMetadata readRequestMetadata(CaptureRequest captureRequest) {
        ArrayList arrayList = this.captureRequestList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (RequestMetadata) this.captureMetadataList.get(i);
            }
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.debugId;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        onCaptureStarted(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        onCaptureSequenceAborted(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        onCaptureSequenceCompleted(i, j);
    }
}
