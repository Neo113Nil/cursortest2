package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class y5q implements bal {
    public final btl a;
    public final q3t b;
    public final cur c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g = l18.b.b(hag.I(frt.class), true);

    public y5q(btl btlVar, q3t q3tVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, cur curVar) {
        this.a = btlVar;
        this.b = q3tVar;
        this.c = curVar;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(y5q y5qVar, Collection collection, Set set, LinkedHashSet linkedHashSet, cg6 cg6Var) {
        x5q x5qVar;
        Object obj;
        nm6 nm6Var;
        int i;
        LinkedHashSet linkedHashSet2;
        Map map;
        Set set2;
        Iterator it;
        Set set3;
        if (cg6Var instanceof x5q) {
            x5qVar = (x5q) cg6Var;
            int i2 = x5qVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x5qVar.o = i2 - Integer.MIN_VALUE;
                obj = x5qVar.m;
                nm6Var = nm6.a;
                i = x5qVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) y5qVar.f.getValue();
                    x5qVar.j = set;
                    x5qVar.k = linkedHashSet;
                    x5qVar.o = 1;
                    obj = yx4Var.r(collection, x5qVar);
                    linkedHashSet2 = linkedHashSet;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = x5qVar.l;
                        set2 = x5qVar.k;
                        set = x5qVar.j;
                        qgg.h0(obj);
                        xxq xxqVar = (xxq) obj;
                        rw4 rw4Var = new rw4(new uga(xxqVar.a, xxqVar.b, null), "3");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set) {
                            if (set2.contains(((sw4) obj2).a)) {
                                arrayList.add(obj2);
                            }
                        }
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sw4 sw4Var = (sw4) it.next();
                            boolean equals = sw4Var.a.equals(rw4Var);
                            Set set4 = sw4Var.b;
                            if (equals) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : set4) {
                                    if (map.get((String) obj3) == v1t.b) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                set3 = arrayList2;
                            } else {
                                set3 = set4;
                            }
                            z75.t(linkedHashSet3, set3);
                        }
                        return linkedHashSet3;
                    }
                    Set set5 = x5qVar.k;
                    set = x5qVar.j;
                    qgg.h0(obj);
                    linkedHashSet2 = set5;
                }
                Map map2 = (Map) obj;
                frt frtVar = (frt) y5qVar.g.getValue();
                x5qVar.j = set;
                x5qVar.k = linkedHashSet2;
                x5qVar.l = map2;
                x5qVar.o = 2;
                obj = frtVar.f(x5qVar);
                if (obj != nm6Var) {
                    map = map2;
                    set2 = linkedHashSet2;
                    xxq xxqVar2 = (xxq) obj;
                    rw4 rw4Var2 = new rw4(new uga(xxqVar2.a, xxqVar2.b, null), "3");
                    ArrayList arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    LinkedHashSet linkedHashSet32 = new LinkedHashSet();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    return linkedHashSet32;
                }
                return nm6Var;
            }
        }
        x5qVar = new x5q(y5qVar, cg6Var);
        obj = x5qVar.m;
        nm6Var = nm6.a;
        i = x5qVar.o;
        if (i != 0) {
        }
        Map map22 = (Map) obj;
        frt frtVar2 = (frt) y5qVar.g.getValue();
        x5qVar.j = set;
        x5qVar.k = linkedHashSet2;
        x5qVar.l = map22;
        x5qVar.o = 2;
        obj = frtVar2.f(x5qVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    @Override // defpackage.bal
    public final Object a(int i, cg6 cg6Var) {
        Object V = x97.V(dm6.b, new glp(this, i, null, 4), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    public final void c(cvl cvlVar, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((zvs) it.next()).a);
        }
        if (cvlVar != null) {
            btl btlVar = this.a;
            xqn xqnVar = new xqn();
            xqnVar.a = cvlVar;
            if (cvlVar.k < 0) {
                cvl g = btlVar.g(cvlVar);
                if (g == null) {
                    return;
                } else {
                    xqnVar.a = g;
                }
            }
            if (ivf.I((cvl) xqnVar.a)) {
                return;
            }
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            String str = ((frt) qdcVar.C(I)).c().a;
            str.getClass();
            x97.D(g.a, new c5l(str, xqnVar, arrayList, (Continuation) null));
        }
    }
}
