package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class jau {
    public final kau a;
    public final xiu b;
    public final ExecutorService c;
    public final Handler d;
    public xbu e;
    public final ConcurrentHashMap f;

    public jau(kau kauVar, xiu xiuVar, ExecutorService executorService, Handler handler) {
        executorService.getClass();
        this.a = kauVar;
        this.b = xiuVar;
        this.c = executorService;
        this.d = handler;
        this.f = new ConcurrentHashMap();
    }

    public final void a(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ConcurrentHashMap concurrentHashMap = this.f;
            Future future = (Future) concurrentHashMap.remove(str);
            if (future != null && !concurrentHashMap.values().contains(future)) {
                future.cancel(true);
            }
        }
    }

    public final void b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object obj = ((z7o) entry.getValue()).a;
            VideoData videoData = (VideoData) (obj instanceof t7o ? null : obj);
            if (videoData != null) {
                linkedHashMap.put(str, videoData);
            } else {
                Throwable a = z7o.a(obj);
                linkedHashMap2.put(str, new PreloadException.ApiCallError("Error getting videoData: " + a, a, 0L, 4, null));
            }
        }
        this.d.post(new r8(map, this, linkedHashMap, linkedHashMap2, 16));
    }

    public final void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object obj = ((z7o) entry.getValue()).a;
            if (obj instanceof t7o) {
                obj = null;
            }
            VideoData videoData = (VideoData) obj;
            xiu xiuVar = this.b;
            if (videoData != null) {
                xiuVar.G(videoData, str);
            } else {
                str.getClass();
                ((p1d) xiuVar.b).a.remove(str);
                ((ConcurrentHashMap) xiuVar.c).remove(str);
            }
        }
    }
}
