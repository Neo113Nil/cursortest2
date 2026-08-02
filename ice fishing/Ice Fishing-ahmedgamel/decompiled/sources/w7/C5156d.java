package w7;

import O.I;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5156d extends I implements Iterator, J7.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f41727x;

    public C5156d(C5158f map, int i) {
        this.f41727x = i;
        kotlin.jvm.internal.h.e(map, "map");
        this.f2133w = map;
        this.f2131u = -1;
        this.f2132v = map.f41732A;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f41727x) {
            case 0:
                b();
                int i = this.f2130n;
                C5158f c5158f = (C5158f) this.f2133w;
                if (i >= c5158f.f41743y) {
                    throw new NoSuchElementException();
                }
                this.f2130n = i + 1;
                this.f2131u = i;
                C5157e c5157e = new C5157e(c5158f, i);
                e();
                return c5157e;
            case 1:
                b();
                int i4 = this.f2130n;
                C5158f c5158f2 = (C5158f) this.f2133w;
                if (i4 >= c5158f2.f41743y) {
                    throw new NoSuchElementException();
                }
                this.f2130n = i4 + 1;
                this.f2131u = i4;
                Object obj = c5158f2.f41738n[i4];
                e();
                return obj;
            default:
                b();
                int i6 = this.f2130n;
                C5158f c5158f3 = (C5158f) this.f2133w;
                if (i6 >= c5158f3.f41743y) {
                    throw new NoSuchElementException();
                }
                this.f2130n = i6 + 1;
                this.f2131u = i6;
                Object[] objArr = c5158f3.f41739u;
                kotlin.jvm.internal.h.b(objArr);
                Object obj2 = objArr[this.f2131u];
                e();
                return obj2;
        }
    }
}
