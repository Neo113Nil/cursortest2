package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ro1 implements ggi {
    public final /* synthetic */ float a;

    public ro1(float f) {
        this.a = f;
    }

    @Override // defpackage.ggi
    public final lfh b(mfh mfhVar, List list, long j) {
        mfhVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return mfh.m0(mfhVar, ga6.k(j), ga6.j(j), new ci1(23));
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ffh) CollectionsKt.k0((List) it.next())).M(j));
        }
        int L = mfhVar.L(this.a);
        int size = ((arrayList.size() - 1) * L) + ((ksk) CollectionsKt.Y(arrayList)).a;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            wvs.n();
            return null;
        }
        int i = ((ksk) it2.next()).b;
        while (it2.hasNext()) {
            int i2 = ((ksk) it2.next()).b;
            if (i < i2) {
                i = i2;
            }
        }
        return mfh.m0(mfhVar, size, i, new qo1(arrayList, L, 0));
    }
}
