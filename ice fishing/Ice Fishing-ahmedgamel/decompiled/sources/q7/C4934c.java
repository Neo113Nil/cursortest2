package q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4934c implements InterfaceC4940i {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40256n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f40257u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f40258v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f40259w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f40260x = new AtomicBoolean(false);

    public C4934c(ArrayList arrayList) {
        this.f40259w = arrayList;
        this.f40256n = new ArrayList(arrayList.size());
        this.f40258v = new ArrayList(arrayList.size());
        this.f40257u = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4940i interfaceC4940i = (InterfaceC4940i) it.next();
            if (interfaceC4940i.N()) {
                this.f40256n.add(interfaceC4940i);
            }
            if (interfaceC4940i instanceof C4934c) {
                C4934c c4934c = (C4934c) interfaceC4940i;
                if (!c4934c.f40257u.isEmpty()) {
                    this.f40257u.add(c4934c);
                }
            }
            if (interfaceC4940i.U()) {
                this.f40258v.add(interfaceC4940i);
            }
        }
    }

    @Override // q7.InterfaceC4940i
    public final Y6.c M() {
        ArrayList arrayList = this.f40259w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4940i) it.next()).M());
        }
        return Y6.c.d(arrayList2);
    }

    @Override // q7.InterfaceC4940i
    public final boolean N() {
        return !this.f40256n.isEmpty();
    }

    @Override // q7.InterfaceC4940i
    public final boolean U() {
        return !this.f40258v.isEmpty();
    }

    @Override // q7.InterfaceC4940i
    public final Y6.c shutdown() {
        if (this.f40260x.getAndSet(true)) {
            return Y6.c.f3975e;
        }
        ArrayList arrayList = this.f40259w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4940i) it.next()).shutdown());
        }
        return Y6.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f40256n + ", spanProcessorsEnding=" + this.f40257u + ", spanProcessorsEnd=" + this.f40258v + ", spanProcessorsAll=" + this.f40259w + '}';
    }
}
