package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class xm00 extends u35 {
    @Override // defpackage.ap00
    public final MapObject c(BaseMapObjectCollection baseMapObjectCollection) {
        return ((MapObjectCollection) baseMapObjectCollection).addCollection();
    }

    public final xm00 p() {
        xm00 xm00Var = new xm00();
        xm00Var.b(this);
        return xm00Var;
    }

    public final ArrayList q(ArrayList arrayList) {
        List<PlacemarkMapObject> addEmptyPlacemarks = ((MapObjectCollection) this.g).addEmptyPlacemarks(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(addEmptyPlacemarks, 10));
        for (PlacemarkMapObject placemarkMapObject : addEmptyPlacemarks) {
            f4c0 f4c0Var = new f4c0(placemarkMapObject.getGeometry(), placemarkMapObject, 4);
            f4c0Var.b(this);
            arrayList2.add(f4c0Var);
        }
        return arrayList2;
    }

    public final f4c0 r(Point point) {
        f4c0 f4c0Var = new f4c0(point, null, 6);
        f4c0Var.b(this);
        return f4c0Var;
    }

    public final w4e0 s(Polyline polyline) {
        w4e0 w4e0Var = new w4e0(polyline);
        w4e0Var.b(this);
        return w4e0Var;
    }
}
