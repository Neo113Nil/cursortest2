package com.google.android.filament.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.extractor.mkv.Sniffer;

/* loaded from: classes6.dex */
public final class UiHelper$TextureViewHandler implements TextureView.SurfaceTextureListener {
    public Surface mSurface;
    public final TextureView mTextureView;
    public final /* synthetic */ WakeLockManager this$0;

    public UiHelper$TextureViewHandler(WakeLockManager wakeLockManager, TextureView textureView) {
        SurfaceTexture surfaceTexture;
        this.this$0 = wakeLockManager;
        this.mTextureView = textureView;
        textureView.setSurfaceTextureListener(this);
        if (!textureView.isAvailable() || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
            return;
        }
        wakeLockManager.getClass();
        onSurfaceTextureAvailable(surfaceTexture, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        WakeLockManager wakeLockManager = this.this$0;
        wakeLockManager.getClass();
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        Sniffer sniffer = (Sniffer) wakeLockManager.wakeLockHandler;
        if (sniffer != null) {
            sniffer.onNativeWindowChanged(surface);
        }
        wakeLockManager.enabled = true;
        Sniffer sniffer2 = (Sniffer) wakeLockManager.wakeLockHandler;
        if (sniffer2 != null) {
            sniffer2.onResized(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mSurface = null;
        this.this$0.destroySwapChain();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        WakeLockManager wakeLockManager = this.this$0;
        if (((Sniffer) wakeLockManager.wakeLockHandler) != null) {
            wakeLockManager.getClass();
            ((Sniffer) wakeLockManager.wakeLockHandler).onResized(i, i2);
            Surface surface = this.mSurface;
            if (surface != null) {
                ((Sniffer) wakeLockManager.wakeLockHandler).onNativeWindowChanged(surface);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
