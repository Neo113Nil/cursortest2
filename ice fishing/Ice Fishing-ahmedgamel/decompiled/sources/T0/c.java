package T0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends Q2.r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K0.p f3111v;

    public c(K0.p pVar) {
        this.f3111v = pVar;
    }

    @Override // Q2.r
    public final void b() {
        K0.p pVar = this.f3111v;
        WorkDatabase workDatabase = pVar.f1643c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().g().iterator();
            while (it.hasNext()) {
                Q2.r.a(pVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            K0.i.a(pVar.f1642b, pVar.f1643c, pVar.f1645e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
