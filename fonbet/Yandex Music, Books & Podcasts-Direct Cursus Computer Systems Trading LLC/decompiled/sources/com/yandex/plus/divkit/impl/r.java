package com.yandex.plus.divkit.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import defpackage.btf;
import defpackage.bz9;
import defpackage.ct8;
import defpackage.dzf;
import defpackage.gc8;
import defpackage.jyr;
import defpackage.tah;
import defpackage.vb8;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class r {
    public final com.yandex.plus.log.api.b a;
    public final jyr b;

    public r(final Context context, final dzf dzfVar, final p pVar, final ct8 ct8Var, final com.yandex.plus.bdui.plus.checkout.div.e eVar, final Map map, final Map map2, final com.yandex.plus.bdui.plus.content.controller.j jVar, final com.yandex.plus.bdui.plus.content.controller.k kVar, com.yandex.plus.log.api.b bVar) {
        map.getClass();
        bVar.getClass();
        this.a = bVar;
        this.b = btf.b(new Function0() { // from class: com.yandex.plus.divkit.impl.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.log.api.b bVar2 = this.a;
                bz9 bz9Var = (bz9) pVar.a.getValue();
                ct8 ct8Var2 = ct8.this;
                ct8Var2.j = bz9Var;
                com.yandex.plus.divkit.api.g gVar = eVar;
                if (gVar != null) {
                    ct8Var2.h = new j(gVar);
                }
                Map map3 = map;
                if (map3.isEmpty()) {
                    map3 = null;
                }
                if (map3 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map3.size()));
                    for (Map.Entry entry : map3.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new j((com.yandex.plus.divkit.api.g) entry.getValue()));
                    }
                    ct8Var2.i = linkedHashMap;
                }
                Map map4 = map2;
                Map map5 = map4.isEmpty() ? null : map4;
                if (map5 != null) {
                    ct8Var2.f = new e(map5, bVar2);
                }
                com.yandex.plus.bdui.plus.content.controller.j jVar2 = jVar;
                if (jVar2 != null) {
                    ct8Var2.b = new c(jVar2, bVar2);
                }
                ct8Var2.c = new b(kVar, bVar2);
                ct8Var2.q = false;
                return new gc8(new vb8(new ContextThemeWrapper(context, R.style.Div_Theme), ct8Var2.a(), dzfVar), null, 0, 6, null);
            }
        });
    }
}
