package defpackage;

import android.os.Bundle;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public abstract class u7a1 {
    public static final void a(l611 l611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1951884796);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(l611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean k = btsVar.k(l611Var.d);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                MtTransportType mtTransportType = MtTransportType.UNKNOWN;
                String str = l611Var.d;
                ib11 ib11Var = new ib11(mtTransportType, "", new cdc(rzo.X(fq2.b)), new bdc(xng0.textMain), null, null, (str == null || evu0.J(str)) ? CA20Status.STATUS_REQUEST_P : "", false, false, null, null, null, 4016);
                btsVar.o0(ib11Var);
                Q = ib11Var;
            }
            ib11 ib11Var2 = (ib11) Q;
            ety0 ety0Var = xya1.d(btsVar).f.c;
            String str2 = l611Var.b;
            boolean e = btsVar.e(l611Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new dzm(7, l611Var);
                btsVar.o0(Q2);
            }
            a5l0.d(str2, fnq0.a(f530Var, (tls) Q2), 0.0f, 0.0f, null, 0.0f, ety0Var, null, wwg.S(-2023091202, true, new ota(26, l611Var), btsVar), wwg.S(352536596, true, new gxm(i3, l611Var, ety0Var, ib11Var2), btsVar), btsVar, 905969664, 188);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(l611Var, f530Var, i, 18);
        }
    }

    public static final void b(final double d, final rg90 rg90Var, final f530 f530Var, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1381342738);
        int i2 = (btsVar.j(d) ? 4 : 2) | i | (btsVar.k(rg90Var) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 e = ljs0.e(ljs0.c(f530Var, 1.0f), 8.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new a9s(rg90Var, d, i3);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, e);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(d, rg90Var, f530Var, i) { // from class: rhf0
                public final /* synthetic */ double a;
                public final /* synthetic */ rg90 b;
                public final /* synthetic */ f530 c;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    u7a1.b(this.a, this.b, this.c, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(dif0 dif0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(163373680);
        int i2 = (btsVar.k(dif0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            to5 to5Var = x4c.E;
            i43 i43Var = new i43(8.0f, true, new quz(11));
            l690 l690Var = dif0Var.e;
            c530 c530Var = c530.a;
            f530 j = an91.j(c530Var, l690Var);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new odf0(i3, dif0Var);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(j, false, (tls) Q);
            lhl0 a = khl0.a(i43Var, to5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            b(dif0Var.b, dif0Var.d, ljs0.c(c530Var, 1.0f).k(new x2y(1.0f, true)), btsVar, 0);
            CharSequence charSequence = dif0Var.a;
            if (charSequence == null || evu0.J(charSequence)) {
                btsVar.e0(1254223990);
                btsVar.t(false);
            } else {
                btsVar.e0(1254179784);
                zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(dif0Var, i, 7);
        }
    }

    public static final void d(f530 f530Var, y9o y9oVar, float f, f530 f530Var2, fid fidVar, int i) {
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1255731944);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(y9oVar) ? 32 : 16) | (btsVar.b(f) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ldf ldfVar = ubn.a;
            float a = ldfVar.a(y6i0.c(((1.0f - f) - 0.4f) / 0.6f, 0.0f, 1.0f));
            float a2 = ldfVar.a(y6i0.c((f - 0.4f) / 0.6f, 0.0f, 1.0f));
            f530 k = f530Var.k(ljs0.c);
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            int i3 = (i2 >> 3) & 14;
            oe91.a(y9oVar, tra1.b(cj6Var.a(c530Var, uo5Var).k(c530Var), a), btsVar, i3);
            re91.e(y9oVar, tra1.b(cj6Var.a(c530Var, x4c.y), a2), btsVar, i3);
            btsVar.t(true);
            f530Var3 = c530Var;
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zvc(f530Var, y9oVar, f, f530Var3, i);
        }
    }

    public static final ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h671 h671Var = (h671) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", h671Var.a());
            bundle.putLong("event_timestamp", h671Var.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final void f(ArrayList arrayList) {
        arrayList.add(new h371(System.currentTimeMillis()));
    }

    public static final void g(qam qamVar, long j, float f, float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        qam.g0(qamVar, j, floatToRawIntBits, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    }
}
