package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.CaptureBundles$CaptureBundleImpl;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.CaptureStage$DefaultCaptureStage;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ProcessingRequest {
    public final RequestWithCallback mCallback;
    public final ListenableFuture mCaptureFuture;
    public final Rect mCropRect;
    public final int mJpegQuality;
    public final UseCaseGroup mOutputFileOptions;
    public final int mRequestId;
    public final int mRotationDegrees;
    public final Matrix mSensorToBufferTransform;
    public final String mTagBundleKey;
    public final AutoValue_TakePictureRequest mTakePictureRequest;
    public int mLastCaptureProcessProgressed = -1;
    public final ArrayList mStageIds = new ArrayList();

    public ProcessingRequest(CaptureBundles$CaptureBundleImpl captureBundles$CaptureBundleImpl, AutoValue_TakePictureRequest autoValue_TakePictureRequest, RequestWithCallback requestWithCallback, ListenableFuture listenableFuture, int i) {
        this.mRequestId = i;
        this.mTakePictureRequest = autoValue_TakePictureRequest;
        this.mOutputFileOptions = autoValue_TakePictureRequest.outputFileOptions;
        this.mJpegQuality = autoValue_TakePictureRequest.jpegQuality;
        this.mRotationDegrees = autoValue_TakePictureRequest.rotationDegrees;
        this.mCropRect = autoValue_TakePictureRequest.cropRect;
        this.mSensorToBufferTransform = autoValue_TakePictureRequest.sensorToBufferTransform;
        this.mCallback = requestWithCallback;
        this.mTagBundleKey = String.valueOf(captureBundles$CaptureBundleImpl.hashCode());
        List<CaptureStage$DefaultCaptureStage> list = captureBundles$CaptureBundleImpl.mCaptureStageList;
        Objects.requireNonNull(list);
        for (CaptureStage$DefaultCaptureStage captureStage$DefaultCaptureStage : list) {
            ArrayList arrayList = this.mStageIds;
            captureStage$DefaultCaptureStage.getClass();
            arrayList.add(0);
        }
        this.mCaptureFuture = listenableFuture;
        StringUtilsKt.d("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.mRequestId + ", mTagBundleKey = " + this.mTagBundleKey);
    }

    public final void onCaptureProcessProgressed(int i) {
        if (this.mLastCaptureProcessProgressed != i) {
            this.mLastCaptureProcessProgressed = i;
            Threads.checkMainThread();
            RequestWithCallback requestWithCallback = this.mCallback;
            if (requestWithCallback.mIsAborted) {
                return;
            }
            AutoValue_TakePictureRequest autoValue_TakePictureRequest = requestWithCallback.mTakePictureRequest;
            autoValue_TakePictureRequest.appExecutor.execute(new Recorder$$ExternalSyntheticLambda13(autoValue_TakePictureRequest, i));
        }
    }
}
