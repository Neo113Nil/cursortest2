package androidx.camera.viewfinder.compose.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes3.dex */
public abstract class BaseViewfinderExternalSurfaceState {
    public StandaloneCoroutine job;
    public AnchoredDraggableNode$drag$2 onSurface;
    public final CoroutineScope scope;

    public BaseViewfinderExternalSurfaceState(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }
}
