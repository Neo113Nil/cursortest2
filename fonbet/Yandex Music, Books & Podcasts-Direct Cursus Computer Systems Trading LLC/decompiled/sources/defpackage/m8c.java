package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m8c {
    public static final AtomicBoolean a;
    public static final ConcurrentLinkedQueue b;
    public static final ConcurrentHashMap c;
    public static Long d;
    public static p1d e;

    static {
        ern.a(m8c.class).h();
        a = new AtomicBoolean(false);
        b = new ConcurrentLinkedQueue();
        c = new ConcurrentHashMap();
    }

    public static JSONObject a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", ConstantDeviceInfo.APP_PLATFORM);
        HashSet hashSet = j3c.a;
        bundle.putString("sdk_version", "12.2.0");
        bundle.putString("fields", "gatekeepers");
        String str2 = ood.j;
        ood oodVar = new ood(null, String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2)), null, null, null, 0);
        oodVar.h = true;
        oodVar.d = bundle;
        JSONObject jSONObject = oodVar.c().a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    public static final boolean b(String str, String str2, boolean z) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        ArrayList<o1d> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = c;
        if (concurrentHashMap2.containsKey(str2)) {
            p1d p1dVar = e;
            if (p1dVar != null && (concurrentHashMap = (ConcurrentHashMap) p1dVar.a.get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((o1d) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (o1d o1dVar : arrayList) {
                    hashMap.put(o1dVar.a, Boolean.valueOf(o1dVar.b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    next.getClass();
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                p1d p1dVar2 = e;
                if (p1dVar2 == null) {
                    p1dVar2 = new p1d(0);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList2.add(new o1d((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    o1d o1dVar2 = (o1d) it2.next();
                    concurrentHashMap3.put(o1dVar2.a, o1dVar2);
                }
                p1dVar2.a.put(str2, concurrentHashMap3);
                e = p1dVar2;
                hashMap = hashMap2;
            }
        } else {
            hashMap = new HashMap();
        }
        return (hashMap.containsKey(str) && (bool = (Boolean) hashMap.get(str)) != null) ? bool.booleanValue() : z;
    }

    public static final synchronized void c(w6c w6cVar) {
        synchronized (m8c.class) {
            if (w6cVar != null) {
                try {
                    b.add(w6cVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String c2 = j3c.c();
            Long l = d;
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && c.containsKey(c2)) {
                e();
                return;
            }
            Context b2 = j3c.b();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{c2}, 1));
            if (b2 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = b2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!gvt.D(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    HashSet hashSet = j3c.a;
                }
                if (jSONObject != null) {
                    d(c2, jSONObject);
                }
            }
            Executor d2 = j3c.d();
            if (a.compareAndSet(false, true)) {
                d2.execute(new l8c(c2, b2, format));
            }
        }
    }

    public static final synchronized JSONObject d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        synchronized (m8c.class) {
            try {
                jSONObject2 = (JSONObject) c.get(str);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString(PListParser.TAG_KEY), jSONObject4.getBoolean(Constants.KEY_VALUE));
                    } catch (JSONException unused) {
                        HashSet hashSet = j3c.a;
                    }
                }
                c.put(str, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            w6c w6cVar = (w6c) concurrentLinkedQueue.poll();
            if (w6cVar != null) {
                handler.post(new q9(26, w6cVar));
            }
        }
    }
}
