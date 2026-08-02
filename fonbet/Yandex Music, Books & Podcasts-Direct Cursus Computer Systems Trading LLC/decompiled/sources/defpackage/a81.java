package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class a81 extends bfu {
    public final u51 k;
    public final xzi l;
    public final jyr m;
    public final xdr n;
    public final fkn o;

    public a81(u51 u51Var, kxi kxiVar, b81 b81Var) {
        Object c81Var;
        u51Var.getClass();
        b81Var.getClass();
        this.k = u51Var;
        this.l = new xzi(u51Var.a, kxiVar.a);
        this.m = l18.b.b(hag.I(i71.class), true);
        b81.b.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(b81.c);
        ArrayList arrayList = new ArrayList(v75.o(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int ordinal = ((b81) it.next()).ordinal();
            if (ordinal == 0) {
                c5b c5bVar = c5b.a;
                c81Var = new c81(c5bVar, c5bVar, true);
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    throw null;
                }
                c81Var = new d81(c5b.a, true);
            }
            arrayList.add(c81Var);
        }
        xdr a = ydr.a(new v71(b81Var, arrayList, false));
        this.n = a;
        this.o = new fkn(a);
        i71 i71Var = (i71) this.m.getValue();
        String str = this.k.a;
        i71Var.getClass();
        str.getClass();
        b71 b71Var = (b71) i71Var.b.getValue();
        b71Var.getClass();
        e15 e15Var = (e15) b71Var.a.getValue();
        ox6.B(zsd.b0(new c05(e15Var.h("track_mview"), e15Var, str, 3)), ot0.F(this), new y71(this, 0));
        i71 i71Var2 = (i71) this.m.getValue();
        String str2 = this.k.a;
        i71Var2.getClass();
        str2.getClass();
        b71 b71Var2 = (b71) i71Var2.b.getValue();
        b71Var2.getClass();
        ox6.B(e15.b((e15) b71Var2.a.getValue(), str2, 4), ot0.F(this), new y71(this, 1));
        x97.y(ot0.F(this), null, null, new z71(this, null, 0), 3);
    }

    public static final ArrayList G(a81 a81Var, List list, List list2) {
        boolean z;
        List<e81> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((e81) it.next()) instanceof d81) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        d81 d81Var = new d81(K(list2), false);
        if (!z) {
            ArrayList y0 = CollectionsKt.y0(list);
            y0.add(d81Var);
            return y0;
        }
        ArrayList arrayList = new ArrayList();
        for (e81 e81Var : list3) {
            if (!(e81Var instanceof c81)) {
                if (!(e81Var instanceof d81)) {
                    b6e.s();
                    return null;
                }
                e81Var = d81Var;
            }
            arrayList.add(e81Var);
        }
        return arrayList;
    }

    public static ArrayList H(List list, Function1 function1, Function0 function0) {
        boolean z;
        c81 c81Var;
        List<e81> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((e81) it.next()) instanceof c81) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof c81) {
                arrayList.add(obj);
            }
        }
        c81 c81Var2 = (c81) CollectionsKt.firstOrNull(arrayList);
        if (c81Var2 == null || (c81Var = (c81) function1.invoke(c81Var2)) == null) {
            c81Var = (c81) function0.invoke();
        }
        if (!z) {
            ArrayList y0 = CollectionsKt.y0(list);
            y0.add(0, c81Var);
            return y0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (e81 e81Var : list2) {
            if (e81Var instanceof c81) {
                e81Var = c81Var;
            } else if (!(e81Var instanceof d81)) {
                b6e.s();
                return null;
            }
            if (e81Var != null) {
                arrayList2.add(e81Var);
            }
        }
        return arrayList2;
    }

    public static ArrayList J(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = ((dn6) obj).b.a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dn6 dn6Var = (dn6) CollectionsKt.firstOrNull((List) entry.getValue());
            String str2 = dn6Var != null ? dn6Var.b.a : null;
            if (((List) entry.getValue()).size() > 1) {
                su4.s(2, null, f1d.g("Repeated album ids found in Familiar: ", str2), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            dn6 dn6Var2 = (dn6) CollectionsKt.firstOrNull((List) ((Map.Entry) it.next()).getValue());
            if (dn6Var2 != null) {
                arrayList2.add(dn6Var2);
            }
        }
        return arrayList2;
    }

    public static ArrayList K(List list) {
        mqs mqsVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((io6) obj).b.a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            io6 io6Var = (io6) CollectionsKt.firstOrNull((List) entry.getValue());
            String str2 = (io6Var == null || (mqsVar = io6Var.b) == null) ? null : mqsVar.a;
            if (((List) entry.getValue()).size() > 1) {
                su4.s(2, null, f1d.g("Repeated track ids found in Familiar: ", str2), null);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            io6 io6Var2 = (io6) CollectionsKt.firstOrNull((List) ((Map.Entry) it.next()).getValue());
            if (io6Var2 != null) {
                arrayList.add(io6Var2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final v71 a(a81 a81Var, v71 v71Var, List list) {
        int ordinal = v71Var.c().a.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((e81) it.next()) instanceof c81) {
                        break;
                    }
                }
            }
            z = false;
            if (list.isEmpty()) {
                return z ? v71.a(v71Var, null, list, false, 5) : v71.a(v71Var, ((e81) CollectionsKt.Q(list)).a, list, false, 4);
            }
            b81 b81Var = b81.Collection;
            c5b c5bVar = c5b.a;
            return v71.a(v71Var, b81Var, t75.c(new c81(c5bVar, c5bVar, false)), false, 4);
        }
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((e81) it2.next()) instanceof c81) {
                    break;
                }
            }
        }
        z = false;
        if (list.isEmpty()) {
        }
    }
}
