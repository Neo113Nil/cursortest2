package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import defpackage.a6n;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.atq;
import defpackage.awk0;
import defpackage.b0;
import defpackage.b64;
import defpackage.bdp;
import defpackage.bng0;
import defpackage.btq;
import defpackage.bts;
import defpackage.c530;
import defpackage.cgz0;
import defpackage.cma1;
import defpackage.cms;
import defpackage.ctq;
import defpackage.cuq;
import defpackage.did;
import defpackage.dk91;
import defpackage.dmw0;
import defpackage.dtq;
import defpackage.dzm;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g0;
import defpackage.gl51;
import defpackage.hi91;
import defpackage.i43;
import defpackage.jl40;
import defpackage.jtq;
import defpackage.khl0;
import defpackage.l27;
import defpackage.l690;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.loj;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.mfz0;
import defpackage.mt71;
import defpackage.n;
import defpackage.nga1;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.pa90;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.r5a1;
import defpackage.scc;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.sxo;
import defpackage.tls;
import defpackage.tse0;
import defpackage.ua3;
import defpackage.usq;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzg0;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.zei0;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import defpackage.zyd;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(jtq jtqVar, tls tlsVar, tls tlsVar2, tls tlsVar3, sls slsVar, fid fidVar, int i) {
        tls tlsVar4;
        c530 c530Var;
        int i2;
        zei0 zei0Var = jtqVar.d;
        Integer num = jtqVar.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2125182895);
        int i3 = i | (btsVar.k(jtqVar) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var2);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (num == null) {
                btsVar.e0(1734389181);
                btsVar.t(false);
                i2 = 48;
                c530Var = c530Var2;
            } else {
                tse0.s(btsVar, 1734389182, c530Var2, 16.0f, btsVar);
                c530Var = c530Var2;
                i2 = 48;
                nga1.b(0, 0.0f, 0L, num.intValue(), 0L, tlsVar, ((Resources) btsVar.m(AndroidCompositionLocals_androidKt.c)).getStringArray(bng0.rating_view_titles), btsVar, ImageMetadata.EDGE_MODE);
                ly3.B(c530Var, 8.0f, btsVar, false);
            }
            cgz0 cgz0Var = jtqVar.f;
            if (cgz0Var == null) {
                btsVar.e0(1734757058);
                btsVar.t(false);
            } else {
                btsVar.e0(1734757059);
                f(cgz0Var, tlsVar3, slsVar, zei0Var == null ? an91.o(c530Var, 0.0f, 0.0f, 0.0f, 16.0f, 7) : an91.o(c530Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), btsVar, 432);
                btsVar.t(false);
            }
            if (zei0Var == null) {
                btsVar.e0(1735147813);
                btsVar.t(false);
                tlsVar4 = tlsVar2;
            } else {
                btsVar.e0(1735147814);
                tlsVar4 = tlsVar2;
                d(zei0Var, tlsVar4, btsVar, i2);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            tlsVar4 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) jtqVar, tlsVar, (Object) tlsVar4, (Object) tlsVar3, (Object) slsVar, i, 16);
        }
    }

    public static final void b(cuq cuqVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        pa90 b;
        long o;
        bts btsVar = (bts) fidVar;
        btsVar.g0(359429187);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cuqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            c530 c530Var = c530.a;
            f530 u = ljs0.u(ljs0.q(c530Var, 88.0f), null, 3);
            boolean z = cuqVar.e;
            usq usqVar = cuqVar.d;
            awk0 awk0Var = new awk0(1);
            boolean z2 = (i2 & 112) == 32;
            int i4 = i2 & 14;
            boolean z3 = z2 | (i4 == 4);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new btq(tlsVar, cuqVar, 1);
                btsVar.o0(Q2);
            }
            f530 d = hi91.d(r5a1.v(u, z, zx40Var, null, false, awk0Var, (tls) Q2, 8), false, null, 3);
            boolean z4 = i4 == 4;
            Object Q3 = btsVar.Q();
            if (z4 || Q3 == o430Var) {
                Q3 = new dtq(cuqVar, 0);
                btsVar.o0(Q3);
            }
            f530 a = fnq0.a(d, (tls) Q3);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            if (z) {
                btsVar.e0(23621366);
                String str = usqVar != null ? usqVar.a : null;
                if (str == null) {
                    btsVar.e0(23643933);
                    btsVar.t(false);
                    b = null;
                } else {
                    btsVar.e0(23643934);
                    b = ua3.b(str, null, null, btsVar, 14);
                    btsVar.t(false);
                }
                if (b == null) {
                    btsVar.e0(554954098);
                    b = mt71.m(wzg0.ic_heart_fallback_active, 0, btsVar);
                } else {
                    btsVar.e0(554951308);
                }
                btsVar.t(false);
                btsVar.t(false);
            } else {
                btsVar.e0(23828818);
                String str2 = usqVar != null ? usqVar.b : null;
                if (str2 == null) {
                    btsVar.e0(23853245);
                    btsVar.t(false);
                    b = null;
                } else {
                    btsVar.e0(23853246);
                    b = ua3.b(str2, null, null, btsVar, 14);
                    btsVar.t(false);
                }
                if (b == null) {
                    btsVar.e0(554960852);
                    pa90 m = mt71.m(wzg0.ic_heart_fallback_inactive, 0, btsVar);
                    btsVar.t(false);
                    b = m;
                } else {
                    btsVar.e0(554958000);
                    btsVar.t(false);
                }
                btsVar.t(false);
            }
            o4b1.b(b, null, ljs0.m(c530Var, 72.0f), null, null, 0.0f, null, btsVar, 432, 120);
            f530 w = ljs0.w(c530Var, 3);
            String str3 = cuqVar.b;
            if (z) {
                btsVar.e0(554976417);
                o = ((el51) btsVar.m(gl51.a)).n();
            } else {
                btsVar.e0(554977474);
                o = ((el51) btsVar.m(gl51.a)).o();
            }
            btsVar.t(false);
            i3 = 1;
            ymb1.f(str3, w, o, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 2, null, null, btsVar, 48, HProv.ALG_TYPE_SECURECHANNEL, 56312);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new atq(cuqVar, tlsVar, i, i3);
        }
    }

    public static final void c(cuq cuqVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(644845372);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(cuqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            boolean z = cuqVar.e;
            awk0 awk0Var = new awk0(1);
            boolean z2 = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z3 = z2 | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new btq(tlsVar, cuqVar, 2);
                btsVar2.o0(Q2);
            }
            f530 d = hi91.d(r5a1.v(c530.a, z, zx40Var, null, false, awk0Var, (tls) Q2, 8), false, null, 3);
            boolean z4 = i3 == 4;
            Object Q3 = btsVar2.Q();
            if (z4 || Q3 == o430Var) {
                Q3 = new dtq(cuqVar, 1);
                btsVar2.o0(Q3);
            }
            btsVar = btsVar2;
            web1.c(fnq0.a(d, (tls) Q3), 48.0f, false, 0.0f, null, null, wwg.S(265617440, true, new loj(18, cuqVar), btsVar2), null, null, wwg.S(-1183880669, true, new a6n(9, cuqVar, tlsVar), btsVar2), null, null, false, btsVar, 806879232, 0, 7612);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new atq(cuqVar, tlsVar, i, 0);
        }
    }

    public static final void d(zei0 zei0Var, tls tlsVar, fid fidVar, int i) {
        ArrayList arrayList;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(713424791);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (i & 6) == 0 ? (btsVar.k(zei0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            boolean z = zei0Var.b;
            ArrayList arrayList2 = zei0Var.a;
            float f2 = 8.0f;
            if (z) {
                btsVar.e0(1675271577);
                f530 l = pw91.l(ljs0.w(c530Var, 3), pw91.o(btsVar), 14);
                lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, l);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a2);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d2);
                oeb1.c(btsVar, ljs0.q(c530Var, 20.0f));
                btsVar.e0(44640601);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    b((cuq) it.next(), tlsVar, btsVar, i3 & 112);
                }
                btsVar.t(false);
                oeb1.c(btsVar, ljs0.q(c530Var, 20.0f));
                n.y(btsVar, true, c530Var, 16.0f, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(1675842535);
                btsVar.e0(-1608507744);
                int i4 = 0;
                for (Object obj : arrayList2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    c((cuq) obj, tlsVar, btsVar, i3 & 112);
                    if (i4 != scc.f(arrayList2)) {
                        btsVar.e0(1609580701);
                        arrayList = arrayList2;
                        f = f2;
                        dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                        btsVar.t(false);
                    } else {
                        arrayList = arrayList2;
                        f = f2;
                        btsVar.e0(1609808458);
                        btsVar.t(false);
                    }
                    i4 = i5;
                    f2 = f;
                    arrayList2 = arrayList;
                }
                n.y(btsVar, false, c530Var, f2, btsVar);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(zei0Var, tlsVar, i, 21);
        }
    }

    public static final void e(mfz0 mfz0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        long g;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2007820675);
        int i2 = (btsVar2.k(mfz0Var) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 p = ljs0.p(ljs0.w(ljs0.e(c530.a, 56.0f), 3), 0.0f, 0.0f, 80.0f, 0.0f, 11);
            boolean isSelected = mfz0Var.isSelected();
            awk0 awk0Var = new awk0(0);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new sxo(tlsVar, mfz0Var);
                btsVar2.o0(Q);
            }
            f530 w = r5a1.w(p, isSelected, false, awk0Var, (tls) Q, 10);
            boolean z2 = i4 == 4;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new dzm(21, mfz0Var);
                btsVar2.o0(Q2);
            }
            l27 l27Var = new l27((tls) Q2);
            if (mfz0Var.isSelected()) {
                btsVar2.e0(1024339823);
                g = ((el51) btsVar2.m(gl51.a)).f();
                btsVar2.t(false);
            } else {
                btsVar2.e0(1024399374);
                g = ((el51) btsVar2.m(gl51.a)).g();
                btsVar2.t(false);
            }
            boolean z3 = (i4 == 4) | (i3 == 32);
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new bdp(3, tlsVar, mfz0Var);
                btsVar2.o0(Q3);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q3, w, null, g, 0L, null, null, null, false, null, null, l27Var, wwg.S(754813086, true, new ctq(0, mfz0Var), btsVar2), btsVar, 0, 384, 2036);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(mfz0Var, tlsVar, i, 10);
        }
    }

    public static final void f(cgz0 cgz0Var, tls tlsVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-650687336);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cgz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new FeedbackKt$Tips$1$1(slsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            l690 d = an91.d(16.0f, 8.0f, 16.0f, 0.0f, 8);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new sxo(6, cgz0Var, tlsVar);
                btsVar.o0(Q2);
            }
            adb1.b(f530Var2, null, d, i43Var, null, null, false, null, (tls) Q2, btsVar, ((i2 >> 9) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 490);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) cgz0Var, tlsVar, (cms) slsVar, (Object) f530Var, i, 25);
        }
    }
}
