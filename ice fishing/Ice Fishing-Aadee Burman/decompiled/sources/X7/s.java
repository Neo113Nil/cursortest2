package X7;

import S7.AbstractC0383a;
import S7.AbstractC0406y;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public class s extends AbstractC0383a implements B7.d {

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5267d f3858w;

    public s(InterfaceC5267d interfaceC5267d, InterfaceC5272i interfaceC5272i) {
        super(interfaceC5272i, true);
        this.f3858w = interfaceC5267d;
    }

    @Override // S7.h0
    public final boolean H() {
        return true;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.f3858w;
        if (interfaceC5267d instanceof B7.d) {
            return (B7.d) interfaceC5267d;
        }
        return null;
    }

    @Override // S7.h0
    public void h(Object obj) {
        a.h(AbstractC0406y.q(obj), A8.b.l(this.f3858w));
    }

    @Override // S7.h0
    public void k(Object obj) {
        this.f3858w.resumeWith(AbstractC0406y.q(obj));
    }
}
