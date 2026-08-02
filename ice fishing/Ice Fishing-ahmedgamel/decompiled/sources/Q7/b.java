package Q7;

import D.x;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u7.C5081g;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public int f2702n = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f2703u;

    /* renamed from: v, reason: collision with root package name */
    public int f2704v;

    /* renamed from: w, reason: collision with root package name */
    public N7.c f2705w;

    /* renamed from: x, reason: collision with root package name */
    public int f2706x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f2707y;

    public b(c cVar) {
        this.f2707y = cVar;
        cVar.getClass();
        int length = cVar.f2708a.length();
        if (length < 0) {
            throw new IllegalArgumentException(x.j(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2703u = length;
        this.f2704v = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f2704v;
        if (i < 0) {
            this.f2702n = 0;
            this.f2705w = null;
            return;
        }
        c cVar = this.f2707y;
        int i4 = cVar.f2709b;
        if (i4 > 0) {
            int i6 = this.f2706x + 1;
            this.f2706x = i6;
        }
        if (i <= cVar.f2708a.length()) {
            C5081g c5081g = (C5081g) cVar.f2710c.invoke(cVar.f2708a, Integer.valueOf(this.f2704v));
            if (c5081g == null) {
                this.f2705w = new N7.c(this.f2703u, j.n0(cVar.f2708a), 1);
                this.f2704v = -1;
            } else {
                int intValue = ((Number) c5081g.f41052n).intValue();
                int intValue2 = ((Number) c5081g.f41053u).intValue();
                this.f2705w = S0.f.x(this.f2703u, intValue);
                int i9 = intValue + intValue2;
                this.f2703u = i9;
                this.f2704v = i9 + (intValue2 == 0 ? 1 : 0);
            }
            this.f2702n = 1;
        }
        this.f2705w = new N7.c(this.f2703u, j.n0(cVar.f2708a), 1);
        this.f2704v = -1;
        this.f2702n = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2702n == -1) {
            a();
        }
        return this.f2702n == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2702n == -1) {
            a();
        }
        if (this.f2702n == 0) {
            throw new NoSuchElementException();
        }
        N7.c cVar = this.f2705w;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2705w = null;
        this.f2702n = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
