package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class vab0 {
    public static s4r a(j4r j4rVar, Set set, String str) {
        Calendar calendar;
        kb61 a;
        s4r s4rVar = j4rVar.e;
        vcb0 b = b(j4rVar.a, set);
        if (b != null) {
            if (!(s4rVar instanceof r4r)) {
                if (!(s4rVar instanceof l4r)) {
                    w511.b();
                    return null;
                }
                l4r l4rVar = (l4r) s4rVar;
                scb0 scb0Var = b instanceof scb0 ? (scb0) b : null;
                return l4r.a(l4rVar, null, scb0Var != null ? scb0Var.b : null, scb0Var != null ? scb0Var.c : null, 159);
            }
            r4r r4rVar = (r4r) s4rVar;
            q4r q4rVar = r4rVar.c;
            if (q4rVar instanceof n4r) {
                tcb0 tcb0Var = b instanceof tcb0 ? (tcb0) b : null;
                return r4r.a(r4rVar, new n4r(tcb0Var != null ? tcb0Var.b : null, ((n4r) q4rVar).b));
            }
            if (!(q4rVar instanceof p4r)) {
                w511.b();
                return null;
            }
            ucb0 ucb0Var = b instanceof ucb0 ? (ucb0) b : null;
            Set set2 = ucb0Var != null ? ucb0Var.b : EmptySet.a;
            Set<o4r> set3 = ((p4r) q4rVar).a;
            ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
            for (o4r o4rVar : set3) {
                arrayList.add(o4r.a(o4rVar, set2.contains(new tab0(o4rVar.b))));
            }
            return r4r.a(r4rVar, new p4r(a.N0(arrayList)));
        }
        if (s4rVar instanceof r4r) {
            r4r r4rVar2 = (r4r) s4rVar;
            q4r q4rVar2 = r4rVar2.c;
            if (q4rVar2 instanceof n4r) {
                return r4r.a(r4rVar2, new n4r(null, ((n4r) q4rVar2).b));
            }
            if (!(q4rVar2 instanceof p4r)) {
                w511.b();
                return null;
            }
            Set set4 = ((p4r) q4rVar2).a;
            ArrayList arrayList2 = new ArrayList(tcc.n(set4, 10));
            Iterator it = set4.iterator();
            while (it.hasNext()) {
                arrayList2.add(o4r.a((o4r) it.next(), false));
            }
            return r4r.a(r4rVar2, new p4r(a.N0(arrayList2)));
        }
        if (!(s4rVar instanceof l4r)) {
            w511.b();
            return null;
        }
        l4r l4rVar2 = (l4r) s4rVar;
        Calendar b2 = (str == null || (a = aeb0.a(str)) == null) ? null : a.b();
        Calendar f = b2 != null ? kdb1.f(b2) : null;
        if (b2 != null) {
            calendar = (Calendar) b2.clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar = null;
        }
        egq0 C = xpb1.C(f, calendar, l4rVar2.c);
        return l4r.a(l4rVar2, null, C.a, C.b, 159);
    }

    public static vcb0 b(String str, Set set) {
        Object obj;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((vcb0) obj).a(), str)) {
                break;
            }
        }
        return (vcb0) obj;
    }
}
