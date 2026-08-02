package defpackage;

import androidx.compose.foundation.interaction.a;
import androidx.compose.material3.h;
import androidx.compose.material3.t;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class rlb1 {
    public static au2 a;

    public static final void a(String str, tls tlsVar, boolean z, ety0 ety0Var, gy31 gy31Var, lkx lkxVar, xjx xjxVar, int i, int i2, ehr0 ehr0Var, imy0 imy0Var, fid fidVar, int i3) {
        int i4;
        tls tlsVar2;
        boolean z2;
        ety0 ety0Var2;
        gy31 gy31Var2;
        lkx lkxVar2;
        xjx xjxVar2;
        int i5;
        int i6;
        ehr0 ehr0Var2;
        imy0 imy0Var2;
        ety0 ety0Var3;
        gy31 gy31Var3;
        lkx lkxVar3;
        boolean z3;
        int i7;
        xjx xjxVar3;
        ehr0 b;
        imy0 e;
        int i8;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-154966360);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.k(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            tlsVar2 = tlsVar;
            i4 |= btsVar.e(tlsVar2) ? 32 : 16;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar.k(c530.a) ? 256 : 128;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        int i10 = 920125440 | i9;
        if (btsVar.V(i10 & 1, (306783379 & i10) != 306783378)) {
            btsVar.a0();
            if ((i3 & 1) == 0 || btsVar.C()) {
                ety0Var3 = (ety0) btsVar.m(vqy0.a);
                gy31Var3 = zoy0.w;
                lkxVar3 = lkx.f;
                z3 = true;
                i7 = 1;
                xjxVar3 = xjx.g;
                b = zir0.b(z3r.d, btsVar);
                e = t.e(btsVar);
                i8 = Integer.MAX_VALUE;
            } else {
                btsVar.Y();
                z3 = z;
                ety0Var3 = ety0Var;
                gy31Var3 = gy31Var;
                lkxVar3 = lkxVar;
                xjxVar3 = xjxVar;
                i8 = i;
                i7 = i2;
                b = ehr0Var;
                e = imy0Var;
            }
            btsVar.u();
            btsVar.e0(488158419);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar.t(false);
            btsVar.e0(1401225826);
            long b2 = ety0Var3.b();
            if (b2 == 16) {
                b2 = !z3 ? e.c : ((Boolean) a.b(zx40Var, btsVar, 0).getValue()).booleanValue() ? e.a : e.b;
            }
            long j = b2;
            btsVar.t(false);
            sb2.b(psy0.a.a(e.k), wwg.S(1459735400, true, new d4y(e, str, tlsVar2, z3, ety0Var3.d(new ety0(j, 0L, null, null, null, null, 0L, 0, 0L, null, null, 16777214)), lkxVar3, xjxVar3, i8, i7, gy31Var3, zx40Var, b), btsVar), btsVar, 56);
            ety0Var2 = ety0Var3;
            imy0Var2 = e;
            z2 = z3;
            lkxVar2 = lkxVar3;
            xjxVar2 = xjxVar3;
            i5 = i8;
            i6 = i7;
            gy31Var2 = gy31Var3;
            ehr0Var2 = b;
        } else {
            btsVar.Y();
            z2 = z;
            ety0Var2 = ety0Var;
            gy31Var2 = gy31Var;
            lkxVar2 = lkxVar;
            xjxVar2 = xjxVar;
            i5 = i;
            i6 = i2;
            ehr0Var2 = ehr0Var;
            imy0Var2 = imy0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hj9(str, tlsVar, z2, ety0Var2, gy31Var2, lkxVar2, xjxVar2, i5, i6, ehr0Var2, imy0Var2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0259, code lost:
    
        if (defpackage.jl40.l(r3.Q(), java.lang.Integer.valueOf(r9)) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04a3, code lost:
    
        if (r3.e(r2) != false) goto L237;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0527  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(wls wlsVar, final wls wlsVar2, zls zlsVar, final wls wlsVar3, final wls wlsVar4, wls wlsVar5, final wls wlsVar6, final boolean z, final nny0 nny0Var, final bny0 bny0Var, final androidx.compose.runtime.internal.a aVar, wls wlsVar7, j690 j690Var, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        wls wlsVar8;
        zls zlsVar2;
        bts btsVar;
        int i5;
        uo5 uo5Var;
        dmw0 dmw0Var;
        uo5 uo5Var2;
        int i6;
        c530 c530Var;
        o430 o430Var;
        uo5 uo5Var3;
        LayoutDirection layoutDirection;
        boolean z2;
        uo5 uo5Var4;
        to5 to5Var;
        c530 c530Var2;
        float f;
        to5 to5Var2;
        boolean z3;
        boolean z4;
        bny0 bny0Var2;
        boolean z5;
        Object Q;
        final wls wlsVar9 = wlsVar5;
        wls wlsVar10 = wlsVar7;
        j690 j690Var2 = j690Var;
        uo5 uo5Var5 = x4c.y;
        uo5 uo5Var6 = x4c.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1086465551);
        dmw0 dmw0Var2 = btsVar2.a;
        int i7 = i & 6;
        c530 c530Var3 = c530.a;
        if (i7 == 0) {
            i3 = i | (btsVar2.k(c530Var3) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(wlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(zlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(wlsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.e(wlsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.e(wlsVar9) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.e(wlsVar6) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.k(nny0Var) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? btsVar2.k(bny0Var) : btsVar2.e(bny0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.e(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= btsVar2.e(wlsVar10) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.k(j690Var2) ? 2048 : 1024;
        }
        int i8 = i4;
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            long j = ((bq11) btsVar2.m(eq11.a)).l.b.c;
            long j2 = bn11.l;
            if ((j & 1095216660480L) != 4294967296L) {
                j = j2;
            }
            float i9 = ((fwi) btsVar2.m(j.h)).i(j) / 2.0f;
            int i10 = i8 & 14;
            boolean b = ((i8 & 7168) == 2048) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i10 == 4 || ((i8 & 8) != 0 && btsVar2.k(bny0Var))) | btsVar2.b(i9);
            Object Q2 = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (b || Q2 == o430Var2) {
                btsVar = btsVar2;
                i5 = i10;
                uo5Var = uo5Var5;
                dmw0Var = dmw0Var2;
                uo5Var2 = uo5Var6;
                i6 = i8;
                c530Var = c530Var3;
                o430Var = o430Var2;
                j690Var2 = j690Var;
                qny0 qny0Var = new qny0(z, nny0Var, bny0Var, j690Var2, i9);
                btsVar.o0(qny0Var);
                Q2 = qny0Var;
            } else {
                btsVar = btsVar2;
                i5 = i10;
                uo5Var = uo5Var5;
                dmw0Var = dmw0Var2;
                uo5Var2 = uo5Var6;
                i6 = i8;
                c530Var = c530Var3;
                o430Var = o430Var2;
                j690Var2 = j690Var;
            }
            qny0 qny0Var2 = (qny0) Q2;
            LayoutDirection layoutDirection2 = (LayoutDirection) btsVar.m(j.n);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530Var);
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
            wls wlsVar11 = d.f;
            qje.W(btsVar, wlsVar11, qny0Var2);
            wls wlsVar12 = d.e;
            qje.W(btsVar, wlsVar12, o);
            wls wlsVar13 = d.g;
            if (btsVar.S) {
                uo5Var3 = uo5Var2;
            } else {
                uo5Var3 = uo5Var2;
            }
            b64.z(S, btsVar, S, wlsVar13);
            wls wlsVar14 = d.d;
            qje.W(btsVar, wlsVar14, d);
            aVar.invoke(btsVar, Integer.valueOf((i6 >> 3) & 14));
            if (wlsVar3 != null) {
                btsVar.e0(-1445181094);
                f530 h = pj91.h(c530Var, "Leading");
                bqu bquVar = h.a;
                f530 k = h.k(mi20.a);
                z910 d2 = pi6.d(uo5Var, false);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, k);
                btsVar.i0();
                layoutDirection = layoutDirection2;
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar11, d2);
                qje.W(btsVar, wlsVar12, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar, S2, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d3);
                z2 = false;
                qv10.A((i3 >> 12) & 14, wlsVar3, btsVar, true, false);
            } else {
                layoutDirection = layoutDirection2;
                z2 = false;
                btsVar.e0(-1481782918);
                btsVar.t(false);
            }
            if (wlsVar4 != null) {
                btsVar.e0(-1444892360);
                f530 h2 = pj91.h(c530Var, "Trailing");
                bqu bquVar2 = h.a;
                f530 k2 = h2.k(mi20.a);
                z910 d4 = pi6.d(uo5Var, z2);
                int S3 = cma1.S(btsVar);
                r1b0 o3 = btsVar.o();
                f530 d5 = b.d(btsVar, k2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar11, d4);
                qje.W(btsVar, wlsVar12, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d5);
                qv10.A((i3 >> 15) & 14, wlsVar4, btsVar, true, false);
            } else {
                btsVar.e0(-1481782918);
                btsVar.t(z2);
            }
            LayoutDirection layoutDirection3 = layoutDirection;
            float f2 = an91.f(j690Var2, layoutDirection3);
            float e = an91.e(j690Var2, layoutDirection3);
            float f3 = androidx.compose.material3.internal.h.f(btsVar);
            if (wlsVar3 != null) {
                f2 -= f3;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
            }
            float f4 = f2;
            if (wlsVar4 != null) {
                e -= f3;
                if (e < 0.0f) {
                    e = 0.0f;
                }
            }
            float f5 = e;
            if (wlsVar5 != null) {
                btsVar.e0(-1443868027);
                f530 o4 = an91.o(ljs0.u(ljs0.g(pj91.h(c530Var, "Prefix"), 24.0f, 0.0f, 2), null, 3), f4, 0.0f, 2.0f, 0.0f, 10);
                uo5Var4 = uo5Var3;
                z910 d6 = pi6.d(uo5Var4, false);
                int S4 = cma1.S(btsVar);
                r1b0 o5 = btsVar.o();
                f530 d7 = b.d(btsVar, o4);
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
                qje.W(btsVar, wlsVar11, d6);
                qje.W(btsVar, wlsVar12, o5);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S4))) {
                    b64.z(S4, btsVar, S4, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d7);
                wlsVar9 = wlsVar5;
                qv10.A((i3 >> 18) & 14, wlsVar9, btsVar, true, false);
                to5Var = null;
            } else {
                wlsVar9 = wlsVar5;
                uo5Var4 = uo5Var3;
                to5Var = null;
                btsVar.e0(-1481782918);
                btsVar.t(false);
            }
            if (wlsVar6 != null) {
                btsVar.e0(-1443497081);
                c530Var2 = c530Var;
                f530 o6 = an91.o(ljs0.u(ljs0.g(pj91.h(c530Var, "Suffix"), 24.0f, 0.0f, 2), to5Var, 3), 2.0f, 0.0f, f5, 0.0f, 10);
                f = f5;
                z910 d8 = pi6.d(uo5Var4, false);
                int S5 = cma1.S(btsVar);
                r1b0 o7 = btsVar.o();
                f530 d9 = b.d(btsVar, o6);
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
                qje.W(btsVar, wlsVar11, d8);
                qje.W(btsVar, wlsVar12, o7);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S5))) {
                    b64.z(S5, btsVar, S5, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d9);
                qv10.A((i3 >> 21) & 14, wlsVar6, btsVar, true, false);
            } else {
                c530Var2 = c530Var;
                f = f5;
                btsVar.e0(-1481782918);
                btsVar.t(false);
            }
            f530 o8 = an91.o(c530Var2, f4, 0.0f, f, 0.0f, 10);
            c530 c530Var4 = c530Var2;
            if (wlsVar2 != null) {
                btsVar.e0(-1442671489);
                f530 h3 = pj91.h(c530Var4, "Label");
                if (i5 != 4) {
                    if ((i6 & 8) != 0) {
                        bny0Var2 = bny0Var;
                    } else {
                        bny0Var2 = bny0Var;
                    }
                    z5 = false;
                    Q = btsVar.Q();
                    if (!z5 || Q == o430Var) {
                        Q = new vx80(bny0Var2, 1);
                        btsVar.o0(Q);
                    }
                    f530 k3 = ljs0.u(kp50.F(h3, new wu40(10, (sls) Q)), null, 3).k(o8);
                    z910 d10 = pi6.d(uo5Var4, false);
                    int S6 = cma1.S(btsVar);
                    r1b0 o9 = btsVar.o();
                    f530 d11 = b.d(btsVar, k3);
                    if (dmw0Var != null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar11, d10);
                    qje.W(btsVar, wlsVar12, o9);
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S6))) {
                        b64.z(S6, btsVar, S6, wlsVar13);
                    }
                    qje.W(btsVar, wlsVar14, d11);
                    qv10.A((i3 >> 6) & 14, wlsVar2, btsVar, true, false);
                    to5Var2 = null;
                } else {
                    bny0Var2 = bny0Var;
                }
                z5 = true;
                Q = btsVar.Q();
                if (!z5) {
                }
                Q = new vx80(bny0Var2, 1);
                btsVar.o0(Q);
                f530 k32 = ljs0.u(kp50.F(h3, new wu40(10, (sls) Q)), null, 3).k(o8);
                z910 d102 = pi6.d(uo5Var4, false);
                int S62 = cma1.S(btsVar);
                r1b0 o92 = btsVar.o();
                f530 d112 = b.d(btsVar, k32);
                if (dmw0Var != null) {
                }
            } else {
                to5Var2 = null;
                btsVar.e0(-1481782918);
                btsVar.t(false);
            }
            f530 o10 = an91.o(ljs0.u(ljs0.g(c530Var4, 24.0f, 0.0f, 2), to5Var2, 3), wlsVar9 == null ? f4 : 0.0f, 0.0f, wlsVar6 == null ? f : 0.0f, 0.0f, 10);
            if (zlsVar != null) {
                btsVar.e0(-1441906533);
                zlsVar2 = zlsVar;
                zlsVar2.invoke(pj91.h(c530Var4, "Hint").k(o10), btsVar, Integer.valueOf((i3 >> 6) & 112));
                z3 = false;
            } else {
                zlsVar2 = zlsVar;
                z3 = false;
                btsVar.e0(-1481782918);
            }
            btsVar.t(z3);
            f530 k4 = pj91.h(c530Var4, "TextField").k(o10);
            z910 d12 = pi6.d(uo5Var4, true);
            int S7 = cma1.S(btsVar);
            r1b0 o11 = btsVar.o();
            f530 d13 = b.d(btsVar, k4);
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
            qje.W(btsVar, wlsVar11, d12);
            qje.W(btsVar, wlsVar12, o11);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S7))) {
                b64.z(S7, btsVar, S7, wlsVar13);
            }
            qje.W(btsVar, wlsVar14, d13);
            wlsVar8 = wlsVar;
            xvz.u((i3 >> 3) & 14, wlsVar8, btsVar, true);
            if (wlsVar7 != null) {
                btsVar.e0(-1441566587);
                f530 j3 = an91.j(ljs0.u(ljs0.g(pj91.h(c530Var4, "Supporting"), 16.0f, 0.0f, 2), null, 3), new l690(16.0f, 4.0f, 16.0f, 0.0f));
                z910 d14 = pi6.d(uo5Var4, false);
                int S8 = cma1.S(btsVar);
                r1b0 o12 = btsVar.o();
                f530 d15 = b.d(btsVar, j3);
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
                qje.W(btsVar, wlsVar11, d14);
                qje.W(btsVar, wlsVar12, o12);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S8))) {
                    b64.z(S8, btsVar, S8, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d15);
                wlsVar10 = wlsVar7;
                z4 = true;
                qv10.A((i6 >> 6) & 14, wlsVar10, btsVar, true, false);
            } else {
                wlsVar10 = wlsVar7;
                z4 = true;
                btsVar.e0(-1481782918);
                btsVar.t(false);
            }
            btsVar.t(z4);
        } else {
            wlsVar8 = wlsVar;
            zlsVar2 = zlsVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final wls wlsVar15 = wlsVar8;
            final j690 j690Var3 = j690Var2;
            final wls wlsVar16 = wlsVar10;
            final zls zlsVar3 = zlsVar2;
            v.d = new wls() { // from class: iny0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    rlb1.b(wls.this, wlsVar2, zlsVar3, wlsVar3, wlsVar4, wlsVar9, wlsVar6, z, nny0Var, bny0Var, aVar, wlsVar16, j690Var3, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronRightS", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
        int i = c531.a;
        lgvVar.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, EmptyList.a);
        a6t0 a6t0Var = new a6t0(zp2.d);
        a6t0 a6t0Var2 = new a6t0(iq2.g);
        uq90 g = tse0.g(6.33f, 4.25f, 10.08f, 8.0f);
        g.i(-3.75f, 3.75f);
        lgvVar.b(1.0f, 1.0f, 1.75f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 2, 0, a6t0Var, a6t0Var2, "", g.a);
        lgvVar.e();
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static String d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((k001) it.next()).a.g.n;
            if (eh20.p(str2)) {
                return "video/mp4";
            }
            if (eh20.l(str2)) {
                z = true;
            } else if (eh20.n(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
