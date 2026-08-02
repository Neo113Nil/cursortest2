package t8;

import android.util.Log;
import i8.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.t;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f40889a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f40890b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = r.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(r.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(p8.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(l8.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f40890b = t.y(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) f40890b.get(str);
        if (str3 == null) {
            str3 = Q7.j.E0(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i4 = 0;
            while (i4 < length) {
                int p02 = Q7.j.p0(str2, '\n', i4, 4);
                if (p02 == -1) {
                    p02 = length;
                }
                while (true) {
                    min = Math.min(p02, i4 + 4000);
                    String substring = str2.substring(i4, min);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    Log.println(i, str3, substring);
                    if (min >= p02) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
            }
        }
    }
}
