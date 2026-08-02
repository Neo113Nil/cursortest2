package defpackage;

import androidx.compose.animation.m;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsButton$Size;
import defpackage.jl40;
import defpackage.oz40;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class rx91 implements ryq {
    public static final zii0 a = new zii0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    public static final void a(final kx91 kx91Var, final boolean z, final f530 f530Var, final long j, final rtm rtmVar, final rtm rtmVar2, final rtm rtmVar3, final rtm rtmVar4, final rtm rtmVar5, fid fidVar, final int i) {
        int i2;
        int i3;
        bts btsVar;
        ntm ntmVar;
        Object d;
        rtm rtmVar6;
        rtm rtmVar7;
        rtm rtmVar8;
        qtm qtmVar;
        rtm rtmVar9;
        bts btsVar2;
        ntm ntmVar2;
        o430 o430Var;
        ?? r4;
        boolean z2;
        boolean z3;
        bts btsVar3;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(-2068424805);
        int i4 = i & 6;
        ntm ntmVar3 = ntm.a;
        if (i4 == 0) {
            i2 = (btsVar4.k(ntmVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar4.e(kx91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar4.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar4.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar4.d(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar4.k(rtmVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar4.k(rtmVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= btsVar4.k(rtmVar3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i2 |= btsVar4.k(rtmVar4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i2 |= btsVar4.k(rtmVar5) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 306783379) == 306783378 && btsVar4.E()) {
            btsVar4.Y();
            btsVar3 = btsVar4;
        } else {
            btsVar4.a0();
            if ((i & 1) != 0 && !btsVar4.C()) {
                btsVar4.Y();
            }
            btsVar4.u();
            qnm qnmVar = qnm.a;
            long a2 = qnm.c(btsVar4).a();
            btsVar4.e0(-1633490746);
            boolean k = ((((57344 & i2) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar4.d(j)) || (i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | btsVar4.k(kx91Var);
            Object Q = btsVar4.Q();
            o430 o430Var2 = did.a;
            if (k || Q == o430Var2) {
                i3 = i2;
                btsVar = btsVar4;
                ntmVar = ntmVar3;
                d = f.d(new wtm(kx91Var, a2, j));
                btsVar.o0(d);
            } else {
                btsVar = btsVar4;
                d = Q;
                i3 = i2;
                ntmVar = ntmVar3;
            }
            btsVar.t(false);
            m3u0 a3 = m.a(((ldc) ((m3u0) d).getValue()).a, sb2.G(0.0f, 400.0f, 5, null), null, btsVar, 48, 12);
            btsVar.e0(1849434622);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = f.j(0);
                btsVar.o0(Q2);
            }
            final oz40 oz40Var = (oz40) Q2;
            Object k2 = g8e.k(1849434622, btsVar, false);
            if (k2 == o430Var2) {
                k2 = f.j(0);
                btsVar.o0(k2);
            }
            final oz40 oz40Var2 = (oz40) k2;
            Object k3 = g8e.k(1849434622, btsVar, false);
            if (k3 == o430Var2) {
                k3 = f.d(new sls() { // from class: com.yx360.design.compose.atoms.topbar.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        oz40 oz40Var3 = oz40.this;
                        int intValue = ((Number) oz40Var3.getValue()).intValue();
                        oz40 oz40Var4 = oz40Var2;
                        int abs = Math.abs(intValue - ((Number) oz40Var4.getValue()).intValue());
                        int q = jl40.q(((Number) oz40Var3.getValue()).intValue(), ((Number) oz40Var4.getValue()).intValue());
                        return q == 0 ? new a(0, DsTopBarCenteredHorizontalPaddingType.None) : q > 0 ? new a(abs, DsTopBarCenteredHorizontalPaddingType.End) : new a(abs, DsTopBarCenteredHorizontalPaddingType.Start);
                    }
                });
                btsVar.o0(k3);
            }
            btsVar.t(false);
            to5 to5Var = x4c.E;
            h43 h43Var = lr20.g;
            qtm qtmVar2 = qtm.a;
            if (!z) {
                if (rtmVar.equals(qtmVar2)) {
                    h43Var = lr20.b;
                } else if (rtmVar.equals(qtmVar2)) {
                    h43Var = lr20.a;
                }
            }
            f530 b = m4m0.b(f530Var, ((ldc) a3.getValue()).a, qke.q);
            btsVar.e0(2019025223);
            WeakHashMap weakHashMap = a.w;
            pfy pfyVar = new pfy(new sy11(vuz.o(btsVar).g, vuz.o(btsVar).b), 15 | 16);
            btsVar.t(false);
            f530 e = b9a1.e(b, pfyVar);
            qnm.d.getClass();
            f530 c = ljs0.c(ljs0.e(an91.o(e, 16.0f, 0.0f, 8.0f, 0.0f, 10), 44.0f), 1.0f);
            lhl0 a4 = khl0.a(h43Var, to5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            qje.W(btsVar, d.f, a4);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.c0(-1837778529, rtmVar);
            btsVar.e0(-1837777485);
            if (rtmVar.equals(qtmVar2)) {
                rtmVar6 = rtmVar2;
                rtmVar7 = rtmVar3;
                rtmVar8 = rtmVar4;
                qtmVar = qtmVar2;
                rtmVar9 = rtmVar5;
                btsVar2 = btsVar;
                ntmVar2 = ntmVar;
                o430Var = o430Var2;
                r4 = 0;
            } else {
                qnm.c.getClass();
                ntmVar2 = ntmVar;
                qtmVar = qtmVar2;
                rtmVar9 = rtmVar5;
                bts btsVar5 = btsVar;
                o430Var = o430Var2;
                r4 = 0;
                rtmVar7 = rtmVar3;
                rtmVar6 = rtmVar2;
                rtmVar8 = rtmVar4;
                c(rtmVar, 24.0f, null, an91.d(0.0f, 0.0f, 16.0f, 0.0f, 11), oz40Var, btsVar5, ((i3 >> 15) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 4);
                btsVar2 = btsVar5;
            }
            btsVar2.t(r4);
            btsVar2.t(r4);
            ntm ntmVar4 = ntmVar2;
            if (!ntmVar4.equals(ntmVar4)) {
                throw unr0.y(-1837766477, btsVar2, r4);
            }
            btsVar2.e0(-1837749189);
            btsVar2.t(r4);
            btsVar2.e0(-1224400529);
            boolean z4 = ((i3 & 29360128) == 8388608 ? true : r4) | ((i3 & 3670016) == 1048576 ? true : r4) | ((i3 & 234881024) == 67108864 ? true : r4) | ((i3 & 1879048192) == 536870912 ? true : r4);
            Object Q3 = btsVar2.Q();
            if (z4 || Q3 == o430Var) {
                rtm[] rtmVarArr = new rtm[4];
                rtmVarArr[r4] = rtmVar6;
                z2 = true;
                rtmVarArr[1] = rtmVar7;
                rtmVarArr[2] = rtmVar8;
                rtmVarArr[3] = rtmVar9;
                List g = scc.g(rtmVarArr);
                if (!(g instanceof Collection) || !g.isEmpty()) {
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        qtm qtmVar3 = qtmVar;
                        if (!jl40.l((rtm) it.next(), qtmVar3)) {
                            z3 = true;
                            break;
                        }
                        qtmVar = qtmVar3;
                    }
                }
                z3 = r4;
                Q3 = Boolean.valueOf(z3);
                btsVar2.o0(Q3);
            } else {
                z2 = true;
            }
            boolean booleanValue = ((Boolean) Q3).booleanValue();
            btsVar2.t(r4);
            btsVar2.e0(-1837740573);
            if (booleanValue) {
                btsVar2.c0(-1837739653, btsVar2.H(btsVar2.H(btsVar2.H(rtmVar6, rtmVar7), rtmVar8), rtmVar9));
                int i5 = i3 >> 18;
                b(rtmVar6, rtmVar7, rtmVar8, rtmVar9, oz40Var2, btsVar2, (i5 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i5 & 112) | (i5 & 896) | (i5 & 7168));
                btsVar2.t(r4);
            }
            btsVar2.t(r4);
            btsVar2.t(z2);
            btsVar3 = btsVar2;
        }
        aii0 v = btsVar3.v();
        if (v != null) {
            v.d = new wls(kx91Var, z, f530Var, j, rtmVar, rtmVar2, rtmVar3, rtmVar4, rtmVar5, i) { // from class: stm
                public final /* synthetic */ rtm A;
                public final /* synthetic */ int B;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ rtm w;
                public final /* synthetic */ rtm x;
                public final /* synthetic */ rtm y;
                public final /* synthetic */ rtm z;

                {
                    this.a = z;
                    this.b = f530Var;
                    this.c = j;
                    this.w = rtmVar;
                    this.x = rtmVar2;
                    this.y = rtmVar3;
                    this.z = rtmVar4;
                    this.A = rtmVar5;
                    this.B = i;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rx91.a(null, this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, vng.O(this.B | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(rtm rtmVar, rtm rtmVar2, rtm rtmVar3, rtm rtmVar4, oz40 oz40Var, fid fidVar, int i) {
        rtm rtmVar5;
        int i2;
        rtm rtmVar6;
        rtm rtmVar7;
        rtm rtmVar8;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1183090536);
        if ((i & 6) == 0) {
            rtmVar5 = rtmVar;
            i2 = (btsVar.k(rtmVar5) ? 4 : 2) | i;
        } else {
            rtmVar5 = rtmVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            rtmVar6 = rtmVar2;
            i2 |= btsVar.k(rtmVar6) ? 32 : 16;
        } else {
            rtmVar6 = rtmVar2;
        }
        if ((i & 384) == 0) {
            rtmVar7 = rtmVar3;
            i2 |= btsVar.k(rtmVar7) ? 256 : 128;
        } else {
            rtmVar7 = rtmVar3;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            rtmVar8 = rtmVar4;
            i2 |= btsVar.k(rtmVar8) ? 2048 : 1024;
        } else {
            rtmVar8 = rtmVar4;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(oz40Var) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(5004770);
            int i3 = 1;
            boolean z = (57344 & i2) == 16384;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ttm(i3, oz40Var);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 y = eja1.y(c530.a, (tls) Q);
            qnm.d.getClass();
            f530 m = an91.m(y, 8.0f, 0.0f, 2);
            lhl0 a2 = khl0.a(new i43(16.0f, true, new quz(11)), x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            qnm.c.getClass();
            c(rtmVar8, 24.0f, null, null, null, btsVar, (i2 >> 9) & 14, 28);
            c(rtmVar7, 24.0f, null, null, null, btsVar, (i2 >> 6) & 14, 28);
            c(rtmVar6, 24.0f, null, null, null, btsVar, (i2 >> 3) & 14, 28);
            c(rtmVar5, 24.0f, null, null, null, btsVar, i2 & 14, 28);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(rtmVar, rtmVar2, rtmVar3, rtmVar4, oz40Var, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(rtm rtmVar, float f, f530 f530Var, j690 j690Var, oz40 oz40Var, fid fidVar, int i, int i2) {
        int i3;
        j690 j690Var2;
        int i4;
        oz40 oz40Var2;
        oz40 oz40Var3;
        boolean z;
        f530 f530Var2;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(89892094);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(rtmVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.b(f) ? 32 : 16;
        }
        int i5 = i3 | 384;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 = i3 | 3456;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            j690Var2 = j690Var;
            i5 |= btsVar.k(j690Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i5 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                oz40Var2 = oz40Var;
                i5 |= btsVar.k(oz40Var2) ? 16384 : 8192;
                if ((i5 & 9363) == 9362 || !btsVar.E()) {
                    if (i6 != 0) {
                        j690Var2 = an91.b(0.0f, 0.0f, 3);
                    }
                    oz40Var3 = i4 != 0 ? null : oz40Var2;
                    z = rtmVar instanceof otm;
                    o430 o430Var = did.a;
                    int i7 = 0;
                    c530 c530Var = c530.a;
                    if (z) {
                        btsVar.e0(486966487);
                        btsVar.e0(-2083907031);
                        btsVar.e0(5004770);
                        boolean z2 = (i5 & HProv.ALG_CLASS_ALL) == 16384;
                        Object Q = btsVar.Q();
                        if (z2 || Q == o430Var) {
                            Q = new w5(29, oz40Var3);
                            btsVar.o0(Q);
                        }
                        btsVar.t(false);
                        po91.c(null, null, null, an91.j(eja1.y(c530Var, (tls) Q), j690Var2), false, DsButton$Size.Md, false, btsVar, ImageMetadata.EDGE_MODE, 0, 16);
                        btsVar = btsVar;
                        btsVar.t(false);
                        btsVar.t(false);
                        c530Var = c530Var;
                    } else if (rtmVar instanceof ptm) {
                        btsVar.e0(-2081060921);
                        ptm ptmVar = (ptm) rtmVar;
                        pa90 pa90Var = ptmVar.a;
                        String str = ptmVar.b;
                        btsVar.e0(487061247);
                        qnm qnmVar = qnm.a;
                        long g0 = qnm.c(btsVar).g0();
                        btsVar.t(false);
                        btsVar.e0(5004770);
                        boolean z3 = (i5 & HProv.ALG_CLASS_ALL) == 16384;
                        Object Q2 = btsVar.Q();
                        if (z3 || Q2 == o430Var) {
                            Q2 = new ttm(i7, oz40Var3);
                            btsVar.o0(Q2);
                        }
                        btsVar.t(false);
                        f530 d = u3a1.d(an91.j(eja1.y(c530Var, (tls) Q2), j690Var2), "TOP_BAR_SLOT_ICON");
                        btsVar.e0(487072565);
                        sls slsVar = ptmVar.c;
                        if (slsVar != null) {
                            btsVar.e0(1849434622);
                            Object Q3 = btsVar.Q();
                            if (Q3 == o430Var) {
                                Q3 = ly3.i(btsVar);
                            }
                            btsVar.t(false);
                            f530Var2 = q791.b(c530Var, (zx40) Q3, esk0.a(4, f / 2.0f, false), false, null, null, slsVar, 28);
                        } else {
                            f530Var2 = c530Var;
                        }
                        btsVar.t(false);
                        p4v.b(pa90Var, str, ljs0.m(d.k(f530Var2), f), g0, btsVar, 0, 0);
                        btsVar.t(false);
                    } else {
                        if (!jl40.l(rtmVar, qtm.a)) {
                            throw unr0.y(486968376, btsVar, false);
                        }
                        btsVar.e0(487121634);
                        btsVar.t(false);
                    }
                    f530Var3 = c530Var;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var;
                    oz40Var3 = oz40Var2;
                }
                j690 j690Var3 = j690Var2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new utm(rtmVar, f, f530Var3, j690Var3, oz40Var3, i, i2);
                    return;
                }
                return;
            }
            oz40Var2 = oz40Var;
            if ((i5 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            z = rtmVar instanceof otm;
            o430 o430Var2 = did.a;
            int i72 = 0;
            c530 c530Var2 = c530.a;
            if (z) {
            }
            f530Var3 = c530Var2;
            j690 j690Var32 = j690Var2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        j690Var2 = j690Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        oz40Var2 = oz40Var;
        if ((i5 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        z = rtmVar instanceof otm;
        o430 o430Var22 = did.a;
        int i722 = 0;
        c530 c530Var22 = c530.a;
        if (z) {
        }
        f530Var3 = c530Var22;
        j690 j690Var322 = j690Var2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final boolean d(zii0 zii0Var, long j) {
        float f = zii0Var.a;
        float f2 = zii0Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = zii0Var.b;
        float f4 = zii0Var.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static final long f(i iVar, long j, bkq0 bkq0Var) {
        rzx c;
        long c2;
        long j2;
        hm40 hm40Var;
        int d;
        float c3;
        hm40 hm40Var2;
        int d2;
        hm40 hm40Var3;
        int d3;
        float b;
        hm40 hm40Var4;
        int d4;
        ho40 c4 = iVar.c(bkq0Var);
        if (c4 == null) {
            return 9205357640488583168L;
        }
        kkq0 kkq0Var = c4.c;
        rzx rzxVar = iVar.l;
        if (rzxVar == null || (c = c4.c()) == null) {
            return 9205357640488583168L;
        }
        int i = bkq0Var.b;
        dry0 dry0Var = (dry0) kkq0Var.invoke();
        if (i > (dry0Var == null ? 0 : c4.b(dry0Var))) {
            return 9205357640488583168L;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (c.T(rzxVar, ((wu60) iVar.s.getValue()).a) >> 32));
        dry0 dry0Var2 = (dry0) kkq0Var.invoke();
        if (dry0Var2 == null) {
            c2 = asy0.b;
        } else {
            hm40 hm40Var5 = dry0Var2.b;
            int b2 = c4.b(dry0Var2);
            if (b2 < 1) {
                c2 = asy0.b;
            } else {
                int d5 = hm40Var5.d(y6i0.d(i, 0, b2 - 1));
                c2 = eja1.c(dry0Var2.k(d5), hm40Var5.c(d5, true));
            }
        }
        if (asy0.c(c2)) {
            dry0 dry0Var3 = (dry0) kkq0Var.invoke();
            c3 = (dry0Var3 != null && (d4 = (hm40Var4 = dry0Var3.b).d(i)) < hm40Var4.f) ? dry0Var3.i(d4) : -1.0f;
            j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        } else {
            j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            int i2 = (int) (c2 >> 32);
            dry0 dry0Var4 = (dry0) kkq0Var.invoke();
            float i3 = (dry0Var4 != null && (d2 = (hm40Var2 = dry0Var4.b).d(i2)) < hm40Var2.f) ? dry0Var4.i(d2) : -1.0f;
            int i4 = ((int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - 1;
            dry0 dry0Var5 = (dry0) kkq0Var.invoke();
            float j3 = (dry0Var5 != null && (d = (hm40Var = dry0Var5.b).d(i4)) < hm40Var.f) ? dry0Var5.j(d) : -1.0f;
            c3 = y6i0.c(intBitsToFloat, Math.min(i3, j3), Math.max(i3, j3));
        }
        if (c3 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!k6w.a(j, 0L) && Math.abs(intBitsToFloat - c3) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        dry0 dry0Var6 = (dry0) kkq0Var.invoke();
        if (dry0Var6 != null && (d3 = (hm40Var3 = dry0Var6.b).d(i)) < hm40Var3.f) {
            float f = hm40Var3.f(d3);
            b = ((hm40Var3.b(d3) - f) / 2.0f) + f;
        } else {
            b = -1.0f;
        }
        if (b == -1.0f) {
            return 9205357640488583168L;
        }
        return rzxVar.T(c, (Float.floatToRawIntBits(c3) << 32) | (Float.floatToRawIntBits(b) & j2));
    }

    public static final zii0 g(rzx rzxVar) {
        zii0 j = gwk0.j(rzxVar, true);
        long G = rzxVar.G(j.e());
        float f = j.c;
        float f2 = j.d;
        return wwg.a(G, rzxVar.G((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }
}
