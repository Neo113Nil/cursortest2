package ru.yandex.video.m3.preload_manager;

import android.util.LruCache;
import defpackage.gnm;
import defpackage.mnm;
import defpackage.nnm;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.y5g;
import defpackage.yjj;
import defpackage.z7o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEvent;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class d {
    public final yjj a;
    public final yjj b;
    public final LruCache c;

    public d(yjj yjjVar, List list) {
        list.getClass();
        this.a = yjjVar;
        yjj yjjVar2 = new yjj();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yjjVar2.a((j) it.next());
        }
        this.b = yjjVar2;
        this.c = new LruCache(64);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nnm nnmVar) {
        HashSet u0;
        nnm nnmVar2;
        Object t7oVar;
        Throwable a;
        List<PreloadException.ApiCallError> list = (List) this.c.get(nnmVar.l);
        if (list != null) {
            for (PreloadException.ApiCallError apiCallError : list) {
                yjj yjjVar = this.b;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ru.yandex.video.m3.preload_manager.tracking.a aVar = (ru.yandex.video.m3.preload_manager.tracking.a) ((j) next);
                        aVar.getClass();
                        apiCallError.getClass();
                        nnmVar2 = nnmVar;
                        try {
                            aVar.a.b(aVar.b(nnmVar2, y5g.r0(apiCallError), EventType.ERROR, ru.yandex.video.m3.preload_manager.tracking.a.a(apiCallError), apiCallError.getTimestamp()));
                            t7oVar = Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th2);
                            a = z7o.a(t7oVar);
                            if (a == null) {
                            }
                            nnmVar = nnmVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        nnmVar2 = nnmVar;
                    }
                    a = z7o.a(t7oVar);
                    if (a == null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                    nnmVar = nnmVar2;
                }
            }
        }
        this.c.remove(nnmVar.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(nnm nnmVar, PreloadException.ApiCallError apiCallError) {
        HashSet u0;
        nnm nnmVar2;
        Object t7oVar;
        Throwable a;
        Timber.INSTANCE.e(apiCallError.getCause(), nnmVar.d.concat(": Exception caught:"), new Object[0]);
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ru.yandex.video.m3.preload_manager.tracking.a aVar = (ru.yandex.video.m3.preload_manager.tracking.a) ((j) next);
                aVar.getClass();
                nnmVar2 = nnmVar;
                try {
                    aVar.a.b(aVar.b(nnmVar2, y5g.r0(apiCallError), EventType.ERROR, ru.yandex.video.m3.preload_manager.tracking.a.a(apiCallError), apiCallError.getTimestamp()));
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th2);
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                    nnmVar = nnmVar2;
                }
            } catch (Throwable th3) {
                th = th3;
                nnmVar2 = nnmVar;
            }
            a = z7o.a(t7oVar);
            if (a == null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
            nnmVar = nnmVar2;
        }
        this.a.c(new b(1));
    }

    public final void c(VideoData videoData, PreloadException.ApiCallError apiCallError) {
        videoData.getClass();
        Timber.INSTANCE.e(apiCallError);
        String a = mnm.a(videoData);
        LruCache lruCache = this.c;
        List list = (List) lruCache.get(a);
        if (list == null || ((List) lruCache.put(a, CollectionsKt.h0(list, apiCallError))) == null) {
        }
        this.a.c(new c(videoData, apiCallError));
    }

    public final void d(nnm nnmVar, PreloadException preloadException) {
        HashSet u0;
        Object t7oVar;
        List<DownloadResult> results;
        nnmVar.getClass();
        preloadException.getClass();
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                this.a.c(new gnm(nnmVar, preloadException, i));
                a(nnmVar);
                return;
            }
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                j jVar = (j) next;
                List<DownloadResult> list = null;
                PreloadException.CanceledOperationException canceledOperationException = preloadException instanceof PreloadException.CanceledOperationException ? (PreloadException.CanceledOperationException) preloadException : null;
                if (canceledOperationException != null && (results = canceledOperationException.getResults()) != null && !results.isEmpty()) {
                    list = results;
                }
                ((ru.yandex.video.m3.preload_manager.tracking.a) jVar).d(nnmVar, preloadException, list);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void e(nnm nnmVar) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ru.yandex.video.m3.preload_manager.tracking.a aVar = (ru.yandex.video.m3.preload_manager.tracking.a) ((j) next);
                aVar.getClass();
                aVar.a.b(ru.yandex.video.m3.preload_manager.tracking.a.c(aVar, nnmVar, PreloadEvent.QUEUED.toEventName(), null, 28));
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
        a(nnmVar);
    }
}
