package com.squareup.cash.graphics.swampgl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.JobSupport;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class EngineFrameScheduler$SceneGroup {
    public JobSupport dirtyJob;
    public final Engine engine;
    public long lastRenderTimeNs;
    public final Object lock;
    public final Scene scene;
    public JobSupport scheduledRenderJob;
    public long targetFrameIntervalNs;
    public final LinkedHashMap targets;

    public final class RenderTarget {
        public final float displayRefreshRateHz;
        public final EGLSurface eglSurface;
        public final int height;
        public final boolean paused;
        public final int width;

        public RenderTarget(EGLSurface eGLSurface, int i, int i2, float f, boolean z) {
            this.eglSurface = eGLSurface;
            this.width = i;
            this.height = i2;
            this.displayRefreshRateHz = f;
            this.paused = z;
        }

        public static RenderTarget copy$default(RenderTarget renderTarget, int i, int i2, boolean z, int i3) {
            EGLSurface eGLSurface = renderTarget.eglSurface;
            if ((i3 & 2) != 0) {
                i = renderTarget.width;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = renderTarget.height;
            }
            int i5 = i2;
            float f = renderTarget.displayRefreshRateHz;
            if ((i3 & 16) != 0) {
                z = renderTarget.paused;
            }
            return new RenderTarget(eGLSurface, i4, i5, f, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RenderTarget)) {
                return false;
            }
            RenderTarget renderTarget = (RenderTarget) obj;
            return this.eglSurface.equals(renderTarget.eglSurface) && this.width == renderTarget.width && this.height == renderTarget.height && Float.compare(this.displayRefreshRateHz, renderTarget.displayRefreshRateHz) == 0 && this.paused == renderTarget.paused;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.paused) + CameraState$Type$EnumUnboxingLocalUtility.m(this.displayRefreshRateHz, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, this.eglSurface.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RenderTarget(eglSurface=");
            sb.append(this.eglSurface);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", displayRefreshRateHz=");
            sb.append(this.displayRefreshRateHz);
            sb.append(", paused=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.paused, ")");
        }
    }

    public EngineFrameScheduler$SceneGroup(Engine engine, Scene scene) {
        scene.getClass();
        this.engine = engine;
        this.scene = scene;
        this.lock = new Object();
        this.targets = new LinkedHashMap();
        this.targetFrameIntervalNs = 16666667L;
    }

    public static final void access$renderAllTargets(EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup, String str) {
        List<RenderTarget> list;
        EGLContext eGLContext;
        synchronized (engineFrameScheduler$SceneGroup.lock) {
            Collection values = engineFrameScheduler$SceneGroup.targets.values();
            values.getClass();
            list = CollectionsKt.toList(values);
        }
        if (list.isEmpty()) {
            return;
        }
        for (RenderTarget renderTarget : list) {
            if (!renderTarget.paused && renderTarget.width > 0 && renderTarget.height > 0) {
                Engine engine = engineFrameScheduler$SceneGroup.engine;
                EGLDisplay eGLDisplay = engine.eglDisplay;
                EGLSurface eGLSurface = renderTarget.eglSurface;
                GLThread gLThread = engine.glThread;
                if (gLThread == null || (eGLContext = gLThread.eglContext) == null) {
                    eGLContext = EGL14.EGL_NO_CONTEXT;
                    eGLContext.getClass();
                }
                if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                    GLES20.glViewport(0, 0, renderTarget.width, renderTarget.height);
                    engineFrameScheduler$SceneGroup.scene.render(renderTarget.width, renderTarget.height);
                    if (!EGL14.eglSwapBuffers(engineFrameScheduler$SceneGroup.engine.eglDisplay, renderTarget.eglSurface)) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("EngineFrameScheduler");
                        forest.e(Boxes$$ExternalSyntheticOutline1.m("eglSwapBuffers failed (reason=", str, " eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
                    }
                } else {
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("EngineFrameScheduler");
                    forest2.e(Boxes$$ExternalSyntheticOutline1.m("eglMakeCurrent failed for target (reason=", str, " eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
                }
            }
        }
    }

    public final void requestRender(String str) {
        synchronized (this.lock) {
            JobSupport jobSupport = this.scheduledRenderJob;
            if (jobSupport != null) {
                if (jobSupport.isActive()) {
                    return;
                }
            }
            this.scheduledRenderJob = (JobSupport) this.engine.launch(new RealMRIFactory$sign$2.AnonymousClass1(this, str, null, 9));
        }
    }
}
