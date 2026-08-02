package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class PreviewTransformation {
    public boolean mHasCameraTransform;
    public boolean mIsFrontCamera;
    public int mPreviewRotationDegrees;
    public Size mResolution;
    public PreviewView.ScaleType mScaleType;
    public Matrix mSensorToBufferTransform;
    public Rect mSurfaceCropRect;
    public int mTargetRotation;

    public final Matrix getPreviewViewToNormalizedSensorMatrix(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!isTransformationInfoReady()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (isTransformationInfoReady()) {
            matrix = new Matrix(this.mSensorToBufferTransform);
            matrix.postConcat(getSurfaceToPreviewViewMatrix(i, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, rect.width(), rect.height()), new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size getRotatedViewportSize() {
        return TransformUtils.is90or270(this.mPreviewRotationDegrees) ? new Size(this.mSurfaceCropRect.height(), this.mSurfaceCropRect.width()) : new Size(this.mSurfaceCropRect.width(), this.mSurfaceCropRect.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix getSurfaceToPreviewViewMatrix(int i, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        TransactorKt.checkState(null, isTransformationInfoReady());
        if (TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, getRotatedViewportSize())) {
            rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight());
            Size rotatedViewportSize = getRotatedViewportSize();
            RectF rectF3 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, rotatedViewportSize.getWidth(), rotatedViewportSize.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.ScaleType scaleType = this.mScaleType;
            int ordinal = scaleType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    StringUtilsKt.e("PreviewTransform", "Unexpected crop rect: " + scaleType);
                                    scaleToFit = Matrix.ScaleToFit.FILL;
                                    if (scaleType != PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                                        matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                                    } else {
                                        matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                                        matrix.invert(matrix);
                                    }
                                    matrix.mapRect(rectF3);
                                    if (i != 1) {
                                        float width = size.getWidth() / 2.0f;
                                        float f = width + width;
                                        rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
                                    } else {
                                        rectF = rectF3;
                                    }
                                }
                            }
                        }
                    }
                    scaleToFit = Matrix.ScaleToFit.END;
                    if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
                    }
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                    matrix.mapRect(rectF3);
                    if (i != 1) {
                    }
                }
                scaleToFit = Matrix.ScaleToFit.CENTER;
                if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
                }
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                matrix.mapRect(rectF3);
                if (i != 1) {
                }
            }
            scaleToFit = Matrix.ScaleToFit.START;
            if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
            }
            matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            matrix.mapRect(rectF3);
            if (i != 1) {
            }
        }
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(this.mSurfaceCropRect), rectF, this.mPreviewRotationDegrees, false);
        if (this.mIsFrontCamera && this.mHasCameraTransform) {
            boolean is90or270 = TransformUtils.is90or270(this.mPreviewRotationDegrees);
            Rect rect = this.mSurfaceCropRect;
            if (is90or270) {
                rectToRect.preScale(1.0f, -1.0f, rect.centerX(), this.mSurfaceCropRect.centerY());
                return rectToRect;
            }
            rectToRect.preScale(-1.0f, 1.0f, rect.centerX(), this.mSurfaceCropRect.centerY());
        }
        return rectToRect;
    }

    public final boolean isTransformationInfoReady() {
        return (this.mSurfaceCropRect == null || this.mResolution == null || !(!this.mHasCameraTransform || this.mTargetRotation != -1)) ? false : true;
    }
}
