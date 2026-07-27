package K0;

import J0.s;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1513a = s.f("Schedulers");

    public static void a(J0.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        S0.q t9 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList b9 = t9.b(bVar.f1291c);
            ArrayList a9 = t9.a();
            if (b9.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = b9.iterator();
                while (it.hasNext()) {
                    t9.i(((S0.p) it.next()).f2920a, currentTimeMillis);
                }
            }
            workDatabase.o();
            workDatabase.k();
            if (b9.size() > 0) {
                S0.p[] pVarArr = (S0.p[]) b9.toArray(new S0.p[b9.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar = (h) it2.next();
                    if (hVar.c()) {
                        hVar.a(pVarArr);
                    }
                }
            }
            if (a9.size() > 0) {
                S0.p[] pVarArr2 = (S0.p[]) a9.toArray(new S0.p[a9.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    h hVar2 = (h) it3.next();
                    if (!hVar2.c()) {
                        hVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
