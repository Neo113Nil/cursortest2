package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f2307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(u uVar, int i) {
        super(0);
        this.f2306b = i;
        this.f2307c = uVar;
    }

    @Override // C1.a
    public final Object c() {
        Object obj;
        switch (this.f2306b) {
            case 0:
                this.f2307c.b();
                break;
            case 1:
                u uVar = this.f2307c;
                u1.e eVar = uVar.f2321b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((AbstractC0116l) obj).f2301a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                uVar.f2322c = null;
                break;
            default:
                this.f2307c.b();
                break;
        }
        return t1.i.f4388c;
    }
}
