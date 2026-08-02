package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.object.DriveState;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class zob1 {
    public static mgv a;

    public static final void a(diu0 diu0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        c36 e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(421606700);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(diu0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            m3u0 b = b.b(diu0Var.d instanceof iiu0 ? -180.0f : 0.0f, sb2.K(200, 0, null, 6), null, null, btsVar, 48, 28);
            f530 o = an91.o(ljs0.e(ljs0.c(f530Var, 1.0f), 48.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4 || btsVar.e(diu0Var));
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new ve30(10, tlsVar, diu0Var);
                btsVar.o0(Q2);
            }
            f530 b2 = q791.b(o, zx40Var, null, false, null, null, (sls) Q2, 28);
            to5 to5Var = x4c.E;
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b2);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            keb1.b(diu0Var.b, rzo.d(diu0Var.e), null, 48.0f, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.e(c530Var, 48.0f), 4.0f, 0.0f, 2);
            lhl0 a3 = khl0.a(lr20.g, to5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            String str = diu0Var.c;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            jeb1.f(str, null, appColor$Palette, uh6.K(13.0f, 4294967296L), 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16370);
            int i3 = dzg0.chevron_round_down;
            f530 c = androidx.compose.ui.graphics.d.c(ljs0.m(an91.o(c530Var, 7.0f, 0.0f, 0.0f, 0.0f, 14), 10.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) b.getValue()).floatValue(), null, 524031);
            pa90 a4 = wya1.a(i3, 0, btsVar);
            if (appColor$Palette == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
                e = null;
            } else {
                btsVar.e0(-1411607276);
                e = tse0.e(tje.n(appColor$Palette, btsVar), 5, btsVar, false);
            }
            o4b1.b(a4, null, c, null, null, 0.0f, e, btsVar, 56, 56);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(diu0Var, tlsVar, f530Var, i, 0);
        }
    }

    public static final void b(f530 f530Var, final boolean z, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-115156182);
        int i2 = i | 6 | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            final long n = tje.n(AppColor$Palette.Line, btsVar);
            final long n2 = tje.n(AppColor$Palette.Background, btsVar);
            f530Var2 = c530.a;
            f530 m = ljs0.m(f530Var2, 56.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, m);
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
            f530 m2 = ljs0.m(f530Var2, 56.0f);
            boolean d3 = ((i2 & 896) == 256) | btsVar.d(n) | btsVar.d(n2);
            Object Q = btsVar.Q();
            if (d3 || Q == did.a) {
                tls tlsVar = new tls() { // from class: v240
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        qam qamVar = (qam) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) / 2.0f;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                        float w0 = qamVar.w0(4.0f);
                        float w02 = qamVar.w0(4.0f);
                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w0) / 2.0f;
                        boolean z2 = z;
                        long j = n;
                        if (z2) {
                            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - intBitsToFloat2;
                            qam.t0(qamVar, j, floatToRawIntBits, (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 120);
                            qam.z(qamVar, n2, w02, (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32), 0.0f, null, 0, 120);
                            qam.z(qamVar, j, w02, (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32), 0.0f, null, 0, 120);
                        } else {
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float intBitsToFloat5 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            qam.t0(qamVar, j, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0) << 32), 0.0f, null, 120);
                        }
                        return zy11.a;
                    }
                };
                btsVar.o0(tlsVar);
                Q = tlsVar;
            }
            qeb1.a(0, btsVar, (tls) Q, m2);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(i, 6, f530Var2, z);
        }
    }

    public static final void c(f530 f530Var, boolean z, boolean z2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-317171053);
        int i2 = (btsVar.a(z) ? 32 : 16) | i | (btsVar.a(z2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ydb1.a(ljs0.e(f530Var, 56.0f), wwg.S(1674840745, true, new kj6(z, 4), btsVar), wwg.S(995539108, true, new kj6(z2, 5), btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u240(f530Var, z, z2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if ((r35 & 4) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(fiu0 fiu0Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i, int i2) {
        ety0 ety0Var2;
        int i3;
        int i4;
        ety0 ety0Var3;
        aii0 v;
        boolean z;
        ety0 ety0Var4;
        String str = fiu0Var.e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(326083892);
        dmw0 dmw0Var = btsVar.a;
        int i5 = i | (btsVar.k(fiu0Var) ? 4 : 2);
        if ((i2 & 4) == 0) {
            ety0Var2 = ety0Var;
            if (btsVar.k(ety0Var2)) {
                i3 = 256;
                i4 = i5 | i3;
                if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
                    btsVar.Y();
                    ety0Var3 = ety0Var2;
                } else {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        if ((i2 & 4) != 0) {
                            ety0Var2 = xya1.e(btsVar).g.b;
                            i4 &= -897;
                        }
                        int i6 = i4;
                        ety0 ety0Var5 = ety0Var2;
                        btsVar.u();
                        f530 e = ljs0.e(ljs0.c(f530Var, 1.0f), 56.0f);
                        to5 to5Var = x4c.E;
                        lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d = androidx.compose.ui.b.d(btsVar, e);
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
                        keb1.b(fiu0Var.b, rzo.d(fiu0Var.f), null, 56.0f, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
                        c530 c530Var = c530.a;
                        f530 e2 = ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f);
                        lhl0 a3 = khl0.a(lr20.g, to5Var, btsVar, 54);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar, e2);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, a3);
                        qje.W(btsVar, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                        x2y d3 = n.d(btsVar, d2, wlsVar4, 1.0f, true);
                        sic a4 = qic.a(lr20.e, x4c.G, btsVar, 6);
                        int hashCode3 = Long.hashCode(btsVar.T);
                        r1b0 o3 = btsVar.o();
                        f530 d4 = androidx.compose.ui.b.d(btsVar, d3);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, a4);
                        qje.W(btsVar, wlsVar2, o3);
                        vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar4, d4);
                        jeb1.f(fiu0Var.c, null, fiu0Var.d, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar, 805306368, 48, 30202);
                        btsVar = btsVar;
                        btsVar.e0(559991820);
                        btsVar.t(false);
                        btsVar.t(true);
                        if (str.length() > 0) {
                            btsVar.e0(-495366530);
                            ety0Var4 = ety0Var5;
                            z = true;
                            jeb1.f(str, an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), fiu0Var.d, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var4, btsVar, 48, (i6 << 6) & HProv.ALG_CLASS_ALL, 16376);
                            btsVar = btsVar;
                            btsVar.t(false);
                        } else {
                            z = true;
                            ety0Var4 = ety0Var5;
                            btsVar.e0(-495181770);
                            btsVar.t(false);
                        }
                        btsVar.t(z);
                        btsVar.t(z);
                        ety0Var3 = ety0Var4;
                    } else {
                        btsVar.Y();
                    }
                }
                v = btsVar.v();
                if (v == null) {
                    v.d = new ivy(fiu0Var, f530Var, ety0Var3, i, i2, 7);
                    return;
                }
                return;
            }
        } else {
            ety0Var2 = ety0Var;
        }
        i3 = 128;
        i4 = i5 | i3;
        if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final boolean e(TaxiOrder taxiOrder) {
        return taxiOrder.h.b == DriveState.COMPLETE && taxiOrder.l.a0;
    }

    public static final mgv f() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("TickOutlineSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 g = tse0.g(15.293f, 4.293f, 6.005f, 13.582f);
        g.h(0.717f, 8.294f);
        g.h(1.777f, 7.233f);
        g.h(6.005f, 11.46f);
        tse0.u(g, 14.232f, 3.232f, 15.293f, 4.293f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }
}
