package w7;

import O.I;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5157d extends I implements Iterator, J7.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f41670x;

    public C5157d(C5159f map, int i) {
        this.f41670x = i;
        kotlin.jvm.internal.h.e(map, "map");
        this.f2045w = map;
        this.f2043u = -1;
        this.f2044v = map.f41675A;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f41670x) {
            case 0:
                b();
                int i = this.f2042n;
                C5159f c5159f = (C5159f) this.f2045w;
                if (i >= c5159f.f41686y) {
                    throw new NoSuchElementException();
                }
                this.f2042n = i + 1;
                this.f2043u = i;
                C5158e c5158e = new C5158e(c5159f, i);
                e();
                return c5158e;
            case 1:
                b();
                int i6 = this.f2042n;
                C5159f c5159f2 = (C5159f) this.f2045w;
                if (i6 >= c5159f2.f41686y) {
                    throw new NoSuchElementException();
                }
                this.f2042n = i6 + 1;
                this.f2043u = i6;
                Object obj = c5159f2.f41681n[i6];
                e();
                return obj;
            default:
                b();
                int i9 = this.f2042n;
                C5159f c5159f3 = (C5159f) this.f2045w;
                if (i9 >= c5159f3.f41686y) {
                    throw new NoSuchElementException();
                }
                this.f2042n = i9 + 1;
                this.f2043u = i9;
                Object[] objArr = c5159f3.f41682u;
                kotlin.jvm.internal.h.b(objArr);
                Object obj2 = objArr[this.f2043u];
                e();
                return obj2;
        }
    }
}
