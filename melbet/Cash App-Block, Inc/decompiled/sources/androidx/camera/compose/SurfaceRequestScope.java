package androidx.camera.compose;

import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class SurfaceRequestScope {
    public final BufferedChannel requestChannel = PapaEvent.Channel$default(0, null, new BorderKt$$ExternalSyntheticLambda1(9), 2);
    public final ViewfinderSurfaceRequest viewfinderSurfaceRequest;

    public SurfaceRequestScope(ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.viewfinderSurfaceRequest = viewfinderSurfaceRequest;
    }
}
