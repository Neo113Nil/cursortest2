package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gyi extends xci implements w9t, wxi {
    public wxi o;
    public cyi p;
    public gyi q;
    public final String r;

    public gyi(wxi wxiVar, cyi cyiVar) {
        this.o = wxiVar;
        this.p = cyiVar == null ? new cyi() : cyiVar;
        this.r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        long K = this.o.K(i, j, j2);
        boolean z = this.n;
        gyi gyiVar = null;
        if (z && z) {
            gyiVar = (gyi) q7g.F(this);
        }
        gyi gyiVar2 = gyiVar;
        return enj.h(K, gyiVar2 != null ? gyiVar2.K(i, enj.h(j, K), enj.g(j2, K)) : 0L);
    }

    @Override // defpackage.xci
    public final void K0() {
        cyi cyiVar = this.p;
        cyiVar.a = this;
        cyiVar.b = null;
        this.q = null;
        cyiVar.c = new ypb(21, this);
        cyiVar.d = G0();
    }

    @Override // defpackage.xci
    public final void L0() {
        xqn xqnVar = new xqn();
        q7g.U(this, new ne0(xqnVar, 6));
        gyi gyiVar = (gyi) ((w9t) xqnVar.a);
        this.q = gyiVar;
        cyi cyiVar = this.p;
        cyiVar.b = gyiVar;
        if (cyiVar.a == this) {
            cyiVar.a = null;
        }
    }

    public final mm6 S0() {
        gyi gyiVar = this.n ? (gyi) q7g.F(this) : null;
        if (gyiVar != null) {
            return gyiVar.S0();
        }
        mm6 mm6Var = this.p.d;
        if (mm6Var != null) {
            return mm6Var;
        }
        xq0.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // defpackage.w9t
    public final Object h() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        eyi eyiVar;
        int i;
        gyi gyiVar;
        long j3;
        long j4;
        long j5;
        gyi gyiVar2;
        long j6;
        long j7;
        if (continuation instanceof eyi) {
            eyiVar = (eyi) continuation;
            int i2 = eyiVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eyiVar.o = i2 - Integer.MIN_VALUE;
                eyi eyiVar2 = eyiVar;
                Object obj = eyiVar2.m;
                nm6 nm6Var = nm6.a;
                i = eyiVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    wxi wxiVar = this.o;
                    eyiVar2.j = this;
                    eyiVar2.k = j;
                    eyiVar2.l = j2;
                    eyiVar2.o = 1;
                    obj = wxiVar.k(j, j2, eyiVar2);
                    if (obj != nm6Var) {
                        gyiVar = this;
                        j3 = j;
                        j4 = j2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = eyiVar2.k;
                    qgg.h0(obj);
                    j6 = ((yzt) obj).a;
                    j5 = j7;
                    return new yzt(yzt.e(j5, j6));
                }
                j4 = eyiVar2.l;
                j3 = eyiVar2.k;
                gyiVar = eyiVar2.j;
                qgg.h0(obj);
                j5 = ((yzt) obj).a;
                boolean z = gyiVar.n;
                gyiVar2 = !z ? (z && z) ? (gyi) q7g.F(gyiVar) : null : gyiVar.q;
                if (gyiVar2 != null) {
                    j6 = 0;
                    return new yzt(yzt.e(j5, j6));
                }
                long e = yzt.e(j3, j5);
                long d = yzt.d(j4, j5);
                eyiVar2.j = null;
                eyiVar2.k = j5;
                eyiVar2.o = 2;
                obj = gyiVar2.k(e, d, eyiVar2);
                if (obj != nm6Var) {
                    j7 = j5;
                    j6 = ((yzt) obj).a;
                    j5 = j7;
                    return new yzt(yzt.e(j5, j6));
                }
                return nm6Var;
            }
        }
        eyiVar = new eyi(this, (cg6) continuation);
        eyi eyiVar22 = eyiVar;
        Object obj2 = eyiVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = eyiVar22.o;
        if (i != 0) {
        }
        j5 = ((yzt) obj2).a;
        boolean z2 = gyiVar.n;
        gyiVar2 = !z2 ? (z2 && z2) ? (gyi) q7g.F(gyiVar) : null : gyiVar.q;
        if (gyiVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(long j, Continuation continuation) {
        fyi fyiVar;
        int i;
        long j2;
        gyi gyiVar;
        long j3;
        if (continuation instanceof fyi) {
            fyiVar = (fyi) continuation;
            int i2 = fyiVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fyiVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fyiVar.l;
                nm6 nm6Var = nm6.a;
                i = fyiVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = this.n;
                    gyi gyiVar2 = (z && z) ? (gyi) q7g.F(this) : null;
                    if (gyiVar2 != null) {
                        fyiVar.j = this;
                        fyiVar.k = j;
                        fyiVar.n = 1;
                        obj = gyiVar2.r0(j, fyiVar);
                        if (obj != nm6Var) {
                            gyiVar = this;
                        }
                        return nm6Var;
                    }
                    j2 = 0;
                    gyiVar = this;
                    long j4 = j2;
                    long j5 = j;
                    j3 = j4;
                    wxi wxiVar = gyiVar.o;
                    long d = yzt.d(j5, j3);
                    fyiVar.j = null;
                    fyiVar.k = j3;
                    fyiVar.n = 2;
                    obj = wxiVar.r0(d, fyiVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = fyiVar.k;
                        qgg.h0(obj);
                        return new yzt(yzt.e(j3, ((yzt) obj).a));
                    }
                    j = fyiVar.k;
                    gyiVar = fyiVar.j;
                    qgg.h0(obj);
                }
                j2 = ((yzt) obj).a;
                long j42 = j2;
                long j52 = j;
                j3 = j42;
                wxi wxiVar2 = gyiVar.o;
                long d2 = yzt.d(j52, j3);
                fyiVar.j = null;
                fyiVar.k = j3;
                fyiVar.n = 2;
                obj = wxiVar2.r0(d2, fyiVar);
            }
        }
        fyiVar = new fyi(this, (cg6) continuation);
        Object obj2 = fyiVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fyiVar.n;
        if (i != 0) {
        }
        j2 = ((yzt) obj2).a;
        long j422 = j2;
        long j522 = j;
        j3 = j422;
        wxi wxiVar22 = gyiVar.o;
        long d22 = yzt.d(j522, j3);
        fyiVar.j = null;
        fyiVar.k = j3;
        fyiVar.n = 2;
        obj2 = wxiVar22.r0(d22, fyiVar);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        boolean z = this.n;
        gyi gyiVar = null;
        if (z && z) {
            gyiVar = (gyi) q7g.F(this);
        }
        long x = gyiVar != null ? gyiVar.x(i, j) : 0L;
        return enj.h(x, this.o.x(i, enj.g(j, x)));
    }
}
