package p4;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x4.p;
import x4.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5477a = o4.o.f("Schedulers");

    public static void a(o4.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q t3 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList f10 = t3.f(bVar.f5192h);
            ArrayList e10 = t3.e();
            if (f10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = f10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = f10.get(i10);
                    i10++;
                    t3.l(currentTimeMillis, ((p) obj).f8322a);
                }
            }
            workDatabase.o();
            workDatabase.k();
            if (f10.size() > 0) {
                p[] pVarArr = (p[]) f10.toArray(new p[f10.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f()) {
                        gVar.a(pVarArr);
                    }
                }
            }
            if (e10.size() > 0) {
                p[] pVarArr2 = (p[]) e10.toArray(new p[e10.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    g gVar2 = (g) it2.next();
                    if (!gVar2.f()) {
                        gVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
