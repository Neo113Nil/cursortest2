package defpackage;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c;
import com.yandex.plus.adapter.auth.passport750.i;
import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.benchmark.b0;
import com.yandex.plus.core.benchmark.d0;
import com.yandex.plus.core.benchmark.y;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.home.datasource.openapi.apis.MissionPlatformControllerApi;
import com.yandex.plus.home.f;
import com.yandex.plus.home.featureflags.g;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.k;
import com.yandex.plus.home.network.hosts.a;
import com.yandex.plus.home.r;
import com.yandex.plus.home.t;
import com.yandex.plus.paymentsdk.internal.method.e;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class j7m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ j7m(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a cVar;
        String str;
        int i = 0;
        switch (this.a) {
            case 0:
                pzl pzlVar = this.b;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(b7m.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                int i2 = 5;
                rp7Var.D(new j7m(pzlVar, i2));
                o18Var.c = hag.I(u7m.class);
                rp7Var.getClass();
                rp7Var.D(new j7m(pzlVar, 1));
                o18Var.c = hag.I(o5m.class);
                rp7Var.getClass();
                rp7Var.D(new j7m(pzlVar, 2));
                o18Var.c = hag.I(q7m.class);
                rp7Var.getClass();
                rp7Var.D(new j7m(pzlVar, 3));
                o18Var.c = hag.I(com.yandex.plus.pay.ui.core.a.class);
                rp7Var.getClass();
                int i3 = 4;
                rp7Var.D(new j7m(pzlVar, i3));
                o18Var.c = hag.I(v7m.class);
                rp7Var.getClass();
                int i4 = 6;
                rp7Var.D(new j7m(pzlVar, i4));
                o18Var.c = hag.I(e.class);
                rp7Var.getClass();
                rp7Var.D(new j7m(pzlVar, 7));
                o18Var.c = hag.I(w7m.class);
                rp7Var.getClass();
                rp7Var.D(new j7m(pzlVar, 8));
                o18Var.c = hag.I(b.class);
                rp7Var.getClass();
                rp7Var.E(new j7m(pzlVar, 9));
                o18Var.c = hag.I(com.yandex.plus.pay.a.class);
                rp7Var.getClass();
                rp7Var.E(new j7m(pzlVar, 10));
                o18Var.c = hag.I(com.yandex.plus.pay.adapter.api.a.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(2));
                o18Var.c = hag.I(j9m.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(3));
                o18Var.c = hag.I(com.yandex.plus.acquisition.sdk.pay.impl.b.class);
                rp7Var.getClass();
                rp7Var.E(new j7m(pzlVar, 11));
                o18Var.c = hag.I(com.yandex.plus.acquisition.sdk.common.impl.di.b.class);
                rp7Var.getClass();
                rp7Var.E(new j7m(pzlVar, 12));
                o18Var.c = hag.I(c.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(i3));
                o18Var.c = hag.I(com.yandex.plus.acquisition.adapter.api.a.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(i2));
                o18Var.c = hag.I(t.class);
                rp7Var.getClass();
                rp7Var.E(new j7m(pzlVar, 13));
                o18Var.c = hag.I(o7m.class);
                rp7Var.getClass();
                rp7Var.D(new k7m(i4));
                o18Var.c = hag.I(n7m.class);
                rp7Var.getClass();
                rp7Var.D(new w5m(26));
                o18Var.c = hag.I(m7m.class);
                rp7Var.getClass();
                rp7Var.D(new w5m(27));
                o18Var.c = hag.I(e5c.class);
                rp7Var.getClass();
                rp7Var.D(new w5m(28));
                o18Var.c = hag.I(l7m.class);
                rp7Var.getClass();
                rp7Var.D(new w5m(29));
                o18Var.c = hag.I(h8n.class);
                rp7Var.getClass();
                rp7Var.D(new k7m(i));
                o18Var.c = hag.I(x87.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(1));
                return Unit.a;
            case 1:
                pzl pzlVar2 = this.b;
                ((l13) obj).getClass();
                return (u7m) ((h7m) pzlVar2.b).a().d.getValue();
            case 2:
                pzl pzlVar3 = this.b;
                ((l13) obj).getClass();
                return (o5m) ((h7m) pzlVar3.b).a().e.getValue();
            case 3:
                pzl pzlVar4 = this.b;
                ((l13) obj).getClass();
                return (q7m) ((h7m) pzlVar4.b).a().k.getValue();
            case 4:
                pzl pzlVar5 = this.b;
                ((l13) obj).getClass();
                return (com.yandex.plus.pay.ui.core.a) ((h7m) pzlVar5.b).a().b.getValue();
            case 5:
                pzl pzlVar6 = this.b;
                ((l13) obj).getClass();
                return (b7m) ((h7m) pzlVar6.b).a().c.getValue();
            case 6:
                pzl pzlVar7 = this.b;
                ((l13) obj).getClass();
                return (v7m) ((h7m) pzlVar7.b).a().g.getValue();
            case 7:
                pzl pzlVar8 = this.b;
                ((l13) obj).getClass();
                return (e) ((h7m) pzlVar8.b).a().i.getValue();
            case 8:
                pzl pzlVar9 = this.b;
                ((l13) obj).getClass();
                return (w7m) ((h7m) pzlVar9.b).a().h.getValue();
            case 9:
                pzl pzlVar10 = this.b;
                ((l13) obj).getClass();
                return (b) ((h7m) pzlVar10.b).a().f.getValue();
            case 10:
                pzl pzlVar11 = this.b;
                ((l13) obj).getClass();
                return ((h7m) pzlVar11.b).a().a();
            case 11:
                pzl pzlVar12 = this.b;
                ((l13) obj).getClass();
                h7m h7mVar = (h7m) pzlVar12.b;
                com.yandex.plus.pay.a a = h7mVar.a().a();
                com.yandex.plus.pay.ui.core.a aVar = (com.yandex.plus.pay.ui.core.a) h7mVar.a().b.getValue();
                dq7 dq7Var = ca8.a;
                return (com.yandex.plus.acquisition.sdk.pay.impl.b) ((jyr) new h(a, aVar, mn7.d).e).getValue();
            case 12:
                pzl pzlVar13 = this.b;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(b7m.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                b7m b7mVar = (b7m) qdcVar.D(I, l13Var, set);
                u7m u7mVar = (u7m) qdcVar.D(hag.I(u7m.class), l13Var, set);
                Context context = (Context) ((h7m) pzlVar13.b).a.getValue();
                i iVar = (i) ((o5m) qdcVar.D(hag.I(o5m.class), l13Var, set)).a.getValue();
                fkn c = b7mVar.c(u7mVar.c());
                com.yandex.plus.core.config.a a2 = b7m.a(u7mVar.b());
                a6m a6mVar = new a6m(u7mVar, 1);
                com.yandex.plus.metrica.api.b bVar = com.yandex.plus.metrica.api.b.a;
                return new com.yandex.plus.acquisition.sdk.common.impl.di.b(new com.yandex.plus.acquisition.sdk.common.api.di.b(context, iVar, c, a2, a6mVar));
            default:
                pzl pzlVar14 = this.b;
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                b7m b7mVar2 = (b7m) l13Var2.a.D(hag.I(b7m.class), l13Var2, l13Var2.b);
                u7m u7mVar2 = (u7m) l13Var2.a.D(hag.I(u7m.class), l13Var2, l13Var2.b);
                Context context2 = (Context) ((h7m) pzlVar14.b).a.getValue();
                com.yandex.plus.core.config.a a3 = b7m.a(u7mVar2.b());
                fkn c2 = b7mVar2.c(u7mVar2.c());
                i iVar2 = (i) ((o5m) l13Var2.a.D(hag.I(o5m.class), l13Var2, l13Var2.b)).a.getValue();
                b bVar2 = (b) l13Var2.a.D(hag.I(b.class), l13Var2, l13Var2.b);
                com.yandex.plus.pay.adapter.api.a aVar2 = (com.yandex.plus.pay.adapter.api.a) l13Var2.a.D(hag.I(com.yandex.plus.pay.adapter.api.a.class), l13Var2, l13Var2.b);
                com.yandex.plus.metrica.api.b bVar3 = com.yandex.plus.metrica.api.b.a;
                com.yandex.plus.acquisition.adapter.api.a aVar3 = (com.yandex.plus.acquisition.adapter.api.a) l13Var2.a.D(hag.I(com.yandex.plus.acquisition.adapter.api.a.class), l13Var2, l13Var2.b);
                com.yandex.plus.metrica.api.b bVar4 = com.yandex.plus.metrica.api.b.a;
                context2.getClass();
                iVar2.getClass();
                int i5 = 22;
                avi aviVar = new avi(i5, l13Var2, u7mVar2);
                f fVar = new f();
                com.yandex.plus.bdui.plus.webview.navigation.a aVar4 = new com.yandex.plus.bdui.plus.webview.navigation.a(17);
                aviVar.invoke(fVar);
                Context applicationContext = context2.getApplicationContext();
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                d a4 = com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a);
                g.a.getClass();
                g gVar = (g) com.yandex.plus.home.featureflags.f.c.getValue();
                com.yandex.plus.bdui.plus.checkout.h hVar = new com.yandex.plus.bdui.plus.checkout.h(i5, gVar);
                applicationContext.getClass();
                String str2 = fVar.a;
                joj jojVar = fVar.b;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                Integer num = fVar.c;
                int intValue = num != null ? num.intValue() : 10000;
                int ordinal = a3.ordinal();
                if (ordinal == 0) {
                    cVar = new com.yandex.plus.home.network.hosts.c(fVar.d, hVar, a4);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    cVar = new com.yandex.plus.home.network.hosts.b(fVar.d, hVar, a4);
                }
                a aVar5 = cVar;
                vdr vdrVar = fVar.e;
                if (vdrVar == null) {
                    vdrVar = ydr.a(Boolean.FALSE);
                }
                vdr vdrVar2 = vdrVar;
                com.yandex.plus.ui.core.theme.provider.c.a.getClass();
                com.yandex.plus.ui.core.theme.provider.a aVar6 = com.yandex.plus.ui.core.theme.provider.b.b;
                com.yandex.plus.core.locale.a aVar7 = fVar.f;
                if (aVar7 == null) {
                    aVar7 = new com.yandex.plus.home.d(0);
                }
                com.yandex.plus.core.locale.a aVar8 = aVar7;
                com.yandex.plus.home.api.payment.google.c cVar2 = fVar.g;
                if (cVar2 == null) {
                    cVar2 = com.yandex.plus.home.api.payment.google.a.a;
                }
                com.yandex.plus.home.api.payment.google.c cVar3 = cVar2;
                String packageName = applicationContext.getPackageName();
                if (packageName == null) {
                    packageName = "";
                }
                String str3 = packageName;
                String h = com.yandex.plus.home.common.utils.a.h(applicationContext);
                msa msaVar = nsa.b;
                ssa ssaVar = ssa.HOURS;
                long M = yd5.M(2, ssaVar);
                long M2 = yd5.M(12, ssaVar);
                int i6 = 24;
                q qVar = new q(24);
                com.yandex.plus.core.dispatcher.a aVar9 = com.yandex.plus.core.dispatcher.b.a;
                u uVar = new u(applicationContext, a3, c2, iVar2, bVar2, aVar2, str2, jojVar, aVar4, e5bVar, intValue, aVar5, vdrVar2, aVar6, aVar8, cVar3, gVar, str3, h, M, M2, qVar, aVar9, a4, aVar3);
                com.yandex.plus.home.e eVar = new com.yandex.plus.home.e(uVar, i);
                w wVar = new w(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26);
                int ordinal2 = a3.ordinal();
                if (ordinal2 == 0) {
                    str = "2ca89da6-ea92-4997-80c4-6f78e0b7c571";
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    str = "efc3d9ed-dd0d-44a1-a61a-3dac9b777047";
                }
                com.yandex.plus.metrica.a a5 = bVar3.a(applicationContext, str, "PLUSSDKA", "com.yandex.plus.home", "plus_hq_mobile", a3, eVar, wVar);
                List h2 = u75.h(new Pair(new com.yandex.plus.home.benchmark.pulse.a(0), a5.a()), new Pair(new b0("PlusSDK"), new d0(new w(0, a5.a(), com.yandex.plus.core.analytics.h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 25))));
                h2.getClass();
                com.yandex.plus.home.benchmark.d dVar = new com.yandex.plus.home.benchmark.d(wVar, h2, qVar, aVar9);
                t tVar = (t) r1.R(dVar, "Initialization", new com.yandex.passport.internal.ui.sloth.ebs.i(9, uVar, a5, dVar));
                tVar.getClass();
                com.yandex.plus.home.plaque.plugin.internal.proxy.i iVar3 = new com.yandex.plus.home.plaque.plugin.internal.proxy.i(btf.b(new com.yandex.plus.bdui.content.b(i6, new l(tVar), new com.yandex.plus.home.plaque.plugin.internal.di.c(new com.yandex.plus.home.plaque.plugin.internal.di.d(tVar, c5b.a)))));
                t tVar2 = tVar;
                synchronized (tVar2) {
                    if (tVar2.b(com.yandex.plus.home.plaque.plugin.internal.proxy.i.class) == null) {
                        tVar2.a(com.yandex.plus.home.plaque.plugin.internal.proxy.i.class, iVar3);
                    }
                }
                u uVar2 = tVar.b;
                Context context3 = uVar2.a;
                ((com.yandex.plus.core.dispatcher.a) uVar2.w).getClass();
                dq7 dq7Var2 = com.yandex.plus.core.dispatcher.a.f;
                ((com.yandex.plus.core.dispatcher.a) uVar2.w).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                com.yandex.plus.home.dailyquests.repository.rest.prefs.d0 d0Var = new com.yandex.plus.home.dailyquests.repository.rest.prefs.d0(context3, dq7Var2, mn7Var);
                Object b = tVar.e.c().b(MissionPlatformControllerApi.class);
                b.getClass();
                com.yandex.plus.core.openapi.g c3 = tVar.f.c();
                k kVar = new k(tVar, 2);
                ((com.yandex.plus.core.dispatcher.a) uVar2.w).getClass();
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.c cVar4 = new com.yandex.plus.home.dailyquests.plugin.internal.proxy.c(new r(i, tVar), new com.yandex.plus.home.dailyquests.feature.api.c(new com.yandex.plus.home.dailyquests.repository.rest.c(d0Var, (MissionPlatformControllerApi) b, c3, kVar, mn7Var), new com.yandex.plus.home.dailyquests.plugin.internal.proxy.d((com.yandex.plus.home.core.navigation.a) ((jyr) tVar.g.e).getValue(), 0), new com.yandex.plus.home.dailyquests.plugin.internal.proxy.a(tVar.d.a(), 0), uVar2.e, uVar2.c, new com.yandex.plus.core.theme.e((com.yandex.plus.core.theme.d) uVar2.B.getValue()), uVar2.w, new k(tVar, 3)));
                synchronized (tVar2) {
                    if (tVar2.b(com.yandex.plus.home.dailyquests.plugin.internal.proxy.c.class) == null) {
                        tVar2.a(com.yandex.plus.home.dailyquests.plugin.internal.proxy.c.class, cVar4);
                    }
                }
                return tVar;
        }
    }
}
