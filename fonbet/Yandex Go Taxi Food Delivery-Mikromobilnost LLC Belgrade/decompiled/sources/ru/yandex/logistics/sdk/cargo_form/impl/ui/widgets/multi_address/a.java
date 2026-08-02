package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.hts0;
import defpackage.ivy;
import defpackage.jvs0;
import defpackage.o430;
import defpackage.q791;
import defpackage.sc20;
import defpackage.sls;
import defpackage.tls;
import defpackage.v61;
import defpackage.ve30;
import defpackage.w61;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x240;
import defpackage.xk40;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(xk40 xk40Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        androidx.compose.runtime.internal.a aVar;
        androidx.compose.runtime.internal.a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(326541521);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(xk40Var) ? 4 : 2) | i;
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
            if (z || Q == o430Var) {
                Q = new MultiAddressKt$MultiAddress$1$1(tlsVar, xk40Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            f530 m = an91.m(c530.a, 8.0f, 0.0f, 2);
            boolean z2 = i3 == 4;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new x240(13, xk40Var);
                btsVar2.o0(Q2);
            }
            f530 b = fnq0.b(m, false, (tls) Q2);
            boolean z3 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new ve30(18, tlsVar2, xk40Var);
                btsVar2.o0(Q3);
            }
            f530 d = q791.d(b, false, null, null, (sls) Q3, 15);
            hts0 hts0Var = xk40Var.e;
            if (hts0Var == null) {
                btsVar2.e0(-102013040);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(-102013039);
                androidx.compose.runtime.internal.a S = wwg.S(299984864, true, new v61(hts0Var, 3, (byte) 0), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(2080290741, true, new sc20(15, xk40Var), btsVar2);
            jvs0 jvs0Var = xk40Var.f;
            if (jvs0Var == null) {
                btsVar2.e0(-101641815);
                btsVar2.t(false);
                aVar2 = null;
            } else {
                btsVar2.e0(-101641814);
                androidx.compose.runtime.internal.a S3 = wwg.S(1628550182, true, new w61(jvs0Var, tlsVar, tlsVar2, 3), btsVar2);
                btsVar2.t(false);
                aVar2 = S3;
            }
            btsVar = btsVar2;
            web1.c(d, 0.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, null, null, false, btsVar, 1572864, 0, 7582);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(xk40Var, tlsVar, tlsVar2, i, 14);
        }
    }
}
