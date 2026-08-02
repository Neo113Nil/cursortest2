package defpackage;

import androidx.compose.ui.layout.a;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wk0 extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk0(int i, Object obj) {
        super(3);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long a;
        long a2;
        int i = this.r;
        int i2 = 11;
        int i3 = 3;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        kjn kjnVar = gq5.a;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                ksk M = ((ffh) obj2).M(((ga6) obj3).a);
                return mfh.m0((mfh) obj, M.a, M.b, new al(i2, M, (zd6) obj4));
            case 1:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                xl6 xl6Var = (xl6) obj4;
                if (!booleanValue) {
                    intValue = xl6Var.u.c(intValue);
                }
                if (!booleanValue) {
                    intValue2 = xl6Var.u.c(intValue2);
                }
                if (xl6Var.t) {
                    long j = xl6Var.r.b;
                    int i4 = rds.c;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                        if (Math.min(intValue, intValue2) >= 0 && Math.max(intValue, intValue2) <= xl6Var.r.a.b.length()) {
                            if (booleanValue || intValue == intValue2) {
                                qbs qbsVar = xl6Var.v;
                                qbsVar.q(false);
                                qbsVar.o(zrd.a);
                            } else {
                                xl6Var.v.f(true);
                            }
                            xl6Var.s.v.invoke(new ybs(xl6Var.r.a, y5g.P(intValue, intValue2), (rds) null));
                            return Boolean.valueOf(z);
                        }
                        qbs qbsVar2 = xl6Var.v;
                        qbsVar2.q(false);
                        qbsVar2.o(zrd.a);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(438406499);
                wdc wdcVar = (wdc) obj4;
                oq5Var.p(false);
                return wdcVar;
            case 3:
                Function1 function1 = (Function1) obj2;
                ((mif) obj).getClass();
                function1.getClass();
                ((Function1) obj3).getClass();
                Boolean bool = (Boolean) ((pv9) obj4).b;
                function1.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : n7w.R(q6c.h)));
                return Unit.a;
            case 4:
                Function1 function12 = (Function1) obj2;
                ((mif) obj).getClass();
                function12.getClass();
                ((Function1) obj3).getClass();
                mnd mndVar = (mnd) obj4;
                mp3 mp3Var = new mp3(5, function12);
                if (ond.g.contains(Integer.valueOf(pmd.e.b(mndVar.a, qmd.a)))) {
                    mp3Var.invoke(Boolean.FALSE);
                } else {
                    sye syeVar = new sye();
                    Iterator it = ond.f.iterator();
                    while (it.hasNext()) {
                        int intValue3 = ((Number) it.next()).intValue();
                        if (syeVar.d == null) {
                            syeVar.d = new ArrayList();
                        }
                        syeVar.d.add(Integer.valueOf(intValue3));
                    }
                    w8c w8cVar = mndVar.b;
                    w8cVar.getClass();
                    w8cVar.c(0, new txw(syeVar, z2 ? 1 : 0)).addOnCompleteListener(new g3a(19, mp3Var));
                }
                return Unit.a;
            case 5:
                Function1 function13 = (Function1) obj2;
                ((mif) obj).getClass();
                function13.getClass();
                ((Function1) obj3).getClass();
                ((ey1) obj4).run();
                Unit unit = Unit.a;
                function13.invoke(unit);
                return unit;
            case 6:
                hq5 hq5Var = ((lrq) obj).a;
                hq5 hq5Var2 = (hq5) obj2;
                ((Number) obj3).intValue();
                int i5 = ((oq5) hq5Var2).P;
                yci H = vnj.H(hq5Var2, (yci) obj4);
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.a0(509942095);
                xp5.T.getClass();
                g0g.U(oq5Var2, H, wp5.d);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var2, i5, kb5Var);
                }
                oq5Var2.p(false);
                return Unit.a;
            case 7:
                Function1 function14 = (Function1) obj2;
                ((mif) obj).getClass();
                function14.getClass();
                ((Function1) obj3).getClass();
                function14.invoke(AppMetrica.getUuid(((wnd) obj4).b));
                return Unit.a;
            case 8:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= (intValue4 & 8) == 0 ? ((oq5) hq5Var3).f(obj) : ((oq5) hq5Var3).h(obj) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue4 & 1, (intValue4 & 19) != 18)) {
                    oq5Var3.B((jfi) obj4, oq5Var3.l(), obj, false);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 9:
                yci yciVar = (yci) obj;
                ((Number) obj3).intValue();
                xep xepVar = (xep) obj4;
                oq5 oq5Var4 = (oq5) ((hq5) obj2);
                oq5Var4.Z(-1914520728);
                jx7 jx7Var = (jx7) oq5Var4.j(es5.h);
                Object K = oq5Var4.K();
                Object obj5 = K;
                if (K == kjnVar) {
                    x6k g0 = szf.g0(new hqe(0L));
                    oq5Var4.k0(g0);
                    obj5 = g0;
                }
                aqi aqiVar = (aqi) obj5;
                boolean h = oq5Var4.h(xepVar);
                Object K2 = oq5Var4.K();
                Object obj6 = K2;
                if (h || K2 == kjnVar) {
                    j5n j5nVar = new j5n(i2, xepVar, aqiVar);
                    oq5Var4.k0(j5nVar);
                    obj6 = j5nVar;
                }
                Function0 function0 = (Function0) obj6;
                boolean f = oq5Var4.f(jx7Var);
                Object K3 = oq5Var4.K();
                Object obj7 = K3;
                if (f || K3 == kjnVar) {
                    afp afpVar = new afp(jx7Var, aqiVar, z3 ? 1 : 0);
                    oq5Var4.k0(afpVar);
                    obj7 = afpVar;
                }
                zm0 zm0Var = uep.a;
                yci q = vnj.q(yciVar, new yl0(function0, (Function1) obj7));
                oq5Var4.p(false);
                return q;
            case 10:
                hq5 hq5Var4 = (hq5) obj2;
                int intValue5 = ((Number) obj3).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xcs.b((String) obj4, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var5, 0, 0, 131070);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 11:
                yci yciVar2 = (yci) obj;
                ((Number) obj3).intValue();
                qbs qbsVar3 = (qbs) obj4;
                oq5 oq5Var6 = (oq5) ((hq5) obj2);
                oq5Var6.Z(1980580247);
                jx7 jx7Var2 = (jx7) oq5Var6.j(es5.h);
                Object K4 = oq5Var6.K();
                Object obj8 = K4;
                if (K4 == kjnVar) {
                    x6k g02 = szf.g0(new hqe(0L));
                    oq5Var6.k0(g02);
                    obj8 = g02;
                }
                aqi aqiVar2 = (aqi) obj8;
                boolean h2 = oq5Var6.h(qbsVar3);
                Object K5 = oq5Var6.K();
                Object obj9 = K5;
                if (h2 || K5 == kjnVar) {
                    j5n j5nVar2 = new j5n(14, qbsVar3, aqiVar2);
                    oq5Var6.k0(j5nVar2);
                    obj9 = j5nVar2;
                }
                Function0 function02 = (Function0) obj9;
                boolean f2 = oq5Var6.f(jx7Var2);
                Object K6 = oq5Var6.K();
                Object obj10 = K6;
                if (f2 || K6 == kjnVar) {
                    afp afpVar2 = new afp(jx7Var2, aqiVar2, i3);
                    oq5Var6.k0(afpVar2);
                    obj10 = afpVar2;
                }
                zm0 zm0Var2 = uep.a;
                yci q2 = vnj.q(yciVar2, new yl0(function02, (Function1) obj10));
                oq5Var6.p(false);
                return q2;
            case 12:
                long j2 = ((ga6) obj3).a;
                long j3 = ((ubs) obj4).f;
                ksk M2 = ((ffh) obj2).M(ga6.b(j2, yhn.d((int) (j3 >> 32), ga6.k(j2), ga6.i(j2)), 0, yhn.d((int) (j3 & 4294967295L), ga6.j(j2), ga6.h(j2)), 0, 10));
                return mfh.m0((mfh) obj, M2.a, M2.b, new ai0(M2, 17));
            case 13:
                ((Number) obj3).intValue();
                oq5 oq5Var7 = (oq5) ((hq5) obj2);
                oq5Var7.Z(1582736677);
                jx7 jx7Var3 = (jx7) oq5Var7.j(es5.h);
                ppc ppcVar = (ppc) oq5Var7.j(es5.k);
                xof xofVar = (xof) oq5Var7.j(es5.n);
                ges gesVar = (ges) obj4;
                boolean f3 = oq5Var7.f(gesVar) | oq5Var7.f(xofVar);
                Object K7 = oq5Var7.K();
                Object obj11 = K7;
                if (f3 || K7 == kjnVar) {
                    ges T = u7g.T(gesVar, xofVar);
                    oq5Var7.k0(T);
                    obj11 = T;
                }
                ges gesVar2 = (ges) obj11;
                boolean f4 = oq5Var7.f(ppcVar) | oq5Var7.f(gesVar2);
                Object K8 = oq5Var7.K();
                Object obj12 = K8;
                if (f4 || K8 == kjnVar) {
                    c4r c4rVar = gesVar2.a;
                    qpc qpcVar = c4rVar.f;
                    tqc tqcVar = c4rVar.c;
                    if (tqcVar == null) {
                        tqcVar = tqc.m;
                    }
                    oqc oqcVar = c4rVar.d;
                    int i6 = oqcVar != null ? oqcVar.a : 0;
                    pqc pqcVar = c4rVar.e;
                    odt b = ((rpc) ppcVar).b(qpcVar, tqcVar, i6, pqcVar != null ? pqcVar.a : 65535);
                    oq5Var7.k0(b);
                    obj12 = b;
                }
                sdr sdrVar = (sdr) obj12;
                Object K9 = oq5Var7.K();
                Object obj13 = K9;
                if (K9 == kjnVar) {
                    Object value = sdrVar.getValue();
                    ubs ubsVar = new ubs();
                    ubsVar.a = xofVar;
                    ubsVar.b = jx7Var3;
                    ubsVar.c = ppcVar;
                    ubsVar.d = gesVar;
                    ubsVar.e = value;
                    a2 = vas.a(gesVar, jx7Var3, ppcVar, vas.a, 1);
                    ubsVar.f = a2;
                    oq5Var7.k0(ubsVar);
                    obj13 = ubsVar;
                }
                ubs ubsVar2 = (ubs) obj13;
                Object value2 = sdrVar.getValue();
                if (xofVar != ubsVar2.a || !Intrinsics.d(jx7Var3, ubsVar2.b) || !Intrinsics.d(ppcVar, ubsVar2.c) || !Intrinsics.d(gesVar2, ubsVar2.d) || !Intrinsics.d(value2, ubsVar2.e)) {
                    ubsVar2.a = xofVar;
                    ubsVar2.b = jx7Var3;
                    ubsVar2.c = ppcVar;
                    ubsVar2.d = gesVar2;
                    ubsVar2.e = value2;
                    a = vas.a(gesVar2, jx7Var3, ppcVar, vas.a, 1);
                    ubsVar2.f = a;
                }
                boolean h3 = oq5Var7.h(ubsVar2);
                Object K10 = oq5Var7.K();
                Object obj14 = K10;
                if (h3 || K10 == kjnVar) {
                    wk0 wk0Var = new wk0(12, ubsVar2);
                    oq5Var7.k0(wk0Var);
                    obj14 = wk0Var;
                }
                yci b2 = a.b(vci.a, (pyc) obj14);
                oq5Var7.p(false);
                return b2;
            case 14:
                Function1 function15 = (Function1) obj2;
                Function1 function16 = (Function1) obj3;
                ((mif) obj).getClass();
                function15.getClass();
                function16.getClass();
                ((al) obj4).invoke(new dmd(function15, function16, i3));
                return Unit.a;
            case 15:
                ((Number) obj3).intValue();
                oq5 oq5Var8 = (oq5) ((hq5) obj2);
                oq5Var8.Z(114694318);
                q0k q0kVar = (q0k) obj4;
                boolean f5 = oq5Var8.f(q0kVar);
                Object K11 = oq5Var8.K();
                Object obj15 = K11;
                if (f5 || K11 == kjnVar) {
                    p0k p0kVar = new p0k(q0kVar);
                    oq5Var8.k0(p0kVar);
                    obj15 = p0kVar;
                }
                p0k p0kVar2 = (p0k) obj15;
                oq5Var8.p(false);
                return p0kVar2;
            default:
                ((Number) obj3).intValue();
                oq5 oq5Var9 = (oq5) ((hq5) obj2);
                oq5Var9.Z(-1415685722);
                opv opvVar = (opv) obj4;
                boolean f6 = oq5Var9.f(opvVar);
                Object K12 = oq5Var9.K();
                Object obj16 = K12;
                if (f6 || K12 == kjnVar) {
                    doe doeVar = new doe(opvVar);
                    oq5Var9.k0(doeVar);
                    obj16 = doeVar;
                }
                doe doeVar2 = (doe) obj16;
                oq5Var9.p(false);
                return doeVar2;
        }
    }
}
