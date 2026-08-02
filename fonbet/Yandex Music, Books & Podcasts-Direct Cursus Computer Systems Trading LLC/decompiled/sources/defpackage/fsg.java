package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* loaded from: classes5.dex */
public abstract class fsg {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final n7b c = new n7b(24);

    public static final jyr a(Pair... pairArr) {
        return btf.b(new dmg(2, pairArr));
    }

    public static final ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new zhc(str));
        }
        return arrayList;
    }

    public static final jyr c(arf arfVar, arf arfVar2) {
        return btf.b(new y6g(1, arfVar, arfVar2));
    }

    public static final Pair d(Object obj, String str) {
        if (obj != null) {
            return new Pair(str, obj);
        }
        return null;
    }
}
