package com.yandex.plus.bdui.content;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.bdui.plus.content.controller.k;
import com.yandex.plus.bdui.plus.content.serializer.h2;
import com.yandex.plus.bdui.plus.content.serializer.u0;
import com.yandex.plus.bdui.v;
import com.yandex.plus.bdui.z;
import com.yandex.plus.core.benchmark.i;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.o;
import com.yandex.plus.core.benchmark.p;
import com.yandex.plus.core.benchmark.r;
import com.yandex.plus.core.benchmark.s;
import com.yandex.plus.core.benchmark.t;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.divkit.impl.n;
import com.yandex.plus.home.analytics.g;
import com.yandex.plus.home.feature.webviews.internal.webview.h;
import com.yandex.plus.home.graphql.plusstate.e;
import com.yandex.plus.metrica.utils.y;
import defpackage.b6e;
import defpackage.bd8;
import defpackage.btf;
import defpackage.ezc;
import defpackage.fkn;
import defpackage.gld;
import defpackage.h0l;
import defpackage.i5f;
import defpackage.jyr;
import defpackage.mun;
import defpackage.ri7;
import defpackage.t0a;
import defpackage.tah;
import defpackage.tf6;
import defpackage.u13;
import defpackage.uop;
import defpackage.v75;
import defpackage.v7k;
import defpackage.vop;
import defpackage.wj9;
import defpackage.xdr;
import defpackage.xzb;
import defpackage.y7k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(com.yandex.plus.home.feature.webviews.internal.smart.contract.b bVar, h hVar) {
        this.a = 20;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        this.b = bVar;
        this.c = hVar;
    }

    /* JADX WARN: Type inference failed for: r5v38, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s sVar;
        int i = this.a;
        Continuation continuation = null;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Set e = vop.e(((c) obj2).a);
                e.getClass();
                return com.yandex.plus.core.network.api.utils.a.y(tah.b(new Pair(v.a, e)), (Map) obj);
            case 1:
                return new mun((ri7) ((t0a) obj2).invoke(), (tf6) obj);
            case 2:
                Set b = uop.b(((com.yandex.plus.bdui.model.a) obj2).a);
                b.getClass();
                return com.yandex.plus.core.network.api.utils.a.y(tah.b(new Pair(z.a, b)), (Map) obj);
            case 3:
                Collection collection = (Collection) obj2;
                com.yandex.plus.bdui.plus.benchmarks.a aVar = (com.yandex.plus.bdui.plus.benchmarks.a) obj;
                if (collection == null) {
                    return new ConcurrentHashMap();
                }
                Collection<i> collection2 = collection;
                x xVar = aVar.a;
                ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
                for (i iVar : collection2) {
                    com.yandex.plus.core.benchmark.c cVar = (com.yandex.plus.core.benchmark.c) xVar;
                    cVar.getClass();
                    iVar.getClass();
                    arrayList.add(new l(cVar.d(iVar.getName()), cVar.a, iVar));
                }
                int a = tah.a(v75.o(arrayList, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((l) next).a, next);
                }
                return new ConcurrentHashMap(linkedHashMap);
            case 4:
                r rVar = (r) obj2;
                x xVar2 = ((com.yandex.plus.bdui.plus.benchmarks.a) obj).a;
                if (rVar == null) {
                    com.yandex.plus.core.benchmark.c cVar2 = (com.yandex.plus.core.benchmark.c) xVar2;
                    cVar2.getClass();
                    return new t(new h2(1, cVar2, com.yandex.plus.core.benchmark.c.class, "getParams", "getParams(Ljava/lang/String;)Ljava/util/List;", 0, 28), cVar2.a, new s(o.a, 0L));
                }
                com.yandex.plus.core.benchmark.c cVar3 = (com.yandex.plus.core.benchmark.c) xVar2;
                cVar3.getClass();
                h2 h2Var = new h2(1, cVar3, com.yandex.plus.core.benchmark.c.class, "getParams", "getParams(Ljava/lang/String;)Ljava/util/List;", 0, 29);
                q qVar = cVar3.a;
                if (rVar instanceof p) {
                    sVar = new s(o.a, 0L);
                } else {
                    if (!(rVar instanceof com.yandex.plus.core.benchmark.q)) {
                        b6e.s();
                        return null;
                    }
                    sVar = new s(o.b, ((com.yandex.plus.core.benchmark.q) rVar).a);
                }
                return new t(h2Var, qVar, sVar);
            case 5:
                Context context = (Context) obj;
                com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) ((com.yandex.plus.pay.ui.design.api.api.a) obj2)).a.a.getValue();
                context.getClass();
                return Boolean.valueOf(u.r(context, aVar2));
            case 6:
                com.yandex.plus.bdui.plus.content.controller.l lVar = (com.yandex.plus.bdui.plus.content.controller.l) obj;
                return new k(new com.yandex.passport.internal.ui.bouncer.p(17, lVar, new f((m) obj2, lVar.i)));
            case 7:
                return new com.yandex.plus.bdui.plus.content.serializer.q(((u0) obj2).e, (com.yandex.plus.log.api.b) obj);
            case 8:
                com.yandex.plus.core.debug.panel.internal.presentation.view.d dVar = (com.yandex.plus.core.debug.panel.internal.presentation.view.d) obj;
                int i3 = com.yandex.plus.core.debug.panel.internal.presentation.view.d.o;
                return new com.yandex.plus.core.debug.panel.internal.presentation.view.f((Context) obj2, dVar.a, dVar.c, dVar.d, dVar.f);
            case 9:
                int i4 = com.yandex.plus.core.debug.panel.internal.presentation.view.d.o;
                ((com.yandex.plus.core.debug.panel.internal.presentation.view.i) obj2).invoke();
                ((com.yandex.plus.core.debug.panel.internal.presentation.view.d) obj).a();
                return Unit.a;
            case 10:
                bd8 bd8Var = (bd8) obj2;
                xzb xzbVar = (xzb) obj;
                bd8Var.getClass();
                xzbVar.getClass();
                return r1.b(xzbVar, bd8Var.k, bd8Var.f, bd8Var.c, null, true);
            case 11:
                wj9 wj9Var = (wj9) obj2;
                xzb xzbVar2 = (xzb) obj;
                xzbVar2.getClass();
                return r1.b(xzbVar2, wj9Var.getUrl(), wj9Var.c(), wj9Var.a(), null, true);
            case 12:
                return (v7k) ((com.yandex.plus.bdui.plus.webview.navigation.a) obj2).invoke((y7k) ((n) obj).c.getValue());
            case 13:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) obj2;
                bVar.getClass();
                return new com.yandex.plus.divkit.impl.k(bVar, (String) obj);
            case 14:
                return ((com.yandex.plus.divkit.utils.c) obj2).c + '[' + ((String) obj) + ']';
            case 15:
                com.yandex.plus.bdui.plus.checkout.h hVar = new com.yandex.plus.bdui.plus.checkout.h(23, (com.yandex.plus.core.analytics.h) obj);
                g gVar = new g();
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.home.internal.di.u) obj2).w).getClass();
                return new com.yandex.plus.core.analytics.g(hVar, gVar, com.yandex.plus.core.dispatcher.a.e);
            case 16:
                return com.yandex.plus.home.feature.webviews.internal.home.k.z((com.yandex.plus.home.feature.webviews.internal.home.k) obj2, (com.yandex.plus.home.feature.webviews.internalapi.animation.a) obj);
            case 17:
                return com.yandex.plus.home.feature.webviews.internal.home.k.w((com.yandex.plus.home.feature.webviews.internal.home.k) obj2, (com.yandex.plus.core.strings.a) obj);
            case 18:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.c) obj2).h0((String) obj);
                return Unit.a;
            case 19:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.c) obj2).h0(((com.yandex.plus.home.repository.api.model.webconfig.o) obj).c);
                return Unit.a;
            case 20:
                com.yandex.plus.home.feature.webviews.internal.smart.contract.b bVar2 = (com.yandex.plus.home.feature.webviews.internal.smart.contract.b) obj2;
                h hVar2 = (h) obj;
                com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
                hVar2.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.smart.contract.a(bVar2.l(), bVar2.m(), bVar2.d, bVar2.e, bVar2.p, bVar2.f, bVar2.g, bVar2.h, bVar2.i, bVar2.j, bVar2.k, bVar2.l, bVar2.m, hVar2, bVar2.n, bVar2.o, bVar2.r, bVar2.q);
            case 21:
                return com.yandex.plus.home.feature.webviews.internal.stories.p.z((com.yandex.plus.home.feature.webviews.internal.stories.p) obj2, (com.yandex.plus.core.strings.a) obj);
            case 22:
                com.yandex.plus.home.alerts.a aVar4 = (com.yandex.plus.home.alerts.a) ((jyr) ((com.yandex.plus.home.plaque.feature.internal.presentation.b) obj2).a).getValue();
                com.yandex.plus.home.analytics.bubble.a aVar5 = (com.yandex.plus.home.analytics.bubble.a) ((com.yandex.plus.home.internal.di.d) obj).t.getValue();
                aVar4.getClass();
                aVar5.getClass();
                return new a1(7);
            case 23:
                com.yandex.passport.internal.core.accounts.h hVar3 = (com.yandex.passport.internal.core.accounts.h) obj2;
                com.yandex.plus.home.internal.di.u uVar = (com.yandex.plus.home.internal.di.u) hVar3.b;
                Context context2 = uVar.a;
                String concat = "com.yandex.plus.home.".concat((String) obj);
                i5f i5fVar = (i5f) hVar3.e;
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                return new com.yandex.plus.home.datasource.local.preferences.a(context2, concat, i5fVar, com.yandex.plus.core.dispatcher.a.e);
            case 24:
                com.yandex.passport.data.network.l lVar2 = (com.yandex.passport.data.network.l) obj2;
                com.yandex.plus.home.plaque.plugin.internal.di.c cVar4 = (com.yandex.plus.home.plaque.plugin.internal.di.c) obj;
                com.yandex.plus.home.t tVar = (com.yandex.plus.home.t) lVar2.a;
                com.yandex.plus.home.r rVar2 = new com.yandex.plus.home.r(0, tVar);
                com.yandex.plus.home.plaque.repository.api.a aVar6 = (com.yandex.plus.home.plaque.repository.api.a) cVar4.c.getValue();
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar7 = new com.yandex.plus.home.dailyquests.plugin.internal.proxy.a(tVar.d.a(), 1);
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar2 = new com.yandex.plus.home.dailyquests.plugin.internal.proxy.d((com.yandex.plus.home.core.navigation.a) ((jyr) tVar.g.e).getValue(), 1);
                xdr xdrVar = tVar.h.h;
                com.yandex.plus.home.internal.di.u uVar2 = tVar.b;
                fkn fknVar = uVar2.c;
                int i5 = 5;
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b bVar3 = new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(i5, new e(((com.yandex.plus.home.state.a) tVar.f.q.getValue()).b, i5));
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar8 = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(11, lVar2);
                com.yandex.plus.log.api.b b2 = cVar4.b();
                CoroutineContext coroutineContext = tVar.i.a;
                com.yandex.plus.core.dispatcher.b bVar4 = uVar2.w;
                ((com.yandex.plus.core.dispatcher.a) bVar4).getClass();
                tf6 e2 = gld.e(coroutineContext.plus(com.yandex.plus.core.dispatcher.a.d));
                aVar6.getClass();
                xdrVar.getClass();
                b2.getClass();
                bVar4.getClass();
                return new com.yandex.plus.home.plaque.feature.internal.e(rVar2, aVar6, new com.yandex.passport.internal.flags.experiments.p(), aVar7, dVar2, xdrVar, fknVar, bVar3, aVar8, b2, e2, bVar4);
            case 25:
                com.yandex.plus.home.plaque.plugin.internal.di.d dVar3 = (com.yandex.plus.home.plaque.plugin.internal.di.d) obj2;
                com.yandex.plus.home.plaque.plugin.internal.di.c cVar5 = (com.yandex.plus.home.plaque.plugin.internal.di.c) obj;
                com.yandex.plus.home.t tVar2 = dVar3.a;
                com.yandex.plus.home.internal.di.u uVar3 = tVar2.b;
                com.yandex.plus.core.imageloader.b bVar5 = uVar3.e;
                fkn fknVar2 = uVar3.c;
                com.yandex.plus.home.plaque.animator.internal.utils.a aVar9 = new com.yandex.plus.home.plaque.animator.internal.utils.a();
                com.yandex.plus.log.api.b b3 = cVar5.b();
                com.yandex.plus.home.plaque.plugin.internal.di.c cVar6 = new com.yandex.plus.home.plaque.plugin.internal.di.c(bVar5, fknVar2, aVar9, b3);
                Context context3 = uVar3.a;
                u13 u13Var = new u13(25, cVar6, context3, fknVar2);
                com.yandex.plus.bdui.flex.ui.s sVar2 = new com.yandex.plus.bdui.flex.ui.s(bVar5, context3, (com.yandex.plus.home.plaque.repository.graphql.formatter.c) cVar6.a.getValue(), (com.yandex.plus.home.plaque.repository.graphql.formatter.b) cVar6.b.getValue(), new com.yandex.plus.home.plaque.plugin.internal.proxy.a(i2, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(24, new com.yandex.plus.plaquesdk.theme.palette.a(context3, u13Var))), u13Var, aVar9, b3);
                return new com.yandex.plus.home.plaque.plugin.internal.proxy.g(btf.b(new com.yandex.plus.bdui.flex.factory.p(15, tVar2, cVar5, sVar2)), btf.b(new h0l(tVar2, dVar3, sVar2, cVar5, 13)), new com.yandex.plus.home.plaque.plugin.internal.di.a(tVar2, continuation, i2));
            case 26:
                Function0 function0 = (Function0) obj;
                if (((com.yandex.plus.metrica.utils.f) ((ezc) obj2).invoke()).a) {
                    return function0.invoke();
                }
                return null;
            case 27:
                com.yandex.plus.metrica.utils.h hVar4 = (com.yandex.plus.metrica.utils.h) obj2;
                com.yandex.plus.core.config.a aVar10 = hVar4.f;
                aVar10.getClass();
                return new y((String) obj, aVar10, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (com.yandex.plus.metrica.utils.x) hVar4, com.yandex.plus.metrica.utils.x.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0, 28));
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.metrica.utils.i((com.yandex.plus.metrica.utils.g) obj2, (com.yandex.plus.metrica.a) obj);
            default:
                ((List) ((com.yandex.plus.home.plaque.feature.internal.presentation.b) obj2).e).remove((com.yandex.plus.pay.inapp.google.internal.operation.f) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function0 function0, Function0 function02) {
        this.a = 26;
        this.b = (ezc) function0;
        this.c = function02;
    }
}
