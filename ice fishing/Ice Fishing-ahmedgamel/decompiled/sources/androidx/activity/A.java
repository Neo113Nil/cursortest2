package androidx.activity;

import java.util.ListIterator;
import v7.C5117h;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4377n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4378u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(G g9, int i) {
        super(1);
        this.f4377n = i;
        this.f4378u = g9;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4377n) {
            case 0:
                C0454b backEvent = (C0454b) obj;
                kotlin.jvm.internal.h.e(backEvent, "backEvent");
                G g9 = this.f4378u;
                C5117h c5117h = g9.f4392b;
                ListIterator listIterator = c5117h.listIterator(c5117h.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.E) obj2).f4788a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                androidx.fragment.app.E e9 = (androidx.fragment.app.E) obj2;
                if (g9.f4393c != null) {
                    g9.b();
                }
                g9.f4393c = e9;
                break;
            default:
                C0454b backEvent2 = (C0454b) obj;
                kotlin.jvm.internal.h.e(backEvent2, "backEvent");
                G g10 = this.f4378u;
                if (g10.f4393c == null) {
                    C5117h c5117h2 = g10.f4392b;
                    ListIterator listIterator2 = c5117h2.listIterator(c5117h2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((androidx.fragment.app.E) obj3).f4788a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return u7.v.f41073a;
    }
}
