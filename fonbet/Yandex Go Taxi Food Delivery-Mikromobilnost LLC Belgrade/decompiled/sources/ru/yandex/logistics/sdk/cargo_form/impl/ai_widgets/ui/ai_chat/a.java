package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.ai_chat;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lqa1;
import defpackage.lr20;
import defpackage.mn1;
import defpackage.n;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.s1a1;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vn1;
import defpackage.w5;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(vn1 vn1Var, float f, oz40 oz40Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1222964822);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(vn1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(oz40Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (z || Q == obj) {
                Q = new AiChatKt$AiChat$1$1(vn1Var, tlsVar2, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            uo5 uo5Var = x4c.B;
            c530 c530Var = c530.a;
            f530 g = s1a1.g(cj6Var.a(c530Var, uo5Var), 100.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, g);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == obj) {
                Q2 = new w5(5, oz40Var);
                btsVar.o0(Q2);
            }
            f530 o2 = an91.o(eja1.y(c, (tls) Q2), 0.0f, 0.0f, 8.0f, 8.0f, 3);
            lhl0 a2 = khl0.a(lr20.b, x4c.D, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            lqa1.a(vn1Var, tlsVar, btsVar, ((i2 >> 3) & 14) | ((i2 >> 9) & 112));
            n.y(btsVar, true, c530Var, f, btsVar);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mn1(vn1Var, f, oz40Var, tlsVar, tlsVar2, i);
        }
    }
}
