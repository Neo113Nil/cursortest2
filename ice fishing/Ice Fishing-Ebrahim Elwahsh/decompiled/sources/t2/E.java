package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2841Wf;
import com.google.android.gms.internal.ads.C4264z8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.R0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public boolean f40831b;

    /* renamed from: d, reason: collision with root package name */
    public J3.a f40833d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f40835f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f40836g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f40838j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f40830a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40832c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public C4264z8 f40834e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40837h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40839k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f40840l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f40841m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C2841Wf f40842n = new C2841Wf("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f40843o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f40844p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f40845q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f40846r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f40847s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f40848t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f40849u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40850v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f40851w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f40852x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f40853y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f40854z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f40823A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f40824B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f40825C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f40826D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f40827E = false;

    /* renamed from: F, reason: collision with root package name */
    public int f40828F = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f40829G = 0;

    public final void a(String str) {
        i();
        synchronized (this.f40830a) {
            try {
                this.f40840l = str;
                if (this.f40836g != null) {
                    if (str.equals("-1")) {
                        this.f40836g.remove("IABTCF_TCString");
                    } else {
                        this.f40836g.putString("IABTCF_TCString", str);
                    }
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        i();
        synchronized (this.f40830a) {
            try {
                this.f40841m = i;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        i();
        synchronized (this.f40830a) {
            try {
                if (this.f40825C == i) {
                    return;
                }
                this.f40825C = i;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j9) {
        i();
        synchronized (this.f40830a) {
            try {
                if (this.f40826D == j9) {
                    return;
                }
                this.f40826D = j9;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j9);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z8) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
            i();
            synchronized (this.f40830a) {
                try {
                    if (this.f40853y == z8) {
                        return;
                    }
                    this.f40853y = z8;
                    SharedPreferences.Editor editor = this.f40836g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z8);
                        this.f40836g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
            i();
            synchronized (this.f40830a) {
                try {
                    if (this.f40854z.equals(str)) {
                        return;
                    }
                    this.f40854z = str;
                    SharedPreferences.Editor editor = this.f40836g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f40836g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Na)).booleanValue()) {
            i();
            synchronized (this.f40830a) {
                try {
                    if (this.f40823A.equals(str)) {
                        return;
                    }
                    this.f40823A = str;
                    SharedPreferences.Editor editor = this.f40836g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f40836g.apply();
                    }
                    j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h() {
        i();
        synchronized (this.f40830a) {
            try {
                if (this.f40827E) {
                    return;
                }
                this.f40827E = true;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        J3.a aVar = this.f40833d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f40833d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            int i = C.f40822b;
            u2.i.g("Interrupted while waiting for preferences loaded.", e6);
        } catch (CancellationException e9) {
            e = e9;
            int i4 = C.f40822b;
            u2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            int i42 = C.f40822b;
            u2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            int i422 = C.f40822b;
            u2.i.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void j() {
        AbstractC3212fg.f30738a.execute(new R0(8, this));
    }

    public final void k(Context context) {
        synchronized (this.f40830a) {
            try {
                if (this.f40835f != null) {
                    return;
                }
                this.f40833d = AbstractC3212fg.f30738a.a(new h3.l(this, context, 11, false));
                this.f40831b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z8;
        i();
        synchronized (this.f40830a) {
            z8 = this.f40849u;
        }
        return z8;
    }

    public final boolean m() {
        boolean z8;
        i();
        synchronized (this.f40830a) {
            z8 = this.f40850v;
        }
        return z8;
    }

    public final C2841Wf n() {
        C2841Wf c2841Wf;
        i();
        synchronized (this.f40830a) {
            try {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ed)).booleanValue() && this.f40842n.a()) {
                    Iterator it = this.f40832c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c2841Wf = this.f40842n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2841Wf;
    }

    public final void o(long j9) {
        i();
        synchronized (this.f40830a) {
            try {
                if (this.f40844p == j9) {
                    return;
                }
                this.f40844p = j9;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j9);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(String str, String str2, boolean z8) {
        i();
        synchronized (this.f40830a) {
            try {
                JSONArray optJSONArray = this.f40848t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z8 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z8);
                    p2.j.f39798C.f39810k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f40848t.put(str, optJSONArray);
                } catch (JSONException e6) {
                    int i4 = C.f40822b;
                    u2.i.g("Could not update native advanced settings", e6);
                }
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f40848t.toString());
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String q() {
        String str;
        i();
        synchronized (this.f40830a) {
            str = this.f40851w;
        }
        return str;
    }

    public final void r(String str) {
        i();
        synchronized (this.f40830a) {
            try {
                if (TextUtils.equals(this.f40851w, str)) {
                    return;
                }
                this.f40851w = str;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(boolean z8) {
        i();
        synchronized (this.f40830a) {
            try {
                if (z8 == this.f40839k) {
                    return;
                }
                this.f40839k = z8;
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z8);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z8;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31644d1)).booleanValue()) {
            return false;
        }
        i();
        synchronized (this.f40830a) {
            z8 = this.f40839k;
        }
        return z8;
    }

    public final void u(boolean z8) {
        i();
        synchronized (this.f40830a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.Rb)).longValue();
                SharedPreferences.Editor editor = this.f40836g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z8);
                    this.f40836g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f40836g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
