package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap;

import android.graphics.Bitmap;
import androidx.compose.ui.node.d;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eab1;
import defpackage.ei20;
import defpackage.el51;
import defpackage.f530;
import defpackage.fi20;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g700;
import defpackage.gi20;
import defpackage.gl51;
import defpackage.hi20;
import defpackage.ivy;
import defpackage.j4z;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.ln1;
import defpackage.mhe;
import defpackage.ntb0;
import defpackage.o430;
import defpackage.o690;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.os;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sc20;
import defpackage.sfb1;
import defpackage.sls;
import defpackage.sm91;
import defpackage.squ;
import defpackage.teb;
import defpackage.tls;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xa6;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(Bitmap bitmap, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-983357737);
        int i2 = (btsVar.e(bitmap) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean e = btsVar.e(bitmap);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ln1(bitmap, 2);
                btsVar.o0(Q);
            }
            s3b1.f(new j4z((tls) Q, new uo5(0.0f, -0.15384616f), 14), c, mhe.a, btsVar, 432, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(bitmap, i, 3);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-151966913);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 k = an91.m(c530.a, 16.0f, 0.0f, 2).k(f530Var);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            ocb1.c(fnq0.a(k, (tls) Q), 0.0f, 0L, 0L, null, 0, null, btsVar, 0, HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 24);
        }
    }

    public static final void c(f530 f530Var, byk0 byk0Var, gi20 gi20Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1866629840);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(byk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(gi20Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            o690 o690Var = gi20Var.f;
            float f = o690Var.c;
            float f2 = o690Var.d;
            float f3 = o690Var.a;
            float f4 = o690Var.b;
            c530 c530Var = c530.a;
            f530 k = an91.n(c530Var, f3, f, f4, f2).k(f530Var);
            xa6 a = eab1.a(0.5f, ((el51) btsVar.m(gl51.a)).d());
            f530 d = q791.d(aab1.b(k, a.a, a.b, byk0Var), gi20Var.i, null, null, slsVar, 14);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, d);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d3);
            a(gi20Var.d, btsVar, 0);
            ntb0 ntb0Var = gi20Var.e;
            btsVar.e0(743600846);
            f530 f5 = sm91.f(c530Var, 0.0f, 16.0f, 1);
            z910 d4 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, f5);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            sfb1.a(ntb0Var, btsVar, 0);
            btsVar.t(true);
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var, byk0Var, gi20Var, slsVar, i, 7);
        }
    }

    public static final void d(hi20 hi20Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1350699178);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hi20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = hi20Var instanceof gi20;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(-869202113);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new MiniMapWidgetRootKt$MiniMapWidgetRoot$1$1(tlsVar, hi20Var, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, zy11.a);
                btsVar.t(false);
            } else {
                btsVar.e0(-869116584);
                btsVar.t(false);
            }
            byk0 c = cyk0.c(16.0f);
            f530 l = ymb1.l(ljs0.c(ljs0.e(c530.a, 104.0f), 1.0f), c);
            btsVar.c0(941801381, hi20Var);
            if (hi20Var instanceof fi20) {
                btsVar.e0(-868864182);
                b(l, btsVar, 0);
                btsVar.t(false);
            } else if (hi20Var instanceof ei20) {
                btsVar.e0(-868712592);
                btsVar.t(false);
            } else {
                if (!z) {
                    throw unr0.y(941802026, btsVar, false);
                }
                btsVar.e0(-868618352);
                gi20 gi20Var = (gi20) hi20Var;
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == o430Var) {
                    Q2 = new g700(19, tlsVar2, hi20Var);
                    btsVar.o0(Q2);
                }
                c(l, c, gi20Var, (sls) Q2, btsVar, (i2 << 6) & 896);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(hi20Var, tlsVar, tlsVar2, i, 4);
        }
    }
}
