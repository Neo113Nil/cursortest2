package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.d;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final class t230 implements wni {
    public final le6 A;
    public final y30 a;
    public final hwy0 b;
    public final tgg c;
    public final d w;
    public final dci x;
    public final t6s y;
    public final oy60 z;

    public t230(y30 y30Var, hwy0 hwy0Var, tgg tggVar, d dVar, dci dciVar, t6s t6sVar, oy60 oy60Var, le6 le6Var) {
        this.a = y30Var;
        this.b = hwy0Var;
        this.c = tggVar;
        this.w = dVar;
        this.x = dciVar;
        this.y = t6sVar;
        this.z = oy60Var;
        this.A = le6Var;
    }

    public final void a(oz40 oz40Var, oip0 oip0Var, qkg qkgVar, boolean z, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2021940713);
        int i3 = (btsVar.k(oip0Var) ? 256 : 128) | i2 | (btsVar.k(qkgVar) ? 2048 : 1024);
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar.c(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar.e(this) ? 1048576 : 524288;
        }
        if (btsVar.V(i3 & 1, (599187 & i3) != 599186)) {
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-1280262075);
                oeb1.c(btsVar, ljs0.e(c530Var, ((fwi) btsVar.m(j.h)).H(i)));
                oz40Var.setValue(Integer.valueOf(i));
                btsVar.t(false);
            } else {
                btsVar.e0(-1280002853);
                f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new ttm(6, oz40Var);
                    btsVar.o0(Q);
                }
                lbb1.b(cj6.a.a(eja1.y(u, (tls) Q), x4c.B), oip0Var.b(), 0.0f, 0.0f, null, null, wwg.S(1982333416, true, new s230(this, qkgVar, 1), btsVar), btsVar, 1572864, 60);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new egb(this, oz40Var, oip0Var, qkgVar, z, i, i2, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0119, code lost:
    
        if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r3)) == false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(oz40 oz40Var, oz40 oz40Var2, oip0 oip0Var, qkg qkgVar, boolean z, ldc ldcVar, int i, fid fidVar, int i2) {
        int i3;
        oz40 oz40Var3;
        int i4;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1354319428);
        dmw0 dmw0Var = btsVar.a;
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(oz40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            oz40Var3 = oz40Var2;
            i3 |= btsVar.k(oz40Var3) ? 32 : 16;
        } else {
            oz40Var3 = oz40Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.k(oip0Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(qkgVar) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar.k(ldcVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar.c(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= btsVar.e(this) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar.V(i3 & 1, (4793491 & i3) != 4793490)) {
            oz40 b = rhd.b(btsVar);
            boolean z2 = qkgVar.e;
            c530 c530Var = c530.a;
            f530 u = z2 ? c530Var : pw91.u(c530Var, oip0Var, 14);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S) {
                i4 = i3;
            } else {
                i4 = i3;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            f530 o2 = an91.o(ljs0.c(c530Var, 1.0f).k(u), 0.0f, 0.0f, 0.0f, ((Boolean) b.getValue()).booleanValue() ? fwiVar.H(((Number) oz40Var3.getValue()).intValue()) : 0.0f, 7);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            f530 c = ljs0.c(ljs0.e(c530Var, fwiVar.H(((Number) oz40Var.getValue()).intValue())), 1.0f);
            a7u0 a7u0Var = gl51.a;
            long c2 = ((el51) btsVar.m(a7u0Var)).c();
            a7u0 a7u0Var2 = qm51.a;
            pi6.a(m4m0.b(c, c2, YandexShapes.c(((YandexShapes) btsVar.m(a7u0Var2)).d, YandexShapes.Corner.TOP)), btsVar, 0);
            float f = i;
            if (ldcVar == null) {
                btsVar.e0(844539144);
                j = ((el51) btsVar.m(a7u0Var)).i();
                btsVar.t(false);
            } else {
                btsVar.e0(844537966);
                btsVar.t(false);
                j = ldcVar.a;
            }
            this.c.a(qkgVar, null, f, j, true, z, null, btsVar, ((i4 >> 9) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i4 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | 16777216, 66);
            if (((Boolean) b.getValue()).booleanValue()) {
                btsVar.e0(411565154);
                btsVar.t(false);
            } else {
                btsVar.e0(411103874);
                pi6.a(m4m0.b(ljs0.c(ljs0.e(c530Var, fwiVar.H(((Number) oz40Var2.getValue()).intValue())), 1.0f), ((el51) btsVar.m(a7u0Var)).c(), YandexShapes.c(((YandexShapes) btsVar.m(a7u0Var2)).d, YandexShapes.Corner.BOTTOM)), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u07(this, oz40Var, oz40Var2, oip0Var, qkgVar, z, ldcVar, i, i2);
        }
    }

    public final void c(boolean z, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, ldc ldcVar, int i, boolean z2, int i2, fid fidVar, int i3) {
        qkg qkgVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1807457993);
        int i4 = i3 | (btsVar.a(z) ? 4 : 2) | (btsVar.k(qkgVar) ? 32 : 16) | (btsVar.k(qkgVar2) ? 256 : 128) | (btsVar.k(qkgVar3) ? 2048 : 1024) | (btsVar.k(ldcVar) ? 16384 : 8192) | (btsVar.c(i) ? 131072 : 65536) | (btsVar.a(z2) ? 1048576 : 524288) | (btsVar.c(i2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(this) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar.V(i4 & 1, (38347923 & i4) != 38347922)) {
            oip0 o = pw91.o(btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.g(0);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (yx40) Q2;
            f530 a = androidx.compose.ui.input.nestedscroll.b.a(z ? ljs0.c : c530.a, zrb1.f(btsVar), null);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            d(oz40Var, o, qkgVar, btsVar, ((i4 << 6) & 7168) | 54 | ((i4 >> 12) & HProv.ALG_CLASS_ALL));
            qkgVar4 = qkgVar;
            int i5 = i4 << 3;
            b(oz40Var, oz40Var2, o, qkgVar2, !qkgVar4.a.isEmpty(), ldcVar, i, btsVar, (i5 & 3670016) | (i5 & 7168) | 54 | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (29360128 & (i4 >> 3)));
            int i6 = 54 | (i4 & 7168);
            int i7 = i4 >> 6;
            a(oz40Var2, o, qkgVar3, z2, i2, btsVar, i6 | (i7 & HProv.ALG_CLASS_ALL) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES) | (i7 & 3670016));
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            qkgVar4 = qkgVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new up5(this, z, qkgVar4, qkgVar2, qkgVar3, ldcVar, i, z2, i2, i3);
        }
    }

    public final void d(oz40 oz40Var, oip0 oip0Var, qkg qkgVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2100739812);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(oz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(oip0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(qkgVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(this) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 g = s1a1.g(ljs0.u(ljs0.c(c530.a, 1.0f), null, 3), 1.0f);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ttm(5, oz40Var);
                btsVar.o0(Q);
            }
            lbb1.b(cj6Var.a(eja1.y(g, (tls) Q), x4c.c), oip0Var.e(), 0.0f, 8.0f, null, cyk0.c(((YandexShapes) btsVar.m(qm51.a)).d), wwg.S(-1259584535, true, new s230(this, qkgVar, 0), btsVar), btsVar, 1575936, 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(this, oz40Var, oip0Var, qkgVar, i, 8);
        }
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a.a(), null, 0, 6, null);
        composeView.setContent(new a(-1021893491, new r230(this, (l030) uniVar, 0), true));
        return composeView;
    }
}
