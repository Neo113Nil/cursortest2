package com.yandex.plus.core.benchmark;

import defpackage.btf;
import defpackage.e5b;
import defpackage.jyr;
import defpackage.tah;
import defpackage.uah;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c0 extends a implements com.yandex.plus.core.utils.a {
    public static final jyr d = btf.b(new com.yandex.plus.bdui.plus.shared.serializer.d(9));
    public final com.yandex.plus.core.analytics.o b;
    public volatile Function0 c;

    public c0(com.yandex.plus.core.analytics.o oVar) {
        super(a0.class);
        this.b = oVar;
        this.c = new com.yandex.plus.bdui.plus.shared.serializer.d(8);
    }

    @Override // com.yandex.plus.core.utils.a
    public final void a(com.yandex.plus.bdui.plus.checkout.h hVar) {
        this.c = hVar;
    }

    @Override // com.yandex.plus.core.benchmark.a
    public final void b(l lVar, m mVar, Map map) {
        lVar.getClass();
        com.yandex.plus.core.analytics.o oVar = this.b;
        String str = "Perf." + ((a0) mVar).a + '.' + lVar.a;
        Map map2 = (Map) this.c.invoke();
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        oVar.reportStatboxEvent(str, uah.i(uah.i(tah.b(new Pair("duration", Double.valueOf(lVar.b() / ((Number) d.getValue()).longValue()))), map2), map));
    }
}
