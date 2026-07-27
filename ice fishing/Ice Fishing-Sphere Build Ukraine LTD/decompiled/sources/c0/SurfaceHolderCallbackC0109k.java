package c0;

import android.view.SurfaceHolder;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0109k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1717a;

    public SurfaceHolderCallbackC0109k(l lVar) {
        this.f1717a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f1717a;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1720g;
        if (hVar == null || lVar.f1719f) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f2381a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f1717a;
        lVar.f1718e = true;
        if ((lVar.f1720g == null || lVar.f1719f) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f1717a;
        boolean z2 = false;
        lVar.f1718e = false;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1720g;
        if (hVar != null && !lVar.f1719f) {
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
