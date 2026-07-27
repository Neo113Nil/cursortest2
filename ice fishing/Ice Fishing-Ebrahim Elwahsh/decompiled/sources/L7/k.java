package L7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k implements Iterable, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1808n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1809u;

    public /* synthetic */ k(int i, Object obj) {
        this.f1808n = i;
        this.f1809u = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1808n) {
            case 0:
                return new M7.b((M7.c) this.f1809u);
            default:
                Object[] array = (Object[]) ((Y5.l) this.f1809u).f4015u;
                kotlin.jvm.internal.h.e(array, "array");
                return new b(new Y7.g(array));
        }
    }
}
