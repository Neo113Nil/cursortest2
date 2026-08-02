package b7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p6.C4840a;

/* loaded from: classes2.dex */
public final class i implements InterfaceC0535g {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5591n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f5592u = new AtomicBoolean(false);

    public i(ArrayList arrayList) {
        this.f5591n = arrayList;
    }

    @Override // b7.InterfaceC0535g
    public final Y6.c M() {
        ArrayList arrayList = this.f5591n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0535g) it.next()).M());
        }
        return Y6.c.d(arrayList2);
    }

    @Override // b7.InterfaceC0535g
    public final void Q(C4840a c4840a, o oVar) {
        Iterator it = this.f5591n.iterator();
        while (it.hasNext()) {
            ((InterfaceC0535g) it.next()).Q(c4840a, oVar);
        }
    }

    @Override // b7.InterfaceC0535g
    public final Y6.c shutdown() {
        if (this.f5592u.getAndSet(true)) {
            return Y6.c.f3919e;
        }
        ArrayList arrayList = this.f5591n;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0535g) it.next()).shutdown());
        }
        return Y6.c.d(arrayList2);
    }
}
