package defpackage;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class vub extends y3r {
    public vub(Circle circle) {
        super(circle, CircleMapObject.class);
    }

    @Override // defpackage.u15
    public final MapObject l(BaseMapObjectCollection baseMapObjectCollection, Object obj) {
        CircleMapObject addCircle = ((MapObjectCollection) baseMapObjectCollection).addCircle((Circle) obj);
        addCircle.setStrokeColor(this.j);
        addCircle.setStrokeWidth(this.i);
        addCircle.setFillColor(this.k);
        return addCircle;
    }

    @Override // defpackage.u15
    public final void n(MapObject mapObject, Object obj) {
        CircleMapObject circleMapObject = (CircleMapObject) mapObject;
        Circle circle = (Circle) obj;
        if (!a.J("for circle map object", circle.getCenter()) || circle.getRadius() <= 0.0f) {
            return;
        }
        circleMapObject.setGeometry(circle);
    }

    @Override // defpackage.lvu0
    public final void q(MapObject mapObject, float f) {
        ((CircleMapObject) mapObject).setStrokeWidth(f);
    }

    @Override // defpackage.y3r
    public final void s(MapObject mapObject, int i) {
        ((CircleMapObject) mapObject).setFillColor(i);
    }

    @Override // defpackage.y3r
    public final void t(MapObject mapObject, boolean z) {
        ((CircleMapObject) mapObject).setGeodesic(z);
    }

    @Override // defpackage.y3r
    public final void v(MapObject mapObject, int i) {
        ((CircleMapObject) mapObject).setStrokeColor(i);
    }
}
