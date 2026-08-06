package z1;

import h1.C0234d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u0.AbstractC1050a;
import w1.C1062c;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f8621a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f8622b;

    /* renamed from: c, reason: collision with root package name */
    public int f8623c;

    /* renamed from: d, reason: collision with root package name */
    public C1062c f8624d;

    /* renamed from: e, reason: collision with root package name */
    public int f8625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f8626f;

    public b(c cVar) {
        this.f8626f = cVar;
        int i2 = cVar.f8628b;
        int length = cVar.f8627a.length();
        if (length < 0) {
            throw new IllegalArgumentException(C1.a.g(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f8622b = i2;
        this.f8623c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i2 = this.f8623c;
        if (i2 < 0) {
            this.f8621a = 0;
            this.f8624d = null;
            return;
        }
        c cVar = this.f8626f;
        int i3 = cVar.f8629c;
        String str = cVar.f8627a;
        if (i3 > 0) {
            int i4 = this.f8625e + 1;
            this.f8625e = i4;
        }
        if (i2 <= str.length()) {
            C0234d c0234d = (C0234d) cVar.f8630d.invoke(str, Integer.valueOf(this.f8623c));
            if (c0234d == null) {
                this.f8624d = new C1062c(this.f8622b, g.V(str), 1);
                this.f8623c = -1;
            } else {
                int intValue = ((Number) c0234d.f3386a).intValue();
                int intValue2 = ((Number) c0234d.f3387b).intValue();
                this.f8624d = AbstractC1050a.E(this.f8622b, intValue);
                int i5 = intValue + intValue2;
                this.f8622b = i5;
                this.f8623c = i5 + (intValue2 == 0 ? 1 : 0);
            }
            this.f8621a = 1;
        }
        this.f8624d = new C1062c(this.f8622b, g.V(str), 1);
        this.f8623c = -1;
        this.f8621a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8621a == -1) {
            a();
        }
        return this.f8621a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8621a == -1) {
            a();
        }
        if (this.f8621a == 0) {
            throw new NoSuchElementException();
        }
        C1062c c1062c = this.f8624d;
        kotlin.jvm.internal.i.c(c1062c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8624d = null;
        this.f8621a = -1;
        return c1062c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
