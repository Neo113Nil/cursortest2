package defpackage;

import com.yx360.design.compose.atoms.utils.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class ycb1 {
    public static final qxi a(zx40 zx40Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1857224154);
        ldf ldfVar = jsm.b;
        qxi a = a.a(zx40Var, new ck11(70, 0, ldfVar), new ck11(250, 0, ldfVar), 0.95f, 70, btsVar, 28086);
        btsVar.t(false);
        return a;
    }

    public static final f530 b(f530 f530Var, boolean z, String str) {
        f530 f530Var2 = c530.a;
        if (z && str != null) {
            f530Var2 = fnq0.a(f530Var2, new h0(str, 23));
        }
        return f530Var.k(f530Var2);
    }

    public static final Object c(x910 x910Var) {
        Object a = x910Var.a();
        k0y k0yVar = a instanceof k0y ? (k0y) a : null;
        if (k0yVar != null) {
            return k0yVar.a;
        }
        return null;
    }

    public static final int d(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static boolean e(ArrayList arrayList) {
        if (arrayList.size() == 12) {
            List list = des0.g;
            Iterator it = arrayList.iterator();
            Iterator it2 = list.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(tcc.n(arrayList, 10), tcc.n(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it.next()).intValue() * ((Number) it2.next()).intValue()));
            }
            int z0 = (kotlin.collections.a.z0(arrayList2) % 11) % 10;
            List list2 = des0.h;
            Iterator it3 = arrayList.iterator();
            Iterator it4 = list2.iterator();
            ArrayList arrayList3 = new ArrayList(Math.min(tcc.n(arrayList, 10), tcc.n(list2, 10)));
            while (it3.hasNext() && it4.hasNext()) {
                arrayList3.add(Integer.valueOf(((Number) it3.next()).intValue() * ((Number) it4.next()).intValue()));
            }
            int z02 = (kotlin.collections.a.z0(arrayList3) % 11) % 10;
            if (z0 == ((Number) arrayList.get(scc.f(arrayList) - 1)).intValue() && z02 == ((Number) kotlin.collections.a.Z(arrayList)).intValue()) {
                List subList = arrayList.subList(0, 2);
                if (!(subList instanceof Collection) || !subList.isEmpty()) {
                    Iterator it5 = subList.iterator();
                    while (it5.hasNext()) {
                        if (((Number) it5.next()).intValue() != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
