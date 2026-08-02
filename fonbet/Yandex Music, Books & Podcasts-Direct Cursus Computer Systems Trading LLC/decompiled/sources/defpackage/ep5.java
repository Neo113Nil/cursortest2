package defpackage;

import androidx.compose.animation.c;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ep5 implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ ep5(int i) {
        this.a = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k46 k46Var;
        int i;
        float f;
        jyr jyrVar;
        float f2;
        long j;
        float floatValue;
        Object m46Var;
        int i2 = this.a;
        kjn kjnVar = gq5.a;
        yci yciVar = vci.a;
        int i3 = 1;
        int i4 = 2;
        switch (i2) {
            case 0:
                osv osvVar = (osv) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(osvVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                if (osvVar instanceof nsv) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-1986562772);
                    nsv nsvVar = (nsv) osvVar;
                    y7g.k(nsvVar.b, nsvVar.c, oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    if (!(osvVar instanceof msv) && osvVar != null) {
                        throw vz1.i((oq5) hq5Var, -1986565229, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-1986555381);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 1:
                am0 am0Var = (am0) obj;
                hq5 hq5Var2 = (hq5) obj2;
                ((Integer) obj3).getClass();
                am0Var.getClass();
                neg.s(hq5Var2);
                String M = rvf.M(R.string.wizard_choose_favourite_artists, hq5Var2);
                oct octVar = c.a;
                long j2 = 1;
                e9b a = c.l(weo.Q(0.0f, 400.0f, new wpe((j2 & 4294967295L) | (j2 << 32)), 1), jx9.y0).a(c.e(null, 3));
                ov6 ov6Var = lya.c;
                float f3 = 10;
                xcs.b(M, a.q(am0Var.b(a, c.n(weo.S(0, 0, ov6Var, 3), jx9.z0).a(c.f(weo.S(0, 0, ov6Var, 3), 2))), f3, 0.0f, f3, 24, 2), ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(hq5Var2).a.a, hq5Var2, 0, 0, 65016);
                return Unit.a;
            case 2:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var3, gut.a0(yciVar));
                return Unit.a;
            case 3:
                hq5 hq5Var4 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var4, gut.a0(yciVar));
                return Unit.a;
            case 4:
                hq5 hq5Var5 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue4 & 17) == 16) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var5, d.e(yciVar, 16));
                return Unit.a;
            case 5:
                hq5 hq5Var6 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue5 & 17) == 16) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var6, gut.a0(yciVar));
                return Unit.a;
            case 6:
                yci yciVar2 = (yci) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                yciVar2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var7).f(yciVar2) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                pm0.c(yciVar2, hq5Var7, intValue6 & 14);
                return Unit.a;
            case 7:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                zknVar.getClass();
                fs1 fs1Var = zknVar.b;
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var8).f(zknVar) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                bs1 k = fs1Var.k();
                if (k instanceof as1) {
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    oq5Var10.Z(-21284014);
                    irf.r(fs1Var, zknVar.c, null, zknVar.d, zknVar.e, 0.0f, null, oq5Var10, 0, 100);
                    oq5Var10.p(false);
                } else if (Intrinsics.d(k, xr1.a) || (k instanceof yr1)) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    oq5Var11.Z(1246249369);
                    ivf.k(6, 2, oq5Var11, null, false);
                    oq5Var11.p(false);
                } else {
                    if (!(k instanceof zr1)) {
                        throw vz1.i((oq5) hq5Var8, 1246237271, false);
                    }
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    oq5Var12.Z(1246252230);
                    ivf.k(0, 2, oq5Var12, null, true);
                    oq5Var12.p(false);
                }
                return Unit.a;
            case 8:
                yci yciVar3 = (yci) obj;
                ((Integer) obj3).getClass();
                Float valueOf = Float.valueOf(0.0f);
                yciVar3.getClass();
                oq5 oq5Var13 = (oq5) ((hq5) obj2);
                oq5Var13.Z(114976168);
                Object K = oq5Var13.K();
                if (K == kjnVar) {
                    K = szf.g0(valueOf);
                    oq5Var13.k0(K);
                }
                aqi aqiVar = (aqi) K;
                Object K2 = oq5Var13.K();
                if (K2 == kjnVar) {
                    K2 = szf.g0(valueOf);
                    oq5Var13.k0(K2);
                }
                aqi aqiVar2 = (aqi) K2;
                float floatValue2 = ((Number) aqiVar2.getValue()).floatValue();
                float floatValue3 = ((Number) aqiVar.getValue()).floatValue();
                float Q = ff7.Q(10, oq5Var13);
                boolean c = oq5Var13.c(floatValue2) | oq5Var13.c(floatValue3);
                Object K3 = oq5Var13.K();
                if (c || K3 == kjnVar) {
                    K3 = new k46(floatValue3, floatValue2, Q);
                    oq5Var13.k0(K3);
                }
                k46 k46Var2 = (k46) K3;
                float f4 = k46Var2.a;
                jyr jyrVar2 = k46Var2.d;
                float f5 = k46Var2.b;
                boolean c2 = oq5Var13.c(f5) | oq5Var13.c(f5);
                Object K4 = oq5Var13.K();
                if (c2 || K4 == kjnVar) {
                    K4 = Integer.valueOf(eeh.b(Math.max(f4, f5) / 60));
                    oq5Var13.k0(K4);
                }
                int intValue8 = ((Number) K4).intValue();
                xje D = fgq.D(null, oq5Var13, 1);
                oq5Var13.Z(-1608144352);
                ArrayList arrayList = new ArrayList(intValue8);
                int i5 = 0;
                while (i5 < intValue8) {
                    Object K5 = oq5Var13.K();
                    if (K5 == kjnVar) {
                        int b = eeh.b(3.0f * f4);
                        ohn ohnVar = phn.a;
                        int b2 = eeh.b(f4 / i4);
                        ohnVar.getClass();
                        K5 = Integer.valueOf(phn.b.d(b2) + b);
                        oq5Var13.k0(K5);
                    }
                    int intValue9 = ((Number) K5).intValue();
                    Object K6 = oq5Var13.K();
                    if (K6 == kjnVar) {
                        K6 = Integer.valueOf(eeh.b(phn.a.h() * intValue9));
                        oq5Var13.k0(K6);
                    }
                    int intValue10 = ((Number) K6).intValue();
                    Object K7 = oq5Var13.K();
                    if (K7 == kjnVar) {
                        ohn ohnVar2 = phn.a;
                        ohnVar2.getClass();
                        i = intValue8;
                        f = f4;
                        int d = phn.b.d(3);
                        float f6 = k46Var2.c;
                        if (d == 0) {
                            k46Var = k46Var2;
                            float f7 = 2;
                            m46Var = new l46(((ohnVar2.h() + 1) * (f6 / f7)) / f7);
                            jyrVar = jyrVar2;
                        } else {
                            k46Var = k46Var2;
                            jyrVar = jyrVar2;
                            float f8 = f6 / 2;
                            float f9 = 1;
                            m46Var = new m46(a4g.i((ohnVar2.h() + f9) * f8, (ohnVar2.h() + f9) * f8));
                        }
                        K7 = m46Var;
                        oq5Var13.k0(K7);
                    } else {
                        k46Var = k46Var2;
                        i = intValue8;
                        f = f4;
                        jyrVar = jyrVar2;
                    }
                    n46 n46Var = (n46) K7;
                    Object K8 = oq5Var13.K();
                    if (K8 == kjnVar) {
                        f2 = f5;
                        K8 = new d85(((d85) CollectionsKt.i0(u75.h(new d85(c3x.h(4294471723L)), new d85(c3x.h(4294163497L)), new d85(c3x.h(4294762613L))), phn.a)).a);
                        oq5Var13.k0(K8);
                    } else {
                        f2 = f5;
                    }
                    long j3 = ((d85) K8).a;
                    if (n46Var instanceof m46) {
                        oq5Var13.Z(-905440472);
                        Object K9 = oq5Var13.K();
                        if (K9 == kjnVar) {
                            K9 = Float.valueOf(phn.a.h() * 360.0f);
                            oq5Var13.k0(K9);
                        }
                        float floatValue4 = ((Number) K9).floatValue();
                        Object K10 = oq5Var13.K();
                        if (K10 == kjnVar) {
                            phn.a.getClass();
                            K10 = Integer.valueOf(phn.b.d(2) == 0 ? 1 : -1);
                            oq5Var13.k0(K10);
                        }
                        j = j3;
                        floatValue = ((Number) fgq.s(D, floatValue4, (((Number) K10).intValue() * 360.0f) + floatValue4, weo.C(new act(intValue9, intValue10, nya.d), jyn.a, 0L, 4), null, oq5Var13, 4536, 8).d.getValue()).floatValue();
                        oq5Var13.p(false);
                    } else {
                        j = j3;
                        oq5Var13.Z(-905280264);
                        Object K11 = oq5Var13.K();
                        if (K11 == kjnVar) {
                            oq5Var13.k0(valueOf);
                            K11 = valueOf;
                        }
                        floatValue = ((Number) K11).floatValue();
                        oq5Var13.p(false);
                    }
                    float f10 = -((Number) jyrVar.getValue()).floatValue();
                    float floatValue5 = ((Number) jyrVar.getValue()).floatValue() + f;
                    xla xlaVar = nya.d;
                    act actVar = new act(intValue9, intValue10, xlaVar);
                    jyn jynVar = jyn.a;
                    float f11 = floatValue;
                    oq5 oq5Var14 = oq5Var13;
                    Float f12 = valueOf;
                    wje s = fgq.s(D, f10, floatValue5, weo.C(actVar, jynVar, 0L, 4), null, oq5Var14, 4104, 8);
                    Object K12 = oq5Var14.K();
                    if (K12 == kjnVar) {
                        K12 = Float.valueOf(f2 / 2);
                        oq5Var14.k0(K12);
                    }
                    float floatValue6 = ((Number) K12).floatValue();
                    Object K13 = oq5Var14.K();
                    if (K13 == kjnVar) {
                        K13 = Float.valueOf((phn.a.h() * floatValue6) - (floatValue6 / 2));
                        oq5Var14.k0(K13);
                    }
                    float floatValue7 = ((Number) K13).floatValue();
                    Object K14 = oq5Var14.K();
                    if (K14 == kjnVar) {
                        K14 = Float.valueOf(phn.a.h() * f2);
                        oq5Var14.k0(K14);
                    }
                    float floatValue8 = ((Number) K14).floatValue();
                    arrayList.add(new j46(j, n46Var, swf.i(((Number) fgq.s(D, floatValue8, floatValue8 + floatValue7, weo.C(new act(intValue9, intValue10, xlaVar), jynVar, 0L, 4), null, oq5Var14, 4536, 8).d.getValue()).floatValue(), ((Number) s.d.getValue()).floatValue()), f11));
                    i5++;
                    intValue8 = i;
                    f4 = f;
                    k46Var2 = k46Var;
                    oq5Var13 = oq5Var14;
                    jyrVar2 = jyrVar;
                    f5 = f2;
                    valueOf = f12;
                    i4 = 2;
                }
                oq5 oq5Var15 = oq5Var13;
                oq5Var15.p(false);
                boolean f13 = oq5Var15.f(arrayList);
                Object K15 = oq5Var15.K();
                if (f13 || K15 == kjnVar) {
                    K15 = new g3(21, arrayList, aqiVar2, aqiVar);
                    oq5Var15.k0(K15);
                }
                yci c3 = androidx.compose.ui.draw.a.c(yciVar3, (Function1) K15);
                oq5Var15.p(false);
                return c3;
            case 9:
                float f14 = vor.a;
                yci yciVar4 = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar4.getClass();
                oq5 oq5Var16 = (oq5) ((hq5) obj2);
                oq5Var16.Z(2086914018);
                Object K16 = oq5Var16.K();
                if (K16 == kjnVar) {
                    K16 = szf.g0(new xov(0, 0));
                    oq5Var16.k0(K16);
                }
                aqi aqiVar3 = (aqi) K16;
                Object K17 = oq5Var16.K();
                if (K17 == kjnVar) {
                    K17 = new rua(23);
                    oq5Var16.k0(K17);
                }
                yci a2 = androidx.compose.ui.graphics.a.a(yciVar4, (Function1) K17);
                boolean c4 = oq5Var16.c(f14);
                Object K18 = oq5Var16.K();
                if (c4 || K18 == kjnVar) {
                    K18 = new x80(aqiVar3);
                    oq5Var16.k0(K18);
                }
                yci b3 = androidx.compose.ui.draw.a.b(a2, (Function1) K18);
                Object K19 = oq5Var16.K();
                if (K19 == kjnVar) {
                    K19 = new ca3(aqiVar3, i3);
                    oq5Var16.k0(K19);
                }
                yci b4 = androidx.compose.ui.layout.a.b(b3, (pyc) K19);
                oq5Var16.p(false);
                return b4;
            case 10:
                ffh ffhVar = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue11 = ((Integer) obj3).intValue();
                ffhVar.getClass();
                return Integer.valueOf(ffhVar.J(intValue11));
            case 11:
                ffh ffhVar2 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue12 = ((Integer) obj3).intValue();
                ffhVar2.getClass();
                return Integer.valueOf(ffhVar2.z(intValue12));
            case 12:
                ffh ffhVar3 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue13 = ((Integer) obj3).intValue();
                ffhVar3.getClass();
                return Integer.valueOf(ffhVar3.J(intValue13));
            case 13:
                ffh ffhVar4 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue14 = ((Integer) obj3).intValue();
                ffhVar4.getClass();
                return Integer.valueOf(ffhVar4.G(intValue14));
            case 14:
                ffh ffhVar5 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue15 = ((Integer) obj3).intValue();
                ffhVar5.getClass();
                return Integer.valueOf(ffhVar5.J(intValue15));
            case 15:
                ffh ffhVar6 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue16 = ((Integer) obj3).intValue();
                ffhVar6.getClass();
                return Integer.valueOf(ffhVar6.z(intValue16));
            case 16:
                ffh ffhVar7 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue17 = ((Integer) obj3).intValue();
                ffhVar7.getClass();
                return Integer.valueOf(ffhVar7.z(intValue17));
            case 17:
                ffh ffhVar8 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue18 = ((Integer) obj3).intValue();
                ffhVar8.getClass();
                return Integer.valueOf(ffhVar8.G(intValue18));
            case 18:
                ffh ffhVar9 = (ffh) obj;
                ((Integer) obj2).intValue();
                int intValue19 = ((Integer) obj3).intValue();
                ffhVar9.getClass();
                return Integer.valueOf(ffhVar9.G(intValue19));
            case 19:
                ((Integer) obj3).getClass();
                ((yci) obj).getClass();
                oq5 oq5Var17 = (oq5) ((hq5) obj2);
                oq5Var17.Z(353970219);
                if (((Boolean) oq5Var17.j(v5i.a)).booleanValue()) {
                    oq5Var17.Z(982145264);
                    yciVar = new t5i(((aeu) oq5Var17.j(es5.s)).d());
                    oq5Var17.p(false);
                } else {
                    oq5Var17.Z(982435455);
                    oq5Var17.p(false);
                }
                oq5Var17.p(false);
                return yciVar;
            case 20:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar10 = (ffh) obj2;
                mfhVar.getClass();
                ffhVar10.getClass();
                ksk M2 = ffhVar10.M(((ga6) obj3).a);
                return mfh.m0(mfhVar, M2.a, M2.b, new dae(25, mfhVar, M2));
            case 21:
                drf drfVar = (drf) obj;
                ((Integer) obj3).getClass();
                drfVar.getClass();
                oq5 oq5Var18 = (oq5) ((hq5) obj2);
                oq5Var18.Z(-21881236);
                xil xilVar = (xil) oq5Var18.j(glg.a);
                int intValue20 = ((Number) oq5Var18.j(glg.b)).intValue();
                Object K20 = oq5Var18.K();
                if (K20 == kjnVar) {
                    String str = drfVar.a().b;
                    String str2 = drfVar.a().a;
                    str.getClass();
                    str2.getClass();
                    K20 = new exa(new lab(1, intValue20 + 1, 0, str, str2), xilVar.b, xilVar.e);
                    oq5Var18.k0(K20);
                }
                exa exaVar = (exa) K20;
                oq5Var18.p(false);
                return exaVar;
            case 22:
                float f15 = c5n.a;
                mfh mfhVar2 = (mfh) obj;
                ffh ffhVar11 = (ffh) obj2;
                mfhVar2.getClass();
                ffhVar11.getClass();
                int L = mfhVar2.L(f15);
                int L2 = mfhVar2.L(f15);
                int L3 = mfhVar2.L(f15);
                int L4 = mfhVar2.L(f15);
                ksk M3 = ffhVar11.M(ia6.i(((ga6) obj3).a, L + L3, L2 + L4));
                return mfh.m0(mfhVar2, (M3.a - L) - L3, (M3.b - L2) - L4, new dt4(M3, L, L2, 2));
            case 23:
                mfh mfhVar3 = (mfh) obj;
                ffh ffhVar12 = (ffh) obj2;
                mfhVar3.getClass();
                ffhVar12.getClass();
                int L5 = mfhVar3.L(48);
                int L6 = mfhVar3.L(64);
                int L7 = mfhVar3.L(32);
                float min = Math.min(ga6.i(r5.a) / mfhVar3.L(411), 1.0f);
                int b5 = eeh.b((r8 + L5 + L6) * min);
                int b6 = eeh.b((b5 * 595.0f) / 1600.0f);
                long j4 = ((ga6) obj3).a;
                return mfh.m0(mfhVar3, ga6.i(j4), ga6.h(j4), new dt4(ffhVar12.M(ga6.a(b5, b5, b6, b6)), L7 - eeh.b(min * (L5 + L7)), Math.max(0, (b6 - ga6.h(j4)) / 2), 4));
            case 24:
                mrp mrpVar = (mrp) obj;
                int intValue21 = ((Integer) obj3).intValue();
                mrpVar.getClass();
                etn.i.invoke(mrpVar, (hq5) obj2, Integer.valueOf(intValue21 & 14));
                return Unit.a;
            case 25:
                vgq vgqVar = (vgq) obj;
                int intValue22 = ((Integer) obj3).intValue();
                vgqVar.getClass();
                x97.e.invoke(vgqVar, (hq5) obj2, Integer.valueOf(intValue22 & 14));
                return Unit.a;
            case 26:
                float f16 = ows.b;
                mfh mfhVar4 = (mfh) obj;
                ffh ffhVar13 = (ffh) obj2;
                mfhVar4.getClass();
                ffhVar13.getClass();
                int L8 = mfhVar4.L(f16);
                long j5 = ((ga6) obj3).a;
                ksk M4 = ffhVar13.M(ga6.b(j5, 0, ga6.i(j5) + L8, 0, 0, 13));
                return mfh.m0(mfhVar4, M4.a, M4.b, new b4k(L8, 3, M4));
            case 27:
                mfh mfhVar5 = (mfh) obj;
                ffh ffhVar14 = (ffh) obj2;
                mfhVar5.getClass();
                ffhVar14.getClass();
                long j6 = ((ga6) obj3).a;
                int L9 = mfhVar5.L(40);
                if (L9 < 0) {
                    ume.a("height must be >= 0");
                }
                ksk M5 = ffhVar14.M(ia6.e(j6, ia6.h(0, Integer.MAX_VALUE, L9, L9)));
                return mfh.m0(mfhVar5, M5.a, M5.b, new zj(M5, 9));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                mfh mfhVar6 = (mfh) obj;
                ffh ffhVar15 = (ffh) obj2;
                mfhVar6.getClass();
                ffhVar15.getClass();
                long j7 = ((ga6) obj3).a;
                int L10 = mfhVar6.L(68);
                if (L10 < 0) {
                    ume.a("height must be >= 0");
                }
                ksk M6 = ffhVar15.M(ia6.e(j7, ia6.h(0, Integer.MAX_VALUE, L10, L10)));
                return mfh.m0(mfhVar6, M6.a, M6.b, new zj(M6, 10));
            default:
                rmu rmuVar = (rmu) obj;
                int intValue23 = ((Integer) obj3).intValue();
                rmuVar.getClass();
                etn.h.invoke(rmuVar, (hq5) obj2, Integer.valueOf(intValue23 & 14));
                return Unit.a;
        }
    }

    public /* synthetic */ ep5(knq knqVar, int i) {
        this.a = i;
    }
}
