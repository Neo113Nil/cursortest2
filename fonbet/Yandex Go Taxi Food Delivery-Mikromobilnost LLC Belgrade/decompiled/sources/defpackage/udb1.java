package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class udb1 {
    public static final void a(tls tlsVar, String str, String str2, String str3, f530 f530Var, String str4, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        String str5;
        int i4;
        bts btsVar;
        String str6;
        String str7;
        c530 c530Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1327900915);
        dmw0 dmw0Var = btsVar2.a;
        int i5 = i | (btsVar2.e(tlsVar) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.k(str3) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | HProv.ALG_CLASS_DATA_ENCRYPT;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i5 | (btsVar2.k(f530Var2) ? 16384 : 8192);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i3 | ImageMetadata.EDGE_MODE;
            str5 = str4;
        } else {
            str5 = str4;
            i4 = i3 | (btsVar2.k(str5) ? 131072 : 65536);
        }
        int i8 = i4;
        if (btsVar2.V(i8 & 1, (i8 & 74899) != 74898)) {
            c530 c530Var2 = c530.a;
            f530 f530Var3 = i6 != 0 ? c530Var2 : f530Var2;
            String str8 = i7 != 0 ? null : str5;
            f530 m = an91.m(m4m0.b(ljs0.s(f530Var3, 0.0f, 380.0f, 1), ((el51) btsVar2.m(gl51.a)).c(), cyk0.e(16.0f, 16.0f, 0.0f, 0.0f, 12)), 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
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
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            f530 f530Var4 = f530Var3;
            ymb1.c(str, an91.m(c530Var2, 0.0f, 12.0f, 1), 0L, tq7.a, lzr.E, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, ((i8 >> 3) & 14) | 27696, 0, 65508);
            bts btsVar3 = btsVar2;
            if (str8 != null) {
                btsVar3.e0(939022419);
                String str9 = str8;
                c530Var = c530Var2;
                ymb1.e(str9, an91.o(c530Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar3, ((i8 >> 15) & 14) | 48, 0, 64508);
                str7 = str9;
                btsVar3 = btsVar3;
                btsVar3.t(false);
            } else {
                str7 = str8;
                c530Var = c530Var2;
                btsVar3.e0(939199243);
                btsVar3.t(false);
            }
            f530 o2 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar3, 54);
            int hashCode2 = Long.hashCode(btsVar3.T);
            r1b0 o3 = btsVar3.o();
            f530 d2 = b.d(btsVar3, o2);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, a2);
            qje.W(btsVar3, wlsVar2, o3);
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar3, hashCode2, wlsVar3);
            }
            qje.W(btsVar3, wlsVar4, d2);
            a7u0 a7u0Var = qm51.a;
            byk0 b = ((YandexShapes) btsVar3.m(a7u0Var)).b();
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 e = ljs0.e(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 56.0f);
            int i9 = i8 & 14;
            boolean z = i9 == 4;
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zp5(6, tlsVar);
                btsVar3.o0(Q);
            }
            bts btsVar4 = btsVar3;
            a.b((sls) Q, e, b, 0L, 0L, null, null, null, false, null, null, null, wwg.S(-1938615758, true, new le(str3, 10), btsVar3), btsVar4, 0, 384, 4088);
            byk0 b2 = ((YandexShapes) btsVar4.m(a7u0Var)).b();
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 e2 = ljs0.e(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 56.0f);
            boolean z2 = i9 == 4;
            Object Q2 = btsVar4.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new zp5(7, tlsVar);
                btsVar4.o0(Q2);
            }
            a.a((sls) Q2, e2, b2, 0L, 0L, null, false, null, null, null, wwg.S(-1875455972, true, new le(str2, 11), btsVar4), btsVar4, 0, 4088);
            btsVar = btsVar4;
            btsVar.t(true);
            btsVar.t(true);
            str6 = str7;
            f530Var2 = f530Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            str6 = str5;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(tlsVar, str, str2, str3, f530Var2, str6, i, i2);
        }
    }

    public static final void b(ibp0 ibp0Var, int i, f530 f530Var, wp2 wp2Var, fid fidVar, int i2, int i3) {
        wp2 wp2Var2;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2041305997);
        int i5 = i2 | (btsVar.k(ibp0Var) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        int i6 = i5 | HProv.ALG_TYPE_SECURECHANNEL;
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i5 | 27648;
            wp2Var2 = wp2Var;
        } else {
            wp2Var2 = wp2Var;
            i4 = i6 | (btsVar.k(wp2Var2) ? 16384 : 8192);
        }
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            c36 c36Var = null;
            if (i7 != 0) {
                wp2Var2 = null;
            }
            int i8 = i4 >> 3;
            f530 k = an91.k(ljs0.a(f530Var, (ibp0Var.c() == SlotSize.M ? SlotSize.L : ibp0Var.c()).getSize(), ibp0Var.c().getSize()), 2.0f);
            z910 d = pi6.d(x4c.y, false);
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
            pa90 a = wya1.a(i, i8 & 14, btsVar);
            if (wp2Var2 == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
            } else {
                btsVar.e0(-1411607276);
                c36Var = tse0.e(tje.n(wp2Var2, btsVar), 5, btsVar, false);
            }
            o4b1.b(a, null, c530.a, null, null, 0.0f, c36Var, btsVar, 56, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        wp2 wp2Var3 = wp2Var2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(ibp0Var, i, f530Var, wp2Var3, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ibp0 ibp0Var, au2 au2Var, f530 f530Var, wp2 wp2Var, fid fidVar, int i, int i2) {
        int i3;
        wp2 wp2Var2;
        f530 f530Var2;
        wp2 wp2Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(780361342);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(au2Var) ? 32 : 16;
        }
        int i4 = i3 | 3456;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 28032;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            wp2Var2 = wp2Var;
            i4 |= btsVar.k(wp2Var2) ? 16384 : 8192;
            if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
                btsVar.Y();
                f530Var2 = f530Var;
                wp2Var3 = wp2Var2;
            } else {
                if (i5 != 0) {
                    wp2Var2 = tp2.a;
                }
                wp2 wp2Var4 = wp2Var2;
                int i6 = i4 >> 3;
                float size = (ibp0Var.c() == SlotSize.M ? SlotSize.L : ibp0Var.c()).getSize();
                float size2 = ibp0Var.c().getSize();
                c530 c530Var = c530.a;
                f530 k = an91.k(ljs0.a(c530Var, size, size2), 2.0f);
                z910 d = pi6.d(x4c.y, false);
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
                sya1.a(au2Var, null, null, wp2Var4, btsVar, i6 & 8078, 2);
                btsVar.t(true);
                f530Var2 = c530Var;
                wp2Var3 = wp2Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new q8y(ibp0Var, au2Var, f530Var2, wp2Var3, i, i2, 0);
                return;
            }
            return;
        }
        wp2Var2 = wp2Var;
        if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(final xss0 xss0Var, tls tlsVar, boolean z, fid fidVar, int i) {
        SlotSize slotSize;
        bts btsVar = (bts) fidVar;
        btsVar.g0(622632733);
        int i2 = 2;
        int i3 = i | (btsVar.e(xss0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (z || (xss0Var.d instanceof mqs0)) ? false : true;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            boolean e = ((i3 & 112) == 32) | btsVar.e(xss0Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new ppr0(13, tlsVar, xss0Var);
                btsVar.o0(Q2);
            }
            f530 b = pfb1.b(q791.b(c530.a, zx40Var, null, z2, null, null, (sls) Q2, 24), z, 30);
            androidx.compose.runtime.internal.a S = wwg.S(214664115, true, new zls() { // from class: brs0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    xss0 xss0Var2 = xss0Var;
                    switch (i6) {
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
                                vdb1.c(ibp0Var, xss0Var2.a, btsVar2, intValue & 14);
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
                                tdb1.e(ebp0Var, xss0Var2.b, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(780984302, true, new zls() { // from class: brs0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    xss0 xss0Var2 = xss0Var;
                    switch (i6) {
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
                                vdb1.c(ibp0Var, xss0Var2.a, btsVar2, intValue & 14);
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
                                tdb1.e(ebp0Var, xss0Var2.b, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            androidx.compose.runtime.internal.a S3 = wwg.S(1459527848, true, new qtb(xss0Var, z, tlsVar, i2), btsVar);
            int i6 = crs0.a[xss0Var.e.ordinal()];
            if (i6 == 1) {
                slotSize = SlotSize.XS;
            } else if (i6 == 2) {
                slotSize = SlotSize.S;
            } else if (i6 == 3) {
                slotSize = SlotSize.M;
            } else {
                if (i6 != 4) {
                    w511.b();
                    return;
                }
                slotSize = SlotSize.L;
            }
            ydb1.a(b, S, S2, null, S3, null, slotSize, false, btsVar, 25008, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(xss0Var, tlsVar, z, i, 26);
        }
    }
}
