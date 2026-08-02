package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class co4 extends bg3 {
    public final /* synthetic */ zi3 t;
    public final /* synthetic */ jtc u;

    public co4(zi3 zi3Var, jtc jtcVar) {
        this.t = zi3Var;
        this.u = jtcVar;
    }

    @Override // defpackage.bg3
    public final void Q(sgr sgrVar, s2i s2iVar) {
        sgrVar.getClass();
        s2iVar.getClass();
        this.t.o(sgrVar.g() ? null : new tgr(sgrVar, s2iVar), false);
    }

    @Override // defpackage.bg3
    public final void S(Object obj) {
        Object c = this.t.c(obj);
        if (c instanceof fd4) {
            Throwable a = gd4.a(c);
            if (a != null) {
                throw a;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    @Override // defpackage.bg3
    public final void T() {
        Object c = ((zi3) this.u.b).c(Unit.a);
        if (c instanceof fd4) {
            Throwable a = gd4.a(c);
            if (a != null) {
                throw a;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
