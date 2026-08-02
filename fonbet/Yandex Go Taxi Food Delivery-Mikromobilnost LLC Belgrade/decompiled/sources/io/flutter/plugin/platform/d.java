package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import defpackage.aq80;
import defpackage.at20;
import defpackage.axc0;
import defpackage.b64;
import defpackage.na30;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qwc0;
import defpackage.swc0;
import defpackage.tg;
import defpackage.vc2;
import defpackage.wor0;
import defpackage.xuy0;
import defpackage.xwc0;
import defpackage.y4a0;
import defpackage.yci0;
import defpackage.ywc0;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class d implements xwc0 {
    public static final Class[] Q = {SurfaceView.class};
    public y4a0 A;
    public final tg B;
    public final HashMap C;
    public final HashMap D;
    public final SparseArray E;
    public final SparseArray F;
    public final SparseArray G;
    public final SparseArray H;
    public final HashSet L;
    public final HashSet M;
    public final at20 N;
    public final aq80 a;
    public vc2 b;
    public Activity c;
    public FlutterView w;
    public xuy0 y;
    public io.flutter.plugin.editing.c z;
    public FlutterJNI x = null;
    public int I = 0;
    public boolean J = false;
    public boolean K = true;
    public boolean O = false;
    public final a P = new a(this);

    public d() {
        aq80 aq80Var = new aq80();
        aq80Var.a = new HashMap();
        this.a = aq80Var;
        this.C = new HashMap();
        this.B = new tg();
        this.D = new HashMap();
        this.G = new SparseArray();
        this.L = new HashSet();
        this.M = new HashSet();
        this.H = new SparseArray();
        this.E = new SparseArray();
        this.F = new SparseArray();
        if (at20.c == null) {
            at20.c = new at20();
        }
        this.N = at20.c;
    }

    public static void b(d dVar, ywc0 ywc0Var) {
        int i = ywc0Var.g;
        if (i == 0 || i == 1) {
            return;
        }
        ny61.r(oyr.m(ywc0Var.a, Extension.C_BRAKE, b64.t(i, "Trying to create a view with unknown direction value: ", "(view id: ")));
    }

    public static void f(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= i) {
            return;
        }
        ny61.r(oyr.h(i2, i, "Trying to use platform views with API ", ", required API level is: "));
    }

    @Override // defpackage.xwc0
    public final void a(AccessibilityBridge accessibilityBridge) {
        this.B.a = accessibilityBridge;
    }

    public final qwc0 c(ywc0 ywc0Var, boolean z) {
        String str = ywc0Var.b;
        int i = ywc0Var.a;
        ByteBuffer byteBuffer = ywc0Var.i;
        swc0 swc0Var = (swc0) ((HashMap) this.a.a).get(str);
        if (swc0Var == null) {
            yci0.k(str, "Trying to create a platform view of unregistered type: ");
            return null;
        }
        qwc0 create = swc0Var.create(z ? new MutableContextWrapper(this.c) : this.c, i, byteBuffer != null ? swc0Var.getCreateArgsCodec().a(byteBuffer) : null);
        View view = create.getView();
        if (view == null) {
            ny61.r("PlatformView#getView() returned null, but an Android view reference was expected.");
            return null;
        }
        view.setLayoutDirection(ywc0Var.g);
        this.E.put(i, create);
        FlutterView flutterView = this.w;
        if (flutterView == null) {
            return create;
        }
        create.onFlutterViewAttached(flutterView);
        return create;
    }

    @Override // defpackage.xwc0
    public final View d(int i) {
        if (g(i)) {
            return ((g) this.C.get(Integer.valueOf(i))).a();
        }
        qwc0 qwc0Var = (qwc0) this.E.get(i);
        if (qwc0Var == null) {
            return null;
        }
        return qwc0Var.getView();
    }

    public final void e() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.G;
            if (i >= sparseArray.size()) {
                return;
            }
            PlatformOverlayView platformOverlayView = (PlatformOverlayView) sparseArray.valueAt(i);
            platformOverlayView.detachFromRenderer();
            platformOverlayView.closeImageReader();
            i++;
        }
    }

    @Override // defpackage.xwc0
    public final boolean g(int i) {
        return this.C.containsKey(Integer.valueOf(i));
    }

    @Override // defpackage.xwc0
    public final void h() {
        this.B.a = null;
    }

    public final void i(boolean z) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.G;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            PlatformOverlayView platformOverlayView = (PlatformOverlayView) sparseArray.valueAt(i);
            if (this.L.contains(Integer.valueOf(keyAt))) {
                this.w.attachOverlaySurfaceToRender(platformOverlayView);
                z &= platformOverlayView.acquireLatestImage();
            } else {
                if (!this.J) {
                    platformOverlayView.detachFromRenderer();
                }
                platformOverlayView.setVisibility(8);
                this.w.removeView(platformOverlayView);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = this.F;
            if (i2 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i2);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.M.contains(Integer.valueOf(keyAt2)) || (!z && this.K)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i2++;
        }
    }

    public final float j() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public final aq80 k() {
        return this.a;
    }

    public final void l() {
        while (true) {
            SparseArray sparseArray = this.E;
            if (sparseArray.size() <= 0) {
                return;
            }
            this.P.c(sparseArray.keyAt(0));
        }
    }

    public final void m() {
        for (g gVar : this.C.values()) {
            wor0 wor0Var = gVar.f;
            wor0 wor0Var2 = gVar.f;
            int width = ((TextureRegistry$SurfaceProducer) wor0Var.a).getWidth();
            int height = ((TextureRegistry$SurfaceProducer) wor0Var2.a).getHeight();
            boolean isFocused = gVar.a().isFocused();
            e detachState = gVar.a.detachState();
            gVar.h.setSurface(null);
            gVar.h.release();
            gVar.h = ((DisplayManager) gVar.b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + gVar.e, width, height, gVar.d, ((TextureRegistry$SurfaceProducer) wor0Var2.a).getSurface(), 0, g.i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(gVar.b, gVar.h.getDisplay(), gVar.c, detachState, gVar.g, isFocused);
            singleViewPresentation.show();
            gVar.a.cancel();
            gVar.a = singleViewPresentation;
        }
    }

    public final void n(FlutterJNI flutterJNI) {
        this.x = flutterJNI;
    }

    public final MotionEvent o(float f, axc0 axc0Var, boolean z) {
        long j = axc0Var.p;
        int i = axc0Var.e;
        MotionEvent g = this.N.g(new na30(j));
        List<List> list = (List) axc0Var.g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i]);
        if (!z && g != null) {
            if (pointerCoordsArr.length < 1) {
                return g;
            }
            g.offsetLocation(pointerCoordsArr[0].x - g.getX(), pointerCoordsArr[0].y - g.getY());
            return g;
        }
        List<List> list3 = (List) axc0Var.f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(axc0Var.b.longValue(), axc0Var.c.longValue(), axc0Var.d, axc0Var.e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i]), pointerCoordsArr, axc0Var.h, axc0Var.i, axc0Var.j, axc0Var.k, axc0Var.l, axc0Var.m, axc0Var.n, axc0Var.o);
    }

    public final int p(double d) {
        return (int) Math.round(d * j());
    }
}
