package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class VN implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3093dO f28243n;

    public /* synthetic */ VN(C3093dO c3093dO) {
        Objects.requireNonNull(c3093dO);
        this.f28243n = c3093dO;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        C3093dO c3093dO = this.f28243n;
        c3093dO.getClass();
        Surface surface = new Surface(surfaceTexture);
        c3093dO.J1(surface);
        c3093dO.f30044v0 = surface;
        c3093dO.L1(i, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3093dO c3093dO = this.f28243n;
        c3093dO.J1(null);
        c3093dO.L1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        this.f28243n.L1(i, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i9) {
        this.f28243n.L1(i4, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f28243n.L1(0, 0);
    }
}
