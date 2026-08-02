package x2;

import E2.C0316m;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f41860c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f41861d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f41863a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f41859b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f41862e = new HashSet(Arrays.asList(new String[0]));

    public f() {
        this.f41863a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z6;
        synchronized (f41859b) {
            try {
                z6 = false;
                if (f41860c && f41861d) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public static void d(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f41862e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        i.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            e("onNetworkRequest", new S0.i(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr, 8));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i) {
        if (c()) {
            String str = null;
            e("onNetworkResponse", new I1.a(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), 19));
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e9) {
                    i.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e9.getMessage())));
                }
                e("onNetworkRequestError", new C0316m(str, 3));
            }
        }
    }

    public final void e(String str, e eVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(com.anythink.expressad.foundation.d.d.f19383u).value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f41863a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            eVar.j(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e9) {
            i.d("unable to log", e9);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (f.class) {
            try {
                i.e("GMA Debug BEGIN");
                int i = 0;
                while (i < stringWriter2.length()) {
                    int i4 = i + 4000;
                    i.e("GMA Debug CONTENT ".concat(String.valueOf(stringWriter2.substring(i, Math.min(i4, stringWriter2.length())))));
                    i = i4;
                }
                i.e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
