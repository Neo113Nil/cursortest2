package M7;

import D.y;
import a.AbstractC0415a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q7.C4938g;

/* loaded from: classes2.dex */
public final class b implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public int f1917n = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f1918u;

    /* renamed from: v, reason: collision with root package name */
    public int f1919v;

    /* renamed from: w, reason: collision with root package name */
    public J7.c f1920w;

    /* renamed from: x, reason: collision with root package name */
    public int f1921x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f1922y;

    public b(c cVar) {
        this.f1922y = cVar;
        cVar.getClass();
        int length = cVar.f1923a.length();
        if (length < 0) {
            throw new IllegalArgumentException(y.i(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f1918u = length;
        this.f1919v = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f1919v;
        if (i < 0) {
            this.f1917n = 0;
            this.f1920w = null;
            return;
        }
        c cVar = this.f1922y;
        int i4 = cVar.f1924b;
        if (i4 > 0) {
            int i9 = this.f1921x + 1;
            this.f1921x = i9;
        }
        if (i <= cVar.f1923a.length()) {
            C4938g c4938g = (C4938g) cVar.f1925c.invoke(cVar.f1923a, Integer.valueOf(this.f1919v));
            if (c4938g == null) {
                this.f1920w = new J7.c(this.f1918u, j.O(cVar.f1923a), 1);
                this.f1919v = -1;
            } else {
                int intValue = ((Number) c4938g.f40162n).intValue();
                int intValue2 = ((Number) c4938g.f40163u).intValue();
                this.f1920w = AbstractC0415a.E(this.f1918u, intValue);
                int i10 = intValue + intValue2;
                this.f1918u = i10;
                this.f1919v = i10 + (intValue2 == 0 ? 1 : 0);
            }
            this.f1917n = 1;
        }
        this.f1920w = new J7.c(this.f1918u, j.O(cVar.f1923a), 1);
        this.f1919v = -1;
        this.f1917n = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1917n == -1) {
            a();
        }
        return this.f1917n == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1917n == -1) {
            a();
        }
        if (this.f1917n == 0) {
            throw new NoSuchElementException();
        }
        J7.c cVar = this.f1920w;
        kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f1920w = null;
        this.f1917n = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
