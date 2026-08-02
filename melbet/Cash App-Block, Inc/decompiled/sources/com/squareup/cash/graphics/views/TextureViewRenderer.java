package com.squareup.cash.graphics.views;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.gl.core.WindowSurface;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.scannerview.CameraOperator;
import java.lang.Thread;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class TextureViewRenderer implements TextureView.SurfaceTextureListener {
    public boolean errored;
    public HandlerThread glThread;
    public CameraOperator.AnonymousClass2 handler;
    public final Function1 onError;
    public WindowSurface windowSurface;

    public TextureViewRenderer(Function1 function1) {
        function1.getClass();
        this.onError = function1;
    }

    public abstract void destroy();

    public abstract void draw$1();

    public abstract void init(int i, int i2);

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        HandlerThread handlerThread = new HandlerThread("SurfaceTextureRenderer");
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.squareup.cash.graphics.views.TextureViewRenderer$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                GraphicsError graphicsError = new GraphicsError(th);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return;
                }
                errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                TextureViewRenderer textureViewRenderer = TextureViewRenderer.this;
                Function1 function1 = textureViewRenderer.onError;
                th.getClass();
                function1.invoke(th);
                textureViewRenderer.errored = true;
            }
        });
        handlerThread.start();
        this.glThread = handlerThread;
        CameraOperator.AnonymousClass2 anonymousClass2 = new CameraOperator.AnonymousClass2(this, handlerThread.getLooper(), 5);
        this.handler = anonymousClass2;
        anonymousClass2.sendMessage(anonymousClass2.obtainMessage(0, i, i2, surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        if (this.errored) {
            return true;
        }
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        if (anonymousClass2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
        anonymousClass2.sendMessage(anonymousClass2.obtainMessage(2, surfaceTexture));
        HandlerThread handlerThread = this.glThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            return false;
        }
        Intrinsics.throwUninitializedPropertyAccessException("glThread");
        throw null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        if (anonymousClass2 != null) {
            anonymousClass2.sendMessage(anonymousClass2.obtainMessage(1, i, i2, surfaceTexture));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            throw null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final void redraw() {
        GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        GLES20.glClear(16384);
        draw$1();
        WindowSurface windowSurface = this.windowSurface;
        if (windowSurface != null) {
            windowSurface.swapBuffers();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("windowSurface");
            throw null;
        }
    }
}
