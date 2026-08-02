package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;

/* loaded from: classes7.dex */
public final class uo00 implements MapObjectTapListener {
    public final /* synthetic */ rmj a;

    public uo00(rmj rmjVar) {
        this.a = rmjVar;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        rmj rmjVar = this.a;
        rmjVar.c(new b700(1, rmjVar, mapObject, point));
        return true;
    }
}
