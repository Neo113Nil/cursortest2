package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.el51;
import defpackage.f0b1;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.he91;
import defpackage.hg21;
import defpackage.hh8;
import defpackage.jl40;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qrg;
import defpackage.r1b0;
import defpackage.r57;
import defpackage.sic;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ybu;
import defpackage.yxi;
import defpackage.zcb1;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(d dVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-98248805);
        int i2 = (btsVar.e(dVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = dVar.y;
                btsVar.o0(Q);
            }
            ybu ybuVar = (ybu) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = dVar.z;
                btsVar.o0(Q2);
            }
            yxi yxiVar = (yxi) Q2;
            oz40 b = f.b(dVar.D, btsVar);
            oz40 b2 = f.b(dVar.G, btsVar);
            f530 b3 = m4m0.b(c530.a, ((el51) btsVar.m(gl51.a)).c(), qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b3);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            f0b1.b(ybuVar, btsVar, 6);
            if (yxiVar == null) {
                btsVar.e0(-847654275);
            } else {
                btsVar.e0(-847654274);
                he91.a(yxiVar, btsVar, 0);
            }
            btsVar.t(false);
            qrg qrgVar = (qrg) b.getValue();
            if (qrgVar == null) {
                btsVar.e0(-847591407);
                btsVar.t(false);
            } else {
                btsVar.e0(-847591406);
                boolean e = btsVar.e(dVar);
                Object Q3 = btsVar.Q();
                if (e || Q3 == o430Var) {
                    ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$2$1$1 changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$1$1 = new ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$2$1$1(1, dVar, d.class, "onDateChanged", "onDateChanged(I)V", 0);
                    btsVar.o0(changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$1$1);
                    Q3 = changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$1$1;
                }
                tls tlsVar = (tls) ((tfx) Q3);
                boolean e2 = btsVar.e(dVar);
                Object Q4 = btsVar.Q();
                if (e2 || Q4 == o430Var) {
                    ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$2$2$1 changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$2$1 = new ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$2$2$1(1, dVar, d.class, "onTimeChanged", "onTimeChanged(I)V", 0);
                    btsVar.o0(changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$2$1);
                    Q4 = changeDateTimeScreenKt$ChangeDateTimeScreen$1$2$2$1;
                }
                hg21.a(qrgVar, tlsVar, (tls) ((tfx) Q4), btsVar, 0);
                btsVar.t(false);
            }
            r57 r57Var = (r57) b2.getValue();
            boolean e3 = btsVar.e(dVar);
            Object Q5 = btsVar.Q();
            if (e3 || Q5 == o430Var) {
                ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$3$1 changeDateTimeScreenKt$ChangeDateTimeScreen$1$3$1 = new ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$3$1(0, dVar, d.class, "onCancelClicked", "onCancelClicked()V", 0);
                btsVar.o0(changeDateTimeScreenKt$ChangeDateTimeScreen$1$3$1);
                Q5 = changeDateTimeScreenKt$ChangeDateTimeScreen$1$3$1;
            }
            sls slsVar2 = (sls) ((tfx) Q5);
            boolean e4 = btsVar.e(dVar);
            Object Q6 = btsVar.Q();
            if (e4 || Q6 == o430Var) {
                ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1 changeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1 = new ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1(0, dVar, d.class, "onDoneClicked", "onDoneClicked()V", 0);
                btsVar.o0(changeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1);
                Q6 = changeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1;
            }
            zcb1.b(r57Var, slsVar2, (sls) ((tfx) Q6), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(dVar, i, 11);
        }
    }
}
