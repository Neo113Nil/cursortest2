package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uee {
    public static SharedPreferences a;
    public static final uee d = new uee();
    public static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    public static final boolean d() {
        if (bp6.a.contains(uee.class)) {
            return false;
        }
        try {
            d.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences == null) {
                Intrinsics.j("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = a;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            Intrinsics.j("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            bp6.a(uee.class, th);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        Set set = bp6.a;
        if (set.contains(uee.class)) {
            return;
        }
        try {
            concurrentHashMap.getClass();
            concurrentHashMap2.getClass();
            uee ueeVar = d;
            ueeVar.f();
            LinkedHashMap c2 = ueeVar.c(ueeVar.a(concurrentHashMap), concurrentHashMap2);
            if (set.contains(ueeVar)) {
                return;
            }
            try {
                for (Map.Entry entry : c2.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str != null && str2 != null) {
                        ne2.c(str, str2, false);
                    }
                }
            } catch (Throwable th) {
                bp6.a(ueeVar, th);
            }
        } catch (Throwable th2) {
            bp6.a(uee.class, th2);
        }
    }

    public final HashMap a(Map map) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = uah.o(map).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = b;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (c.containsKey(string)) {
                            map.remove(str);
                        } else {
                            copyOnWriteArraySet.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(map);
            }
            Intrinsics.j("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        ConcurrentHashMap concurrentHashMap = c;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = a;
            Throwable th = null;
            String str = "sharedPreferences";
            if (sharedPreferences == null) {
                Intrinsics.j("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                SharedPreferences sharedPreferences2 = a;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                    return;
                } else {
                    Intrinsics.j("sharedPreferences");
                    throw null;
                }
            }
            if (currentTimeMillis - j > 604800) {
                Iterator it = uah.o(concurrentHashMap).entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    copyOnWriteArraySet = b;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    Throwable th2 = th;
                    String str3 = str;
                    if (currentTimeMillis - longValue > 86400) {
                        copyOnWriteArraySet.remove(str2 + ';' + longValue);
                        concurrentHashMap.remove(str2);
                    }
                    th = th2;
                    str = str3;
                }
                Throwable th3 = th;
                String str4 = str;
                SharedPreferences sharedPreferences3 = a;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else {
                    Intrinsics.j(str4);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            bp6.a(this, th4);
        }
    }

    public final LinkedHashMap c(HashMap hashMap, Map map) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            hashMap.getClass();
            map.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            jSONObject3.getClass();
                            String jSONObject4 = jSONObject2.toString();
                            jSONObject4.getClass();
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final void f() {
        List split$default;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = j3c.b().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = j3c.b().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            sharedPreferences3.getClass();
            a = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = b;
            Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            copyOnWriteArraySet.addAll(stringSet != null ? stringSet : new HashSet());
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, null);
                c.put(split$default.get(0), Long.valueOf(Long.parseLong((String) split$default.get(1))));
            }
            b();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
