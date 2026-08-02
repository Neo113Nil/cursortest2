package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.eja1;
import defpackage.f0j0;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rz9;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttm;
import defpackage.w01;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import java.util.HashSet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public abstract class d {
    public static final void a(e eVar, Integer num, f530 f530Var, boolean z, boolean z2, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-174942349);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(new wu60(0L));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            int i3 = 14;
            if (Q2 == o430Var) {
                Q2 = new ttm(i3, oz40Var);
                btsVar.o0(Q2);
            }
            f530 y = eja1.y(f530Var, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, y);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new w01(22, oz40Var);
                btsVar.o0(Q3);
            }
            aVar.invoke(new f0j0(eVar, num, (sls) Q3), Boolean.valueOf(z2), btsVar, Integer.valueOf((i2 >> 9) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND));
            btsVar.t(true);
            HashSet hashSet = eVar.q;
            Boolean valueOf = Boolean.valueOf(z);
            boolean e = ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | btsVar.e(num);
            Object Q4 = btsVar.Q();
            if (e || Q4 == o430Var) {
                Q4 = new ReorderableLazyCollectionKt$ReorderableCollectionItem$3$1(z, eVar, num, null);
                btsVar.o0(Q4);
            }
            zpn.f(hashSet, valueOf, (wls) Q4, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rz9(eVar, num, f530Var, z, z2, aVar, i);
        }
    }
}
