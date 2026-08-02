package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.main.ui.overlay.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class uj0 implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uj0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                vj0 vj0Var = (vj0) obj2;
                Address address = (Address) obj;
                ((pep0) vj0Var.A).f((m950) vj0Var.x.get(), new ie0(new bvv(address.B(), address, ue0.b, null, null, false, null, 248), vj0Var.y), hxx.a);
                break;
            case 1:
                po00 po00Var = (po00) obj2;
                qo00 qo00Var = (qo00) obj;
                Iterator it = po00Var.c.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((jv00) next).b, mapObject)) {
                            r1 = next;
                        }
                    }
                }
                jv00 jv00Var = (jv00) r1;
                if (jv00Var != null) {
                    po00Var.a.u("map/map_objects", b.h(new Pair("map_object_id", qo00Var.a), new Pair("type", "tap"), new Pair("child_id", jv00Var.a)));
                    break;
                }
                break;
            case 2:
                yo30 yo30Var = ((a) obj2).a;
                igu0 igu0Var = ((qfu0) obj).a;
                rp60 rp60Var = yo30Var.E;
                String str = igu0Var.a;
                rp60Var.b(str);
                dzx dzxVar = yo30Var.B;
                jfu0 jfu0Var = new jfu0(str);
                r0 r0Var = dzxVar.a;
                r0Var.getClass();
                r0Var.m(null, jfu0Var);
                ((gzm0) yo30Var.x.a).r(new po30(igu0Var, i2));
                break;
            case 3:
                qqb0 qqb0Var = (qqb0) obj2;
                wpb0 wpb0Var = (wpb0) obj;
                if (qqb0Var != null) {
                    qqb0Var.a(wpb0Var);
                    break;
                }
                break;
            default:
                com.yandex.go.places.map.ui.b.b(point);
                ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a aVar = (ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a) ((yj70) obj2).a;
                Object userData = ((x1c0) obj).a.getUserData();
                r1 = userData instanceof mwb0 ? (mwb0) userData : null;
                if (r1 != null) {
                    if (!(r1 instanceof g8c)) {
                        Iterator it2 = aVar.i.iterator();
                        while (it2.hasNext()) {
                            if (((Boolean) ((tls) it2.next()).invoke(r1)).booleanValue()) {
                                break;
                            }
                        }
                        break;
                    } else {
                        g8c g8cVar = (g8c) r1;
                        Iterator it3 = aVar.h.iterator();
                        while (it3.hasNext()) {
                            if (((Boolean) ((tls) it3.next()).invoke(g8cVar)).booleanValue()) {
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
