package com.yandex.plus.analytics.dwh;

import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.report.we;
import com.yandex.plus.core.analytics.logging.d;
import defpackage.a4g;
import defpackage.gld;
import defpackage.tf6;
import defpackage.x97;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a {
    public final l a;
    public final d b;
    public final tf6 c;

    public a(l lVar, d dVar, kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.a = lVar;
        this.b = dVar;
        this.c = gld.e(aVar.plus(a4g.n()));
    }

    public final void a(String str, Map map) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        d dVar = this.b;
        Continuation continuation = null;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "DWH", "RestDwhAnalyticsReporter.reportDwhEvent(" + str + ", " + map + ')', null);
        }
        x97.y(this.c, null, null, new we(this, str, map, continuation, 17), 3);
    }
}
