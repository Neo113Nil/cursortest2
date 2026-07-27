package x;

import java.util.Iterator;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5169g extends C5168f {

    /* renamed from: m, reason: collision with root package name */
    public int f41725m;

    public C5169g(AbstractC5178p abstractC5178p) {
        super(abstractC5178p);
        if (abstractC5178p instanceof C5173k) {
            this.f41718e = 2;
        } else {
            this.f41718e = 3;
        }
    }

    @Override // x.C5168f
    public final void d(int i) {
        if (this.f41722j) {
            return;
        }
        this.f41722j = true;
        this.f41720g = i;
        Iterator it = this.f41723k.iterator();
        while (it.hasNext()) {
            InterfaceC5166d interfaceC5166d = (InterfaceC5166d) it.next();
            interfaceC5166d.a(interfaceC5166d);
        }
    }
}
