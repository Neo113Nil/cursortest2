package defpackage;

import androidx.compose.animation.k;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.passport.internal.ui.bouncer.chooser.g;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wza1 {
    public static au2 a;

    public static final void a(ebp0 ebp0Var, f9u f9uVar, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(455126813);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f9uVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            String str = f9uVar.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            ety0 c = bza1.c(xya1.e(btsVar2).e.a, fwiVar);
            int i4 = (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i3 & 896);
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            p9b1.c(ebp0Var2, str, c530Var, appColor$Palette, c, 0, 0, null, null, null, 0, 0, null, btsVar, i4, 0, 8176);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(ebp0Var, f9uVar, f530Var2, i, 20);
        }
    }

    public static final void b(ibp0 ibp0Var, qcu qcuVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1640153769);
        if ((i & 48) == 0) {
            i2 = (btsVar.k(qcuVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(c530.a) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1169) != 1168)) {
            if (qcuVar.c != null) {
                i3 = 32;
                z = true;
            } else {
                i3 = 32;
                z = false;
            }
            fwi fwiVar = (fwi) btsVar.m(j.h);
            int i5 = i3;
            gz6 gz6Var = d17.b;
            boolean a2 = ((i2 & 7168) == 2048) | btsVar.a(z) | ((i2 & 112) == i5);
            Object Q = btsVar.Q();
            if (a2 || Q == did.a) {
                Q = new ex0(z, tlsVar, qcuVar, 11);
                btsVar.o0(Q);
            }
            h(z, gz6Var, (sls) Q, wwg.S(-2045507016, true, new eau(qcuVar, fwiVar, i4), btsVar), btsVar, 196608 | ((i2 >> 6) & 14));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(ibp0Var, qcuVar, tlsVar, i);
        }
    }

    public static final void c(wdu wduVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-301921980);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wduVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            qau qauVar = wduVar.a;
            f9u f9uVar = wduVar.b;
            qcu qcuVar = wduVar.c;
            String str = wduVar.d;
            boolean k = btsVar.k(qcuVar) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                if (qcuVar == null) {
                    Q = null;
                } else {
                    if (!(qcuVar instanceof qcu)) {
                        w511.b();
                        return;
                    }
                    Q = qcuVar.c != null ? new nif(new bdp(24, tlsVar, qcuVar), qcuVar.b) : null;
                }
                btsVar.o0(Q);
            }
            nif nifVar = (nif) Q;
            boolean k2 = btsVar.k(str) | btsVar.e(nifVar);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new sxo(27, str, nifVar);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ydb1.a(ooc.d(fnq0.a(c530Var, (tls) Q2), null, 3), wwg.S(325311194, true, new ctq(5, qauVar), btsVar), wwg.S(5567893, true, new ctq(6, f9uVar), btsVar), null, wwg.S(-1428790961, true, new nfj(11, qcuVar, tlsVar), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) wduVar, f530Var2, (Object) tlsVar, i, 19);
        }
    }

    public static final void d(wdu wduVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-646895500);
        int i2 = i | (btsVar.k(wduVar) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            int i3 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i3);
                btsVar.o0(Q);
            }
            w2o a2 = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i3);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ttb1.a(wduVar, c530Var, a2, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "HeaderItem", wwg.S(-257387241, true, new o91(5, tlsVar), btsVar), btsVar, (i2 & 14) | 224688, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(wduVar, f530Var2, tlsVar, i, 11);
        }
    }

    public static final void e(ibp0 ibp0Var, qau qauVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2111476969);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qauVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            if (qauVar != null) {
                btsVar.e0(1080788987);
                c530Var = c530Var2;
                tdb1.d(ibp0Var, qauVar.a, c530Var, null, null, null, 0.0f, 0, wwg.S(72776460, true, new bns(qauVar), btsVar), btsVar, (i3 & 14) | 805306368 | (i3 & 896), 252);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                btsVar.e0(1081091702);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(ibp0Var, qauVar, f530Var2, i, 15);
        }
    }

    public static final void f(ibp0 ibp0Var, qcu qcuVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-581028816);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(qcuVar) : btsVar.e(qcuVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = qcuVar instanceof qcu;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-710793418);
                b(ibp0Var, qcuVar, tlsVar, btsVar, i3 & 8190);
                btsVar.t(false);
            } else {
                if (qcuVar != null) {
                    throw unr0.y(-22937805, btsVar, false);
                }
                btsVar.e0(-22923332);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g(ibp0Var, qcuVar, f530Var2, tlsVar, i, 1);
        }
    }

    public static final void g(spm0 spm0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(953128147);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(spm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lbd.a.getClass();
            ydb1.a(null, lbd.d, wwg.S(594870498, true, new pdf0(23, spm0Var), btsVar), null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(spm0Var, i, 3);
        }
    }

    public static final void h(boolean z, gz6 gz6Var, sls slsVar, a aVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        gz6 gz6Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-696088271);
        int i3 = i & 6;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 = (btsVar.k(c530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            gz6Var2 = gz6Var;
            i2 |= btsVar.k(gz6Var2) ? 256 : 128;
        } else {
            gz6Var2 = gz6Var;
        }
        int i4 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
            int i5 = (i4 & 112) | 1769472 | (i4 & 896) | (i4 & 7168);
            int i6 = i4 << 9;
            d17.b(fj91.d(an91.o(c530Var, 8.0f, 0.0f, 8.0f, 0.0f, 10), IntrinsicSize.Min), z2, gz6Var2, null, ButtonSize.XS.getSize(), Float.POSITIVE_INFINITY, false, slsVar, aVar, btsVar, i5 | (29360128 & i6) | (i6 & 234881024));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(z, gz6Var, slsVar, aVar, i);
        }
    }

    public static final au2 i() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(4.0f, 11.0f);
        uq90Var.g(12.2f);
        uq90Var.i(-5.6f, -5.6f);
        uq90Var.h(12.0f, 4.0f);
        uq90Var.i(8.0f, 8.0f);
        uq90Var.i(-8.0f, 8.0f);
        uq90Var.i(-1.4f, -1.4f);
        uq90Var.i(5.6f, -5.6f);
        uq90Var.f(4.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
