package c0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1715a;

    public m(n nVar) {
        this.f1715a = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f1715a;
        nVar.f1716f = true;
        if ((nVar.f1718h == null || nVar.f1717g) ? false : true) {
            nVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n nVar = this.f1715a;
        boolean z2 = false;
        nVar.f1716f = false;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1718h;
        if (hVar != null && !nVar.f1717g) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = nVar.f1719i;
            if (surface != null) {
                surface.release();
                nVar.f1719i = null;
            }
        }
        Surface surface2 = nVar.f1719i;
        if (surface2 != null) {
            surface2.release();
            nVar.f1719i = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f1715a;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1718h;
        if (hVar == null || nVar.f1717g) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f2373a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
