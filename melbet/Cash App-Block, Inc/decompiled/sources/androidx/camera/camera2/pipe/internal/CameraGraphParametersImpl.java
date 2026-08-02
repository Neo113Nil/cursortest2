package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class CameraGraphParametersImpl {
    public final Object lock;

    public CameraGraphParametersImpl(GraphSessionLock graphSessionLock, GraphProcessorImpl graphProcessorImpl, CoroutineScope coroutineScope) {
        graphSessionLock.getClass();
        graphProcessorImpl.getClass();
        coroutineScope.getClass();
        this.lock = new Object();
        new LinkedHashMap();
    }
}
