package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;

/* loaded from: classes3.dex */
public interface SurfaceProcessorInternal {
    void onInputSurface(SurfaceRequest surfaceRequest);

    void onOutputSurface(SurfaceOutputImpl surfaceOutputImpl);

    void release();
}
