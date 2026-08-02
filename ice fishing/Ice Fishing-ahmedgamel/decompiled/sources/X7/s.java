package X7;

import S7.AbstractC0387a;
import S7.AbstractC0410y;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public class s extends AbstractC0387a implements B7.d {

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5240d f3813w;

    public s(InterfaceC5240d interfaceC5240d, InterfaceC5245i interfaceC5245i) {
        super(interfaceC5245i, true);
        this.f3813w = interfaceC5240d;
    }

    @Override // S7.h0
    public final boolean H() {
        return true;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.f3813w;
        if (interfaceC5240d instanceof B7.d) {
            return (B7.d) interfaceC5240d;
        }
        return null;
    }

    @Override // S7.h0
    public void h(Object obj) {
        a.h(AbstractC0410y.q(obj), A8.b.n(this.f3813w));
    }

    @Override // S7.h0
    public void k(Object obj) {
        this.f3813w.resumeWith(AbstractC0410y.q(obj));
    }
}
