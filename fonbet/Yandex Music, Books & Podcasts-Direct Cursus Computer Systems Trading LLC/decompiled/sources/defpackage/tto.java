package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class tto {
    public static final String a = jsg.n("Schedulers");

    public static void a(x4w x4wVar, z7l z7lVar, List list) {
        if (list.size() > 0) {
            z7lVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x4wVar.g(currentTimeMillis, ((t4w) it.next()).a);
            }
        }
    }

    public static void b(r46 r46Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        x4w A = workDatabase.A();
        workDatabase.b();
        try {
            ueo ueoVar = A.a;
            ueo ueoVar2 = A.a;
            List list2 = (List) up6.F(ueoVar, true, false, new jwv(23));
            a(A, r46Var.d, list2);
            List list3 = (List) up6.F(ueoVar2, true, false, new cv0(r46Var.k, 9));
            a(A, r46Var.d, list3);
            list3.addAll(list2);
            List list4 = (List) up6.F(ueoVar2, true, false, new jwv(26));
            workDatabase.t();
            workDatabase.g();
            if (list3.size() > 0) {
                t4w[] t4wVarArr = (t4w[]) list3.toArray(new t4w[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kto ktoVar = (kto) it.next();
                    if (ktoVar.e()) {
                        ktoVar.c(t4wVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                t4w[] t4wVarArr2 = (t4w[]) list4.toArray(new t4w[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    kto ktoVar2 = (kto) it2.next();
                    if (!ktoVar2.e()) {
                        ktoVar2.c(t4wVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
