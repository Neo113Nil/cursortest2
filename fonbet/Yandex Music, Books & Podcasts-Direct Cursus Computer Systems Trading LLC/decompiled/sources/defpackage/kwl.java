package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public class kwl implements pur, f {
    public static final dvu a() {
        jyr jyrVar = dvu.e;
        return (dvu) dvu.e.getValue();
    }

    public static zgs b(String str, int i, List list, List list2, String str2, int i2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        List w0 = CollectionsKt.w0(CollectionsKt.z0(list));
        ArrayList arrayList = new ArrayList();
        for (Object obj : w0) {
            if (!StringsKt.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        List q0 = CollectionsKt.q0(arrayList, i2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (hashSet.add(((ugs) obj2).getUrl())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!StringsKt.U(((ugs) next).getUrl())) {
                arrayList3.add(next);
            }
        }
        return new zgs(i, str, str2, q0, CollectionsKt.q0(arrayList3, i2));
    }

    public static vuu c() {
        return (vuu) dvu.g.getValue();
    }

    public static boolean d() {
        int ordinal = ((plj) dvu.f.getValue()).ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1 || ordinal == 2) {
            return true;
        }
        b6e.s();
        return false;
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        zcoVar.y((-(nmq.b(zcoVar.p) * 0.5833333f)) * f);
        zcoVar.a(1.0f - f);
    }
}
