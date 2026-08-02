package defpackage;

import com.yandex.go.places.map.ui.b;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.maps.core.geometry.Point;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class x1c0 implements h2c0 {
    public final PlacemarkMapObject a;
    public final LinkedHashMap b = new LinkedHashMap();

    public x1c0(MapObjectCollection mapObjectCollection) {
        this.a = mapObjectCollection.addPlacemark();
    }

    @Override // defpackage.h2c0
    public final void a(yj70 yj70Var) {
        LinkedHashMap linkedHashMap = this.b;
        if (((MapObjectTapListener) linkedHashMap.get(yj70Var)) == null) {
            uj0 uj0Var = new uj0(4, yj70Var, this);
            this.a.addTapListener(uj0Var);
            linkedHashMap.put(yj70Var, uj0Var);
        }
    }

    @Override // defpackage.h2c0
    public final void b(boolean z, m1c0 m1c0Var, sls slsVar) {
        Animation.Type type;
        int i = b3c0.a[((o1c0) m1c0Var).b.ordinal()];
        if (i == 1) {
            type = Animation.Type.SMOOTH;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            type = Animation.Type.LINEAR;
        }
        this.a.setVisible(z, new Animation(type, ((o1c0) m1c0Var).c), slsVar != null ? new nw70(19, slsVar) : null);
    }

    @Override // defpackage.h2c0
    public final boolean c() {
        return this.a.isValid();
    }

    @Override // defpackage.h2c0
    public final void d(Point point) {
        this.a.setGeometry(new com.yandex.mapkit.geometry.Point(point.getLat(), point.getLon()));
    }

    @Override // defpackage.h2c0
    public final void e(boolean z) {
        MapObject mapObject = this.a;
        if (mapObject.isValid()) {
            if (z) {
                mapObject.setVisible(false, new Animation(Animation.Type.SMOOTH, 0.2f), new nw70(19, new t9b0(11, mapObject)));
            } else {
                mapObject.setVisible(false);
                mapObject.getParent().remove(mapObject);
            }
        }
    }

    @Override // defpackage.h2c0
    public final void f(f2c0 f2c0Var, m5v m5vVar) {
        lb51 lb51Var = f2c0Var instanceof lb51 ? (lb51) f2c0Var : null;
        if (lb51Var == null) {
            return;
        }
        this.a.setIcon(lb51Var.a, new IconStyle(m5vVar.a, null, null, null, null, null, null));
    }

    @Override // defpackage.h2c0
    public final void g() {
        this.a.setVisible(false, new Animation(Animation.Type.SMOOTH, 0.2f), null);
    }

    @Override // defpackage.h2c0
    public final Point getGeometry() {
        return b.b(this.a.getGeometry());
    }

    @Override // defpackage.h2c0
    public final void setUserData(Object obj) {
        this.a.setUserData(obj);
    }

    @Override // defpackage.h2c0
    public final void setVisible(boolean z) {
        this.a.setVisible(z);
    }

    @Override // defpackage.h2c0
    public final void setZIndex(float f) {
        this.a.setZIndex(f);
    }
}
