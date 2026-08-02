package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* loaded from: classes5.dex */
public final class t4e0 implements qv00 {
    public static Optional b(List list) {
        BoundingBox boundingBox;
        List list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m4e0 m4e0Var = ((j4e0) it.next()).b;
            if (m4e0Var != null && (list2 = m4e0Var.a) != null) {
                arrayList.addAll(list2);
            }
        }
        if (arrayList.isEmpty()) {
            boundingBox = null;
            jst.e.a(10, null, new Throwable("Polyline points are empty"), null);
        } else {
            double d = ((zzs) arrayList.get(0)).b;
            double d2 = ((zzs) arrayList.get(0)).a;
            Iterator it2 = arrayList.iterator();
            double d3 = d2;
            double d4 = d3;
            double d5 = d;
            while (it2.hasNext()) {
                zzs zzsVar = (zzs) it2.next();
                double d6 = zzsVar.b;
                if (d > d6) {
                    d = d6;
                }
                if (d5 < d6) {
                    d5 = d6;
                }
                double d7 = zzsVar.a;
                if (d3 > d7) {
                    d3 = d7;
                }
                if (d4 < d7) {
                    d4 = d7;
                }
            }
            boundingBox = new BoundingBox(new Point(d3, d), new Point(d4, d5));
        }
        return Optional.ofNullable(boundingBox);
    }

    @Override // defpackage.qv00
    public final /* bridge */ /* synthetic */ Optional a(Object obj) {
        return b((List) obj);
    }
}
