package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k implements Iterable, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2455n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2456u;

    public /* synthetic */ k(int i, Object obj) {
        this.f2455n = i;
        this.f2456u = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2455n) {
            case 0:
                return new Q7.b((Q7.c) this.f2456u);
            default:
                Object[] array = (Object[]) ((c6.l) this.f2456u).f5786u;
                kotlin.jvm.internal.h.e(array, "array");
                return new b(new c8.g(array));
        }
    }
}
