package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class wp40 {
    public static boolean a(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (set.contains(((pex0) obj).b)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((pex0) it.next()).B) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (set.contains(((pex0) obj).b)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((pex0) it.next()).A) {
                return true;
            }
        }
        return false;
    }
}
