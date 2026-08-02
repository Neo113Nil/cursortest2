package androidx.camera.core.processing;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AutoValue_SurfaceOutput_CameraInputInfo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SurfaceOutputImpl implements Closeable {
    public final float[] mAdditionalTransform;
    public final CallbackToFutureAdapter$SafeFuture mCloseFuture;
    public final CallbackToFutureAdapter$Completer mCloseFutureCompleter;
    public Consumer mEventListener;
    public Executor mExecutor;
    public final int mFormat;
    public final float[] mSecondaryAdditionalTransform;
    public final Size mSize;
    public final Surface mSurface;
    public final Object mLock = new Object();
    public boolean mHasPendingCloseRequest = false;
    public boolean mIsClosed = false;

    public SurfaceOutputImpl(Surface surface, int i, Size size, AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo, AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo2) {
        float[] fArr = new float[16];
        this.mAdditionalTransform = fArr;
        float[] fArr2 = new float[16];
        this.mSecondaryAdditionalTransform = fArr2;
        this.mSurface = surface;
        this.mFormat = i;
        this.mSize = size;
        calculateAdditionalTransform(fArr, new float[16], autoValue_SurfaceOutput_CameraInputInfo);
        calculateAdditionalTransform(fArr2, new float[16], autoValue_SurfaceOutput_CameraInputInfo2);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        try {
            this.mCloseFutureCompleter = callbackToFutureAdapter$Completer;
            callbackToFutureAdapter$Completer.tag = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        this.mCloseFuture = callbackToFutureAdapter$SafeFuture;
    }

    public static void calculateAdditionalTransform(float[] fArr, float[] fArr2, AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo) {
        Matrix.setIdentityM(fArr, 0);
        if (autoValue_SurfaceOutput_CameraInputInfo == null) {
            return;
        }
        Size size = autoValue_SurfaceOutput_CameraInputInfo.inputSize;
        boolean z = autoValue_SurfaceOutput_CameraInputInfo.mirroring;
        int i = autoValue_SurfaceOutput_CameraInputInfo.rotationDegrees;
        MatrixExt.preVerticalFlip(fArr);
        MatrixExt.preRotate(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(size), TransformUtils.sizeToRectF(TransformUtils.rotateSize(i, size)), i, z);
        RectF rectF = new RectF(autoValue_SurfaceOutput_CameraInputInfo.inputCropRect);
        rectToRect.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float width2 = rectF.width() / r7.getWidth();
        float height2 = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, RecyclerView.DECELERATION_RATE);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        CameraInternal cameraInternal = autoValue_SurfaceOutput_CameraInputInfo.cameraInternal;
        Matrix.setIdentityM(fArr2, 0);
        MatrixExt.preVerticalFlip(fArr2);
        if (cameraInternal != null) {
            TransactorKt.checkState("Camera has no transform.", cameraInternal.getHasTransform());
            MatrixExt.preRotate(cameraInternal.getCameraInfo().getSensorRotationDegrees(), fArr2);
            if (cameraInternal.isFrontFacing()) {
                Matrix.translateM(fArr2, 0, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.mLock) {
            try {
                if (!this.mIsClosed) {
                    this.mIsClosed = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCloseFutureCompleter.set(null);
    }

    public final Surface getSurface(HandlerScheduledExecutorService handlerScheduledExecutorService, Consumer consumer) {
        boolean z;
        synchronized (this.mLock) {
            this.mExecutor = handlerScheduledExecutorService;
            this.mEventListener = consumer;
            z = this.mHasPendingCloseRequest;
        }
        if (z) {
            requestClose();
        }
        return this.mSurface;
    }

    public final void requestClose() {
        Executor executor;
        Consumer consumer;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.mLock) {
            try {
                if (this.mExecutor != null && (consumer = this.mEventListener) != null) {
                    if (!this.mIsClosed) {
                        atomicReference.set(consumer);
                        executor = this.mExecutor;
                        this.mHasPendingCloseRequest = false;
                    }
                    executor = null;
                }
                this.mHasPendingCloseRequest = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Recorder$$ExternalSyntheticLambda15(3, this, atomicReference));
            } catch (RejectedExecutionException e) {
                if (StringUtilsKt.isLogLevelEnabled(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
