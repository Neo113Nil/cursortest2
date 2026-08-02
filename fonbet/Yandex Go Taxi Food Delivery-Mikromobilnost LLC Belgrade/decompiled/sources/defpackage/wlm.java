package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class wlm implements DrivingSession.DrivingRouteListener {
    public final String a;
    public final /* synthetic */ xlm b;

    public wlm(xlm xlmVar, String str) {
        this.b = xlmVar;
        this.a = str;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        xlm xlmVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            xlmVar = this.b;
            if (!hasNext) {
                break;
            }
            arrayList.add(xlmVar.b.a(ReferenceType.DRIVING_ROUTE, (DrivingRoute) it.next()));
        }
        HashMap hashMap = xlmVar.w;
        String str = this.a;
        DrivingSession drivingSession = (DrivingSession) hashMap.remove(str);
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        da20 da20Var = (da20) xlmVar.x.remove(str);
        if (da20Var != null) {
            da20Var.success(arrayList);
        }
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        xlm xlmVar = this.b;
        HashMap hashMap = xlmVar.w;
        String str = this.a;
        DrivingSession drivingSession = (DrivingSession) hashMap.remove(str);
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        da20 da20Var = (da20) xlmVar.x.remove(str);
        if (da20Var != null) {
            da20Var.error(error.toString(), null, null);
        }
    }
}
