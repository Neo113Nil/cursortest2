package defpackage;

import android.os.LocaleList;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tfb1 {
    public static final void a(p7u0 p7u0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-617020470);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(p7u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 256 : 128;
        } else {
            f530Var2 = f530Var;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ydb1.a(q791.b(f530Var2, null, null, false, null, new awk0(0), slsVar, 12), wwg.S(-463352608, true, new ays0(i3, p7u0Var, ljs0.m(an91.k(c530.a, 16.0f), 24.0f)), btsVar), wwg.S(-1631277221, true, new w7o0(23, p7u0Var), btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(p7u0Var, slsVar, f530Var, i, 18);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2034303946);
        int i2 = 1;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            vdd.a.getClass();
            f530Var2 = f530Var;
            ydb1.a(f530Var2, vdd.b, vdd.c, null, null, null, null, false, btsVar, 438, 248);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new orq0(f530Var2, i, i2);
        }
    }

    public static final void c(q7u0 q7u0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1696228300);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(q7u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ydb1.a(q791.b(f530Var, null, null, false, null, new awk0(0), slsVar, 12), wwg.S(1985789130, true, new ays0(3, q7u0Var, ljs0.m(an91.k(c530.a, 16.0f), 24.0f)), btsVar), wwg.S(170694405, true, new w7o0(24, q7u0Var), btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(q7u0Var, slsVar, f530Var, i, 19);
        }
    }

    public static final void d(r7u0 r7u0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1265968662);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(r7u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (r7u0Var instanceof p7u0) {
            btsVar.e0(-364444770);
            a((p7u0) r7u0Var, slsVar, f530Var, btsVar, i2 & 1022);
            btsVar.t(false);
        } else {
            if (!(r7u0Var instanceof q7u0)) {
                throw unr0.y(-1120136087, btsVar, false);
            }
            btsVar.e0(-364359365);
            c((q7u0) r7u0Var, slsVar, f530Var, btsVar, i2 & 1022);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(r7u0Var, slsVar, f530Var, i, 17);
        }
    }

    public static final void e(s7u0 s7u0Var, sls slsVar, sls slsVar2, sls slsVar3, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(302666058);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s7u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar3) ? 2048 : 1024;
        }
        int i3 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            x2y d2 = n.d(btsVar, d, wlsVar4, 1.0f, true);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            d(s7u0Var.a, slsVar, ljs0.c(c530Var, 1.0f), btsVar, (i3 & 112) | 384);
            yrl.e(null, null, btsVar, 0, 7);
            d(s7u0Var.b, slsVar2, ljs0.c(c530Var, 1.0f), btsVar, ((i3 >> 3) & 112) | 384);
            btsVar.t(true);
            au2 c = b0b1.c();
            f530 o3 = an91.o(c530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new p9t0(8, s7u0Var);
                btsVar.o0(Q);
            }
            sya1.a(c, an91.k(q791.d(fnq0.b(o3, false, (tls) Q), false, null, null, slsVar3, 15), 8.0f), null, null, btsVar, 0, 12);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(s7u0Var, slsVar, slsVar2, slsVar3, f530Var2, i);
        }
    }

    public static final String f(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue() + i;
            if (intValue < str.length()) {
                str = g8e.p(c.g(0, Integer.valueOf(intValue), str), " ", c.g(intValue, Integer.valueOf(str.length()), str));
                i++;
            }
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final CardPaymentSystem g(String str) {
        switch (str.hashCode()) {
            case -1804444521:
                if (str.equals("DinersClubCarteBlanche")) {
                    return CardPaymentSystem.DinersClub;
                }
                break;
            case -1802816241:
                if (str.equals("Maestro")) {
                    return CardPaymentSystem.Maestro;
                }
                break;
            case -1745773739:
                if (str.equals("Uzcard")) {
                    return CardPaymentSystem.Uzcard;
                }
                break;
            case -780280800:
                if (str.equals("VISA_ELECTRON")) {
                    return CardPaymentSystem.VISA_ELECTRON;
                }
                break;
            case -231891079:
                if (str.equals("UnionPay")) {
                    return CardPaymentSystem.UnionPay;
                }
                break;
            case -217540848:
                if (str.equals("AmericanExpress")) {
                    return CardPaymentSystem.AmericanExpress;
                }
                break;
            case -46205774:
                if (str.equals("MasterCard")) {
                    return CardPaymentSystem.MasterCard;
                }
                break;
            case 73257:
                if (str.equals("JCB")) {
                    return CardPaymentSystem.JCB;
                }
                break;
            case 76342:
                if (str.equals("MIR")) {
                    return CardPaymentSystem.MIR;
                }
                break;
            case 2229103:
                if (str.equals("HUMO")) {
                    return CardPaymentSystem.HUMO;
                }
                break;
            case 2634817:
                if (str.equals("VISA")) {
                    return CardPaymentSystem.VISA;
                }
                break;
            case 1341365945:
                if (str.equals("DiscoverCard")) {
                    return CardPaymentSystem.DiscoverCard;
                }
                break;
        }
        return CardPaymentSystem.UNKNOWN;
    }

    public static m5z h(m5z m5zVar, m5z m5zVar2) {
        if (m5zVar.c()) {
            return m5z.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < m5zVar2.d() + m5zVar.d()) {
            Locale b = i < m5zVar.d() ? m5zVar.b(i) : m5zVar2.b(i - m5zVar.d());
            if (b != null) {
                linkedHashSet.add(b);
            }
            i++;
        }
        return m5z.e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
    }
}
