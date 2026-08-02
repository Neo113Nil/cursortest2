package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.e5b;
import defpackage.fob;
import defpackage.tah;
import defpackage.uah;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class ef {
    public final Throwable a;
    public final String b;
    public final Map c;

    public ef(Throwable th, String str) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.a = th;
        this.b = str;
        this.c = e5bVar;
    }

    public final RtmErrorEvent a(Map map, Context context) {
        context.getClass();
        map.getClass();
        RtmErrorEvent build = RtmErrorEvent.newBuilder(this.b).withVersion("7.54.1").withAdditional(new JSONObject(uah.i(this.c, map)).toString()).withSource(context.getPackageName()).withStacktrace(fob.b(this.a)).build();
        build.getClass();
        return build;
    }

    public final Pair b() {
        String b = fob.b(this.a);
        if (b == null) {
            b = "null";
        }
        return new Pair(this.b, uah.i(this.c, tah.b(new Pair("throwable", b))));
    }
}
