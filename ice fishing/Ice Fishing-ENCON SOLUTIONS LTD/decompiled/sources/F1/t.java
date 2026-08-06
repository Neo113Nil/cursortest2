package F1;

import A1.AbstractC0000a;
import A1.AbstractC0022x;
import n1.InterfaceC0992c;

/* loaded from: classes.dex */
public class t extends AbstractC0000a implements InterfaceC0992c {

    /* renamed from: d, reason: collision with root package name */
    public final l1.d f629d;

    public t(l1.d dVar, l1.i iVar) {
        super(iVar, true);
        this.f629d = dVar;
    }

    @Override // A1.b0
    public final boolean I() {
        return true;
    }

    @Override // n1.InterfaceC0992c
    public final InterfaceC0992c f() {
        l1.d dVar = this.f629d;
        if (dVar instanceof InterfaceC0992c) {
            return (InterfaceC0992c) dVar;
        }
        return null;
    }

    @Override // A1.b0
    public void p(Object obj) {
        a.h(R1.d.t(this.f629d), AbstractC0022x.h(obj), null);
    }

    @Override // A1.b0
    public void q(Object obj) {
        this.f629d.i(AbstractC0022x.h(obj));
    }
}
