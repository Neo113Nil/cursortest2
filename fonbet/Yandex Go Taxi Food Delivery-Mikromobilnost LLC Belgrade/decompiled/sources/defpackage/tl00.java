package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;

/* loaded from: classes15.dex */
public final class tl00 {
    public final tt5 a;
    public Boolean b;
    public CameraPosition c;
    public q4g d;

    public tl00(tt5 tt5Var) {
        this.a = tt5Var;
    }

    public final void a() {
        q4g q4gVar = this.d;
        if (q4gVar == null) {
            return;
        }
        i4n i4nVar = (i4n) q4gVar.c;
        this.d = null;
        Map map = ((MapWindow) i4nVar.c).getMap();
        map.getMapObjects().setVisible(true);
        i4nVar.a();
        ((kht) q4gVar.x).remove();
        kzo kzoVar = (kzo) q4gVar.y;
        if (!kzoVar.b) {
            kzoVar.b = true;
            ((m2v) kzoVar.c).G(null);
            ((m2v) kzoVar.w).G(null);
            bvf0.j((ike) kzoVar.x, null);
        }
        CameraPosition cameraPosition = this.c;
        if (cameraPosition != null) {
            map.move(cameraPosition, new Animation(Animation.Type.SMOOTH, 0.3f), new sl00(0));
        }
        Boolean bool = this.b;
        if (bool != null) {
            map.setRotateGesturesEnabled(bool.booleanValue());
        }
    }
}
