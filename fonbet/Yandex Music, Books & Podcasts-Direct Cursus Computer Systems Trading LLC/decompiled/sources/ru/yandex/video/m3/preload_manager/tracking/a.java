package ru.yandex.video.m3.preload_manager.tracking;

import defpackage.eta;
import defpackage.n2t;
import defpackage.nnm;
import defpackage.qee;
import defpackage.wbu;
import defpackage.wt0;
import defpackage.y5g;
import defpackage.y9w;
import defpackage.ylr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.VideoType;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.j;

/* loaded from: classes6.dex */
public final class a implements j {
    public final ylr a;
    public final n2t b;
    public final qee c;

    public a(ylr ylrVar, n2t n2tVar, qee qeeVar) {
        this.a = ylrVar;
        this.b = n2tVar;
        this.c = qeeVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker$PreloadErrorData] */
    public static PreloadEventTracker$PreloadErrorData a(PreloadException preloadException) {
        StringWriter stringWriter = new StringWriter();
        preloadException.printStackTrace(new PrintWriter(stringWriter));
        final String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        String message = preloadException.getMessage();
        if (message == null) {
            message = "";
        }
        final String str = message;
        final String r0 = y5g.r0(preloadException);
        final boolean z = false;
        final String str2 = "PRELOAD";
        return new DefaultEventData(str, r0, z, stringWriter2, str2) { // from class: ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker$PreloadErrorData

            @NotNull
            private final String category;

            @NotNull
            private final String code;
            private final boolean isFatal;

            @NotNull
            private final String message;

            @NotNull
            private final String stack;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null, 1, null);
                eta.r(str, r0, stringWriter2, str2);
                this.message = str;
                this.code = r0;
                this.isFatal = z;
                this.stack = stringWriter2;
                this.category = str2;
            }

            @NotNull
            public final String getCategory() {
                return this.category;
            }

            @NotNull
            public final String getCode() {
                return this.code;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final String getStack() {
                return this.stack;
            }

            /* renamed from: isFatal, reason: from getter */
            public final boolean getIsFatal() {
                return this.isFatal;
            }
        };
    }

    public static /* synthetic */ EventDefault c(a aVar, nnm nnmVar, String str, DefaultEventData defaultEventData, int i) {
        EventType eventType = EventType.EVENT;
        if ((i & 8) != 0) {
            defaultEventData = new DefaultEventData(null, 1, null);
        }
        return aVar.b(nnmVar, str, eventType, defaultEventData, System.currentTimeMillis());
    }

    public final EventDefault b(nnm nnmVar, String str, EventType eventType, DefaultEventData defaultEventData, long j) {
        String str2;
        n2t n2tVar = this.b;
        wt0 wt0Var = n2tVar.c;
        String str3 = n2tVar.a;
        String str4 = nnmVar.d;
        int i = n2tVar.k;
        String str5 = n2tVar.i;
        if (str5 == null) {
            str5 = wt0Var.a;
        }
        EventsLabel eventsLabel = new EventsLabel(str5, wt0Var.b, String.valueOf(wt0Var.c), VideoType.VOD, null, 16, null);
        String q = y9w.q(eventType);
        String str6 = nnmVar.k;
        LinkedHashMap linkedHashMap = n2tVar.n;
        String str7 = n2tVar.e;
        String str8 = n2tVar.f;
        List list = n2tVar.g;
        if (this.c != null) {
            VideoData videoData = nnmVar.a;
            videoData.getClass();
            wbu wbuVar = videoData instanceof wbu ? (wbu) videoData : null;
            if (wbuVar != null) {
                str2 = wbuVar.a.d;
                if (str2 == null) {
                    str2 = "unknown";
                }
                Boolean bool = Boolean.FALSE;
                nnmVar.b.getClass();
                return new EventDefault(str3, str4, i, str, j, eventsLabel, q, str6, linkedHashMap, str7, str8, list, str2, null, bool, null, defaultEventData, Integer.valueOf(((AtomicInteger) nnmVar.f.b).getAndIncrement()), null, n2tVar.m, Integer.valueOf(nnmVar.e));
            }
        }
        str2 = null;
        Boolean bool2 = Boolean.FALSE;
        nnmVar.b.getClass();
        return new EventDefault(str3, str4, i, str, j, eventsLabel, q, str6, linkedHashMap, str7, str8, list, str2, null, bool2, null, defaultEventData, Integer.valueOf(((AtomicInteger) nnmVar.f.b).getAndIncrement()), null, n2tVar.m, Integer.valueOf(nnmVar.e));
    }

    public final void d(nnm nnmVar, PreloadException preloadException, List list) {
        nnmVar.getClass();
        preloadException.getClass();
        this.a.b(c(this, nnmVar, PreloadEvent.CANCELED.toEventName(), new PreloadEventTracker$DownloadResultData(list, preloadException.getMessage()), 20));
    }

    public final void e(nnm nnmVar, List list) {
        list.getClass();
        this.a.b(c(this, nnmVar, PreloadEvent.FINISHED.toEventName(), new PreloadEventTracker$DownloadResultData(list, null, 2, null), 20));
    }
}
