package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.room.util.DBUtil;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.scannerview.PreviewView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class TextureViewImplementation extends PreviewViewImplementation {
    public SurfaceTexture mDetachedSurfaceTexture;
    public Executor mFrameUpdateExecutor;
    public boolean mIsSurfaceTextureDetachedFromView;
    public AtomicReference mNextFrameCompleter;
    public PreviewView$1$$ExternalSyntheticLambda2 mOnSurfaceNotInUseListener;
    public CallbackToFutureAdapter$SafeFuture mSurfaceReleaseFuture;
    public SurfaceRequest mSurfaceRequest;
    public SurfaceTexture mSurfaceTexture;
    public TextureView mTextureView;

    @Override // androidx.camera.view.PreviewViewImplementation
    public final View getPreview() {
        return this.mTextureView;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onAttachedToWindow() {
        if (!this.mIsSurfaceTextureDetachedFromView || this.mDetachedSurfaceTexture == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.mTextureView.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.mDetachedSurfaceTexture;
        if (surfaceTexture != surfaceTexture2) {
            this.mTextureView.setSurfaceTexture(surfaceTexture2);
            this.mDetachedSurfaceTexture = null;
            this.mIsSurfaceTextureDetachedFromView = false;
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onDetachedFromWindow() {
        this.mIsSurfaceTextureDetachedFromView = true;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2) {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda22;
        Size size = surfaceRequest.mResolution;
        this.mResolution = size;
        size.getClass();
        FrameLayout frameLayout = this.mParent;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.mTextureView = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mTextureView.setSurfaceTextureListener(new PreviewView.AnonymousClass1(this, 1));
        frameLayout.removeAllViews();
        frameLayout.addView(this.mTextureView);
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null && surfaceRequest2.willNotProvideSurface() && (previewView$1$$ExternalSyntheticLambda22 = this.mOnSurfaceNotInUseListener) != null) {
            previewView$1$$ExternalSyntheticLambda22.onSurfaceNotInUse();
            this.mOnSurfaceNotInUseListener = null;
        }
        this.mSurfaceRequest = surfaceRequest;
        this.mOnSurfaceNotInUseListener = previewView$1$$ExternalSyntheticLambda2;
        surfaceRequest.mRequestCancellationCompleter.addCancellationListener(new Recorder$$ExternalSyntheticLambda15(25, this, surfaceRequest), this.mTextureView.getContext().getMainExecutor());
        tryToProvidePreviewSurface();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void setFrameUpdateListener(Executor executor) {
        this.mFrameUpdateExecutor = executor;
    }

    public final void tryToProvidePreviewSurface() {
        SurfaceTexture surfaceTexture;
        Size size = this.mResolution;
        if (size == null || (surfaceTexture = this.mSurfaceTexture) == null || this.mSurfaceRequest == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.mResolution.getHeight());
        Surface surface = new Surface(this.mSurfaceTexture);
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(6, this, surface));
        this.mSurfaceReleaseFuture = future;
        future.delegate.addListener(new ImageCapture$$ExternalSyntheticLambda3(this, surface, future, surfaceRequest, 3), this.mTextureView.getContext().getMainExecutor());
        this.mWasSurfaceProvided = true;
        redrawPreview();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final ListenableFuture waitForNextFrame() {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            this.mNextFrameCompleter.set(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.tag = "textureViewImpl_waitForNextFrame";
            return callbackToFutureAdapter$SafeFuture;
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
            return callbackToFutureAdapter$SafeFuture;
        }
    }
}
