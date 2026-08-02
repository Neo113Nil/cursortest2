package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cib1;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g43;
import defpackage.hts0;
import defpackage.i9a;
import defpackage.jhd;
import defpackage.jl40;
import defpackage.jvs0;
import defpackage.lr20;
import defpackage.o430;
import defpackage.oa01;
import defpackage.oae;
import defpackage.ohd;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.s09;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.unr0;
import defpackage.v61;
import defpackage.vqb;
import defpackage.w61;
import defpackage.wbe;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xbe;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(oae oaeVar, fid fidVar, int i) {
        String str;
        so5 so5Var = x4c.G;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1119663524);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(oaeVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel = oaeVar.e;
            String str2 = oaeVar.c;
            CharSequence charSequence = oaeVar.d;
            int i3 = xbe.a[contactSelectorRemoteCoreWidget$ContactPositionModel.ordinal()];
            c530 c530Var = c530.a;
            g43 g43Var = lr20.c;
            if (i3 == 1) {
                btsVar.e0(-1179886253);
                sic a = qic.a(g43Var, so5Var, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d);
                if (str2 == null) {
                    btsVar.e0(-81000189);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-81000188);
                    cib1.d(str2, null, oaeVar.f, null, 0, 0, btsVar, 0, 58);
                    btsVar = btsVar;
                    btsVar.t(false);
                }
                if (charSequence == null) {
                    btsVar.e0(-80843112);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-80843111);
                    zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                    btsVar.t(false);
                }
                btsVar.t(true);
                btsVar.t(false);
            } else if (i3 == 2) {
                btsVar.e0(-1179507309);
                sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
                qje.W(btsVar, d.f, a2);
                qje.W(btsVar, d.e, o2);
                wls wlsVar2 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar2);
                }
                qje.W(btsVar, d.d, d2);
                if (charSequence == null) {
                    btsVar.e0(-1675609297);
                    btsVar.t(false);
                    str = str2;
                } else {
                    btsVar.e0(-1675609296);
                    str = str2;
                    zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                    btsVar.t(false);
                }
                if (str == null) {
                    btsVar.e0(-1675475718);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1675475717);
                    cib1.d(str, null, oaeVar.f, null, 0, 0, btsVar, 0, 58);
                    btsVar = btsVar;
                    btsVar.t(false);
                }
                btsVar.t(true);
                btsVar.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(2040147344, btsVar, false);
                }
                btsVar.e0(-1179099473);
                if (charSequence == null) {
                    btsVar.e0(-1179099474);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1179099473);
                    zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                    btsVar.t(false);
                }
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wbe(oaeVar, i);
        }
    }

    public static final void b(oae oaeVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        androidx.compose.runtime.internal.a aVar;
        androidx.compose.runtime.internal.a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(532802731);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(oaeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            androidx.compose.runtime.internal.a aVar3 = null;
            if (z || Q == o430Var) {
                Q = new ContactSelectorWidgetKt$ContactField$1$1(tlsVar, oaeVar, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            awk0 awk0Var = new awk0(0);
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new jhd(7, tlsVar2, oaeVar);
                btsVar2.o0(Q2);
            }
            f530 j = an91.j(q791.d(c530.a, false, null, awk0Var, (sls) Q2, 11), oaeVar.i);
            boolean z3 = i3 == 4;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new vqb(22, oaeVar);
                btsVar2.o0(Q3);
            }
            f530 a = fnq0.a(j, (tls) Q3);
            hts0 hts0Var = oaeVar.g;
            if (hts0Var == null) {
                btsVar2.e0(-1472276362);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(-1472276361);
                androidx.compose.runtime.internal.a S = wwg.S(1895902074, true, new v61(hts0Var, 1, (byte) 0), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(275410063, true, new wbe(oaeVar), btsVar2);
            String str = oaeVar.c;
            if (str == null || oaeVar.e != ContactSelectorRemoteCoreWidget$ContactPositionModel.TRAIL) {
                str = null;
            }
            if (str == null) {
                btsVar2.e0(-1472051674);
                btsVar2.t(false);
                aVar2 = null;
            } else {
                btsVar2.e0(-1472051673);
                androidx.compose.runtime.internal.a S3 = wwg.S(-712589434, true, new i9a(27, str, oaeVar), btsVar2);
                btsVar2.t(false);
                aVar2 = S3;
            }
            jvs0 jvs0Var = oaeVar.h;
            if (jvs0Var == null) {
                btsVar2.e0(-1471896364);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1471896363);
                aVar3 = wwg.S(105107776, true, new w61(jvs0Var, tlsVar, tlsVar2, 1), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(a, 0.0f, false, 0.0f, null, aVar, S2, null, aVar2, aVar3, null, oa01.d, false, btsVar, 1572864, 384, 1182);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) oaeVar, (Object) tlsVar, (Object) tlsVar2, i, 16);
        }
    }
}
