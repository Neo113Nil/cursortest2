package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class dd extends uif implements Function1 {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ xqn s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ aqi w;
    public final /* synthetic */ aqi x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(ArrayList arrayList, xqn xqnVar, ArrayList arrayList2, List list, List list2, aqi aqiVar, aqi aqiVar2, long j, boolean z) {
        super(1);
        this.r = arrayList;
        this.s = xqnVar;
        this.t = arrayList2;
        this.u = list;
        this.v = list2;
        this.w = aqiVar;
        this.x = aqiVar2;
        this.y = j;
        this.z = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        xqn xqnVar;
        Iterator it;
        jpa jpaVar = (jpa) obj;
        Float valueOf = Float.valueOf(0.0f);
        jpaVar.getClass();
        boolean isEmpty = this.r.isEmpty();
        List list = this.v;
        aqi aqiVar = this.x;
        aqi aqiVar2 = this.w;
        if (!isEmpty) {
            xqn xqnVar2 = this.s;
            if (xqnVar2.a != null) {
                List h = u75.h(new Pair(valueOf, Float.valueOf(ed.b(aqiVar2))), new Pair(Float.valueOf(((cma) aqiVar.getValue()).a), Float.valueOf(((cma) aqiVar2.getValue()).a)));
                ArrayList arrayList = this.t;
                int i = 10;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    List<jod> list2 = (List) it2.next();
                    ArrayList arrayList3 = new ArrayList(v75.o(list2, i));
                    for (jod jodVar : list2) {
                        long longValue = jodVar.a.longValue();
                        jpa jpaVar2 = jpaVar;
                        List list3 = h;
                        long longValue2 = ((Number) xqnVar2.a).longValue();
                        float f = ((cma) aqiVar2.getValue()).a;
                        if (longValue2 == 0) {
                            xqnVar = xqnVar2;
                            it = it2;
                        } else {
                            xqnVar = xqnVar2;
                            it = it2;
                            f *= 1 - (longValue / longValue2);
                        }
                        arrayList3.add(new jod(Float.valueOf(f), jodVar.b));
                        jpaVar = jpaVar2;
                        h = list3;
                        xqnVar2 = xqnVar;
                        it2 = it;
                    }
                    arrayList2.add(arrayList3);
                    i = 10;
                }
                jpa jpaVar3 = jpaVar;
                int size = this.u.size();
                int i2 = 0;
                while (i2 < size) {
                    Iterable iterable = (Iterable) arrayList2.get(i2);
                    ArrayList arrayList4 = new ArrayList(v75.o(iterable, 10));
                    Iterator it3 = iterable.iterator();
                    while (true) {
                        boolean hasNext = it3.hasNext();
                        j = this.y;
                        if (!hasNext) {
                            break;
                        }
                        arrayList4.add(new Pair(Float.valueOf((1 - ((j - r4.b) / 30000)) * ((cma) aqiVar.getValue()).a), ((jod) it3.next()).a));
                        h = h;
                        it3 = it3;
                    }
                    List list4 = h;
                    ArrayList arrayList5 = new ArrayList();
                    if (this.z) {
                        arrayList5.add(new Pair(valueOf, Float.valueOf(((cma) aqiVar2.getValue()).a)));
                        arrayList5.add(new Pair(Float.valueOf((1 - ((j - ((jod) CollectionsKt.Q((List) arrayList2.get(i2))).b) / 30000)) * ((cma) aqiVar.getValue()).a), Float.valueOf(((cma) aqiVar2.getValue()).a)));
                    } else {
                        arrayList5.add(new Pair(valueOf, ((jod) CollectionsKt.Q((List) arrayList2.get(i2))).a));
                    }
                    arrayList5.addAll(arrayList4);
                    arrayList5.add(new Pair(Float.valueOf(((cma) aqiVar.getValue()).a), ((jod) CollectionsKt.Y((List) arrayList2.get(i2))).a));
                    jpa jpaVar4 = jpaVar3;
                    jpa.x0(jpaVar4, ed.c(CollectionsKt.g0(arrayList5, CollectionsKt.j0(list4))), d85.b(((d85) list.get(i2 % list.size())).a, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0.0f, dbc.a, 52);
                    jpa.x0(jpaVar4, ed.c(arrayList5), ((d85) list.get(i2 % list.size())).a, 0.0f, new amr(3.0f, 0.0f, 1, 1, 18), 52);
                    i2++;
                    jpaVar3 = jpaVar4;
                    h = arrayList5;
                }
                return Unit.a;
            }
        }
        nh0 a = ph0.a();
        a.f(0.0f, ed.b(aqiVar2));
        a.e(((cma) aqiVar.getValue()).a, ((cma) aqiVar2.getValue()).a);
        jpa.x0(jpaVar, a, ((d85) CollectionsKt.Q(list)).a, 0.0f, new amr(3.0f, 0.0f, 1, 1, 18), 52);
        return Unit.a;
    }
}
