package C2;

import android.text.TextUtils;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f286a;

    /* renamed from: b, reason: collision with root package name */
    public final long f287b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f288c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f290e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f291f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f292g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C3315ho f293h;
    public ConcurrentHashMap i;

    public K(C3315ho c3315ho) {
        this.f293h = c3315ho;
        C3301ha c3301ha = AbstractC3569ma.f32096O7;
        q2.r rVar = q2.r.f40207e;
        this.f286a = ((Integer) rVar.f40210c.a(c3301ha)).intValue();
        C3301ha c3301ha2 = AbstractC3569ma.f32104P7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        this.f287b = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).longValue();
        this.f288c = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32140T7)).booleanValue();
        this.f289d = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32131S7)).booleanValue();
        this.f290e = Collections.synchronizedMap(new H(this));
    }

    public final synchronized String a(String str, C2993bo c2993bo) {
        I i = (I) this.f290e.get(str);
        c2993bo.f29325a.put("request_id", str);
        if (i == null) {
            c2993bo.f29325a.put("mhit", "false");
            return null;
        }
        c2993bo.f29325a.put("mhit", "true");
        return i.f279b;
    }

    public final synchronized void b() {
        C4835j.f39733C.f39745k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f290e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((I) entry.getValue()).f278a.longValue() <= this.f287b) {
                    break;
                }
                this.f292g.add(new Pair((String) entry.getKey(), ((I) entry.getValue()).f279b));
                it.remove();
            }
        } catch (ConcurrentModificationException e9) {
            C4835j.f39733C.f39743h.d("QueryJsonMap.removeExpiredEntries", e9);
        }
    }

    public final synchronized void c(C2993bo c2993bo) {
        try {
            try {
                if (this.f288c) {
                    ArrayDeque arrayDeque = this.f292g;
                    ArrayDeque clone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f291f;
                    ArrayDeque clone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC3413jg.f31268a.execute(new J(this, c2993bo, clone, clone2, 0));
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

    public final void d(C2993bo c2993bo, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c2993bo.f29325a);
            this.i = concurrentHashMap;
            concurrentHashMap.put(NativeAdvancedJsUtils.f17906p, "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f289d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(com.bumptech.glide.d.m(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
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
            this.f293h.b(this.i);
        }
    }
}
