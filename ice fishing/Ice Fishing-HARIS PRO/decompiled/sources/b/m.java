package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f2305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(u uVar, int i) {
        super(1);
        this.f2304b = i;
        this.f2305c = uVar;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f2304b) {
            case 0:
                D1.i.e((C0106b) obj, "backEvent");
                u uVar = this.f2305c;
                u1.e eVar = uVar.f2321b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC0116l) obj2).f2301a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                uVar.f2322c = (AbstractC0116l) obj2;
                break;
            default:
                D1.i.e((C0106b) obj, "backEvent");
                u1.e eVar2 = this.f2305c.f2321b;
                ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((AbstractC0116l) obj3).f2301a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                break;
        }
        return t1.i.f4388c;
    }
}
