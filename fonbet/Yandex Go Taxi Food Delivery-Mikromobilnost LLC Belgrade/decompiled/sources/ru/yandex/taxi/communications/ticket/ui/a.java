package ru.yandex.taxi.communications.ticket.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import com.airbnb.lottie.AsyncUpdates;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.c5a1;
import defpackage.did;
import defpackage.epb1;
import defpackage.f530;
import defpackage.fgd;
import defpackage.fid;
import defpackage.g3z;
import defpackage.h1u;
import defpackage.hc0;
import defpackage.k3r;
import defpackage.k651;
import defpackage.k6w;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.nsz;
import defpackage.oz40;
import defpackage.q2z0;
import defpackage.r2z0;
import defpackage.s1a1;
import defpackage.scx0;
import defpackage.sm91;
import defpackage.tje;
import defpackage.tls;
import defpackage.u9b1;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.x3z0;
import defpackage.xab1;
import defpackage.xp5;
import defpackage.ya2;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.ticket.ui.component.TicketCardType;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(f530 f530Var, x3z0 x3z0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1609511851);
        int i2 = i | 6 | (btsVar.k(x3z0Var) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530Var2 = c530.a;
            epb1.b(s1a1.g(an91.m(f530Var2, 24.0f, 0.0f, 2), -1.0f), tje.n(x3z0Var.g, btsVar), TicketCardType.BottomCard, x3z0Var.m, wwg.S(-1857749725, true, new q2z0(z, x3z0Var, tlsVar), btsVar), btsVar, 24960);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(f530Var2, x3z0Var, z, tlsVar, i);
        }
    }

    public static final void b(x3z0 x3z0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(983985593);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(x3z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            k651 k651Var = (k651) btsVar2.m(j.u);
            int a = (int) (k651Var.a() >> 32);
            int a2 = (int) (k651Var.a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            boolean d = u9b1.d(tje.n(x3z0Var.g, btsVar2));
            Object Q = btsVar2.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == obj) {
                Q2 = f.j(new wu60(0L));
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == obj) {
                Q3 = f.j(new k6w(0L));
                btsVar2.o0(Q3);
            }
            oz40 oz40Var3 = (oz40) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == obj) {
                Q4 = f.j(Boolean.FALSE);
                btsVar2.o0(Q4);
            }
            oz40 oz40Var4 = (oz40) Q4;
            boolean z = (i2 & 112) == 32;
            Object Q5 = btsVar2.Q();
            if (z || Q5 == obj) {
                Q5 = new TicketScreenKt$TicketScreen$1$1(tlsVar, oz40Var, null);
                btsVar2.o0(Q5);
            }
            zpn.e(btsVar2, (wls) Q5, zy11.a);
            fgd fgdVar = (fgd) btsVar2.m(g3z.a);
            Set set = x3z0Var.h;
            boolean e = ((i2 & 14) == 4) | btsVar2.e(fgdVar);
            Object Q6 = btsVar2.Q();
            if (e || Q6 == obj) {
                f530Var = null;
                Q6 = new TicketScreenKt$TicketScreen$2$1(x3z0Var, fgdVar, null);
                btsVar2.o0(Q6);
            } else {
                f530Var = null;
            }
            zpn.e(btsVar2, (wls) Q6, set);
            c5a1.a(f530Var, wwg.S(429107983, true, new ya2(x3z0Var, d, tlsVar, oz40Var2, oz40Var3, oz40Var4), btsVar2), btsVar2, 48);
            if (x3z0Var.n == null || !((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar = btsVar2;
                btsVar.e0(765864809);
                btsVar.t(false);
            } else {
                btsVar2.e0(765395717);
                nsz nszVar = x3z0Var.n;
                k3r k3rVar = ljs0.c;
                boolean c = btsVar2.c(a) | btsVar2.c(a2);
                Object Q7 = btsVar2.Q();
                if (c || Q7 == obj) {
                    Q7 = new h1u(a, a2, oz40Var2, oz40Var3);
                    btsVar2.o0(Q7);
                }
                com.airbnb.lottie.compose.a.b(nszVar, sm91.d(k3rVar, (tls) Q7), false, false, 0.0f, 0, false, false, false, false, null, false, false, null, null, mhe.b, false, false, null, false, AsyncUpdates.ENABLED, btsVar2, 805306368, 1572864, 48, 2031100);
                btsVar = btsVar2;
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(x3z0Var, tlsVar, i, 5);
        }
    }

    public static final void c(f530 f530Var, x3z0 x3z0Var, boolean z, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        tls tlsVar3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-633354452);
        int i2 = i | 6 | (btsVar.k(x3z0Var) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530Var2 = c530.a;
            tlsVar3 = tlsVar2;
            xab1.a(an91.m(ljs0.c(f530Var2, 1.0f), 24.0f, 0.0f, 2), null, wwg.S(-43571562, true, new xp5(x3z0Var, tlsVar, tlsVar2, z), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            tlsVar3 = tlsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(f530Var2, x3z0Var, z, tlsVar, tlsVar3, i, 14);
        }
    }
}
