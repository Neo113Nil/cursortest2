package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.Preview;
import androidx.camera.core.imagecapture.AutoValue_TakePictureRequest;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.LiveDataObservable$Result;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.VideoCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.internal.CameraFrame;
import com.plaid.internal.c7$$ExternalSyntheticLambda0;
import com.squareup.cash.api.ContextKt;
import com.stripe.hcaptcha.HCaptcha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import net.oneformapp.ProfileStore_;
import okhttp3.FormBody;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void run$androidx$camera$core$impl$CameraRepository$$ExternalSyntheticLambda0() {
        CameraRepository cameraRepository = (CameraRepository) this.f$0;
        CameraInternal cameraInternal = (CameraInternal) this.f$1;
        synchronized (cameraRepository.mCamerasLock) {
            try {
                cameraRepository.mReleasingCameras.remove(cameraInternal);
                if (cameraRepository.mReleasingCameras.isEmpty()) {
                    cameraRepository.mDeinitCompleter.getClass();
                    cameraRepository.mDeinitCompleter.set(null);
                    cameraRepository.mDeinitCompleter = null;
                    cameraRepository.mDeinitFuture = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void run$androidx$camera$core$impl$DeferrableSurface$$ExternalSyntheticLambda2() {
        DeferrableSurface deferrableSurface = (DeferrableSurface) this.f$0;
        String str = (String) this.f$1;
        try {
            deferrableSurface.mTerminationFuture.get();
            deferrableSurface.printGlobalDebugCounts(DeferrableSurface.TOTAL_COUNT.decrementAndGet(), DeferrableSurface.USED_COUNT.get(), "Surface terminated");
        } catch (Exception e) {
            StringUtilsKt.e("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
            synchronized (deferrableSurface.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.mClosed), Integer.valueOf(deferrableSurface.mUseCount)), e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CameraX cameraX = (CameraX) this.f$0;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.f$1;
                StuckPlayerDetector stuckPlayerDetector = cameraX.mCameraFactory;
                if (!((AtomicBoolean) stuckPlayerDetector.stuckSuppressedDetector).getAndSet(true)) {
                    CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) stuckPlayerDetector.period;
                    cameraCoordinatorAdapter.getClass();
                    cameraCoordinatorAdapter.concurrentModeOn = false;
                    synchronized (cameraCoordinatorAdapter.lock) {
                        cameraCoordinatorAdapter.cameraRepository = null;
                        MapsKt__MapsKt.emptyMap();
                        cameraCoordinatorAdapter.activeConcurrentCameraInfosList = EmptyList.INSTANCE;
                        cameraCoordinatorAdapter.concurrentMode = 0;
                        cameraCoordinatorAdapter.pendingCameraIds.clear();
                    }
                    PipeCameraPresenceSource pipeCameraPresenceSource = (PipeCameraPresenceSource) stuckPlayerDetector.handler;
                    pipeCameraPresenceSource.getClass();
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (pipeCameraPresenceSource.isMonitoring.compareAndSet(true, false)) {
                        StandaloneCoroutine standaloneCoroutine = pipeCameraPresenceSource.flowCollectionJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        pipeCameraPresenceSource.flowCollectionJob = null;
                    }
                    if (((Lazy) stuckPlayerDetector.player).isInitialized()) {
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) ((Lazy) stuckPlayerDetector.player).getValue();
                        synchronized (cameraPipeImpl.lock) {
                            if (cameraPipeImpl.shutdown) {
                                throw new IllegalStateException("Check failed.");
                            }
                            ((CameraPipeLifetime) cameraPipeImpl.component.cameraPipeLifetimeProvider.get()).shutdown();
                            cameraPipeImpl.shutdown = true;
                        }
                    }
                }
                if (cameraX.mSchedulerThread != null) {
                    Executor executor = cameraX.mCameraExecutor;
                    if (executor instanceof CameraExecutor) {
                        CameraExecutor cameraExecutor = (CameraExecutor) executor;
                        synchronized (cameraExecutor.mExecutorLock) {
                            try {
                                if (!cameraExecutor.mThreadPoolExecutor.isShutdown()) {
                                    cameraExecutor.mThreadPoolExecutor.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    cameraX.mSchedulerThread.quit();
                }
                callbackToFutureAdapter$Completer.set(null);
                return;
            case 1:
                ((Consumer) this.f$0).accept((AutoValue_CameraState) this.f$1);
                return;
            case 2:
                ((CameraUseCaseAdapter.CaptureCallbackContainer) this.f$0).captureCallback.onCaptureSequenceAborted((CameraCaptureSession) this.f$1, -1);
                return;
            case 3:
                ((Request.Listener) this.f$0).onAborted((Request) this.f$1);
                return;
            case 4:
                Surface surface = (Surface) this.f$0;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f$1;
                surface.release();
                surfaceTexture.release();
                return;
            case 5:
                UseCaseThreads useCaseThreads = (UseCaseThreads) this.f$0;
                Runnable runnable = (Runnable) this.f$1;
                ThreadLocal threadLocal = useCaseThreads.isSequentialThread;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 6:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$0;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f$1;
                JobKt.cancel((CoroutineScope) ref$ObjectRef.element, (CancellationException) null);
                JobKt.cancel((CoroutineScope) ref$ObjectRef2.element, (CancellationException) null);
                return;
            case 7:
                ((ImageReaderProxy.OnImageAvailableListener) this.f$1).onImageAvailable((VideoCapture.AnonymousClass3) this.f$0);
                return;
            case 8:
                ProfileStore_ profileStore_ = (ProfileStore_) this.f$0;
                ProfileStore_ profileStore_2 = (ProfileStore_) this.f$1;
                profileStore_.safeClose();
                if (profileStore_2 != null) {
                    profileStore_2.safeClose();
                    return;
                }
                return;
            case 9:
                ((ImageReaderProxy.OnImageAvailableListener) this.f$1).onImageAvailable((MetadataImageReader) this.f$0);
                return;
            case 10:
                ((Preview.SurfaceProvider) this.f$0).onSurfaceRequested((SurfaceRequest) this.f$1);
                return;
            case 11:
                ProcessingRequest processingRequest = (ProcessingRequest) this.f$0;
                Bitmap bitmap = (Bitmap) this.f$1;
                StringUtilsKt.i("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + processingRequest.mRequestId);
                RequestWithCallback requestWithCallback = processingRequest.mCallback;
                Threads.checkMainThread();
                if (requestWithCallback.mIsAborted) {
                    return;
                }
                AutoValue_TakePictureRequest autoValue_TakePictureRequest = requestWithCallback.mTakePictureRequest;
                autoValue_TakePictureRequest.appExecutor.execute(new Recorder$$ExternalSyntheticLambda13(autoValue_TakePictureRequest, bitmap));
                return;
            case 12:
                ProcessingRequest processingRequest2 = (ProcessingRequest) this.f$0;
                ImageProxy imageProxy = (ImageProxy) this.f$1;
                StringUtilsKt.i("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + processingRequest2.mRequestId);
                RequestWithCallback requestWithCallback2 = processingRequest2.mCallback;
                Threads.checkMainThread();
                if (requestWithCallback2.mIsAborted) {
                    imageProxy.close();
                    return;
                }
                TransactorKt.checkState("onImageCaptured() must be called before onFinalResult()", requestWithCallback2.mCaptureFuture.delegate.isDone());
                requestWithCallback2.markComplete();
                AutoValue_TakePictureRequest autoValue_TakePictureRequest2 = requestWithCallback2.mTakePictureRequest;
                autoValue_TakePictureRequest2.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(17, autoValue_TakePictureRequest2, imageProxy));
                return;
            case 13:
                ProcessingRequest processingRequest3 = (ProcessingRequest) this.f$0;
                CoroutinesRoom.Companion companion = (CoroutinesRoom.Companion) this.f$1;
                StringUtilsKt.i("ProcessingRequest", "onFinalResult(OutputFileResults): request ID = " + processingRequest3.mRequestId);
                RequestWithCallback requestWithCallback3 = processingRequest3.mCallback;
                Threads.checkMainThread();
                if (requestWithCallback3.mIsAborted) {
                    return;
                }
                TransactorKt.checkState("onImageCaptured() must be called before onFinalResult()", requestWithCallback3.mCaptureFuture.delegate.isDone());
                requestWithCallback3.markComplete();
                AutoValue_TakePictureRequest autoValue_TakePictureRequest3 = requestWithCallback3.mTakePictureRequest;
                autoValue_TakePictureRequest3.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(18, autoValue_TakePictureRequest3, companion));
                return;
            case 14:
                ProcessingRequest processingRequest4 = (ProcessingRequest) this.f$0;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.f$1;
                StringUtilsKt.w("ProcessingRequest", "onProcessFailure: request ID = " + processingRequest4.mRequestId, imageCaptureException);
                RequestWithCallback requestWithCallback4 = processingRequest4.mCallback;
                Threads.checkMainThread();
                if (requestWithCallback4.mIsAborted) {
                    return;
                }
                TransactorKt.checkState("onImageCaptured() must be called before onFinalResult()", requestWithCallback4.mCaptureFuture.delegate.isDone());
                requestWithCallback4.markComplete();
                Threads.checkMainThread();
                AutoValue_TakePictureRequest autoValue_TakePictureRequest4 = requestWithCallback4.mTakePictureRequest;
                autoValue_TakePictureRequest4.appExecutor.execute(new CameraX$$ExternalSyntheticLambda2(16, autoValue_TakePictureRequest4, imageCaptureException));
                return;
            case 15:
                ((TakePictureManagerImpl) this.f$0).mIncompleteRequests.remove((RequestWithCallback) this.f$1);
                return;
            case 16:
                AutoValue_TakePictureRequest autoValue_TakePictureRequest5 = (AutoValue_TakePictureRequest) this.f$0;
                ImageCaptureException imageCaptureException2 = (ImageCaptureException) this.f$1;
                ContextKt contextKt = autoValue_TakePictureRequest5.inMemoryCallback;
                boolean z = contextKt != null;
                FormBody.Builder builder = autoValue_TakePictureRequest5.onDiskCallback;
                boolean z2 = builder != null;
                if (z && !z2) {
                    Objects.requireNonNull(contextKt);
                    contextKt.onError(imageCaptureException2);
                    return;
                } else {
                    if (!z2 || z) {
                        a$$ExternalSyntheticBUOutline0.m$1("One and only one callback is allowed.");
                        return;
                    }
                    Objects.requireNonNull(builder);
                    SafeContinuation safeContinuation = (SafeContinuation) builder.names;
                    Result.Companion companion2 = Result.Companion;
                    safeContinuation.resumeWith(new Result(new Result.Failure(imageCaptureException2)));
                    return;
                }
            case 17:
                AutoValue_TakePictureRequest autoValue_TakePictureRequest6 = (AutoValue_TakePictureRequest) this.f$0;
                ImageProxy imageProxy2 = (ImageProxy) this.f$1;
                ContextKt contextKt2 = autoValue_TakePictureRequest6.inMemoryCallback;
                Objects.requireNonNull(contextKt2);
                Objects.requireNonNull(imageProxy2);
                CameraWrapper cameraWrapper = CameraWrapper.this;
                if (imageProxy2.getImage() == null || !cameraWrapper.p) {
                    cameraWrapper.a(FrameProducer.Event.TakePhotoError.PictureFailed.INSTANCE);
                    return;
                }
                cameraWrapper.r.addUxpEvent("SCWTP", new String[0]);
                MutableLiveData mutableLiveData = cameraWrapper.M;
                CameraFrame a = cameraWrapper.c.a(imageProxy2);
                if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                    mutableLiveData.setValue(a);
                    return;
                } else {
                    mutableLiveData.postValue(a);
                    return;
                }
            case 18:
                AutoValue_TakePictureRequest autoValue_TakePictureRequest7 = (AutoValue_TakePictureRequest) this.f$0;
                CoroutinesRoom.Companion companion3 = (CoroutinesRoom.Companion) this.f$1;
                FormBody.Builder builder2 = autoValue_TakePictureRequest7.onDiskCallback;
                Objects.requireNonNull(builder2);
                Objects.requireNonNull(companion3);
                SafeContinuation safeContinuation2 = (SafeContinuation) builder2.names;
                Result.Companion companion4 = Result.Companion;
                safeContinuation2.resumeWith(new Result((File) builder2.values));
                return;
            case 19:
                CameraPresenceProvider.ListenerWrapper listenerWrapper = (CameraPresenceProvider.ListenerWrapper) this.f$0;
                Set<CameraIdentifier> set = (Set) this.f$1;
                HCaptcha hCaptcha = listenerWrapper.listener;
                set.getClass();
                Threads.checkMainThread();
                synchronized (hCaptcha.result) {
                    try {
                        for (CameraIdentifier cameraIdentifier : set) {
                            Set keySet = ((HashMap) hCaptcha.internalConfig).keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : keySet) {
                                if (((CameraIdentifier) obj).cameraIds.equals(cameraIdentifier.cameraIds)) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((HashMap) hCaptcha.internalConfig).remove((CameraIdentifier) it.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 20:
                ((CameraInternal) this.f$0).getCameraInfoInternal().getCameraState().removeObserver((Observer) this.f$1);
                return;
            case 21:
                ((CameraInfoInternal) this.f$0).getCameraState().observeForever((c7$$ExternalSyntheticLambda0) this.f$1);
                return;
            case 22:
                run$androidx$camera$core$impl$CameraRepository$$ExternalSyntheticLambda0();
                return;
            case 23:
                ConstantObservable constantObservable = (ConstantObservable) this.f$0;
                Observable.Observer observer = (Observable.Observer) this.f$1;
                try {
                    observer.onNewData(constantObservable.mValueFuture.mCause);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    observer.onError(e);
                    return;
                }
            case 24:
                run$androidx$camera$core$impl$DeferrableSurface$$ExternalSyntheticLambda2();
                return;
            case 25:
                Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) this.f$0;
                Observable.Observer observer2 = (Observable.Observer) this.f$1;
                LiveDataObservable$Result liveDataObservable$Result = (LiveDataObservable$Result) ((MutableLiveData) anonymousClass3.val$completer).getValue();
                if (liveDataObservable$Result == null) {
                    return;
                }
                observer2.onNewData(liveDataObservable$Result.mValue);
                return;
            case 26:
                Recorder.AnonymousClass3 anonymousClass32 = (Recorder.AnonymousClass3) this.f$0;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) this.f$1;
                LiveDataObservable$Result liveDataObservable$Result2 = (LiveDataObservable$Result) ((MutableLiveData) anonymousClass32.val$completer).getValue();
                if (liveDataObservable$Result2 == null) {
                    callbackToFutureAdapter$Completer2.setException(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    callbackToFutureAdapter$Completer2.set(liveDataObservable$Result2.mValue);
                    return;
                }
            case 27:
                Map.Entry entry = (Map.Entry) this.f$0;
                LiveDataObservable$Result liveDataObservable$Result3 = (LiveDataObservable$Result) this.f$1;
                Observable.Observer observer3 = (Observable.Observer) entry.getKey();
                liveDataObservable$Result3.getClass();
                observer3.onNewData(liveDataObservable$Result3.mValue);
                return;
            case 28:
                Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = (Preview$$ExternalSyntheticLambda0) this.f$0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f$1;
                try {
                    preview$$ExternalSyntheticLambda0.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                ((DefaultSurfaceProcessor) this.f$0).mPendingSnapshots.add((AutoValue_DefaultSurfaceProcessor_PendingSnapshot) this.f$1);
                return;
        }
    }
}
