package androidx.camera.core.imagecapture;

import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.CaptureBundles$CaptureBundleImpl;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage$DefaultCaptureStage;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.TransactorKt;
import com.bugsnag.android.TraceParser;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.nimbusds.jose.JWECryptoParts;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class TakePictureManagerImpl implements ForwardingImageProxy.OnImageCloseListener {
    public RequestWithCallback mCapturingRequest;
    public final Recorder.AnonymousClass6 mImageCaptureControl;
    public JWECryptoParts mImagePipeline;
    public final ArrayList mIncompleteRequests;
    public final ArrayDeque mNewRequests = new ArrayDeque();
    public boolean mPaused = false;

    public TakePictureManagerImpl(Recorder.AnonymousClass6 anonymousClass6) {
        Threads.checkMainThread();
        this.mImageCaptureControl = anonymousClass6;
        this.mIncompleteRequests = new ArrayList();
    }

    public final void abortRequests() {
        int i;
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.mNewRequests;
        Iterator it = arrayDeque.iterator();
        while (true) {
            i = 16;
            if (!it.hasNext()) {
                break;
            }
            AutoValue_TakePictureRequest autoValue_TakePictureRequest = (AutoValue_TakePictureRequest) it.next();
            autoValue_TakePictureRequest.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(i, autoValue_TakePictureRequest, imageCaptureException));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.mIncompleteRequests).iterator();
        while (it2.hasNext()) {
            RequestWithCallback requestWithCallback = (RequestWithCallback) it2.next();
            requestWithCallback.getClass();
            Threads.checkMainThread();
            if (!requestWithCallback.mCompleteFuture.delegate.isDone()) {
                Threads.checkMainThread();
                requestWithCallback.mIsAborted = true;
                ChainingListenableFuture chainingListenableFuture = requestWithCallback.mCaptureRequestFuture;
                Objects.requireNonNull(chainingListenableFuture);
                chainingListenableFuture.cancel(true);
                requestWithCallback.mCaptureCompleter.setException(imageCaptureException);
                requestWithCallback.mCompleteCompleter.set(null);
                Threads.checkMainThread();
                AutoValue_TakePictureRequest autoValue_TakePictureRequest2 = requestWithCallback.mTakePictureRequest;
                autoValue_TakePictureRequest2.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(i, autoValue_TakePictureRequest2, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void issueNextRequest() {
        CaptureBundles$CaptureBundleImpl captureBundles$CaptureBundleImpl;
        CameraCaptureCallback cameraCaptureCallback;
        SurfaceRequest.AnonymousClass2 anonymousClass2;
        Threads.checkMainThread();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.mCapturingRequest != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.mPaused) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        JWECryptoParts jWECryptoParts = this.mImagePipeline;
        jWECryptoParts.getClass();
        Threads.checkMainThread();
        if (((e0) jWECryptoParts.iv).getCapacity() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = (AutoValue_TakePictureRequest) this.mNewRequests.poll();
        if (autoValue_TakePictureRequest == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(autoValue_TakePictureRequest, this);
        int i = 0;
        boolean z = true;
        TransactorKt.checkState(null, !(this.mCapturingRequest != null));
        this.mCapturingRequest = requestWithCallback;
        Threads.checkMainThread();
        requestWithCallback.mCaptureFuture.delegate.addListener(new TakePictureManagerImpl$$ExternalSyntheticLambda0(this, i), zzabp.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        Threads.checkMainThread();
        requestWithCallback.mCompleteFuture.delegate.addListener(new CameraX$$ExternalSyntheticLambda2(15, this, requestWithCallback), zzabp.directExecutor());
        JWECryptoParts jWECryptoParts2 = this.mImagePipeline;
        Threads.checkMainThread();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = requestWithCallback.mCaptureFuture;
        jWECryptoParts2.getClass();
        Threads.checkMainThread();
        CaptureBundles$CaptureBundleImpl captureBundles$CaptureBundleImpl2 = (CaptureBundles$CaptureBundleImpl) ((ImageCaptureConfig) jWECryptoParts2.header).retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_BUNDLE, new CaptureBundles$CaptureBundleImpl(Arrays.asList(new CaptureStage$DefaultCaptureStage())));
        Objects.requireNonNull(captureBundles$CaptureBundleImpl2);
        int i2 = JWECryptoParts.sNextRequestId;
        JWECryptoParts.sNextRequestId = i2 + 1;
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = (AutoValue_CaptureNode_In) jWECryptoParts2.authenticationTag;
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(captureBundles$CaptureBundleImpl2.hashCode());
        List<CaptureStage$DefaultCaptureStage> list = captureBundles$CaptureBundleImpl2.mCaptureStageList;
        Objects.requireNonNull(list);
        for (CaptureStage$DefaultCaptureStage captureStage$DefaultCaptureStage : list) {
            TraceParser traceParser = new TraceParser();
            CaptureConfig captureConfig = (CaptureConfig) jWECryptoParts2.encryptedKey;
            int i3 = i;
            traceParser.state = captureConfig.mTemplateType;
            traceParser.addImplementationOptions(captureConfig.mImplementationOptions);
            traceParser.addAllCameraCaptureCallbacks(autoValue_TakePictureRequest.sessionConfigCameraCaptureCallbacks);
            SurfaceRequest.AnonymousClass2 anonymousClass22 = autoValue_CaptureNode_In.mSurface;
            int i4 = autoValue_CaptureNode_In.inputFormat;
            ArrayList arrayList2 = autoValue_CaptureNode_In.outputFormats;
            Objects.requireNonNull(anonymousClass22);
            JWECryptoParts jWECryptoParts3 = jWECryptoParts2;
            ((HashSet) traceParser.logger).add(anonymousClass22);
            if (arrayList2.size() > 1 && (anonymousClass2 = autoValue_CaptureNode_In.mSecondarySurface) != null) {
                ((HashSet) traceParser.logger).add(anonymousClass2);
            }
            SurfaceRequest.AnonymousClass2 anonymousClass23 = autoValue_CaptureNode_In.mPostviewSurface;
            if ((anonymousClass23 != null ? 1 : i3) != 0) {
                Objects.requireNonNull(anonymousClass23);
                ((HashSet) traceParser.logger).add(anonymousClass23);
            }
            if (ImageUtil.isJpegFormats(i4) || i4 == 32) {
                if (((ImageCaptureRotationOptionQuirk) DeviceQuirks.sQuirks.get(ImageCaptureRotationOptionQuirk.class)) != null) {
                    AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_ROTATION;
                } else {
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(autoValue_TakePictureRequest.rotationDegrees));
                }
                captureBundles$CaptureBundleImpl = captureBundles$CaptureBundleImpl2;
                ((MutableOptionsBundle) traceParser.projectPackages).insertOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(((autoValue_TakePictureRequest.onDiskCallback != null ? 1 : i3) == 0 || !TransformUtils.hasCropping(autoValue_TakePictureRequest.cropRect, autoValue_CaptureNode_In.size)) ? autoValue_TakePictureRequest.jpegQuality : autoValue_TakePictureRequest.captureMode == 0 ? 100 : 95));
            } else {
                captureBundles$CaptureBundleImpl = captureBundles$CaptureBundleImpl2;
            }
            traceParser.addImplementationOptions(captureStage$DefaultCaptureStage.mCaptureConfig.mImplementationOptions);
            ((MutableTagBundle) traceParser.threadAttrs).mTagMap.put(valueOf, Integer.valueOf(i3));
            ((MutableTagBundle) traceParser.threadAttrs).mTagMap.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
            traceParser.addCameraCaptureCallback(autoValue_CaptureNode_In.mCameraCaptureCallback);
            if (arrayList2.size() > 1 && (cameraCaptureCallback = autoValue_CaptureNode_In.mSecondaryCameraCaptureCallback) != null) {
                traceParser.addCameraCaptureCallback(cameraCaptureCallback);
            }
            arrayList.add(traceParser.build());
            z = true;
            i = i3;
            jWECryptoParts2 = jWECryptoParts3;
            captureBundles$CaptureBundleImpl2 = captureBundles$CaptureBundleImpl;
        }
        int i5 = i;
        boolean z2 = z;
        Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(7, arrayList, requestWithCallback);
        ProcessingRequest processingRequest = new ProcessingRequest(captureBundles$CaptureBundleImpl2, autoValue_TakePictureRequest, requestWithCallback, callbackToFutureAdapter$SafeFuture, i2);
        JWECryptoParts jWECryptoParts4 = this.mImagePipeline;
        jWECryptoParts4.getClass();
        Threads.checkMainThread();
        ((AutoValue_CaptureNode_In) jWECryptoParts4.authenticationTag).requestEdge.accept(processingRequest);
        Threads.checkMainThread();
        ImageCapture imageCapture = (ImageCapture) this.mImageCaptureControl.this$0;
        synchronized (imageCapture.mLockedFlashMode) {
            try {
                if (imageCapture.mLockedFlashMode.get() == null) {
                    imageCapture.mLockedFlashMode.set(Integer.valueOf(imageCapture.getFlashMode()));
                }
            } finally {
            }
        }
        ImageCapture imageCapture2 = (ImageCapture) this.mImageCaptureControl.this$0;
        Threads.checkMainThread();
        ChainingListenableFuture transformAsync = Futures.transformAsync(imageCapture2.getCameraControl$1().submitStillCaptureRequests(arrayList, imageCapture2.mCaptureMode, imageCapture2.mFlashType), new Toolbar.AnonymousClass1(new ZslControlImpl$$ExternalSyntheticLambda1(19)), zzabp.directExecutor());
        Futures.addCallback(transformAsync, new Recorder.AnonymousClass4(8, this, anonymousClass1), zzabp.mainThreadExecutor());
        Threads.checkMainThread();
        if (requestWithCallback.mCaptureRequestFuture != null) {
            z2 = i5;
        }
        TransactorKt.checkState("CaptureRequestFuture can only be set once.", z2);
        requestWithCallback.mCaptureRequestFuture = transformAsync;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ForwardingImageProxy forwardingImageProxy) {
        zzabp.mainThreadExecutor().execute(new TakePictureManagerImpl$$ExternalSyntheticLambda0(this, 1));
    }
}
