package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.maps.core.geometry.Point;

/* loaded from: classes7.dex */
public final class y1c0 implements g2c0 {
    public final /* synthetic */ MapWindow a;

    public y1c0(MapWindow mapWindow) {
        this.a = mapWindow;
    }

    public final PointF a(Point point) {
        ScreenPoint worldToScreen = this.a.worldToScreen(new com.yandex.mapkit.geometry.Point(point.getLat(), point.getLon()));
        if (worldToScreen != null) {
            return new PointF(worldToScreen.getX(), worldToScreen.getY());
        }
        return null;
    }

    @Override // defpackage.g2c0
    public final int getHeight() {
        return this.a.height();
    }

    @Override // defpackage.g2c0
    public final int getWidth() {
        return this.a.width();
    }
}
