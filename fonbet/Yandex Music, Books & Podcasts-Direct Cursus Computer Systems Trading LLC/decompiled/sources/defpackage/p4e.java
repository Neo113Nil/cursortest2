package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p4e extends xci implements ofm {
    public uoi o;
    public k4e p;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S0(p4e p4eVar, cg6 cg6Var) {
        m4e m4eVar;
        int i;
        k4e k4eVar;
        if (cg6Var instanceof m4e) {
            m4eVar = (m4e) cg6Var;
            int i2 = m4eVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m4eVar.n = i2 - Integer.MIN_VALUE;
                Object obj = m4eVar.l;
                nm6 nm6Var = nm6.a;
                i = m4eVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (p4eVar.p == null) {
                        k4eVar = new k4e();
                        uoi uoiVar = p4eVar.o;
                        m4eVar.j = p4eVar;
                        m4eVar.k = k4eVar;
                        m4eVar.n = 1;
                        if (uoiVar.a(k4eVar, m4eVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k4e k4eVar2 = m4eVar.k;
                p4e p4eVar2 = m4eVar.j;
                qgg.h0(obj);
                k4eVar = k4eVar2;
                p4eVar = p4eVar2;
                p4eVar.p = k4eVar;
                return Unit.a;
            }
        }
        m4eVar = new m4e(p4eVar, cg6Var);
        Object obj2 = m4eVar.l;
        nm6 nm6Var2 = nm6.a;
        i = m4eVar.n;
        if (i != 0) {
        }
        p4eVar.p = k4eVar;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T0(p4e p4eVar, cg6 cg6Var) {
        n4e n4eVar;
        int i;
        if (cg6Var instanceof n4e) {
            n4eVar = (n4e) cg6Var;
            int i2 = n4eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n4eVar.m = i2 - Integer.MIN_VALUE;
                Object obj = n4eVar.k;
                nm6 nm6Var = nm6.a;
                i = n4eVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    k4e k4eVar = p4eVar.p;
                    if (k4eVar != null) {
                        l4e l4eVar = new l4e(k4eVar);
                        uoi uoiVar = p4eVar.o;
                        n4eVar.j = p4eVar;
                        n4eVar.m = 1;
                        if (uoiVar.a(l4eVar, n4eVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p4eVar = n4eVar.j;
                qgg.h0(obj);
                p4eVar.p = null;
                return Unit.a;
            }
        }
        n4eVar = new n4e(p4eVar, cg6Var);
        Object obj2 = n4eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = n4eVar.m;
        if (i != 0) {
        }
        p4eVar.p = null;
        return Unit.a;
    }

    @Override // defpackage.xci
    public final void L0() {
        U0();
    }

    public final void U0() {
        k4e k4eVar = this.p;
        if (k4eVar != null) {
            this.o.b(new l4e(k4eVar));
            this.p = null;
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        U0();
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        if (gfmVar == gfm.b) {
            int i = ffmVar.d;
            Continuation continuation = null;
            if (i == 4) {
                x97.y(G0(), null, null, new o4e(this, continuation, 0), 3);
            } else if (i == 5) {
                x97.y(G0(), null, null, new o4e(this, continuation, 1), 3);
            }
        }
    }
}
