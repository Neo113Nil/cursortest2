package defpackage;

import android.text.format.DateFormat;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.ThreadInfo;
import com.yandex.mapkit.transport.masstransit.ThreadStop;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import com.yandex.mapkit.transport.masstransit.VehicleStop;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.taxi.masstransit.model.RouteType;

/* loaded from: classes6.dex */
public final class s240 {
    public final ole0 a;

    public s240(ole0 ole0Var) {
        this.a = ole0Var;
    }

    public final x3l0 a(String str, String str2, Line line, ThreadInfo threadInfo, Vehicle vehicle) {
        Map f;
        Time arrivalTime;
        List<VehicleStop> stops = vehicle != null ? vehicle.getStops() : null;
        List<ThreadStop> stops2 = threadInfo.getStops();
        uel0 uel0Var = RouteType.Companion;
        String mapkitType = zpb1.a(line.getVehicleTypes()).b.getMapkitType();
        uel0Var.getClass();
        RouteType a = uel0.a(mapkitType);
        boolean z = a == RouteType.ROUTE_TYPE_UNDERGROUND;
        String name = line.getName();
        if (stops != null) {
            List<VehicleStop> list = stops;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            f = new LinkedHashMap(d);
            for (VehicleStop vehicleStop : list) {
                String id = vehicleStop.getStop().getId();
                VehicleStop.Estimation estimation = vehicleStop.getEstimation();
                Pair pair = new Pair(id, (estimation == null || (arrivalTime = estimation.getArrivalTime()) == null) ? null : npb1.e(arrivalTime, DateFormat.getTimeFormat(this.a.a), 0L));
                f.put(pair.c(), pair.f());
            }
        } else {
            f = b.f();
        }
        List<ThreadStop> list2 = stops2;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ThreadStop threadStop : list2) {
            arrayList.add(new v3l0(threadStop.getStop().getId(), threadStop.getStop().getName(), z ? jl40.l(threadStop.getStop().getName(), str2) : jl40.l(threadStop.getStop().getId(), str), (String) f.get(threadStop.getStop().getId()), threadStop.getPosition()));
        }
        Line.Style style = line.getStyle();
        return new x3l0(a, name, arrayList, style != null ? style.getColor() : null, threadInfo.getStages(), vehicle != null ? vehicle.getId() : null, EmptyList.a);
    }
}
