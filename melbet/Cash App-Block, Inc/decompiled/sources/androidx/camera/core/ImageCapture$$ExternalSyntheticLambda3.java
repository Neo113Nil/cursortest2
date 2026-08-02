package androidx.camera.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.camera.view.TextureViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.vitals.FrameStatesAggregator;
import com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.utilities.WorkflowValidationHelper;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.FormBody;
import org.json.JSONObject;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ImageCapture$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ImageCapture$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ImageCapture imageCapture = (ImageCapture) obj4;
                UseCaseGroup useCaseGroup = (UseCaseGroup) obj3;
                Executor executor = (Executor) obj2;
                FormBody.Builder builder = (FormBody.Builder) obj;
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    imageCapture.takePictureInternal(executor, null, builder, useCaseGroup);
                    break;
                } else {
                    zzabp.mainThreadExecutor().execute(new ImageCapture$$ExternalSyntheticLambda3(imageCapture, useCaseGroup, executor, builder, 0));
                    break;
                }
            case 1:
                ((CameraUseCaseAdapter.CaptureCallbackContainer) obj4).captureCallback.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                break;
            case 2:
                ((CameraUseCaseAdapter.CaptureCallbackContainer) obj4).captureCallback.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                break;
            case 3:
                TextureViewImplementation textureViewImplementation = (TextureViewImplementation) obj4;
                Surface surface = (Surface) obj3;
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) obj2;
                SurfaceRequest surfaceRequest = (SurfaceRequest) obj;
                StringUtilsKt.d("TextureViewImpl", "Safe to release surface.");
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = textureViewImplementation.mOnSurfaceNotInUseListener;
                if (previewView$1$$ExternalSyntheticLambda2 != null) {
                    previewView$1$$ExternalSyntheticLambda2.onSurfaceNotInUse();
                    textureViewImplementation.mOnSurfaceNotInUseListener = null;
                }
                surface.release();
                if (textureViewImplementation.mSurfaceReleaseFuture == callbackToFutureAdapter$SafeFuture) {
                    textureViewImplementation.mSurfaceReleaseFuture = null;
                }
                if (textureViewImplementation.mSurfaceRequest == surfaceRequest) {
                    textureViewImplementation.mSurfaceRequest = null;
                    break;
                }
                break;
            case 4:
                FrameStatesAggregator frameStatesAggregator = (FrameStatesAggregator) obj3;
                Window window = (Window) obj2;
                Handler handler = (Handler) obj;
                boolean isHardwareAccelerated = ((View) obj4).isHardwareAccelerated();
                InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
                if (!isHardwareAccelerated) {
                    DBUtil.log$default(frameStatesAggregator.internalLogger, 4, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$5, null, false, 56);
                    break;
                } else {
                    FrameStatesAggregator.DDFrameMetricsListener dDFrameMetricsListener = frameStatesAggregator.frameMetricsListener;
                    if (dDFrameMetricsListener != null) {
                        try {
                            window.addOnFrameMetricsAvailableListener(dDFrameMetricsListener, handler);
                            break;
                        } catch (IllegalStateException e) {
                            DBUtil.log$default(frameStatesAggregator.internalLogger, 5, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$6, e, false, 48);
                            return;
                        }
                    }
                }
                break;
            case 5:
                WebAppJSFetcher.lambda$fetchJS$3((Exception) obj4, (String) obj3, (List) obj2, (String) obj);
                break;
            default:
                ((WorkflowValidationHelper) obj4).lambda$processStreamData$0((String) obj3, (JSONObject) obj2, (JSONObject) obj);
                break;
        }
    }
}
