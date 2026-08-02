package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.math.BigDecimal;

/* loaded from: classes11.dex */
public abstract class vtb1 {
    public static final void a(final c311 c311Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        a aVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(133777057);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(c311Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 c = ljs0.c(c530Var, 1.0f);
            if (c311Var.a != null) {
                btsVar.e0(132071213);
                aVar = wwg.S(-1881715112, true, new zls() { // from class: a311
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        c311 c311Var2 = c311Var;
                        switch (i6) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    rdb1.a(ibp0Var, (ovi0) c311Var2.a.a, null, null, null, btsVar2, intValue & 14);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11Var;
                            default:
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    c530 c530Var2 = c530.a;
                                    f530 q = ljs0.q(c530Var2, 174.0f);
                                    sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar3, 6);
                                    int hashCode2 = Long.hashCode(btsVar3.T);
                                    r1b0 o3 = btsVar3.o();
                                    f530 d3 = b.d(btsVar3, q);
                                    ohd.G1.getClass();
                                    sls slsVar2 = d.b;
                                    if (btsVar3.a == null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar3.i0();
                                    if (btsVar3.S) {
                                        btsVar3.n(slsVar2);
                                    } else {
                                        btsVar3.r0();
                                    }
                                    qje.W(btsVar3, d.f, a);
                                    qje.W(btsVar3, d.e, o3);
                                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                    qje.M(btsVar3, d.h);
                                    qje.W(btsVar3, d.d, d3);
                                    CharSequence charSequence = c311Var2.b.a;
                                    CharSequence charSequence2 = (charSequence == null || evu0.J(charSequence)) ? null : charSequence;
                                    if (charSequence2 == null) {
                                        btsVar3.e0(1037482507);
                                        btsVar3.t(false);
                                    } else {
                                        btsVar3.e0(1037482508);
                                        qgy.b(charSequence2, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.b(btsVar3).g, null, btsVar3, 805309824, 6, 10738);
                                        btsVar3.t(false);
                                    }
                                    CharSequence charSequence3 = c311Var2.b.b;
                                    CharSequence charSequence4 = (charSequence3 == null || evu0.J(charSequence3)) ? null : charSequence3;
                                    if (charSequence4 == null) {
                                        btsVar3.e0(1037896574);
                                        btsVar3.t(false);
                                    } else {
                                        btsVar3.e0(1037896575);
                                        qgy.b(charSequence4, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, 805309824, 6, 10738);
                                        btsVar3.t(false);
                                    }
                                    btsVar3.t(true);
                                } else {
                                    btsVar3.Y();
                                }
                                return zy11Var;
                        }
                    }
                }, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(132183712);
                btsVar.t(false);
                aVar = p8y.a;
            }
            a aVar2 = aVar;
            a S = wwg.S(1893520312, true, new zls() { // from class: a311
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    c311 c311Var2 = c311Var;
                    switch (i6) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                rdb1.a(ibp0Var, (ovi0) c311Var2.a.a, null, null, null, btsVar2, intValue & 14);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                c530 c530Var2 = c530.a;
                                f530 q = ljs0.q(c530Var2, 174.0f);
                                sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar3, 6);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, q);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                CharSequence charSequence = c311Var2.b.a;
                                CharSequence charSequence2 = (charSequence == null || evu0.J(charSequence)) ? null : charSequence;
                                if (charSequence2 == null) {
                                    btsVar3.e0(1037482507);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(1037482508);
                                    qgy.b(charSequence2, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.b(btsVar3).g, null, btsVar3, 805309824, 6, 10738);
                                    btsVar3.t(false);
                                }
                                CharSequence charSequence3 = c311Var2.b.b;
                                CharSequence charSequence4 = (charSequence3 == null || evu0.J(charSequence3)) ? null : charSequence3;
                                if (charSequence4 == null) {
                                    btsVar3.e0(1037896574);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(1037896575);
                                    qgy.b(charSequence4, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, 805309824, 6, 10738);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar);
            btsVar.e0(133666783);
            btsVar.t(false);
            ydb1.a(c, aVar2, S, null, ka01.a, null, null, false, btsVar, 390, 232);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(c311Var, tlsVar, f530Var2, i, 8);
        }
    }

    public static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal d(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public abstract int b(int i, int i2, LayoutDirection layoutDirection);
}
