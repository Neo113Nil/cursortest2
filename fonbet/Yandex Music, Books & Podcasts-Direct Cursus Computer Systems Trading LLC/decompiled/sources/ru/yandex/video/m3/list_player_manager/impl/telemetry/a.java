package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import defpackage.imh;
import defpackage.kyk;
import defpackage.kzn;
import defpackage.n2t;
import defpackage.n4f;
import defpackage.vx6;
import defpackage.wt0;
import defpackage.y7g;
import defpackage.y9w;
import defpackage.ylr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.VideoType;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class a {
    public final ylr a;
    public final n2t b;
    public final n4f c;
    public final vx6 d;
    public final AtomicInteger e = new AtomicInteger(0);

    public a(ylr ylrVar, n2t n2tVar, kzn kznVar, n4f n4fVar, vx6 vx6Var) {
        this.a = ylrVar;
        this.b = n2tVar;
        this.c = n4fVar;
        this.d = vx6Var;
    }

    public static EventDefault a(a aVar, String str, imh imhVar, EventType eventType, DefaultEventData defaultEventData, kyk kykVar, Integer num, Integer num2, int i) {
        EventType eventType2 = (i & 4) != 0 ? EventType.EVENT : eventType;
        long currentTimeMillis = System.currentTimeMillis();
        Integer num3 = (i & 64) != 0 ? null : num;
        Integer num4 = (i & 128) != 0 ? null : num2;
        n2t n2tVar = aVar.b;
        String str2 = n2tVar.a;
        wt0 wt0Var = n2tVar.c;
        String str3 = n2tVar.b;
        String str4 = n2tVar.i;
        if (str4 == null) {
            str4 = wt0Var.a;
        }
        EventsLabel eventsLabel = new EventsLabel(str4, wt0Var.b, String.valueOf(wt0Var.c), VideoType.VOD, null, 16, null);
        String q = y9w.q(eventType2);
        String P = imhVar != null ? y7g.P(imhVar) : null;
        LinkedHashMap linkedHashMap = n2tVar.n;
        String str5 = n2tVar.e;
        String str6 = n2tVar.f;
        List list = n2tVar.g;
        String str7 = imhVar != null ? imhVar.d : null;
        int andIncrement = aVar.e.getAndIncrement();
        return new EventDefault(str2, str3, num3 != null ? num3.intValue() : -1, str, currentTimeMillis, eventsLabel, q, P, linkedHashMap, str5, str6, list, str7, null, Boolean.FALSE, null, defaultEventData, Integer.valueOf(andIncrement), null, n2tVar.m, num4);
    }

    public final void b(PreloadException.CacheInitException cacheInitException) {
        StringWriter stringWriter = new StringWriter();
        cacheInitException.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        this.a.b(a(this, "CacheInitError", null, EventType.ERROR, new DefaultEventData(this.c.to(new ListPlayerManagerEventTracker$ErrorWithStackTrace(cacheInitException, stringWriter2))), null, null, null, 208));
    }
}
