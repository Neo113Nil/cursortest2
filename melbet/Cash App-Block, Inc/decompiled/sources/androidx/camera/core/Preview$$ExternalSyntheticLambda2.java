package androidx.camera.core;

import androidx.camera.core.imagecapture.AutoValue_TakePictureRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.video.VideoCapture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Preview$$ExternalSyntheticLambda2 implements SessionConfig.ErrorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Preview$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Preview preview = (Preview) obj;
                if (preview.getCamera() != null) {
                    preview.updateConfigAndOutput((PreviewConfig) preview.mCurrentConfig, preview.mAttachedStreamSpec);
                    preview.notifyReset();
                    break;
                }
                break;
            case 1:
                ImageCapture imageCapture = (ImageCapture) obj;
                if (imageCapture.getCamera() != null) {
                    TakePictureManagerImpl takePictureManagerImpl = imageCapture.mTakePictureManager;
                    takePictureManagerImpl.getClass();
                    Threads.checkMainThread();
                    takePictureManagerImpl.mPaused = true;
                    RequestWithCallback requestWithCallback = takePictureManagerImpl.mCapturingRequest;
                    if (requestWithCallback != null) {
                        Threads.checkMainThread();
                        if (!requestWithCallback.mCompleteFuture.delegate.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
                            Threads.checkMainThread();
                            requestWithCallback.mIsAborted = true;
                            ChainingListenableFuture chainingListenableFuture = requestWithCallback.mCaptureRequestFuture;
                            Objects.requireNonNull(chainingListenableFuture);
                            chainingListenableFuture.cancel(true);
                            requestWithCallback.mCaptureCompleter.setException(imageCaptureException);
                            requestWithCallback.mCompleteCompleter.set(null);
                            TakePictureManagerImpl takePictureManagerImpl2 = requestWithCallback.mRetryControl;
                            AutoValue_TakePictureRequest autoValue_TakePictureRequest = requestWithCallback.mTakePictureRequest;
                            Threads.checkMainThread();
                            StringUtilsKt.d("TakePictureManagerImpl", "Add a new request for retrying.");
                            takePictureManagerImpl2.mNewRequests.addFirst(autoValue_TakePictureRequest);
                            takePictureManagerImpl2.issueNextRequest();
                        }
                    }
                    imageCapture.clearPipeline(true);
                    String cameraId = imageCapture.getCameraId();
                    ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) imageCapture.mCurrentConfig;
                    AutoValue_StreamSpec autoValue_StreamSpec = imageCapture.mAttachedStreamSpec;
                    autoValue_StreamSpec.getClass();
                    SessionConfig.Builder createPipeline = imageCapture.createPipeline(cameraId, imageCaptureConfig, autoValue_StreamSpec);
                    imageCapture.mSessionConfigBuilder = createPipeline;
                    Object[] objArr = {createPipeline.build()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    imageCapture.updateSessionConfig(Collections.unmodifiableList(arrayList));
                    imageCapture.notifyReset();
                    TakePictureManagerImpl takePictureManagerImpl3 = imageCapture.mTakePictureManager;
                    takePictureManagerImpl3.getClass();
                    Threads.checkMainThread();
                    takePictureManagerImpl3.mPaused = false;
                    takePictureManagerImpl3.issueNextRequest();
                    break;
                }
                break;
            case 2:
                Iterator it = ((SessionConfig.ValidatingBuilder) obj).mErrorListeners.iterator();
                while (it.hasNext()) {
                    ((SessionConfig.ErrorListener) it.next()).onError(sessionConfig);
                }
                break;
            default:
                ((VideoCapture) obj).resetPipeline();
                break;
        }
    }
}
