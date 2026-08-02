package com.yandex.plus.pay.internal;

import android.content.Context;
import android.text.style.URLSpan;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.internal.di.i;
import com.yandex.plus.pay.internal.di.l;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import com.yandex.plus.webview.internal.contract.impl.loading.k;
import defpackage.b6e;
import defpackage.ezc;
import defpackage.tf6;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar, Function0 function0) {
        this.a = 4;
        this.b = cVar;
        this.c = (ezc) function0;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object iVar;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                x xVar = (x) this.c;
                u uVar = gVar.b;
                return new com.yandex.plus.pay.internal.feature.offers.x((com.yandex.plus.pay.internal.feature.offers.e) uVar.e.p.getValue(), (com.yandex.plus.pay.internal.feature.offers.smart.a) uVar.e.q.getValue(), gVar.d(), xVar);
            case 1:
                l lVar = (l) this.b;
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.c;
                com.yandex.plus.pay.internal.di.e eVar = lVar.b;
                return new com.yandex.plus.pay.common.api.network.d(eVar.e, (com.yandex.plus.pay.diagnostic.impl.c) ((com.yandex.plus.pay.diagnostic.impl.b) eVar.j.getValue()).e.getValue(), aVar);
            case 2:
                com.yandex.plus.home.plaque.animator.internal.utils.a aVar2 = (com.yandex.plus.home.plaque.animator.internal.utils.a) this.b;
                l lVar2 = (l) this.c;
                if (aVar2 == null) {
                    return new com.yandex.plus.pay.internal.feature.payment.inapp.a();
                }
                i iVar2 = lVar2.a;
                Context context = iVar2.j;
                com.yandex.plus.pay.log.impl.b bVar = lVar2.b.e;
                com.yandex.plus.core.dispatcher.b bVar2 = iVar2.q;
                context.getClass();
                bVar.getClass();
                bVar2.getClass();
                return new com.yandex.plus.pay.inapp.google.internal.g(context, bVar);
            case 3:
                l lVar3 = (l) this.b;
                com.yandex.plus.pay.internal.network.d dVar = (com.yandex.plus.pay.internal.network.d) this.c;
                i iVar3 = lVar3.a;
                return new com.yandex.plus.pay.internal.network.c(iVar3.j, iVar3.b, iVar3.f, iVar3.g, iVar3.b(), iVar3.s, dVar, iVar3.h);
            case 4:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c) this.b;
                return new com.yandex.plus.pay.ui.core.mobile.view.toolbar.i((PlusPayToolbarView) cVar.g.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c.s[3]), cVar.c, cVar.b, (ezc) this.c);
            case 5:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) this.b;
                return new com.yandex.plus.pay.ui.core.mobile.view.accordion.a((PlusPayAccordionView) bVar3.f.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b.r[6]), (y) this.c);
            case 6:
                com.yandex.plus.pay.ui.core.mobile.view.accordion.a aVar3 = (com.yandex.plus.pay.ui.core.mobile.view.accordion.a) this.b;
                URLSpan uRLSpan = (URLSpan) this.c;
                y yVar = aVar3.a;
                String url = uRLSpan.getURL();
                url.getClass();
                yVar.i(url);
                return Unit.a;
            case 7:
                Function2 function2 = (Function2) this.b;
                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) this.c;
                function2.invoke(link.getData(), link.getLink());
                return Unit.a;
            case 8:
                return new h((com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.b, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i) this.c);
            case 9:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l lVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l) this.b;
                j jVar = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.c).b;
                lVar4.t.b();
                xdr xdrVar = lVar4.u;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.h hVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.h(lVar4.a(jVar));
                xdrVar.getClass();
                xdrVar.m(null, hVar);
                return Unit.a;
            case 10:
                m.G((m) this.b, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a) this.c);
                return Unit.a;
            case 11:
                return new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.h(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) this.b).a, ((com.yandex.plus.pay.ui.core.internal.tarifficator.a) this.c).k, com.yandex.plus.core.activity.result.internal.h.d);
            case 12:
                return new com.yandex.plus.pay.ui.webview.common.diagnostic.c((com.yandex.plus.domain.auth.impl.i) this.b, ((com.yandex.plus.pay.ui.yb.web.internal.di.c) this.c).b);
            case 13:
                return ((com.yandex.plus.webview.internal.contract.impl.loading.a) this.b).k((com.yandex.passport.legacy.lx.f) this.c);
            default:
                k kVar = (k) this.b;
                com.yandex.plus.webview.api.g gVar2 = (com.yandex.plus.webview.api.g) this.c;
                long j = kVar.c;
                com.yandex.plus.webview.internal.contract.impl.loading.j jVar2 = new com.yandex.plus.webview.internal.contract.impl.loading.j(kVar);
                com.yandex.plus.webview.internal.contract.impl.loading.j jVar3 = new com.yandex.plus.webview.internal.contract.impl.loading.j(kVar);
                tf6 tf6Var = kVar.g;
                tf6Var.getClass();
                if (gVar2 instanceof com.yandex.plus.webview.api.e) {
                    com.yandex.plus.webview.internal.contract.impl.loading.l lVar5 = new com.yandex.plus.webview.internal.contract.impl.loading.l(j, jVar2, jVar3);
                    lVar5.e = Long.MIN_VALUE;
                    return lVar5;
                }
                if (gVar2 instanceof com.yandex.plus.webview.api.f) {
                    iVar = new com.yandex.plus.webview.internal.contract.impl.loading.m(j, jVar2, jVar3, (com.yandex.plus.webview.api.f) gVar2, tf6Var);
                } else {
                    if (!(gVar2 instanceof com.yandex.plus.webview.api.d)) {
                        b6e.s();
                        return null;
                    }
                    iVar = new com.yandex.plus.webview.internal.contract.impl.loading.i(j, jVar2, jVar3, tf6Var);
                }
                return iVar;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
