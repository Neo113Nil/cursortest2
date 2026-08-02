package defpackage;

import android.location.Location;
import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.go.due.experiment.MulticlassPreorderExperiment;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.maas.impl.ride.c;
import ru.yandex.taxi.net.taxi.dto.request.SupportedFeature;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class t7j0 {
    public final zuj0 a;
    public final cpw0 b;
    public final bko c;
    public final xox0 d;
    public final au50 e;
    public final dmw0 f;
    public final vo40 g;
    public final am2 h;
    public final nlw0 i;

    public t7j0(zuj0 zuj0Var, cpw0 cpw0Var, bko bkoVar, xox0 xox0Var, au50 au50Var, dmw0 dmw0Var, vo40 vo40Var, am2 am2Var, nlw0 nlw0Var) {
        this.a = zuj0Var;
        this.b = cpw0Var;
        this.c = bkoVar;
        this.d = xox0Var;
        this.e = au50Var;
        this.f = dmw0Var;
        this.g = vo40Var;
        this.h = am2Var;
        this.i = nlw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lbl0 a(kb5 kb5Var, bbl0 bbl0Var, RouteStatsMode routeStatsMode, boolean z, boolean z2) {
        Object obj;
        boolean z3;
        zzs zzsVar;
        amw0 amw0Var;
        VerticalSelectorOnSummaryExperiment verticalSelectorOnSummaryExperiment;
        boolean z4;
        int i;
        Boolean bool;
        dbl0 dbl0Var;
        fnx0 n;
        Iterator it;
        int i2;
        String str;
        String type;
        List list = bbl0Var.i;
        gqe0 gqe0Var = bbl0Var.g;
        w3l0 w3l0Var = bbl0Var.c;
        Zone zone = bbl0Var.b;
        List list2 = bbl0Var.d;
        vo40 vo40Var = this.g;
        vo40Var.getClass();
        List list3 = list;
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (jl40.l(((gf31) obj).c(), kb5Var.a)) {
                break;
            }
        }
        gf31 gf31Var = (gf31) obj;
        boolean z5 = kb5Var.e;
        List e = vo40Var.b.e(zone, new kb5(kb5Var.a, kb5Var.b, (wu1) null, kb5Var.d, z5, kb5Var.f), list2);
        Set b = gf31Var != null ? gf31Var.b() : null;
        if (b == null) {
            b = EmptySet.a;
        }
        RequirementsParam.Companion.getClass();
        RequirementsParam a = rpj0.a(null, e);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (((gf31) obj2).c().length() > 0) {
                arrayList.add(obj2);
            }
        }
        ip40 ip40Var = new ip40(b, a, arrayList, z5);
        String str2 = bbl0Var.a;
        String str3 = zone.a;
        String str4 = kb5Var.b;
        this.c.getClass();
        List list4 = w3l0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Address) it3.next()).B());
        }
        rpj0 rpj0Var = RequirementsParam.Companion;
        String str5 = bbl0Var.f;
        rpj0Var.getClass();
        RequirementsParam a2 = rpj0.a(str5, list2);
        List list5 = bbl0Var.e;
        Calendar calendar = gqe0Var.a;
        String str6 = gqe0Var.c;
        String str7 = gqe0Var.b;
        boolean z6 = gqe0Var.d;
        Calendar calendar2 = gqe0Var.e;
        rfa0 rfa0Var = bbl0Var.h.a;
        int j = ((avj0) this.a).j();
        Boolean bool2 = bbl0Var.k;
        int i3 = s7j0.a[routeStatsMode.ordinal()];
        if (i3 == 1) {
            z3 = false;
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            z3 = true;
        }
        jsq0 jsq0Var = uj31.a;
        List list6 = zone.w;
        ArrayList arrayList3 = new ArrayList(tcc.n(list6, 10));
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((ZoneVertical) it4.next()).a);
        }
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        List list7 = w3l0Var.b;
        am2 am2Var = this.h;
        am2Var.getClass();
        int size = list7.size();
        ArrayList arrayList5 = new ArrayList(list7.size());
        Iterator it5 = list7.iterator();
        int i4 = 0;
        while (it5.hasNext()) {
            Address address = (Address) it5.next();
            String c2 = address.c2();
            int i5 = i4 + 1;
            if (i4 == 0) {
                str = RoutePointType.POINT_A.getType();
                it = it5;
                i2 = size;
            } else {
                it = it5;
                if (i4 == size - 1) {
                    i2 = size;
                    type = RoutePointType.POINT_B.getType();
                    i4 = 0;
                    arrayList5.add(new a13(c2, type, q5z.L(address), address.J1(), address.B(), (String) null, (String) null, (String) null, 224));
                    it5 = it;
                    size = i2;
                } else {
                    i2 = size;
                    str = RoutePointType.POINT_MID.getType() + i4;
                }
            }
            type = str;
            i4 = i5;
            arrayList5.add(new a13(c2, type, q5z.L(address), address.J1(), address.B(), (String) null, (String) null, (String) null, 224));
            it5 = it;
            size = i2;
        }
        c cVar = (c) am2Var.b;
        yqv0 a3 = ((a7t0) cVar.a).a();
        String str8 = (a3.a == SummaryUiState$Type.TRAP && jl40.l(a3.b, cVar.d)) ? "maas" : "";
        if (str8.length() > 0) {
            arrayList5.add(new a13((String) null, str8, (String) null, (String) null, (zzs) null, (String) null, (String) null, (String) null, 253));
        }
        Location a4 = ((acz) am2Var.a).a();
        if (a4 != null) {
            zzs.Companion.getClass();
            zzsVar = uzs.b(a4);
        } else {
            zzsVar = null;
        }
        v03 v03Var = new v03(zzsVar, arrayList5, ((dhe0) am2Var.c).a());
        dmw0 dmw0Var = this.f;
        dmw0Var.getClass();
        ListBuilder a5 = rcc.a();
        a5.add(new bmw0(SupportedOptionType.VERTICALS_MULTICLASS, null));
        List list8 = zone.k;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list8) {
            v03 v03Var2 = v03Var;
            if (TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY.equals(((ZoneTariffInfo) obj3).E)) {
                arrayList6.add(obj3);
            }
            v03Var = v03Var2;
        }
        v03 v03Var3 = v03Var;
        ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((ZoneTariffInfo) it6.next()).e);
        }
        if (!arrayList7.isEmpty()) {
            a5.add(new bmw0(SupportedOptionType.ORDER_FLOW_DELIVERY, new amw0(arrayList7)));
        }
        if (((hqj0) dmw0Var.a).b().b) {
            amw0Var = null;
            a5.add(new bmw0(SupportedOptionType.REQUIREMENT_V2, null));
        } else {
            amw0Var = null;
        }
        a5.add(new bmw0(SupportedOptionType.PLUS_CASH_BACK_PROMO, amw0Var));
        a5.add(new bmw0(SupportedOptionType.MULTICLASS_REQUIREMENTS, amw0Var));
        Zone b2 = ((cg31) dmw0Var.b).a.b();
        if (b2 != null) {
            VerticalSelectorOnSummaryExperiment.Companion.getClass();
            qn11 qn11Var = VerticalSelectorOnSummaryExperiment.g;
            qn11 b3 = b2.b(VerticalSelectorOnSummaryExperiment.class);
            if (b3 != null) {
                qn11Var = b3;
            }
            verticalSelectorOnSummaryExperiment = (VerticalSelectorOnSummaryExperiment) qn11Var;
        } else {
            verticalSelectorOnSummaryExperiment = null;
        }
        if (verticalSelectorOnSummaryExperiment != null && verticalSelectorOnSummaryExperiment.b) {
            a5.add(new bmw0(SupportedOptionType.VERTICAL_SUMMARY, null));
        }
        if (((MulticlassPreorderExperiment) ((pp40) dmw0Var.c).a.b()).getB()) {
            a5.add(new bmw0(SupportedOptionType.MULTICLASS_PREORDER, null));
        }
        ListBuilder j2 = a5.j();
        i270 i270Var = (i270) this.e.b;
        b bVar = i270Var.c + 5000 <= System.currentTimeMillis() ? null : i270Var.b;
        i270Var.b = null;
        i270Var.c = 0L;
        if (bVar == null) {
            bVar = new kotlinx.serialization.json.c(kotlin.collections.b.f());
        }
        if (bVar instanceof kotlinx.serialization.json.c) {
            Map map = (Map) bVar;
            if (!map.containsKey("by_classes")) {
                bVar = new kotlinx.serialization.json.c(kotlin.collections.b.o(map, new Pair("by_classes", new a(EmptyList.a))));
            }
        }
        b bVar2 = bVar;
        boolean z7 = this.b.a;
        nlw0 nlw0Var = this.i;
        nlw0Var.getClass();
        ListBuilder a6 = rcc.a();
        a6.add(new SupportedFeature(SupportedFeature.Type.ORDER_BUTTON_ACTIONS, Collections.singletonList(Constants.DEEPLINK)));
        if (nlw0Var.a.c() == SummaryUiDelegate$TariffCardStyle.HIGH) {
            a6.add(new SupportedFeature(SupportedFeature.Type.SWAP_SUMMARY, Collections.singletonList("high_tariff_selector")));
        }
        ListBuilder j3 = a6.j();
        xox0 xox0Var = this.d;
        if (xox0Var.a.g() && (dbl0Var = (dbl0) xox0Var.b.b.getValue()) != null && dbl0Var.b == Screen.SUMMARY && (n = ((k) xox0Var.c).n()) != null) {
            SelectionOrigin selectionOrigin = n.b;
            if (selectionOrigin.getType() == SelectionOrigin.Type.USER || selectionOrigin == SelectionOrigin.DEEPLINK) {
                z4 = true;
                jni jniVar = bbl0Var.m;
                o9i o9iVar = new o9i(jniVar.a, z2, jniVar.b, new z4w(jniVar.c.a), jniVar.d, jniVar.e, jniVar.f);
                i = s7j0.a[routeStatsMode.ordinal()];
                if (i != 1) {
                    bool = Boolean.TRUE;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    bool = null;
                }
                return new lbl0(str2, str3, str4, null, arrayList2, a2, list5, calendar, str6, str7, z6, calendar2, rfa0Var, z, j, ip40Var, bool2, z3, jsq0Var, arrayList4, v03Var3, j2, bVar2, z7, j3, z4, o9iVar, bool, gqe0Var.f, true, true, "tml-0.1", Boolean.FALSE, true, 2, true, true, true, true, true, true, true, bbl0Var.p.getEventValue());
            }
        }
        z4 = false;
        jni jniVar2 = bbl0Var.m;
        o9i o9iVar2 = new o9i(jniVar2.a, z2, jniVar2.b, new z4w(jniVar2.c.a), jniVar2.d, jniVar2.e, jniVar2.f);
        i = s7j0.a[routeStatsMode.ordinal()];
        if (i != 1) {
        }
        return new lbl0(str2, str3, str4, null, arrayList2, a2, list5, calendar, str6, str7, z6, calendar2, rfa0Var, z, j, ip40Var, bool2, z3, jsq0Var, arrayList4, v03Var3, j2, bVar2, z7, j3, z4, o9iVar2, bool, gqe0Var.f, true, true, "tml-0.1", Boolean.FALSE, true, 2, true, true, true, true, true, true, true, bbl0Var.p.getEventValue());
    }
}
