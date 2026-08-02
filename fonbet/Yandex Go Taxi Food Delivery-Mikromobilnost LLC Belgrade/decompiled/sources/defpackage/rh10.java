package defpackage;

import androidx.compose.foundation.interaction.a;
import androidx.compose.material3.internal.h;
import androidx.compose.material3.t;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.ybsdk.feature.dashboard.internal.data.dto.CardInfo;
import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class rh10 {
    public static final f43 a = new f43(1);
    public static final f43 b = new f43(0);
    public static final f43 c = new f43(2);
    public static final f43 d = new f43(3);
    public static final f43 e = new f43(4);

    public static final void a(final String str, final tls tlsVar, final f530 f530Var, boolean z, ety0 ety0Var, final wls wlsVar, final wls wlsVar2, gy31 gy31Var, lkx lkxVar, xjx xjxVar, final boolean z2, int i, int i2, final ehr0 ehr0Var, final imy0 imy0Var, fid fidVar, final int i3) {
        int i4;
        final tls tlsVar2;
        bts btsVar;
        final boolean z3;
        final ety0 ety0Var2;
        final gy31 gy31Var2;
        final lkx lkxVar2;
        final xjx xjxVar2;
        final int i5;
        final int i6;
        ety0 ety0Var3;
        final xjx xjxVar3;
        final lkx lkxVar3;
        final int i7;
        final int i8;
        gy31 gy31Var3;
        final boolean z4;
        zx40 zx40Var;
        long j;
        long j2;
        boolean z5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1901501544);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            tlsVar2 = tlsVar;
            i4 |= btsVar2.e(tlsVar2) ? 32 : 16;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        int i10 = 1572864 | i9;
        if ((12582912 & i3) == 0) {
            i10 |= btsVar2.e(wlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i11 = i10 | 100663296;
        if ((805306368 & i3) == 0) {
            i11 |= btsVar2.e(wlsVar2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i11 & 1, ((306783379 & i11) == 306783378 && ((((btsVar2.k(ehr0Var) ? ' ' : (char) 16) | 6) | (btsVar2.k(imy0Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                ety0Var3 = (ety0) btsVar2.m(vqy0.a);
                dy31 dy31Var = zoy0.w;
                lkx lkxVar4 = lkx.f;
                xjxVar3 = xjx.g;
                lkxVar3 = lkxVar4;
                i7 = 1;
                i8 = z2 ? 1 : Integer.MAX_VALUE;
                gy31Var3 = dy31Var;
                z4 = true;
            } else {
                btsVar2.Y();
                z4 = z;
                ety0Var3 = ety0Var;
                gy31Var3 = gy31Var;
                lkxVar3 = lkxVar;
                xjxVar3 = xjxVar;
                i8 = i;
                i7 = i2;
            }
            btsVar2.u();
            btsVar2.e0(1310000147);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var2 = (zx40) Q;
            btsVar2.t(false);
            btsVar2.e0(1981926178);
            long b2 = ety0Var3.b();
            if (b2 != 16) {
                z5 = false;
                zx40Var = zx40Var2;
                j2 = b2;
            } else {
                boolean booleanValue = ((Boolean) a.b(zx40Var2, btsVar2, 0).getValue()).booleanValue();
                if (z4) {
                    zx40Var = zx40Var2;
                    j = booleanValue ? imy0Var.a : imy0Var.b;
                } else {
                    zx40Var = zx40Var2;
                    j = imy0Var.c;
                }
                j2 = j;
                z5 = false;
            }
            btsVar2.t(z5);
            final ety0 d2 = ety0Var3.d(new ety0(j2, 0L, null, null, null, null, 0L, 0, 0L, null, null, 16777214));
            final zx40 zx40Var3 = zx40Var;
            ety0 ety0Var4 = ety0Var3;
            final gy31 gy31Var4 = gy31Var3;
            btsVar = btsVar2;
            sb2.b(psy0.a.a(imy0Var.k), wwg.S(1874034984, true, new wls() { // from class: rx80
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                        btsVar3.e0(-903106918);
                        btsVar3.t(false);
                        f530 k = f530.this.k(c530.a);
                        vhb1.b(btsVar3, hzh0.default_error_message);
                        f530 a2 = ljs0.a(k, 280.0f, 56.0f);
                        final imy0 imy0Var2 = imy0Var;
                        a6t0 a6t0Var = new a6t0(imy0Var2.i);
                        final String str2 = str;
                        final boolean z6 = z4;
                        final boolean z7 = z2;
                        final gy31 gy31Var5 = gy31Var4;
                        final zx40 zx40Var4 = zx40Var3;
                        final wls wlsVar3 = wlsVar;
                        final wls wlsVar4 = wlsVar2;
                        final ehr0 ehr0Var2 = ehr0Var;
                        ne5.b(str2, tlsVar2, a2, z6, false, d2, lkxVar3, xjxVar3, z7, i8, i7, gy31Var5, null, zx40Var4, a6t0Var, wwg.S(-1189274459, true, new zls() { // from class: tx80
                            @Override // defpackage.zls
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                wls wlsVar5 = (wls) obj3;
                                fid fidVar3 = (fid) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= fidVar3.e(wlsVar5) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    t tVar = t.a;
                                    boolean z8 = z6;
                                    zx40 zx40Var5 = zx40Var4;
                                    imy0 imy0Var3 = imy0Var2;
                                    tVar.c(str2, wlsVar5, z8, z7, gy31Var5, zx40Var5, wlsVar3, wlsVar4, imy0Var3, null, wwg.S(-656940872, true, new r2z0(z8, zx40Var5, imy0Var3, ehr0Var2), btsVar4), btsVar4, (intValue2 << 3) & 112);
                                } else {
                                    btsVar4.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar3), btsVar3, 0, ImageMetadata.EDGE_MODE, 4096);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 56);
            int i12 = i8;
            xjxVar2 = xjxVar3;
            gy31Var2 = gy31Var4;
            i5 = i12;
            z3 = z4;
            lkxVar2 = lkxVar3;
            i6 = i7;
            ety0Var2 = ety0Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            z3 = z;
            ety0Var2 = ety0Var;
            gy31Var2 = gy31Var;
            lkxVar2 = lkxVar;
            xjxVar2 = xjxVar;
            i5 = i;
            i6 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: sx80
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i3 | 1);
                    rh10.a(str, tlsVar, f530Var, z3, ety0Var2, wlsVar, wlsVar2, gy31Var2, lkxVar2, xjxVar2, z2, i5, i6, ehr0Var, imy0Var, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0251, code lost:
    
        if (defpackage.jl40.l(r1.Q(), java.lang.Integer.valueOf(r9)) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0530, code lost:
    
        if (r1.e(r0) != false) goto L275;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final wls wlsVar, zls zlsVar, wls wlsVar2, final wls wlsVar3, final wls wlsVar4, final wls wlsVar5, wls wlsVar6, final boolean z, final nny0 nny0Var, final bny0 bny0Var, final tls tlsVar, final androidx.compose.runtime.internal.a aVar, wls wlsVar7, final j690 j690Var, fid fidVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        wls wlsVar8;
        zls zlsVar2;
        bts btsVar;
        dmw0 dmw0Var;
        o430 o430Var;
        uo5 uo5Var;
        int i5;
        uo5 uo5Var2;
        c530 c530Var;
        float f;
        uo5 uo5Var3;
        LayoutDirection layoutDirection;
        boolean z3;
        to5 to5Var;
        uo5 uo5Var4;
        boolean z4;
        to5 to5Var2;
        boolean z5;
        bny0 bny0Var2;
        boolean z6;
        Object Q;
        final wls wlsVar9 = wlsVar2;
        final wls wlsVar10 = wlsVar6;
        uo5 uo5Var5 = x4c.y;
        uo5 uo5Var6 = x4c.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(753699262);
        dmw0 dmw0Var2 = btsVar2.a;
        int i6 = i & 6;
        c530 c530Var2 = c530.a;
        if (i6 == 0) {
            i3 = i | (btsVar2.k(c530Var2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(zlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(wlsVar9) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(wlsVar3) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.e(wlsVar4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.e(wlsVar5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.e(wlsVar10) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            z2 = z;
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
            i4 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= btsVar2.e(aVar) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.e(wlsVar7) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.k(j690Var) ? 16384 : 8192;
        }
        int i7 = i4;
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            float f2 = h.f(btsVar2);
            int i8 = i7 & 14;
            boolean b2 = ((i3 & 234881024) == 67108864) | ((i7 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && btsVar2.k(bny0Var))) | ((i7 & HProv.ALG_CLASS_ALL) == 16384) | btsVar2.b(f2);
            Object Q2 = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (b2 || Q2 == o430Var2) {
                dmw0Var = dmw0Var2;
                o430Var = o430Var2;
                uo5Var = uo5Var5;
                i5 = i8;
                uo5Var2 = uo5Var6;
                btsVar = btsVar2;
                c530Var = c530Var2;
                f = f2;
                by80 by80Var = new by80(tlsVar, z2, nny0Var, bny0Var, j690Var, f);
                btsVar.o0(by80Var);
                Q2 = by80Var;
            } else {
                dmw0Var = dmw0Var2;
                o430Var = o430Var2;
                uo5Var = uo5Var5;
                i5 = i8;
                uo5Var2 = uo5Var6;
                btsVar = btsVar2;
                c530Var = c530Var2;
                f = f2;
            }
            by80 by80Var2 = (by80) Q2;
            LayoutDirection layoutDirection2 = (LayoutDirection) btsVar.m(j.n);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            float f3 = f;
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
            qje.W(btsVar, wlsVar11, by80Var2);
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
            qje.W(btsVar, wlsVar14, d2);
            aVar.invoke(btsVar, Integer.valueOf((i7 >> 6) & 14));
            if (wlsVar3 != null) {
                btsVar.e0(2145628269);
                f530 k = pj91.h(c530Var, "Leading").k(mi20.a);
                z910 d3 = pi6.d(uo5Var, false);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                f530 d4 = b.d(btsVar, k);
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                layoutDirection = layoutDirection2;
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar11, d3);
                qje.W(btsVar, wlsVar12, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar, S2, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d4);
                z3 = false;
                qv10.A((i3 >> 12) & 14, wlsVar3, btsVar, true, false);
            } else {
                layoutDirection = layoutDirection2;
                z3 = false;
                btsVar.e0(2109008589);
                btsVar.t(false);
            }
            if (wlsVar4 != null) {
                btsVar.e0(2145917003);
                f530 k2 = pj91.h(c530Var, "Trailing").k(mi20.a);
                z910 d5 = pi6.d(uo5Var, z3);
                int S3 = cma1.S(btsVar);
                r1b0 o3 = btsVar.o();
                f530 d6 = b.d(btsVar, k2);
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
                qje.W(btsVar, wlsVar11, d5);
                qje.W(btsVar, wlsVar12, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d6);
                qv10.A((i3 >> 15) & 14, wlsVar4, btsVar, true, false);
            } else {
                btsVar.e0(2109008589);
                btsVar.t(z3);
            }
            LayoutDirection layoutDirection3 = layoutDirection;
            float f4 = an91.f(j690Var, layoutDirection3);
            float e2 = an91.e(j690Var, layoutDirection3);
            if (wlsVar3 != null) {
                f4 -= f3;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
            }
            float f5 = f4;
            if (wlsVar4 != null) {
                e2 -= f3;
                if (e2 < 0.0f) {
                    e2 = 0.0f;
                }
            }
            float f6 = e2;
            if (wlsVar5 != null) {
                btsVar.e0(2146868920);
                f530 o4 = an91.o(ljs0.u(ljs0.g(pj91.h(c530Var, "Prefix"), 24.0f, 0.0f, 2), null, 3), f5, 0.0f, 2.0f, 0.0f, 10);
                uo5Var4 = uo5Var3;
                z910 d7 = pi6.d(uo5Var4, false);
                int S4 = cma1.S(btsVar);
                r1b0 o5 = btsVar.o();
                f530 d8 = b.d(btsVar, o4);
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
                qje.W(btsVar, wlsVar11, d7);
                qje.W(btsVar, wlsVar12, o5);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S4))) {
                    b64.z(S4, btsVar, S4, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d8);
                qv10.A((i3 >> 18) & 14, wlsVar5, btsVar, true, false);
                to5Var = null;
            } else {
                to5Var = null;
                uo5Var4 = uo5Var3;
                btsVar.e0(2109008589);
                btsVar.t(false);
            }
            if (wlsVar6 != null) {
                btsVar.e0(2147239866);
                f530 o6 = an91.o(ljs0.u(ljs0.g(pj91.h(c530Var, "Suffix"), 24.0f, 0.0f, 2), to5Var, 3), 2.0f, 0.0f, f6, 0.0f, 10);
                z910 d9 = pi6.d(uo5Var4, false);
                int S5 = cma1.S(btsVar);
                r1b0 o7 = btsVar.o();
                f530 d10 = b.d(btsVar, o6);
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
                qje.W(btsVar, wlsVar11, d9);
                qje.W(btsVar, wlsVar12, o7);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S5))) {
                    b64.z(S5, btsVar, S5, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d10);
                wlsVar10 = wlsVar6;
                qv10.A((i3 >> 21) & 14, wlsVar10, btsVar, true, false);
                to5Var = null;
            } else {
                wlsVar10 = wlsVar6;
                btsVar.e0(2109008589);
                btsVar.t(false);
            }
            f530 o8 = an91.o(ljs0.u(ljs0.g(c530Var, 24.0f, 0.0f, 2), to5Var, 3), wlsVar5 == null ? f5 : 0.0f, 0.0f, wlsVar10 == null ? f6 : 0.0f, 0.0f, 10);
            if (zlsVar != null) {
                btsVar.e0(-2147031666);
                zlsVar2 = zlsVar;
                zlsVar2.invoke(pj91.h(c530Var, "Hint").k(o8), btsVar, Integer.valueOf((i3 >> 3) & 112));
                z4 = false;
            } else {
                zlsVar2 = zlsVar;
                z4 = false;
                btsVar.e0(2109008589);
            }
            btsVar.t(z4);
            f530 k3 = pj91.h(c530Var, "TextField").k(o8);
            z910 d11 = pi6.d(uo5Var4, true);
            int S6 = cma1.S(btsVar);
            r1b0 o9 = btsVar.o();
            f530 d12 = b.d(btsVar, k3);
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
            qje.W(btsVar, wlsVar11, d11);
            qje.W(btsVar, wlsVar12, o9);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S6))) {
                b64.z(S6, btsVar, S6, wlsVar13);
            }
            qje.W(btsVar, wlsVar14, d12);
            xvz.u((i3 >> 3) & 14, wlsVar, btsVar, true);
            if (wlsVar2 != null) {
                btsVar.e0(-2146287790);
                if (i5 != 4) {
                    if ((i7 & 8) != 0) {
                        bny0Var2 = bny0Var;
                    } else {
                        bny0Var2 = bny0Var;
                    }
                    z6 = false;
                    Q = btsVar.Q();
                    if (!z6 || Q == o430Var) {
                        Q = new vx80(bny0Var2, 0);
                        btsVar.o0(Q);
                    }
                    f530 k4 = pj91.h(ljs0.u(kp50.F(c530Var, new wu40(10, (sls) Q)), null, 3), "Label").k(c530Var);
                    z910 d13 = pi6.d(uo5Var4, false);
                    int S7 = cma1.S(btsVar);
                    r1b0 o10 = btsVar.o();
                    f530 d14 = b.d(btsVar, k4);
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
                    qje.W(btsVar, wlsVar11, d13);
                    qje.W(btsVar, wlsVar12, o10);
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S7))) {
                        b64.z(S7, btsVar, S7, wlsVar13);
                    }
                    qje.W(btsVar, wlsVar14, d14);
                    wlsVar9 = wlsVar2;
                    qv10.A((i3 >> 9) & 14, wlsVar9, btsVar, true, false);
                    to5Var2 = null;
                } else {
                    bny0Var2 = bny0Var;
                }
                z6 = true;
                Q = btsVar.Q();
                if (!z6) {
                }
                Q = new vx80(bny0Var2, 0);
                btsVar.o0(Q);
                f530 k42 = pj91.h(ljs0.u(kp50.F(c530Var, new wu40(10, (sls) Q)), null, 3), "Label").k(c530Var);
                z910 d132 = pi6.d(uo5Var4, false);
                int S72 = cma1.S(btsVar);
                r1b0 o102 = btsVar.o();
                f530 d142 = b.d(btsVar, k42);
                if (dmw0Var != null) {
                }
            } else {
                wlsVar9 = wlsVar2;
                to5Var2 = null;
                btsVar.e0(2109008589);
                btsVar.t(false);
            }
            if (wlsVar7 != null) {
                btsVar.e0(-2145844304);
                f530 j = an91.j(ljs0.u(ljs0.g(pj91.h(c530Var, "Supporting"), 16.0f, 0.0f, 2), to5Var2, 3), new l690(16.0f, 4.0f, 16.0f, 0.0f));
                z910 d15 = pi6.d(uo5Var4, false);
                int S8 = cma1.S(btsVar);
                r1b0 o11 = btsVar.o();
                f530 d16 = b.d(btsVar, j);
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
                qje.W(btsVar, wlsVar11, d15);
                qje.W(btsVar, wlsVar12, o11);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S8))) {
                    b64.z(S8, btsVar, S8, wlsVar13);
                }
                qje.W(btsVar, wlsVar14, d16);
                wlsVar8 = wlsVar7;
                z5 = true;
                qv10.A((i7 >> 9) & 14, wlsVar8, btsVar, true, false);
            } else {
                wlsVar8 = wlsVar7;
                z5 = true;
                btsVar.e0(2109008589);
                btsVar.t(false);
            }
            btsVar.t(z5);
        } else {
            wlsVar8 = wlsVar7;
            zlsVar2 = zlsVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final zls zlsVar3 = zlsVar2;
            final wls wlsVar15 = wlsVar8;
            v.d = new wls() { // from class: wx80
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    rh10.b(wls.this, zlsVar3, wlsVar9, wlsVar3, wlsVar4, wlsVar5, wlsVar10, z, nny0Var, bny0Var, tlsVar, aVar, wlsVar15, j690Var, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static int[] c(String str) {
        Collection collection;
        List l = new Regex("\\.").l(0, str);
        if (!l.isEmpty()) {
            ListIterator listIterator = l.listIterator(l.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = kotlin.collections.a.A0(l, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.a;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        int[] iArr = new int[4];
        int min = (int) Math.min(strArr.length, 4.0d);
        for (int i = 0; i < min; i++) {
            iArr[i] = Integer.parseInt(strArr[i]);
        }
        return iArr;
    }

    public static final DashboardCardInfoEntity d(CardInfo cardInfo) {
        return new DashboardCardInfoEntity(cardInfo.getCardCount(), cardInfo.getPromoCount(), cardInfo.getAction(), cardInfo.getImage(), cardInfo.getStatus(), cardInfo.getHasPlasticCard());
    }
}
