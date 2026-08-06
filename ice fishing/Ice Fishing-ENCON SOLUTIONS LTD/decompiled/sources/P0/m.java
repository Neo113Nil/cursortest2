package P0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1442a;

    public m(n nVar) {
        this.f1442a = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f1442a;
        nVar.f1443a = true;
        if ((nVar.f1445c == null || nVar.f1444b) ? false : true) {
            nVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n nVar = this.f1442a;
        boolean z2 = false;
        nVar.f1443a = false;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1445c;
        if (hVar != null && !nVar.f1444b) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = nVar.f1446d;
            if (surface != null) {
                surface.release();
                nVar.f1446d = null;
            }
        }
        Surface surface2 = nVar.f1446d;
        if (surface2 != null) {
            surface2.release();
            nVar.f1446d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f1442a;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1445c;
        if (hVar == null || nVar.f1444b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f7767a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
