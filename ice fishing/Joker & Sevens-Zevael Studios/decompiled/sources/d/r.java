package d;

import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f1535h;

    public /* synthetic */ r(y yVar, int i10) {
        this.f1534g = i10;
        this.f1535h = yVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        c cVar = (c) obj;
        switch (this.f1534g) {
            case 0:
                pc.j.e(cVar, "backEvent");
                y yVar = this.f1535h;
                bc.k kVar = yVar.f1551b;
                ListIterator listIterator = kVar.listIterator(kVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((q) obj2).f1531a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                q qVar = (q) obj2;
                if (yVar.f1552c != null) {
                    yVar.a();
                }
                yVar.f1552c = qVar;
                break;
            default:
                pc.j.e(cVar, "backEvent");
                y yVar2 = this.f1535h;
                if (yVar2.f1552c == null) {
                    bc.k kVar2 = yVar2.f1551b;
                    ListIterator listIterator2 = kVar2.listIterator(kVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((q) obj3).f1531a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return ac.o.f277a;
    }
}
