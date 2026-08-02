package ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.tile;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.a4b1;
import defpackage.a5z0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c1p0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ef70;
import defpackage.f530;
import defpackage.fid;
import defpackage.ipb1;
import defpackage.jl40;
import defpackage.k1s0;
import defpackage.kd3;
import defpackage.kqf0;
import defpackage.ky;
import defpackage.lhg;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.mcu;
import defpackage.mhg;
import defpackage.n4z0;
import defpackage.nox0;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oki0;
import defpackage.oyr;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r4z0;
import defpackage.s37;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.t4z0;
import defpackage.tre;
import defpackage.ugg0;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.v4v;
import defpackage.v7l0;
import defpackage.vg0;
import defpackage.w3b1;
import defpackage.w4z0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xjf0;
import defpackage.z910;
import defpackage.zhb0;
import defpackage.zpn;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.ImagePositionState;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.CharSequence] */
    public static final void a(f530 f530Var, mcu mcuVar, t4z0 t4z0Var, w3b1 w3b1Var, a4b1 a4b1Var, ky kyVar, v4v v4vVar, ImagePositionState imagePositionState, TileStyle tileStyle, String str, Object obj, fid fidVar, int i) {
        int i2;
        t4z0 t4z0Var2;
        w3b1 w3b1Var2;
        ky kyVar2;
        ImagePositionState imagePositionState2;
        bts btsVar;
        String str2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-922122337);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(mcuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            t4z0Var2 = t4z0Var;
            i2 |= btsVar2.k(t4z0Var2) ? 256 : 128;
        } else {
            t4z0Var2 = t4z0Var;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            w3b1Var2 = w3b1Var;
            i2 |= btsVar2.k(w3b1Var2) ? 2048 : 1024;
        } else {
            w3b1Var2 = w3b1Var;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(a4b1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            kyVar2 = kyVar;
            i2 |= btsVar2.k(kyVar2) ? 131072 : 65536;
        } else {
            kyVar2 = kyVar;
        }
        if ((i & 1572864) == 0) {
            i2 |= btsVar2.k(v4vVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.c(imagePositionState == null ? -1 : imagePositionState.ordinal()) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar2.c(tileStyle != null ? tileStyle.ordinal() : -1) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i2 |= btsVar2.k(str) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i3 = i2;
        int i4 = btsVar2.e(obj) ? 4 : 2;
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            float f = (tileStyle == TileStyle.IMAGE && imagePositionState == ImagePositionState.TOP) ? 16.0f : 0.0f;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d2);
            str2 = "";
            String str3 = a4b1Var instanceof oki0 ? ((oki0) a4b1Var).a : a4b1Var instanceof tre ? ((tre) a4b1Var).a : "";
            if (mcuVar instanceof n4z0) {
                n4z0 n4z0Var = (n4z0) mcuVar;
                CharSequence charSequence = n4z0Var.a;
                ?? r4 = n4z0Var.b;
                str2 = ((Object) charSequence) + Extension.FIX_SPACE + ((Object) (r4 != 0 ? r4 : "")) + Extension.FIX_SPACE + str3;
            } else if (mcuVar instanceof w4z0) {
                w4z0 w4z0Var = (w4z0) mcuVar;
                String str4 = w4z0Var.a;
                String str5 = w4z0Var.b;
                str2 = oyr.q(str4, Extension.FIX_SPACE, str5 != null ? str5 : "", Extension.FIX_SPACE, str3);
            }
            int i5 = i3 >> 18;
            imagePositionState2 = imagePositionState;
            ipb1.a(kyVar2, w3b1Var2, str2, str, obj, an91.o(ljs0.c, 0.0f, f, 0.0f, 0.0f, 13), wwg.S(-2101944781, true, new vg0(mcuVar, t4z0Var2, tileStyle, v4vVar, imagePositionState, 13), btsVar2), btsVar2, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 6) & 112) | (i5 & 7168) | ((i4 << 12) & HProv.ALG_CLASS_ALL));
            btsVar = btsVar2;
            if (v4vVar == null || imagePositionState2 != ImagePositionState.TOP) {
                btsVar.e0(-2109764663);
                btsVar.t(false);
            } else {
                btsVar.e0(-2109883176);
                s3b1.f(v4vVar, cj6.a.a(c530.a, x4c.c), null, btsVar, i5 & 14, 4);
                btsVar.t(false);
            }
            r4z0.b(a4b1Var, f, btsVar, ((i3 >> 9) & 112) | 6);
            btsVar.t(true);
        } else {
            imagePositionState2 = imagePositionState;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v7l0(f530Var, mcuVar, t4z0Var, w3b1Var, a4b1Var, kyVar, v4vVar, imagePositionState2, tileStyle, str, obj, i);
        }
    }

    public static final void b(f530 f530Var, a5z0 a5z0Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1145625805);
        int i2 = i | 6 | (btsVar.k(a5z0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhg lhgVar = (lhg) btsVar.m(mhg.a);
            mcu mcuVar = a5z0Var.a;
            t4z0 t4z0Var = a5z0Var.b;
            w3b1 w3b1Var = a5z0Var.c;
            a4b1 a4b1Var = a5z0Var.d;
            ky kyVar = a5z0Var.e;
            v4v v4vVar = a5z0Var.f;
            ImagePositionState imagePositionState = a5z0Var.g;
            TileStyle tileStyle = a5z0Var.h;
            String str = a5z0Var.i;
            Object obj = a5z0Var.j;
            f530Var2 = c530.a;
            a(f530Var2, mcuVar, t4z0Var, w3b1Var, a4b1Var, kyVar, v4vVar, imagePositionState, tileStyle, str, obj, btsVar, 6);
            boolean e = btsVar.e(lhgVar) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ShortcutTileKt$ShortcutTile$1$1(lhgVar, a5z0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, a5z0Var);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(f530Var2, a5z0Var, i, 9);
        }
    }

    public static final void c(x2y x2yVar, mcu mcuVar, t4z0 t4z0Var, TileStyle tileStyle, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-850597954);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(x2yVar) ? 4 : 2) | (btsVar.k(mcuVar) ? 32 : 16) | (btsVar.k(t4z0Var) ? 256 : 128) | (btsVar.c(tileStyle.ordinal()) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, x2yVar);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            if (mcuVar == null) {
                btsVar.e0(-1700113444);
                z = false;
                btsVar.t(false);
            } else {
                btsVar.e0(-1700113443);
                int i3 = k1s0.a[tileStyle.ordinal()];
                if (i3 == 1) {
                    z = false;
                    btsVar.e0(-1720049821);
                    r4z0.l(mcuVar, btsVar, (i2 & 112) | 6);
                    btsVar.t(false);
                } else {
                    if (i3 != 2) {
                        throw unr0.y(-1720051600, btsVar, false);
                    }
                    btsVar.e0(-1720047960);
                    r4z0.m(mcuVar, btsVar, (i2 >> 3) & 14);
                    z = false;
                    btsVar.t(false);
                }
                btsVar.t(z);
            }
            btsVar.t(true);
            oeb1.c(btsVar, new x2y(1.0f, true));
            f530 c2 = ljs0.c(c530Var, 1.0f);
            z910 d4 = pi6.d(uo5Var, z);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            if (t4z0Var instanceof nox0) {
                btsVar.e0(918218243);
                r4z0.j((nox0) t4z0Var, btsVar, 6 | ((i2 >> 3) & 112));
                btsVar.t(false);
            } else if (t4z0Var instanceof ef70) {
                btsVar.e0(918220451);
                r4z0.e((ef70) t4z0Var, btsVar, 6 | ((i2 >> 3) & 112));
                btsVar.t(false);
            } else if (t4z0Var instanceof kqf0) {
                btsVar.e0(918222626);
                r4z0.g((kqf0) t4z0Var, btsVar, 6 | ((i2 >> 3) & 112));
                btsVar.t(false);
            } else if (t4z0Var instanceof ugg0) {
                btsVar.e0(918225034);
                r4z0.i((ugg0) t4z0Var, btsVar, 6 | ((i2 >> 3) & 112));
                btsVar.t(false);
            } else if (t4z0Var instanceof kd3) {
                btsVar.e0(918227723);
                r4z0.a((kd3) t4z0Var, btsVar, (i2 >> 6) & 14);
                btsVar.t(false);
            } else if (t4z0Var instanceof s37) {
                btsVar.e0(918230179);
                r4z0.c((s37) t4z0Var, btsVar, 6 | ((i2 >> 3) & 112));
                btsVar.t(false);
            } else if (t4z0Var instanceof xjf0) {
                btsVar.e0(918232453);
                r4z0.f((xjf0) t4z0Var, btsVar, (i2 >> 6) & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(918234063);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(x2yVar, mcuVar, t4z0Var, tileStyle, i, 16);
        }
    }
}
