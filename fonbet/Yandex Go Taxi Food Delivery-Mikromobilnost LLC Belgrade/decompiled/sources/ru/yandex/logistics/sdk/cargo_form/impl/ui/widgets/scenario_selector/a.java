package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cbc;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cqs0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.e350;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g8m0;
import defpackage.gl51;
import defpackage.i1m0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.kj5;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.m4m0;
import defpackage.mfe0;
import defpackage.nnm;
import defpackage.o430;
import defpackage.oau;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.qmm0;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.r5a1;
import defpackage.sic;
import defpackage.sls;
import defpackage.smm0;
import defpackage.t7l0;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.to5;
import defpackage.tra1;
import defpackage.umm0;
import defpackage.uo5;
import defpackage.vmm0;
import defpackage.vnf0;
import defpackage.vxd;
import defpackage.w2o;
import defpackage.wls;
import defpackage.wmm0;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xdb1;
import defpackage.xw8;
import defpackage.y6i0;
import defpackage.y7m;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(qmm0 qmm0Var, boolean z, sls slsVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        wls wlsVar;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(131297499);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(qmm0Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            CharSequence charSequence = qmm0Var.a;
            to5 to5Var = x4c.E;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), YandexShapes.c(((YandexShapes) btsVar.m(qm51.a)).c, YandexShapes.Corner.BOTTOM));
            ldc ldcVar = qmm0Var.b;
            if (ldcVar == null) {
                btsVar.e0(1622861985);
                long c = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
                j = c;
            } else {
                btsVar.e0(1622860621);
                btsVar.t(false);
                j = ldcVar.a;
            }
            f530 b = m4m0.b(l, j, qke.q);
            boolean e = btsVar.e(charSequence);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new oau(4, charSequence);
                btsVar.o0(Q);
            }
            f530 b2 = fnq0.b(b, false, (tls) Q);
            awk0 awk0Var = new awk0(0);
            boolean z2 = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new e350(13, slsVar);
                btsVar.o0(Q2);
            }
            f530 w = r5a1.w(b2, z, false, awk0Var, (tls) Q2, 10);
            lhl0 a = khl0.a(lr20.e, to5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, w);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            zgb1.a(charSequence, an91.m(c530Var, 0.0f, 12.0f, 1), 0, false, null, null, false, null, btsVar, 48, 252);
            f530 o2 = an91.o(c530Var, 6.0f, 12.0f, 0.0f, 12.0f, 4);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, d2);
            qje.W(btsVar, wlsVar3, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d3);
            wlsVar = aVar;
            wlsVar.invoke(btsVar, 6);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            wlsVar = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(qmm0Var, z, slsVar, wlsVar, i, 15);
        }
    }

    public static final void b(vmm0 vmm0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        cbc cbcVar = vmm0Var.d;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-945215107);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vmm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar3 = tlsVar2;
            i2 |= btsVar.e(tlsVar3) ? 256 : 128;
        } else {
            tlsVar3 = tlsVar2;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            ScenarioSelectorState scenarioSelectorState = cbcVar != null ? cbcVar.a : null;
            boolean c = btsVar.c(scenarioSelectorState == null ? -1 : scenarioSelectorState.ordinal());
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                Q = f.j(cbcVar != null ? cbcVar.a : null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            ScenarioSelectorState scenarioSelectorState2 = (ScenarioSelectorState) oz40Var.component1();
            tls component2 = oz40Var.component2();
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 12.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            f(vmm0Var, tlsVar, scenarioSelectorState2, tlsVar3, btsVar, (i3 & HProv.PP_DELETE_SAVED_PASSWD) | ((i3 << 3) & 7168));
            int i4 = i3 << 6;
            c(vmm0Var, scenarioSelectorState2, component2, tlsVar, tlsVar2, btsVar, (i4 & 7168) | (i3 & 14) | (i4 & HProv.ALG_CLASS_ALL));
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(vmm0Var, tlsVar, tlsVar2, i, 26);
        }
    }

    public static final void c(vmm0 vmm0Var, ScenarioSelectorState scenarioSelectorState, tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i) {
        int i2;
        boolean z;
        Object xw8Var;
        int i3;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1397964344);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vmm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(scenarioSelectorState == null ? -1 : scenarioSelectorState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            cbc cbcVar = vmm0Var.d;
            if (cbcVar == null) {
                btsVar.e0(1542393166);
                btsVar.t(false);
            } else {
                btsVar.e0(1542393167);
                boolean z3 = scenarioSelectorState == ScenarioSelectorState.EXPANDED;
                qmm0 qmm0Var = z3 ? cbcVar.b : cbcVar.c;
                boolean k = ((i2 & 7168) == 2048) | btsVar.k(qmm0Var) | ((i2 & 896) == 256) | btsVar.a(z3);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    z = true;
                    boolean z4 = z3;
                    xw8Var = new xw8(tlsVar2, qmm0Var, tlsVar, z4, 7);
                    i3 = 16384;
                    z2 = z4;
                    btsVar.o0(xw8Var);
                } else {
                    z = true;
                    xw8Var = Q;
                    i3 = 16384;
                    z2 = z3;
                }
                int i4 = i3;
                a(qmm0Var, z2, (sls) xw8Var, wwg.S(1845572400, z, new vxd(z2, 7), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL);
                boolean k2 = btsVar.k(qmm0Var) | ((i2 & HProv.ALG_CLASS_ALL) == i4 ? z : false);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new ScenarioSelectorKt$ScenarioSelectorButton$1$3$1(tlsVar3, qmm0Var, null);
                    btsVar.o0(Q2);
                }
                zpn.e(btsVar, (wls) Q2, zy11.a);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(vmm0Var, scenarioSelectorState, tlsVar, tlsVar2, tlsVar3, i, 4);
        }
    }

    public static final void d(wmm0 wmm0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        smm0 smm0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1713138787);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wmm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            if (!wmm0Var.b || (smm0Var = wmm0Var.c) == null) {
                smm0Var = null;
            }
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new i1m0(29);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new umm0(0);
                btsVar.o0(Q2);
            }
            g.e(z, null, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)), null, wwg.S(-2095277429, true, new ls40(wmm0Var, tlsVar, smm0Var, 13), btsVar), btsVar, ((i2 >> 3) & 14) | 200064, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(wmm0Var, z, tlsVar, i, 11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        if (defpackage.jl40.l(r7.Q(), java.lang.Integer.valueOf(r12)) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(wmm0 wmm0Var, tls tlsVar, fid fidVar, int i) {
        float f;
        f530 f530Var;
        c530 c530Var;
        long j;
        int i2;
        c530 c530Var2;
        int i3;
        tls tlsVar2 = tlsVar;
        boolean z = wmm0Var.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(20380491);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i | (btsVar.k(wmm0Var) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            smm0 smm0Var = wmm0Var.c;
            c530 c530Var3 = c530.a;
            if (z) {
                btsVar.e0(1564990635);
                f = 20.0f;
                f530Var = aab1.a(2.0f, ((el51) btsVar.m(gl51.a)).n(), c530Var3, cyk0.c(20.0f));
                btsVar.t(false);
            } else {
                f = 20.0f;
                btsVar.e0(1565162623);
                btsVar.t(false);
                f530Var = c530Var3;
            }
            f530 e = ljs0.e(tra1.b(c530Var3, wmm0Var.f ? 1.0f : 0.5f), 72.0f);
            uo5 uo5Var = x4c.A;
            cj6 cj6Var = cj6.a;
            f530 l = ymb1.l(cj6Var.a(e, uo5Var), cyk0.c(f));
            ldc ldcVar = wmm0Var.d;
            if (ldcVar == null) {
                btsVar.e0(-1889163790);
                long d = ((el51) btsVar.m(gl51.a)).d();
                btsVar.t(false);
                c530Var = c530Var3;
                j = d;
            } else {
                btsVar.e0(-1889165154);
                btsVar.t(false);
                c530Var = c530Var3;
                j = ldcVar.a;
            }
            f530 b = m4m0.b(l, j, qke.q);
            boolean z2 = wmm0Var.f;
            int i5 = i4 & 112;
            boolean z3 = ((i4 & 896) == 256) | (i5 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new tmm0(0, tlsVar2, wmm0Var);
                btsVar.o0(Q);
            }
            f530 k = q791.d(b, z2, null, null, (sls) Q, 14).k(f530Var);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                i2 = i4;
            } else {
                i2 = i4;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            if (!z || smm0Var == null) {
                c530Var2 = c530Var;
                btsVar.e0(-210389058);
                f530 q = ljs0.q(c530Var2, smm0Var != null ? smm0Var.b : 72.0f);
                z910 d3 = pi6.d(x4c.b, false);
                i3 = i5;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d4 = androidx.compose.ui.b.d(btsVar, q);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d3);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d4);
                pi6.a(m4m0.b(ljs0.m(cj6Var.a(c530Var2, x4c.y), 40.0f), ((el51) btsVar.m(gl51.a)).g(), cyk0.a), btsVar, 0);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(-210475982);
                c530Var2 = c530Var;
                nnm.s(c530Var2, smm0Var.b, btsVar, false);
                i3 = i5;
            }
            boolean z4 = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new g8m0(20, wmm0Var);
                btsVar.o0(Q2);
            }
            f530 b2 = fnq0.b(c530Var2, false, (tls) Q2);
            cqs0 cqs0Var = wmm0Var.a;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new i1m0(28);
                btsVar.o0(Q3);
            }
            tlsVar2 = tlsVar;
            xdb1.a(b2, cqs0Var, (tls) Q3, tlsVar2, false, new y7m(8.0f), btsVar, ((i2 << 3) & 7168) | 221568, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(wmm0Var, tlsVar2, i, 15);
        }
    }

    public static final void f(vmm0 vmm0Var, tls tlsVar, ScenarioSelectorState scenarioSelectorState, tls tlsVar2, fid fidVar, int i) {
        smm0 smm0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1719341027);
        int i2 = (i & 6) == 0 ? (btsVar.k(vmm0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.c(scenarioSelectorState == null ? -1 : scenarioSelectorState.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            for (wmm0 wmm0Var : vmm0Var.c) {
                boolean z = scenarioSelectorState == ScenarioSelectorState.EXPANDED || scenarioSelectorState == null || wmm0Var.b;
                y7m y7mVar = (!wmm0Var.b || (smm0Var = wmm0Var.c) == null) ? null : new y7m(smm0Var.c);
                float c = y6i0.c((y7mVar != null ? y7mVar.a : 0.0f) - 72.0f, 0.0f, 8.0f);
                if (z) {
                    btsVar.e0(-250146377);
                    oeb1.c(btsVar, ljs0.e(c530.a, 8.0f - c));
                    btsVar.t(false);
                } else {
                    btsVar.e0(-250074302);
                    btsVar.t(false);
                }
                d(wmm0Var, z, tlsVar, btsVar, (i2 << 3) & 896);
                boolean k = ((i2 & 7168) == 2048) | btsVar.k(wmm0Var);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new ScenarioSelectorKt$ScenarioSelectorOptions$1$1$1(tlsVar2, wmm0Var, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, zy11.a);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(vmm0Var, tlsVar, scenarioSelectorState, tlsVar2, i, 4);
        }
    }
}
