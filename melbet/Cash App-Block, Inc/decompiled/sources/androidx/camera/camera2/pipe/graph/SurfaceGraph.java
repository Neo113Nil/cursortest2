package androidx.camera.camera2.pipe.graph;

import android.content.res.TypedArray;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.ImageReaderImageSource;
import dagger.internal.DelegateFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.collections.CollectionsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SurfaceGraph implements AutoCloseable {
    public final Provider cameraController;
    public boolean closed;
    public final Map imageSources;
    public final Object lock;
    public boolean shouldRegisterSurfaces;
    public final StreamGraphImpl streamGraphImpl;
    public final CameraSurfaceManager surfaceManager;
    public final LinkedHashMap surfaceMap;
    public final LinkedHashMap surfaceUsageMap;

    public SurfaceGraph(StreamGraphImpl streamGraphImpl, DelegateFactory delegateFactory, CameraSurfaceManager cameraSurfaceManager, Map map) {
        delegateFactory.getClass();
        map.getClass();
        this.streamGraphImpl = streamGraphImpl;
        this.cameraController = delegateFactory;
        this.surfaceManager = cameraSurfaceManager;
        this.imageSources = map;
        this.lock = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((ImageReaderImageSource) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.surfaceMap = linkedHashMap;
        this.surfaceUsageMap = new LinkedHashMap();
        this.shouldRegisterSurfaces = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.surfaceMap.clear();
            List<AutoCloseable> list = CollectionsKt.toList(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
            for (AutoCloseable autoCloseable : list) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    if (!(autoCloseable instanceof TypedArray)) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return;
                    }
                    ((TypedArray) autoCloseable).recycle();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r1 = kotlin.collections.EmptyMap.INSTANCE;
        r1.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void maybeUpdateSurfaces$camera_camera2_pipe() {
        Map linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = this.streamGraphImpl.outputConfigs.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StreamGraphImpl.OutputConfig outputConfig = (StreamGraphImpl.OutputConfig) it.next();
                Iterator it2 = outputConfig.streamBuilder.iterator();
                while (it2.hasNext()) {
                    CameraStream cameraStream = (CameraStream) it2.next();
                    Surface surface = (Surface) this.surfaceMap.get(new StreamId(cameraStream.id));
                    if (surface == null) {
                        if (!(outputConfig.deferredOutputType != null)) {
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new StreamId(cameraStream.id), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Camera2CameraController camera2CameraController = (Camera2CameraController) this.cameraController.get();
        camera2CameraController.getClass();
        synchronized (camera2CameraController.lock) {
            if (camera2CameraController.isClosed()) {
                return;
            }
            camera2CameraController.currentSurfaceMap = linkedHashMap;
            CaptureSessionState captureSessionState = camera2CameraController.currentSession;
            if (captureSessionState != null) {
                captureSessionState.configureSurfaceMap(linkedHashMap);
            }
        }
    }

    public final void registerAllSurfaces() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.surfaceMap.values()) {
                    this.surfaceUsageMap.put(surface, this.surfaceManager.registerSurface$camera_camera2_pipe(surface));
                }
                this.shouldRegisterSurfaces = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unregisterAllSurfaces() {
        List<AutoCloseable> list;
        boolean isTerminated;
        synchronized (this.lock) {
            this.shouldRegisterSurfaces = false;
            list = CollectionsKt.toList(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
        }
        for (AutoCloseable autoCloseable : list) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(autoCloseable instanceof TypedArray)) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return;
                }
                ((TypedArray) autoCloseable).recycle();
            }
        }
    }
}
