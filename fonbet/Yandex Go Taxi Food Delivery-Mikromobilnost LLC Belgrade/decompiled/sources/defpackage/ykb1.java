package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes11.dex */
public abstract class ykb1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            d6w F = j73.F(objArr);
            if ((F instanceof Collection) && ((Collection) F).isEmpty()) {
                return true;
            }
            c6w it = F.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (!a(objArr[nextInt], objArr2[nextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            d6w e = scc.e((Collection) obj);
            if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
                return true;
            }
            c6w it2 = e.iterator();
            while (it2.c) {
                int nextInt2 = it2.nextInt();
                if (!a(list.get(nextInt2), list2.get(nextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return jl40.l(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !a(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(TaxiOrder taxiOrder) {
        return (taxiOrder == null || taxiOrder.h.getB() != DriveState.COMPLETE || taxiOrder.l.getY()) ? false : true;
    }
}
