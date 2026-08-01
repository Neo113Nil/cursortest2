package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HN implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PN f25264n;

    public /* synthetic */ HN(PN pn) {
        Objects.requireNonNull(pn);
        this.f25264n = pn;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i6) {
        PN pn = this.f25264n;
        pn.getClass();
        Surface surface = new Surface(surfaceTexture);
        pn.f2(surface);
        pn.f26800s0 = surface;
        pn.g2(i, i6);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        PN pn = this.f25264n;
        pn.f2(null);
        pn.g2(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i6) {
        this.f25264n.g2(i, i6);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i6, int i9) {
        this.f25264n.g2(i6, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f25264n.g2(0, 0);
    }
}
