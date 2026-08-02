package q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4883c implements InterfaceC4889i {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40067n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f40068u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f40069v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f40070w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f40071x = new AtomicBoolean(false);

    public C4883c(ArrayList arrayList) {
        this.f40070w = arrayList;
        this.f40067n = new ArrayList(arrayList.size());
        this.f40069v = new ArrayList(arrayList.size());
        this.f40068u = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4889i interfaceC4889i = (InterfaceC4889i) it.next();
            if (interfaceC4889i.N()) {
                this.f40067n.add(interfaceC4889i);
            }
            if (interfaceC4889i instanceof C4883c) {
                C4883c c4883c = (C4883c) interfaceC4889i;
                if (!c4883c.f40068u.isEmpty()) {
                    this.f40068u.add(c4883c);
                }
            }
            if (interfaceC4889i.U()) {
                this.f40069v.add(interfaceC4889i);
            }
        }
    }

    @Override // q7.InterfaceC4889i
    public final Y6.c M() {
        ArrayList arrayList = this.f40070w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4889i) it.next()).M());
        }
        return Y6.c.d(arrayList2);
    }

    @Override // q7.InterfaceC4889i
    public final boolean N() {
        return !this.f40067n.isEmpty();
    }

    @Override // q7.InterfaceC4889i
    public final boolean U() {
        return !this.f40069v.isEmpty();
    }

    @Override // q7.InterfaceC4889i
    public final Y6.c shutdown() {
        if (this.f40071x.getAndSet(true)) {
            return Y6.c.f3919e;
        }
        ArrayList arrayList = this.f40070w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4889i) it.next()).shutdown());
        }
        return Y6.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f40067n + ", spanProcessorsEnding=" + this.f40068u + ", spanProcessorsEnd=" + this.f40069v + ", spanProcessorsAll=" + this.f40070w + '}';
    }
}
