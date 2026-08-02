package com.yandex.plus.pay.internal.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.core.graphql.type.z;
import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.bnd;
import defpackage.buu;
import defpackage.cp0;
import defpackage.dp0;
import defpackage.izm;
import defpackage.joj;
import defpackage.jyr;
import defpackage.mn7;
import defpackage.op;
import defpackage.q5b;
import defpackage.qne;
import defpackage.tf6;
import defpackage.u75;
import defpackage.uah;
import defpackage.uao;
import defpackage.x3f;
import defpackage.z98;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ j(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        int i3 = 6;
        int i4 = 0;
        l lVar = this.b;
        switch (i) {
            case 0:
                return new com.yandex.plus.pay.graphql.family.b(lVar.a(), lVar.a.b());
            case 1:
                return new com.yandex.plus.core.graphql.target.a(lVar.a.n);
            case 2:
                return new com.yandex.plus.pay.graphql.offers.m(lVar.a(), lVar.a.b());
            case 3:
                dp0 a = lVar.a();
                i iVar = lVar.a;
                return new com.yandex.plus.pay.graphql.contacts.b(a, iVar.b(), iVar.a);
            case 4:
                ExternalMediaBillingApi c = lVar.c();
                i iVar2 = lVar.a;
                com.yandex.plus.core.locale.a b = iVar2.b();
                ((com.yandex.plus.core.dispatcher.a) iVar2.q).getClass();
                return new com.yandex.plus.pay.internal.feature.topup.b(c, b, com.yandex.plus.core.dispatcher.a.e);
            case 5:
                ExternalMediaBillingApi c2 = lVar.c();
                i iVar3 = lVar.a;
                com.yandex.plus.core.locale.a b2 = iVar3.b();
                ((com.yandex.plus.core.dispatcher.a) iVar3.q).getClass();
                return new com.yandex.plus.pay.internal.feature.success.c(c2, b2, com.yandex.plus.core.dispatcher.a.e);
            case 6:
                ExternalMediaBillingApi c3 = lVar.c();
                i iVar4 = lVar.a;
                com.yandex.plus.core.locale.a b3 = iVar4.b();
                ((com.yandex.plus.core.dispatcher.a) iVar4.q).getClass();
                return new com.yandex.plus.pay.internal.feature.closing.f(c3, b3, com.yandex.plus.core.dispatcher.a.e, lVar.b.e);
            case 7:
                ExternalMediaBillingApi c4 = lVar.c();
                i iVar5 = lVar.a;
                com.yandex.plus.core.locale.a b4 = iVar5.b();
                ((com.yandex.plus.core.dispatcher.a) iVar5.q).getClass();
                return new com.yandex.plus.pay.internal.feature.counter_offers.g(c4, b4, com.yandex.plus.core.dispatcher.a.e, lVar.b.e);
            case 8:
                ExternalMediaBillingApi c5 = lVar.c();
                i iVar6 = lVar.a;
                com.yandex.plus.core.locale.a b5 = iVar6.b();
                ((com.yandex.plus.core.dispatcher.a) iVar6.q).getClass();
                return new com.yandex.plus.pay.internal.feature.presale.f(c5, b5, com.yandex.plus.core.dispatcher.a.e, lVar.b.e);
            case 9:
                ExternalMediaBillingApi c6 = lVar.c();
                com.yandex.plus.pay.diagnostic.impl.d dVar = (com.yandex.plus.pay.diagnostic.impl.d) ((com.yandex.plus.pay.diagnostic.impl.b) lVar.b.j.getValue()).c.getValue();
                i iVar7 = lVar.a;
                x3f a2 = iVar7.a();
                ((com.yandex.plus.core.dispatcher.a) iVar7.q).getClass();
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d(c6, dVar, a2, com.yandex.plus.core.dispatcher.a.e);
            case 10:
                i iVar8 = lVar.a;
                com.yandex.plus.domain.auth.impl.i iVar9 = iVar8.w;
                ExternalMediaBillingApi c7 = lVar.c();
                ((com.yandex.plus.core.dispatcher.a) iVar8.q).getClass();
                return new com.yandex.plus.pay.internal.feature.user.h(iVar9, c7, com.yandex.plus.core.dispatcher.a.e, lVar.b.e);
            case 11:
                return new com.yandex.plus.pay.internal.analytics.f((com.yandex.plus.pay.inapp.api.b) lVar.F.getValue(), (com.yandex.plus.pay.diagnostic.impl.f) ((com.yandex.plus.pay.diagnostic.impl.b) lVar.b.j.getValue()).a.getValue());
            case 12:
                return new com.yandex.plus.pay.internal.analytics.f((com.yandex.plus.pay.inapp.api.b) lVar.F.getValue(), (com.yandex.plus.pay.diagnostic.impl.f) ((com.yandex.plus.pay.diagnostic.impl.b) lVar.b.j.getValue()).d.getValue());
            case 13:
                i iVar10 = lVar.a;
                String str = iVar10.a;
                j jVar = new j(lVar, 23);
                j jVar2 = new j(lVar, 24);
                j jVar3 = new j(lVar, 25);
                j jVar4 = new j(lVar, 26);
                String uuid = lVar.b.e.a.toString();
                uuid.getClass();
                return new com.yandex.plus.core.network.api.interceptors.c(str, jVar, jVar2, jVar3, jVar4, uuid, iVar10.c(), iVar10.i, "PlusPaySdk");
            case 14:
                Function1 function1 = lVar.a.p;
                e eVar = lVar.b;
                jyr jyrVar = eVar.j;
                return new com.yandex.plus.pay.graphql.utils.a(function1, (com.yandex.plus.pay.diagnostic.impl.c) ((com.yandex.plus.pay.diagnostic.impl.b) jyrVar.getValue()).e.getValue(), (com.yandex.plus.pay.diagnostic.impl.e) ((com.yandex.plus.pay.diagnostic.impl.b) jyrVar.getValue()).b.getValue(), eVar.e);
            case 15:
                buu buuVar = new buu(lVar, null, 5);
                v0 v0Var = new v0(19);
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.network.api.interceptors.f fVar = new com.yandex.plus.core.network.api.interceptors.f(buuVar, v0Var, com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a));
                com.yandex.plus.pay.common.api.network.d dVar2 = (com.yandex.plus.pay.common.api.network.d) lVar.d.getValue();
                i iVar11 = lVar.a;
                joj jojVar = iVar11.o;
                dVar2.getClass();
                joj c8 = jojVar != null ? new OkHttpClient(jojVar).c() : new joj();
                ArrayList arrayList = c8.d;
                c8.d(u75.h(izm.HTTP_1_1, izm.HTTP_2));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c8.c(15L, timeUnit);
                c8.e(20L, timeUnit);
                c8.g(20L);
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                newCachedThreadPool.getClass();
                z98 z98Var = new z98();
                z98Var.c = newCachedThreadPool;
                z98Var.m(32);
                z98Var.n();
                c8.a = z98Var;
                c8.c.add(new com.yandex.plus.core.network.api.interceptors.a(2, dVar2.c));
                int i5 = 3;
                arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(i5, "PlusPaySDK-110.0.0"));
                com.yandex.plus.pay.log.impl.b bVar = dVar2.a;
                bVar.getClass();
                com.yandex.plus.pay.common.api.network.b[] bVarArr = com.yandex.plus.pay.common.api.network.b.a;
                arrayList.add(new com.yandex.plus.pay.common.api.network.c(new com.yandex.plus.home.feature.webviews.internal.stories.m(i5, bVar)));
                arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(dVar2.b));
                joj c9 = new OkHttpClient(c8).c();
                ArrayList arrayList2 = c9.c;
                c9.a((com.yandex.plus.core.network.api.interceptors.c) lVar.g.getValue());
                c9.a((com.yandex.plus.pay.internal.network.c) lVar.f.getValue());
                arrayList2.add(new com.yandex.plus.core.network.api.interceptors.a(i3, iVar11.w));
                arrayList2.add(fVar);
                c9.b((com.yandex.plus.core.network.api.interceptors.d) lVar.H.getValue());
                return new OkHttpClient(c9);
            case 16:
                com.yandex.plus.pay.graphql.utils.a aVar = (com.yandex.plus.pay.graphql.utils.a) lVar.h.getValue();
                OkHttpClient okHttpClient = (OkHttpClient) lVar.i.getValue();
                com.yandex.plus.core.network.urls.b bVar2 = (com.yandex.plus.core.network.urls.b) ((jyr) lVar.a.D.a).getValue();
                aVar.getClass();
                okHttpClient.getClass();
                bVar2.getClass();
                String uri = bVar2.getUrl().toString();
                uri.getClass();
                com.yandex.plus.pay.graphql.analytics.b bVar3 = new com.yandex.plus.pay.graphql.analytics.b(aVar.b, aVar.d, new URI(uri));
                joj c10 = okHttpClient.c();
                com.yandex.plus.core.network.api.interceptors.b bVar4 = new com.yandex.plus.core.network.api.interceptors.b(0);
                ArrayList arrayList3 = c10.c;
                arrayList3.add(bVar4);
                arrayList3.add(bVar3);
                com.yandex.plus.core.network.b bVar5 = new com.yandex.plus.core.network.b(new OkHttpClient(c10), new com.yandex.passport.sloth.ui.c(i3, bVar2));
                cp0 cp0Var = new cp0();
                cp0Var.e = uri;
                cp0Var.f = new bnd(22, bVar5);
                cp0Var.g = Boolean.TRUE;
                ArrayList arrayList4 = cp0Var.b;
                arrayList4.add(bVar3);
                arrayList4.add(new com.yandex.plus.pay.graphql.analytics.c(aVar.c));
                op opVar = z.b;
                com.yandex.plus.core.graphql.utils.a aVar2 = new com.yandex.plus.core.graphql.utils.a(0);
                opVar.getClass();
                qne qneVar = cp0Var.a;
                qneVar.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) qneVar.a;
                linkedHashMap.put(opVar.a, aVar2);
                op opVar2 = z.c;
                com.yandex.plus.core.graphql.utils.a aVar3 = new com.yandex.plus.core.graphql.utils.a(i2);
                opVar2.getClass();
                linkedHashMap.put(opVar2.a, aVar3);
                return ((cp0) aVar.a.invoke(cp0Var)).a();
            case 17:
                i iVar12 = lVar.a;
                com.yandex.plus.core.config.a a3 = iVar12.k.a();
                tf6 tf6Var = iVar12.l;
                ((com.yandex.plus.core.dispatcher.a) iVar12.q).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                com.yandex.plus.core.android.extensions.c.a.getClass();
                com.yandex.plus.core.android.extensions.a aVar4 = com.yandex.plus.core.android.extensions.b.b;
                dp0 a4 = lVar.a();
                a4.getClass();
                com.yandex.plus.core.graphql.internal.c cVar = new com.yandex.plus.core.graphql.internal.c(a4);
                com.yandex.plus.core.graphql.target.a aVar5 = (com.yandex.plus.core.graphql.target.a) lVar.e.getValue();
                Map e = uah.e(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM), new Pair("platform_version", Build.VERSION.RELEASE), new Pair("pay_service_name", iVar12.a), new Pair("pay_sdk_version", "110.0.0"), new Pair("client_app_version", iVar12.i));
                long j = iVar12.A;
                com.yandex.plus.pay.log.impl.b bVar6 = lVar.b.e;
                j jVar5 = new j(lVar, 27);
                com.yandex.plus.experiments.impl.a aVar6 = new com.yandex.plus.experiments.impl.a(new com.yandex.plus.experiments.api.b(a3, tf6Var, mn7Var, aVar4, cVar, aVar5, jVar5, e, bVar6, j));
                SharedPreferences sharedPreferences = iVar12.j.getSharedPreferences("com.yandex.plus.pay.experiments", 0);
                com.yandex.plus.experiments.api.providers.a aVar7 = (com.yandex.plus.experiments.api.providers.a) aVar6.b.getValue();
                x3f a5 = iVar12.a();
                sharedPreferences.getClass();
                a5.getClass();
                return aVar6.a(aVar7, new com.yandex.plus.experiments.impl.cache.c(aVar4, j, a3, mn7Var, a5, sharedPreferences, jVar5), new com.yandex.plus.experiments.impl.cooldown.c(aVar4, mn7Var, sharedPreferences));
            case 18:
                i iVar13 = lVar.a;
                com.yandex.plus.domain.auth.impl.i iVar14 = iVar13.w;
                ExternalMediaBillingApi c11 = lVar.c();
                ((com.yandex.plus.core.dispatcher.a) iVar13.q).getClass();
                return new com.yandex.plus.pay.internal.feature.user.f(iVar14, c11, com.yandex.plus.core.dispatcher.a.e, lVar.b.e);
            case 19:
                OkHttpClient okHttpClient2 = (OkHttpClient) lVar.i.getValue();
                i iVar15 = lVar.a;
                com.yandex.plus.core.network.urls.b bVar7 = (com.yandex.plus.core.network.urls.b) ((jyr) iVar15.D.d).getValue();
                x3f a6 = iVar15.a();
                okHttpClient2.getClass();
                bVar7.getClass();
                a6.getClass();
                com.yandex.plus.core.network.b bVar8 = new com.yandex.plus.core.network.b(new OkHttpClient(okHttpClient2.c()), new com.yandex.passport.sloth.ui.c(i3, bVar7));
                uao uaoVar = new uao();
                uaoVar.e.add(new com.yandex.plus.core.network.api.d(i4));
                uaoVar.a(new com.yandex.plus.core.network.c(a6));
                uaoVar.b = bVar8;
                uaoVar.b(bVar7.getUrl().toString());
                return (ExternalMediaBillingApi) uaoVar.c().b(ExternalMediaBillingApi.class);
            case 20:
                com.yandex.plus.pay.data.acquisition.a aVar8 = PlusPayAcquisitionApi.Companion;
                OkHttpClient okHttpClient3 = (OkHttpClient) lVar.i.getValue();
                i iVar16 = lVar.a;
                com.yandex.plus.core.network.urls.b bVar9 = (com.yandex.plus.core.network.urls.b) ((jyr) iVar16.D.f).getValue();
                x3f a7 = iVar16.a();
                aVar8.getClass();
                okHttpClient3.getClass();
                bVar9.getClass();
                a7.getClass();
                com.yandex.plus.core.network.b bVar10 = new com.yandex.plus.core.network.b(new OkHttpClient(okHttpClient3.c()), new com.yandex.passport.sloth.ui.c(i3, bVar9));
                uao uaoVar2 = new uao();
                uaoVar2.e.add(new com.yandex.plus.core.network.api.d(i4));
                uaoVar2.a(new com.yandex.plus.core.network.c(a7));
                uaoVar2.b = bVar10;
                uaoVar2.b(bVar9.getUrl().toString());
                return (PlusPayAcquisitionApi) uaoVar2.c().b(PlusPayAcquisitionApi.class);
            case 21:
                return lVar.a.g;
            case 22:
                Set set = (Set) ((com.yandex.plus.pay.common.internal.featureflags.a) ((com.yandex.plus.pay.common.internal.featureflags.c) lVar.c.invoke())).h.getValue();
                return set == null ? q5b.a : set;
            case 23:
                return ((com.yandex.plus.domain.auth.api.e) lVar.a.w.h.getValue()).getId();
            case 24:
                return lVar.a.s.b();
            case 25:
                return lVar.a.s.a();
            case 26:
                com.yandex.plus.home.plaque.animator.internal.utils.a aVar9 = com.yandex.plus.pay.common.api.model.a.b;
                Context context = lVar.a.j;
                aVar9.getClass();
                return com.yandex.plus.home.plaque.animator.internal.utils.a.f(context, true).a;
            case 27:
                return ((com.yandex.plus.domain.auth.api.e) lVar.a.w.h.getValue()).getId();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                e eVar2 = lVar.b;
                com.yandex.plus.pay.log.impl.b bVar11 = eVar2.e;
                ExternalMediaBillingApi c12 = lVar.c();
                com.yandex.plus.pay.diagnostic.impl.d dVar3 = (com.yandex.plus.pay.diagnostic.impl.d) ((com.yandex.plus.pay.diagnostic.impl.b) eVar2.j.getValue()).c.getValue();
                ((com.yandex.plus.core.dispatcher.a) lVar.a.q).getClass();
                return new com.yandex.plus.pay.internal.feature.subscription.b(bVar11, c12, dVar3, com.yandex.plus.core.dispatcher.a.e);
            default:
                return new com.yandex.plus.pay.graphql.upsale.c(lVar.a(), new com.yandex.plus.metrica.utils.n(0, lVar.a.b(), com.yandex.plus.core.locale.b.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1, 21), lVar.b());
        }
    }
}
