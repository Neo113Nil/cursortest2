package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.yx360.design.compose.atoms.DsSearch$Size;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class zv91 {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:142:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, DsSearch$Size dsSearch$Size, tls tlsVar, f530 f530Var, boolean z, xjx xjxVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        xjx xjxVar2;
        int i5;
        ety0 e;
        Object Q;
        o430 o430Var;
        oz40 oz40Var;
        Object k;
        Object k2;
        oz40 oz40Var2;
        Object k3;
        Object Q2;
        boolean k4;
        Object Q3;
        int i6;
        boolean z3;
        oz40 oz40Var3;
        oz40 oz40Var4;
        lkx lkxVar;
        xjx xjxVar3;
        boolean z4;
        boolean z5;
        String str3 = str2;
        Float valueOf = Float.valueOf(0.0f);
        bts btsVar = (bts) fidVar;
        btsVar.g0(-11144940);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.c(dsSearch$Size.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= ImageMetadata.EDGE_MODE;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 131072 : 65536;
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= btsVar.e(null) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                xjxVar2 = xjxVar;
            } else {
                xjxVar2 = xjxVar;
                if ((i & 12582912) == 0) {
                    i3 |= btsVar.k(xjxVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
            }
            if ((i3 & 4793491) == 4793490 || !btsVar.E()) {
                if (i7 != 0) {
                    z2 = true;
                }
                xjx xjxVar4 = i4 == 0 ? xjx.g : xjxVar2;
                i5 = usm.a[dsSearch$Size.ordinal()];
                if (i5 != 1) {
                    btsVar.e0(-2120340698);
                    qnm qnmVar = qnm.a;
                    e = ltm.b(btsVar).e(btsVar);
                    btsVar.t(false);
                } else {
                    if (i5 != 2) {
                        throw unr0.y(-2120342367, btsVar, false);
                    }
                    btsVar.e0(-2120338746);
                    qnm qnmVar2 = qnm.a;
                    e = ltm.b(btsVar).g(btsVar);
                    btsVar.t(false);
                }
                ety0 ety0Var = e;
                btsVar.e0(1849434622);
                Q = btsVar.Q();
                o430Var = did.a;
                if (Q == o430Var) {
                    Q = f.j(Boolean.TRUE);
                    btsVar.o0(Q);
                }
                oz40Var = (oz40) Q;
                k = g8e.k(1849434622, btsVar, false);
                if (k == o430Var) {
                    k = f.j(valueOf);
                    btsVar.o0(k);
                }
                oz40 oz40Var5 = (oz40) k;
                k2 = g8e.k(1849434622, btsVar, false);
                if (k2 == o430Var) {
                    k2 = f.j(valueOf);
                    btsVar.o0(k2);
                }
                oz40Var2 = (oz40) k2;
                k3 = g8e.k(1849434622, btsVar, false);
                if (k3 == o430Var) {
                    k3 = f.d(new rsm(oz40Var2, oz40Var5, 0));
                    btsVar.o0(k3);
                }
                m3u0 m3u0Var = (m3u0) k3;
                btsVar.t(false);
                btsVar.e0(-738394228);
                btsVar.e0(-1202985394);
                String e2 = ohb1.e(btsVar, gzh0.atoms_search);
                btsVar.t(false);
                btsVar.t(false);
                to5 to5Var = x4c.E;
                f530 c = ljs0.c(f530Var, 1.0f);
                qnm qnmVar3 = qnm.a;
                f530 e3 = ljs0.e(m4m0.b(c, qnm.c(btsVar).T(), cyk0.c(dsSearch$Size.getShapeRadius())), dsSearch$Size.getHeight());
                btsVar.e0(5004770);
                Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new w5(26, oz40Var5);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                f530 y = eja1.y(e3, (tls) Q2);
                btsVar.e0(-1224400529);
                int i8 = i3 & 14;
                k4 = (i8 != 4) | ((i3 & 112) != 32) | btsVar.k(e2) | ((458752 & i3) != 131072);
                Q3 = btsVar.Q();
                if (!k4 || Q3 == o430Var) {
                    i6 = i3;
                    z3 = z2;
                    oz40Var3 = oz40Var2;
                    oz40Var4 = oz40Var;
                    cc2 cc2Var = new cc2(str, e2, z3, str3, 2);
                    str3 = str3;
                    btsVar.o0(cc2Var);
                    Q3 = cc2Var;
                } else {
                    i6 = i3;
                    z3 = z2;
                    oz40Var3 = oz40Var2;
                    oz40Var4 = oz40Var;
                }
                btsVar.t(false);
                f530 b = fnq0.b(y, true, (tls) Q3);
                lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, b);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a != null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a2);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d);
                mgv image = dsSearch$Size.getImage();
                long h0 = qnm.c(btsVar).h0();
                float iconStartPadding = dsSearch$Size.getIconStartPadding();
                qnm.d.getClass();
                c530 c530Var = c530.a;
                xjx xjxVar5 = xjxVar4;
                int i9 = 0;
                oz40 oz40Var6 = oz40Var4;
                q4v.a(image, null, an91.o(c530Var, iconStartPadding, 0.0f, 12.0f, 0.0f, 10), h0, btsVar, 48, 0);
                btsVar.e0(5004770);
                Object Q4 = btsVar.Q();
                int i10 = 27;
                if (Q4 == o430Var) {
                    Q4 = new w5(i10, oz40Var6);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                f530 k5 = ci91.f(c530Var, (tls) Q4).k(new x2y(1.0f, true));
                btsVar.e0(1849434622);
                Object Q5 = btsVar.Q();
                if (Q5 == o430Var) {
                    Q5 = new teb(20);
                    btsVar.o0(Q5);
                }
                btsVar.t(false);
                f530 a3 = fnq0.a(k5, (tls) Q5);
                boolean z6 = !z3;
                ety0 a4 = ety0.a(ety0Var, qnm.c(btsVar).g0(), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                boolean z7 = z3;
                lkx lkxVar2 = new lkx(3, i9, i9, HProv.PP_DELETE_SAVED_PASSWD);
                a6t0 a6t0Var = new a6t0(qnm.c(btsVar).g0());
                btsVar.e0(5004770);
                int i11 = i6 & 7168;
                boolean z8 = i11 == 2048;
                Object Q6 = btsVar.Q();
                if (z8 || Q6 == o430Var) {
                    lkxVar = lkxVar2;
                    Q6 = new dv9(27, tlsVar);
                    btsVar.o0(Q6);
                } else {
                    lkxVar = lkxVar2;
                }
                btsVar.t(false);
                xjxVar3 = xjxVar5;
                int i12 = i6;
                ne5.b(str, (tls) Q6, a3, z7, z6, a4, lkxVar, xjxVar3, true, 1, 0, null, null, null, a6t0Var, wwg.S(-1992967755, true, new tsm(str, str3, ety0Var, oz40Var6), btsVar), btsVar, 907542528 | i8 | ((i6 >> 6) & 7168) | (29360128 & i6), ImageMetadata.EDGE_MODE, 15360);
                btsVar = btsVar;
                btsVar.e0(-2129355323);
                if (str.length() <= 0 || !z7) {
                    z4 = false;
                } else {
                    btsVar.e0(-1633490746);
                    boolean z9 = ((i12 & 3670016) == 1048576) | (i11 == 2048);
                    Object Q7 = btsVar.Q();
                    if (z9 || Q7 == o430Var) {
                        Q7 = new ssm(null, tlsVar);
                        btsVar.o0(Q7);
                    }
                    sls slsVar2 = (sls) Q7;
                    z4 = false;
                    Object k6 = g8e.k(5004770, btsVar, false);
                    if (k6 == o430Var) {
                        k6 = new w5(28, oz40Var3);
                        btsVar.o0(k6);
                    }
                    btsVar.t(false);
                    f530 o2 = an91.o(eja1.y(c530Var, (tls) k6), 12.0f, 0.0f, ((fwi) btsVar.m(j.h)).I(((Number) m3u0Var.getValue()).floatValue()), 0.0f, 10);
                    qnm.c.getClass();
                    f530 m = ljs0.m(o2, 40.0f);
                    u6d.a.getClass();
                    o3b1.a(slsVar2, m, false, u6d.b, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                }
                btsVar.t(z4);
                btsVar.t(true);
                z5 = z7;
            } else {
                btsVar.Y();
                xjxVar3 = xjxVar2;
                z5 = z2;
            }
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new u07(str, str2, dsSearch$Size, tlsVar, f530Var, z5, xjxVar3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i7 != 0) {
        }
        if (i4 == 0) {
        }
        i5 = usm.a[dsSearch$Size.ordinal()];
        if (i5 != 1) {
        }
        ety0 ety0Var2 = e;
        btsVar.e0(1849434622);
        Q = btsVar.Q();
        o430Var = did.a;
        if (Q == o430Var) {
        }
        oz40Var = (oz40) Q;
        k = g8e.k(1849434622, btsVar, false);
        if (k == o430Var) {
        }
        oz40 oz40Var52 = (oz40) k;
        k2 = g8e.k(1849434622, btsVar, false);
        if (k2 == o430Var) {
        }
        oz40Var2 = (oz40) k2;
        k3 = g8e.k(1849434622, btsVar, false);
        if (k3 == o430Var) {
        }
        m3u0 m3u0Var2 = (m3u0) k3;
        btsVar.t(false);
        btsVar.e0(-738394228);
        btsVar.e0(-1202985394);
        String e22 = ohb1.e(btsVar, gzh0.atoms_search);
        btsVar.t(false);
        btsVar.t(false);
        to5 to5Var2 = x4c.E;
        f530 c2 = ljs0.c(f530Var, 1.0f);
        qnm qnmVar32 = qnm.a;
        f530 e32 = ljs0.e(m4m0.b(c2, qnm.c(btsVar).T(), cyk0.c(dsSearch$Size.getShapeRadius())), dsSearch$Size.getHeight());
        btsVar.e0(5004770);
        Q2 = btsVar.Q();
        if (Q2 == o430Var) {
        }
        btsVar.t(false);
        f530 y2 = eja1.y(e32, (tls) Q2);
        btsVar.e0(-1224400529);
        int i82 = i3 & 14;
        k4 = (i82 != 4) | ((i3 & 112) != 32) | btsVar.k(e22) | ((458752 & i3) != 131072);
        Q3 = btsVar.Q();
        if (k4) {
        }
        i6 = i3;
        z3 = z2;
        oz40Var3 = oz40Var2;
        oz40Var4 = oz40Var;
        cc2 cc2Var2 = new cc2(str, e22, z3, str3, 2);
        str3 = str3;
        btsVar.o0(cc2Var2);
        Q3 = cc2Var2;
        btsVar.t(false);
        f530 b2 = fnq0.b(y2, true, (tls) Q3);
        lhl0 a22 = khl0.a(lr20.a, to5Var2, btsVar, 48);
        int hashCode2 = Long.hashCode(btsVar.T);
        r1b0 o3 = btsVar.o();
        f530 d2 = b.d(btsVar, b2);
        ohd.G1.getClass();
        sls slsVar3 = d.b;
        if (btsVar.a != null) {
        }
    }

    public static final void b(Map map, wls wlsVar) {
        for (Map.Entry entry : map.entrySet()) {
            wlsVar.invoke(entry.getValue(), entry.getKey());
        }
    }

    public static wnd0 c(xz3 xz3Var) {
        vnd0 vnd0Var = new vnd0();
        xz3Var.invoke(vnd0Var);
        return new wnd0(vnd0Var.a, vnd0Var.b);
    }
}
