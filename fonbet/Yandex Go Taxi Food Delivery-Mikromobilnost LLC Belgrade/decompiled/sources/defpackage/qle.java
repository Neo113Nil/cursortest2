package defpackage;

import com.yandex.plus.webview.internal.contract.impl.loading.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class qle extends a {
    @Override // com.yandex.plus.webview.internal.contract.impl.loading.a
    public final n4u0 k(swh swhVar) {
        ArrayList D = adc.D(swhVar.a, ss41.class);
        ArrayList arrayList = new ArrayList(tcc.n(D, 10));
        Iterator it = D.iterator();
        while (it.hasNext()) {
            arrayList.add(((ss41) it.next()).p());
        }
        ui7 ui7Var = new ui7((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), 2);
        xsr0.a.getClass();
        return e.R(ui7Var, this.e, wsr0.c, Boolean.FALSE);
    }
}
