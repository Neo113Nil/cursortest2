package B2;

import android.text.TextUtils;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f181a;

    /* renamed from: b, reason: collision with root package name */
    public final long f182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f183c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f184d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f185e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f186f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f187g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C3381io f188h;
    public ConcurrentHashMap i;

    public K(C3381io c3381io) {
        this.f188h = c3381io;
        C3151ea c3151ea = AbstractC3368ia.f31517O7;
        q2.r rVar = q2.r.f40116e;
        this.f181a = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        C3151ea c3151ea2 = AbstractC3368ia.f31525P7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        this.f182b = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).longValue();
        this.f183c = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31560T7)).booleanValue();
        this.f184d = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31551S7)).booleanValue();
        this.f185e = Collections.synchronizedMap(new H(this));
    }

    public final synchronized String a(String str, C3002bo c3002bo) {
        I i = (I) this.f185e.get(str);
        c3002bo.f29588a.put("request_id", str);
        if (i == null) {
            c3002bo.f29588a.put("mhit", "false");
            return null;
        }
        c3002bo.f29588a.put("mhit", "true");
        return i.f174b;
    }

    public final synchronized void b() {
        p2.j.f39798C.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f185e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((I) entry.getValue()).f173a.longValue() <= this.f182b) {
                    break;
                }
                this.f187g.add(new Pair((String) entry.getKey(), ((I) entry.getValue()).f174b));
                it.remove();
            }
        } catch (ConcurrentModificationException e6) {
            p2.j.f39798C.f39808h.d("QueryJsonMap.removeExpiredEntries", e6);
        }
    }

    public final synchronized void c(C3002bo c3002bo) {
        try {
            try {
                if (this.f183c) {
                    ArrayDeque arrayDeque = this.f187g;
                    ArrayDeque clone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f186f;
                    ArrayDeque clone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC3212fg.f30738a.execute(new J(this, c3002bo, clone, clone2, 0));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void d(C3002bo c3002bo, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3002bo.f29588a);
            this.i = concurrentHashMap;
            concurrentHashMap.put(NativeAdvancedJsUtils.f18064p, "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f184d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(K3.b.I(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f188h.b(this.i);
        }
    }
}
