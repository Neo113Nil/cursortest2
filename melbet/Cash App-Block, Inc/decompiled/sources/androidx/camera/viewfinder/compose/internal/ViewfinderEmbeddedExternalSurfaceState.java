package androidx.camera.viewfinder.compose.internal;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.ui.unit.IntSize;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class ViewfinderEmbeddedExternalSurfaceState extends BaseViewfinderExternalSurfaceState implements TextureView.SurfaceTextureListener {
    public final Matrix matrix;
    public ViewfinderExternalSurfaceHolder viewfinderSurfaceHolder;

    public ViewfinderEmbeddedExternalSurfaceState(CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.matrix = new Matrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = new ViewfinderExternalSurfaceHolder(surfaceTexture);
        this.viewfinderSurfaceHolder = viewfinderExternalSurfaceHolder;
        if (!IntSize.m1055equalsimpl0(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize(0, 0);
        }
        if (this.onSurface != null) {
            this.job = JobKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new SliderDraggableState$drag$2(this, viewfinderExternalSurfaceHolder, (Continuation) null, 11), 1);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = this.viewfinderSurfaceHolder;
        if (viewfinderExternalSurfaceHolder == null || viewfinderExternalSurfaceHolder.isDetached) {
            return false;
        }
        viewfinderExternalSurfaceHolder.refCountedSurface.release();
        viewfinderExternalSurfaceHolder.isDetached = true;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (IntSize.m1055equalsimpl0(0L, 0L)) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
