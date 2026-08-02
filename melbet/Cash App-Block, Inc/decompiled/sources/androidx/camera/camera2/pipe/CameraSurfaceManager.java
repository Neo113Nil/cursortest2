package androidx.camera.camera2.pipe;

import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraSurfaceManager {
    public static final AtomicInt surfaceTokenDebugIds = AtomicFU.atomic(0);
    public final Object lock = new Object();
    public final LinkedHashMap useCountMap = new LinkedHashMap();
    public final LinkedHashSet listeners = new LinkedHashSet();

    public final class SurfaceToken implements AutoCloseable {
        public final AtomicBoolean closed;
        public final int debugId;
        public final Surface surface;
        public final /* synthetic */ CameraSurfaceManager this$0;

        public SurfaceToken(CameraSurfaceManager cameraSurfaceManager, Surface surface) {
            surface.getClass();
            this.this$0 = cameraSurfaceManager;
            this.surface = surface;
            AtomicInt atomicInt = CameraSurfaceManager.surfaceTokenDebugIds;
            atomicInt.getClass();
            this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
            this.closed = AtomicFU.atomic(false);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            Surface surface;
            List<UseCaseSurfaceManager> list;
            if (this.closed.compareAndSet()) {
                CameraSurfaceManager cameraSurfaceManager = this.this$0;
                synchronized (cameraSurfaceManager.lock) {
                    surface = this.surface;
                    Integer num = (Integer) cameraSurfaceManager.useCountMap.get(surface);
                    if (num == null) {
                        throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                    }
                    int intValue = num.intValue() - 1;
                    cameraSurfaceManager.useCountMap.put(surface, Integer.valueOf(intValue));
                    if (intValue == 0) {
                        list = CollectionsKt.toList(cameraSurfaceManager.listeners);
                        cameraSurfaceManager.useCountMap.remove(surface);
                    } else {
                        list = null;
                    }
                }
                if (list != null) {
                    for (UseCaseSurfaceManager useCaseSurfaceManager : list) {
                        useCaseSurfaceManager.getClass();
                        surface.getClass();
                        synchronized (useCaseSurfaceManager.lock) {
                            try {
                                DeferrableSurface deferrableSurface = (DeferrableSurface) useCaseSurfaceManager.activeSurfaceMap.remove(surface);
                                if (deferrableSurface != null) {
                                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                        Log.d("CXCP", "SurfaceInactive " + deferrableSurface + " in " + useCaseSurfaceManager);
                                    }
                                    useCaseSurfaceManager.inactiveSurfaceCloser.onSurfaceInactive(deferrableSurface);
                                    try {
                                        deferrableSurface.decrementUseCount();
                                    } catch (IllegalStateException e) {
                                        if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                                            Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                        }
                                    }
                                    useCaseSurfaceManager.tryClearSurfaceListener();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }

        public final String toString() {
            return "SurfaceToken-" + this.debugId;
        }
    }

    public final SurfaceToken registerSurface$camera_camera2_pipe(Surface surface) {
        SurfaceToken surfaceToken;
        List list;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.lock) {
            try {
                surfaceToken = new SurfaceToken(this, surface);
                Integer num = (Integer) this.useCountMap.get(surface);
                int intValue = (num != null ? num.intValue() : 0) + 1;
                this.useCountMap.put(surface, Integer.valueOf(intValue));
                list = intValue == 1 ? CollectionsKt.toList(this.listeners) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((UseCaseSurfaceManager) it.next()).onSurfaceActive(surface);
            }
        }
        return surfaceToken;
    }
}
