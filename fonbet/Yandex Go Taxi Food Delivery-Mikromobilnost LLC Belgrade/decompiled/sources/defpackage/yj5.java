package defpackage;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Locale;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes11.dex */
public abstract class yj5 {
    public static final long a = rzo.f(4290945065L);

    public static final void a(j611 j611Var, f530 f530Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1084133574);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(j611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(730993373);
            c(j611Var, f530Var, null, tlsVar, btsVar, i2 & 7294);
            btsVar.t(false);
        } else {
            btsVar.e0(731104167);
            b(j611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) j611Var, (Object) f530Var, z, tlsVar, i, 3);
        }
    }

    public static final void b(final j611 j611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1319749704);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(j611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(an91.o(f530Var, 0.0f, 4.0f, 0.0f, j611Var.d ? 0.0f : 32.0f, 5), 1.0f);
            boolean e = btsVar2.e(j611Var);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new xj5(j611Var, 2);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(-1499558818, true, new zls() { // from class: wj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    j611 j611Var2 = j611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(1 & intValue, (intValue & 17) != 16)) {
                                ytb1.a(0, btsVar3, null, j611Var2.c);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                f530 m = ljs0.m(c530.a, SlotSize.L.getSize());
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar4.T);
                                r1b0 o = btsVar4.o();
                                f530 d2 = b.d(btsVar4, m);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d);
                                qje.W(btsVar4, d.e, o);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d2);
                                j611Var2.getClass();
                                xtb1.a(null, j611Var2.e, null, null, btsVar4, 0, 12);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                c530 c530Var = c530.a;
                                f530 o2 = an91.o(c530Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar5, 0);
                                int hashCode2 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d3 = b.d(btsVar5, o2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar2);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a2);
                                qje.W(btsVar5, d.e, o3);
                                qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar5, d.h);
                                qje.W(btsVar5, d.d, d3);
                                qgy.b(j611Var2.a, null, null, tp2.a, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).g.b, null, btsVar5, 805309440, 0, 11766);
                                qgy.b(j611Var2.b, null, an91.o(c530Var, 0.0f, 3.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).h.a, null, btsVar5, 805309824, 0, 11762);
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), wwg.S(464774233, true, new zls() { // from class: wj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    j611 j611Var2 = j611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(1 & intValue, (intValue & 17) != 16)) {
                                ytb1.a(0, btsVar3, null, j611Var2.c);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                f530 m = ljs0.m(c530.a, SlotSize.L.getSize());
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar4.T);
                                r1b0 o = btsVar4.o();
                                f530 d2 = b.d(btsVar4, m);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d);
                                qje.W(btsVar4, d.e, o);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d2);
                                j611Var2.getClass();
                                xtb1.a(null, j611Var2.e, null, null, btsVar4, 0, 12);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                c530 c530Var = c530.a;
                                f530 o2 = an91.o(c530Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar5, 0);
                                int hashCode2 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d3 = b.d(btsVar5, o2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar2);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a2);
                                qje.W(btsVar5, d.e, o3);
                                qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar5, d.h);
                                qje.W(btsVar5, d.d, d3);
                                qgy.b(j611Var2.a, null, null, tp2.a, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).g.b, null, btsVar5, 805309440, 0, 11766);
                                qgy.b(j611Var2.b, null, an91.o(c530Var, 0.0f, 3.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).h.a, null, btsVar5, 805309824, 0, 11762);
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), null, wwg.S(730417555, true, new zls() { // from class: wj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    j611 j611Var2 = j611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(1 & intValue, (intValue & 17) != 16)) {
                                ytb1.a(0, btsVar3, null, j611Var2.c);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                f530 m = ljs0.m(c530.a, SlotSize.L.getSize());
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar4.T);
                                r1b0 o = btsVar4.o();
                                f530 d2 = b.d(btsVar4, m);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d);
                                qje.W(btsVar4, d.e, o);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d2);
                                j611Var2.getClass();
                                xtb1.a(null, j611Var2.e, null, null, btsVar4, 0, 12);
                                btsVar4.t(true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                c530 c530Var = c530.a;
                                f530 o2 = an91.o(c530Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar5, 0);
                                int hashCode2 = Long.hashCode(btsVar5.T);
                                r1b0 o3 = btsVar5.o();
                                f530 d3 = b.d(btsVar5, o2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar5.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar5.i0();
                                if (btsVar5.S) {
                                    btsVar5.n(slsVar2);
                                } else {
                                    btsVar5.r0();
                                }
                                qje.W(btsVar5, d.f, a2);
                                qje.W(btsVar5, d.e, o3);
                                qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar5, d.h);
                                qje.W(btsVar5, d.d, d3);
                                qgy.b(j611Var2.a, null, null, tp2.a, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).g.b, null, btsVar5, 805309440, 0, 11766);
                                qgy.b(j611Var2.b, null, an91.o(c530Var, 0.0f, 3.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar5).h.a, null, btsVar5, 805309824, 0, 11762);
                                btsVar5.t(true);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar2), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(j611Var, f530Var, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(j611 j611Var, f530 f530Var, ety0 ety0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        ety0 ety0Var2;
        aii0 v;
        vj5 vj5Var;
        ety0 ety0Var3;
        int i3;
        String str;
        String str2;
        String d;
        float f;
        boolean k;
        Object Q;
        boolean k2;
        Object Q2;
        Object Q3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(980558594);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(j611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        } else {
            tlsVar2 = tlsVar;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.d(btsVar).f.c;
                i3 = i2 & (-897);
            } else {
                btsVar.Y();
                i3 = i2 & (-897);
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            boolean z = j611Var.d;
            String str3 = j611Var.k;
            String str4 = j611Var.i;
            String str5 = j611Var.f;
            String str6 = j611Var.j;
            CharSequence charSequence = j611Var.g;
            if (z) {
                btsVar.e0(1748747650);
                ety0 ety0Var4 = ety0Var3;
                e(j611Var, f530Var, ety0Var4, tlsVar2, btsVar, i3 & 8190);
                btsVar.t(false);
                v = btsVar.v();
                if (v == null) {
                    return;
                } else {
                    vj5Var = new vj5(j611Var, f530Var, ety0Var4, tlsVar, i, 0);
                }
            } else {
                ety0 ety0Var5 = ety0Var3;
                btsVar.e0(1748930240);
                btsVar.t(false);
                if (charSequence == null || charSequence.length() == 0) {
                    btsVar.e0(1749031021);
                    d(j611Var, f530Var, ety0Var5, btsVar, i3 & 1022);
                    btsVar.t(false);
                    v = btsVar.v();
                    if (v == null) {
                        return;
                    } else {
                        vj5Var = new vj5(j611Var, f530Var, ety0Var5, tlsVar, i, 2);
                    }
                } else {
                    btsVar.e0(1749110784);
                    btsVar.t(false);
                    kdc kdcVar = j611Var.m.a;
                    if (str6 == null) {
                        btsVar.e0(1749228831);
                        btsVar.t(false);
                        str = null;
                        d = null;
                    } else {
                        btsVar.e0(1749228832);
                        int i5 = kyh0.summary_accessibility_tariff_eta;
                        btsVar.e0(-719499183);
                        Integer l = bvu0.l(10, str6);
                        if (l != null) {
                            int intValue = l.intValue();
                            if (intValue >= 60) {
                                str = null;
                                btsVar.e0(1581745769);
                                str2 = ohb1.d(kyh0.mt_route_details_v2_estimated_hours_minutes, new Object[]{Integer.valueOf(intValue / 60), Integer.valueOf(intValue % 60)}, btsVar);
                                btsVar.t(false);
                            } else {
                                str = null;
                                btsVar.e0(51029731);
                                str2 = intValue + " " + ohb1.e(btsVar, kyh0.date_format_min);
                                btsVar.t(false);
                            }
                            btsVar.t(false);
                        } else {
                            str = null;
                            btsVar.t(false);
                            str2 = str6;
                        }
                        d = ohb1.d(i5, new Object[]{str2}, btsVar);
                        btsVar.t(false);
                    }
                    if (d == null) {
                        d = "";
                    }
                    boolean k3 = btsVar.k(charSequence) | btsVar.k(kdcVar) | btsVar.k(d);
                    Object Q4 = btsVar.Q();
                    o430 o430Var = did.a;
                    if (k3 || Q4 == o430Var) {
                        MtTransportType mtTransportType = MtTransportType.UNKNOWN;
                        String obj = charSequence != null ? charSequence.toString() : str;
                        Q4 = new ib11(mtTransportType, obj == null ? "" : obj, kdcVar, new bdc(xng0.textMain), null, d, null, false, false, null, null, null, 4048);
                        btsVar.o0(Q4);
                    }
                    ib11 ib11Var = (ib11) Q4;
                    ety0 ety0Var6 = xya1.e(btsVar).h.a;
                    float f2 = a5l0.f(ety0Var6, 0.0f, btsVar, 2);
                    fwi fwiVar = (fwi) btsVar.m(j.h);
                    Object Q5 = btsVar.Q();
                    if (Q5 == o430Var) {
                        Q5 = f.j(Float.valueOf(0.0f));
                        btsVar.o0(Q5);
                    }
                    oz40 oz40Var = (oz40) Q5;
                    Object Q6 = btsVar.Q();
                    if (Q6 == o430Var) {
                        Q6 = f.j(str);
                        btsVar.o0(Q6);
                    }
                    oz40 oz40Var2 = (oz40) Q6;
                    Object Q7 = btsVar.Q();
                    if (Q7 == o430Var) {
                        Q7 = f.j(str);
                        btsVar.o0(Q7);
                    }
                    oz40 oz40Var3 = (oz40) Q7;
                    float i6 = fwiVar.i(ety0Var6.b.c);
                    Float f3 = (Float) oz40Var2.getValue();
                    if (f3 != null) {
                        float floatValue = f3.floatValue();
                        Float f4 = (Float) oz40Var3.getValue();
                        if (f4 != null) {
                            f = ((y7m) y6i0.a(new y7m(((fwiVar.I(((f4.floatValue() + floatValue) / 2.0f) - ((Number) oz40Var.getValue()).floatValue()) - f2) - i6) - (i6 / 2.0f)), new y7m(0.0f))).a;
                            k = btsVar.k(str5) | btsVar.k(charSequence) | btsVar.k(str4) | btsVar.k(str6) | btsVar.k(str3);
                            Q = btsVar.Q();
                            if (!k || Q == o430Var) {
                                if (str5.length() <= 0) {
                                    str5 = str;
                                }
                                if (charSequence != null || charSequence.length() <= 0) {
                                    charSequence = str;
                                }
                                if (str6 != null || str6.length() <= 0) {
                                    str6 = str;
                                }
                                if (str4 != null || str4.length() <= 0) {
                                    str4 = str;
                                }
                                if (str3 != null || str3.length() <= 0) {
                                    str3 = str;
                                }
                                Q = a.X(j73.A(new CharSequence[]{str5, charSequence, str6, str4, str3}), ". ", null, null, null, 62);
                                btsVar.o0(Q);
                            }
                            String str7 = (String) Q;
                            float f5 = f;
                            f530 o = an91.o(f530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                            k2 = btsVar.k(str7);
                            Q2 = btsVar.Q();
                            if (!k2 || Q2 == o430Var) {
                                Q2 = new h0(str7, 18);
                                btsVar.o0(Q2);
                            }
                            f530 a2 = fnq0.a(o, (tls) Q2);
                            Q3 = btsVar.Q();
                            if (Q3 == o430Var) {
                                Q3 = new w5(18, oz40Var);
                                btsVar.o0(Q3);
                            }
                            f530 y = eja1.y(a2, (tls) Q3);
                            androidx.compose.runtime.internal.a S = wwg.S(-943631097, true, new fn1(j611Var, ety0Var6, f5, i4), btsVar);
                            d3d.a.getClass();
                            a5l0.c(y, 0.0f, 0.0f, null, 0.0f, ety0Var5, null, S, d3d.b, wwg.S(-391505166, true, new t0(ety0Var5, j611Var, ib11Var, oz40Var2, ety0Var6, oz40Var3, 6), btsVar), btsVar, 918577152, 78);
                            ety0Var2 = ety0Var5;
                        }
                    }
                    f = 0.0f;
                    k = btsVar.k(str5) | btsVar.k(charSequence) | btsVar.k(str4) | btsVar.k(str6) | btsVar.k(str3);
                    Q = btsVar.Q();
                    if (!k) {
                    }
                    if (str5.length() <= 0) {
                    }
                    if (charSequence != null) {
                    }
                    charSequence = str;
                    if (str6 != null) {
                    }
                    str6 = str;
                    if (str4 != null) {
                    }
                    str4 = str;
                    if (str3 != null) {
                    }
                    str3 = str;
                    Q = a.X(j73.A(new CharSequence[]{str5, charSequence, str6, str4, str3}), ". ", null, null, null, 62);
                    btsVar.o0(Q);
                    String str72 = (String) Q;
                    float f52 = f;
                    f530 o2 = an91.o(f530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    k2 = btsVar.k(str72);
                    Q2 = btsVar.Q();
                    if (!k2) {
                    }
                    Q2 = new h0(str72, 18);
                    btsVar.o0(Q2);
                    f530 a22 = fnq0.a(o2, (tls) Q2);
                    Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                    }
                    f530 y2 = eja1.y(a22, (tls) Q3);
                    androidx.compose.runtime.internal.a S2 = wwg.S(-943631097, true, new fn1(j611Var, ety0Var6, f52, i4), btsVar);
                    d3d.a.getClass();
                    a5l0.c(y2, 0.0f, 0.0f, null, 0.0f, ety0Var5, null, S2, d3d.b, wwg.S(-391505166, true, new t0(ety0Var5, j611Var, ib11Var, oz40Var2, ety0Var6, oz40Var3, 6), btsVar), btsVar, 918577152, 78);
                    ety0Var2 = ety0Var5;
                }
            }
            v.d = vj5Var;
        }
        btsVar.Y();
        ety0Var2 = ety0Var;
        v = btsVar.v();
        if (v != null) {
            vj5Var = new vj5(j611Var, f530Var, ety0Var2, tlsVar, i, 3);
            v.d = vj5Var;
        }
    }

    public static final void d(j611 j611Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1141242963);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(j611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(ety0Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2;
            String str = j611Var.c;
            f530 o = an91.o(f530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            boolean e = btsVar.e(j611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new xj5(j611Var, 0);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(o, (tls) Q);
            d3d.a.getClass();
            a5l0.d(str, a2, 0.0f, 0.0f, null, 0.0f, ety0Var, null, d3d.d, wwg.S(1118779293, true, new q0v(19, j611Var, ety0Var), btsVar), btsVar, ((i3 << 12) & 3670016) | 906166272, 156);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) j611Var, f530Var, (Object) ety0Var, i, 15);
        }
    }

    public static final void e(j611 j611Var, f530 f530Var, ety0 ety0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(538906685);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(j611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(ety0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            CharSequence charSequence = j611Var.b;
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            boolean k = btsVar.k(charSequence) | btsVar.k(context);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                String obj = charSequence.toString();
                int G = evu0.G(obj, ':', 0, 6);
                if (G > 0 && G < evu0.C(obj)) {
                    String obj2 = evu0.k0(obj.substring(0, G)).toString();
                    String obj3 = evu0.k0(obj.substring(G + 1)).toString();
                    if (obj2.length() != 0 && obj3.length() != 0) {
                        obj = context.getString(kyh0.mobility_hub_multimodality_taxi_feedback_payment, obj3, obj2.toLowerCase(Locale.ROOT));
                    }
                }
                Q = obj;
                btsVar.o0(Q);
            }
            String str = (String) Q;
            int i3 = i2;
            String str2 = j611Var.c;
            f530 o = an91.o(f530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            boolean e = btsVar.e(j611Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new xj5(j611Var, 1);
                btsVar.o0(Q2);
            }
            f530 a2 = fnq0.a(o, (tls) Q2);
            d3d.a.getClass();
            a5l0.d(str2, a2, 0.0f, 0.0f, null, 0.0f, ety0Var, null, d3d.c, wwg.S(-1365764051, true, new rb0(j611Var, ety0Var, str, tlsVar), btsVar), btsVar, ((i3 << 12) & 3670016) | 906166656, 152);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vj5(j611Var, f530Var, ety0Var, tlsVar, i, 1);
        }
    }
}
