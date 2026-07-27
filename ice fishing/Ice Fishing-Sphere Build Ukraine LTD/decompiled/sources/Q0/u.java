package Q0;

import L0.AbstractC0043a;
import L0.AbstractC0064w;

/* loaded from: classes.dex */
public class u extends AbstractC0043a implements x0.c {

    /* renamed from: h, reason: collision with root package name */
    public final v0.d f912h;

    public u(v0.d dVar, v0.i iVar) {
        super(iVar, true);
        this.f912h = dVar;
    }

    @Override // L0.a0
    public final boolean J() {
        return true;
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f912h;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // L0.a0
    public void q(Object obj) {
        AbstractC0068a.i(o.g.r(this.f912h), AbstractC0064w.h(obj), null);
    }

    @Override // L0.a0
    public void r(Object obj) {
        this.f912h.c(AbstractC0064w.h(obj));
    }
}
