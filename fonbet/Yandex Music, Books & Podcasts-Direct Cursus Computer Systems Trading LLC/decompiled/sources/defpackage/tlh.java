package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class tlh implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ ulh a;

    public tlh(ulh ulhVar) {
        this.a = ulhVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ulh ulhVar = this.a;
        TextureView textureView = ulhVar.A;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        ulhVar.y = new Surface(surfaceTexture);
        ulhVar.V0(new slh(this, 2));
        ulhVar.f1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ulh ulhVar = this.a;
        TextureView textureView = ulhVar.A;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture) {
            ulhVar.y = null;
            ulhVar.V0(new slh(this, 3));
            ulhVar.f1(0, 0);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ulh ulhVar = this.a;
        TextureView textureView = ulhVar.A;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        ulhVar.f1(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ulh ulhVar = this.a;
        if (ulhVar.z != surfaceHolder) {
            return;
        }
        ulhVar.f1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ulh ulhVar = this.a;
        if (ulhVar.z != surfaceHolder) {
            return;
        }
        ulhVar.y = surfaceHolder.getSurface();
        ulhVar.V0(new slh(this, 0));
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        ulhVar.f1(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ulh ulhVar = this.a;
        if (ulhVar.z != surfaceHolder) {
            return;
        }
        ulhVar.y = null;
        ulhVar.V0(new slh(this, 1));
        ulhVar.f1(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
