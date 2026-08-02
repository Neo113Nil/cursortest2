package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class qob implements z910 {
    public final /* synthetic */ int a;

    public qob(int i) {
        this.a = i;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        int h = n8e.h(j);
        if (!list.isEmpty()) {
            x910 x910Var = (x910) list.get(0);
            h = x910Var.V(x910Var.e0(n8e.h(j)));
            int f = scc.f(list);
            if (1 <= f) {
                int i = 1;
                while (true) {
                    x910 x910Var2 = (x910) list.get(i);
                    int V = x910Var2.V(x910Var2.e0(n8e.h(j)));
                    if (V > h) {
                        h = V;
                    }
                    if (i == f) {
                        break;
                    }
                    i++;
                }
            }
        }
        int i2 = h;
        long b = n8e.b(0, j, 0, i2, i2, 3);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x910) it.next()).l0(b));
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 += ((o) it2.next()).a;
        }
        int size = arrayList.size() - 1;
        int i4 = size >= 0 ? size : 0;
        int i5 = this.a;
        w = kVar.w((i4 * i5) + i3, i2, b.f(), new g12(i5, 1, arrayList));
        return w;
    }
}
