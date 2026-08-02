package T0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends Q2.r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3108v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K0.p f3109w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3110x;

    public /* synthetic */ b(K0.p pVar, Object obj, int i) {
        this.f3108v = i;
        this.f3109w = pVar;
        this.f3110x = obj;
    }

    @Override // Q2.r
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f3108v) {
            case 0:
                K0.p pVar = this.f3109w;
                workDatabase = pVar.f1643c;
                workDatabase.c();
                try {
                    Q2.r.a(pVar, ((UUID) this.f3110x).toString());
                    workDatabase.o();
                    workDatabase.k();
                    K0.i.a(pVar.f1642b, pVar.f1643c, pVar.f1645e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                K0.p pVar2 = this.f3109w;
                workDatabase = pVar2.f1643c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.t().f((String) this.f3110x).iterator();
                    while (it.hasNext()) {
                        Q2.r.a(pVar2, (String) it.next());
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
