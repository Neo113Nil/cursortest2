package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.radio.RadioSize;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class uib1 {
    public static tzv0 a;

    public static final void a(nga ngaVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        sls slsVar2;
        f530 f530Var2;
        f530 f530Var3;
        boolean z;
        nga ngaVar2 = ngaVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1067825957);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(ngaVar2) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 c = cyk0.c(24.0f);
            c530 c530Var = c530.a;
            f530 c2 = bzk0.c(ymb1.l(ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f), c), ngaVar2.e ? AppColor$Palette.Background : AppColor$Palette.BgMinor, qke.q);
            if (ngaVar2.e) {
                btsVar.e0(-1219185815);
                f530Var3 = aab1.a(2.0f, tje.n(AppColor$Palette.Control, btsVar), c530Var, c);
                btsVar.t(false);
            } else {
                btsVar.e0(-1219098209);
                btsVar.t(false);
                f530Var3 = c530Var;
            }
            f530 k = c2.k(f530Var3);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new jc0(16, slsVar);
                btsVar.o0(Q);
            }
            f530 l = an91.l(q791.b(k, null, null, false, null, new awk0(0), (sls) Q, 12), 16.0f, 12.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = ngaVar2.b;
            ety0 ety0Var = xya1.e(btsVar).g.c;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            qgy.b(charSequence, null, null, appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, ety0Var, null, btsVar, 805309440, 6, 10742);
            oeb1.c(btsVar, new x2y(1.0f, true));
            sic a3 = qic.a(lr20.c, x4c.I, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            ngaVar2 = ngaVar;
            qgy.b(ngaVar2.d, null, null, appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).g.c, null, btsVar, 805309440, 6, 10742);
            btsVar = btsVar;
            if (ngaVar2.c != null) {
                btsVar.e0(1995087387);
                qgy.b(ngaVar2.c, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10742);
                btsVar = btsVar;
                z = false;
                btsVar.t(false);
            } else {
                z = false;
                btsVar.e0(1995306743);
                btsVar.t(false);
            }
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.q(c530Var, 12.0f));
            boolean z3 = z;
            boolean z4 = ngaVar2.e;
            RadioSize radioSize = RadioSize.M;
            boolean z5 = i3 == 32 ? true : z3;
            Object Q2 = btsVar.Q();
            if (z5 || Q2 == o430Var) {
                slsVar2 = slsVar;
                Q2 = new ic0(10, slsVar2);
                btsVar.o0(Q2);
            } else {
                slsVar2 = slsVar;
            }
            wfa1.a(z4, null, radioSize, (tls) Q2, false, btsVar, 384, 18);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(ngaVar2, slsVar2, f530Var2, i, 3);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, final t510 t510Var, f530 f530Var) {
        int i2;
        f530 b;
        SlotSize slotSize;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1886414127);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(t510Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        final int i3 = 0;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(false) ? 2048 : 1024;
        }
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = t510Var.d instanceof m410;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(1484470509);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new teb(20);
                    btsVar.o0(Q2);
                }
                b = fnq0.b(c530Var, true, (tls) Q2);
                btsVar.t(false);
            } else {
                btsVar.e0(1484234382);
                awk0 awk0Var = new awk0(0);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (z2 || Q3 == o430Var) {
                    Q3 = new g700(13, tlsVar, t510Var);
                    btsVar.o0(Q3);
                }
                b = q791.b(c530Var, zx40Var, null, true, null, awk0Var, (sls) Q3, 8);
                btsVar.t(false);
            }
            f530 b2 = pfb1.b(f530Var.k(b), false, 30);
            a S = wwg.S(-1699284741, true, new zls() { // from class: r410
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    t510 t510Var2 = t510Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                vib1.b(ibp0Var, t510Var2.a, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tib1.g(ebp0Var, t510Var2.b, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            a S2 = wwg.S(-956990432, true, new zls() { // from class: r410
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    t510 t510Var2 = t510Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                vib1.b(ibp0Var, t510Var2.a, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tib1.g(ebp0Var, t510Var2.b, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            a S3 = wwg.S(-2126208346, true, new nfj(18, t510Var, tlsVar), btsVar);
            int i5 = t410.a[t510Var.e.ordinal()];
            if (i5 == 1) {
                slotSize = SlotSize.XS;
            } else if (i5 == 2) {
                slotSize = SlotSize.S;
            } else if (i5 == 3) {
                slotSize = SlotSize.M;
            } else {
                if (i5 != 4) {
                    w511.b();
                    return;
                }
                slotSize = SlotSize.L;
            }
            ydb1.a(b2, S, S2, null, S3, null, slotSize, false, btsVar, 25008, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s410(t510Var, tlsVar, f530Var, i);
        }
    }

    public static void c(tzv0 tzv0Var) {
        if (jl40.l(a, tzv0Var)) {
            return;
        }
        a = tzv0Var;
        hst hstVar = jst.e;
        boolean z = tzv0Var.a;
        boolean z2 = tzv0Var.b;
        boolean z3 = tzv0Var.c;
        StringBuilder u = qv10.u("\n      parameters: [\n          \"loading_with_taxi\": [ has_taxi_button: ", " ],\n          \"failure_with_taxi\": [ has_taxi_button: ", " ],\n          \"retry_with_taxi\": [ has_taxi_button: ", z, z2);
        u.append(z3);
        u.append(" ]    \n      ]\n      ");
        xby.l(hstVar, "SHORTCUTS:SuperappFallbackBehaviour.ExperimentError", null, null, vuu0.c(u.toString()), 6);
    }
}
