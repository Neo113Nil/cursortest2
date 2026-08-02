package defpackage;

import com.yandex.div2.DivContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class qjk {
    public static boolean a(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList P0 = a.P0(list, list2);
        if (P0.isEmpty()) {
            return true;
        }
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (!b(((cxk) pair.c()).a, ((cxk) pair.f()).a, ((cxk) pair.c()).b, ((cxk) pair.f()).b)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(m3k m3kVar, m3k m3kVar2, rvo rvoVar, rvo rvoVar2) {
        if (!jl40.l(m3kVar != null ? m3kVar.getClass() : null, m3kVar2 != null ? m3kVar2.getClass() : null)) {
            return false;
        }
        if (m3kVar == null || m3kVar2 == null || m3kVar == m3kVar2) {
            return true;
        }
        return c(m3kVar.d(), m3kVar2.d(), rvoVar, rvoVar2) && a(d(m3kVar, rvoVar), d(m3kVar2, rvoVar2));
    }

    public static boolean c(egk egkVar, egk egkVar2, rvo rvoVar, rvo rvoVar2) {
        if (egkVar.getId() != null && egkVar2.getId() != null && !jl40.l(egkVar.getId(), egkVar2.getId()) && (egkVar.y() != null || egkVar.j() != null || egkVar.k() != null || egkVar2.y() != null || egkVar2.j() != null || egkVar2.k() != null)) {
            return false;
        }
        if (!(egkVar instanceof clk) || !(egkVar2 instanceof clk) || jl40.l(((clk) egkVar).j, ((clk) egkVar2).j)) {
            if ((egkVar instanceof DivContainer) && (egkVar2 instanceof DivContainer)) {
                DivContainer divContainer = (DivContainer) egkVar;
                Object a = divContainer.I.a(rvoVar);
                DivContainer.Orientation orientation = DivContainer.Orientation.OVERLAP;
                DivContainer divContainer2 = (DivContainer) egkVar2;
                if ((a == orientation) == (divContainer2.I.a(rvoVar2) == orientation) && uml.j(divContainer, rvoVar) == uml.j(divContainer2, rvoVar2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    public static List d(m3k m3kVar, rvo rvoVar) {
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            return com.yandex.div.internal.core.a.c(divContainer.B, divContainer.z, rvoVar);
        }
        boolean z = m3kVar instanceof m2k;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            ?? r2 = ((m2k) m3kVar).c.y;
            if (r2 != 0) {
                emptyList = r2;
            }
            return com.yandex.div.internal.core.a.h(emptyList, rvoVar);
        }
        if ((m3kVar instanceof n2k) || (m3kVar instanceof l2k) || (m3kVar instanceof x2k) || (m3kVar instanceof s2k) || (m3kVar instanceof k2k) || (m3kVar instanceof q2k) || (m3kVar instanceof w2k) || (m3kVar instanceof u2k) || (m3kVar instanceof j2k) || (m3kVar instanceof p2k) || (m3kVar instanceof r2k) || (m3kVar instanceof o2k) || (m3kVar instanceof t2k) || (m3kVar instanceof y2k) || (m3kVar instanceof v2k)) {
            return emptyList;
        }
        w511.b();
        return null;
    }

    public static boolean e(omk omkVar, omk omkVar2, long j, rvo rvoVar, rvo rvoVar2) {
        Object obj;
        Object obj2;
        if (omkVar == null) {
            return false;
        }
        Iterator it = omkVar.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((mmk) obj2).b == j) {
                break;
            }
        }
        mmk mmkVar = (mmk) obj2;
        Iterator it2 = omkVar2.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((mmk) next).b == j) {
                obj = next;
                break;
            }
        }
        mmk mmkVar2 = (mmk) obj;
        if (mmkVar == null || mmkVar2 == null) {
            return false;
        }
        return b(mmkVar.a, mmkVar2.a, rvoVar, rvoVar2);
    }
}
