package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.akp0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cj6;
import defpackage.ckp0;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.g43;
import defpackage.gl51;
import defpackage.i43;
import defpackage.jl40;
import defpackage.jrn;
import defpackage.k3r;
import defpackage.khl0;
import defpackage.krn;
import defpackage.l27;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lvi0;
import defpackage.nao0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.qeg0;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.srk0;
import defpackage.tcb1;
import defpackage.tls;
import defpackage.uo5;
import defpackage.uyo0;
import defpackage.w511;
import defpackage.w7o0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x9x0;
import defpackage.y3b1;
import defpackage.yjp0;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zhb0;
import defpackage.zjp0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(f530 f530Var, byk0 byk0Var, zjp0 zjp0Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1366484333);
        if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i2 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(byk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(zjp0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            x9x0 x9x0Var = zjp0Var.e;
            btsVar.e0(-1234541023);
            long j = ldc.l;
            long j2 = ((ldc) btsVar.m(srk0.a)).a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new uyo0(9, zjp0Var);
                btsVar.o0(Q);
            }
            l27 l27Var = new l27((tls) Q);
            boolean z2 = (i3 == 256) | ((i2 & 7168) == 2048);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new nao0(15, tlsVar, zjp0Var);
                btsVar.o0(Q2);
            }
            int i4 = i2 << 3;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, f530Var2, byk0Var, j, j2, null, null, null, false, null, null, l27Var, null, btsVar, (i4 & 112) | HProv.ALG_TYPE_SECURECHANNEL | (i4 & 896), 0, 6112);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, byk0Var, zjp0Var, tlsVar, i, 8);
        }
    }

    public static final void b(f530 f530Var, lvi0 lvi0Var, yjp0 yjp0Var, fid fidVar, int i) {
        int i2;
        lvi0 lvi0Var2;
        long j;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1319406653);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lvi0Var2 = lvi0Var;
            i2 |= btsVar.k(lvi0Var2) ? 32 : 16;
        } else {
            lvi0Var2 = lvi0Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(yjp0Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            s3b1.f(lvi0Var2, ljs0.c, null, btsVar, ((i2 >> 3) & 14) | 48, 4);
            if (yjp0Var == null) {
                btsVar.e0(1608663059);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(1608663060);
                int i3 = akp0.a[yjp0Var.c.ordinal()];
                if (i3 == 1) {
                    uo5Var = x4c.w;
                } else if (i3 != 2) {
                    w511.b();
                    return;
                }
                f530 a = cj6.a.a(an91.m(an91.o(c530.a, 0.0f, 24.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2), uo5Var);
                ldc ldcVar = yjp0Var.b;
                if (ldcVar == null) {
                    btsVar.e0(-781115014);
                    j = ((el51) btsVar.m(gl51.a)).c();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-781116378);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                z = true;
                y3b1.a(a, j, 0.0f, 0.0f, 0.0f, 0L, wwg.S(133671450, true, new w7o0(6, yjp0Var), btsVar), btsVar, 12582912, HProv.PP_SAME_MEDIA);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(f530Var, (Object) lvi0Var, (Object) yjp0Var, i, 4);
        }
    }

    public static final void c(f530 f530Var, byk0 byk0Var, ldc ldcVar, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1880928506);
        int i2 = i | (btsVar.k(byk0Var) ? 32 : 16) | (btsVar.k(ldcVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            if (ldcVar == null) {
                btsVar.e0(-608932319);
                j = ((el51) btsVar.m(gl51.a)).d();
                btsVar.t(false);
            } else {
                btsVar.e0(-608933187);
                btsVar.t(false);
                j = ldcVar.a;
            }
            tcb1.b(f530Var, j, byk0Var, null, null, btsVar, 6 | ((i2 << 3) & 896), 24);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(f530Var, (Object) byk0Var, (Object) ldcVar, i, 22);
        }
    }

    public static final void d(f530 f530Var, zjp0 zjp0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1170061762);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(zjp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar.e(tlsVar3) ? 256 : 128;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScrollableItemsKt$ScrollableItem$1$1(tlsVar2, zjp0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 o2 = an91.o(ljs0.c, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            c(o2, b, zjp0Var.c, btsVar, 6);
            e(zjp0Var.d, zjp0Var.g, zjp0Var.a, zjp0Var.b, btsVar, 0);
            int i3 = i2 << 3;
            a(o2, b, zjp0Var, tlsVar3, btsVar, 6 | (i3 & 896) | (i3 & 7168));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, zjp0Var, tlsVar, tlsVar2, i, 7);
        }
    }

    public static final void e(lvi0 lvi0Var, yjp0 yjp0Var, CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-130847773);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(lvi0Var) ? 4 : 2) | (btsVar2.k(yjp0Var) ? 32 : 16) | (btsVar2.e(charSequence) ? 256 : 128) | (btsVar2.e(charSequence2) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            k3r k3rVar = ljs0.c;
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            c530 c530Var = c530.a;
            int i3 = i2 << 3;
            b(ljs0.n(c530Var, 232.0f, 140.0f), lvi0Var, yjp0Var, btsVar2, (i3 & 112) | 6 | (i3 & 896));
            f530 o2 = an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 10.0f, 5);
            sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, o2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o3);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d2);
            btsVar = btsVar2;
            zgb1.a(charSequence, null, 8388611, false, null, null, false, new jrn(2), btsVar, ((i2 >> 6) & 14) | 12583296, 122);
            if (charSequence2 == null) {
                btsVar.e0(-1689763643);
                btsVar.t(false);
            } else {
                btsVar.e0(-1689763642);
                zgb1.a(charSequence2, an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).k(ljs0.b), 8388611, false, null, null, false, new krn(0), btsVar, 12583344, 120);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(lvi0Var, yjp0Var, charSequence, charSequence2, i, 11);
        }
    }

    public static final void f(ckp0 ckp0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        tls tlsVar4 = tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-707786033);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ckp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar.e(tlsVar3) ? 32 : 16;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar4) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScrollableItemsKt$ScrollableItems$1$1(tlsVar4, ckp0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            c530 c530Var = c530.a;
            f530 l = pw91.l(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 14);
            lhl0 a = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, l);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            f530 n = ljs0.n(c530Var, 232.0f, 260.0f);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            btsVar.e0(171008109);
            Iterator it = ckp0Var.c.iterator();
            while (it.hasNext()) {
                int i4 = i3 << 3;
                d(n, (zjp0) it.next(), tlsVar3, tlsVar4, btsVar, (i4 & 7168) | (i4 & 896) | 6);
                tlsVar3 = tlsVar;
                tlsVar4 = tlsVar2;
            }
            btsVar.t(false);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(ckp0Var, tlsVar, tlsVar2, i, 3);
        }
    }
}
