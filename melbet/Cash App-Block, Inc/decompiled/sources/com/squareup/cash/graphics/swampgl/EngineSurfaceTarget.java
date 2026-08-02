package com.squareup.cash.graphics.swampgl;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;

/* loaded from: classes6.dex */
public final class EngineSurfaceTarget implements TextureView.SurfaceTextureListener {
    public Surface androidSurface;
    public volatile boolean destroyed;
    public final float displayRefreshRateHz;
    public EGLSurface eglSurface;
    public final Engine engine;
    public long lastFrameTimeMs;
    public final CashMapViewKt$$ExternalSyntheticLambda3 onPerceivedFpsUpdate;
    public float perceivedFps;
    public final Scene scene;
    public SurfaceTexture surfaceTexture;
    public final Object targetId;

    public EngineSurfaceTarget(Engine engine, Scene scene, float f, CashMapViewKt$$ExternalSyntheticLambda3 cashMapViewKt$$ExternalSyntheticLambda3) {
        engine.getClass();
        scene.getClass();
        this.engine = engine;
        this.scene = scene;
        this.displayRefreshRateHz = f;
        this.onPerceivedFpsUpdate = cashMapViewKt$$ExternalSyntheticLambda3;
        this.targetId = new Object();
        this.lastFrameTimeMs = SystemClock.elapsedRealtime();
    }

    public final void destroyInternal() {
        if (this.destroyed && this.eglSurface == null) {
            return;
        }
        this.destroyed = true;
        this.engine.frameScheduler.unregisterTarget(this.scene, this.targetId);
        EGLSurface eGLSurface = this.eglSurface;
        Surface surface = this.androidSurface;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        this.eglSurface = null;
        this.androidSurface = null;
        this.surfaceTexture = null;
        this.engine.launch(new EngineSurfaceTarget$destroyInternal$1(this, eGLSurface, surface, surfaceTexture, null, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        this.destroyed = false;
        this.surfaceTexture = surfaceTexture;
        this.engine.launch(new EngineSurfaceViewTarget$surfaceChanged$1(this, surfaceTexture, i, i2, null, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        destroyInternal();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        this.engine.frameScheduler.updateTargetSize(this.scene, this.targetId, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.lastFrameTimeMs;
        this.lastFrameTimeMs = elapsedRealtime;
        if (1 <= j && j < 100) {
            float f = 1000.0f / j;
            float f2 = this.perceivedFps;
            if (f2 != RecyclerView.DECELERATION_RATE) {
                f = (f * 0.1f) + (f2 * 0.9f);
            }
            this.perceivedFps = f;
        }
        this.onPerceivedFpsUpdate.invoke(Float.valueOf(this.perceivedFps));
    }
}
