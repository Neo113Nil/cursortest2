package androidx.camera.viewfinder.compose.internal;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes3.dex */
public final class ViewfinderEmbeddedExternalSurfaceKt$ViewfinderEmbeddedExternalSurface$1$1$1 extends TextureView {
    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder;
        super.onAttachedToWindow();
        TextureView.SurfaceTextureListener surfaceTextureListener = getSurfaceTextureListener();
        ViewfinderEmbeddedExternalSurfaceState viewfinderEmbeddedExternalSurfaceState = surfaceTextureListener instanceof ViewfinderEmbeddedExternalSurfaceState ? (ViewfinderEmbeddedExternalSurfaceState) surfaceTextureListener : null;
        if (viewfinderEmbeddedExternalSurfaceState == null || (viewfinderExternalSurfaceHolder = viewfinderEmbeddedExternalSurfaceState.viewfinderSurfaceHolder) == null) {
            return;
        }
        SurfaceTexture surfaceTexture = (SurfaceTexture) viewfinderExternalSurfaceHolder.surfaceControl;
        if (!viewfinderExternalSurfaceHolder.isDetached) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Still attached.");
            return;
        }
        if (((Surface) viewfinderExternalSurfaceHolder.refCountedSurface.acquire()) == null) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Already released.");
            return;
        }
        setSurfaceTexture(surfaceTexture);
        Log.d("VfEmbeddedSurface", "Reattached " + surfaceTexture + " to " + this);
        viewfinderExternalSurfaceHolder.isDetached = false;
    }
}
