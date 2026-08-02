package com.yandex.plus.home.internal.di;

import android.content.Context;
import android.os.Build;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.graphql.type.r0;
import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import com.yandex.plus.pay.adapter.internal.c1;
import defpackage.b6e;
import defpackage.dp0;
import defpackage.jyr;
import defpackage.mn7;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.uah;
import defpackage.x3f;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, e eVar, tf6 tf6Var) {
        this.a = 22;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01db, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        int i = this.a;
        int i2 = 11;
        boolean z2 = false;
        Object[] objArr = 0;
        int i3 = 1;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.b().getClass();
                return new a1(i2);
            case 1:
                final com.yandex.plus.core.openapi.g[] gVarArr = {new com.yandex.plus.home.network.restapi.processors.b(), new com.yandex.plus.home.network.restapi.processors.a(lVar.c.b(), (com.yandex.plus.home.core.network.d) lVar.e.p.getValue())};
                return new com.yandex.plus.core.openapi.g() { // from class: com.yandex.plus.core.openapi.e
                    @Override // com.yandex.plus.core.openapi.g
                    public final void a(a aVar) {
                        aVar.getClass();
                        for (g gVar : gVarArr) {
                            gVar.a(aVar);
                        }
                    }
                };
            case 2:
                dp0 b = lVar.e.b();
                com.yandex.plus.core.graphql.target.d dVar = (com.yandex.plus.core.graphql.target.d) lVar.p.getValue();
                d dVar2 = lVar.c;
                com.yandex.plus.home.analytics.diagnostic.panel.a aVar = (com.yandex.plus.home.analytics.diagnostic.panel.a) dVar2.u.getValue();
                com.yandex.plus.home.panel.a aVar2 = (com.yandex.plus.home.panel.a) dVar2.r.getValue();
                com.yandex.plus.core.graphql.utils.b bVar = (com.yandex.plus.core.graphql.utils.b) lVar.B.getValue();
                e eVar = lVar.d;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, eVar, e.class, "createLitePanelDataFetchingBenchmark", "createLitePanelDataFetchingBenchmark()Lcom/yandex/plus/core/benchmark/DataFetchingBenchmark;", 0, 12);
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar2 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, eVar, e.class, "createHeavyPanelDataFetchingBenchmark", "createHeavyPanelDataFetchingBenchmark()Lcom/yandex/plus/core/benchmark/DataFetchingBenchmark;", 0, 13);
                u uVar = lVar.b;
                return new com.yandex.plus.home.graphql.panel.g(b, dVar, aVar, aVar2, bVar, iVar, iVar2, uVar.w, lVar.h, uVar.x, new f(lVar, 15));
            case 3:
                return new com.yandex.plus.core.graphql.utils.b((x3f) lVar.e.i.getValue());
            case 4:
                dp0 b2 = lVar.e.b();
                i iVar3 = new i(lVar, 1);
                u uVar2 = lVar.b;
                return new com.yandex.plus.home.graphql.user.e(b2, iVar3, new k(uVar2.l), uVar2.w, lVar.h, uVar2.x);
            case 5:
                u uVar3 = lVar.b;
                return new com.yandex.plus.resources.core.c(uVar3.a, ((c1) uVar3.a()).b());
            case 6:
                dp0 b3 = lVar.e.b();
                com.yandex.plus.core.graphql.target.d dVar3 = (com.yandex.plus.core.graphql.target.d) lVar.p.getValue();
                b3.getClass();
                dVar3.getClass();
                return new com.yandex.plus.home.graphql.alerts.b();
            case 7:
                lVar.e.b().getClass();
                return new com.yandex.plus.home.graphql.alerts.a();
            case 8:
                return new com.yandex.plus.core.graphql.target.a((com.yandex.plus.core.location.a) lVar.l.getValue());
            case 9:
                com.yandex.plus.core.graphql.target.a aVar3 = (com.yandex.plus.core.graphql.target.a) lVar.o.getValue();
                u uVar4 = lVar.b;
                return new com.yandex.plus.core.graphql.target.d(aVar3, uVar4.s, uVar4.o, lVar.a, new f(lVar, 12), new f(lVar, 13), new g(lVar, objArr2 == true ? 1 : 0, i3), new f(lVar, 14));
            case 10:
                return uah.e(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM), new Pair("platform_version", Build.VERSION.RELEASE), new Pair("service_name", "music"), new Pair("plus_sdk_version", "110.0.0"), new Pair("client_app_version", lVar.b.s));
            case 11:
                return ((com.yandex.plus.domain.auth.api.e) lVar.g.h.getValue()).getId();
            case 12:
                Object f = lVar.a().f();
                r7o r7oVar = z7o.b;
                if (f instanceof t7o) {
                    f = null;
                }
                com.yandex.plus.experiments.api.a aVar4 = (com.yandex.plus.experiments.api.a) f;
                if (aVar4 != null) {
                    return aVar4.c;
                }
                return null;
            case 13:
                Object f2 = lVar.a().f();
                r7o r7oVar2 = z7o.b;
                if (f2 instanceof t7o) {
                    f2 = null;
                }
                com.yandex.plus.experiments.api.a aVar5 = (com.yandex.plus.experiments.api.a) f2;
                if (aVar5 != null) {
                    return aVar5.d;
                }
                return null;
            case 14:
                u uVar5 = lVar.b;
                com.yandex.plus.ui.core.theme.a aVar6 = (com.yandex.plus.ui.core.theme.a) uVar5.c.a.getValue();
                Context context = uVar5.a;
                int ordinal = aVar6.ordinal();
                if (ordinal == 0) {
                    return r0.DARK;
                }
                if (ordinal == 1) {
                    return r0.LIGHT;
                }
                if (ordinal == 2) {
                    return com.yandex.plus.home.common.utils.a.i(context) ? r0.DARK : r0.LIGHT;
                }
                b6e.s();
                return null;
            case 15:
                if (lVar.b.b != com.yandex.plus.core.config.a.a) {
                    Object value = lVar.g.h.getValue();
                    com.yandex.plus.domain.auth.api.b bVar2 = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
                    if (bVar2 == null) {
                        z = false;
                        break;
                    } else {
                        z = bVar2.c;
                        break;
                    }
                }
                z2 = true;
                return Boolean.valueOf(z2);
            case 16:
                u uVar6 = lVar.b;
                com.yandex.plus.core.config.a aVar7 = uVar6.b;
                tf6 tf6Var = lVar.h;
                ((com.yandex.plus.core.dispatcher.a) uVar6.w).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                com.yandex.plus.core.android.extensions.c.a.getClass();
                return new com.yandex.plus.experiments.impl.a(new com.yandex.plus.experiments.api.b(aVar7, tf6Var, mn7Var, com.yandex.plus.core.android.extensions.b.b, (com.yandex.plus.core.graphql.internal.c) lVar.e.k.getValue(), (com.yandex.plus.core.graphql.target.a) lVar.o.getValue(), new f(lVar, i2), (Map) lVar.r.getValue(), uVar6.x, uVar6.u));
            case 17:
                g gVar = new g(lVar, objArr3 == true ? 1 : 0, objArr == true ? 1 : 0);
                com.yandex.plus.core.android.extensions.c.a.getClass();
                com.yandex.plus.core.android.extensions.a aVar8 = com.yandex.plus.core.android.extensions.b.b;
                com.yandex.plus.experiments.impl.a aVar9 = (com.yandex.plus.experiments.impl.a) lVar.s.getValue();
                p pVar = lVar.e;
                Object value2 = pVar.e.getValue();
                value2.getClass();
                int i4 = 0;
                int i5 = 0;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar4 = new com.yandex.plus.home.feature.webviews.internal.stories.i(i5, pVar, p.class, "getHomeExperimentsEndpoint", "getHomeExperimentsEndpoint()Ljava/lang/String;", i4, 10);
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar5 = new com.yandex.plus.home.feature.webviews.internal.stories.i(i5, pVar, p.class, "getPullFormatsExperimentsEndpoint", "getPullFormatsExperimentsEndpoint()Ljava/lang/String;", i4, 11);
                com.yandex.plus.core.openapi.g c = lVar.c();
                u uVar7 = lVar.b;
                com.yandex.plus.home.graphql.experiments.k kVar = new com.yandex.plus.home.graphql.experiments.k((CommonExperimentsControllerApi) value2, iVar4, iVar5, c, (Map) lVar.r.getValue());
                com.yandex.plus.core.config.a aVar10 = uVar7.b;
                long j = uVar7.u;
                jyr jyrVar = (jyr) lVar.f.d;
                return aVar9.a(kVar, new com.yandex.plus.home.graphql.experiments.e(aVar8, j, aVar10, (com.yandex.plus.home.datasource.local.preferences.a) jyrVar.getValue(), gVar), new com.yandex.plus.experiments.impl.cooldown.c(aVar8, (com.yandex.plus.home.datasource.local.preferences.a) jyrVar.getValue(), gVar));
            case 18:
                com.yandex.plus.home.datasource.local.preferences.a aVar11 = (com.yandex.plus.home.datasource.local.preferences.a) ((jyr) lVar.f.c).getValue();
                u uVar8 = lVar.b;
                com.yandex.plus.core.config.a aVar12 = uVar8.b;
                Object value3 = lVar.e.f.getValue();
                value3.getClass();
                SdkConfigurationControllerApi sdkConfigurationControllerApi = (SdkConfigurationControllerApi) value3;
                com.yandex.plus.core.openapi.g c2 = lVar.c();
                ((com.yandex.plus.core.dispatcher.a) uVar8.w).getClass();
                mn7 mn7Var2 = com.yandex.plus.core.dispatcher.a.e;
                com.yandex.plus.core.android.extensions.c.a.getClass();
                return new com.yandex.plus.home.graphql.configuration.j(aVar11, aVar12, sdkConfigurationControllerApi, c2, com.yandex.plus.core.android.extensions.b.b, uVar8.t, lVar.h, mn7Var2, uVar8.x);
            case 19:
                com.yandex.plus.core.openapi.g c3 = lVar.c();
                Object value4 = lVar.e.g.getValue();
                value4.getClass();
                PlusStateControllerApi plusStateControllerApi = (PlusStateControllerApi) value4;
                com.yandex.plus.core.location.a aVar13 = (com.yandex.plus.core.location.a) lVar.l.getValue();
                i iVar6 = new i(lVar, 0);
                u uVar9 = lVar.b;
                return new com.yandex.plus.home.graphql.plusstate.f(plusStateControllerApi, c3, aVar13, iVar6, uVar9.w, lVar.h, uVar9.x);
            case 20:
                return new com.yandex.plus.home.graphql.subscription.d(lVar.e.b(), (com.yandex.plus.core.graphql.target.d) lVar.p.getValue(), (com.yandex.plus.core.graphql.utils.b) lVar.B.getValue());
            case 21:
                u uVar10 = lVar.b;
                return new com.yandex.plus.home.payment.google.d(uVar10.a(), uVar10.p, (com.yandex.plus.home.payment.google.g) lVar.y.getValue());
            case 22:
                com.yandex.plus.home.graphql.alerts.b bVar3 = (com.yandex.plus.home.graphql.alerts.b) lVar.m.getValue();
                com.yandex.plus.home.graphql.alerts.a aVar14 = (com.yandex.plus.home.graphql.alerts.a) lVar.n.getValue();
                bVar3.getClass();
                aVar14.getClass();
                return new com.yandex.plus.home.alerts.a();
            case 23:
                return new com.yandex.plus.home.user.b((com.yandex.plus.home.graphql.user.e) lVar.j.getValue());
            default:
                return new com.yandex.plus.home.family.b((com.yandex.plus.home.graphql.user.e) lVar.j.getValue());
        }
    }

    public /* synthetic */ f(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }
}
