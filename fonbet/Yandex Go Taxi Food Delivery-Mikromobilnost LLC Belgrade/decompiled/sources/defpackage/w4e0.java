package defpackage;

import android.util.SparseIntArray;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.RouteHelper;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamStyle;
import java.util.List;

/* loaded from: classes6.dex */
public final class w4e0 extends lvu0 {
    public float j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;
    public Integer s;
    public List t;
    public List u;
    public final SparseIntArray v;
    public boolean w;
    public ool0 x;
    public JamStyle y;

    public w4e0(Polyline polyline) {
        super(PolylineMapObject.class, polyline);
        this.j = 0.0f;
        this.k = 0;
        this.o = 10.0f;
        this.p = 12.0f;
        this.r = true;
        this.v = new SparseIntArray();
    }

    public final void A(int i, int i2) {
        this.v.append(i, i2);
        ((PolylineMapObject) this.g).setPaletteColor(i, i2);
    }

    public final void B(int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            A(i3, i2);
        }
        sd80 sd80Var = new sd80(i);
        this.t = sd80Var;
        this.s = null;
        ((PolylineMapObject) this.g).setStrokeColors(sd80Var);
    }

    public final void C(Integer num) {
        this.s = num;
        this.t = null;
        ((PolylineMapObject) this.g).setStrokeColor(num.intValue());
    }

    public final void D(float f) {
        this.o = f;
        ((PolylineMapObject) this.g).setTurnRadius(f);
    }

    @Override // defpackage.lvu0, defpackage.u15, defpackage.ap00
    public final void f() {
        ool0 ool0Var;
        SparseIntArray sparseIntArray = this.v;
        super.f();
        ((PolylineMapObject) this.g).setOutlineColor(this.k);
        ((PolylineMapObject) this.g).setOutlineWidth(this.j);
        ((PolylineMapObject) this.g).setInnerOutlineEnabled(this.r);
        ((PolylineMapObject) this.g).setDashLength(this.l);
        ((PolylineMapObject) this.g).setGapLength(this.m);
        ((PolylineMapObject) this.g).setDashOffset(this.n);
        ((PolylineMapObject) this.g).setTurnRadius(this.o);
        ((PolylineMapObject) this.g).setArcApproximationStep(this.p);
        ((PolylineMapObject) this.g).setGradientLength(this.q);
        List<Subpolyline> list = this.u;
        if (list != null) {
            ((PolylineMapObject) this.g).hide(list);
        }
        Integer num = this.s;
        if (num != null) {
            ((PolylineMapObject) this.g).setStrokeColor(num.intValue());
        }
        List<Integer> list2 = this.t;
        if (list2 != null) {
            ((PolylineMapObject) this.g).setStrokeColors(list2);
        }
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            ((PolylineMapObject) this.g).setPaletteColor(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
        if (this.w && (ool0Var = this.x) != null && (ool0Var instanceof nol0)) {
            JamStyle jamStyle = this.y;
            if (jamStyle == null) {
                jamStyle = !el00.a ? null : RouteHelper.createDefaultJamStyle();
            }
            if (jamStyle != null) {
                PolylineMapObject polylineMapObject = (PolylineMapObject) this.g;
                DrivingRoute drivingRoute = ((nol0) this.x).a;
                if (el00.a) {
                    RouteHelper.updatePolyline(polylineMapObject, drivingRoute, jamStyle, true);
                }
            }
        }
        JamStyle jamStyle2 = this.y;
        if (jamStyle2 != null) {
            PolylineMapObject polylineMapObject2 = (PolylineMapObject) this.g;
            if (el00.a) {
                RouteHelper.applyJamStyle(polylineMapObject2, jamStyle2);
            }
        }
    }

    @Override // defpackage.u15
    public final MapObject l(BaseMapObjectCollection baseMapObjectCollection, Object obj) {
        return ((MapObjectCollection) baseMapObjectCollection).addPolyline((Polyline) obj);
    }

    @Override // defpackage.u15
    public final void n(MapObject mapObject, Object obj) {
        PolylineMapObject polylineMapObject = (PolylineMapObject) mapObject;
        Polyline polyline = (Polyline) obj;
        if (polyline.getPoints().size() >= 2) {
            polylineMapObject.setGeometry(polyline);
        }
    }

    @Override // defpackage.lvu0
    public final void q(MapObject mapObject, float f) {
        ((PolylineMapObject) mapObject).setStrokeWidth(f);
    }

    public final void r(List list) {
        this.u = list;
        ((PolylineMapObject) this.g).hide((List<Subpolyline>) list);
    }

    public final void s(float f) {
        this.l = f;
        ((PolylineMapObject) this.g).setDashLength(f);
    }

    public final void t(float f) {
        this.n = f;
        ((PolylineMapObject) this.g).setDashOffset(f);
    }

    public final void u(float f) {
        this.m = f;
        ((PolylineMapObject) this.g).setGapLength(f);
    }

    public final void v(boolean z) {
        this.r = z;
        ((PolylineMapObject) this.g).setInnerOutlineEnabled(z);
    }

    public final void w(ool0 ool0Var) {
        this.w = true;
        this.x = ool0Var;
        MapObject mapObject = this.g;
        if (mapObject == this.a) {
            jst.e.r("delegate is empty! Attach this object to collection", new IllegalStateException());
            return;
        }
        if (ool0Var == null) {
            return;
        }
        if (!(ool0Var instanceof nol0)) {
            ((PolylineMapObject) mapObject).setGeometry(ool0Var.getGeometry());
            return;
        }
        JamStyle jamStyle = this.y;
        if (jamStyle == null) {
            jamStyle = !el00.a ? null : RouteHelper.createDefaultJamStyle();
        }
        if (jamStyle == null) {
            return;
        }
        PolylineMapObject polylineMapObject = (PolylineMapObject) this.g;
        DrivingRoute drivingRoute = ((nol0) ool0Var).a;
        if (el00.a) {
            RouteHelper.updatePolyline(polylineMapObject, drivingRoute, jamStyle, true);
        }
    }

    public final void x(DrivingRoute drivingRoute) {
        if (drivingRoute != null) {
            w(new nol0(drivingRoute));
        }
    }

    public final void y(int i) {
        this.k = i;
        ((PolylineMapObject) this.g).setOutlineColor(i);
    }

    public final void z(float f) {
        this.j = f;
        ((PolylineMapObject) this.g).setOutlineWidth(f);
    }
}
