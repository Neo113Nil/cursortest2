package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fnk {
    public final p51 a;
    public final et b;
    public final rus c;

    public fnk(p51 p51Var, et etVar, rus rusVar) {
        this.a = p51Var;
        this.b = etVar;
        this.c = rusVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x016b, code lost:
    
        if (r1 != r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, List list) {
        enk enkVar;
        nm6 nm6Var;
        int i;
        ci0 ci0Var;
        LinkedHashSet linkedHashSet;
        List list2;
        int i2;
        Iterator it;
        String str2;
        ci0 ci0Var2;
        List list3;
        List list4;
        Object w;
        String str3 = str;
        if (cg6Var instanceof enk) {
            enkVar = (enk) cg6Var;
            int i3 = enkVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                enkVar.p = i3 - Integer.MIN_VALUE;
                Object obj = enkVar.n;
                nm6Var = nm6.a;
                i = enkVar.p;
                int i4 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        return Unit.a;
                    }
                    ci0Var = new ci0();
                    ci0Var.a = System.currentTimeMillis();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet = new LinkedHashSet();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        mqs mqsVar = (mqs) it2.next();
                        List list5 = mqsVar.u;
                        List list6 = mqsVar.f;
                        if (list5 != null) {
                            List<c01> list7 = list5;
                            i2 = i4;
                            ArrayList arrayList = new ArrayList(v75.o(list7, 10));
                            for (c01 c01Var : list7) {
                                Parcelable.Creator<zp2> creator = zp2.CREATOR;
                                arrayList.add(vq2.E(c01Var));
                            }
                            if (Intrinsics.d(list6, arrayList)) {
                                it = it2;
                            } else {
                                it = it2;
                                su4.s(2, null, vz1.p("Track ", mqsVar.d.h, " artists differ: ", !Intrinsics.d(list6, arrayList)), null);
                            }
                            linkedHashSet2.addAll(list5);
                        } else {
                            i2 = i4;
                            it = it2;
                        }
                        oq oqVar = mqsVar.t;
                        if (oqVar != null) {
                            linkedHashSet.add(oq.e(oqVar, list6, 536862591));
                        }
                        i4 = i2;
                        it2 = it;
                    }
                    ci0Var.c("prepared");
                    enkVar.j = str3;
                    enkVar.k = list;
                    enkVar.l = ci0Var;
                    enkVar.m = linkedHashSet;
                    enkVar.p = i4;
                    if (this.a.b(str3, linkedHashSet2, enkVar) != nm6Var) {
                        list2 = list;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    LinkedHashSet linkedHashSet3 = enkVar.m;
                    ci0Var = enkVar.l;
                    list2 = enkVar.k;
                    String str4 = enkVar.j;
                    qgg.h0(obj);
                    linkedHashSet = linkedHashSet3;
                    str3 = str4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ci0Var2 = enkVar.l;
                        List list8 = enkVar.k;
                        qgg.h0(obj);
                        ci0Var2.c("added albumTracks");
                        return Unit.a;
                    }
                    ci0Var2 = enkVar.l;
                    list3 = enkVar.k;
                    str2 = enkVar.j;
                    qgg.h0(obj);
                    ci0Var2.c("added albums");
                    list4 = list3;
                    enkVar.j = null;
                    enkVar.k = null;
                    enkVar.l = ci0Var2;
                    enkVar.m = null;
                    enkVar.p = 3;
                    if (qld.H(list4)) {
                        w = this.c.b.w(str2, list4, enkVar);
                        if (w != nm6.a) {
                            w = Unit.a;
                        }
                    } else {
                        w = Unit.a;
                    }
                }
                ci0Var.c("added artists");
                enkVar.j = str3;
                enkVar.k = list2;
                enkVar.l = ci0Var;
                enkVar.m = null;
                enkVar.p = 2;
                if (this.b.b(str3, linkedHashSet, enkVar) != nm6Var) {
                    str2 = str3;
                    ci0Var2 = ci0Var;
                    list3 = list2;
                    ci0Var2.c("added albums");
                    list4 = list3;
                    enkVar.j = null;
                    enkVar.k = null;
                    enkVar.l = ci0Var2;
                    enkVar.m = null;
                    enkVar.p = 3;
                    if (qld.H(list4)) {
                    }
                }
                return nm6Var;
            }
        }
        enkVar = new enk(this, cg6Var);
        Object obj2 = enkVar.n;
        nm6Var = nm6.a;
        i = enkVar.p;
        int i42 = 1;
        if (i != 0) {
        }
        ci0Var.c("added artists");
        enkVar.j = str3;
        enkVar.k = list2;
        enkVar.l = ci0Var;
        enkVar.m = null;
        enkVar.p = 2;
        if (this.b.b(str3, linkedHashSet, enkVar) != nm6Var) {
        }
        return nm6Var;
    }

    public final Object b(String str, Iterable iterable, cg6 cg6Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mqs mqsVar = (mqs) it.next();
            dg2 dg2Var = mqsVar.k;
            if (dg2Var == dg2.d || dg2Var == dg2.e) {
                ssg.a(2, null, "skipping full data pushing for track " + mqsVar.a + ", error: " + dg2Var, null);
                mqsVar = mqs.e(mqsVar, 0L, null, null, null, null, -1572865);
            }
            linkedHashMap.put(mqsVar.d, mqsVar);
        }
        Object a = a(cg6Var, str, CollectionsKt.w0(linkedHashMap.values()));
        return a == nm6.a ? a : Unit.a;
    }
}
