package defpackage;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.passport.api.KPassportEnvironment;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class q8a1 {
    public static final void a(final lna lnaVar, final lna lnaVar2, final int i, final int i2, final String str, final wp2 wp2Var, final wp2 wp2Var2, final f530 f530Var, final wp2 wp2Var3, fid fidVar, final int i3) {
        wp2 wp2Var4;
        bts btsVar;
        c530 c530Var;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        String str4;
        wp2 wp2Var5;
        l76 l76Var = l76.z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(855852163);
        dmw0 dmw0Var = btsVar2.a;
        int i4 = (btsVar2.e(lnaVar) ? 4 : 2) | i3 | (btsVar2.e(lnaVar2) ? 32 : 16) | (btsVar2.c(i) ? 256 : 128) | (btsVar2.c(i2) ? 2048 : 1024);
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.k(str) ? 16384 : 8192;
        }
        int i5 = i4 | (btsVar2.k(wp2Var) ? 131072 : 65536) | (btsVar2.k(wp2Var2) ? 1048576 : 524288);
        if ((100663296 & i3) == 0) {
            wp2Var4 = wp2Var3;
            i5 |= btsVar2.k(wp2Var4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            wp2Var4 = wp2Var3;
        }
        if (btsVar2.V(i5 & 1, (38347923 & i5) != 38347922)) {
            btsVar2.a0();
            if ((i3 & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            c530 c530Var2 = c530.a;
            if (lnaVar == null || (str3 = lnaVar.b) == null || str3.length() <= 0) {
                btsVar = btsVar2;
                c530Var = c530Var2;
                z = false;
                btsVar.e0(24569965);
                String str5 = lnaVar != null ? lnaVar.a : null;
                if (str5 == null) {
                    btsVar.e0(24569964);
                    btsVar.t(false);
                } else {
                    btsVar.e0(24569965);
                    v0b1.a(mja1.a(str5, null, 6), ljs0.n(c530Var, 36.0f, 27.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
                    btsVar.t(false);
                }
                btsVar.t(false);
            } else {
                btsVar2.e0(24113180);
                if (str3 == null) {
                    str3 = "";
                }
                Integer num = lnaVar.c;
                if (num != null) {
                    str4 = str3;
                    wp2Var5 = new up2(rzo.d(num.intValue()));
                } else {
                    str4 = str3;
                    wp2Var5 = wp2Var4;
                }
                Integer num2 = lnaVar.d;
                c530Var = c530Var2;
                z = false;
                hpb1.c(str4, wp2Var5, num2 != null ? new up2(rzo.d(num2.intValue())) : wp2Var, l76Var, 0.0f, 0L, an91.o(c530Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), btsVar2, 1575936, 48);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            btsVar.e0(1663371182);
            int i6 = z ? 1 : 0;
            while (i6 < i) {
                uo5 uo5Var = x4c.y;
                x2y x2yVar = new x2y(1.0f, true);
                z910 d2 = pi6.d(uo5Var, z);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, x2yVar);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d2);
                qje.W(btsVar, d.e, o2);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode2));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d3);
                oeb1.c(btsVar, bzk0.c(tra1.b(ljs0.e(ljs0.c(c530Var, 1.0f), 4.0f), i6 < i2 ? 1.0f : 0.5f), i6 < i2 ? wp2Var : wp2Var2, cyk0.c(4.0f)));
                if ((i6 == i2 - 1 || (i6 == 0 && i2 == 0)) && str != null) {
                    btsVar.e0(-1208041808);
                    v0b1.a(mja1.a(str, null, 6), null, null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1022);
                    z3 = false;
                    btsVar.t(false);
                } else {
                    z3 = false;
                    btsVar.e0(-1207946669);
                    btsVar.t(false);
                }
                btsVar.t(true);
                i6++;
                z = z3;
            }
            btsVar.t(z);
            float f = i2 == i ? 1.0f : 0.5f;
            if (lnaVar2 == null || (str2 = lnaVar2.b) == null || str2.length() <= 0) {
                btsVar.e0(26532265);
                String str6 = lnaVar2 != null ? lnaVar2.a : null;
                if (str6 == null) {
                    btsVar.e0(26532264);
                    z2 = false;
                    btsVar.t(false);
                } else {
                    btsVar.e0(26532265);
                    v0b1.a(mja1.a(str6, null, 6), tra1.b(ljs0.n(c530Var, 36.0f, 27.0f), f), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
                    z2 = false;
                    btsVar.t(false);
                }
                btsVar.t(z2);
            } else {
                btsVar.e0(25910002);
                String str7 = str2 != null ? str2 : "";
                Integer num3 = lnaVar2.c;
                wp2 up2Var = num3 != null ? new up2(rzo.d(num3.intValue())) : wp2Var3;
                Integer num4 = lnaVar2.d;
                bts btsVar3 = btsVar;
                hpb1.c(str7, up2Var, num4 != null ? new up2(rzo.d(num4.intValue())) : i2 == i ? wp2Var : wp2Var2, l76Var, 0.0f, 0L, tra1.b(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), f), btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 48);
                btsVar = btsVar3;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: uif0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q8a1.a(lna.this, lnaVar2, i, i2, str, wp2Var, wp2Var2, f530Var, wp2Var3, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(Integer num, boolean z, sls slsVar, boolean z2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(455846395);
        int i2 = i | (btsVar.k(num) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.a(z2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            osv d = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, 360.0f, sb2.w(sb2.K(1000, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), null, btsVar, 4536, 8);
            long j = z ? cl51.f : cl51.a;
            long j2 = z ? cl51.c : cl51.e;
            f530 b = m4m0.b(ljs0.c, j, qke.q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            btsVar.e0(1368406684);
            pa90 m = mt71.m(num.intValue(), 0, btsVar);
            float floatValue = ((Number) d.w.getValue()).floatValue();
            c530 c530Var = c530.a;
            o4b1.b(m, null, ira1.i(c530Var, floatValue), null, null, 0.0f, null, btsVar, 48, 120);
            btsVar = btsVar;
            btsVar.t(false);
            if (z2) {
                btsVar.e0(1368645322);
                pa90 m2 = mt71.m(u0h0.ic_delivery_webview_cross, 0, btsVar);
                f530 l = an91.l(cj6.a.a(c530Var, x4c.w), 16.0f, 20.0f);
                boolean z3 = (i2 & 896) == 256;
                Object Q = btsVar.Q();
                if (z3 || Q == did.a) {
                    Q = new n7l0(24, slsVar);
                    btsVar.o0(Q);
                }
                q4v.b(m2, null, q791.d(l, false, null, null, (sls) Q, 15), j2, btsVar, 48, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(1369036449);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0(num, z, slsVar, z2, i);
        }
    }

    public static String c(int i, String str) {
        return oyr.i(i, str);
    }

    public static final KPassportEnvironment d(AuthEnvironment authEnvironment) {
        int i = c5o.a[authEnvironment.ordinal()];
        if (i == 1) {
            return KPassportEnvironment.PRODUCTION;
        }
        if (i == 2) {
            return KPassportEnvironment.RC;
        }
        if (i == 3) {
            return KPassportEnvironment.TESTING;
        }
        if (i == 4) {
            return KPassportEnvironment.TEAM_PRODUCTION;
        }
        if (i == 5) {
            return KPassportEnvironment.TEAM_TESTING;
        }
        w511.b();
        return null;
    }
}
