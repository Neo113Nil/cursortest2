package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class z3b1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    public static final void a(f530 f530Var, boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, sls slsVar, fid fidVar, int i, int i2) {
        CharSequence charSequence5;
        int i3;
        sls slsVar2;
        int i4;
        String str2;
        f530 f530Var2;
        CharSequence charSequence6;
        sls slsVar3;
        to5 to5Var;
        f43 f43Var;
        nhl0 nhl0Var;
        c530 c530Var;
        tls tlsVar;
        wls wlsVar;
        wls wlsVar2;
        wls wlsVar3;
        wls wlsVar4;
        sls slsVar4;
        bts btsVar;
        CharSequence charSequence7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1123503667);
        dmw0 dmw0Var = btsVar2.a;
        int i5 = i | 6 | (btsVar2.a(z) ? 32 : 16) | (btsVar2.k(charSequence) ? 256 : 128) | (btsVar2.k(charSequence2) ? 2048 : 1024) | (btsVar2.k(charSequence3) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | ImageMetadata.EDGE_MODE;
            charSequence5 = charSequence4;
        } else {
            charSequence5 = charSequence4;
            i3 = i5 | (btsVar2.k(charSequence5) ? 131072 : 65536);
        }
        int i7 = i3 | (btsVar2.k(str) ? 1048576 : 524288);
        int i8 = i2 & 128;
        if (i8 != 0) {
            i4 = i7 | 12582912;
            slsVar2 = slsVar;
        } else {
            slsVar2 = slsVar;
            i4 = i7 | (btsVar2.e(slsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        }
        int i9 = i4;
        if (btsVar2.V(i9 & 1, (i9 & 4793491) != 4793490)) {
            CharSequence charSequence8 = i6 != 0 ? null : charSequence5;
            if (i8 != 0) {
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new bgc(12);
                    btsVar2.o0(Q);
                }
                slsVar2 = (sls) Q;
            }
            c530 c530Var2 = c530.a;
            sls slsVar5 = slsVar2;
            f530 d = q791.d(bzk0.c(ymb1.l(an91.o(q6a1.c(c530Var2, z), 16.0f, 0.0f, 16.0f, 0.0f, 10), cyk0.c(24.0f)), AppColor$Palette.BgMinor, qke.q), z, null, null, slsVar5, 14);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, d);
            ohd.G1.getClass();
            sls slsVar6 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar6);
            } else {
                btsVar2.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(btsVar2, wlsVar5, a);
            wls wlsVar6 = d.e;
            qje.W(btsVar2, wlsVar6, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar7 = d.g;
            qje.W(btsVar2, wlsVar7, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar8 = d.d;
            qje.W(btsVar2, wlsVar8, d2);
            f530 o2 = an91.o(c530Var2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            to5 to5Var2 = x4c.D;
            f43 f43Var2 = lr20.a;
            lhl0 a2 = khl0.a(f43Var2, to5Var2, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d3 = b.d(btsVar2, o2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar6);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar5, a2);
            qje.W(btsVar2, wlsVar6, o3);
            vfc.v(hashCode2, btsVar2, wlsVar7, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar8, d3);
            nhl0 nhl0Var2 = nhl0.a;
            f530 a3 = nhl0Var2.a(c530Var2, 1.0f, true);
            sic a4 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o4 = btsVar2.o();
            f530 d4 = b.d(btsVar2, a3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar6);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar5, a4);
            qje.W(btsVar2, wlsVar6, o4);
            vfc.v(hashCode3, btsVar2, wlsVar7, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar8, d4);
            int i10 = i9 >> 6;
            ?? r9 = 0;
            qgy.b(charSequence, null, an91.o(c530Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar2, (i10 & 14) | 384, 0, 16378);
            bts btsVar3 = btsVar2;
            oeb1.c(btsVar3, ljs0.e(c530Var2, 4.0f));
            if (charSequence2 == null) {
                btsVar3.e0(-499771699);
                btsVar3.t(false);
                to5Var = to5Var2;
                f43Var = f43Var2;
                nhl0Var = nhl0Var2;
                wlsVar = wlsVar5;
                c530Var = c530Var2;
                wlsVar4 = wlsVar6;
                slsVar4 = slsVar6;
                tlsVar = tlsVar2;
                wlsVar2 = wlsVar7;
                wlsVar3 = wlsVar8;
                btsVar = btsVar3;
            } else {
                btsVar3.e0(-499771698);
                to5Var = to5Var2;
                f43Var = f43Var2;
                nhl0Var = nhl0Var2;
                c530Var = c530Var2;
                tlsVar = tlsVar2;
                wlsVar = wlsVar5;
                wlsVar2 = wlsVar7;
                wlsVar3 = wlsVar8;
                wlsVar4 = wlsVar6;
                slsVar4 = slsVar6;
                qgy.b(charSequence2, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                bts btsVar4 = btsVar3;
                r9 = 0;
                btsVar4.t(false);
                btsVar = btsVar4;
            }
            btsVar.t(true);
            if (charSequence8 != null) {
                btsVar.e0(-775704763);
                CharSequence charSequence9 = charSequence8;
                o4b1.d(charSequence9, null, z, AppColor$Palette.ControlMinor, null, slsVar5, btsVar, ((i9 >> 15) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i9 << 3) & 896) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES), 18);
                charSequence7 = charSequence9;
                btsVar.t(r9);
            } else {
                charSequence7 = charSequence8;
                btsVar.e0(-775533457);
                btsVar.t(r9);
            }
            btsVar.t(true);
            c530 c530Var3 = c530Var;
            f530 o5 = an91.o(ljs0.c(c530Var3, 1.0f), 16.0f, 16.0f, 0.0f, 0.0f, 12);
            lhl0 a5 = khl0.a(f43Var, to5Var, btsVar, r9);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o6 = btsVar.o();
            f530 d5 = b.d(btsVar, o5);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a5);
            qje.W(btsVar, wlsVar4, o6);
            vfc.v(hashCode4, btsVar, wlsVar2, btsVar, tlsVar);
            qje.W(btsVar, wlsVar3, d5);
            to5 to5Var3 = x4c.F;
            nhl0 nhl0Var3 = nhl0Var;
            bts btsVar5 = btsVar;
            qgy.b(charSequence3 == null ? "" : charSequence3, null, nhl0Var3.a(an91.o(nhl0Var3.b(c530Var3, to5Var3), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f, true), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar5, 0, 0, 16378);
            btsVar2 = btsVar5;
            oeb1.c(btsVar2, ljs0.q(c530Var3, 8.0f));
            str2 = str;
            if (str2 == null || str2.length() == 0) {
                btsVar2.e0(-2070748314);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-2070909049);
                f530 b = nhl0Var3.b(c530Var3, to5Var3);
                ovi0 a6 = mja1.a(str2, null, 6);
                pcd.a.getClass();
                v0b1.a(a6, b, null, pcd.b, null, null, null, null, 0.0f, 0, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                btsVar2.t(false);
            }
            btsVar2.t(true);
            btsVar2.t(true);
            f530Var2 = c530Var3;
            charSequence6 = charSequence7;
            slsVar3 = slsVar5;
        } else {
            str2 = str;
            btsVar2.Y();
            f530Var2 = f530Var;
            charSequence6 = charSequence5;
            slsVar3 = slsVar2;
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new z07(f530Var2, z, charSequence, charSequence2, charSequence3, charSequence6, str2, slsVar3, i, i2);
        }
    }
}
