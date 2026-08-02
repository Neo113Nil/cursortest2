package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class pzv implements ggi {
    public final /* synthetic */ u6k a;
    public final /* synthetic */ u6k b;
    public final /* synthetic */ sdr c;

    public pzv(u6k u6kVar, u6k u6kVar2, vm0 vm0Var) {
        this.a = u6kVar;
        this.b = u6kVar2;
        this.c = vm0Var;
    }

    @Override // defpackage.ggi
    public final lfh b(mfh mfhVar, List list, long j) {
        int L;
        mfhVar.getClass();
        list.getClass();
        long b = ia6.b(ga6.i(j), ga6.h(j), 5);
        List list2 = list;
        u6k u6kVar = this.a;
        ArrayList g0 = CollectionsKt.g0(CollectionsKt.L(list2, u6kVar.h()), CollectionsKt.q0(list2, u6kVar.h()));
        ArrayList arrayList = new ArrayList(v75.o(g0, 10));
        Iterator it = g0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ffh) CollectionsKt.k0((List) it.next())).M(b));
        }
        u6k u6kVar2 = this.b;
        if (u6kVar2.h() == 0) {
            u6kVar2.i((int) (((ksk) arrayList.get(0)).a * 0.6666667f));
        }
        int L2 = mfhVar.L(qzv.a);
        IntRange intRange = new IntRange(0, 5, 1);
        ArrayList arrayList2 = new ArrayList(v75.o(intRange, 10));
        ype it2 = intRange.iterator();
        while (it2.c) {
            int nextInt = it2.nextInt();
            if (nextInt == 0) {
                L = 0;
            } else {
                float d = qzv.d(nextInt, 0, 3) * qzv.a;
                L = nextInt == 5 ? mfhVar.L(d) : mfhVar.L(d * 0.6666667f);
            }
            arrayList2.add(Integer.valueOf(L));
        }
        return mfh.m0(mfhVar, CollectionsKt.p0(arrayList2), L2, new rt5(arrayList, u6kVar2, L2, this.c, 3));
    }
}
