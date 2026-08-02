package defpackage;

import com.yandex.plus.core.benchmark.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final /* synthetic */ class zx4 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ a c;

    public /* synthetic */ zx4(a aVar, List list) {
        this.c = aVar;
        this.b = list;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) aVar.c.getValue()).booleanValue()) {
                    return EmptyList.a;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((ql5) ((Pair) it.next()).getFirst());
                }
                return arrayList;
            default:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    rl5 a = ((sl5) ((Pair) it2.next()).f()).a();
                    djt djtVar = a instanceof djt ? (djt) a : null;
                    if (djtVar != null) {
                        djtVar.a(new d9(23, aVar));
                    }
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                return arrayList2;
        }
    }

    public /* synthetic */ zx4(List list, a aVar) {
        this.b = list;
        this.c = aVar;
    }
}
