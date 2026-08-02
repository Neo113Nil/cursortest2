package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementRedirectSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.b580;
import defpackage.dqe0;
import defpackage.f580;
import defpackage.fmw0;
import defpackage.g580;
import defpackage.gbj0;
import defpackage.gi;
import defpackage.iev0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kmw0;
import defpackage.l7s0;
import defpackage.lmw0;
import defpackage.lot0;
import defpackage.nnm;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.q6c0;
import defpackage.roj0;
import defpackage.soj0;
import defpackage.tej0;
import defpackage.tlx0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.upj0;
import defpackage.uyj;
import defpackage.vfx0;
import defpackage.w15;
import defpackage.w511;
import defpackage.wu1;
import defpackage.x8;
import defpackage.xcv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;

/* loaded from: classes6.dex */
public final class k0 {
    public final roj0 a;
    public final lot0 b;
    public final w15 c;
    public final g580 d;
    public final f580 e;
    public final vfx0 f;
    public final q6c0 g;
    public final l7s0 h;
    public final com.yandex.go.zone.repository.o i;
    public final ru.yandex.taxi.summary.requirements.list.mapper.a j;
    public final dqe0 k;
    public final tt2 l;
    public final j m;
    public final iev0 n;

    public k0(roj0 roj0Var, lot0 lot0Var, w15 w15Var, g580 g580Var, f580 f580Var, vfx0 vfx0Var, q6c0 q6c0Var, l7s0 l7s0Var, com.yandex.go.zone.repository.o oVar, ru.yandex.taxi.summary.requirements.list.mapper.a aVar, dqe0 dqe0Var, tt2 tt2Var, j jVar, iev0 iev0Var) {
        this.a = roj0Var;
        this.b = lot0Var;
        this.c = w15Var;
        this.d = g580Var;
        this.e = f580Var;
        this.f = vfx0Var;
        this.g = q6c0Var;
        this.h = l7s0Var;
        this.i = oVar;
        this.j = aVar;
        this.k = dqe0Var;
        this.l = tt2Var;
        this.m = jVar;
        this.n = iev0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ca, code lost:
    
        if (r8.a().i(r9, 0) < r2.intValue()) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(k0 k0Var, String str, String str2, boolean z, int i) {
        Object obj;
        Iterable iterable;
        Object obj2;
        Object obj3;
        tlx0 tlx0Var;
        boolean z2;
        wu1 wu1Var;
        List list;
        wu1 wu1Var2;
        boolean z3;
        String str3 = (i & 2) != 0 ? null : str2;
        boolean z4 = (i & 4) != 0 ? true : z;
        Iterator it = k0Var.a.getRequirements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((lmw0) obj).getName(), str)) {
                break;
            }
        }
        lmw0 lmw0Var = (lmw0) obj;
        pex0 a = k0Var.a.a();
        if (a == null || (iterable = a.f) == null) {
            iterable = EmptyList.a;
        }
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj2;
            if (jl40.l(tariffInfoGroupDefinition.a, str) && tariffInfoGroupDefinition.c == TariffGroupDefinitionType.ITEM) {
                break;
            }
        }
        TariffInfoGroupDefinition tariffInfoGroupDefinition2 = (TariffInfoGroupDefinition) obj2;
        if (lmw0Var != null) {
            ArrayList arrayList = ((x8) k0Var.d).d;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (jl40.l(((b580) it3.next()).a, lmw0Var.getName())) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            gbj0 j = lmw0Var.j();
            if ((j != null ? j.a : null) != null && z3) {
                k0Var.k.a.K = null;
            }
        }
        if (lmw0Var == null) {
            xcv0 xcv0Var = ((f580) k0Var.g.b).c;
            xcv0Var.a.a("Summary.Requirements.RequirementGroup.Tapped", nnm.m(xcv0Var, "group_id", str), 1, new HashMap());
            if (tariffInfoGroupDefinition2 != null) {
                return str;
            }
            return null;
        }
        String name = lmw0Var.getName();
        boolean z5 = lmw0Var instanceof fmw0;
        Iterator it4 = ((x8) k0Var.d).d.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it4.next();
            if (jl40.l(((b580) obj3).a, name)) {
                break;
            }
        }
        b580 b580Var = (b580) obj3;
        boolean z6 = b580Var != null;
        kmw0 kmw0Var = lmw0Var instanceof kmw0 ? (kmw0) lmw0Var : null;
        tlx0 tlx0Var2 = kmw0Var != null ? kmw0Var.h : null;
        boolean z7 = tlx0Var2 != null;
        if (!z4) {
            tlx0Var = tlx0Var2;
        } else {
            if (!z7) {
                tlx0Var = tlx0Var2;
                roj0 roj0Var = k0Var.a;
                iev0 iev0Var = k0Var.n;
                SummaryAnalytics$RequirementTappedSource summaryAnalytics$RequirementTappedSource = SummaryAnalytics$RequirementTappedSource.List;
                String str4 = (b580Var == null || (list = b580Var.e) == null) ? null : (String) kotlin.collections.a.R(list);
                String b = roj0Var.b();
                String c = roj0Var.c();
                pex0 a2 = roj0Var.a();
                boolean z8 = z6;
                String a3 = (a2 == null || (wu1Var = a2.O) == null) ? null : wu1Var.a();
                z2 = z8;
                iev0Var.b(name, summaryAnalytics$RequirementTappedSource, z2, str4, null, b, c, a3);
                k0Var.e.a(z5, !z2, str3, name);
                if (!z2) {
                    List list2 = b580Var.e;
                    k0Var.d(name, null);
                    k0Var.e.a(z5, false, str3, name);
                    k0Var.e.e(name, list2, RequirementRemoveSource.LIST, k0Var.a.b());
                    return null;
                }
                tej0 d = lmw0Var.d();
                if (d != null) {
                    lot0 lot0Var = k0Var.b;
                    String str5 = d.a;
                    Integer num = d.b;
                    if (num == null) {
                        lot0Var.getClass();
                    }
                    if (z5) {
                        fmw0 fmw0Var = (fmw0) lmw0Var;
                        k0Var.d(name, gi.e(fmw0Var.a, fmw0Var.b));
                        return name;
                    }
                }
                if (!z7 || !k0Var.h.m(tlx0Var)) {
                    k0Var.c.getClass();
                    if (!lmw0Var.f()) {
                        if (z5) {
                            fmw0 fmw0Var2 = (fmw0) lmw0Var;
                            k0Var.d(name, gi.e(fmw0Var2.a, fmw0Var2.b));
                            return null;
                        }
                        jmw0 jmw0Var = lmw0Var instanceof jmw0 ? (jmw0) lmw0Var : null;
                        if (jmw0Var != null && jmw0Var.t()) {
                            jmw0 jmw0Var2 = (jmw0) lmw0Var;
                            k0Var.d(name, q5z.u(jmw0Var2, jmw0Var2.s().c));
                            return null;
                        }
                    }
                }
                return name;
            }
            iev0 iev0Var2 = k0Var.n;
            SummaryAnalytics$RequirementRedirectSource summaryAnalytics$RequirementRedirectSource = SummaryAnalytics$RequirementRedirectSource.List;
            String str6 = tlx0Var2.a;
            roj0 roj0Var2 = k0Var.a;
            String b2 = roj0Var2.b();
            String c2 = roj0Var2.c();
            pex0 a4 = roj0Var2.a();
            tlx0Var = tlx0Var2;
            iev0Var2.a(name, summaryAnalytics$RequirementRedirectSource, str6, null, b2, c2, (a4 == null || (wu1Var2 = a4.O) == null) ? null : wu1Var2.a());
        }
        z2 = z6;
        k0Var.e.a(z5, !z2, str3, name);
        if (!z2) {
        }
    }

    public final soj0 a(String str, boolean z) {
        Object obj;
        Iterable iterable;
        Object obj2;
        Object obj3;
        roj0 roj0Var = this.a;
        Iterator it = roj0Var.getRequirements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((lmw0) obj).getName(), str)) {
                break;
            }
        }
        lmw0 lmw0Var = (lmw0) obj;
        pex0 a = roj0Var.a();
        if (a == null || (iterable = a.f) == null) {
            iterable = EmptyList.a;
        }
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj2;
            if (jl40.l(tariffInfoGroupDefinition.a, str) && tariffInfoGroupDefinition.c == TariffGroupDefinitionType.ITEM) {
                break;
            }
        }
        TariffInfoGroupDefinition tariffInfoGroupDefinition2 = (TariffInfoGroupDefinition) obj2;
        if (lmw0Var != null) {
            String name = lmw0Var.getName();
            Iterator it3 = ((x8) this.d).d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (jl40.l(((b580) obj3).a, name)) {
                    break;
                }
            }
            boolean z2 = ((b580) obj3) != null;
            tej0 d = lmw0Var.d();
            if (d != null) {
                String str2 = d.a;
                Integer num = d.b;
                lot0 lot0Var = this.b;
                if (num == null) {
                    lot0Var.getClass();
                } else {
                    int i = lot0Var.a().i(str2, 0);
                    if (i < num.intValue()) {
                        lot0Var.a().p(i + 1, str2);
                    }
                }
                if (!z2 || z) {
                    return new soj0(null, null, null, d, 15);
                }
            }
            if (lmw0Var instanceof kmw0) {
                tlx0 tlx0Var = ((kmw0) lmw0Var).h;
                if (this.h.m(tlx0Var)) {
                    return new soj0(new upj0(tlx0Var), null, null, null, 30);
                }
            } else if (!(lmw0Var instanceof fmw0)) {
                boolean z3 = lmw0Var instanceof jmw0;
                if (!z3) {
                    w511.b();
                    return null;
                }
                this.c.getClass();
                if (lmw0Var.f()) {
                    return new soj0(new upj0(new tlx0(roj0Var.b(), name, null)), null, null, null, 28);
                }
                jmw0 jmw0Var = z3 ? (jmw0) lmw0Var : null;
                if (!(jmw0Var != null ? jmw0Var.t() : false)) {
                    return new soj0(null, (jmw0) lmw0Var, null, null, 27);
                }
            }
        } else if (tariffInfoGroupDefinition2 != null) {
            return new soj0(null, null, tariffInfoGroupDefinition2, null, 23);
        }
        return null;
    }

    public final tpr b() {
        tpr t = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.a.e(), new kotlinx.coroutines.flow.n(((x8) this.d).b, new SupportedRequirementsInteractor$requirementGroupInfoFlow$refreshRequirementsTrigger$1(2, null)), new SupportedRequirementsInteractor$requirementGroupInfoFlow$1(this, null)));
        this.l.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public final void d(String str, b580 b580Var) {
        g580 g580Var = this.d;
        if (b580Var != null) {
            String b = this.b.b(b580Var.a);
            if (b != null) {
                b580Var = b580.a(b580Var, null, null, b, 31);
            }
            ((x8) g580Var).c(b580Var, true);
        } else {
            ((x8) g580Var).d(str);
        }
        ((x8) g580Var).a();
    }

    public final void e(String str, String str2) {
        Object obj;
        Iterator it = this.a.getRequirements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((lmw0) obj).getName(), str)) {
                    break;
                }
            }
        }
        lmw0 lmw0Var = (lmw0) obj;
        if (lmw0Var instanceof fmw0) {
            fmw0 fmw0Var = (fmw0) lmw0Var;
            d(str, b580.a(gi.e(fmw0Var.a, fmw0Var.b), null, null, str2, 31));
        }
    }
}
