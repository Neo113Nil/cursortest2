package com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.r;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.z;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6m;
import defpackage.btf;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.gdk;
import defpackage.jyr;
import defpackage.tah;
import defpackage.v5m;
import defpackage.y5m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e implements com.yandex.plus.pay.ui.tarifficator.api.e {
    public final String a;
    public final jyr b;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c c;
    public final jyr d;

    public e(r rVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.paymentsdk.internal.method.e eVar, com.yandex.plus.divkit.api.f fVar, Map map, Map map2, Map map3, q qVar, com.yandex.plus.pay.ui.core.internal.tarifficator.a aVar2) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        rVar.getClass();
        aVar.getClass();
        eVar.getClass();
        StringBuilder sb = new StringBuilder("|");
        String str = aVar2.a;
        sb.append(str.hashCode());
        sb.append('|');
        sb.append(aVar2.c.hashCode());
        sb.append('|');
        com.yandex.plus.core.strings.a aVar3 = aVar2.d;
        sb.append(aVar3.name().hashCode());
        sb.append('|');
        String str2 = aVar2.f;
        sb.append(str2.hashCode());
        this.a = sb.toString();
        jyr b = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(25, aVar2));
        this.b = b;
        String str3 = aVar2.e;
        Context context = aVar2.g;
        com.yandex.plus.core.config.a aVar4 = aVar2.h;
        i iVar = aVar2.i;
        com.yandex.plus.core.locale.a aVar5 = aVar2.j;
        com.yandex.plus.core.location.a aVar6 = aVar2.r;
        com.yandex.plus.metrica.utils.i iVar2 = aVar2.s;
        com.yandex.plus.pay.log.impl.b bVar = aVar2.k;
        com.yandex.plus.pay.reporter.api.f fVar2 = aVar2.l;
        com.yandex.plus.experiments.impl.providers.h hVar = aVar2.m;
        z zVar = aVar2.n;
        com.yandex.plus.core.dispatcher.b bVar2 = aVar2.o;
        com.yandex.plus.core.imageloader.b bVar3 = aVar2.p;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar7 = aVar2.q;
        com.yandex.plus.pay.ui.core.internal.common.f fVar3 = aVar2.t;
        y yVar = aVar2.w;
        com.yandex.plus.pay.ui.core.internal.di.g gVar = aVar2.v;
        x xVar = aVar2.u;
        cdk cdkVar = aVar2.x;
        gdk gdkVar = aVar2.y;
        com.yandex.plus.pay.a aVar8 = aVar2.z;
        com.yandex.plus.pay.internal.g gVar2 = aVar2.A;
        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f((com.yandex.plus.core.featureflags.x) b.getValue());
        context.getClass();
        aVar4.getClass();
        aVar5.getClass();
        iVar2.getClass();
        bVar.getClass();
        fVar2.getClass();
        hVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        fVar3.getClass();
        gVar.getClass();
        cdkVar.getClass();
        gdkVar.getClass();
        aVar8.getClass();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar4 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b(str, str3, str2, context, aVar3, aVar4, iVar, aVar, aVar5, aVar6, iVar2, bVar, fVar2, hVar, fVar4, zVar, bVar2, bVar3, aVar7, fVar3, eVar, yVar, gVar, xVar, cdkVar, gdkVar, aVar8, gVar2, qVar);
        String str4 = str;
        this.c = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c(bVar4);
        String str5 = aVar2.b;
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map2.size()));
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                b6m b6mVar = (b6m) entry.getValue();
                b6mVar.getClass();
                linkedHashMap2.put(key, new b(b6mVar));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        if (map != null) {
            arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str6 = (String) entry2.getKey();
                v5m v5mVar = (v5m) entry2.getValue();
                v5mVar.getClass();
                arrayList.add(new com.yandex.plus.bdui.plus.handler.d(str6, new com.yandex.plus.pay.internal.feature.counter_offers.f(7, v5mVar)));
                it = it;
                str4 = str4;
            }
        } else {
            arrayList = null;
        }
        String str7 = str4;
        if (map3 != null) {
            arrayList2 = new ArrayList(map3.size());
            for (Iterator it2 = map3.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                arrayList2.add(new com.yandex.plus.bdui.analytics.b((String) entry3.getKey(), new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(26, (y5m) entry3.getValue())));
                arrayList = arrayList;
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList3 = arrayList;
        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e eVar2 = new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e((com.yandex.plus.core.featureflags.x) this.b.getValue());
        str5.getClass();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d dVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.c(rVar, str7, str5, str3, str2, context, aVar3, aVar4, iVar, aVar, aVar5, bVar, fVar2, eVar2, zVar, bVar3, aVar7, eVar, fVar, linkedHashMap, null, arrayList3, arrayList2, yVar, gVar, cdkVar, gdkVar, gVar2, qVar));
        this.d = btf.b(new com.yandex.plus.pay.internal.d(11, this, aVar2));
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.e eVar3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.e.d;
        String str8 = this.a;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = this.c;
        eVar3.getClass();
        str8.getClass();
        ((Map) ((jyr) eVar3.c).getValue()).put(str8, cVar);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b bVar5 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b.d;
        String str9 = this.a;
        bVar5.getClass();
        str9.getClass();
        ((Map) ((jyr) bVar5.c).getValue()).put(str9, dVar);
    }

    public final Object a(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.api.analytics.d dVar, com.yandex.plus.pay.ui.tarifficator.api.b bVar, cg6 cg6Var) {
        return ((h) this.d.getValue()).a(offer, dVar, bVar, r1.l(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) ((com.yandex.plus.core.featureflags.x) this.b.getValue()).a())).v), cg6Var);
    }
}
