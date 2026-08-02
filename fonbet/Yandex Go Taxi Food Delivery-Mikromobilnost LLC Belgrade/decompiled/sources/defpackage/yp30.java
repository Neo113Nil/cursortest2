package defpackage;

import com.yandex.mapkit.Time;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteStop;
import com.yandex.mapkit.transport.masstransit.Section;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import ru.yandex.taxi.masstransit.datasource.routing.a;

/* loaded from: classes6.dex */
public final class yp30 {
    public final a a;
    public final ole0 b;
    public final zuj0 c;

    public yp30(a aVar, ole0 ole0Var, zuj0 zuj0Var) {
        this.a = aVar;
        this.b = ole0Var;
        this.c = zuj0Var;
    }

    public static ArrayList b(Route route) {
        List<Section> sections = route.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            List<RouteStop> stops = ((Section) it.next()).getStops();
            ArrayList arrayList2 = new ArrayList(tcc.n(stops, 10));
            Iterator<T> it2 = stops.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((RouteStop) it2.next()).getMetadata().getStop().getName());
            }
            ycc.r(arrayList2, arrayList);
        }
        return arrayList;
    }

    public final String a(long j, Time time) {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.b.a);
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return timeFormat.format(Long.valueOf((j + time.getTzOffset()) * 1000));
    }

    public final String c(Time time) {
        return npb1.e(time, android.text.format.DateFormat.getTimeFormat(this.b.a), 0L);
    }
}
