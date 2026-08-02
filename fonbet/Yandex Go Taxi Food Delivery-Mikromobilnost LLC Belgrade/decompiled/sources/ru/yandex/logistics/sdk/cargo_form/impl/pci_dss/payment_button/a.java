package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button;

import defpackage.aii0;
import defpackage.bm50;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.dx90;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.ivy;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.wg30;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(dx90 dx90Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        long j;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1241934131);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(dx90Var) ? 4 : 2) | i;
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
            boolean z = ((i2 & 896) == 256) | (i3 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new PaymentButtonKt$PaymentButton$1$1(tlsVar2, dx90Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            f530 c = ljs0.c(c530.a, 1.0f);
            ldc ldcVar = dx90Var.h;
            if (ldcVar == null) {
                btsVar2.e0(-502195585);
                j = ((el51) btsVar2.m(gl51.a)).g();
                btsVar2.t(false);
            } else {
                btsVar2.e0(-502196949);
                btsVar2.t(false);
                j = ldcVar.a;
            }
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new bm50(28, tlsVar, dx90Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, c, null, j, 0L, null, null, null, true, null, null, null, wwg.S(-1201865870, true, new wg30(25, dx90Var), btsVar2), btsVar, 100663344, 384, 3828);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(dx90Var, tlsVar, tlsVar2, i, 22);
        }
    }
}
