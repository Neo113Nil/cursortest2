package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.comment;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cms;
import defpackage.did;
import defpackage.dmh;
import defpackage.dv9;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.g0;
import defpackage.gl51;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lmc;
import defpackage.ly3;
import defpackage.o430;
import defpackage.qm51;
import defpackage.sls;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.wls;
import defpackage.x5d;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(lmc lmcVar, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1643874523);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(lmcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new CommentKt$Comment$1$1(slsVar2, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q2;
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2);
            String str = lmcVar.c;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            byk0 b = ((YandexShapes) btsVar2.m(qm51.a)).b();
            long d = ((el51) btsVar2.m(gl51.a)).d();
            long j = ldc.l;
            dmh d2 = tlb1.d(d, 0L, j, j, 0L, 0L, btsVar2, 14155782, 2097051);
            boolean z2 = (i2 & 112) == 32;
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new dv9(20, tlsVar);
                btsVar2.o0(Q3);
            }
            x5d.a.getClass();
            tlb1.b(str2, (tls) Q3, m, false, false, null, null, x5d.b, false, null, null, null, false, 0, zx40Var, b, d2, null, btsVar2, 12583296, 1572864, 589688);
            btsVar = btsVar2;
            if (((Boolean) androidx.compose.foundation.interaction.a.c(zx40Var, btsVar).getValue()).booleanValue()) {
                slsVar.invoke();
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) lmcVar, tlsVar, (cms) slsVar, (Object) slsVar2, i, 12);
        }
    }
}
