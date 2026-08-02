package androidx.camera.camera2.adapter;

import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GraphStateToCameraStateAdapter {
    public CameraGraphImpl cameraGraph;
    public final CameraStateAdapter cameraStateAdapter;

    public GraphStateToCameraStateAdapter(CameraStateAdapter cameraStateAdapter) {
        cameraStateAdapter.getClass();
        this.cameraStateAdapter = cameraStateAdapter;
    }

    public final CameraGraphImpl getCameraGraph() {
        CameraGraphImpl cameraGraphImpl = this.cameraGraph;
        if (cameraGraphImpl != null) {
            return cameraGraphImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cameraGraph");
        throw null;
    }
}
