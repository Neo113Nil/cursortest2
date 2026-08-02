package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.hts0;
import defpackage.j0;
import defpackage.jvs0;
import defpackage.ku0;
import defpackage.ly3;
import defpackage.o430;
import defpackage.oa01;
import defpackage.q791;
import defpackage.sls;
import defpackage.tls;
import defpackage.tn1;
import defpackage.v61;
import defpackage.w61;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x61;
import defpackage.y4;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(x61 x61Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        androidx.compose.runtime.internal.a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-766111285);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(x61Var) ? 4 : 2) | i;
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
            androidx.compose.runtime.internal.a aVar2 = null;
            if (z || Q == o430Var) {
                Q = new AddressSelectorKt$AddressSelector$1$1(tlsVar, x61Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q2;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new j0(18, tlsVar2, x61Var);
                btsVar2.o0(Q3);
            }
            f530 j = an91.j(q791.b(c530.a, zx40Var, null, false, null, null, (sls) Q3, 28), x61Var.k);
            boolean z3 = i3 == 4;
            Object Q4 = btsVar2.Q();
            if (z3 || Q4 == o430Var) {
                Q4 = new y4(26, x61Var);
                btsVar2.o0(Q4);
            }
            f530 b = fnq0.b(j, false, (tls) Q4);
            hts0 hts0Var = x61Var.g;
            if (hts0Var == null) {
                btsVar2.e0(235743862);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(235743863);
                androidx.compose.runtime.internal.a S = wwg.S(1434171994, true, new v61(hts0Var, 0, (byte) 0), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(1579086511, true, new tn1(11, x61Var), btsVar2);
            jvs0 jvs0Var = x61Var.h;
            if (jvs0Var == null) {
                btsVar2.e0(236507764);
                btsVar2.t(false);
            } else {
                btsVar2.e0(236507765);
                aVar2 = wwg.S(2054016416, true, new w61(jvs0Var, tlsVar, tlsVar2, 0), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(b, 0.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, null, oa01.d, false, btsVar, 1572864, 0, 5534);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(x61Var, tlsVar, tlsVar2, i, 4);
        }
    }
}
