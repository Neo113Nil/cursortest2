package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method;

import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.gji0;
import defpackage.h6a0;
import defpackage.ivy;
import defpackage.ldc;
import defpackage.ls40;
import defpackage.o430;
import defpackage.qke;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xw90;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(h6a0 h6a0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1228985675);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(h6a0Var) ? 4 : 2) | i;
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
                Q = new PaymentMethodKt$PaymentMethod$1$1(tlsVar, h6a0Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            gji0 gji0Var = qke.q;
            long j = ldc.l;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new xw90(tlsVar2, 6, h6a0Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, null, gji0Var, j, 0L, null, null, null, false, null, null, null, wwg.S(622181620, true, new ls40(h6a0Var, tlsVar, tlsVar2, 3), btsVar2), btsVar, 3456, 384, 4082);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(h6a0Var, tlsVar, tlsVar2, i, 24);
        }
    }
}
