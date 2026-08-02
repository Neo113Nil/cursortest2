package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import defpackage.ayi0;
import defpackage.ny61;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes4.dex */
public class FlutterTextureView extends TextureView implements ayi0 {
    private static final String TAG = "FlutterTextureView";
    private io.flutter.embedding.engine.renderer.f flutterRenderer;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;
    private Surface renderSurface;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                FlutterTextureView.this.isSurfaceAvailableForRendering = true;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                FlutterTextureView.this.isSurfaceAvailableForRendering = false;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.disconnectSurfaceFromRenderer();
                }
                if (FlutterTextureView.this.renderSurface == null) {
                    return true;
                }
                FlutterTextureView.this.renderSurface.release();
                FlutterTextureView.this.renderSurface = null;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.changeSurfaceSize(i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i2) {
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        if (fVar != null) {
            fVar.a.onSurfaceChanged(i, i2);
        } else {
            ny61.r("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            ny61.r("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
            return;
        }
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.renderSurface = surface2;
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        boolean z = this.isPaused;
        if (!z) {
            fVar.f();
        }
        fVar.c = surface2;
        FlutterJNI flutterJNI = fVar.a;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        if (fVar == null) {
            ny61.r("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            return;
        }
        fVar.f();
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldNotify() {
        return (this.flutterRenderer == null || this.isPaused) ? false : true;
    }

    @Override // defpackage.ayi0
    public void attachToRenderer(io.flutter.embedding.engine.renderer.f fVar) {
        io.flutter.embedding.engine.renderer.f fVar2 = this.flutterRenderer;
        if (fVar2 != null) {
            fVar2.f();
        }
        this.flutterRenderer = fVar;
        resume();
    }

    @Override // defpackage.ayi0
    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (getWindowToken() != null) {
                disconnectSurfaceFromRenderer();
            }
            this.flutterRenderer = null;
        }
    }

    @Override // defpackage.ayi0
    public io.flutter.embedding.engine.renderer.f getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public boolean isSurfaceAvailableForRendering() {
        return this.isSurfaceAvailableForRendering;
    }

    @Override // defpackage.ayi0
    public void pause() {
        if (this.flutterRenderer == null) {
            return;
        }
        this.isPaused = true;
    }

    @Override // defpackage.ayi0
    public void resume() {
        if (this.flutterRenderer == null) {
            return;
        }
        if (isSurfaceAvailableForRendering()) {
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    public void setRenderSurface(Surface surface) {
        this.renderSurface = surface;
    }

    public FlutterTextureView(Context context) {
        this(context, null);
    }
}
