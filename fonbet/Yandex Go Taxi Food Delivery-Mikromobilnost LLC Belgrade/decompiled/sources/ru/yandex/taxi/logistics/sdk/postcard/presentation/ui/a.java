package ru.yandex.taxi.logistics.sdk.postcard.presentation.ui;

import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dl51;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.g990;
import defpackage.gl51;
import defpackage.gxv;
import defpackage.i43;
import defpackage.ivy;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.mad;
import defpackage.mfe0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.o4b1;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.on70;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.q12;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.qti;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.ra3;
import defpackage.sa3;
import defpackage.sic;
import defpackage.sls;
import defpackage.ta3;
import defpackage.ua3;
import defpackage.unr0;
import defpackage.uzg0;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.yfe0;
import defpackage.ymb1;
import defpackage.yr7;
import defpackage.z910;
import defpackage.zhb0;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(yfe0 yfe0Var, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(106505214);
        int i2 = i | (btsVar.k(yfe0Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128) | (btsVar.e(slsVar3) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar4 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
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
            c(yfe0Var.a, yfe0Var.c, yfe0Var.b, slsVar2, slsVar3, btsVar, 64512 & (i2 << 3));
            if (yfe0Var.d) {
                btsVar.e0(1808713596);
                b(slsVar, btsVar, (i2 >> 3) & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(1808803930);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(yfe0Var, slsVar, slsVar2, slsVar3, i, 3);
        }
    }

    public static final void b(sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1224956745);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.e(slsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = ljs0.c(ljs0.e(an91.k(c530.a, 8.0f), 56.0f), 1.0f);
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            mad.a.getClass();
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar, c, b, 0L, 0L, null, false, null, null, null, mad.b, btsVar, i2 & 14, 4088);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yr7(slsVar, i, 1);
        }
    }

    public static final void c(String str, String str2, String str3, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(960444973);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ru.yandex.taxi.logistics.sdk.ui.component.icon.b b = ua3.b(str, null, slsVar2, btsVar, 6);
            ta3 k = b.k();
            if (k instanceof ra3) {
                btsVar.e0(-455581845);
                e(btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(k instanceof sa3)) {
                    throw unr0.y(-430339792, btsVar, false);
                }
                btsVar.e0(-455492503);
                d(b, str2, str3, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                boolean z = (i2 & 7168) == 2048;
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new PostcardPresentationKt$PostcardContent$1$1(slsVar, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, zy11.a);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0((Object) str, (Object) str2, (Object) str3, (Object) slsVar, (Object) slsVar2, i, 0);
        }
    }

    public static final void d(ru.yandex.taxi.logistics.sdk.ui.component.icon.b bVar, String str, String str2, fid fidVar, int i) {
        int i2;
        String str3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(546273775);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= btsVar.k(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            o4b1.b(bVar, str3, ymb1.l(on70.a(c530Var, 1.0f).k(ljs0.c), ((YandexShapes) btsVar.m(qm51.a)).a()), null, mhe.g, 0.0f, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i2 & 112), 104);
            f(str2, cj6.a.a(c530Var, x4c.B), btsVar, (i2 >> 6) & 14, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(bVar, str, str2, i, 27);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-239344460);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            a7u0 a7u0Var = qm51.a;
            byk0 b = ((YandexShapes) btsVar.m(a7u0Var)).b();
            c530 c530Var = c530.a;
            f530 l = ymb1.l(c530Var, b);
            a7u0 a7u0Var2 = gl51.a;
            f530 e = ljs0.e(m4m0.b(l, ((el51) btsVar.m(a7u0Var2)).g(), qke.q), 16.0f);
            f530 a = on70.a(c530Var, 1.0f);
            k3r k3rVar = ljs0.c;
            f530 l2 = ymb1.l(m4m0.b(a.k(k3rVar), ((el51) btsVar.m(a7u0Var2)).c(), ((YandexShapes) btsVar.m(a7u0Var)).a()), ((YandexShapes) btsVar.m(a7u0Var)).a());
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, l2);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 o2 = an91.o(c530Var, 16.0f, 20.0f, 16.0f, 0.0f, 8);
            sic a2 = qic.a(new i43(10.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            pi6.a(ljs0.q(e, 164.0f), btsVar, 0);
            pi6.a(ljs0.q(e, 82.0f), btsVar, 0);
            pi6.a(ljs0.q(e, 123.0f), btsVar, 0);
            btsVar.t(true);
            ocb1.b(k3rVar, 0.0f, ((Boolean) btsVar.m(qti.e)).booleanValue() ? dl51.j : dl51.c, ldc.l, null, 1250, null, btsVar, 199686, 82);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g990(i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-947946671);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = i | (btsVar.k(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i3;
            if (btsVar.V(i4 & 1, (i4 & 19) == 18)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                c530 c530Var = c530.a;
                f530 f530Var4 = i5 != 0 ? c530Var : f530Var2;
                f530 o = an91.o(ljs0.c(f530Var4, 1.0f), 12.0f, 0.0f, 12.0f, 12.0f, 2);
                lhl0 a = khl0.a(lr20.g, x4c.E, btsVar, 54);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d = androidx.compose.ui.b.d(btsVar, o);
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
                qje.W(btsVar, wlsVar2, o2);
                wls wlsVar3 = androidx.compose.ui.node.d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar3);
                }
                wls wlsVar4 = androidx.compose.ui.node.d.d;
                qje.W(btsVar, wlsVar4, d);
                pa90 m = mt71.m(uzg0.postcard_delivery_logo, 0, btsVar);
                f530 e = ljs0.e(c530Var, 26.5f);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                o4b1.b(m, null, e.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), null, null, 0.0f, null, btsVar, 48, 120);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                f530 l = ymb1.l(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), cyk0.c(12.0f));
                long j = ldc.f;
                f530 b = m4m0.b(l, ldc.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), qke.q);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar, b);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d2);
                qje.W(btsVar, wlsVar2, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d3);
                ymb1.e(str, cj6.a.a(an91.l(c530Var, 8.0f, 6.0f), x4c.y), j, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i4 & 14) | 24960, HProv.ALG_TYPE_SECURECHANNEL, 57320);
                btsVar = btsVar;
                btsVar.t(true);
                btsVar.t(true);
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new q12(i, i2, 8, str, f530Var3);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 19) == 18)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
