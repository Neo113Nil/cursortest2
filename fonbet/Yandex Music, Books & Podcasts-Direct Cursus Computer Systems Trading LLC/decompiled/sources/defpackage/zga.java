package defpackage;

import com.yandex.plus.bdui.content.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class zga implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ zga(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(this.b.size());
            case 1:
                return Integer.valueOf(this.b.size());
            case 2:
                List list = this.b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mqs) it.next()).d());
                }
                return arrayList;
            case 3:
                return this.b;
            case 4:
                return ((u9f) this.b.get(0)).d();
            case 5:
                return ((u9f) this.b.get(0)).d();
            case 6:
                List list2 = this.b;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h0r) it2.next()).a.d());
                }
                return arrayList2;
            case 7:
                return Integer.valueOf(this.b.size());
            default:
                List<c> list3 = this.b;
                ArrayList arrayList3 = new ArrayList();
                for (c cVar : list3) {
                    cVar.getClass();
                    Function2 function2 = cVar.d;
                    Pair pair = function2 != null ? new Pair(cVar.c, function2) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return new com.yandex.plus.core.reflect.c(uah.n(arrayList3));
        }
    }
}
