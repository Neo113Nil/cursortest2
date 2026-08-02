package io.flutter.embedding.android;

import android.view.SurfaceHolder;
import defpackage.ctr;
import defpackage.fnw0;
import defpackage.gnw0;
import defpackage.jrr;
import defpackage.l7s0;

/* loaded from: classes4.dex */
public class SurfaceHolderCallbackCompat implements SurfaceHolder.Callback2 {
    private static final String TAG = "SurfaceHolderCallbackCompat";
    private io.flutter.embedding.engine.renderer.f flutterRenderer;
    private final FlutterSurfaceView flutterSurfaceView;
    private final SurfaceHolder.Callback innerCallback;
    final ctr alphaCallback = new jrr(3, this);
    private final boolean shouldSetAlpha = false;
    final gnw0 lifecycleCallback = new l7s0(this);

    public SurfaceHolderCallbackCompat(SurfaceHolder.Callback callback, FlutterSurfaceView flutterSurfaceView, io.flutter.embedding.engine.renderer.f fVar) {
        this.innerCallback = callback;
        this.flutterRenderer = fVar;
        this.flutterSurfaceView = flutterSurfaceView;
    }

    public void onAttachToRenderer(io.flutter.embedding.engine.renderer.f fVar) {
        ((SurfaceHolderCallbackCompat) ((l7s0) this.lifecycleCallback).a).flutterRenderer = fVar;
    }

    public void onDetachFromRenderer() {
        ((SurfaceHolderCallbackCompat) ((l7s0) this.lifecycleCallback).a).flutterRenderer = null;
    }

    public void onResume() {
        this.lifecycleCallback.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
        if (fVar == null) {
            return;
        }
        fnw0 fnw0Var = new fnw0(this, runnable);
        fVar.a.addIsDisplayingFlutterUiListener(fnw0Var);
        if (fVar.d) {
            fnw0Var.onFlutterUiDisplayed();
        }
    }
}
