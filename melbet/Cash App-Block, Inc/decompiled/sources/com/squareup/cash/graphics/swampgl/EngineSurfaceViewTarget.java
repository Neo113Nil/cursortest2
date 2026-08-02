package com.squareup.cash.graphics.swampgl;

import android.opengl.EGLSurface;
import android.view.SurfaceHolder;
import androidx.glance.session.SessionWorker$doWork$2$1;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes6.dex */
public final class EngineSurfaceViewTarget implements SurfaceHolder.Callback2 {
    public volatile boolean destroyed;
    public final float displayRefreshRateHz;
    public volatile EGLSurface eglSurface;
    public final Engine engine;
    public volatile boolean explicitlyDestroyed;
    public final Scene scene;
    public final Object targetId;

    public EngineSurfaceViewTarget(Engine engine, Scene scene, float f) {
        engine.getClass();
        scene.getClass();
        this.engine = engine;
        this.scene = scene;
        this.displayRefreshRateHz = f;
        this.targetId = new Object();
    }

    public final void destroyInternal() {
        if (this.destroyed && this.eglSurface == null) {
            return;
        }
        this.destroyed = true;
        this.engine.frameScheduler.unregisterTarget(this.scene, this.targetId);
        EGLSurface eGLSurface = this.eglSurface;
        Continuation continuation = null;
        this.eglSurface = null;
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new EngineSurfaceViewTarget$destroyInternal$1((JobSupport) this.engine.launch(new SessionWorker$doWork$2$1(this, eGLSurface, continuation, 6)), continuation, 0));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        surfaceHolder.getClass();
        if (this.explicitlyDestroyed) {
            return;
        }
        this.engine.launch(new EngineSurfaceViewTarget$surfaceChanged$1(this, surfaceHolder.getSurface(), i2, i3, null, 0));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        if (this.explicitlyDestroyed) {
            return;
        }
        this.destroyed = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        destroyInternal();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        if (this.explicitlyDestroyed) {
            return;
        }
        this.engine.frameScheduler.requestRender(this.scene);
    }
}
