package ru.yandex.taxi.summary.promotions.factory;

import com.adjust.sdk.Constants;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.DefaultOrderPopup;
import com.yandex.go.zone.dto.objects.DeliveryInsuranceModal;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.s6;
import com.yandex.go.zone.dto.objects.u2;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.a7t0;
import defpackage.abl0;
import defpackage.bg5;
import defpackage.c2k;
import defpackage.cda0;
import defpackage.ck31;
import defpackage.cot;
import defpackage.dnv0;
import defpackage.eja1;
import defpackage.h73;
import defpackage.jl40;
import defpackage.lng;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.omu0;
import defpackage.p9t0;
import defpackage.pf10;
import defpackage.rfa0;
import defpackage.scc;
import defpackage.ulv0;
import defpackage.vkv0;
import defpackage.w03;
import defpackage.w511;
import defpackage.wwg;
import defpackage.xv11;
import defpackage.yal0;
import defpackage.ymv0;
import defpackage.yqv0;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.maas.impl.ride.c;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;
import ru.yandex.taxi.summary.promotions.models.i;

/* loaded from: classes10.dex */
public final class a {
    public static final List k = scc.g("dialogue", "modal_window");
    public static final List l = Collections.singletonList(new SummaryPromotionsParam.a.C0117a("promoblock", scc.g("deeplink_arrow_button", "attributed_text", "drive_arrow_button", "actions_arrow_button", "toggle"), scc.g("select_alt_offer", "share_route_button", Constants.DEEPLINK, "tariff_redirect", "offer_substitution")));
    public final ru.yandex.taxi.promotions.factory.a a;
    public final o b;
    public final ck31 c;
    public final lng d;
    public final cot e;
    public final vkv0 f;
    public final ulv0 g;
    public final f0 h;
    public final xv11 i;
    public final bg5 j;

    public a(ru.yandex.taxi.promotions.factory.a aVar, o oVar, ck31 ck31Var, lng lngVar, cot cotVar, vkv0 vkv0Var, ulv0 ulv0Var, f0 f0Var, xv11 xv11Var, bg5 bg5Var) {
        this.a = aVar;
        this.b = oVar;
        this.c = ck31Var;
        this.d = lngVar;
        this.e = cotVar;
        this.f = vkv0Var;
        this.g = ulv0Var;
        this.h = f0Var;
        this.i = xv11Var;
        this.j = bg5Var;
    }

    public static ymv0 b(String str, String str2) {
        if (str != null) {
            return new ymv0(str, str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yal0 yal0Var, ContinuationImpl continuationImpl) {
        SummaryPromotionsParamFactory$create$1 summaryPromotionsParamFactory$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Zone g;
        List singletonList;
        SummaryPromotionsParam.c cVar;
        Iterator it;
        Pair pair;
        Pair pair2;
        SummaryPromotionsParam.a aVar;
        pf10 pf10Var;
        rfa0 f;
        Object b;
        SummaryPromotionsParam.c cVar2;
        String str;
        w03 w03Var;
        Object a;
        String str2;
        String str3;
        pf10 pf10Var2;
        w03 w03Var2;
        if (continuationImpl instanceof SummaryPromotionsParamFactory$create$1) {
            summaryPromotionsParamFactory$create$1 = (SummaryPromotionsParamFactory$create$1) continuationImpl;
            int i2 = summaryPromotionsParamFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsParamFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsParamFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsParamFactory$create$1.label;
                xv11 xv11Var = this.i;
                Pair pair3 = null;
                if (i != 0) {
                    b.b(obj);
                    g = this.b.g();
                    if (g == null) {
                        return SummaryPromotionsParam.k;
                    }
                    c cVar3 = this.f.a;
                    yqv0 a2 = ((a7t0) cVar3.a).a();
                    int i3 = dnv0.a[(((a2.a != SummaryUiState$Type.TRAP || !jl40.l(a2.b, cVar3.d)) ? "" : "maas").length() > 0 ? SummaryPromotionsParam.Type.MAAS : SummaryPromotionsParam.Type.UNKNOWN).ordinal()];
                    ?? r11 = EmptyList.a;
                    if (i3 == 1) {
                        singletonList = Collections.singletonList(new i(SummaryPromotionsParam.Type.MAAS));
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        singletonList = r11;
                    }
                    c2k c2kVar = new c2k(new yw01(eja1.d("", ((k) this.c).j().a), new omu0(23)).iterator(), new abl0(17));
                    if (c2kVar.hasNext()) {
                        Object next = c2kVar.next();
                        if (c2kVar.hasNext()) {
                            r11 = new ArrayList();
                            r11.add(next);
                            while (c2kVar.hasNext()) {
                                r11.add(c2kVar.next());
                            }
                        } else {
                            r11 = Collections.singletonList(next);
                        }
                    }
                    List list = r11;
                    kotlinx.serialization.json.b bVar = yal0Var.m;
                    Alternatives alternatives = yal0Var.e;
                    Set u = alternatives == null ? EmptySet.a : kotlin.sequences.b.u(kotlin.sequences.b.k(new h73(1, alternatives.a), new p9t0(25, this)));
                    ulv0 ulv0Var = this.g;
                    ulv0Var.getClass();
                    List list2 = yal0Var.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ServiceLevel serviceLevel = (ServiceLevel) it2.next();
                        u2 u2Var = serviceLevel.C.f;
                        if (u2Var instanceof BulletsOrderPopup) {
                            String str4 = serviceLevel.f;
                            BulletsOrderPopup.ShowPolicy f2 = ((BulletsOrderPopup) u2Var).getF();
                            pair = pair3;
                            it = it2;
                            pair2 = new Pair(str4, Collections.singletonList(new SummaryPromotionsParam.b(f2.getA(), ulv0Var.a.a(f2.getB(), f2.getA(), false, f2.getD()) ? pair : Boolean.TRUE)));
                        } else {
                            it = it2;
                            pair = pair3;
                            if (!(u2Var instanceof DefaultOrderPopup) && !(u2Var instanceof DeliveryInsuranceModal) && !jl40.l(u2Var, s6.INSTANCE)) {
                                w511.b();
                                return pair;
                            }
                            pair2 = pair;
                        }
                        if (pair2 != null) {
                            arrayList.add(pair2);
                        }
                        it2 = it;
                        pair3 = pair;
                    }
                    Pair pair4 = pair3;
                    SummaryPromotionsParam.c cVar4 = new SummaryPromotionsParam.c(list, singletonList, bVar, u, kotlin.collections.b.s(arrayList));
                    summaryPromotionsParamFactory$create$1.L$0 = pair4;
                    summaryPromotionsParamFactory$create$1.L$1 = g;
                    summaryPromotionsParamFactory$create$1.L$2 = pair4;
                    summaryPromotionsParamFactory$create$1.L$3 = pair4;
                    summaryPromotionsParamFactory$create$1.L$4 = cVar4;
                    summaryPromotionsParamFactory$create$1.label = 1;
                    obj = this.a.b(summaryPromotionsParamFactory$create$1);
                    if (obj != coroutineSingletons) {
                        cVar = cVar4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str5 = (String) summaryPromotionsParamFactory$create$1.L$16;
                        String str6 = (String) summaryPromotionsParamFactory$create$1.L$15;
                        f = (rfa0) summaryPromotionsParamFactory$create$1.L$14;
                        pf10 pf10Var3 = (pf10) summaryPromotionsParamFactory$create$1.L$13;
                        aVar = (SummaryPromotionsParam.a) summaryPromotionsParamFactory$create$1.L$12;
                        w03 w03Var3 = (w03) summaryPromotionsParamFactory$create$1.L$11;
                        cVar2 = (SummaryPromotionsParam.c) summaryPromotionsParamFactory$create$1.L$10;
                        b.b(obj);
                        str3 = str5;
                        str2 = str6;
                        pf10Var2 = pf10Var3;
                        w03Var2 = w03Var3;
                        rfa0 rfa0Var = f;
                        SummaryPromotionsParam.a aVar2 = aVar;
                        SummaryPromotionsParam.c cVar5 = cVar2;
                        bg5 bg5Var = this.j;
                        return new SummaryPromotionsParam(cVar5, w03Var2, aVar2, pf10Var2, rfa0Var, str2, str3, (String) obj, new Integer(bg5Var.b()), bg5Var.c().getTitle());
                    }
                    str = (String) summaryPromotionsParamFactory$create$1.L$15;
                    f = (rfa0) summaryPromotionsParamFactory$create$1.L$14;
                    pf10Var = (pf10) summaryPromotionsParamFactory$create$1.L$13;
                    SummaryPromotionsParam.a aVar3 = (SummaryPromotionsParam.a) summaryPromotionsParamFactory$create$1.L$12;
                    w03Var = (w03) summaryPromotionsParamFactory$create$1.L$11;
                    SummaryPromotionsParam.c cVar6 = (SummaryPromotionsParam.c) summaryPromotionsParamFactory$create$1.L$10;
                    b.b(obj);
                    aVar = aVar3;
                    cVar2 = cVar6;
                    String str7 = (String) obj;
                    summaryPromotionsParamFactory$create$1.L$0 = null;
                    summaryPromotionsParamFactory$create$1.L$1 = null;
                    summaryPromotionsParamFactory$create$1.L$2 = null;
                    summaryPromotionsParamFactory$create$1.L$3 = null;
                    summaryPromotionsParamFactory$create$1.L$4 = null;
                    summaryPromotionsParamFactory$create$1.L$5 = null;
                    summaryPromotionsParamFactory$create$1.L$6 = null;
                    summaryPromotionsParamFactory$create$1.L$7 = null;
                    summaryPromotionsParamFactory$create$1.L$8 = null;
                    summaryPromotionsParamFactory$create$1.L$9 = null;
                    summaryPromotionsParamFactory$create$1.L$10 = cVar2;
                    summaryPromotionsParamFactory$create$1.L$11 = w03Var;
                    summaryPromotionsParamFactory$create$1.L$12 = aVar;
                    summaryPromotionsParamFactory$create$1.L$13 = pf10Var;
                    summaryPromotionsParamFactory$create$1.L$14 = f;
                    summaryPromotionsParamFactory$create$1.L$15 = str;
                    summaryPromotionsParamFactory$create$1.L$16 = str7;
                    summaryPromotionsParamFactory$create$1.label = 3;
                    a = ((com.yandex.go.ultima_mode.domain.c) xv11Var).a(summaryPromotionsParamFactory$create$1);
                    if (a != coroutineSingletons) {
                        str2 = str;
                        str3 = str7;
                        obj = a;
                        pf10Var2 = pf10Var;
                        w03Var2 = w03Var;
                        rfa0 rfa0Var2 = f;
                        SummaryPromotionsParam.a aVar22 = aVar;
                        SummaryPromotionsParam.c cVar52 = cVar2;
                        bg5 bg5Var2 = this.j;
                        return new SummaryPromotionsParam(cVar52, w03Var2, aVar22, pf10Var2, rfa0Var2, str2, str3, (String) obj, new Integer(bg5Var2.b()), bg5Var2.c().getTitle());
                    }
                    return coroutineSingletons;
                }
                cVar = (SummaryPromotionsParam.c) summaryPromotionsParamFactory$create$1.L$4;
                g = (Zone) summaryPromotionsParamFactory$create$1.L$1;
                b.b(obj);
                w03 w03Var4 = (w03) obj;
                lng lngVar = this.d;
                aVar = new SummaryPromotionsParam.a(k, l, ((Number) lngVar.c.getValue()).floatValue(), ((Number) lngVar.d.getValue()).floatValue());
                pf10Var = new pf10(ofp0.c, ofp0.b, ofp0.a);
                f = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) this.e.b)).f(g);
                String eventValue = wwg.d(this.h.a.Ig()).getEventValue();
                summaryPromotionsParamFactory$create$1.L$0 = null;
                summaryPromotionsParamFactory$create$1.L$1 = null;
                summaryPromotionsParamFactory$create$1.L$2 = null;
                summaryPromotionsParamFactory$create$1.L$3 = null;
                summaryPromotionsParamFactory$create$1.L$4 = null;
                summaryPromotionsParamFactory$create$1.L$5 = null;
                summaryPromotionsParamFactory$create$1.L$6 = null;
                summaryPromotionsParamFactory$create$1.L$7 = null;
                summaryPromotionsParamFactory$create$1.L$8 = null;
                summaryPromotionsParamFactory$create$1.L$9 = null;
                summaryPromotionsParamFactory$create$1.L$10 = cVar;
                summaryPromotionsParamFactory$create$1.L$11 = w03Var4;
                summaryPromotionsParamFactory$create$1.L$12 = aVar;
                summaryPromotionsParamFactory$create$1.L$13 = pf10Var;
                summaryPromotionsParamFactory$create$1.L$14 = f;
                summaryPromotionsParamFactory$create$1.L$15 = eventValue;
                summaryPromotionsParamFactory$create$1.label = 2;
                b = ((com.yandex.go.ultima_mode.domain.c) xv11Var).b(summaryPromotionsParamFactory$create$1);
                if (b != coroutineSingletons) {
                    cVar2 = cVar;
                    str = eventValue;
                    w03Var = w03Var4;
                    obj = b;
                    String str72 = (String) obj;
                    summaryPromotionsParamFactory$create$1.L$0 = null;
                    summaryPromotionsParamFactory$create$1.L$1 = null;
                    summaryPromotionsParamFactory$create$1.L$2 = null;
                    summaryPromotionsParamFactory$create$1.L$3 = null;
                    summaryPromotionsParamFactory$create$1.L$4 = null;
                    summaryPromotionsParamFactory$create$1.L$5 = null;
                    summaryPromotionsParamFactory$create$1.L$6 = null;
                    summaryPromotionsParamFactory$create$1.L$7 = null;
                    summaryPromotionsParamFactory$create$1.L$8 = null;
                    summaryPromotionsParamFactory$create$1.L$9 = null;
                    summaryPromotionsParamFactory$create$1.L$10 = cVar2;
                    summaryPromotionsParamFactory$create$1.L$11 = w03Var;
                    summaryPromotionsParamFactory$create$1.L$12 = aVar;
                    summaryPromotionsParamFactory$create$1.L$13 = pf10Var;
                    summaryPromotionsParamFactory$create$1.L$14 = f;
                    summaryPromotionsParamFactory$create$1.L$15 = str;
                    summaryPromotionsParamFactory$create$1.L$16 = str72;
                    summaryPromotionsParamFactory$create$1.label = 3;
                    a = ((com.yandex.go.ultima_mode.domain.c) xv11Var).a(summaryPromotionsParamFactory$create$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        summaryPromotionsParamFactory$create$1 = new SummaryPromotionsParamFactory$create$1(this, continuationImpl);
        Object obj2 = summaryPromotionsParamFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsParamFactory$create$1.label;
        xv11 xv11Var2 = this.i;
        Pair pair32 = null;
        if (i != 0) {
        }
        w03 w03Var42 = (w03) obj2;
        lng lngVar2 = this.d;
        aVar = new SummaryPromotionsParam.a(k, l, ((Number) lngVar2.c.getValue()).floatValue(), ((Number) lngVar2.d.getValue()).floatValue());
        pf10Var = new pf10(ofp0.c, ofp0.b, ofp0.a);
        f = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) this.e.b)).f(g);
        String eventValue2 = wwg.d(this.h.a.Ig()).getEventValue();
        summaryPromotionsParamFactory$create$1.L$0 = null;
        summaryPromotionsParamFactory$create$1.L$1 = null;
        summaryPromotionsParamFactory$create$1.L$2 = null;
        summaryPromotionsParamFactory$create$1.L$3 = null;
        summaryPromotionsParamFactory$create$1.L$4 = null;
        summaryPromotionsParamFactory$create$1.L$5 = null;
        summaryPromotionsParamFactory$create$1.L$6 = null;
        summaryPromotionsParamFactory$create$1.L$7 = null;
        summaryPromotionsParamFactory$create$1.L$8 = null;
        summaryPromotionsParamFactory$create$1.L$9 = null;
        summaryPromotionsParamFactory$create$1.L$10 = cVar;
        summaryPromotionsParamFactory$create$1.L$11 = w03Var42;
        summaryPromotionsParamFactory$create$1.L$12 = aVar;
        summaryPromotionsParamFactory$create$1.L$13 = pf10Var;
        summaryPromotionsParamFactory$create$1.L$14 = f;
        summaryPromotionsParamFactory$create$1.L$15 = eventValue2;
        summaryPromotionsParamFactory$create$1.label = 2;
        b = ((com.yandex.go.ultima_mode.domain.c) xv11Var2).b(summaryPromotionsParamFactory$create$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
