package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.OperationCanceledException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import net.oneformapp.ProfileStore_;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    public ByteBuffer mNV21UVDelegatedBuffer;
    public ByteBuffer mNV21YDelegatedBuffer;
    public volatile boolean mOnePixelShiftEnabled;
    public volatile boolean mOutputImageRotationEnabled;
    public volatile int mPrevBufferRotationDegrees;
    public ProfileStore_ mProcessedImageReaderProxy;
    public ImageWriter mProcessedImageWriter;
    public ByteBuffer mRGBConvertedBuffer;
    public volatile int mRelativeRotation;
    public ImageAnalysis.Analyzer mSubscribedAnalyzer;
    public ByteBuffer mURotatedBuffer;
    public Executor mUserExecutor;
    public ByteBuffer mVRotatedBuffer;
    public ByteBuffer mYRotatedBuffer;
    public volatile int mOutputImageFormat = 1;
    public Rect mOriginalViewPortCropRect = new Rect();
    public Rect mUpdatedViewPortCropRect = new Rect();
    public Matrix mOriginalSensorToBufferTransformMatrix = new Matrix();
    public Matrix mUpdatedSensorToBufferTransformMatrix = new Matrix();
    public final Object mAnalyzerLock = new Object();
    public boolean mIsAttached = true;

    public abstract ImageProxy acquireImage(ImageReaderProxy imageReaderProxy);

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:6|7|(1:100)(1:11)|(1:13)|14)|(6:(11:16|(1:18)|19|20|21|22|23|24|25|26|27)|23|24|25|26|27)|98|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0121, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0122, code lost:
    
        r14 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture analyzeImage(final ImageProxy imageProxy) {
        Object obj;
        Executor executor;
        final ImageAnalysis.Analyzer analyzer;
        boolean z;
        ProfileStore_ profileStore_;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        SingleCloseImageProxy rotateYUVAndConvertToNV21;
        SingleCloseImageProxy singleCloseImageProxy;
        int i = this.mOutputImageRotationEnabled ? this.mRelativeRotation : 0;
        Object obj2 = this.mAnalyzerLock;
        synchronized (obj2) {
            try {
                try {
                    executor = this.mUserExecutor;
                    analyzer = this.mSubscribedAnalyzer;
                    z = this.mOutputImageRotationEnabled && i != this.mPrevBufferRotationDegrees;
                    if (z) {
                        recreateImageReaderProxy(imageProxy, i);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mOutputImageRotationEnabled) {
                        if (this.mOutputImageFormat == 3) {
                        }
                        profileStore_ = this.mProcessedImageReaderProxy;
                        imageWriter = this.mProcessedImageWriter;
                        byteBuffer = this.mRGBConvertedBuffer;
                        byteBuffer2 = this.mYRotatedBuffer;
                        byteBuffer3 = this.mURotatedBuffer;
                        byteBuffer4 = this.mVRotatedBuffer;
                        byteBuffer5 = this.mNV21YDelegatedBuffer;
                        byteBuffer6 = this.mNV21UVDelegatedBuffer;
                    }
                    imageWriter = this.mProcessedImageWriter;
                    byteBuffer = this.mRGBConvertedBuffer;
                    byteBuffer2 = this.mYRotatedBuffer;
                    byteBuffer3 = this.mURotatedBuffer;
                    byteBuffer4 = this.mVRotatedBuffer;
                    byteBuffer5 = this.mNV21YDelegatedBuffer;
                    byteBuffer6 = this.mNV21UVDelegatedBuffer;
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                    throw th;
                }
                createHelperBuffer(imageProxy);
                profileStore_ = this.mProcessedImageReaderProxy;
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
        if (analyzer == null || executor == null || !this.mIsAttached) {
            return new ImmediateFuture$ImmediateFailedFuture(new OperationCanceledException("No analyzer or executor currently set."), 0);
        }
        int i2 = this.mOutputImageFormat;
        if (profileStore_ != null) {
            if (i2 == 2) {
                rotateYUVAndConvertToNV21 = ImageProcessingUtil.convertYUVToRGB(imageProxy, profileStore_, byteBuffer, i, this.mOnePixelShiftEnabled);
            } else {
                if (this.mOutputImageFormat == 1) {
                    if (this.mOnePixelShiftEnabled) {
                        ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        rotateYUVAndConvertToNV21 = ImageProcessingUtil.rotateYUV(imageProxy, profileStore_, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                singleCloseImageProxy = null;
            }
            singleCloseImageProxy = rotateYUVAndConvertToNV21;
        } else {
            if (i2 == 3) {
                if (this.mOnePixelShiftEnabled) {
                    ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    rotateYUVAndConvertToNV21 = ImageProcessingUtil.rotateYUVAndConvertToNV21(imageProxy, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    singleCloseImageProxy = rotateYUVAndConvertToNV21;
                }
            }
            singleCloseImageProxy = null;
        }
        boolean z2 = singleCloseImageProxy == null;
        final ImageProxy imageProxy2 = z2 ? imageProxy : singleCloseImageProxy;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.mAnalyzerLock) {
            if (z && !z2) {
                try {
                    recalculateTransformMatrixAndCropRect(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy2.getWidth(), imageProxy2.getHeight());
                } finally {
                }
            }
            this.mPrevBufferRotationDegrees = i;
            rect.set(this.mUpdatedViewPortCropRect);
            matrix.set(this.mUpdatedSensorToBufferTransformMatrix);
        }
        final CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            executor.execute(new Runnable() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = ImageAnalysisAbstractAnalyzer.this;
                    ImageProxy imageProxy3 = imageProxy;
                    Matrix matrix2 = matrix;
                    ImageProxy imageProxy4 = imageProxy2;
                    Rect rect2 = rect;
                    ImageAnalysis.Analyzer analyzer2 = analyzer;
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer;
                    if (!imageAnalysisAbstractAnalyzer.mIsAttached) {
                        callbackToFutureAdapter$Completer2.setException(new OperationCanceledException("ImageAnalysis is detached"));
                        return;
                    }
                    SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy4, null, new AutoValue_ImmutableImageInfo(imageProxy3.getImageInfo().getTagBundle(), imageProxy3.getImageInfo().getTimestamp(), imageAnalysisAbstractAnalyzer.mOutputImageRotationEnabled ? 0 : imageAnalysisAbstractAnalyzer.mRelativeRotation, matrix2, imageProxy3.getImageInfo().getFlashState()));
                    if (!rect2.isEmpty()) {
                        settableImageProxy.setCropRect(rect2);
                    }
                    analyzer2.analyze(settableImageProxy);
                    callbackToFutureAdapter$Completer2.set(null);
                }
            });
            callbackToFutureAdapter$Completer.tag = "analyzeImage";
            return callbackToFutureAdapter$SafeFuture;
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
            return callbackToFutureAdapter$SafeFuture;
        }
    }

    public abstract void clearCache();

    public final void createHelperBuffer(ImageProxy imageProxy) {
        if (this.mOutputImageFormat != 1 && this.mOutputImageFormat != 3) {
            if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
                this.mRGBConvertedBuffer = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.mYRotatedBuffer == null) {
            this.mYRotatedBuffer = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
        }
        this.mYRotatedBuffer.position(0);
        if (this.mURotatedBuffer == null) {
            this.mURotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.mURotatedBuffer.position(0);
        if (this.mVRotatedBuffer == null) {
            this.mVRotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.mVRotatedBuffer.position(0);
        if (this.mOutputImageFormat == 3) {
            if (this.mNV21YDelegatedBuffer == null) {
                this.mNV21YDelegatedBuffer = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
            }
            this.mNV21YDelegatedBuffer.position(0);
            if (this.mNV21UVDelegatedBuffer == null) {
                this.mNV21UVDelegatedBuffer = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 2);
            }
            this.mNV21UVDelegatedBuffer.position(0);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireImage = acquireImage(imageReaderProxy);
            if (acquireImage != null) {
                onValidImageAvailable(acquireImage);
            }
        } catch (IllegalStateException e) {
            StringUtilsKt.e("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract void onValidImageAvailable(ImageProxy imageProxy);

    public final void recalculateTransformMatrixAndCropRect(int i, int i2, int i3, int i4) {
        int i5 = this.mRelativeRotation;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i, i2);
            RectF rectF2 = TransformUtils.NORMALIZED_RECT;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.mOriginalViewPortCropRect);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.mUpdatedViewPortCropRect = rect;
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, matrix);
    }

    public final void recreateImageReaderProxy(ImageProxy imageProxy, int i) {
        ProfileStore_ profileStore_ = this.mProcessedImageReaderProxy;
        if (profileStore_ == null) {
            return;
        }
        profileStore_.safeClose();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int imageFormat = this.mProcessedImageReaderProxy.getImageFormat();
        int maxImages = this.mProcessedImageReaderProxy.getMaxImages();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.mProcessedImageReaderProxy = new ProfileStore_(AnyUtilsKt.createIsolatedReader(i2, width, imageFormat, maxImages));
        if (this.mOutputImageFormat == 1) {
            ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.mProcessedImageWriter = ImageWriter.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    public final void setAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            clearCache();
        }
        synchronized (this.mAnalyzerLock) {
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public final void setSensorToBufferTransformMatrix(Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    public final void setViewPortCropRect(Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new Rect(this.mOriginalViewPortCropRect);
        }
    }
}
