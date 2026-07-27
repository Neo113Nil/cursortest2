package c0;

import a.AbstractC0069a;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1716f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1717g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1718h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f1719i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1720j;

    public n(AbstractActivityC0104f abstractActivityC0104f) {
        super(abstractActivityC0104f, null);
        this.f1716f = false;
        this.f1717g = false;
        this.f1720j = false;
        setSurfaceTextureListener(new m(this));
        this.f1720j = AbstractC0069a.s(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1718h;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1718h = hVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1718h == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1716f) {
            e();
        }
        this.f1717g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1718h == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1717g = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1718h == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1718h;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f1719i;
            if (surface != null) {
                surface.release();
                this.f1719i = null;
            }
        }
        this.f1718h = null;
    }

    public final void e() {
        if (this.f1718h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1719i;
        if (surface != null) {
            surface.release();
            this.f1719i = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1719i = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f1718h;
        boolean z2 = this.f1717g;
        if (!z2) {
            hVar.e();
        }
        hVar.f2374b = surface2;
        FlutterJNI flutterJNI = hVar.f2373a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1718h;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1720j) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f1719i = surface;
    }
}
