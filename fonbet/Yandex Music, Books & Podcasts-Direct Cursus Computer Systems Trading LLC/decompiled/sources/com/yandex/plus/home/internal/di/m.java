package com.yandex.plus.home.internal.di;

import com.yandex.plus.home.api.prefetch.PrefetchApi;
import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import defpackage.bnd;
import defpackage.cp0;
import defpackage.dp0;
import defpackage.joj;
import defpackage.op;
import defpackage.qne;
import defpackage.uao;
import defpackage.vao;
import defpackage.x3f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ m(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Object value = this.b.n.getValue();
                value.getClass();
                return (CommonExperimentsControllerApi) ((vao) value).b(CommonExperimentsControllerApi.class);
            case 1:
                dp0 b = this.b.b();
                b.getClass();
                return new com.yandex.plus.core.graphql.internal.c(b);
            case 2:
                p pVar = this.b;
                joj a = pVar.a();
                com.yandex.plus.core.network.api.interceptors.b bVar = new com.yandex.plus.core.network.api.interceptors.b(0);
                ArrayList arrayList = a.c;
                arrayList.add(bVar);
                com.yandex.plus.home.network.hosts.a aVar = pVar.a.l;
                arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(4, new n(aVar, 0)));
                OkHttpClient okHttpClient = new OkHttpClient(a);
                cp0 cp0Var = new cp0();
                cp0Var.e = p.d(aVar.d());
                cp0Var.f = new bnd(22, okHttpClient);
                cp0Var.g = Boolean.TRUE;
                com.yandex.plus.home.analytics.diagnostic.server.b bVar2 = new com.yandex.plus.home.analytics.diagnostic.server.b(pVar.b.b(), (com.yandex.plus.home.core.network.d) pVar.p.getValue());
                ArrayList arrayList2 = cp0Var.b;
                arrayList2.add(bVar2);
                arrayList2.add(new com.yandex.plus.home.graphql.analytics.a());
                op opVar = com.yandex.plus.core.graphql.type.z.b;
                com.yandex.plus.core.graphql.utils.a aVar2 = new com.yandex.plus.core.graphql.utils.a(0);
                opVar.getClass();
                qne qneVar = cp0Var.a;
                qneVar.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) qneVar.a;
                linkedHashMap.put(opVar.a, aVar2);
                op opVar2 = com.yandex.plus.core.graphql.type.z.c;
                com.yandex.plus.core.graphql.utils.a aVar3 = new com.yandex.plus.core.graphql.utils.a(1);
                opVar2.getClass();
                linkedHashMap.put(opVar2.a, aVar3);
                return cp0Var.a();
            case 3:
                p pVar2 = this.b;
                joj a2 = pVar2.a();
                u uVar = pVar2.a;
                com.yandex.plus.core.network.api.interceptors.a aVar4 = new com.yandex.plus.core.network.api.interceptors.a(new com.yandex.plus.home.feature.webviews.internal.stories.i(0, uVar.o, com.yandex.plus.core.locale.b.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1, 17));
                ArrayList arrayList3 = a2.c;
                arrayList3.add(aVar4);
                arrayList3.add(new com.yandex.plus.core.network.api.interceptors.b(2));
                com.yandex.plus.home.network.hosts.a aVar5 = uVar.l;
                arrayList3.add(new com.yandex.plus.core.network.api.interceptors.a(4, new n(aVar5, 1)));
                OkHttpClient okHttpClient2 = new OkHttpClient(a2);
                uao uaoVar = new uao();
                uaoVar.a((com.yandex.plus.core.network.c) pVar2.q.getValue());
                uaoVar.b = okHttpClient2;
                uaoVar.e.add(new com.yandex.plus.core.network.api.d(1));
                uaoVar.b(p.d(aVar5.g()));
                return uaoVar.c();
            case 4:
                p pVar3 = this.b;
                joj a3 = pVar3.a();
                u uVar2 = pVar3.a;
                com.yandex.plus.core.network.api.interceptors.a aVar6 = new com.yandex.plus.core.network.api.interceptors.a(new com.yandex.plus.home.feature.webviews.internal.stories.i(0, uVar2.o, com.yandex.plus.core.locale.b.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1, 16));
                ArrayList arrayList4 = a3.c;
                arrayList4.add(aVar6);
                arrayList4.add(new com.yandex.plus.core.network.api.interceptors.b(2));
                OkHttpClient okHttpClient3 = new OkHttpClient(a3);
                uao uaoVar2 = new uao();
                uaoVar2.a((com.yandex.plus.core.network.c) pVar3.q.getValue());
                uaoVar2.b = okHttpClient3;
                uaoVar2.e.add(new com.yandex.plus.core.network.api.d(1));
                uaoVar2.b(p.d(uVar2.l.b()));
                return uaoVar2.c();
            case 5:
                return ((com.yandex.plus.domain.auth.api.e) this.b.c.h.getValue()).getId();
            case 6:
                return this.b.d.b();
            case 7:
                return this.b.d.a();
            case 8:
                p pVar4 = this.b;
                OkHttpClient okHttpClient4 = (OkHttpClient) pVar4.r.getValue();
                com.yandex.plus.home.network.hosts.a aVar7 = pVar4.a.l;
                joj c = okHttpClient4 != null ? okHttpClient4.c() : new joj();
                ArrayList arrayList5 = c.c;
                arrayList5.add(new com.yandex.plus.core.network.api.interceptors.b(1));
                arrayList5.add(new com.yandex.plus.core.network.api.interceptors.a(2, new com.yandex.passport.sloth.ui.c(10, pVar4)));
                arrayList5.add(new com.yandex.plus.core.network.api.interceptors.a(4, new n(aVar7, 2)));
                OkHttpClient okHttpClient5 = new OkHttpClient(c);
                uao uaoVar3 = new uao();
                uaoVar3.a((com.yandex.plus.core.network.c) pVar4.q.getValue());
                uaoVar3.b = okHttpClient5;
                uaoVar3.b(p.d(aVar7.e()));
                return uaoVar3.c();
            case 9:
                return new com.yandex.plus.core.network.c((x3f) this.b.i.getValue());
            case 10:
                joj jojVar = this.b.a.h;
                if (jojVar != null) {
                    return new OkHttpClient(jojVar);
                }
                return null;
            case 11:
                return (SdkConfigurationControllerApi) this.b.c().b(SdkConfigurationControllerApi.class);
            case 12:
                return (PlusStateControllerApi) this.b.c().b(PlusStateControllerApi.class);
            default:
                Object value2 = this.b.o.getValue();
                value2.getClass();
                return (PrefetchApi) ((vao) value2).b(PrefetchApi.class);
        }
    }
}
