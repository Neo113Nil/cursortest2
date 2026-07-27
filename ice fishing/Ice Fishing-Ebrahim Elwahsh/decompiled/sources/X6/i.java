package X6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.C4694a;

/* loaded from: classes2.dex */
public final class i implements g {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3856n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f3857u = new AtomicBoolean(false);

    public i(ArrayList arrayList) {
        this.f3856n = arrayList;
    }

    @Override // X6.g
    public final U6.c M() {
        ArrayList arrayList = this.f3856n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g) it.next()).M());
        }
        return U6.c.d(arrayList2);
    }

    @Override // X6.g
    public final void T(C4694a c4694a, o oVar) {
        Iterator it = this.f3856n.iterator();
        while (it.hasNext()) {
            ((g) it.next()).T(c4694a, oVar);
        }
    }

    @Override // X6.g
    public final U6.c shutdown() {
        if (this.f3857u.getAndSet(true)) {
            return U6.c.f3310e;
        }
        ArrayList arrayList = this.f3856n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g) it.next()).shutdown());
        }
        return U6.c.d(arrayList2);
    }
}
