package P0;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1437a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1438b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1440d;

    /* renamed from: e, reason: collision with root package name */
    public final J f1441e;

    public l(AbstractActivityC0072e abstractActivityC0072e, boolean z2) {
        super(abstractActivityC0072e, null);
        this.f1437a = false;
        this.f1438b = false;
        this.f1440d = false;
        J j2 = new J(new k(this), this, this.f1439c);
        this.f1441e = j2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f1440d = R1.d.v(getContext());
        getHolder().addCallback(j2);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1439c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1439c = hVar;
        I i2 = this.f1441e.f1399e;
        switch (i2.f1393a) {
            case 0:
                i2.f1394b.f1396b = hVar;
                break;
            default:
                J j2 = i2.f1394b;
                io.flutter.embedding.engine.renderer.h hVar3 = j2.f1396b;
                if (hVar3 != null) {
                    hVar3.c(j2.f1398d);
                }
                j2.f1396b = hVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1439c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1438b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1439c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1439c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        I i2 = this.f1441e.f1399e;
        switch (i2.f1393a) {
            case 0:
                i2.f1394b.f1396b = null;
                break;
            default:
                J j2 = i2.f1394b;
                j2.f1395a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = j2.f1396b;
                if (hVar2 != null) {
                    hVar2.c(j2.f1398d);
                }
                j2.f1396b = null;
                break;
        }
        this.f1439c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1439c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        I i2 = this.f1441e.f1399e;
        switch (i2.f1393a) {
            case 0:
                break;
            default:
                J j2 = i2.f1394b;
                io.flutter.embedding.engine.renderer.h hVar = j2.f1396b;
                if (hVar != null) {
                    hVar.a(j2.f1398d);
                    break;
                }
                break;
        }
        if (this.f1437a) {
            e();
        }
        this.f1438b = false;
    }

    public final void e() {
        if (this.f1439c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f1439c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f1438b;
        if (!z2) {
            hVar.e();
        }
        hVar.f7768b = surface;
        FlutterJNI flutterJNI = hVar.f7767a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1439c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1440d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
