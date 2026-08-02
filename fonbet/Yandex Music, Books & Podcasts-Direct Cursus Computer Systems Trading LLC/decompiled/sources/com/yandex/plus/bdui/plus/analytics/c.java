package com.yandex.plus.bdui.plus.analytics;

import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.plus.bdui.b0;
import defpackage.arf;
import defpackage.btf;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.l1p;
import defpackage.tah;
import defpackage.tf6;
import defpackage.v75;
import defpackage.x97;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c implements b0 {
    public final tf6 a;
    public final com.yandex.plus.log.api.b b;
    public final LinkedHashMap c;
    public final jyr d;

    public c(ArrayList arrayList, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = tf6Var;
        this.b = bVar;
        int a = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.yandex.plus.bdui.analytics.b bVar2 = (com.yandex.plus.bdui.analytics.b) it.next();
            linkedHashMap.put(bVar2.a, btf.b(bVar2.b));
        }
        this.c = linkedHashMap;
        this.d = btf.b(new h0(29, this));
    }

    public final void a(String str, Function0 function0) {
        str.getClass();
        arf arfVar = (arf) this.c.get(str);
        com.yandex.plus.log.api.b bVar = this.b;
        if (arfVar == null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusAnalyticsSenderImpl", hrg.q("sendEvent(); transport for event type = ", str, " not found!"));
                return;
            }
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusAnalyticsSenderImpl", hrg.q("sendEvent(); transport for event type = ", str, " found"));
        }
        x97.y(this.a, null, null, new l1p(this, arfVar, (com.yandex.plus.bdui.analytics.c) function0.invoke(), null, 27), 3);
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.d.getValue();
    }
}
