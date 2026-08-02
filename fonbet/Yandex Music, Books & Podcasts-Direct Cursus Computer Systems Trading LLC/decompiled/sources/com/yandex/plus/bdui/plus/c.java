package com.yandex.plus.bdui.plus;

import android.net.Uri;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.content.controller.h;
import com.yandex.plus.bdui.s;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tf6;
import defpackage.uah;
import defpackage.v75;
import defpackage.z7o;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue;
        Object t7oVar;
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                m mVar = (m) obj2;
                ((s) obj).getClass();
                mVar.getClass();
                return new h(mVar, (com.yandex.plus.bdui.plus.auth.a) obj5, (tf6) obj4, (com.yandex.plus.log.api.b) obj3);
            case 1:
                com.yandex.plus.bdui.plus.checkout.div.c cVar = (com.yandex.plus.bdui.plus.checkout.div.c) obj5;
                Boolean bool = (Boolean) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                booleanValue = bool != null ? bool.booleanValue() : false;
                Set set = com.yandex.plus.bdui.plus.checkout.div.c.g;
                com.yandex.plus.log.api.b bVar = cVar.d;
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = Uri.parse(str2);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (!(t7oVar instanceof t7o)) {
                    Uri uri = (Uri) t7oVar;
                    if (booleanValue && CollectionsKt.I(set, uri.getScheme())) {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusPayDivKitDecoratedTextAdapter", ouj.k('\'', "Launching URL with native launcher: '", str2));
                        }
                        cVar.c.i(str2);
                    } else {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "PlusPayDivKitDecoratedTextAdapter", ouj.k('\'', "Dispatching action by URL: '", str2));
                        }
                        com.yandex.plus.bdui.plus.content.controller.d dVar = cVar.a;
                        String scheme = uri.getScheme();
                        if (scheme != null) {
                            if (set.contains(scheme)) {
                                Map e = uah.e(new Pair("text", str), new Pair("url", uri.toString()));
                                if (bVar.b(aVar2)) {
                                    bVar.c(aVar2, "PlusPayDivKitDecoratedTextAdapter", "Dispatching 'open_web_page' action for '" + uri + "' with payload " + e);
                                }
                                dVar.a(jSONObject, "open_web_page", "open_web_page", e);
                            } else if (com.yandex.plus.bdui.plus.checkout.div.c.h.contains(scheme)) {
                                List<String> pathSegments = uri.getPathSegments();
                                pathSegments.getClass();
                                String str3 = (String) CollectionsKt.Z(pathSegments);
                                if (str3 == null && (str3 = uri.getHost()) == null) {
                                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                                    if (bVar.b(aVar3)) {
                                        bVar.c(aVar3, "PlusPayDivKitDecoratedTextAdapter", "Invalid URI '" + uri + "': no path or host");
                                    }
                                } else {
                                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                                    queryParameterNames.getClass();
                                    ArrayList O = CollectionsKt.O(queryParameterNames);
                                    int a = tah.a(v75.o(O, 10));
                                    if (a < 16) {
                                        a = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                                    Iterator it = O.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        String queryParameter = uri.getQueryParameter((String) next);
                                        queryParameter.getClass();
                                        linkedHashMap.put(next, queryParameter);
                                    }
                                    LinkedHashMap i2 = uah.i(linkedHashMap, tah.b(new Pair("text", str)));
                                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                                    if (bVar.b(aVar4)) {
                                        bVar.c(aVar4, "PlusPayDivKitDecoratedTextAdapter", "Dispatching '" + str3 + "' action for '" + uri + "' with payload " + i2);
                                    }
                                    dVar.a(jSONObject, str3, str3, i2);
                                }
                            } else {
                                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar5)) {
                                    bVar.c(aVar5, "PlusPayDivKitDecoratedTextAdapter", "Unsupported scheme '" + uri.getScheme() + '\'');
                                }
                            }
                        }
                    }
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar6)) {
                        bVar.a(aVar6, "PlusPayDivKitDecoratedTextAdapter", ouj.k('\'', "Could not parse URI from '", str2), a2);
                    }
                }
                return Unit.a;
            case 2:
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) obj3;
                s sVar = (s) obj;
                m mVar2 = (m) obj2;
                sVar.getClass();
                mVar2.getClass();
                return new com.yandex.plus.bdui.plus.scaffold.controller.e(sVar, mVar2, (List) obj5, (tf6) obj4, bVar2);
            default:
                k kVar = (k) obj5;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar7 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                ((String) obj).getClass();
                str5.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b bVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b) kVar.o;
                bVar3.getClass();
                aVar7.getClass();
                str4.getClass();
                PlusPayCompositeOffers.Offer offer = aVar7.b.a;
                j c = aVar7.c();
                zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(c.a);
                String str6 = c.c;
                if (a3 != null) {
                    cdk cdkVar = bVar3.a;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar7.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    if (id == null) {
                        id = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it2 = optionOffers.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    if (str6 == null) {
                        str6 = "no_value";
                    }
                    booleanValue = c.f == i.b;
                    LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                    t.put("product_id", id);
                    dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
                    t.put("payment_option", a3.a);
                    t.put("payment_method_id", str6);
                    t.put("link", str4);
                    t.put("silent", String.valueOf(booleanValue));
                    t.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("PaymentProcess.ErrorScreen.SupportLink.Clicked", t);
                }
                kVar.p.i(str5);
                return Unit.a;
        }
    }
}
