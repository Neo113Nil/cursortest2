package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.play_billing.b0;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.g0;
import com.google.android.gms.internal.play_billing.i0;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.x;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.analytics.b;
import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes8.dex */
public final class rfw0 implements i2u0, wi61, ce91 {
    public Object a;
    public final Object b;

    public rfw0(Context context, b0 b0Var) {
        eid eidVar = new eid();
        try {
            z811.b(context);
            eidVar.b = z811.a().c(d87.e).a("PLAY_BILLING_LIBRARY", new pzn("proto"), new ww01() { // from class: pe91
                @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                /* renamed from: apply */
                public final Object mo489apply(Object obj) {
                    return ((g0) obj).d();
                }
            });
        } catch (Throwable unused) {
            eidVar.a = true;
        }
        this.b = eidVar;
        this.a = b0Var;
    }

    @Override // defpackage.wi61
    public Object a() {
        return new ji61(((rl60) this.a).a, (sa81) ((fi61) this.b).a(), new vms(14));
    }

    @Override // defpackage.i2u0
    public h2u0 b(n951 n951Var) {
        h2u0 b;
        synchronized (this.b) {
            b = ((j2u0) this.a).b(n951Var);
        }
        return b;
    }

    public void c(int i, String str, String str2) {
        cne0 cne0Var = (cne0) this.b;
        if (i <= 0) {
            if (cne0Var.c(str)) {
                cne0Var.w(str);
                return;
            }
            return;
        }
        if (str2.length() == 0) {
            return;
        }
        List m = cne0Var.m(str, ShimmerDivHandler.NUMBER_SING);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (jl40.l(a.b0(arrayList), str2)) {
            return;
        }
        ListBuilder listBuilder = new ListBuilder(arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!jl40.l(str3, str2)) {
                listBuilder.add(str3);
            }
        }
        listBuilder.add(str2);
        cne0Var.s(str, ShimmerDivHandler.NUMBER_SING, a.B0(i, listBuilder.j()));
    }

    public boolean d(n951 n951Var) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = ((j2u0) this.a).a.containsKey(n951Var);
        }
        return containsKey;
    }

    public void e() {
        cne0 cne0Var;
        if (((cne0) this.b).f("zone_names_migrated")) {
            return;
        }
        synchronized (this) {
            if (((cne0) this.b).f("zone_names_migrated")) {
                return;
            }
            List g = scc.g("lzu", "yuu", "cou", "dou", "viu", "o8u", "r2u", "LastZoneNamesRepository");
            try {
                try {
                    Iterator it = g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List m = ((dne0) this.a).a((String) it.next()).m("LAST_ZONE_NAMES", ",");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : m) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            ((cne0) this.b).s("zone_names", ShimmerDivHandler.NUMBER_SING, arrayList);
                            break;
                        }
                    }
                    Iterator it2 = g.iterator();
                    while (it2.hasNext()) {
                        ((dne0) this.a).a.deleteSharedPreferences((String) it2.next());
                    }
                    cne0Var = (cne0) this.b;
                } catch (Exception e) {
                    jst.e.i("ZoneAnticrisisRepository", e);
                    cne0Var = (cne0) this.b;
                }
                cne0Var.u("zone_names_migrated", true);
            } catch (Throwable th) {
                ((cne0) this.b).u("zone_names_migrated", true);
                throw th;
            }
        }
    }

    public View f(int i, int i2, int i3, int i4) {
        gp31 gp31Var = (gp31) this.b;
        hp31 hp31Var = (hp31) this.a;
        int a = hp31Var.a();
        int b = hp31Var.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View c = hp31Var.c(i);
            int d = hp31Var.d(c);
            int e = hp31Var.e(c);
            gp31Var.b = a;
            gp31Var.c = b;
            gp31Var.d = d;
            gp31Var.e = e;
            if (i3 != 0) {
                gp31Var.a = i3;
                if (gp31Var.a()) {
                    return c;
                }
            }
            if (i4 != 0) {
                gp31Var.a = i4;
                if (gp31Var.a()) {
                    view = c;
                }
            }
            i += i5;
        }
        return view;
    }

    public List g(int i, String str) {
        if (i <= 0) {
            return EmptyList.a;
        }
        List m = ((cne0) this.b).m(str, ShimmerDivHandler.NUMBER_SING);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() <= i ? arrayList : a.B0(i, arrayList);
    }

    public boolean h(ZoneVertical zoneVertical, ybl0 ybl0Var, String str) {
        VerticalSelectorOnSummaryExperiment verticalSelectorOnSummaryExperiment;
        kcz0 kcz0Var;
        String str2 = zoneVertical.a;
        Zone b = ((cg31) this.b).a.b();
        if (b != null) {
            VerticalSelectorOnSummaryExperiment.Companion.getClass();
            qn11 qn11Var = VerticalSelectorOnSummaryExperiment.g;
            qn11 b2 = b.b(VerticalSelectorOnSummaryExperiment.class);
            if (b2 != null) {
                qn11Var = b2;
            }
            verticalSelectorOnSummaryExperiment = (VerticalSelectorOnSummaryExperiment) qn11Var;
        } else {
            verticalSelectorOnSummaryExperiment = null;
        }
        if (verticalSelectorOnSummaryExperiment == null || !cg31.a(verticalSelectorOnSummaryExperiment, str2) || !verticalSelectorOnSummaryExperiment.e) {
            return false;
        }
        if (ybl0Var != null) {
            bcl0 bcl0Var = ybl0Var.m;
            if (bcl0Var != null) {
                List list = bcl0Var.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((fq40) it.next()).a);
                }
                r2 = new nzr(arrayList, bcl0Var.g.a.a);
            }
            List list2 = ybl0Var.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((VerticalTariffDto) it2.next()).a);
            }
            kcz0Var = new kcz0(r2, arrayList2);
        } else {
            ZoneVerticalMulticlass zoneVerticalMulticlass = zoneVertical.l;
            r2 = zoneVerticalMulticlass != null ? new nzr(zoneVerticalMulticlass.b, zoneVerticalMulticlass.f.a.a) : null;
            List list3 = zoneVertical.f;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((VerticalTariffDto) it3.next()).a);
            }
            kcz0Var = new kcz0(r2, arrayList3);
        }
        b bVar = (b) this.a;
        nzr n = kcz0Var.n();
        if (n == null) {
            bVar.b("Summary.VerticalMultiSelector.DefaultMulticlassNotFound", g8e.z("zone", str));
            return false;
        }
        List o = kcz0Var.o();
        List d = n.d();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : d) {
            if (((ArrayList) o).contains((String) obj)) {
                arrayList4.add(obj);
            }
        }
        int size = arrayList4.size();
        int b3 = n.b();
        if (size < b3) {
            bVar.b("Summary.VerticalMultiSelector.NotEnoughTariffs", kotlin.collections.b.i(new Pair("zone", str), new Pair("valid_tariffs_count", Integer.valueOf(size)), new Pair("min_tariffs_count", Integer.valueOf(b3))));
            return false;
        }
        List d2 = n.d();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : o) {
            String str3 = (String) obj2;
            List list4 = d2;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    if (jl40.l((String) it4.next(), str3)) {
                        break;
                    }
                }
            }
            arrayList5.add(obj2);
        }
        if (arrayList5.isEmpty()) {
            return true;
        }
        bVar.b("Summary.VerticalMultiSelector.NotListedTariffsFound", kotlin.collections.b.i(new Pair("zone", str), new Pair("not_listed_tariffs", arrayList5)));
        return true;
    }

    public boolean i(View view) {
        gp31 gp31Var = (gp31) this.b;
        hp31 hp31Var = (hp31) this.a;
        int a = hp31Var.a();
        int b = hp31Var.b();
        int d = hp31Var.d(view);
        int e = hp31Var.e(view);
        gp31Var.b = a;
        gp31Var.c = b;
        gp31Var.d = d;
        gp31Var.e = e;
        gp31Var.a = 24579;
        return gp31Var.a();
    }

    public void j(w wVar) {
        if (wVar == null) {
            return;
        }
        try {
            bua1 x = g0.x();
            x.f((b0) this.a);
            x.e();
            g0.r((g0) x.b, wVar);
            ((eid) this.b).m((g0) x.d());
        } catch (Throwable unused) {
            g.h("BillingLogger");
        }
    }

    public void k(w wVar, int i) {
        try {
            iqa1 iqa1Var = (iqa1) ((b0) this.a).j();
            iqa1Var.e();
            b0.r((b0) iqa1Var.b, i);
            this.a = (b0) iqa1Var.d();
            j(wVar);
        } catch (Throwable unused) {
            g.h("BillingLogger");
        }
    }

    public void l(x xVar) {
        if (xVar == null) {
            return;
        }
        try {
            bua1 x = g0.x();
            x.f((b0) this.a);
            x.e();
            g0.s((g0) x.b, xVar);
            ((eid) this.b).m((g0) x.d());
        } catch (Throwable unused) {
            g.h("BillingLogger");
        }
    }

    public void m(i0 i0Var) {
        try {
            eid eidVar = (eid) this.b;
            bua1 x = g0.x();
            x.f((b0) this.a);
            x.e();
            g0.v((g0) x.b, i0Var);
            eidVar.m((g0) x.d());
        } catch (Throwable unused) {
            g.h("BillingLogger");
        }
    }

    @Override // defpackage.i2u0
    public h2u0 a(n951 n951Var) {
        h2u0 a;
        synchronized (this.b) {
            a = ((j2u0) this.a).a(n951Var);
        }
        return a;
    }

    public rfw0(Context context) {
        com.google.android.gms.internal.appset.b bVar;
        this.a = new tbb1(context, com.google.android.gms.common.b.b);
        synchronized (com.google.android.gms.internal.appset.b.class) {
            try {
                if (com.google.android.gms.internal.appset.b.c == null) {
                    com.google.android.gms.internal.appset.b.c = new com.google.android.gms.internal.appset.b(context.getApplicationContext());
                }
                bVar = com.google.android.gms.internal.appset.b.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = bVar;
    }

    public /* synthetic */ rfw0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rfw0(rl60 rl60Var, fi61 fi61Var, ums umsVar) {
        this.a = rl60Var;
        this.b = fi61Var;
    }

    public rfw0(m8b1 m8b1Var) {
        this.b = m8b1Var;
    }

    public rfw0(ppr pprVar) {
        this.a = pprVar;
        this.b = new ThreadLocal();
    }

    public rfw0(dne0 dne0Var) {
        this.a = dne0Var;
        this.b = dne0Var.a("com.yandex.go.zone.repository.ZoneAnticrisisRepository");
    }

    public rfw0(j2u0 j2u0Var) {
        this.a = j2u0Var;
        this.b = new Object();
    }

    public rfw0(hp31 hp31Var) {
        this.a = hp31Var;
        gp31 gp31Var = new gp31();
        gp31Var.a = 0;
        this.b = gp31Var;
    }

    public rfw0() {
        this.a = bvf0.c(Boolean.FALSE);
        this.b = ffx.c(0, 0, null, 7);
    }
}
