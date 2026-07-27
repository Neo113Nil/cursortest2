package androidx.activity;

import java.util.ListIterator;
import r7.C4977h;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.i implements E7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4524n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4525u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(G g9, int i) {
        super(1);
        this.f4524n = i;
        this.f4525u = g9;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4524n) {
            case 0:
                C0460b backEvent = (C0460b) obj;
                kotlin.jvm.internal.h.e(backEvent, "backEvent");
                G g9 = this.f4525u;
                C4977h c4977h = g9.f4539b;
                ListIterator listIterator = c4977h.listIterator(c4977h.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.E) obj2).f4932a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                androidx.fragment.app.E e6 = (androidx.fragment.app.E) obj2;
                if (g9.f4540c != null) {
                    g9.b();
                }
                g9.f4540c = e6;
                break;
            default:
                C0460b backEvent2 = (C0460b) obj;
                kotlin.jvm.internal.h.e(backEvent2, "backEvent");
                G g10 = this.f4525u;
                if (g10.f4540c == null) {
                    C4977h c4977h2 = g10.f4539b;
                    ListIterator listIterator2 = c4977h2.listIterator(c4977h2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((androidx.fragment.app.E) obj3).f4932a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return q7.v.f40183a;
    }
}
