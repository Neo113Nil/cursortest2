package P0;

import K0.AbstractC0025a;
import K0.AbstractC0046w;

/* loaded from: classes.dex */
public class u extends AbstractC0025a implements x0.c {

    /* renamed from: i, reason: collision with root package name */
    public final v0.d f903i;

    public u(v0.d dVar, v0.i iVar) {
        super(iVar, true);
        this.f903i = dVar;
    }

    @Override // K0.a0
    public final boolean J() {
        return true;
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f903i;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // K0.a0
    public void q(Object obj) {
        AbstractC0068a.i(o.g.u(this.f903i), AbstractC0046w.h(obj), null);
    }

    @Override // K0.a0
    public void r(Object obj) {
        this.f903i.c(AbstractC0046w.h(obj));
    }
}
