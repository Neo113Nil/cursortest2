package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes3.dex */
public interface InactiveSurfaceCloser {
    void closeAll();

    /* renamed from: configure-hB7JTeY, reason: not valid java name */
    void mo24configurehB7JTeY(int i, DeferrableSurface deferrableSurface, CameraGraphImpl cameraGraphImpl);

    void onSurfaceInactive(DeferrableSurface deferrableSurface);
}
