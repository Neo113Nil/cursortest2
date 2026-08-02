package com.yandex.plus.bdui.flex.factory;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.q;
import com.yandex.plus.bdui.s;
import com.yandex.plus.core.graphql.a0;
import com.yandex.plus.core.network.okhttp.client.e;
import com.yandex.plus.home.api.prefetch.PrefetchApi;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.t;
import com.yandex.plus.pay.ui.core.mobile.view.error.buttons.PlusPayErrorButtonsView;
import defpackage.bck;
import defpackage.bse;
import defpackage.c76;
import defpackage.d0o;
import defpackage.dfi;
import defpackage.ee6;
import defpackage.ern;
import defpackage.ezc;
import defpackage.ff7;
import defpackage.joj;
import defpackage.jso;
import defpackage.l3o;
import defpackage.mn7;
import defpackage.os7;
import defpackage.t9f;
import defpackage.tah;
import defpackage.tf6;
import defpackage.tkr;
import defpackage.uah;
import defpackage.ukn;
import defpackage.uop;
import defpackage.vop;
import defpackage.w40;
import defpackage.wsd;
import defpackage.x3f;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar, Function0 function0, Function0 function02) {
        this.a = 18;
        this.b = bVar;
        this.c = (ezc) function0;
        this.d = (ezc) function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v32, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i = this.a;
        int i2 = 29;
        int i3 = 3;
        int i4 = 4;
        ?? r6 = 0;
        r6 = 0;
        final int i5 = 1;
        final int i6 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return (t9f) ((com.yandex.plus.bdui.model.a) obj3).b.invoke((s) obj2, (c76) obj);
            case 1:
                com.yandex.plus.bdui.ui.a aVar = (com.yandex.plus.bdui.ui.a) obj2;
                final com.yandex.plus.bdui.flex.utils.b bVar = (com.yandex.plus.bdui.flex.utils.b) obj;
                return ((os7) obj3).b(new com.yandex.passport.internal.storage.d(bVar, 27), new com.yandex.passport.internal.storage.d(28), new com.yandex.passport.internal.storage.d(bVar, i2), new Function1() { // from class: com.yandex.plus.bdui.flex.ui.content.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i6) {
                            case 0:
                                ee6 ee6Var = (ee6) obj4;
                                ee6Var.getClass();
                                return bVar.j(ee6Var.d);
                            default:
                                jso jsoVar = (jso) obj4;
                                jsoVar.getClass();
                                return bVar.j(jsoVar.d);
                        }
                    }
                }, new com.yandex.plus.bdui.flex.ui.content.c(i6), new com.yandex.plus.bdui.flex.ui.content.d(bVar, i6), new q(2, aVar, com.yandex.plus.bdui.ui.a.class, "shouldUpdateState", "shouldUpdateState(Lcom/yandex/plus/bdui/content/ContentUpdate;Lcom/yandex/plus/bdui/content/ContentUpdate;)Z", 0, 1), new w40(3, aVar, com.yandex.plus.bdui.ui.a.class, "onUpdateStateAsync", "onUpdateStateAsync(Lcom/yandex/plus/bdui/content/ContentUpdate;Lcom/yandex/plus/bdui/ui/PreviewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), "FlexContentController", "Content");
            case 2:
                com.yandex.plus.bdui.flex.ui.scaffold.b bVar2 = (com.yandex.plus.bdui.flex.ui.scaffold.b) obj2;
                final com.yandex.plus.bdui.flex.utils.b bVar3 = (com.yandex.plus.bdui.flex.utils.b) obj;
                return ((os7) obj3).b(new com.yandex.plus.bdui.flex.ui.content.c(i5, bVar3), new com.yandex.plus.bdui.flex.ui.content.c(2), new com.yandex.plus.bdui.flex.ui.content.c(i3, bVar3), new Function1() { // from class: com.yandex.plus.bdui.flex.ui.content.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i5) {
                            case 0:
                                ee6 ee6Var = (ee6) obj4;
                                ee6Var.getClass();
                                return bVar3.j(ee6Var.d);
                            default:
                                jso jsoVar = (jso) obj4;
                                jsoVar.getClass();
                                return bVar3.j(jsoVar.d);
                        }
                    }
                }, new com.yandex.plus.bdui.flex.ui.content.c(i4), new com.yandex.plus.bdui.flex.ui.content.d(bVar3, i5), new q(2, bVar2.b, com.yandex.plus.bdui.plus.scaffold.controller.e.class, "shouldUpdateState", "shouldUpdateState(Lcom/yandex/plus/bdui/scaffold/ScaffoldUpdate;Lcom/yandex/plus/bdui/scaffold/ScaffoldUpdate;)Z", 0, 2), new w40(3, bVar2.b, com.yandex.plus.bdui.plus.scaffold.controller.e.class, "onUpdateStateAsync", "onUpdateStateAsync(Lcom/yandex/plus/bdui/scaffold/ScaffoldUpdate;Lcom/yandex/plus/bdui/ui/PreviewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), "FlexScaffoldController", "Scaffold");
            case 3:
                com.yandex.plus.bdui.plus.action.k kVar = (com.yandex.plus.bdui.plus.action.k) obj3;
                com.yandex.plus.bdui.plus.action.c cVar = (com.yandex.plus.bdui.plus.action.c) obj2;
                com.yandex.plus.bdui.shared.b bVar4 = ((com.yandex.plus.bdui.action.i) obj).b.a;
                bVar4.getClass();
                com.yandex.plus.bdui.plus.shared.e eVar = (com.yandex.plus.bdui.plus.shared.e) bVar4.e(ern.a(com.yandex.plus.bdui.plus.shared.e.class));
                Map map = eVar != null ? (Map) eVar.b.d(com.yandex.plus.bdui.plus.shared.e.d[0]) : null;
                if (map != null && (list = cVar.d) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Map map2 = (Map) map.get((String) it.next());
                        if (map2 != null) {
                            arrayList.add(map2);
                        }
                    }
                    r6 = r1.h(arrayList, true);
                }
                com.yandex.plus.log.api.b bVar5 = kVar.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar5.b(aVar2)) {
                    bVar5.c(aVar2, "PlusSendAnalyticsActionHandler", "createPlusEvent(); params = " + r6);
                }
                return new com.yandex.plus.bdui.analytics.c(cVar.c, r6);
            case 4:
                com.yandex.plus.bdui.plus.checkout.webview.contract.b bVar6 = (com.yandex.plus.bdui.plus.checkout.webview.contract.b) obj2;
                return ((com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) obj3).a((String) bVar6.g.getValue(), 10000L, 10000L, new com.yandex.passport.common.network.n(i2, bVar6, (com.yandex.plus.bdui.plus.checkout.o) obj));
            case 5:
                com.yandex.plus.bdui.plus.content.controller.l lVar = (com.yandex.plus.bdui.plus.content.controller.l) obj;
                return new com.yandex.plus.bdui.plus.content.controller.d((com.yandex.plus.bdui.m) obj3, new com.yandex.plus.bdui.plus.content.controller.i(lVar, i6), (com.yandex.plus.bdui.plus.checkout.o) obj2, lVar.i);
            case 6:
                return (t9f) ((Function2) obj3).invoke((s) obj2, (Function0) obj);
            case 7:
                ((com.yandex.plus.bdui.m) obj3).a.a((com.yandex.plus.bdui.action.a) obj2, (com.yandex.plus.bdui.action.h) obj, null);
                return Boolean.TRUE;
            case 8:
                int i7 = com.yandex.plus.core.debug.panel.internal.presentation.view.d.o;
                ((Function0) obj3).invoke();
                ((com.yandex.plus.core.debug.panel.internal.presentation.view.i) obj2).invoke();
                ((com.yandex.plus.core.debug.panel.internal.presentation.view.d) obj).a();
                return Unit.a;
            case 9:
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 0.0f, -0.5f, (int[]) obj3, (float[]) obj2, Shader.TileMode.REPEAT);
                linearGradient.setLocalMatrix(((com.yandex.plus.core.gradient.impl.b) obj).e);
                return linearGradient;
            case 10:
                int i8 = com.yandex.plus.pay.internal.di.d.a;
                final com.yandex.plus.core.network.impl.c cVar2 = (com.yandex.plus.core.network.impl.c) obj3;
                final com.yandex.plus.core.network.okhttp.client.b bVar7 = (com.yandex.plus.core.network.okhttp.client.b) obj2;
                final com.yandex.plus.core.network.okhttp.client.b bVar8 = (com.yandex.plus.core.network.okhttp.client.b) obj;
                joj c = new OkHttpClient(new joj()).c();
                c.d.add(new bse() { // from class: com.yandex.plus.core.network.impl.a
                    @Override // defpackage.bse
                    public final l3o b(ukn uknVar) {
                        Object peek = c.this.a().peek();
                        if (peek == null) {
                            return uknVar.f((d0o) uknVar.i);
                        }
                        com.yandex.plus.core.network.okhttp.client.b bVar9 = bVar7;
                        int i9 = bVar9.a;
                        com.yandex.plus.core.network.retrofit.client.a aVar3 = bVar9.b;
                        com.yandex.plus.core.network.okhttp.call.a aVar4 = (com.yandex.plus.core.network.okhttp.call.a) peek;
                        switch (i9) {
                            case 0:
                                List w = xz0.w(new com.yandex.plus.core.network.interceptor.a[0]);
                                aVar3.getClass();
                                return aVar3.b(aVar4.a, CollectionsKt.g0(CollectionsKt.g0(w, aVar4.b), xz0.w(new com.yandex.plus.core.network.interceptor.a[]{null, e.a})), uknVar, false);
                            default:
                                return aVar3.b(aVar4.a, aVar4.c, uknVar, true);
                        }
                    }
                });
                c.c.add(new bse() { // from class: com.yandex.plus.core.network.impl.a
                    @Override // defpackage.bse
                    public final l3o b(ukn uknVar) {
                        Object peek = c.this.a().peek();
                        if (peek == null) {
                            return uknVar.f((d0o) uknVar.i);
                        }
                        com.yandex.plus.core.network.okhttp.client.b bVar9 = bVar8;
                        int i9 = bVar9.a;
                        com.yandex.plus.core.network.retrofit.client.a aVar3 = bVar9.b;
                        com.yandex.plus.core.network.okhttp.call.a aVar4 = (com.yandex.plus.core.network.okhttp.call.a) peek;
                        switch (i9) {
                            case 0:
                                List w = xz0.w(new com.yandex.plus.core.network.interceptor.a[0]);
                                aVar3.getClass();
                                return aVar3.b(aVar4.a, CollectionsKt.g0(CollectionsKt.g0(w, aVar4.b), xz0.w(new com.yandex.plus.core.network.interceptor.a[]{null, e.a})), uknVar, false);
                            default:
                                return aVar3.b(aVar4.a, aVar4.c, uknVar, true);
                        }
                    }
                });
                return new OkHttpClient(c);
            case 11:
                com.yandex.plus.home.feature.webviews.internal.home.contract.b bVar9 = (com.yandex.plus.home.feature.webviews.internal.home.contract.b) obj3;
                com.yandex.plus.home.feature.webviews.internal.webview.h hVar = (com.yandex.plus.home.feature.webviews.internal.webview.h) obj2;
                com.yandex.plus.home.feature.webviews.internal.home.j jVar = (com.yandex.plus.home.feature.webviews.internal.home.j) obj;
                com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
                hVar.getClass();
                jVar.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.home.contract.a(jVar, bVar9.d, bVar9.e, hVar, bVar9.g, bVar9.l(), bVar9.m(), bVar9.h, bVar9.i, bVar9.j, bVar9.k, bVar9.l, bVar9.m, bVar9.n, bVar9.o, bVar9.p, bVar9.q, bVar9.r, bVar9.f, bVar9.t, bVar9.s);
            case 12:
                com.yandex.plus.home.feature.webviews.internal.stories.contract.b bVar10 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.b) obj3;
                com.yandex.plus.home.feature.webviews.internal.webview.h hVar2 = (com.yandex.plus.home.feature.webviews.internal.webview.h) obj2;
                com.yandex.plus.home.feature.webviews.internal.stories.n nVar = (com.yandex.plus.home.feature.webviews.internal.stories.n) obj;
                com.yandex.plus.home.feature.webviews.internalapi.a aVar4 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
                hVar2.getClass();
                nVar.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.stories.contract.a(hVar2, nVar, bVar10.q, bVar10.f, bVar10.e, bVar10.l(), bVar10.m(), bVar10.d, bVar10.g, bVar10.h, bVar10.i, bVar10.j, bVar10.k, bVar10.l, bVar10.m, bVar10.n, bVar10.o, bVar10.p, bVar10.s, bVar10.r);
            case 13:
                com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar5 = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                return uah.e(new Pair("plus_sdk_version", uop.b("110.0.0")), new Pair("plus_sdk_client_app_version", vop.e((String) obj3)), new Pair("plus_sdk_service_name", vop.e((String) obj2)), new Pair("plus_sdk_is_native_payment_available", vop.e(String.valueOf(aVar5.b))), new Pair("plus_sdk_inapp_country_code", vop.e(aVar5.a)));
            case 14:
                u uVar = (u) obj2;
                Object value = ((com.yandex.plus.home.internal.di.l) obj3).e.h.getValue();
                value.getClass();
                PrefetchApi prefetchApi = (PrefetchApi) value;
                com.yandex.plus.home.e eVar2 = new com.yandex.plus.home.e(uVar, i3);
                com.yandex.plus.home.featureflags.g gVar = uVar.q;
                String absolutePath = uVar.a.getCacheDir().getAbsolutePath();
                absolutePath.getClass();
                return new com.yandex.plus.home.api.prefetch.l(prefetchApi, eVar2, gVar, absolutePath, (tf6) obj);
            case 15:
                t tVar = (t) obj3;
                com.yandex.plus.home.plaque.plugin.internal.di.c cVar3 = (com.yandex.plus.home.plaque.plugin.internal.di.c) obj2;
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) obj;
                com.yandex.plus.home.internal.di.p pVar = tVar.e;
                Object b = pVar.c().b(CrossPlaqueControllerApi.class);
                b.getClass();
                CrossPlaqueControllerApi crossPlaqueControllerApi = (CrossPlaqueControllerApi) b;
                u uVar2 = tVar.b;
                Context context = uVar2.a;
                com.yandex.plus.log.api.b b2 = cVar3.b();
                ((com.yandex.plus.core.dispatcher.a) uVar2.w).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                return new com.yandex.plus.home.plaque.repository.rest.o(crossPlaqueControllerApi, new com.yandex.passport.internal.core.accounts.h(context, b2, mn7Var), tVar.f.c(), (com.yandex.plus.core.location.a) cVar3.b.getValue(), sVar, uVar2.e, new com.yandex.plus.home.k(tVar, i4), new com.yandex.plus.home.plaque.plugin.internal.di.a(tVar, r6, i6), new com.yandex.plus.home.k(tVar, 5), new com.yandex.plus.home.plaque.plugin.internal.di.b(tVar, cVar3, r6, i6), new com.yandex.plus.home.k(tVar, 6), new com.yandex.plus.home.k(tVar, 7), new com.yandex.plus.home.k(tVar, 8), (com.yandex.plus.home.core.network.d) pVar.p.getValue(), cVar3.b(), tVar.i, mn7Var);
            case 16:
                String str = (String) obj2;
                com.yandex.plus.pay.diagnostic.impl.e eVar3 = ((com.yandex.plus.pay.graphql.analytics.c) obj3).a;
                String str2 = (String) ((a0) obj).e.H();
                eVar3.getClass();
                Map b3 = tah.b(new Pair("target", str2));
                bck bckVar = eVar3.a;
                if (str == null) {
                    str = "no_value";
                }
                x3f x3fVar = eVar3.b;
                x3fVar.getClass();
                tkr tkrVar = tkr.a;
                LinkedHashMap m = dfi.m("requestId", str, "additionalData", x3fVar.c(new wsd(tkrVar, ff7.C(tkrVar), 1), b3));
                m.put("_meta", bck.c(new HashMap()));
                bckVar.d("Error.Subscription.Tarifficator.OfferDetails.InvalidWidgetUrl", m);
                return Unit.a;
            case 17:
                return new com.yandex.plus.pay.internal.analytics.g((String) obj3, (String) obj2, ((com.yandex.plus.pay.internal.di.e) obj).a.b.equals("PlusSDK"));
            case 18:
                return new com.yandex.plus.pay.ui.core.mobile.view.error.buttons.b((PlusPayErrorButtonsView) ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) obj3).g.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b.r[7]), (ezc) obj2, (ezc) obj);
            default:
                return new com.yandex.plus.paymentsdk.internal.a((com.yandex.plus.home.plaque.plugin.internal.di.c) obj3, (com.yandex.plus.core.config.b) obj2, ((com.yandex.plus.paymentsdk.api.a) obj).a);
        }
    }

    public /* synthetic */ p(com.yandex.plus.core.network.impl.c cVar, com.yandex.plus.core.network.okhttp.client.b bVar, com.yandex.plus.core.network.okhttp.client.b bVar2) {
        this.a = 10;
        int i = com.yandex.plus.pay.internal.di.d.a;
        this.b = cVar;
        this.c = bVar;
        this.d = bVar2;
    }

    public /* synthetic */ p(com.yandex.plus.home.feature.webviews.internal.home.contract.b bVar, com.yandex.plus.home.feature.webviews.internal.webview.h hVar, com.yandex.plus.home.feature.webviews.internal.home.j jVar) {
        this.a = 11;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        this.b = bVar;
        this.c = hVar;
        this.d = jVar;
    }

    public /* synthetic */ p(com.yandex.plus.home.feature.webviews.internal.stories.contract.b bVar, com.yandex.plus.home.feature.webviews.internal.webview.h hVar, com.yandex.plus.home.feature.webviews.internal.stories.n nVar) {
        this.a = 12;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        this.b = bVar;
        this.c = hVar;
        this.d = nVar;
    }

    public /* synthetic */ p(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ p(int[] iArr, float[] fArr, com.yandex.plus.core.gradient.impl.b bVar) {
        this.a = 9;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.b = iArr;
        this.c = fArr;
        this.d = bVar;
    }
}
