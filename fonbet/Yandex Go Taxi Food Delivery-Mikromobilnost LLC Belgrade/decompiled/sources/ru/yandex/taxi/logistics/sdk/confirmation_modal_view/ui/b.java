package ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui;

import defpackage.a4e;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b4e;
import defpackage.b64;
import defpackage.bts;
import defpackage.c4e;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cms;
import defpackage.did;
import defpackage.e4e;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.hi91;
import defpackage.j330;
import defpackage.jc0;
import defpackage.jl40;
import defpackage.k330;
import defpackage.l330;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lvi0;
import defpackage.lzr;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rb0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(e4e e4eVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1425075471);
        int i2 = (btsVar2.k(e4eVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new jc0(18, slsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, ljs0.e(ljs0.c(an91.o(c530.a, 8.0f, 8.0f, 8.0f, 0.0f, 8), 1.0f), 56.0f), null, 0L, 0L, null, null, null, false, null, null, null, wwg.S(-2125087120, true, new b4e(e4eVar, 1), btsVar2), btsVar, 0, 384, 4092);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c4e(e4eVar, slsVar, i, 1);
        }
    }

    public static final void b(e4e e4eVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(694200663);
        int i2 = i | (btsVar2.k(e4eVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar, ljs0.e(ljs0.c(an91.o(c530.a, 8.0f, 4.0f, 8.0f, 0.0f, 8), 1.0f), 56.0f), null, ((el51) btsVar2.m(gl51.a)).f(), 0L, null, null, null, true, null, null, null, wwg.S(-808016264, true, new b4e(e4eVar, 0), btsVar2), btsVar, ((i2 >> 3) & 14) | 100663296, 384, 3828);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c4e(e4eVar, slsVar, i, 0);
        }
    }

    public static final void c(e4e e4eVar, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-535701130);
        int i2 = i | (btsVar.k(e4eVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128) | (btsVar.e(slsVar3) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ConfirmationModalViewScreenKt$ConfirmationModalViewScreen$1$1(slsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            int i3 = i2 & 14;
            int i4 = i3 | 48;
            e(e4eVar, hi91.d(ljs0.c(an91.n(c530Var, 16.0f, 8.0f, 16.0f, 12.0f), 1.0f), false, null, 3), btsVar, i4);
            d(e4eVar, ljs0.c(an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), 1.0f), btsVar, i4);
            a(e4eVar, slsVar3, btsVar, ((i2 >> 6) & 112) | i3);
            b(e4eVar, slsVar2, btsVar, ((i2 >> 3) & 112) | i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) e4eVar, (Object) slsVar, (cms) slsVar2, (cms) slsVar3, i, 19);
        }
    }

    public static final void d(e4e e4eVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(830687918);
        int i2 = (btsVar.k(e4eVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            l330 l330Var = e4eVar.c;
            if (l330Var instanceof k330) {
                btsVar.e0(-577617154);
                ymb1.e(((k330) l330Var).a, f530Var, ((el51) btsVar.m(gl51.a)).n(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 48, 0, 65528);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (l330Var instanceof j330) {
                btsVar.e0(-577398852);
                zgb1.a(((j330) l330Var).a, f530Var, 8388611, false, null, null, false, null, btsVar, 432, 248);
                btsVar.t(false);
            } else {
                if (l330Var != null) {
                    throw unr0.y(-572824146, btsVar, false);
                }
                btsVar.e0(-577225934);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a4e(e4eVar, f530Var, i, 1);
        }
    }

    public static final void e(e4e e4eVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        zy11 zy11Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1840120611);
        int i3 = (btsVar.k(e4eVar) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            lvi0 lvi0Var = e4eVar.a;
            l330 l330Var = e4eVar.b;
            c530 c530Var = c530.a;
            if (lvi0Var == null) {
                btsVar.e0(-1929318044);
                btsVar.t(false);
                zy11Var = null;
            } else {
                btsVar.e0(-1929318043);
                s3b1.f(lvi0Var, ljs0.e(ljs0.c(c530Var, 1.0f), 200.0f), null, btsVar, 48, 4);
                btsVar.t(false);
                zy11Var = zy11.a;
            }
            if (zy11Var == null) {
                tse0.s(btsVar, -1170609781, c530Var, 8.0f, btsVar);
            } else {
                btsVar.e0(-1170615268);
            }
            btsVar.t(false);
            if (l330Var instanceof k330) {
                btsVar.e0(-1929040903);
                i2 = 0;
                ymb1.j(((k330) l330Var).a, f530Var, ((el51) btsVar.m(gl51.a)).n(), null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 24624, 0, 65512);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                i2 = 0;
                if (!(l330Var instanceof j330)) {
                    throw unr0.y(-1170607804, btsVar, false);
                }
                btsVar.e0(-1928774427);
                zgb1.a(((j330) l330Var).a, f530Var, 8388611, true, null, null, false, null, btsVar, 3504, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a4e(e4eVar, f530Var, i, i2);
        }
    }
}
