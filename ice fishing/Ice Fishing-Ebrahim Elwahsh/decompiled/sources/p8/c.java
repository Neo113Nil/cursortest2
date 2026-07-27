package p8;

import android.util.Log;
import e8.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import r7.t;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f39837a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f39838b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = s.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(l8.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(h8.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f39838b = t.E(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) f39838b.get(str);
        if (str3 == null) {
            str3 = M7.j.f0(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i4 = 0;
            while (i4 < length) {
                int Q3 = M7.j.Q(str2, '\n', i4, 4);
                if (Q3 == -1) {
                    Q3 = length;
                }
                while (true) {
                    min = Math.min(Q3, i4 + 4000);
                    String substring = str2.substring(i4, min);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    Log.println(i, str3, substring);
                    if (min >= Q3) {
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
