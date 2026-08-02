package P7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public Object f2450n;

    /* renamed from: u, reason: collision with root package name */
    public int f2451u = -2;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f2452v;

    public f(g gVar) {
        this.f2452v = gVar;
    }

    public final void a() {
        Object invoke;
        int i = this.f2451u;
        g gVar = this.f2452v;
        if (i == -2) {
            gVar.getClass();
            invoke = Integer.valueOf(L7.e.f1789n.a() + com.anythink.basead.exoplayer.b.aX);
        } else {
            j jVar = (j) gVar.f2454b;
            Object obj = this.f2450n;
            kotlin.jvm.internal.h.b(obj);
            invoke = jVar.invoke(obj);
        }
        this.f2450n = invoke;
        this.f2451u = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2451u < 0) {
            a();
        }
        return this.f2451u == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2451u < 0) {
            a();
        }
        if (this.f2451u == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2450n;
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2451u = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
