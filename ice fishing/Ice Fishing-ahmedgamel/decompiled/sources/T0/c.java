package T0;

import O2.AbstractRunnableC0368s;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends AbstractRunnableC0368s {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K0.p f3028v;

    public c(K0.p pVar) {
        this.f3028v = pVar;
    }

    @Override // O2.AbstractRunnableC0368s
    public final void b() {
        K0.p pVar = this.f3028v;
        WorkDatabase workDatabase = pVar.f1534c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().g().iterator();
            while (it.hasNext()) {
                AbstractRunnableC0368s.a(pVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            K0.i.a(pVar.f1533b, pVar.f1534c, pVar.f1536e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
