package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class y46 {
    public final e56 a;

    public y46(e56 e56Var) {
        this.a = e56Var;
    }

    public static boolean a(pv0 pv0Var) {
        k56 k56Var = pv0Var.b;
        String str = k56Var.d;
        List list = k56Var.a;
        if (str == null || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(((v46) it.next()).getE())) {
                return true;
            }
        }
        return false;
    }

    public final x46 b(pv0 pv0Var, boolean z) {
        x46 x46Var = new x46();
        k56 k56Var = pv0Var.b;
        List<v46> list = k56Var.a;
        if (list != null && !list.isEmpty()) {
            String str = k56Var.d;
            ArrayList arrayList = new ArrayList();
            for (v46 v46Var : list) {
                if (z) {
                    if (a.G(this.a.a, v46Var.getE())) {
                    }
                }
                arrayList.addAll(g9b1.a(v46Var));
                if (jl40.l(v46Var.getE(), str)) {
                    pg70 b = v46Var.getB();
                    int[] d = b != null ? b.getD() : null;
                    if (b == null || d == null || d.length < 2) {
                        x46Var.c();
                    } else {
                        x46Var.e(d[0], d[1]);
                    }
                    x46Var.a();
                }
            }
            if (!x46Var.b()) {
                x46Var.c();
            }
            x46Var.d(a.J0(arrayList));
        }
        return x46Var;
    }
}
