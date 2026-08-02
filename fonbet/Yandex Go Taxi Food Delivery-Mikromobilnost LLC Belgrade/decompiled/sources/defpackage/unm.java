package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsActionBar$Variant;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class unm {
    public static final qwd a = new qwd(new jbm(18));

    public static final void a(snm snmVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1649989640);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(snmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            mo91.d(snmVar.a, snmVar.c, snmVar.b, f530Var, snmVar.d, null, null, null, false, null, snmVar.e, btsVar, (i2 << 6) & 7168, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(snmVar, f530Var, i, 15);
        }
    }

    public static final void b(DsActionBar$Variant dsActionBar$Variant, snm snmVar, f530 f530Var, snm snmVar2, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        boolean z;
        snm snmVar3 = snmVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1129732493);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = i | (btsVar.c(dsActionBar$Variant.ordinal()) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (btsVar.k(snmVar) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i4 = i6 | (btsVar.k(f530Var2) ? 256 : 128);
        }
        int i8 = i4 | (btsVar.k(snmVar3) ? 2048 : 1024);
        if ((i2 & 16) != 0) {
            i5 = i8 | HProv.ALG_CLASS_DATA_ENCRYPT;
        } else {
            i5 = i8 | (btsVar.a(false) ? 16384 : 8192);
        }
        if ((i5 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var = c530.a;
            if (i7 != 0) {
                f530Var2 = c530Var;
            }
            so5 so5Var = x4c.G;
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var2);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            btsVar.e0(-313685513);
            btsVar.t(false);
            int i9 = tnm.a[dsActionBar$Variant.ordinal()];
            qwd qwdVar = a;
            if (i9 == 1) {
                int i10 = i5;
                btsVar.e0(-1134065674);
                f530 c = ljs0.c(c530Var, 1.0f);
                qnm.d.getClass();
                f530 l = an91.l(c, 16.0f, ((y7m) btsVar.m(qwdVar)).a);
                lhl0 a3 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, l);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a3);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d2);
                btsVar.e0(102591573);
                if (snmVar3 != null) {
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    a(snmVar3, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, (i10 >> 9) & 14);
                }
                btsVar.t(false);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                z = true;
                a(snmVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, (i10 >> 3) & 14);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                if (i9 != 2) {
                    throw unr0.y(-313678573, btsVar, false);
                }
                btsVar.e0(-1133208710);
                qnm.d.getClass();
                f530 l2 = an91.l(c530Var, 16.0f, ((y7m) btsVar.m(qwdVar)).a);
                int i11 = i5;
                sic a4 = qic.a(new i43(8.0f, true, new quz(11)), so5Var, btsVar, 0);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = b.d(btsVar, l2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a4);
                qje.W(btsVar, wlsVar2, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d3);
                a(snmVar, ljs0.c(c530Var, 1.0f), btsVar, ((i11 >> 3) & 14) | 48);
                btsVar.e0(1853728766);
                if (snmVar2 != null) {
                    snmVar3 = snmVar2;
                    a(snmVar3, ljs0.c(c530Var, 1.0f), btsVar, ((i11 >> 9) & 14) | 48);
                } else {
                    snmVar3 = snmVar2;
                }
                tse0.t(btsVar, false, true, false);
                z = true;
            }
            btsVar.t(z);
        }
        f530 f530Var3 = f530Var2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(dsActionBar$Variant, snmVar, f530Var3, snmVar3, i, i2);
        }
    }
}
