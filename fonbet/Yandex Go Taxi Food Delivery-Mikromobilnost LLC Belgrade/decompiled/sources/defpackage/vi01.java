package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class vi01 {
    public static final boolean a(List list) {
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof bj01)) {
                return false;
            }
        }
        return true;
    }

    public static final lum b(wls wlsVar) {
        return new lum(new jiz0(5), ti01.a, new mj1(wlsVar, 12), ui01.a);
    }

    public static final boolean c(List list, List list2) {
        if (a(list2)) {
            return !jl40.l(list != null ? Integer.valueOf(list.size()) : null, list2 != null ? Integer.valueOf(list2.size()) : null);
        }
        return false;
    }
}
