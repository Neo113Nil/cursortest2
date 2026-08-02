package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cuj0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dl51;
import defpackage.dmw0;
import defpackage.e3o0;
import defpackage.f530;
import defpackage.fid;
import defpackage.id00;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.n;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qxh0;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.tra1;
import defpackage.uh6;
import defpackage.uo5;
import defpackage.wls;
import defpackage.wzg0;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zez0;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(ldc ldcVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(896815432);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(ldcVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = id00.a(0.0f);
                btsVar.o0(Q);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
            long j = ldcVar != null ? ldcVar.a : dl51.l;
            boolean e = btsVar.e(aVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1(aVar, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            f530 b = tra1.b(m4m0.b(ljs0.c, j, qke.q), ((Number) aVar.e()).floatValue());
            uo5 uo5Var = x4c.y;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
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
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            long j2 = j;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
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
            f530 m = ljs0.m(c530Var, 60.0f);
            long j3 = ldc.f;
            f530 b2 = m4m0.b(m, j3, cyk0.c(16.0f));
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, b2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            s3b1.f(new cuj0(wzg0.ic_delivery_smartcam, null, null, new zez0(j2), 22), null, null, btsVar, 0, 6);
            n.y(btsVar, true, c530Var, 16.0f, btsVar);
            ymb1.j(ohb1.e(btsVar, qxh0.cargoform_smart_camera_loading_title), null, j3, null, lzr.G, 0L, uh6.E(28), 0L, null, 0, false, 0, null, null, btsVar, 12607872, 0, 65386);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(ldcVar, i, 26);
        }
    }
}
