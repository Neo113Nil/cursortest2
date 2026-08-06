package P0;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class J implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f1395a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1396b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1397c;

    /* renamed from: d, reason: collision with root package name */
    public final C0073f f1398d = new C0073f(2, this);

    /* renamed from: e, reason: collision with root package name */
    public final I f1399e;

    public J(k kVar, l lVar, io.flutter.embedding.engine.renderer.h hVar) {
        boolean z2 = Build.VERSION.SDK_INT < 26;
        this.f1399e = z2 ? new I(this, 1) : new I(this, 0);
        this.f1397c = kVar;
        this.f1396b = hVar;
        this.f1395a = lVar;
        if (z2) {
            lVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        k kVar = this.f1397c;
        if (kVar != null) {
            kVar.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k kVar = this.f1397c;
        if (kVar != null) {
            kVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k kVar = this.f1397c;
        if (kVar != null) {
            kVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f1396b;
        if (hVar == null) {
            return;
        }
        hVar.a(new H(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
