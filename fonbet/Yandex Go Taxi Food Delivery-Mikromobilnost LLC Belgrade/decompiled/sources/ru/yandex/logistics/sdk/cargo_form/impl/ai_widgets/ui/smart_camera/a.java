package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.smart_camera;

import defpackage.aii0;
import defpackage.azs0;
import defpackage.bts;
import defpackage.c8i0;
import defpackage.did;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.lxy0;
import defpackage.o430;
import defpackage.ppr0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.b;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(f530 f530Var, azs0 azs0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(985244987);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(azs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            boolean z = ((i2 & 7168) == 2048) | (i3 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1(azs0Var, tlsVar2, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            lvi0 lvi0Var = azs0Var.b;
            ldc ldcVar = azs0Var.c;
            if (ldcVar == null) {
                btsVar.e0(1927642147);
                long b = ((el51) btsVar.m(gl51.a)).b();
                btsVar.t(false);
                j = b;
            } else {
                btsVar.e0(1927640783);
                btsVar.t(false);
                j = ldcVar.a;
            }
            lxy0 lxy0Var = azs0Var.f;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 32);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new ppr0(22, tlsVar, azs0Var);
                btsVar.o0(Q2);
            }
            b.a(f530Var, lvi0Var, j, (sls) Q2, 300L, lxy0Var, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, azs0Var, tlsVar, tlsVar2, i, 12);
        }
    }
}
