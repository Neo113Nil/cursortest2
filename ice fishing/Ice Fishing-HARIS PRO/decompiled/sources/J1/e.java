package J1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f362a;

    /* renamed from: b, reason: collision with root package name */
    public int f363b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f364c;

    public e(l lVar) {
        this.f364c = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C1.l, D1.j] */
    public final void a() {
        Object g2;
        int i = this.f363b;
        l lVar = this.f364c;
        if (i == -2) {
            g2 = ((j) lVar.f373b).f370c;
        } else {
            ?? r02 = lVar.f374c;
            Object obj = this.f362a;
            D1.i.b(obj);
            g2 = r02.g(obj);
        }
        this.f362a = g2;
        this.f363b = g2 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f363b < 0) {
            a();
        }
        return this.f363b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f363b < 0) {
            a();
        }
        if (this.f363b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f362a;
        D1.i.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f363b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
