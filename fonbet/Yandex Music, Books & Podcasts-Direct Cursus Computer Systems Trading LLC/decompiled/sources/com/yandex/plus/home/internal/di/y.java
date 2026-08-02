package com.yandex.plus.home.internal.di;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g6;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.gld;
import defpackage.hac;
import defpackage.i5f;
import defpackage.ihp;
import defpackage.jyr;
import defpackage.lhc;
import defpackage.ltm;
import defpackage.mxr;
import defpackage.my1;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.ox6;
import defpackage.p5b;
import defpackage.qgg;
import defpackage.rz2;
import defpackage.t75;
import defpackage.tf6;
import defpackage.uah;
import defpackage.uz2;
import defpackage.v75;
import defpackage.wz0;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z7o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class y implements com.yandex.plus.home.feature.panel.internalapi.b, com.yandex.plus.pay.inapp.google.common.internal.operation.b, rz2, com.yandex.plus.webview.internal.contract.impl.loading.n {
    public final Object a;
    public final Object b;

    public y(String str, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.pay.ui.webview.paymentwidget.ui.c cVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar2, com.yandex.plus.core.dispatcher.b bVar3, com.yandex.plus.pay.ui.core.internal.di.g gVar, com.yandex.plus.pay.ui.yb.web.api.b bVar4, com.yandex.plus.pay.ui.design.api.api.a aVar) {
        str.getClass();
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        gVar.getClass();
        bVar4.getClass();
        aVar.getClass();
        this.a = bVar4;
        this.b = str;
        com.yandex.plus.pay.ui.yb.web.internal.di.c cVar2 = new com.yandex.plus.pay.ui.yb.web.internal.di.c(iVar, cVar, bVar, bVar2, bVar3, gVar, aVar);
        com.yandex.plus.pay.ui.yb.web.internal.di.a aVar2 = com.yandex.plus.pay.ui.yb.web.internal.di.a.d;
        aVar2.getClass();
        ((Map) ((jyr) aVar2.c).getValue()).put(str, cVar2);
    }

    public static void k(Context context, File file) {
        Uri d = hac.d(context, context.getPackageName() + ".PlusSdkFileProvider", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", d);
        intent.setType("text/plain");
        intent.setFlags(1);
        Intent createChooser = Intent.createChooser(intent, null);
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void a(String str, com.yandex.plus.webview.internal.container.a aVar, com.yandex.plus.webview.core.d dVar, Exception exc, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b bVar) {
        c();
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void b(com.yandex.plus.webview.core.d dVar) {
        ((View) this.a).setVisibility(8);
        ((WebViewContainer) this.b).setVisibility(0);
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void c() {
        ((WebViewContainer) this.b).setVisibility(8);
        ((View) this.a).setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[LOOP:0: B:18:0x007c->B:20:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.plus.home.internal.di.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, Map map, cg6 cg6Var) {
        com.yandex.plus.webview.internal.contract.request.a aVar;
        Object obj;
        nm6 nm6Var;
        int i;
        String str2;
        ArrayList arrayList;
        Object obj2;
        Map map2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        LinkedHashMap linkedHashMap;
        Object obj3;
        ?? c;
        List c2;
        if (cg6Var instanceof com.yandex.plus.webview.internal.contract.request.a) {
            aVar = (com.yandex.plus.webview.internal.contract.request.a) cg6Var;
            int i2 = aVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.p = i2 - Integer.MIN_VALUE;
                obj = aVar.n;
                nm6Var = nm6.a;
                i = aVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList2 = ((com.yandex.passport.legacy.lx.f) this.a).a;
                    str2 = str;
                    aVar.j = str2;
                    aVar.k = map;
                    aVar.l = arrayList2;
                    aVar.p = 1;
                    Serializable f = f(arrayList2, aVar);
                    if (f != nm6Var) {
                        arrayList = arrayList2;
                        obj2 = f;
                        map2 = map;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = aVar.m;
                    Map map3 = aVar.k;
                    qgg.h0(obj);
                    return new com.yandex.plus.webview.api.request.a((String) obj, linkedHashMap);
                }
                ArrayList arrayList3 = aVar.l;
                map2 = aVar.k;
                String str3 = aVar.j;
                qgg.h0(obj);
                obj2 = obj;
                str2 = str3;
                arrayList = arrayList3;
                List list = (List) obj2;
                linkedHashSet = new LinkedHashSet();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.yandex.plus.webview.api.contract.d) it.next()).getClass();
                }
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet != null || (r6 = t75.c(new com.yandex.plus.webview.api.contract.f(8, CollectionsKt.A0(linkedHashSet), "available_features", true))) == null) {
                    Collection collection = c5b.a;
                }
                Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
                List list2 = list;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof com.yandex.plus.webview.api.contract.f) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    com.yandex.plus.webview.api.contract.f fVar = (com.yandex.plus.webview.api.contract.f) next;
                    fVar.getClass();
                    if (!queryParameterNames.contains(fVar.a)) {
                        arrayList5.add(next);
                    }
                }
                ArrayList g0 = CollectionsKt.g0(collection, arrayList5);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof com.yandex.plus.webview.api.contract.e) {
                        arrayList6.add(obj5);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                it3 = g0.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    String str4 = ((com.yandex.plus.webview.api.contract.f) next2).a;
                    Object obj6 = linkedHashMap2.get(str4);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap2.put(str4, obj6);
                    }
                    ((List) obj6).add(next2);
                }
                ArrayList arrayList7 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str5 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it5.next();
                        if (((com.yandex.plus.webview.api.contract.f) obj3).c) {
                            break;
                        }
                    }
                    com.yandex.plus.webview.api.contract.f fVar2 = (com.yandex.plus.webview.api.contract.f) obj3;
                    if (fVar2 != null && (c2 = t75.c(fVar2)) != null) {
                        list3 = c2;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        Object obj7 = ((com.yandex.plus.webview.api.contract.f) it6.next()).b;
                        Collection collection2 = obj7 instanceof Collection ? (Collection) obj7 : null;
                        if (collection2 != null) {
                            Collection collection3 = collection2;
                            c = new ArrayList(v75.o(collection3, 10));
                            Iterator it7 = collection3.iterator();
                            while (it7.hasNext()) {
                                c.add(String.valueOf(it7.next()));
                            }
                        } else {
                            c = t75.c(obj7.toString());
                        }
                        z75.t(arrayList8, (Iterable) c);
                    }
                    arrayList7.add(new Pair(str5, CollectionsKt.A0(arrayList8)));
                }
                Map n = uah.n(arrayList7);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(arrayList6.size() + (map2 == null ? map2.size() : 0));
                it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    com.yandex.plus.webview.api.contract.e eVar = (com.yandex.plus.webview.api.contract.e) it4.next();
                    if (!linkedHashMap3.containsKey(eVar.a)) {
                        linkedHashMap3.put(eVar.a, eVar.b.toString());
                    }
                }
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (!linkedHashMap3.containsKey(entry2.getKey())) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                com.yandex.plus.webview.api.request.b bVar = (com.yandex.plus.webview.api.request.b) this.b;
                aVar.j = null;
                aVar.k = null;
                aVar.l = null;
                aVar.m = linkedHashMap3;
                aVar.p = 2;
                obj = bVar.a(str2, n, aVar);
                if (obj != nm6Var) {
                    linkedHashMap = linkedHashMap3;
                    return new com.yandex.plus.webview.api.request.a((String) obj, linkedHashMap);
                }
                return nm6Var;
            }
        }
        aVar = new com.yandex.plus.webview.internal.contract.request.a(this, cg6Var);
        obj = aVar.n;
        nm6Var = nm6.a;
        i = aVar.p;
        if (i != 0) {
        }
        List list4 = (List) obj2;
        linkedHashSet = new LinkedHashSet();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        if (linkedHashSet.isEmpty()) {
        }
        if (linkedHashSet != null) {
        }
        Collection collection4 = c5b.a;
        Set<String> queryParameterNames2 = Uri.parse(str2).getQueryParameterNames();
        List list22 = list4;
        ArrayList arrayList42 = new ArrayList();
        while (r11.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList();
        it2 = arrayList42.iterator();
        while (it2.hasNext()) {
        }
        ArrayList g02 = CollectionsKt.g0(collection4, arrayList52);
        ArrayList arrayList62 = new ArrayList();
        while (r4.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        it3 = g02.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList72 = new ArrayList(linkedHashMap22.size());
        while (r4.hasNext()) {
        }
        Map n2 = uah.n(arrayList72);
        LinkedHashMap linkedHashMap32 = new LinkedHashMap(arrayList62.size() + (map2 == null ? map2.size() : 0));
        it4 = arrayList62.iterator();
        while (it4.hasNext()) {
        }
        if (map2 != null) {
        }
        com.yandex.plus.webview.api.request.b bVar2 = (com.yandex.plus.webview.api.request.b) this.b;
        aVar.j = null;
        aVar.k = null;
        aVar.l = null;
        aVar.m = linkedHashMap32;
        aVar.p = 2;
        obj = bVar2.a(str2, n2, aVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public File e(File file, List list) {
        ((com.yandex.plus.pay.ui.core.debug.internal.domain.log.a) this.b).getClass();
        list.getClass();
        byte[] bytes = CollectionsKt.X(list, StringUtil.LF, null, null, new com.yandex.plus.pay.ui.common.internal.error.content.b(4), 30).getBytes(Charsets.UTF_8);
        bytes.getClass();
        File file2 = new File(file, "plus_pay_sdk.log");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable f(ArrayList arrayList, cg6 cg6Var) {
        com.yandex.plus.webview.internal.contract.request.b bVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.webview.internal.contract.request.b) {
            bVar = (com.yandex.plus.webview.internal.contract.request.b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    tf6 e = gld.e(bVar.getContext());
                    mxr mxrVar = new mxr(3, (Continuation) null);
                    bVar.l = 1;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(x97.p(e, null, null, new com.yandex.plus.home.api.prefetch.j(mxrVar, e, it.next(), (Continuation) null), 3));
                    }
                    obj = ox6.v(arrayList2, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return v75.p((Iterable) obj);
            }
        }
        bVar = new com.yandex.plus.webview.internal.contract.request.b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return v75.p((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Object obj, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.common.internal.operation.f fVar;
        int i;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.a;
        com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) this.b;
        com.yandex.plus.pay.inapp.google.common.internal.operation.b bVar2 = (com.yandex.plus.pay.inapp.google.common.internal.operation.b) pVar.d;
        if (cg6Var instanceof com.yandex.plus.pay.inapp.google.common.internal.operation.f) {
            fVar = (com.yandex.plus.pay.inapp.google.common.internal.operation.f) cg6Var;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.j;
                nm6 nm6Var = nm6.a;
                i = fVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "WithLogsOperationDecorator", bVar2.getName());
                    }
                    fVar.l = 1;
                    obj2 = pVar.A(fVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj2;
                aVar = com.yandex.plus.log.api.a.b;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "WithLogsOperationDecorator", bVar2.getName() + " = " + cVar);
                }
                return cVar;
            }
        }
        fVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.f(this, cg6Var);
        Object obj22 = fVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fVar.l;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar2 = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj22;
        aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
        }
        return cVar2;
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public String getName() {
        return ((com.yandex.plus.pay.inapp.google.common.internal.operation.b) ((com.yandex.passport.internal.flags.experiments.p) this.b).d).getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(com.yandex.plus.pay.ui.yb.api.e eVar, cg6 cg6Var) {
        com.yandex.plus.pay.ui.yb.web.api.a aVar;
        int i;
        Object obj;
        Object obj2;
        String str;
        Object u;
        Long loadMessageTimeoutMillis;
        Long startMessageTimeoutMillis;
        b0 widgetUrls;
        b0 widgetUrls2;
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups;
        com.yandex.plus.pay.ui.yb.web.internal.e eVar2;
        if (cg6Var instanceof com.yandex.plus.pay.ui.yb.web.api.a) {
            aVar = (com.yandex.plus.pay.ui.yb.web.api.a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj3 = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj3);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.e eVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.e) ((com.yandex.plus.pay.ui.yb.web.api.b) this.a);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = eVar3.b.a();
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = a.b.b;
                    Sequence lhcVar = (plusPayCompositeOfferDetails == null || (paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups()) == null) ? p5b.a : new lhc(new wz0(1, paymentMethodsGroups), new com.yandex.plus.pay.ui.common.internal.error.content.b(15), ihp.a);
                    Iterator it = lhcVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((PlusPayCompositeOfferDetails.PaymentMethod) obj).getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_YB_CARD) {
                            break;
                        }
                    }
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj;
                    Iterator it2 = lhcVar.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2 = (PlusPayCompositeOfferDetails.PaymentMethod) obj2;
                        if (paymentMethod2.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.CARD && (widgetUrls2 = paymentMethod2.getWidgetUrls()) != null) {
                            if (!(widgetUrls2.a == null && widgetUrls2.b == null)) {
                                break;
                            }
                        }
                    }
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod3 = (PlusPayCompositeOfferDetails.PaymentMethod) obj2;
                    if (paymentMethod == null) {
                        paymentMethod = paymentMethod3;
                    }
                    PlusPayWebPaymentWidgetTimeoutParams timeoutParams = paymentMethod != null ? paymentMethod.getTimeoutParams() : null;
                    if (paymentMethod != null && (widgetUrls = paymentMethod.getWidgetUrls()) != null) {
                        String str2 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(eVar3.a, (com.yandex.plus.ui.core.theme.a) eVar3.c.a.getValue()) ? widgetUrls.b : widgetUrls.a;
                        if (str2 != null) {
                            str = com.yandex.plus.bdui.plus.analytics.b.b(str2, a.a);
                            if (str != null) {
                                xq0.x("Widget url is absent!");
                                return null;
                            }
                            long j = 10000;
                            long longValue = (timeoutParams == null || (startMessageTimeoutMillis = timeoutParams.getStartMessageTimeoutMillis()) == null) ? 10000L : startMessageTimeoutMillis.longValue();
                            if (timeoutParams != null && (loadMessageTimeoutMillis = timeoutParams.getLoadMessageTimeoutMillis()) != null) {
                                j = loadMessageTimeoutMillis.longValue();
                            }
                            com.yandex.plus.core.activity.result.internal.h hVar = com.yandex.plus.core.activity.result.internal.h.d;
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f fVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f((String) this.b, 3);
                            com.yandex.plus.pay.ui.yb.web.internal.ui.b bVar = new com.yandex.plus.pay.ui.yb.web.internal.ui.b(str, longValue, j, eVar);
                            aVar.l = 1;
                            u = hVar.u(fVar, bVar, aVar);
                            if (u == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj3);
                    u = ((z7o) obj3).a;
                }
                if (z7o.a(u) != null) {
                    u = com.yandex.plus.pay.ui.yb.web.internal.a.a;
                }
                eVar2 = (com.yandex.plus.pay.ui.yb.web.internal.e) u;
                if (!(eVar2 instanceof com.yandex.plus.pay.ui.yb.web.internal.c)) {
                    return new com.yandex.plus.pay.ui.yb.api.c(((com.yandex.plus.pay.ui.yb.web.internal.c) eVar2).a);
                }
                if (eVar2 instanceof com.yandex.plus.pay.ui.yb.web.internal.d) {
                    return new com.yandex.plus.pay.ui.yb.api.c(null);
                }
                if (eVar2 instanceof com.yandex.plus.pay.ui.yb.web.internal.b) {
                    return new com.yandex.plus.pay.ui.yb.api.b(new my1("Something went wrong with yb webview"));
                }
                if (eVar2 instanceof com.yandex.plus.pay.ui.yb.web.internal.a) {
                    return com.yandex.plus.pay.ui.yb.api.a.a;
                }
                b6e.s();
                return null;
            }
        }
        aVar = new com.yandex.plus.pay.ui.yb.web.api.a(this, cg6Var);
        Object obj32 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        if (z7o.a(u) != null) {
        }
        eVar2 = (com.yandex.plus.pay.ui.yb.web.internal.e) u;
        if (!(eVar2 instanceof com.yandex.plus.pay.ui.yb.web.internal.c)) {
        }
    }

    public void i(String str) {
        str.getClass();
        Context context = (Context) this.a;
        com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(11, this, str);
        context.getClass();
        str.getClass();
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            aVar.invoke(e);
        }
    }

    public void j(Set set) {
        com.yandex.plus.home.state.b bVar;
        set.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(v75.o(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            switch (((g6) it.next()).ordinal()) {
                case 0:
                    bVar = com.yandex.plus.home.state.b.a;
                    break;
                case 1:
                    bVar = com.yandex.plus.home.state.b.b;
                    break;
                case 2:
                    bVar = com.yandex.plus.home.state.b.d;
                    break;
                case 3:
                    bVar = com.yandex.plus.home.state.b.e;
                    break;
                case 4:
                    bVar = com.yandex.plus.home.state.b.c;
                    break;
                case 5:
                    bVar = com.yandex.plus.home.state.b.f;
                    break;
                case 6:
                    bVar = com.yandex.plus.home.state.b.g;
                    break;
                case 7:
                    bVar = com.yandex.plus.home.state.b.h;
                    break;
                default:
                    b6e.s();
                    return;
            }
            arrayList.add(bVar);
        }
        Set A0 = CollectionsKt.A0(arrayList);
        com.yandex.plus.home.state.a aVar = (com.yandex.plus.home.state.a) ((l) this.b).q.getValue();
        aVar.getClass();
        A0.getClass();
        aVar.a.a(A0);
    }

    @Override // defpackage.rz2
    public void onBillingServiceDisconnected() {
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) ((com.yandex.passport.internal.flags.experiments.p) this.a).c;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WithConnectionEstablishmentOperationDecorator", "onBillingServiceDisconnected()");
        }
    }

    @Override // defpackage.rz2
    public void onBillingSetupFinished(uz2 uz2Var) {
        uz2Var.getClass();
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) ((com.yandex.passport.internal.flags.experiments.p) this.a).c;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WithConnectionEstablishmentOperationDecorator", "onBillingSetupFinished(" + uz2Var + ')');
        }
        ((oc4) ((ltm) this.b)).c(uz2Var);
    }

    public y(com.yandex.plus.home.plaque.repository.api.a aVar, kotlinx.coroutines.a aVar2) {
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
    }

    public y(com.yandex.plus.log.api.b bVar, com.yandex.passport.internal.flags.experiments.p pVar) {
        bVar.getClass();
        this.a = bVar;
        this.b = pVar;
    }

    public y(Context context, com.yandex.plus.pay.log.impl.b bVar) {
        context.getClass();
        bVar.getClass();
        this.a = context;
        this.b = bVar;
    }

    public y(Context context, com.yandex.plus.pay.ui.core.debug.internal.domain.log.a aVar) {
        context.getClass();
        aVar.getClass();
        this.a = context;
        this.b = aVar;
    }

    public y(com.yandex.plus.bdui.flex.ui.s sVar, kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.a = sVar;
        this.b = aVar;
    }

    public y(View view, WebViewContainer webViewContainer) {
        view.getClass();
        webViewContainer.getClass();
        this.a = view;
        this.b = webViewContainer;
    }

    public y(i5f i5fVar, com.yandex.plus.log.api.b bVar) {
        i5fVar.getClass();
        bVar.getClass();
        this.a = i5fVar;
        this.b = btf.b(new com.yandex.plus.bdui.plus.checkout.d(bVar, 2));
    }

    public /* synthetic */ y(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public y(l lVar) {
        this.b = lVar;
        this.a = new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(3, new com.yandex.plus.home.graphql.plusstate.e(((com.yandex.plus.home.state.a) lVar.q.getValue()).b, 2));
    }
}
