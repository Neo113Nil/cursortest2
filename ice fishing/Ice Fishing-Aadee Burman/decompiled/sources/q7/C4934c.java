package q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4934c implements InterfaceC4940i {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40253n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f40254u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f40255v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f40256w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f40257x = new AtomicBoolean(false);

    public C4934c(ArrayList arrayList) {
        this.f40256w = arrayList;
        this.f40253n = new ArrayList(arrayList.size());
        this.f40255v = new ArrayList(arrayList.size());
        this.f40254u = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4940i interfaceC4940i = (InterfaceC4940i) it.next();
            if (interfaceC4940i.N()) {
                this.f40253n.add(interfaceC4940i);
            }
            if (interfaceC4940i instanceof C4934c) {
                C4934c c4934c = (C4934c) interfaceC4940i;
                if (!c4934c.f40254u.isEmpty()) {
                    this.f40254u.add(c4934c);
                }
            }
            if (interfaceC4940i.U()) {
                this.f40255v.add(interfaceC4940i);
            }
        }
    }

    @Override // q7.InterfaceC4940i
    public final Y6.c M() {
        ArrayList arrayList = this.f40256w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4940i) it.next()).M());
        }
        return Y6.c.d(arrayList2);
    }

    @Override // q7.InterfaceC4940i
    public final boolean N() {
        return !this.f40253n.isEmpty();
    }

    @Override // q7.InterfaceC4940i
    public final boolean U() {
        return !this.f40255v.isEmpty();
    }

    @Override // q7.InterfaceC4940i
    public final Y6.c shutdown() {
        if (this.f40257x.getAndSet(true)) {
            return Y6.c.f3975e;
        }
        ArrayList arrayList = this.f40256w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4940i) it.next()).shutdown());
        }
        return Y6.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f40253n + ", spanProcessorsEnding=" + this.f40254u + ", spanProcessorsEnd=" + this.f40255v + ", spanProcessorsAll=" + this.f40256w + '}';
    }
}
