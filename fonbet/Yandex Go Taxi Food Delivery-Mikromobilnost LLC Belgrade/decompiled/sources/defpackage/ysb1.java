package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.m;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ysb1 {
    public static final void a(final f530 f530Var, final int i, final int i2, float f, float f2, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, ety0 ety0Var, fid fidVar, final int i3) {
        int i4;
        final float f3;
        final float f4;
        final wp2 wp2Var4;
        final wp2 wp2Var5;
        final ety0 ety0Var2;
        bts btsVar;
        final wp2 wp2Var6;
        aii0 aii0Var;
        wls wlsVar;
        wp2 wp2Var7;
        int i5;
        wp2 wp2Var8;
        final float f5;
        ety0 ety0Var3;
        wp2 wp2Var9;
        wp2 wp2Var10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-990188172);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.k(f530Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar2.c(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar2.c(i2) ? 256 : 128;
        }
        int i6 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i6 = 93184 | i4;
        }
        int i7 = 14155776 | i6;
        if ((100663296 & i3) == 0) {
            i7 = 47710208 | i6;
        }
        if (btsVar2.V(i7 & 1, (38347923 & i7) != 38347922)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                up2 up2Var = new up2(eq2.c);
                wp2Var7 = AppColor$Palette.ControlMinor;
                i5 = i7 & (-235339777);
                f3 = 40.0f;
                wp2Var8 = up2Var;
                f5 = 4.0f;
                ety0Var3 = xya1.d(btsVar2).h.b;
                wp2Var9 = tp2.a;
            } else {
                btsVar2.Y();
                f5 = f2;
                wp2Var8 = wp2Var;
                wp2Var7 = wp2Var2;
                wp2Var9 = wp2Var3;
                ety0Var3 = ety0Var;
                i5 = i7 & (-235339777);
                f3 = f;
            }
            btsVar2.u();
            if (i2 < 1 || i < 0 || i > i2) {
                final wp2 wp2Var11 = wp2Var8;
                final wp2 wp2Var12 = wp2Var7;
                final wp2 wp2Var13 = wp2Var9;
                final ety0 ety0Var4 = ety0Var3;
                jst.e.q("Invalid CounterProgress parameters, receive:  value = " + i + " maxValue = " + i2);
                aii0Var = btsVar2.v();
                if (aii0Var != null) {
                    final int i8 = 0;
                    wlsVar = new wls() { // from class: o0f
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i8;
                            zy11 zy11Var = zy11.a;
                            int i10 = i3;
                            switch (i9) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i10 | 1);
                                    ysb1.a(f530Var, i, i2, f3, f5, wp2Var11, wp2Var12, wp2Var13, ety0Var4, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i10 | 1);
                                    ysb1.a(f530Var, i, i2, f3, f5, wp2Var11, wp2Var12, wp2Var13, ety0Var4, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    aii0Var.d = wlsVar;
                }
                return;
            }
            final long n = tje.n(wp2Var7, btsVar2);
            final m3u0 a = m.a(tje.n(wp2Var8, btsVar2), null, null, btsVar2, 0, 14);
            final m3u0 b = b.b(i / i2, null, null, null, btsVar2, 0, 30);
            final float f6 = f5;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            wp2 wp2Var14 = wp2Var8;
            sb.append(" / ");
            sb.append(i2);
            String sb2 = sb.toString();
            ety0 c = bza1.c(ety0Var3, (fwi) btsVar2.m(j.h));
            wp2 wp2Var15 = wp2Var7;
            final long n2 = tje.n(wp2Var9, btsVar2);
            wp2 wp2Var16 = wp2Var9;
            lry0 b2 = pnb1.b(btsVar2);
            boolean k = btsVar2.k(sb2) | btsVar2.k(c);
            ety0 ety0Var5 = ety0Var3;
            Object Q = btsVar2.Q();
            int i9 = i5;
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = lry0.a(b2, sb2, c, LayoutDirection.Ltr, 956);
                btsVar2.o0(Q);
            }
            final dry0 dry0Var = (dry0) Q;
            f530 m = ljs0.m(f530Var, f3);
            boolean k2 = btsVar2.k(sb2);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new wwb(sb2, 3);
                btsVar2.o0(Q2);
            }
            f530 b3 = fnq0.b(m, false, (tls) Q2);
            boolean k3 = ((i9 & HProv.ALG_CLASS_ALL) == 16384) | btsVar2.k(b) | btsVar2.d(n) | btsVar2.k(a) | btsVar2.e(dry0Var) | btsVar2.d(n2);
            Object Q3 = btsVar2.Q();
            if (k3 || Q3 == o430Var) {
                wp2Var10 = wp2Var16;
                ety0Var2 = ety0Var5;
                tls tlsVar = new tls() { // from class: p0f
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long j;
                        long j2;
                        qam qamVar = (qam) obj;
                        float w0 = qamVar.w0(f6);
                        float f7 = w0 / 2.0f;
                        jvu0 jvu0Var = new jvu0(0, 0, 30, w0, 0.0f);
                        float floatValue = ((Number) b.getValue()).floatValue() * 360.0f;
                        float f8 = 360.0f - floatValue;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        if (f8 > 1.0f) {
                            j = floatToRawIntBits;
                            qamVar.F(n, (-90.0f) + floatValue, f8, false, j, floatToRawIntBits2, (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
                        } else {
                            j = floatToRawIntBits;
                        }
                        if (floatValue > 1.0f) {
                            qamVar.F(((ldc) a.getValue()).a, -90.0f, floatValue, false, j, floatToRawIntBits2, (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
                        }
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                        dry0 dry0Var2 = dry0Var;
                        long floatToRawIntBits3 = (Float.floatToRawIntBits((intBitsToFloat - ((int) (dry0Var2.c >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (dry0Var2.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        if ((248 & 4) != 0) {
                            floatToRawIntBits3 = 0;
                        }
                        float f9 = (248 & 8) != 0 ? Float.NaN : 0.0f;
                        bmt0 bmt0Var = dry0Var2.a.b.a;
                        bgr0 bgr0Var = bmt0Var.n;
                        rly0 rly0Var = bmt0Var.m;
                        ram ramVar = bmt0Var.p;
                        nfh N = qamVar.N();
                        long v = N.v();
                        N.q().save();
                        try {
                            cot cotVar = (cot) N.a;
                            long j3 = floatToRawIntBits3;
                            try {
                                cotVar.n(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                boolean f10 = dry0Var2.f();
                                hm40 hm40Var = dry0Var2.b;
                                cry0 cry0Var = dry0Var2.a;
                                if (f10 && cry0Var.f != 3) {
                                    long j4 = dry0Var2.c;
                                    cotVar.f(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 1);
                                }
                                ety0 ety0Var6 = cry0Var.b;
                                ml6 c2 = ety0Var6.a.a.c();
                                long j5 = n2;
                                if (c2 == null || j5 != 16) {
                                    i28 q = qamVar.N().q();
                                    if (j5 == 16) {
                                        j5 = ety0Var6.b();
                                    }
                                    j2 = v;
                                    try {
                                        hm40Var.i(q, llb1.d(f9, j5), bgr0Var, rly0Var, ramVar);
                                    } catch (Throwable th) {
                                        th = th;
                                        b64.C(N, j2);
                                        throw th;
                                    }
                                } else {
                                    i28 q2 = qamVar.N().q();
                                    if (Float.isNaN(f9)) {
                                        f9 = ety0Var6.a.a.a();
                                    }
                                    hm40Var.j(q2, c2, f9, bgr0Var, rly0Var, ramVar);
                                    j2 = v;
                                }
                                b64.C(N, j2);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = v;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j2 = v;
                        }
                    }
                };
                f4 = f6;
                btsVar2.o0(tlsVar);
                Q3 = tlsVar;
            } else {
                f4 = f6;
                wp2Var10 = wp2Var16;
                ety0Var2 = ety0Var5;
            }
            qeb1.a(0, btsVar2, (tls) Q3, b3);
            btsVar = btsVar2;
            wp2Var4 = wp2Var14;
            wp2Var5 = wp2Var15;
            wp2Var6 = wp2Var10;
        } else {
            btsVar2.Y();
            f3 = f;
            f4 = f2;
            wp2Var4 = wp2Var;
            wp2Var5 = wp2Var2;
            ety0Var2 = ety0Var;
            btsVar = btsVar2;
            wp2Var6 = wp2Var3;
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            final int i10 = 1;
            wlsVar = new wls() { // from class: o0f
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i92 = i10;
                    zy11 zy11Var = zy11.a;
                    int i102 = i3;
                    switch (i92) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i102 | 1);
                            ysb1.a(f530Var, i, i2, f3, f4, wp2Var4, wp2Var5, wp2Var6, ety0Var2, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i102 | 1);
                            ysb1.a(f530Var, i, i2, f3, f4, wp2Var4, wp2Var5, wp2Var6, ety0Var2, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    public static final void b(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, List list, boolean z, float f, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(771132548);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(charSequence2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(list) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.b(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(wlsVar) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            f530 b = m4m0.b(f530Var, dl51.d, cyk0.c(20.0f));
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar, 0);
            int i3 = i2;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, f));
            int i4 = i3 >> 3;
            zgb1.b(charSequence, charSequence2, an91.m(c530Var, 16.0f, 0.0f, 2), so5Var, 8388611, false, null, null, null, null, btsVar, (i4 & 14) | 28032 | (i4 & 112), 992);
            btsVar = btsVar;
            psb1.b(an91.k(ljs0.c(c530Var, 1.0f), 8.0f), 10.0f, list, z, wlsVar, btsVar, (i4 & 896) | 54 | (i4 & 7168) | (57344 & (i3 >> 6)), 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new w640(f530Var, charSequence, charSequence2, list, z, f, wlsVar, i);
        }
    }

    public static final void c(d360 d360Var, boolean z, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f360 f360Var = d360Var.a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1081555666);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(d360Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            float f = f360Var != null ? f360Var.c / 2.0f : 16.0f;
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            boolean z2 = (d360Var.e == null || z) ? false : true;
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object Q = btsVar2.Q();
            if (z3 || Q == did.a) {
                Q = new g360(d360Var, wlsVar, 0);
                btsVar2.o0(Q);
            }
            f530 d = q791.d(o, z2, null, null, (sls) Q, 14);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o2);
            wls wlsVar2 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar2);
            }
            qje.W(btsVar2, d.d, d3);
            int i3 = i2;
            btsVar = btsVar2;
            b(an91.o(c530Var, 0.0f, f, 0.0f, 0.0f, 13), d360Var.b, d360Var.c, d360Var.d, z, f, wlsVar, btsVar, ((i3 << 9) & HProv.ALG_CLASS_ALL) | ((i3 << 12) & 3670016));
            if (f360Var == null) {
                btsVar.e0(1372186637);
                btsVar.t(false);
            } else {
                btsVar.e0(1372186638);
                s3b1.f(f360Var.a, rx21.d(ljs0.e(ljs0.q(cj6.a.a(c530Var, uo5Var), f360Var.b), f360Var.c), f360Var.d, f360Var.e), null, btsVar, 0, 4);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(d360Var, z, wlsVar, i, 8);
        }
    }

    public static final UnconditionalLimitWidgetEntity d(u031 u031Var) {
        if (!u031Var.equals(t031.a) && !u031Var.equals(r501.c)) {
            if (u031Var instanceof s031) {
                return ((s031) u031Var).w;
            }
            if (u031Var instanceof p031) {
                return d(((p031) u031Var).a);
            }
            if (u031Var instanceof m031) {
                return ((m031) u031Var).b;
            }
            w511.b();
        }
        return null;
    }
}
