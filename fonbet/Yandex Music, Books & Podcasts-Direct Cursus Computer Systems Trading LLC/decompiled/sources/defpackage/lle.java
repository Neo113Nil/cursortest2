package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class lle implements kle {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;

    public lle(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.kle
    public final lke a(List list) {
        Object obj;
        list.getClass();
        List list2 = this.a;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (list2.contains(((lke) obj2).getTag())) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        List list3 = this.b;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (!list3.contains(((lke) obj3).getTag())) {
                    arrayList2.add(obj3);
                }
            }
            list = arrayList2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((lke) obj).getVisibility().getValue()).booleanValue()) {
                break;
            }
        }
        return (lke) obj;
    }
}
