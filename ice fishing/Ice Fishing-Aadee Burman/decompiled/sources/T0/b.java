package T0;

import O2.AbstractRunnableC0368s;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends AbstractRunnableC0368s {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3025v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K0.p f3026w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3027x;

    public /* synthetic */ b(K0.p pVar, Object obj, int i) {
        this.f3025v = i;
        this.f3026w = pVar;
        this.f3027x = obj;
    }

    @Override // O2.AbstractRunnableC0368s
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f3025v) {
            case 0:
                K0.p pVar = this.f3026w;
                workDatabase = pVar.f1534c;
                workDatabase.c();
                try {
                    AbstractRunnableC0368s.a(pVar, ((UUID) this.f3027x).toString());
                    workDatabase.o();
                    workDatabase.k();
                    K0.i.a(pVar.f1533b, pVar.f1534c, pVar.f1536e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                K0.p pVar2 = this.f3026w;
                workDatabase = pVar2.f1534c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.t().f((String) this.f3027x).iterator();
                    while (it.hasNext()) {
                        AbstractRunnableC0368s.a(pVar2, (String) it.next());
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
