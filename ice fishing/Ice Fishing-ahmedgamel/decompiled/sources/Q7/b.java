package Q7;

import D.y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u7.C5089g;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public int f2665n = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f2666u;

    /* renamed from: v, reason: collision with root package name */
    public int f2667v;

    /* renamed from: w, reason: collision with root package name */
    public N7.c f2668w;

    /* renamed from: x, reason: collision with root package name */
    public int f2669x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f2670y;

    public b(c cVar) {
        this.f2670y = cVar;
        cVar.getClass();
        int length = cVar.f2671a.length();
        if (length < 0) {
            throw new IllegalArgumentException(y.k(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2666u = length;
        this.f2667v = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f2667v;
        if (i < 0) {
            this.f2665n = 0;
            this.f2668w = null;
            return;
        }
        c cVar = this.f2670y;
        int i6 = cVar.f2672b;
        if (i6 > 0) {
            int i9 = this.f2669x + 1;
            this.f2669x = i9;
        }
        if (i <= cVar.f2671a.length()) {
            C5089g c5089g = (C5089g) cVar.f2673c.invoke(cVar.f2671a, Integer.valueOf(this.f2667v));
            if (c5089g == null) {
                this.f2668w = new N7.c(this.f2666u, j.X(cVar.f2671a), 1);
                this.f2667v = -1;
            } else {
                int intValue = ((Number) c5089g.f41332n).intValue();
                int intValue2 = ((Number) c5089g.f41333u).intValue();
                this.f2668w = V2.a.x(this.f2666u, intValue);
                int i10 = intValue + intValue2;
                this.f2666u = i10;
                this.f2667v = i10 + (intValue2 == 0 ? 1 : 0);
            }
            this.f2665n = 1;
        }
        this.f2668w = new N7.c(this.f2666u, j.X(cVar.f2671a), 1);
        this.f2667v = -1;
        this.f2665n = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2665n == -1) {
            a();
        }
        return this.f2665n == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2665n == -1) {
            a();
        }
        if (this.f2665n == 0) {
            throw new NoSuchElementException();
        }
        N7.c cVar = this.f2668w;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2668w = null;
        this.f2665n = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
