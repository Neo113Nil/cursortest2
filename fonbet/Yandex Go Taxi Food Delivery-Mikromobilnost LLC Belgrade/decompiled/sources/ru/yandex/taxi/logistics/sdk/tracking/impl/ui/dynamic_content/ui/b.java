package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dzm;
import defpackage.el51;
import defpackage.f530;
import defpackage.f6n;
import defpackage.fid;
import defpackage.g0;
import defpackage.gji0;
import defpackage.gl51;
import defpackage.gv90;
import defpackage.h6n;
import defpackage.i6n;
import defpackage.j6n;
import defpackage.k9j;
import defpackage.l27;
import defpackage.ldc;
import defpackage.mu90;
import defpackage.nfj;
import defpackage.o430;
import defpackage.ocb1;
import defpackage.ota;
import defpackage.q0;
import defpackage.qke;
import defpackage.sls;
import defpackage.tls;
import defpackage.v4v;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(f6n f6nVar, f530 f530Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(835330973);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(f6nVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (btsVar2.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new DynamicContentPostcardKt$DynamicContentPostcard$1$1(slsVar2, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            gji0 gji0Var = qke.q;
            long j = ldc.l;
            boolean z = (i3 & 14) == 4;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new dzm(2, f6nVar);
                btsVar2.o0(Q2);
            }
            l27 l27Var = new l27((tls) Q2);
            androidx.compose.runtime.internal.a S = wwg.S(870321820, true, new ota(f6nVar), btsVar2);
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar, c530Var, gji0Var, j, 0L, null, null, null, false, null, null, l27Var, S, btsVar, 3510, 384, 2032);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(f6nVar, f530Var2, slsVar, slsVar2, i, 22);
        }
    }

    public static final void b(j6n j6nVar, f530 f530Var, tls tlsVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(74284336);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(j6nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar2.V(i3 & 1, (i3 & 1171) != 1170)) {
            String str = j6nVar.c;
            i6n i6nVar = j6nVar.d;
            boolean z = j6nVar.e;
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            web1.c(ocb1.f(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), z, btsVar2, 0), 0.0f, false, 0.0f, null, null, wwg.S(-983236332, true, new q0(str, 22), btsVar2), null, null, wwg.S(-1623364777, true, new h6n(i6nVar, tlsVar, slsVar), btsVar2), null, null, false, btsVar, 806879232, 0, 7614);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) j6nVar, tlsVar, (Object) f530Var2, (Object) slsVar, i, 23);
        }
    }

    public static final void c(i6n i6nVar, tls tlsVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1386245732);
        int i2 = (btsVar2.e(i6nVar) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            String str = i6nVar.a;
            v4v v4vVar = i6nVar.b;
            gv90 gv90Var = i6nVar.d;
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new DynamicContentSectionHeaderKt$TrailButton$1$1(slsVar, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            boolean z2 = gv90Var instanceof mu90 ? ((mu90) gv90Var).b : true;
            boolean e = btsVar2.e(gv90Var) | ((i2 & 112) == 32);
            Object Q2 = btsVar2.Q();
            if (e || Q2 == o430Var) {
                Q2 = new k9j(tlsVar, gv90Var, 1);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, null, cyk0.c(100.0f), ((el51) btsVar2.m(gl51.a)).g(), 0L, null, null, null, z2, null, null, null, wwg.S(-1357110267, true, new nfj(4, v4vVar, str), btsVar2), btsVar, 0, 384, 3826);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new h6n(i6nVar, tlsVar, slsVar, i);
        }
    }
}
