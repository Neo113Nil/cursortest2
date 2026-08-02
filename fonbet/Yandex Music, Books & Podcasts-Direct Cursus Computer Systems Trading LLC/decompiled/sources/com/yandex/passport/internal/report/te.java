package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.ca8;
import defpackage.e5b;
import defpackage.gld;
import defpackage.uah;
import defpackage.x97;
import io.appmetrica.analytics.IReporterYandex;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class te implements af {
    public final Context a;
    public final IReporterYandex b;
    public volatile Map c;

    public te(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        iReporterYandex.getClass();
        this.a = context;
        this.b = iReporterYandex;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.c = e5bVar;
        x97.y(gld.e(ca8.a), null, null, new com.yandex.passport.internal.provider.communication.c(this, null, 4), 3);
    }

    @Override // com.yandex.passport.internal.report.af
    public final void a(String str, Map map) {
        str.getClass();
        map.getClass();
        this.b.reportEvent(str, uah.i(map, this.c));
    }

    @Override // com.yandex.passport.internal.report.af
    public final void b(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.b.reportStatboxEvent(str, uah.i(linkedHashMap, this.c));
    }
}
