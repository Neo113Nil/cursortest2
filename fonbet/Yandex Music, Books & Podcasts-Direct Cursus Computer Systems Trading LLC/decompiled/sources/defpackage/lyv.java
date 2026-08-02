package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class lyv {
    public final rxv a;
    public final uyv b;
    public final mm6 c;
    public final u2r d;

    public lyv(rxv rxvVar, uyv uyvVar, mm6 mm6Var) {
        heh hehVar = heh.a;
        uyvVar.getClass();
        this.a = rxvVar;
        this.b = uyvVar;
        this.c = mm6Var;
        this.d = new u2r();
        x97.y(mm6Var, null, null, new y6v(new z50(zsd.d0(uyvVar.h, 1), 9), (Continuation) null, this, 10), 3);
        fkn fknVar = uyvVar.a;
        ox6.B(ox6.S(fknVar), mm6Var, new iyv(this, 3));
        ox6.B(rxvVar.G, mm6Var, new iyv(this, 0));
        ox6.B(fknVar, mm6Var, new iyv(this, 4));
        ox6.B(szf.s0(new eyv(this, 0)), mm6Var, new iyv(this, 1));
        ox6.B(zsd.d0(szf.s0(new eyv(this, 1)), 1), mm6Var, new iyv(this, 2));
        bzv bzvVar = (bzv) fknVar.a.getValue();
        if (bzvVar instanceof zyv) {
            return;
        }
        if (bzvVar instanceof azv) {
            rxvVar.m(2.2f);
        } else {
            b6e.s();
            throw null;
        }
    }

    public final void a(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2032190382);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(this.b.h, oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0("");
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            String str = ((yyv) O.getValue()).b;
            boolean h = oq5Var.h(this) | oq5Var.f(O);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                Object h0tVar = new h0t(this, aqiVar, O, null, 28);
                oq5Var.k0(h0tVar);
                K2 = h0tVar;
            }
            gld.w(oq5Var, str, (Function2) K2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r6.b(1.0f, r10, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (defpackage.y2x.o(1200, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        jyv jyvVar;
        int i;
        if (cg6Var instanceof jyv) {
            jyvVar = (jyv) cg6Var;
            int i2 = jyvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jyvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jyvVar.j;
                nm6 nm6Var = nm6.a;
                i = jyvVar.l;
                rxv rxvVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    mqi mqiVar = rxvVar.u;
                    if (mqiVar.b.g()) {
                        try {
                            rxvVar.i.h(1.0f);
                        } finally {
                            mqiVar.c();
                        }
                    }
                    if (rxvVar.h.e() != 1.0f) {
                        jyvVar.l = 1;
                    }
                    x6k x6kVar = rxvVar.w;
                    Boolean bool = Boolean.TRUE;
                    x6kVar.setValue(bool);
                    rxvVar.o(true);
                    rxvVar.z.setValue(bool);
                    rxvVar.y.setValue(bool);
                    if (((Boolean) rxvVar.B.getValue()).booleanValue()) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    x6k x6kVar2 = rxvVar.w;
                    Boolean bool2 = Boolean.TRUE;
                    x6kVar2.setValue(bool2);
                    rxvVar.o(true);
                    rxvVar.z.setValue(bool2);
                    rxvVar.y.setValue(bool2);
                    if (((Boolean) rxvVar.B.getValue()).booleanValue()) {
                        x97.y(this.c, null, null, new zts(rxvVar, null, 29), 3);
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                act S = weo.S(600, 0, lya.c, 2);
                jyvVar.l = 2;
            }
        }
        jyvVar = new jyv(this, cg6Var);
        Object obj2 = jyvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jyvVar.l;
        rxv rxvVar2 = this.a;
        if (i != 0) {
        }
    }
}
