package androidx.camera.viewfinder.compose.internal;

import android.view.SurfaceView;

/* loaded from: classes3.dex */
public final class ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 extends SurfaceView {
    public ViewfinderExternalSurfaceState attachedState;

    public final void setAttachedState(ViewfinderExternalSurfaceState viewfinderExternalSurfaceState) {
        if (viewfinderExternalSurfaceState == null) {
            ViewfinderExternalSurfaceState viewfinderExternalSurfaceState2 = this.attachedState;
            if (viewfinderExternalSurfaceState2 != null) {
                getHolder().removeCallback(viewfinderExternalSurfaceState2);
            }
        } else {
            getHolder().addCallback(viewfinderExternalSurfaceState);
        }
        this.attachedState = viewfinderExternalSurfaceState;
    }
}
