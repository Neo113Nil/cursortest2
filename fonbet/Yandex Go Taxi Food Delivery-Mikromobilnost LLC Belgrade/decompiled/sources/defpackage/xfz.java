package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes9.dex */
public abstract class xfz {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final hsa0 c = new hsa0();

    public static final i3y a(Pair... pairArr) {
        return a.a(new ppr(29, pairArr));
    }

    public static final ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new xjr(str));
        }
        return arrayList;
    }

    public static final i3y c(i3y i3yVar, i3y i3yVar2) {
        return a.a(new l2z(2, i3yVar, i3yVar2));
    }

    public static final Pair d(Object obj, String str) {
        if (obj != null) {
            return new Pair(str, obj);
        }
        return null;
    }
}
