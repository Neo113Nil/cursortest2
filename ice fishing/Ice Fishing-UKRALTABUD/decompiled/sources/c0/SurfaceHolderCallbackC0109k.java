package c0;

import android.view.SurfaceHolder;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0109k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1709a;

    public SurfaceHolderCallbackC0109k(l lVar) {
        this.f1709a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f1709a;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1712h;
        if (hVar == null || lVar.f1711g) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f2373a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f1709a;
        lVar.f1710f = true;
        if ((lVar.f1712h == null || lVar.f1711g) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f1709a;
        boolean z2 = false;
        lVar.f1710f = false;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1712h;
        if (hVar != null && !lVar.f1711g) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
    }
}
