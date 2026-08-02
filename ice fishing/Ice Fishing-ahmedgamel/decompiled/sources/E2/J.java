package E2;

import android.text.TextUtils;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f746a;

    /* renamed from: b, reason: collision with root package name */
    public final long f747b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f748c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f749d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f750e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f751f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f752g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C3391io f753h;
    public ConcurrentHashMap i;

    public J(C3391io c3391io) {
        this.f753h = c3391io;
        C3324ha c3324ha = AbstractC3592ma.f32875O7;
        s2.r rVar = s2.r.f40506e;
        this.f746a = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        C3324ha c3324ha2 = AbstractC3592ma.f32884P7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        this.f747b = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).longValue();
        this.f748c = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32919T7)).booleanValue();
        this.f749d = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32910S7)).booleanValue();
        this.f750e = Collections.synchronizedMap(new G(this));
    }

    public final synchronized String a(String str, C3069co c3069co) {
        H h3 = (H) this.f750e.get(str);
        c3069co.f30367a.put("request_id", str);
        if (h3 == null) {
            c3069co.f30367a.put("mhit", "false");
            return null;
        }
        c3069co.f30367a.put("mhit", "true");
        return h3.f739b;
    }

    public final synchronized void b() {
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f750e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((H) entry.getValue()).f738a.longValue() <= this.f747b) {
                    break;
                }
                this.f752g.add(new Pair((String) entry.getKey(), ((H) entry.getValue()).f739b));
                it.remove();
            }
        } catch (ConcurrentModificationException e9) {
            C4906k.f40186C.f40196h.d("QueryJsonMap.removeExpiredEntries", e9);
        }
    }

    public final synchronized void c(C3069co c3069co) {
        try {
            try {
                if (this.f748c) {
                    ArrayDeque arrayDeque = this.f752g;
                    ArrayDeque clone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f751f;
                    ArrayDeque clone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC3436jg.f32055a.execute(new I(this, c3069co, clone, clone2, 0));
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

    public final void d(C3069co c3069co, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3069co.f30367a);
            this.i = concurrentHashMap;
            concurrentHashMap.put(NativeAdvancedJsUtils.f18693p, "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f749d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(t8.g.s(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
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
            this.f753h.b(this.i);
        }
    }
}
