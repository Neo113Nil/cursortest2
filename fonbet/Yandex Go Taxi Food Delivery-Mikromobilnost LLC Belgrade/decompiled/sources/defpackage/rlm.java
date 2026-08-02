package defpackage;

import com.yandex.go.navigator.utils.d;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class rlm implements DrivingSession.DrivingRouteListener {
    public final /* synthetic */ d a;
    public final /* synthetic */ Point b;
    public final /* synthetic */ j18 c;

    public rlm(d dVar, Point point, j18 j18Var) {
        this.a = dVar;
        this.b = point;
        this.c = j18Var;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        Object obj;
        this.a.e.remove(this.b);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double value = ((DrivingRoute) next).getMetadata().getWeight().getTime().getValue();
                do {
                    Object next2 = it.next();
                    double value2 = ((DrivingRoute) next2).getMetadata().getWeight().getTime().getValue();
                    if (Double.compare(value, value2) > 0) {
                        next = next2;
                        value = value2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        this.c.resumeWith(obj);
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        this.a.e.remove(this.b);
        this.c.resumeWith(null);
    }
}
