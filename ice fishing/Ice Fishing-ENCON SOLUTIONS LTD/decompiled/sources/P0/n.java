package P0;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1443a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1444b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1445c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f1446d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1447e;

    public n(AbstractActivityC0072e abstractActivityC0072e) {
        super(abstractActivityC0072e, null);
        this.f1443a = false;
        this.f1444b = false;
        this.f1447e = false;
        setSurfaceTextureListener(new m(this));
        this.f1447e = R1.d.v(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1445c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1445c = hVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1445c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1444b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1445c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1445c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f1446d;
            if (surface != null) {
                surface.release();
                this.f1446d = null;
            }
        }
        this.f1445c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1445c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1443a) {
            e();
        }
        this.f1444b = false;
    }

    public final void e() {
        if (this.f1445c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1446d;
        if (surface != null) {
            surface.release();
            this.f1446d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1446d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f1445c;
        boolean z2 = this.f1444b;
        if (!z2) {
            hVar.e();
        }
        hVar.f7768b = surface2;
        FlutterJNI flutterJNI = hVar.f7767a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1445c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1447e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f1446d = surface;
    }
}
