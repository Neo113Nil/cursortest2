package b7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p6.C4840a;

/* loaded from: classes2.dex */
public final class i implements InterfaceC0527g {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5441n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f5442u = new AtomicBoolean(false);

    public i(ArrayList arrayList) {
        this.f5441n = arrayList;
    }

    @Override // b7.InterfaceC0527g
    public final Y6.c M() {
        ArrayList arrayList = this.f5441n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0527g) it.next()).M());
        }
        return Y6.c.d(arrayList2);
    }

    @Override // b7.InterfaceC0527g
    public final void Q(C4840a c4840a, p pVar) {
        Iterator it = this.f5441n.iterator();
        while (it.hasNext()) {
            ((InterfaceC0527g) it.next()).Q(c4840a, pVar);
        }
    }

    @Override // b7.InterfaceC0527g
    public final Y6.c shutdown() {
        if (this.f5442u.getAndSet(true)) {
            return Y6.c.f3975e;
        }
        ArrayList arrayList = this.f5441n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0527g) it.next()).shutdown());
        }
        return Y6.c.d(arrayList2);
    }
}
