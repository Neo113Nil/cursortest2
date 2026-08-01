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
    public static final CopyOnWriteArraySet f40926a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f40927b;

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
        f40927b = t.U(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) f40927b.get(str);
        if (str3 == null) {
            str3 = Q7.j.o0(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i6 = 0;
            while (i6 < length) {
                int Z8 = Q7.j.Z(str2, '\n', i6, 4);
                if (Z8 == -1) {
                    Z8 = length;
                }
                while (true) {
                    min = Math.min(Z8, i6 + 4000);
                    String substring = str2.substring(i6, min);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    Log.println(i, str3, substring);
                    if (min >= Z8) {
                        break;
                    } else {
                        i6 = min;
                    }
                }
                i6 = min + 1;
            }
        }
    }
}
