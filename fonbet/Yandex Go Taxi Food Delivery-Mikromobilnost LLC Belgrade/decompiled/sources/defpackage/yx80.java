package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class yx80 {
    public static final /* synthetic */ int a = 0;

    static {
        uh6.E(8);
    }

    public static final void a(final f530 f530Var, wls wlsVar, zls zlsVar, wls wlsVar2, final wls wlsVar3, final wls wlsVar4, final boolean z, final float f, final tls tlsVar, final a aVar, j690 j690Var, fid fidVar, final int i) {
        int i2;
        wls wlsVar5;
        zls zlsVar2;
        boolean z2;
        boolean z3;
        final wls wlsVar6 = wlsVar2;
        final j690 j690Var2 = j690Var;
        uo5 uo5Var = x4c.y;
        bts btsVar = (bts) fidVar;
        btsVar.g0(36320288);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(zlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(wlsVar6) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(wlsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(wlsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.a(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i2 |= btsVar.e(tlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i2 |= btsVar.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        char c = btsVar.k(j690Var2) ? (char) 4 : (char) 2;
        int i3 = i2;
        if (btsVar.V(i3 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z4 = ((i3 & 234881024) == 67108864) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((c & 14) == 4);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new cy80(tlsVar, z, f, j690Var2);
                btsVar.o0(Q);
            }
            cy80 cy80Var = (cy80) Q;
            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            wls wlsVar7 = d.f;
            qje.W(btsVar, wlsVar7, cy80Var);
            wls wlsVar8 = d.e;
            qje.W(btsVar, wlsVar8, o);
            wls wlsVar9 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar9);
            }
            wls wlsVar10 = d.d;
            qje.W(btsVar, wlsVar10, d);
            aVar.invoke(btsVar, Integer.valueOf((i3 >> 27) & 14));
            c530 c530Var = c530.a;
            if (wlsVar3 != null) {
                btsVar.e0(1336978507);
                f530 h = pj91.h(c530Var, "Leading");
                a7u0 a7u0Var = j8w.a;
                f530 k = h.k(ni20.a);
                z910 d2 = pi6.d(uo5Var, false);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar7, d2);
                qje.W(btsVar, wlsVar8, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar, S2, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d3);
                z2 = false;
                qv10.A((i3 >> 12) & 14, wlsVar3, btsVar, true, false);
            } else {
                z2 = false;
                btsVar.e0(1337224523);
                btsVar.t(false);
            }
            if (wlsVar4 != null) {
                btsVar.e0(1337267241);
                f530 h2 = pj91.h(c530Var, "Trailing");
                a7u0 a7u0Var2 = j8w.a;
                f530 k2 = h2.k(ni20.a);
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
                qje.W(btsVar, wlsVar7, d4);
                qje.W(btsVar, wlsVar8, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d5);
                qv10.A((i3 >> 15) & 14, wlsVar4, btsVar, true, false);
            } else {
                btsVar.e0(1337515179);
                btsVar.t(z2);
            }
            j690Var2 = j690Var;
            float f2 = an91.f(j690Var2, layoutDirection);
            float e = an91.e(j690Var2, layoutDirection);
            if (wlsVar3 != null) {
                f2 -= 12.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
            }
            float f3 = f2;
            if (wlsVar4 != null) {
                e -= 12.0f;
                if (e < 0.0f) {
                    e = 0.0f;
                }
            }
            f530 o4 = an91.o(c530Var, f3, 0.0f, e, 0.0f, 10);
            if (zlsVar != null) {
                btsVar.e0(1338367152);
                zlsVar2 = zlsVar;
                zlsVar2.invoke(pj91.h(c530Var, "Hint").k(o4), btsVar, Integer.valueOf((i3 >> 3) & 112));
                btsVar.t(false);
            } else {
                zlsVar2 = zlsVar;
                btsVar.e0(1338454603);
                btsVar.t(false);
            }
            f530 k3 = pj91.h(c530Var, "TextField").k(o4);
            uo5 uo5Var2 = x4c.b;
            z910 d6 = pi6.d(uo5Var2, true);
            int S4 = cma1.S(btsVar);
            r1b0 o5 = btsVar.o();
            f530 d7 = b.d(btsVar, k3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar7, d6);
            qje.W(btsVar, wlsVar8, o5);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S4))) {
                b64.z(S4, btsVar, S4, wlsVar9);
            }
            qje.W(btsVar, wlsVar10, d7);
            wlsVar5 = wlsVar;
            xvz.u((i3 >> 3) & 14, wlsVar5, btsVar, true);
            if (wlsVar2 != null) {
                btsVar.e0(1338685429);
                f530 h3 = pj91.h(c530Var, "Label");
                z910 d8 = pi6.d(uo5Var2, false);
                int S5 = cma1.S(btsVar);
                r1b0 o6 = btsVar.o();
                f530 d9 = b.d(btsVar, h3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar7, d8);
                qje.W(btsVar, wlsVar8, o6);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S5))) {
                    b64.z(S5, btsVar, S5, wlsVar9);
                }
                qje.W(btsVar, wlsVar10, d9);
                wlsVar6 = wlsVar2;
                z3 = true;
                qv10.A((i3 >> 9) & 14, wlsVar6, btsVar, true, false);
            } else {
                wlsVar6 = wlsVar2;
                z3 = true;
                btsVar.e0(1338768075);
                btsVar.t(false);
            }
            btsVar.t(z3);
        } else {
            wlsVar5 = wlsVar;
            zlsVar2 = zlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final wls wlsVar11 = wlsVar5;
            final zls zlsVar3 = zlsVar2;
            v.d = new wls() { // from class: ux80
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yx80.a(f530.this, wlsVar11, zlsVar3, wlsVar6, wlsVar3, wlsVar4, z, f, tlsVar, aVar, j690Var2, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, j690 j690Var) {
        int max = Math.max(i3, Math.max(i5, cjb1.e(i4, 0, f)));
        float d = j690Var.d() * f2;
        return p8e.f(Math.max(i, Math.max(i2, m810.b(cjb1.d(d, Math.max(d, i4 / 2.0f), f) + max + (j690Var.a() * f2)))), j);
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, j690 j690Var) {
        int max = Math.max(i3, Math.max(cjb1.e(i4, 0, f), i5)) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return p8e.g(Math.max(max, m810.b((i4 + ((j690Var.c(layoutDirection) + j690Var.b(layoutDirection)) * f2)) * f)), j);
    }
}
