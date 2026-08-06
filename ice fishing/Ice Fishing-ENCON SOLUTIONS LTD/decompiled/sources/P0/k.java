package P0;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1436a;

    public k(l lVar) {
        this.f1436a = lVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        l lVar = this.f1436a;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1439c;
        if (hVar == null || lVar.f1438b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f7767a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        l lVar = this.f1436a;
        lVar.f1437a = true;
        if ((lVar.f1439c == null || lVar.f1438b) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l lVar = this.f1436a;
        boolean z2 = false;
        lVar.f1437a = false;
        io.flutter.embedding.engine.renderer.h hVar = lVar.f1439c;
        if (hVar != null && !lVar.f1438b) {
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
