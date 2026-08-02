package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ab5 extends aur implements tyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab5(Object obj, Continuation continuation, int i) {
        super(5, continuation);
        this.j = i;
        this.o = obj;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.j) {
            case 0:
                ab5 ab5Var = new ab5((jv) this.o, (Continuation) obj5, 0);
                ab5Var.k = obj;
                ab5Var.l = obj2;
                ab5Var.m = obj3;
                ab5Var.n = obj4;
                return ab5Var.invokeSuspend(Unit.a);
            case 1:
                ab5 ab5Var2 = new ab5((gha) this.o, (Continuation) obj5, 1);
                ab5Var2.k = (List) obj;
                ab5Var2.l = (List) obj2;
                ab5Var2.m = (List) obj3;
                ab5Var2.n = (List) obj4;
                return ab5Var2.invokeSuspend(Unit.a);
            default:
                ab5 ab5Var3 = new ab5((g6c) this.o, (Continuation) obj5, 2);
                ab5Var3.k = (cvl) obj;
                ab5Var3.l = (List) obj2;
                ab5Var3.m = (scc) obj3;
                ab5Var3.n = (String) obj4;
                return ab5Var3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        tga tgaVar;
        vbc vbcVar;
        tga tgaVar2;
        Object obj3;
        boolean z;
        List list;
        Object obj4;
        Object obj5;
        Iterable arrayList;
        int i = this.j;
        Object obj6 = this.o;
        Throwable th = null;
        switch (i) {
            case 0:
                Object obj7 = this.k;
                Object obj8 = this.l;
                Object obj9 = this.m;
                Object obj10 = this.n;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return ((jv) obj6).invoke(obj7, obj8, obj9, obj10);
            case 1:
                List list2 = (List) this.k;
                List list3 = (List) this.l;
                List list4 = (List) this.m;
                List list5 = (List) this.n;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                gha ghaVar = (gha) obj6;
                jyr jyrVar = ghaVar.n;
                if (list4.isEmpty() && list5.isEmpty()) {
                    return iha.a;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((vbc) obj2).b()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vbc vbcVar2 = (vbc) obj2;
                if (vbcVar2 != null) {
                    ghaVar.H().getClass();
                    tgaVar = hha.a(vbcVar2);
                } else {
                    tgaVar = tga.a;
                }
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next = it2.next();
                        if (((vbc) next).b()) {
                            vbcVar = next;
                        }
                    } else {
                        vbcVar = null;
                    }
                }
                vbc vbcVar3 = vbcVar;
                if (vbcVar3 != null) {
                    ghaVar.H().getClass();
                    tgaVar2 = hha.a(vbcVar3);
                } else {
                    tgaVar2 = tga.d;
                }
                p0s p0sVar = p0s.a;
                List<gga> J = gha.J(list4, tgaVar);
                ArrayList arrayList2 = new ArrayList(v75.o(J, 10));
                for (gga ggaVar : J) {
                    iwl iwlVar = iwl.a;
                    arrayList2.add(new ewl(iwl.a(ggaVar.a, ((z66) jyrVar.getValue()).h()), ggaVar.a));
                }
                s0s s0sVar = new s0s(R.string.you_collected_playlist, p0sVar, arrayList2);
                p0s p0sVar2 = p0s.b;
                List<gga> J2 = gha.J(list5, tgaVar2);
                ArrayList arrayList3 = new ArrayList(v75.o(J2, 10));
                for (gga ggaVar2 : J2) {
                    iwl iwlVar2 = iwl.a;
                    arrayList3.add(new ewl(iwl.a(ggaVar2.a, ((z66) jyrVar.getValue()).h()), ggaVar2.a));
                }
                return new jha(u75.h(s0sVar, new s0s(R.string.you_liked_playlist, p0sVar2, arrayList3)));
            default:
                cvl cvlVar = (cvl) this.k;
                List list6 = (List) this.l;
                scc sccVar = (scc) this.m;
                String str = (String) this.n;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                g6c g6cVar = (g6c) obj6;
                jyr jyrVar2 = g6cVar.g;
                g6cVar.o.l(list6 == null ? c5b.a : list6);
                if (list6 != null) {
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(((mqs) it3.next()).d());
                    }
                    ((ncc) g6cVar.e.getValue()).c(hashSet);
                }
                if (cvlVar == null || cvlVar.g == 0 || (list = list6) == null || list.isEmpty()) {
                    obj3 = y5c.a;
                    z = false;
                } else {
                    boolean d = Intrinsics.d(sccVar, pcc.a);
                    odc odcVar = kdc.a;
                    if (!d && !Intrinsics.d(sccVar, qcc.a)) {
                        boolean d2 = Intrinsics.d(sccVar, occ.a);
                        odcVar = idc.a;
                        if (d2) {
                            xdr xdrVar = (xdr) ((bqi) jyrVar2.getValue());
                            xdrVar.getClass();
                            xdrVar.m(null, "all");
                        } else {
                            if (!(sccVar instanceof rcc)) {
                                b6e.s();
                                return null;
                            }
                            List list7 = ((rcc) sccVar).a;
                            Iterator it4 = list7.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj4 = it4.next();
                                    if (((zbc) obj4).a.equals(str)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            if (obj4 == null) {
                                xdr xdrVar2 = (xdr) ((bqi) jyrVar2.getValue());
                                xdrVar2.getClass();
                                xdrVar2.m(null, "all");
                                str = "all";
                            }
                            ArrayList arrayList4 = new ArrayList(v75.o(list7, 10));
                            int i2 = 0;
                            for (Object obj11 : list7) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    Throwable th2 = th;
                                    u75.n();
                                    throw th2;
                                }
                                zbc zbcVar = (zbc) obj11;
                                String str2 = zbcVar.a;
                                arrayList4.add(new hcc(i2, str2, zbcVar.b, str2.equals(str)));
                                i2 = i3;
                                th = th;
                            }
                            Throwable th3 = th;
                            Iterator it5 = CollectionsKt.B0(list7).iterator();
                            while (true) {
                                ora oraVar = (ora) it5;
                                if (oraVar.b.hasNext()) {
                                    obj5 = oraVar.next();
                                    if (((zbc) ((IndexedValue) obj5).b).a.equals(str)) {
                                    }
                                } else {
                                    obj5 = th3;
                                }
                            }
                            IndexedValue indexedValue = (IndexedValue) obj5;
                            if (indexedValue != null) {
                                zbc zbcVar2 = (zbc) indexedValue.b;
                                Set set = zbcVar2.c;
                                if (set == null) {
                                    arrayList = list6;
                                } else {
                                    arrayList = new ArrayList();
                                    for (Object obj12 : list6) {
                                        if (set.contains(((mqs) obj12).d())) {
                                            arrayList.add(obj12);
                                        }
                                    }
                                }
                                ArrayList b = g6c.b(g6cVar, CollectionsKt.q0(arrayList, 12));
                                z = !Intrinsics.d(g6cVar.i, zbcVar2.a);
                                g6cVar.i = zbcVar2.a;
                                odcVar = new mdc(arrayList4, indexedValue.a, b, arrayList);
                                obj3 = new w5c(cvlVar, odcVar, g6c.b(g6cVar, CollectionsKt.q0(list6, 12)));
                            }
                        }
                    }
                    z = false;
                    obj3 = new w5c(cvlVar, odcVar, g6c.b(g6cVar, CollectionsKt.q0(list6, 12)));
                }
                rmb.h(g6cVar.b, list6 != null ? list6.size() : 0, 2);
                kzp kzpVar = g6cVar.n;
                if (kzpVar != null) {
                    kzpVar.invoke(new d73(g6cVar.a));
                }
                return new Pair(obj3, Boolean.valueOf(z));
        }
    }
}
