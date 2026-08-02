package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1;
import com.android.volley.toolbox.HurlStack;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import defpackage.Size$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes3.dex */
public final class CameraCallbackMap implements Request.Listener {
    public volatile Map callbacks;
    public final LinkedHashMap callbackMap = new LinkedHashMap();
    public final Lazy rejectOperationCameraCaptureSession$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(13));

    public CameraCallbackMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.callbacks = emptyMap;
    }

    public static int getCaptureConfigId(RequestMetadata requestMetadata) {
        TagBundle tagBundle = (TagBundle) requestMetadata.get(TagsKt.CAMERAX_TAG_BUNDLE);
        Object obj = tagBundle != null ? tagBundle.mTagMap.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void addCaptureCallback(CameraCaptureCallback cameraCaptureCallback, Executor executor) {
        cameraCaptureCallback.getClass();
        executor.getClass();
        if (this.callbacks.containsKey(cameraCaptureCallback)) {
            throw new IllegalStateException((cameraCaptureCallback + " was already registered!").toString());
        }
        synchronized (this.callbackMap) {
            this.callbackMap.put(cameraCaptureCallback, executor);
            this.callbacks = MapsKt__MapsKt.toMap(this.callbackMap);
        }
    }

    public final CameraCaptureSession getCameraCaptureSession(RequestMetadata requestMetadata) {
        ReflectionFactory reflectionFactory = Reflection.factory;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(ZslControlImpl$$ExternalSyntheticLambda1.m21m()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.rejectOperationCameraCaptureSession$delegate.getValue();
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onAborted(Request request) {
        request.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = request.extras.get(TagsKt.CAMERAX_TAG_BUNDLE);
            TagBundle tagBundle = obj instanceof TagBundle ? (TagBundle) obj : null;
            Object obj2 = tagBundle != null ? tagBundle.mTagMap.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new Recorder$$ExternalSyntheticLambda14(cameraCaptureCallback, num != null ? num.intValue() : -1, 1));
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
    public final void mo26onBufferLostiiEMlm4(RequestMetadata requestMetadata, final long j, int i, int i2) {
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                ReflectionFactory reflectionFactory = Reflection.factory;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                final Surface surface = (Surface) requestMetadata.getStreams().get(new StreamId(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer = (CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback;
                    executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.CameraCallbackMap$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraUseCaseAdapter.CaptureCallbackContainer.this.captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onCaptureProgress(RequestMetadata requestMetadata, int i) {
        requestMetadata.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                ReflectionFactory reflectionFactory = Reflection.factory;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda4((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new ListenerSet$$ExternalSyntheticLambda1(cameraCaptureCallback, this, requestMetadata, i));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                ReflectionFactory reflectionFactory = Reflection.factory;
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) androidFrameInfo.unwrapAs(reflectionFactory.getOrCreateKotlinClass(TotalCaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new ImageCapture$$ExternalSyntheticLambda3((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
                }
            } else {
                executor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(cameraCaptureCallback, this, requestMetadata, new CaptureResultAdapter(requestMetadata, androidFrameInfo), 1));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public final void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                ReflectionFactory reflectionFactory = Reflection.factory;
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) requestFailure.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureFailure.class));
                if (cameraCaptureSession != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new ImageCapture$$ExternalSyntheticLambda3((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, captureFailure, 2));
                }
            } else {
                executor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(cameraCaptureCallback, this, requestMetadata, new HurlStack(6), 2));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
    public final void mo27onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameMetadata androidFrameMetadata) {
        requestMetadata.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                ReflectionFactory reflectionFactory = Reflection.factory;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) androidFrameMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda4((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
    public final void mo28onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j, long j2) {
        requestMetadata.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                ReflectionFactory reflectionFactory = Reflection.factory;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda9((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, j2, j, 0));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceAborted(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                ReflectionFactory reflectionFactory = Reflection.factory;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new CameraX$$ExternalSyntheticLambda2(2, (CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession));
                }
            } else {
                executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda13(cameraCaptureCallback, this, requestMetadata, 1));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
    public final void mo29onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j) {
        requestMetadata.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(Reflection.factory.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda11((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, j, 0));
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
    public final void mo30onStarteduGKBvU4(RequestMetadata requestMetadata, long j, long j2) {
        requestMetadata.getClass();
        for (Map.Entry entry : this.callbacks.entrySet()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (cameraCaptureCallback instanceof CameraUseCaseAdapter.CaptureCallbackContainer) {
                CameraCaptureSession cameraCaptureSession = getCameraCaptureSession(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.unwrapAs(Reflection.factory.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda9((CameraUseCaseAdapter.CaptureCallbackContainer) cameraCaptureCallback, cameraCaptureSession, captureRequest, j2, j, 1));
                }
            } else {
                executor.execute(new CameraCallbackMap$$ExternalSyntheticLambda13(cameraCaptureCallback, this, requestMetadata, 0));
            }
        }
    }
}
