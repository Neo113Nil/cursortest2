package androidx.activity;

import java.util.ListIterator;
import v7.C5127h;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4409n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4410u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(G g4, int i) {
        super(1);
        this.f4409n = i;
        this.f4410u = g4;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4409n) {
            case 0:
                C0450b backEvent = (C0450b) obj;
                kotlin.jvm.internal.h.e(backEvent, "backEvent");
                G g4 = this.f4410u;
                C5127h c5127h = g4.f4424b;
                ListIterator listIterator = c5127h.listIterator(c5127h.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.E) obj2).f4820a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                androidx.fragment.app.E e9 = (androidx.fragment.app.E) obj2;
                if (g4.f4425c != null) {
                    g4.b();
                }
                g4.f4425c = e9;
                break;
            default:
                C0450b backEvent2 = (C0450b) obj;
                kotlin.jvm.internal.h.e(backEvent2, "backEvent");
                G g9 = this.f4410u;
                if (g9.f4425c == null) {
                    C5127h c5127h2 = g9.f4424b;
                    ListIterator listIterator2 = c5127h2.listIterator(c5127h2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((androidx.fragment.app.E) obj3).f4820a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return u7.v.f41350a;
    }
}
