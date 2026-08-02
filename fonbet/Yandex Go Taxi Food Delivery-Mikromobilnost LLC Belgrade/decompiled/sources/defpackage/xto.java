package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.a;

/* loaded from: classes12.dex */
public abstract class xto {
    public static final i3y a = a.a(new cao(23));

    public static List a(List list) {
        return (list.isEmpty() || ru.yandex.taxi.map.utils.a.z((Point) kotlin.collections.a.P(list), (Point) kotlin.collections.a.Z(list))) ? list : kotlin.collections.a.o0(list, kotlin.collections.a.P(list));
    }

    public static LinkedHashSet b(int i, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            c().getClass();
            int i2 = (int) ((67553994410557440L & longValue) >> 52);
            if (i2 > i) {
                c().getClass();
                if (i < 0 || i > i2) {
                    kbs.o("res (%d) must be between 0 and %d, inclusive", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                if (i != i2) {
                    long j = i << 52;
                    long j2 = 35184372088831L;
                    for (int i3 = 0; i3 < i; i3++) {
                        j2 >>= 3;
                    }
                    longValue = (longValue & (-67553994410557441L)) | j | j2;
                }
                linkedHashSet.add(Long.valueOf(longValue));
            } else {
                linkedHashSet.add(Long.valueOf(longValue));
            }
        }
        return linkedHashSet;
    }

    public static com.uber.h3core.a c() {
        return (com.uber.h3core.a) a.getValue();
    }

    public static boolean d(Point point, List list) {
        int size = list.size() - 1;
        int size2 = list.size();
        int i = size;
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            double latitude = ((Point) list.get(i2)).getLatitude();
            double latitude2 = ((Point) list.get(i)).getLatitude();
            if ((latitude > point.getLatitude()) != (latitude2 > point.getLatitude())) {
                if (point.getLongitude() < ((Point) list.get(i2)).getLongitude() + (((point.getLatitude() - latitude) * (((Point) list.get(i)).getLongitude() - ((Point) list.get(i2)).getLongitude())) / (latitude2 - latitude))) {
                    z = !z;
                }
            }
            i = i2;
        }
        return z;
    }
}
