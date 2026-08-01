package K1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f393a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f394b;

    /* renamed from: c, reason: collision with root package name */
    public int f395c;

    /* renamed from: d, reason: collision with root package name */
    public H1.c f396d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f397f;

    public a(b bVar) {
        this.f397f = bVar;
        int i = bVar.f399b;
        int length = bVar.f398a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f394b = i;
        this.f395c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r7 < r4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        H1.c cVar;
        int i = this.f395c;
        if (i < 0) {
            this.f393a = 0;
            this.f396d = null;
            return;
        }
        b bVar = this.f397f;
        int i2 = bVar.f400c;
        String str = bVar.f398a;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
        }
        if (i <= str.length()) {
            t1.d dVar = (t1.d) bVar.f401d.d(str, Integer.valueOf(this.f395c));
            if (dVar == null) {
                this.f396d = new H1.c(this.f394b, d.h0(str), 1);
                this.f395c = -1;
            } else {
                int intValue = ((Number) dVar.f4378a).intValue();
                int intValue2 = ((Number) dVar.f4379b).intValue();
                int i4 = this.f394b;
                if (intValue <= Integer.MIN_VALUE) {
                    H1.c cVar2 = H1.c.f349d;
                    cVar = H1.c.f349d;
                } else {
                    cVar = new H1.c(i4, intValue - 1, 1);
                }
                this.f396d = cVar;
                int i5 = intValue + intValue2;
                this.f394b = i5;
                this.f395c = i5 + (intValue2 == 0 ? 1 : 0);
            }
            this.f393a = 1;
        }
        this.f396d = new H1.c(this.f394b, d.h0(str), 1);
        this.f395c = -1;
        this.f393a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f393a == -1) {
            a();
        }
        return this.f393a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f393a == -1) {
            a();
        }
        if (this.f393a == 0) {
            throw new NoSuchElementException();
        }
        H1.c cVar = this.f396d;
        D1.i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f396d = null;
        this.f393a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
