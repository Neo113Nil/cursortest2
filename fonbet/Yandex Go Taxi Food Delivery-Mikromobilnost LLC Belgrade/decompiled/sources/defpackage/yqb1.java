package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.TypedValue;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.ratingbar.a;
import defpackage.bts;
import defpackage.c530;
import defpackage.dhj0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.hv40;
import defpackage.i9a1;
import defpackage.kv40;
import defpackage.nv40;
import defpackage.oip0;
import defpackage.pw91;
import defpackage.rv40;
import defpackage.sb2;
import defpackage.sv40;
import defpackage.tls;
import defpackage.ubn;
import defpackage.uv40;
import defpackage.vg0;
import defpackage.vuz;
import defpackage.vv40;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class yqb1 {
    public static final void a(sv40 sv40Var, tls tlsVar, fid fidVar, int i) {
        sv40 sv40Var2 = sv40Var;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1634762806);
        int i2 = i | (btsVar.k(sv40Var2) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            ovi0 ovi0Var = sv40Var2.b;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.e(ljs0.c(an91.o(c530Var, 12.0f, 12.0f, 12.0f, 0.0f, 8), 1.0f), 180.0f), cyk0.c(20.0f));
            v0b1.a(ovi0Var, l, null, wwg.S(1513280409, true, new os(l, 27), btsVar), null, null, null, mhe.g, 0.0f, 0, btsVar, 12585984, 884);
            f530 o = an91.o(c530Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            so5 so5Var = x4c.H;
            uic uicVar = uic.a;
            qgy.b(sv40Var2.c, null, uicVar.a(so5Var, o), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).d.d, null, btsVar, 0, 0, 12154);
            sv40Var2 = sv40Var;
            qgy.b(sv40Var.d, null, uicVar.a(so5Var, c530Var), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 0, 0, 12154);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            f530 a = uicVar.a(so5Var, an91.o(c530Var, 0.0f, 16.0f, 0.0f, 14.0f, 5));
            Integer num = sv40Var2.f;
            int intValue = num != null ? num.intValue() : 0;
            m8i0 m8i0Var = new m8i0(new i8i0(new up2(rzo.d(context.getColor(mqg0.component_amber_normal)))), 29);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new gv40(1, tlsVar);
                btsVar.o0(Q2);
            }
            tlsVar2 = tlsVar;
            a.a(a, intValue, 0, m8i0Var, (tls) Q2, btsVar, 0);
            boolean z2 = (i2 & 112) == 32;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = true;
                btsVar.o0(Q3);
            }
            int i4 = 0;
            g.b(uicVar, ((Boolean) Q3).booleanValue(), null, k.d(sb2.K(300, 0, null, 6), null, 14), k.l(null, null, 15), null, wwg.S(1541644962, true, new y740(3, sv40Var2, tlsVar2), btsVar), btsVar, 1600518, 18);
            fmc fmcVar = sv40Var2.h;
            if (fmcVar == null) {
                btsVar.e0(-582249188);
                btsVar.t(false);
                btsVar = btsVar;
            } else {
                btsVar.e0(-582249187);
                f530 c = bzk0.c(an91.n(c530Var, 16.0f, 14.0f, 16.0f, 12.0f), AppColor$Palette.BgMinor, cyk0.c(16.0f));
                boolean z3 = i3 == 256;
                Object Q4 = btsVar.Q();
                if (z3 || Q4 == o430Var) {
                    Q4 = new s140(26, tlsVar2);
                    btsVar.o0(Q4);
                }
                f530 b = q791.b(c, null, null, false, null, new awk0(0), (sls) Q4, 12);
                fhy fhyVar = ghy.b;
                String str = fmcVar.b;
                if (str == null) {
                    str = "";
                }
                lkx lkxVar = new lkx(i4, 1, i4, HProv.PP_CACHE_SIZE);
                String str2 = fmcVar.a;
                int i5 = i3 != 256 ? 0 : 1;
                Object Q5 = btsVar.Q();
                if (i5 != 0 || Q5 == o430Var) {
                    Q5 = new gv40(0, tlsVar2);
                    btsVar.o0(Q5);
                }
                heb1.b(str, (tls) Q5, b, false, null, null, null, null, str2, null, null, null, null, null, null, false, hk91.a, 0.0f, fhyVar, null, lkxVar, null, false, 0, 0, zx40Var, null, null, null, null, null, btsVar, 0, 0, 1572864, 0, 2077621752, 1);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(sv40Var2, tlsVar2, i, 18);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1352135145);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.e(ljs0.c(an91.o(c530Var, 12.0f, 12.0f, 12.0f, 0.0f, 8), 1.0f), 180.0f), cyk0.c(20.0f));
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            pi6.a(pfb1.b(bzk0.c(l, appColor$Palette, qke.q), false, 31), btsVar, 0);
            pi6.a(pfb1.b(bzk0.c(ljs0.e(ljs0.c(an91.o(c530Var, 12.0f, 16.0f, 12.0f, 0.0f, 8), 1.0f), 18.0f), appColor$Palette, cyk0.c(10.0f)), false, 31), btsVar, 0);
            pi6.a(pfb1.b(bzk0.c(ljs0.e(ljs0.c(an91.o(c530Var, 12.0f, 4.0f, 12.0f, 0.0f, 8), 1.0f), 18.0f), appColor$Palette, cyk0.c(10.0f)), false, 31), btsVar, 0);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            f530 b = ofb1.b(an91.o(c530Var, 0.0f, 16.0f, 0.0f, 14.0f, 5).k(new ypu(x4c.H)), false, null, 15);
            m8i0 m8i0Var = new m8i0(new i8i0(new up2(rzo.d(context.getColor(mqg0.component_amber_normal)))), 29);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ej40(8);
                btsVar.o0(Q);
            }
            a.a(b, 0, 0, m8i0Var, (tls) Q, btsVar, 24624);
            pi6.a(pfb1.b(bzk0.c(ljs0.e(ljs0.c(an91.n(c530Var, 16.0f, 14.0f, 16.0f, 12.0f), 1.0f), 56.0f), appColor$Palette, cyk0.c(16.0f)), false, 31), btsVar, 0);
            pi6.a(pfb1.b(bzk0.c(ljs0.e(ljs0.c(an91.n(c530Var, 8.0f, 8.0f, 8.0f, 32.0f), 1.0f), 56.0f), appColor$Palette, cyk0.c(16.0f)), false, 31), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vu30(i, 7);
        }
    }

    public static final void c(final vv40 vv40Var, final tls tlsVar, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(770923598);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(vv40Var) : btsVar.e(vv40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (vv40Var instanceof tv40) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls() { // from class: fv40
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            tls tlsVar2 = tlsVar;
                            vv40 vv40Var2 = vv40Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    yqb1.c(vv40Var2, tlsVar2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    yqb1.c(vv40Var2, tlsVar2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            rzo.b(null, "default", wwg.S(-1207323214, true, new wls() { // from class: com.yandex.go.multimodal_route.ui.rate_route.a
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, sb2.K(300, 0, ubn.a, 2), false, null, null, null, null, btsVar2, 48, 0, 8157);
                        oip0 o = pw91.o(btsVar2);
                        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                        Boolean valueOf = Boolean.valueOf(vuz.o(btsVar2).c.f());
                        boolean k = btsVar2.k(o);
                        Object Q = btsVar2.Q();
                        Object obj3 = did.a;
                        if (k || Q == obj3) {
                            Q = new MultimodalRoutesRateScreenKt$MultimodalRoutesRateScreen$2$1$1(o, null);
                            btsVar2.o0(Q);
                        }
                        zpn.e(btsVar2, (wls) Q, valueOf);
                        vv40 vv40Var2 = vv40.this;
                        boolean k2 = btsVar2.k(vv40Var2);
                        Object Q2 = btsVar2.Q();
                        if (k2 || Q2 == obj3) {
                            Q2 = vv40Var2 instanceof sv40 ? ((sv40) vv40Var2).e : vv40Var2 instanceof uv40 ? ((uv40) vv40Var2).a : "";
                            btsVar2.o0(Q2);
                        }
                        CharSequence charSequence = (CharSequence) Q2;
                        boolean k3 = btsVar2.k(vv40Var2);
                        Object Q3 = btsVar2.Q();
                        if (k3 || Q3 == obj3) {
                            Q3 = vv40Var2 instanceof sv40 ? new nv40(((sv40) vv40Var2).a) : kv40.a;
                            btsVar2.o0(Q3);
                        }
                        rv40 rv40Var = (rv40) Q3;
                        Object Q4 = btsVar2.Q();
                        if (Q4 == obj3) {
                            Q4 = new hv40(o);
                            btsVar2.o0(Q4);
                        }
                        f530 c = i9a1.c(c530.a);
                        tls tlsVar2 = tlsVar;
                        com.yandex.go.design.compose.modal.bottomsheet.c.a(c, a, null, false, false, null, null, null, null, null, wwg.S(2015667494, true, new vg0(vv40Var2, (hv40) Q4, tlsVar2, rv40Var, charSequence), btsVar2), wwg.S(-44791214, true, new dhj0(o, vv40Var2, tlsVar2, 13), btsVar2), btsVar2, 0, 54, 1020);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 3456, 3);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls() { // from class: fv40
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    tls tlsVar2 = tlsVar;
                    vv40 vv40Var2 = vv40Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            yqb1.c(vv40Var2, tlsVar2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            yqb1.c(vv40Var2, tlsVar2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void d(tsq tsqVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1285399393);
        int i2 = (btsVar2.k(tsqVar) ? 32 : 16) | i | (btsVar2.e(tlsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 c = cyk0.c(13.0f);
            boolean z = tsqVar.c;
            c530 c530Var = c530.a;
            if (z) {
                btsVar2.e0(595334029);
                b = m4m0.b(c530Var, tje.n(AppColor$Palette.BgMinor, btsVar2), c);
                btsVar2.t(false);
            } else {
                btsVar2.e0(595457502);
                xa6 a = eab1.a(0.5f, tje.n(AppColor$Palette.Line, btsVar2));
                b = aab1.b(c530Var, a.a, a.b, c);
                btsVar2.t(false);
            }
            f530 k = an91.k(b, 13.0f);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new ve30(21, tlsVar, tsqVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(tsqVar.b, q791.b(k, null, null, false, null, new awk0(0), (sls) Q, 12), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(tsqVar, tlsVar, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, String str2, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, fid fidVar, final int i5, final int i6) {
        int i7;
        f530 f530Var2;
        ety0 ety0Var3;
        int i8;
        int i9;
        String str3;
        int i10;
        int i11;
        wp2 wp2Var3;
        ety0 ety0Var4;
        int i12;
        int i13;
        final wp2 wp2Var4;
        final int i14;
        final int i15;
        final String str4;
        final f530 f530Var3;
        final ety0 ety0Var5;
        final wp2 wp2Var5;
        final ety0 ety0Var6;
        final int i16;
        final int i17;
        aii0 v;
        ety0 ety0Var7;
        ety0 ety0Var8;
        int i18;
        ety0 ety0Var9;
        wp2 wp2Var6;
        int i19;
        int i20;
        int i21;
        String str5;
        int i22;
        int i23;
        wp2 wp2Var7;
        ety0 ety0Var10;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-264391922);
        if ((i5 & 6) == 0) {
            i7 = i5 | (btsVar.k(str) ? 4 : 2);
        } else {
            i7 = i5;
        }
        int i24 = i6 & 2;
        if (i24 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar.k(f530Var2) ? 32 : 16;
            int i25 = i7 | 384;
            if ((i6 & 8) != 0) {
                ety0Var3 = ety0Var;
                if (btsVar.k(ety0Var3)) {
                    i8 = 2048;
                    int i26 = i25 | i8;
                    int i27 = 221184 | i26;
                    i9 = i6 & 64;
                    if (i9 != 0) {
                        i10 = i26 | 1794048;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        i10 = i27 | (btsVar.k(str3) ? 1048576 : 524288);
                    }
                    i11 = i6 & 128;
                    if (i11 != 0) {
                        i10 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        wp2Var3 = wp2Var2;
                        i10 |= btsVar.k(wp2Var3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        if ((i6 & 256) != 0) {
                            ety0Var4 = ety0Var2;
                            if (btsVar.k(ety0Var4)) {
                                i12 = SelfTester_JCP.DECRYPT_CBC;
                                i13 = i10 | i12 | 805306368;
                                if (btsVar.V(i13 & 1, (306783379 & i13) != 306783378)) {
                                    btsVar.a0();
                                    if ((i5 & 1) == 0 || btsVar.C()) {
                                        f530 f530Var4 = i24 != 0 ? c530.a : f530Var2;
                                        if ((i6 & 8) != 0) {
                                            ety0Var7 = xya1.e(btsVar).g.a;
                                            i13 &= -7169;
                                        } else {
                                            ety0Var7 = ety0Var3;
                                        }
                                        if (i9 != 0) {
                                            str3 = "";
                                        }
                                        tp2 tp2Var = tp2.a;
                                        if (i11 != 0) {
                                            wp2Var3 = tp2Var;
                                        }
                                        if ((i6 & 256) != 0) {
                                            ety0Var8 = xya1.e(btsVar).h.a;
                                            i13 &= -234881025;
                                        } else {
                                            ety0Var8 = ety0Var4;
                                        }
                                        i18 = Integer.MAX_VALUE;
                                        ety0Var9 = ety0Var7;
                                        wp2Var6 = tp2Var;
                                        ety0Var4 = ety0Var8;
                                        i19 = Integer.MAX_VALUE;
                                        i20 = 2;
                                        f530Var2 = f530Var4;
                                        i21 = 2;
                                    } else {
                                        btsVar.Y();
                                        if ((i6 & 8) != 0) {
                                            i13 &= -7169;
                                        }
                                        if ((i6 & 256) != 0) {
                                            i13 &= -234881025;
                                        }
                                        wp2Var6 = wp2Var;
                                        i20 = i;
                                        i19 = i2;
                                        i21 = i3;
                                        i18 = i4;
                                        ety0Var9 = ety0Var3;
                                    }
                                    btsVar.u();
                                    sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                                    int hashCode = Long.hashCode(btsVar.T);
                                    r1b0 o = btsVar.o();
                                    f530 d = b.d(btsVar, f530Var2);
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
                                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                                    qje.M(btsVar, d.h);
                                    qje.W(btsVar, d.d, d);
                                    int i28 = i13 >> 12;
                                    jeb1.f(str, null, wp2Var6, 0L, 0L, null, new sjy0(3), 0L, i20, false, i19, 0, null, ety0Var9, btsVar, (i13 & 910) | 805306368, 48 | ((i13 << 3) & HProv.ALG_CLASS_ALL), 13690);
                                    wp2 wp2Var8 = wp2Var6;
                                    int i29 = i20;
                                    int i30 = i19;
                                    ety0 ety0Var11 = ety0Var9;
                                    if (str3.length() > 0) {
                                        btsVar.e0(1365529399);
                                        i22 = i21;
                                        i23 = i18;
                                        wp2Var7 = wp2Var3;
                                        ety0Var10 = ety0Var4;
                                        str5 = str3;
                                        jeb1.f(str5, null, wp2Var7, 0L, 0L, null, new sjy0(3), 0L, i22, false, i23, 0, null, ety0Var10, btsVar, ((i13 >> 18) & 14) | ((i13 >> 15) & 896) | 805306368, 48 | (i28 & HProv.ALG_CLASS_ALL), 13690);
                                        btsVar.t(false);
                                    } else {
                                        str5 = str3;
                                        i22 = i21;
                                        i23 = i18;
                                        wp2Var7 = wp2Var3;
                                        ety0Var10 = ety0Var4;
                                        btsVar.e0(1365738122);
                                        btsVar.t(false);
                                    }
                                    btsVar.t(true);
                                    wp2Var4 = wp2Var8;
                                    f530Var3 = f530Var2;
                                    i16 = i29;
                                    str4 = str5;
                                    wp2Var5 = wp2Var7;
                                    i17 = i22;
                                    i15 = i23;
                                    ety0Var6 = ety0Var10;
                                    i14 = i30;
                                    ety0Var5 = ety0Var11;
                                } else {
                                    btsVar.Y();
                                    wp2Var4 = wp2Var;
                                    i14 = i2;
                                    i15 = i4;
                                    str4 = str3;
                                    f530Var3 = f530Var2;
                                    ety0Var5 = ety0Var3;
                                    wp2Var5 = wp2Var3;
                                    ety0Var6 = ety0Var4;
                                    i16 = i;
                                    i17 = i3;
                                }
                                v = btsVar.v();
                                if (v != null) {
                                    v.d = new wls() { // from class: bsz0
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int O = vng.O(i5 | 1);
                                            yqb1.e(str, f530Var3, wp2Var4, ety0Var5, i16, i14, str4, wp2Var5, ety0Var6, i17, i15, (fid) obj, O, i6);
                                            return zy11.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        } else {
                            ety0Var4 = ety0Var2;
                        }
                        i12 = SelfTester_JCP.DECRYPT_CFB;
                        i13 = i10 | i12 | 805306368;
                        if (btsVar.V(i13 & 1, (306783379 & i13) != 306783378)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    wp2Var3 = wp2Var2;
                    if ((i6 & 256) != 0) {
                    }
                    i12 = SelfTester_JCP.DECRYPT_CFB;
                    i13 = i10 | i12 | 805306368;
                    if (btsVar.V(i13 & 1, (306783379 & i13) != 306783378)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
            } else {
                ety0Var3 = ety0Var;
            }
            i8 = 1024;
            int i262 = i25 | i8;
            int i272 = 221184 | i262;
            i9 = i6 & 64;
            if (i9 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            wp2Var3 = wp2Var2;
            if ((i6 & 256) != 0) {
            }
            i12 = SelfTester_JCP.DECRYPT_CFB;
            i13 = i10 | i12 | 805306368;
            if (btsVar.V(i13 & 1, (306783379 & i13) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        int i252 = i7 | 384;
        if ((i6 & 8) != 0) {
        }
        i8 = 1024;
        int i2622 = i252 | i8;
        int i2722 = 221184 | i2622;
        i9 = i6 & 64;
        if (i9 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        wp2Var3 = wp2Var2;
        if ((i6 & 256) != 0) {
        }
        i12 = SelfTester_JCP.DECRYPT_CFB;
        i13 = i10 | i12 | 805306368;
        if (btsVar.V(i13 & 1, (306783379 & i13) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final int f(int i, Context context) {
        return m810.b(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    public static final syj0 g(Context context, Intent intent) {
        Object failure;
        try {
            context.startActivity(intent);
            failure = q5z.N();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            failure = new jyj0(a);
        }
        return (syj0) failure;
    }
}
