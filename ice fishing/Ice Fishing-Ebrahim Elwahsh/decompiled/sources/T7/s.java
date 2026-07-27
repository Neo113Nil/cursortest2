package T7;

import O7.AbstractC0376a;
import O7.AbstractC0399y;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public class s extends AbstractC0376a implements x7.d {

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5133d f3164w;

    public s(InterfaceC5133d interfaceC5133d, InterfaceC5138i interfaceC5138i) {
        super(interfaceC5138i, true);
        this.f3164w = interfaceC5133d;
    }

    @Override // O7.h0
    public final boolean H() {
        return true;
    }

    @Override // x7.d
    public final x7.d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.f3164w;
        if (interfaceC5133d instanceof x7.d) {
            return (x7.d) interfaceC5133d;
        }
        return null;
    }

    @Override // O7.h0
    public void k(Object obj) {
        a.h(AbstractC0399y.q(obj), w8.a.f(this.f3164w));
    }

    @Override // O7.h0
    public void l(Object obj) {
        this.f3164w.resumeWith(AbstractC0399y.q(obj));
    }
}
