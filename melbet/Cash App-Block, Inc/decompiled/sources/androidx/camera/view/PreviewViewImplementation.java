package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import java.util.concurrent.Executor;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class PreviewViewImplementation {
    public final FrameLayout mParent;
    public final PreviewTransformation mPreviewTransform;
    public Size mResolution;
    public boolean mWasSurfaceProvided = false;

    public PreviewViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        this.mParent = frameLayout;
        this.mPreviewTransform = previewTransformation;
    }

    public abstract View getPreview();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public abstract void onSurfaceRequested(SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2);

    public final void redrawPreview() {
        View preview = getPreview();
        if (preview == null || !this.mWasSurfaceProvided) {
            return;
        }
        FrameLayout frameLayout = this.mParent;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        PreviewTransformation previewTransformation = this.mPreviewTransform;
        previewTransformation.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            StringUtilsKt.w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (previewTransformation.isTransformationInfoReady()) {
            boolean z = false;
            if (preview instanceof TextureView) {
                TextureView textureView = (TextureView) preview;
                TransactorKt.checkState(null, previewTransformation.isTransformationInfoReady());
                RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, previewTransformation.mResolution.getWidth(), previewTransformation.mResolution.getHeight());
                textureView.setTransform(TransformUtils.getRectToRect(rectF, rectF, !previewTransformation.mHasCameraTransform ? previewTransformation.mPreviewRotationDegrees : -GenieForEachViewKt.surfaceRotationToDegrees(previewTransformation.mTargetRotation), false));
            } else {
                Display display = preview.getDisplay();
                boolean z2 = (!previewTransformation.mHasCameraTransform || display == null || display.getRotation() == previewTransformation.mTargetRotation) ? false : true;
                boolean z3 = previewTransformation.mHasCameraTransform;
                if (!z3) {
                    if ((!z3 ? previewTransformation.mPreviewRotationDegrees : -GenieForEachViewKt.surfaceRotationToDegrees(previewTransformation.mTargetRotation)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    StringUtilsKt.e("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            TransactorKt.checkState(null, previewTransformation.isTransformationInfoReady());
            Matrix surfaceToPreviewViewMatrix = previewTransformation.getSurfaceToPreviewViewMatrix(layoutDirection, size);
            RectF rectF2 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, previewTransformation.mResolution.getWidth(), previewTransformation.mResolution.getHeight());
            surfaceToPreviewViewMatrix.mapRect(rectF2);
            preview.setPivotX(RecyclerView.DECELERATION_RATE);
            preview.setPivotY(RecyclerView.DECELERATION_RATE);
            preview.setScaleX(rectF2.width() / previewTransformation.mResolution.getWidth());
            preview.setScaleY(rectF2.height() / previewTransformation.mResolution.getHeight());
            preview.setTranslationX(rectF2.left - preview.getLeft());
            preview.setTranslationY(rectF2.top - preview.getTop());
        }
    }

    public abstract void setFrameUpdateListener(Executor executor);

    public abstract ListenableFuture waitForNextFrame();
}
