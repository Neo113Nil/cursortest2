package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class bb2 {
    public final ac0 a;
    public final jyr b = btf.b(new ri1(21, this));

    public bb2(pa2 pa2Var, ac0 ac0Var) {
        this.a = ac0Var;
    }

    public static ArrayList b(a82... a82VarArr) {
        ArrayList arrayList = new ArrayList(a82VarArr.length);
        for (a82 a82Var : a82VarArr) {
            arrayList.add(new n11(a82Var));
        }
        return arrayList;
    }

    public static cb2 c(String str) {
        str.getClass();
        bd0[] bd0VarArr = bd0.a;
        return new cb2(t75.c(new r0s("OFFLINE_TAB", str, null, c5b.a, b(b72.h, b72.f, b72.g, b72.e, b72.d, b72.c, b72.b))), Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        ab2 ab2Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof ab2) {
            ab2Var = (ab2) cg6Var;
            int i2 = ab2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ab2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ab2Var.k;
                nm6 nm6Var = nm6.a;
                i = ab2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cjf cjfVar = (cjf) this.b.getValue();
                    ab2Var.j = str;
                    ab2Var.m = 1;
                    obj = cjfVar.b(true, ab2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ab2Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return c(str);
                    }
                    b6e.s();
                    return null;
                }
                List list = ((snq) ((qj6) rj6Var).a).c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof m2s) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((m2s) it.next()).c);
                }
                ArrayList p = v75.p(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = p.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof r0s) {
                        arrayList3.add(next);
                    }
                }
                return new cb2(arrayList3, Boolean.TRUE);
            }
        }
        ab2Var = new ab2(this, cg6Var);
        Object obj3 = ab2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ab2Var.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }
}
