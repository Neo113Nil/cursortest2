package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k implements Iterable, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2620n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2621u;

    public /* synthetic */ k(int i, Object obj) {
        this.f2620n = i;
        this.f2621u = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2620n) {
            case 0:
                return new Q7.b((Q7.c) this.f2621u);
            default:
                Object[] array = (Object[]) ((c6.l) this.f2621u).f5610u;
                kotlin.jvm.internal.h.e(array, "array");
                return new b(new c8.g(array));
        }
    }
}
