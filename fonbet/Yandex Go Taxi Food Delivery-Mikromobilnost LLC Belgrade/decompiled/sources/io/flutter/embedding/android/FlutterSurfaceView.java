package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import defpackage.ayi0;
import defpackage.ny61;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes4.dex */
public class FlutterSurfaceView extends SurfaceView implements ayi0 {
    private static final String TAG = "FlutterSurfaceView";
    private io.flutter.embedding.engine.renderer.f flutterRenderer;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;
    private final SurfaceHolderCallbackCompat surfaceHolderCallbackCompat;

    private FlutterSurfaceView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: io.flutter.embedding.android.FlutterSurfaceView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.changeSurfaceSize(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                FlutterSurfaceView.this.isSurfaceAvailableForRendering = true;
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                FlutterSurfaceView.this.isSurfaceAvailableForRendering = false;
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                }
            }
        };
        this.surfaceCallback = callback;
        this.renderTransparently = z;
        this.surfaceHolderCallbackCompat = new SurfaceHolderCallbackCompat(callback, this, this.flutterRenderer);
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
        if (this.flutterRenderer == null || getHolder() == null) {
            ny61.r("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
            return;
        }
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        Surface surface = getHolder().getSurface();
        boolean z = this.isPaused;
        if (!z) {
            fVar.f();
        }
        fVar.c = surface;
        FlutterJNI flutterJNI = fVar.a;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        if (fVar != null) {
            fVar.f();
        } else {
            ny61.r("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceHolderCallbackCompat);
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
        this.surfaceHolderCallbackCompat.onAttachToRenderer(fVar);
        resume();
    }

    @Override // defpackage.ayi0
    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (getWindowToken() != null) {
                disconnectSurfaceFromRenderer();
            }
            this.surfaceHolderCallbackCompat.onDetachFromRenderer();
            this.flutterRenderer = null;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
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
        this.surfaceHolderCallbackCompat.onResume();
        if (isSurfaceAvailableForRendering()) {
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    public FlutterSurfaceView(Context context, boolean z) {
        this(context, null, z);
    }

    public FlutterSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    public FlutterSurfaceView(Context context) {
        this(context, null, false);
    }
}
