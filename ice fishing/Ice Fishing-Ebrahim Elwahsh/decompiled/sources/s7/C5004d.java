package s7;

import O.I;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: s7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5004d extends I implements Iterator, F7.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f40502x;

    public C5004d(C5006f map, int i) {
        this.f40502x = i;
        kotlin.jvm.internal.h.e(map, "map");
        this.f2231w = map;
        this.f2229u = -1;
        this.f2230v = map.f40507A;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f40502x) {
            case 0:
                b();
                int i = this.f2228n;
                C5006f c5006f = (C5006f) this.f2231w;
                if (i >= c5006f.f40518y) {
                    throw new NoSuchElementException();
                }
                this.f2228n = i + 1;
                this.f2229u = i;
                C5005e c5005e = new C5005e(c5006f, i);
                e();
                return c5005e;
            case 1:
                b();
                int i4 = this.f2228n;
                C5006f c5006f2 = (C5006f) this.f2231w;
                if (i4 >= c5006f2.f40518y) {
                    throw new NoSuchElementException();
                }
                this.f2228n = i4 + 1;
                this.f2229u = i4;
                Object obj = c5006f2.f40513n[i4];
                e();
                return obj;
            default:
                b();
                int i9 = this.f2228n;
                C5006f c5006f3 = (C5006f) this.f2231w;
                if (i9 >= c5006f3.f40518y) {
                    throw new NoSuchElementException();
                }
                this.f2228n = i9 + 1;
                this.f2229u = i9;
                Object[] objArr = c5006f3.f40514u;
                kotlin.jvm.internal.h.b(objArr);
                Object obj2 = objArr[this.f2229u];
                e();
                return obj2;
        }
    }
}
