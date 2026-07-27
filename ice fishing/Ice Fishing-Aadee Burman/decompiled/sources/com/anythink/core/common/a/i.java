package com.anythink.core.common.a;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f12178a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static i f12179b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12180c;

    /* renamed from: f, reason: collision with root package name */
    private final String f12183f = "rpr_";

    /* renamed from: g, reason: collision with root package name */
    private final String f12184g = "bid_";

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f12181d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f12182e = new ConcurrentHashMap(5);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f12185a;

        /* renamed from: b, reason: collision with root package name */
        public int f12186b;

        /* renamed from: c, reason: collision with root package name */
        public long f12187c;
    }

    private i(Context context) {
        this.f12180c = context.getApplicationContext();
    }

    public static i a(Context context) {
        if (f12179b == null) {
            synchronized (i.class) {
                try {
                    if (f12179b == null) {
                        f12179b = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12179b;
    }

    private static String c(String str) {
        return "rpr_".concat(String.valueOf(str));
    }

    private static String d(String str) {
        return "bid_".concat(String.valueOf(str));
    }

    public final Boolean b(String str) {
        a aVar = this.f12181d.get(str);
        if (aVar == null) {
            return null;
        }
        long j6 = aVar.f12187c;
        if (j6 <= 0) {
            return Boolean.FALSE;
        }
        long a9 = com.anythink.core.common.c.a().a(str);
        return a9 <= 0 ? Boolean.FALSE : System.currentTimeMillis() - a9 > j6 ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f12181d.remove(str);
            af.a(this.f12180c, u.b.f12860o, c(str));
            af.a(this.f12180c, u.b.f12860o, d(str));
        } else {
            this.f12181d.put(str, a(jSONObject));
            af.b(this.f12180c, u.b.f12860o, c(str), jSONObject.toString());
        }
    }

    private static a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.f12185a = jSONObject.optLong("bid_inr", 0L);
        aVar.f12186b = jSONObject.optInt(com.anythink.core.common.k.aa, 2);
        aVar.f12187c = jSONObject.optLong(com.anythink.core.common.k.f14298V, 0L);
        return aVar;
    }

    public final void a() {
        try {
            Map<String, ?> b9 = af.b(this.f12180c, u.b.f12860o);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ?> entry : b9.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    if (key.startsWith("rpr_")) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            try {
                                a a9 = a(new JSONObject((String) value));
                                this.f12181d.put(key.replace("rpr_", ""), a9);
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (key.startsWith("bid_")) {
                        Object value2 = entry.getValue();
                        if (value2 instanceof Long) {
                            this.f12182e.put(key.replace("bid_", ""), (Long) value2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j6) {
        this.f12182e.put(str, Long.valueOf(j6));
        af.a(this.f12180c, u.b.f12860o, d(str), j6);
    }

    public final boolean a(String str) {
        Long l9;
        a aVar = this.f12181d.get(str);
        if (aVar == null) {
            return false;
        }
        long j6 = aVar.f12185a;
        return j6 > 0 && (l9 = this.f12182e.get(str)) != null && System.currentTimeMillis() - l9.longValue() <= j6;
    }

    public final Boolean a(bv bvVar) {
        a aVar = this.f12181d.get(bvVar.z());
        if (aVar == null) {
            return null;
        }
        if (aVar.f12186b == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
