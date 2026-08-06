package S1;

import J1.s;
import i1.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f1776a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1777b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = s.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Q1.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(M1.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1777b = u.M(linkedHashMap);
    }
}
