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
    private static String f12964a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static i f12965b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12966c;

    /* renamed from: f, reason: collision with root package name */
    private final String f12969f = "rpr_";

    /* renamed from: g, reason: collision with root package name */
    private final String f12970g = "bid_";

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f12967d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f12968e = new ConcurrentHashMap(5);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f12971a;

        /* renamed from: b, reason: collision with root package name */
        public int f12972b;

        /* renamed from: c, reason: collision with root package name */
        public long f12973c;
    }

    private i(Context context) {
        this.f12966c = context.getApplicationContext();
    }

    public static i a(Context context) {
        if (f12965b == null) {
            synchronized (i.class) {
                try {
                    if (f12965b == null) {
                        f12965b = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12965b;
    }

    private static String c(String str) {
        return "rpr_".concat(String.valueOf(str));
    }

    private static String d(String str) {
        return "bid_".concat(String.valueOf(str));
    }

    public final Boolean b(String str) {
        a aVar = this.f12967d.get(str);
        if (aVar == null) {
            return null;
        }
        long j6 = aVar.f12973c;
        if (j6 <= 0) {
            return Boolean.FALSE;
        }
        long a9 = com.anythink.core.common.c.a().a(str);
        return a9 <= 0 ? Boolean.FALSE : System.currentTimeMillis() - a9 > j6 ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f12967d.remove(str);
            af.a(this.f12966c, u.b.f13646o, c(str));
            af.a(this.f12966c, u.b.f13646o, d(str));
        } else {
            this.f12967d.put(str, a(jSONObject));
            af.b(this.f12966c, u.b.f13646o, c(str), jSONObject.toString());
        }
    }

    private static a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.f12971a = jSONObject.optLong("bid_inr", 0L);
        aVar.f12972b = jSONObject.optInt(com.anythink.core.common.k.aa, 2);
        aVar.f12973c = jSONObject.optLong(com.anythink.core.common.k.f15084V, 0L);
        return aVar;
    }

    public final void a() {
        try {
            Map<String, ?> b9 = af.b(this.f12966c, u.b.f13646o);
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
                                this.f12967d.put(key.replace("rpr_", ""), a9);
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (key.startsWith("bid_")) {
                        Object value2 = entry.getValue();
                        if (value2 instanceof Long) {
                            this.f12968e.put(key.replace("bid_", ""), (Long) value2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j6) {
        this.f12968e.put(str, Long.valueOf(j6));
        af.a(this.f12966c, u.b.f13646o, d(str), j6);
    }

    public final boolean a(String str) {
        Long l9;
        a aVar = this.f12967d.get(str);
        if (aVar == null) {
            return false;
        }
        long j6 = aVar.f12971a;
        return j6 > 0 && (l9 = this.f12968e.get(str)) != null && System.currentTimeMillis() - l9.longValue() <= j6;
    }

    public final Boolean a(bv bvVar) {
        a aVar = this.f12967d.get(bvVar.z());
        if (aVar == null) {
            return null;
        }
        if (aVar.f12972b == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
