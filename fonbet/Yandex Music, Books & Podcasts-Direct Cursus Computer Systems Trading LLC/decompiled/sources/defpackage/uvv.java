package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class uvv implements ggi {
    public final /* synthetic */ aqi a;

    public uvv(aqi aqiVar) {
        this.a = aqiVar;
    }

    @Override // defpackage.ggi
    public final lfh b(mfh mfhVar, List list, long j) {
        mfhVar.getClass();
        list.getClass();
        long b = ia6.b(ga6.i(j), ga6.h(j), 5);
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ffh) CollectionsKt.k0((List) it.next())).M(b));
        }
        int L = mfhVar.L(vvv.b);
        aqi aqiVar = this.a;
        int intValue = ((Number) aqiVar.getValue()).intValue() <= 2 ? ((Number) aqiVar.getValue()).intValue() - 1 : ((Number) aqiVar.getValue()).intValue() - 2;
        if (intValue < 0) {
            intValue = 0;
        }
        int i = (intValue * L) + ((ksk) CollectionsKt.Y(arrayList)).a;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            wvs.n();
            return null;
        }
        int i2 = ((ksk) it2.next()).b;
        while (it2.hasNext()) {
            int i3 = ((ksk) it2.next()).b;
            if (i2 < i3) {
                i2 = i3;
            }
        }
        return mfh.m0(mfhVar, i, i2, new v50(arrayList, L, aqiVar, 21));
    }
}
