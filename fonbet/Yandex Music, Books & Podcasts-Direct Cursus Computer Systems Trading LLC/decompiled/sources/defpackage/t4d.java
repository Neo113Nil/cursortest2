package defpackage;

import android.content.Context;
import com.yandex.passport.common.network.n;
import com.yandex.plus.acquisition.adapter.api.d;
import com.yandex.plus.acquisition.adapter.internal.controller.a;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.i;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f;
import com.yandex.plus.acquisition.sdk.pay.impl.b;
import com.yandex.plus.bdui.flex.factory.e;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.home.internal.di.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class t4d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t4d(arf arfVar, uoh uohVar, j2t j2tVar, jyr jyrVar, k1l k1lVar, k1l k1lVar2, t5l t5lVar) {
        this.a = 1;
        this.d = arfVar;
        this.b = uohVar;
        this.e = j2tVar;
        this.c = jyrVar;
        this.f = k1lVar;
        this.g = k1lVar2;
        this.h = t5lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uoh uohVar = (uoh) this.b;
                jyr jyrVar = (jyr) this.c;
                jyr jyrVar2 = (jyr) this.d;
                jyr jyrVar3 = (jyr) this.e;
                jyr jyrVar4 = (jyr) this.f;
                jyr jyrVar5 = (jyr) this.g;
                return new bcr(uohVar, (q4d) jyrVar.getValue(), (f4d) jyrVar2.getValue(), (c4d) jyrVar3.getValue(), (b5d) jyrVar4.getValue(), (j4d) jyrVar5.getValue(), (Function0) this.h);
            case 1:
                arf arfVar = (arf) this.d;
                return new bdr(((ysu) arfVar.getValue()).b, (uoh) this.b, (j2t) this.e, (jyr) this.c, (k1l) this.f, (k1l) this.g, ((ysu) arfVar.getValue()).d, (t5l) this.h);
            case 2:
                c cVar = (c) this.b;
                a aVar = (a) this.c;
                com.yandex.plus.acquisition.adapter.internal.analytics.a aVar2 = (com.yandex.plus.acquisition.adapter.internal.analytics.a) this.d;
                d dVar = (d) this.e;
                r90 r90Var = (r90) this.f;
                b bVar = (b) this.g;
                Map map = (Map) this.h;
                f fVar = (f) aVar.c.getValue();
                fVar.getClass();
                i iVar = cVar.a;
                com.yandex.plus.acquisition.sdk.common.impl.di.b bVar2 = iVar.a;
                com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                com.yandex.plus.core.strings.a aVar3 = (com.yandex.plus.core.strings.a) bVar3.g;
                b bVar4 = iVar.b;
                com.yandex.plus.acquisition.sdk.common.api.di.b bVar5 = new com.yandex.plus.acquisition.sdk.common.api.di.b(new com.yandex.plus.paywall.sdk.analytics.api.a(bVar2, bVar4));
                com.yandex.plus.resources.core.c cVar2 = new com.yandex.plus.resources.core.c((Context) bVar3.i, aVar3);
                com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.a aVar4 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.a(fVar, (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c) ((jyr) bVar5.a).getValue(), bVar4, new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a(), new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.b(aVar3, 1), new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a(), new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a(), new n(cVar2, aVar3), new com.yandex.passport.data.network.token.i(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a()), new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.b(aVar3, 0), cVar2, aVar3);
                aVar2.getClass();
                com.yandex.plus.acquisition.sdk.pay.common.api.a a = com.yandex.plus.acquisition.adapter.internal.analytics.a.a(dVar);
                r1.E(fVar.getPurchaseButton().getView(), new jl2(3, aVar4, a, new r90(r90Var, bVar, a, map, aVar, 16)));
                return aVar4;
            case 3:
                return new com.yandex.plus.bdui.flex.action.f((com.yandex.plus.bdui.flex.utils.b) this.b, (LinkedHashMap) this.c, (e) this.d, (com.yandex.plus.bdui.plus.content.controller.f) this.e, (o) this.f, (tf6) this.g, (com.yandex.plus.log.api.b) this.h);
            default:
                com.yandex.plus.acquisition.adapter.internal.controller.b bVar6 = (com.yandex.plus.acquisition.adapter.internal.controller.b) this.b;
                com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c cVar3 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) this.c;
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = (com.yandex.plus.bdui.plus.content.controller.f) this.d;
                wxm wxmVar = (wxm) this.e;
                com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.o) this.f;
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.g;
                y yVar = (y) this.h;
                Context context = cVar3.a.getContext();
                context.getClass();
                d f = fVar2.f();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                r90 r90Var2 = new r90(cVar3, wxmVar, oVar, aVar5, yVar, 18);
                bVar6.getClass();
                return new a(context, bVar6.a, f, e5bVar, bVar6.d, r90Var2, bVar6.b, bVar6.c);
        }
    }

    public /* synthetic */ t4d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
