package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bns;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dk91;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g43;
import defpackage.gji0;
import defpackage.gl51;
import defpackage.gxm;
import defpackage.hi91;
import defpackage.hqb1;
import defpackage.i330;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.oau;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.scb1;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.u9b1;
import defpackage.vge;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xbu;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zrb1;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(xbu xbuVar, fid fidVar, int i) {
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1235833895);
        int i2 = (btsVar.k(xbuVar) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 17) != 16)) {
            c530 c530Var = c530.a;
            s3b1.f(xbuVar.a, an91.o(ljs0.m(c530Var, 168.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), null, btsVar, 48, 4);
            CharSequence charSequence = xbuVar.b;
            if (charSequence == null) {
                btsVar.e0(-267696467);
                btsVar.t(false);
                f = 24.0f;
            } else {
                btsVar.e0(-267696466);
                f530 d = hi91.d(an91.n(c530Var, 24.0f, 12.0f, 24.0f, 10.0f), false, null, 3);
                boolean e = btsVar.e(charSequence);
                Object Q = btsVar.Q();
                if (e || Q == did.a) {
                    Q = new oau(1, charSequence);
                    btsVar.o0(Q);
                }
                f530 a = fnq0.a(d, (tls) Q);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d3 = b.d(btsVar, a);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d2);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d3);
                f = 24.0f;
                zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                btsVar = btsVar;
                btsVar.t(true);
                btsVar.t(false);
            }
            u9b1.b(an91.o(c530Var, 0.0f, f, 0.0f, 0.0f, 13), xbuVar.d, btsVar, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(xbuVar, i, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if (defpackage.jl40.l(r9.Q(), java.lang.Integer.valueOf(r13)) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(i330 i330Var, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        wls wlsVar3;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2 = i330Var.b;
        xbu xbuVar = i330Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1999490593);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(i330Var) ? 4 : 2) | (btsVar.e(wlsVar) ? 32 : 16) | (btsVar.e(wlsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ldc ldcVar = xbuVar.c;
            if (ldcVar == null) {
                btsVar.e0(-1660069307);
                j = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
            } else {
                btsVar.e0(-1660070888);
                btsVar.t(false);
                j = ldcVar.a;
            }
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(pw91.u(androidx.compose.ui.input.nestedscroll.b.a(m4m0.b(c530Var, j, gji0Var), zrb1.f(btsVar), null), pw91.o(btsVar), 14), 1.0f);
            so5 so5Var = x4c.H;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar4 = d.f;
            qje.W(btsVar, wlsVar4, a);
            wls wlsVar5 = d.e;
            qje.W(btsVar, wlsVar5, o);
            wls wlsVar6 = d.g;
            if (btsVar.S) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar6);
            wls wlsVar7 = d.d;
            qje.W(btsVar, wlsVar7, d);
            a(xbuVar, btsVar, 6);
            f530 b = m4m0.b(c530Var, ((el51) btsVar.m(gl51.a)).c(), gji0Var);
            boolean z = false;
            sic a2 = qic.a(g43Var, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar4, a2);
            qje.W(btsVar, wlsVar5, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar6);
            }
            qje.W(btsVar, wlsVar7, d2);
            btsVar.e0(1646305254);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                vge vgeVar = (vge) obj;
                c530 c530Var2 = c530Var;
                boolean z2 = z;
                hqb1.a(null, vgeVar, false, wwg.S(-452180125, true, new bns(13, vgeVar), btsVar), btsVar, 3456, 1);
                if (i3 != scc.f(arrayList)) {
                    btsVar.e0(1242315829);
                    bts btsVar2 = btsVar;
                    dk91.a(0.0f, 6, 6, 0L, btsVar2, an91.o(c530Var2, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar = btsVar2;
                    btsVar.t(z2);
                } else {
                    btsVar.e0(1242419617);
                    btsVar.t(z2);
                }
                z = z2;
                i3 = i4;
                c530Var = c530Var2;
            }
            boolean z3 = z;
            btsVar.t(z3);
            scb1.a(i330Var.c, wlsVar, btsVar, i2 & 112);
            btsVar.t(true);
            btsVar.t(true);
            String str = i330Var.e;
            Object obj2 = i330Var.d;
            boolean z4 = ((i2 & 896) == 256 ? true : z3) | ((i2 & 14) == 4 ? true : z3);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                wlsVar3 = wlsVar2;
                Q = new InfoModalViewKt$InfoModalView$3$1(wlsVar3, i330Var, null);
                btsVar.o0(Q);
            } else {
                wlsVar3 = wlsVar2;
            }
            zpn.f(str, obj2, (wls) Q, btsVar);
        } else {
            wlsVar3 = wlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(i330Var, wlsVar, wlsVar3, i, 17);
        }
    }
}
