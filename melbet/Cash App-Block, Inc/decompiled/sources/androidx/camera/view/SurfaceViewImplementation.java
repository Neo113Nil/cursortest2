package androidx.camera.view;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda17;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SurfaceViewImplementation extends PreviewViewImplementation {
    public final SurfaceRequestCallback mSurfaceRequestCallback;
    public SurfaceView mSurfaceView;

    public final class SurfaceRequestCallback implements SurfaceHolder.Callback {
        public Size mCurrentSurfaceSize;
        public PreviewView$1$$ExternalSyntheticLambda2 mOnSurfaceNotInUseListener;
        public SurfaceRequest mSurfaceRequest;
        public SurfaceRequest mSurfaceRequestToBeInvalidated;
        public Size mTargetSize;
        public boolean mWasSurfaceProvided = false;
        public boolean mNeedToInvalidate = false;

        public SurfaceRequestCallback() {
        }

        public final void cancelPreviousRequest() {
            PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2;
            if (this.mSurfaceRequest != null) {
                StringUtilsKt.d("SurfaceViewImpl", "Request canceled: " + this.mSurfaceRequest);
                if (!this.mSurfaceRequest.willNotProvideSurface() || (previewView$1$$ExternalSyntheticLambda2 = this.mOnSurfaceNotInUseListener) == null) {
                    return;
                }
                previewView$1$$ExternalSyntheticLambda2.onSurfaceNotInUse();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            StringUtilsKt.d("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.mCurrentSurfaceSize = new Size(i2, i3);
            tryToComplete();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            StringUtilsKt.d("SurfaceViewImpl", "Surface created.");
            if (!this.mNeedToInvalidate || (surfaceRequest = this.mSurfaceRequestToBeInvalidated) == null) {
                return;
            }
            surfaceRequest.willNotProvideSurface();
            surfaceRequest.mSurfaceRecreationCompleter.set(null);
            this.mSurfaceRequestToBeInvalidated = null;
            this.mNeedToInvalidate = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            StringUtilsKt.d("SurfaceViewImpl", "Surface destroyed.");
            if (!this.mWasSurfaceProvided) {
                cancelPreviousRequest();
            } else if (this.mSurfaceRequest != null) {
                StringUtilsKt.d("SurfaceViewImpl", "Surface closed " + this.mSurfaceRequest);
                this.mSurfaceRequest.mInternalDeferrableSurface.close();
            }
            this.mNeedToInvalidate = true;
            SurfaceRequest surfaceRequest = this.mSurfaceRequest;
            if (surfaceRequest != null) {
                this.mSurfaceRequestToBeInvalidated = surfaceRequest;
            }
            this.mWasSurfaceProvided = false;
            this.mSurfaceRequest = null;
            this.mOnSurfaceNotInUseListener = null;
            this.mCurrentSurfaceSize = null;
            this.mTargetSize = null;
        }

        public final boolean tryToComplete() {
            SurfaceViewImplementation surfaceViewImplementation = SurfaceViewImplementation.this;
            Surface surface = surfaceViewImplementation.mSurfaceView.getHolder().getSurface();
            if (this.mWasSurfaceProvided || this.mSurfaceRequest == null || !Objects.equals(this.mTargetSize, this.mCurrentSurfaceSize)) {
                return false;
            }
            StringUtilsKt.d("SurfaceViewImpl", "Surface set on Preview.");
            PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = this.mOnSurfaceNotInUseListener;
            SurfaceRequest surfaceRequest = this.mSurfaceRequest;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.provideSurface(surface, surfaceViewImplementation.mSurfaceView.getContext().getMainExecutor(), new Recorder$$ExternalSyntheticLambda17(previewView$1$$ExternalSyntheticLambda2, 3));
            this.mWasSurfaceProvided = true;
            surfaceViewImplementation.mWasSurfaceProvided = true;
            surfaceViewImplementation.redrawPreview();
            return true;
        }
    }

    public SurfaceViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.mSurfaceRequestCallback = new SurfaceRequestCallback();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final View getPreview() {
        return this.mSurfaceView;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onAttachedToWindow() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onDetachedFromWindow() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2) {
        SurfaceView surfaceView = this.mSurfaceView;
        boolean equals = Objects.equals(this.mResolution, surfaceRequest.mResolution);
        if (surfaceView == null || !equals) {
            Size size = surfaceRequest.mResolution;
            this.mResolution = size;
            size.getClass();
            FrameLayout frameLayout = this.mParent;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.mSurfaceView = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.mSurfaceView);
            this.mSurfaceView.getHolder().addCallback(this.mSurfaceRequestCallback);
        }
        Executor mainExecutor = this.mSurfaceView.getContext().getMainExecutor();
        surfaceRequest.mRequestCancellationCompleter.addCancellationListener(new Preview$$ExternalSyntheticLambda0(previewView$1$$ExternalSyntheticLambda2, 27), mainExecutor);
        this.mSurfaceView.post(new AFd1wSDK$$ExternalSyntheticLambda2(19, this, surfaceRequest, previewView$1$$ExternalSyntheticLambda2));
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void setFrameUpdateListener(Executor executor) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final ListenableFuture waitForNextFrame() {
        return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
    }
}
