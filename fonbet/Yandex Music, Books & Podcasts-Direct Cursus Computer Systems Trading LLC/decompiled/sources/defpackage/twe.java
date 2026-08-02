package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;

/* loaded from: classes6.dex */
public final class twe implements kau, v8h {
    public final swe a;
    public final String b;

    public twe(swe sweVar, String str) {
        this.a = sweVar;
        this.b = str;
    }

    @Override // defpackage.v8h
    public final Future a(String str) {
        str.getClass();
        return new izc(new ssb(7, this, str));
    }

    @Override // defpackage.kau
    public final Map b(Iterable iterable) {
        Object t7oVar;
        Object t7oVar2;
        z7o z7oVar;
        iterable.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = wwe.b((InternalVideo.ManifestResponse) new rwe(this.a, this.b, iterable).invoke());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            int a2 = tah.a(v75.o(iterable, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(a2 >= 16 ? a2 : 16);
            for (Object obj : iterable) {
                r7o r7oVar3 = z7o.b;
                linkedHashMap.put(obj, new z7o(new t7o(a instanceof IOException ? new ManifestLoadingException.ConnectionError(a, null, 2, null) : ((a instanceof ExecutionException) && (a.getCause() instanceof IOException)) ? new ManifestLoadingException.ConnectionError(a.getCause(), null, 2, null) : a)));
            }
            return linkedHashMap;
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        Map map = (Map) t7oVar;
        int a3 = tah.a(v75.o(iterable, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a3 >= 16 ? a3 : 16);
        for (Object obj2 : iterable) {
            String str = (String) obj2;
            if (map != null) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z7oVar = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    Object obj3 = ((z7o) entry.getValue()).a;
                    if (StringsKt.M(str2, str, false)) {
                        if (!(obj3 instanceof t7o)) {
                            r7o r7oVar4 = z7o.b;
                            obj3 = ((VhVideoData) obj3).copy(new r23(str, 6));
                        }
                        z7oVar = new z7o(obj3);
                    } else {
                        z7oVar = null;
                    }
                    if (z7oVar != null) {
                        break;
                    }
                }
                if (z7oVar != null) {
                    t7oVar2 = z7oVar.a;
                    linkedHashMap2.put(obj2, new z7o(t7oVar2));
                }
            }
            r7o r7oVar5 = z7o.b;
            t7oVar2 = new t7o(new ManifestLoadingException.NotFound(null, null, 3, null));
            linkedHashMap2.put(obj2, new z7o(t7oVar2));
        }
        return linkedHashMap2;
    }
}
